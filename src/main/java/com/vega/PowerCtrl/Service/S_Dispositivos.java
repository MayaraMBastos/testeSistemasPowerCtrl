package com.vega.PowerCtrl.Service;

import com.vega.PowerCtrl.Model.M_Dispositivos;
import com.vega.PowerCtrl.Model.M_Mensagens;

import com.vega.PowerCtrl.Model.M_Usuario;
import com.vega.PowerCtrl.Repository.R_Dispositivos;
import jakarta.servlet.http.HttpSession;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

@Service
public class S_Dispositivos {

    private static R_Dispositivos r_dispositivo;

    public S_Dispositivos(R_Dispositivos r_dispositivo) {
        this.r_dispositivo = r_dispositivo;
    }

    public static M_Mensagens setCadastroRele(String nomeSetor, String codRele, M_Usuario objusuario) {

        String mensagem = "";
        boolean salvar = true;
        Double consumo = 0.10;

        if (nomeSetor == null || nomeSetor.trim().equals("")) {
            mensagem += "O nome do setor precisa ser informado";
            salvar = false;
        }

        if (codRele == null || codRele.trim().equals("")) {
            mensagem += "O codigo do rele precisa ser informado";
            salvar = false;
        }
        if (r_dispositivo.seCodDispositivoExiste(codRele)) {
            mensagem += "O codigo do rele já esta sendo utilizado";
            salvar = false;
        }

        if (salvar) {
            M_Dispositivos m_dispositivos = new M_Dispositivos();
            m_dispositivos.setNome_setor(nomeSetor);
            m_dispositivos.setCod_dispositivo(codRele);
            m_dispositivos.setId_usuario(objusuario.getId());
            // setar o calculo de consumo diario
            m_dispositivos.setConsumoDiario(consumo);// numero ficticio

            try {
                r_dispositivo.save(m_dispositivos);
                mensagem += "Rele cadastrado com sucesso";
            } catch (DataIntegrityViolationException e) {
                mensagem += e.getMessage();
                salvar = false;
            }
        }
        M_Mensagens m_mensagens = new M_Mensagens(mensagem, salvar);
        return m_mensagens;
    }

    public static M_Mensagens editarCadastroRele(String nomeSetor, String codRele, Long id_rele, M_Usuario objusuario){
        String mensagem = "";
        boolean salvar = true;

        if(id_rele.describeConstable().isPresent()) {


            if (nomeSetor == null || nomeSetor.trim().equals("")) {
                mensagem += "O nome do setor precisa ser informado";
                salvar = false;
            }

            if (codRele == null || codRele.trim().equals("")) {
                mensagem += "O codigo do rele precisa ser informado";
                salvar = false;
            }
            if (r_dispositivo.seCodDispositivoExiste(codRele)) {
                mensagem += "O codigo do rele já esta sendo utilizado";
                salvar = false;

            } else {
                mensagem += "Rele inexistente no cadastro";
                salvar = false;
            }
        }
            if (salvar) {
                M_Dispositivos m_dispositivos = new M_Dispositivos();
                m_dispositivos.setNome_setor(nomeSetor);
                m_dispositivos.setCod_dispositivo(codRele);
                m_dispositivos.setId_usuario(objusuario.getId());// ver se é necessario


                try {
                    r_dispositivo.save(m_dispositivos);
                    mensagem += "Rele cadastrado com sucesso";
                } catch (DataIntegrityViolationException e) {
                    mensagem += e.getMessage();
                    salvar = false;
                }
            }

        M_Mensagens m_mensagens = new M_Mensagens(mensagem, salvar);
        return m_mensagens;
    }
}
