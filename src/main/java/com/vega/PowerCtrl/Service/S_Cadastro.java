package com.vega.PowerCtrl.Service;

import com.vega.PowerCtrl.Model.M_Usuario;
import com.vega.PowerCtrl.Model.M_Mensagens;
import com.vega.PowerCtrl.Repository.R_Cadastro;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

@Service
public class S_Cadastro {

    private static R_Cadastro r_cadastro;

    public S_Cadastro(R_Cadastro r_cadastro) {
        this.r_cadastro = r_cadastro;
    }

    public static M_Mensagens setCadastro(String nomecompleto, String cpf, String cidade, String estado, String endereco, String cep, String email, String telefone, String usuario, String senha, String senhaRepeticao) {
        String mensagem = "";
        boolean salvar = true;

        if (!senha.equals(senhaRepeticao) || senha == null || senha.trim().equals("")) {
            mensagem += "Senha e confirmação de senha devem ser iguais, e a senha deve ser informada<br/>";
            salvar = false;
        }

        if (!S_Validacoes.validateCPF(cpf)) {
            mensagem += "CPF inválido<br/>";
            salvar = false;
        }

        if (nomecompleto == null || nomecompleto.trim().equals("")) {
            mensagem += "O nome precisa ser informado<br/>";
            salvar = false;
        }

        if (telefone == null || telefone.trim().equals("")) {
            mensagem += "O telefone precisa ser informado<br/>";
            salvar = false;
        }

        if (cidade == null || cidade.trim().equals("")) {
            mensagem += "A cidade precisa ser informada<br/>";
            salvar = false;
        }

        if (estado == null || estado.trim().equals("")) {
            mensagem += "O estado precisa ser informado<br/>";
            salvar = false;
        }

        if (endereco == null || endereco.trim().equals("")) {
            mensagem += "O endereço precisa ser informado<br/>";
            salvar = false;
        }

        if (cep == null || cep.trim().equals("")) {
            mensagem += "O CEP precisa ser informado<br/>";
            salvar = false;
        }

        if ((email == null || email.trim().equals(""))) {
            mensagem += "E-mail precisa ser informado<br/>";
            salvar = false;
        }

        if (usuario == null || usuario.trim().equals("")) {
            mensagem += "O usuario precisa ser informado<br/>";
            salvar = false;
        }

        if (salvar) {
            M_Usuario m_usuario = new M_Usuario();
            m_usuario.setNomecompleto(nomecompleto);
            m_usuario.setCpf(Long.valueOf(S_LimpaNumero.limpar(cpf)));
            m_usuario.setCidade(cidade);
            m_usuario.setEstado(estado);
            m_usuario.setEndereco(endereco);
            m_usuario.setCep(Long.valueOf(cep));
            m_usuario.setEmail(email);
            m_usuario.setTelefone(Long.valueOf(S_LimpaNumero.limpar(telefone)));
            m_usuario.setUsuario(usuario);
            m_usuario.setSenha(senha);

            try {
                r_cadastro.save(m_usuario);
                mensagem += "Pessoa cadastrada com sucesso<br/>";
            } catch (DataIntegrityViolationException e) {
                mensagem += e.getMessage() + "<br/>";
                salvar = false;
            }

        }

        M_Mensagens m_mensagem = new M_Mensagens(mensagem, salvar);
        return m_mensagem;
    }

    public static M_Mensagens editCadastro(String nomecompleto, String cpf, String cidade, String estado, String endereco, String cep, String email, String telefone, String usuario, String senhaAtual, String novaSenha, String senhaRepeticao, M_Usuario objusuario) {
        String mensagem = "";
        boolean salvar = true;


        if (senhaAtual.equals(objusuario.getSenha())) {

            if (!novaSenha.equals(senhaRepeticao)) {
                mensagem += "Senha e confirmação de senha devem ser iguais";
                salvar = false;
            }

            if (S_Validacoes.validateCPF(cpf)) {
                mensagem += "CPF inválido<br/>";
                salvar = false;
            }

            if (nomecompleto == null || nomecompleto.trim().equals("")) {
                mensagem += "O nome precisa ser informado<br/>";
                salvar = false;
            }

            if (telefone == null || telefone.trim().equals("")) {
                mensagem += "O telefone precisa ser informado<br/>";
                salvar = false;
            }

            if (cidade == null || cidade.trim().equals("")) {
                mensagem += "A cidade precisa ser informada<br/>";
                salvar = false;
            }

            if (estado == null || estado.trim().equals("")) {
                mensagem += "O estado precisa ser informado<br/>";
                salvar = false;
            }

            if (endereco == null || endereco.trim().equals("")) {
                mensagem += "O endereço precisa ser informado<br/>";
                salvar = false;
            }

            if (cep == null || cep.trim().equals("")) {
                mensagem += "O CEP precisa ser informado<br/>";
                salvar = false;
            }

            if ((email == null || email.trim().equals(""))) {
                mensagem += "E-mail precisa ser informado<br/>";
                salvar = false;
            }

            if (usuario == null || usuario.trim().equals("")) {
                mensagem += "O usuario precisa ser informado<br/>";
                salvar = false;
            }
        } else {
            salvar = false;
            mensagem += "Senha Invalida";
        }

        if (salvar) {
            M_Usuario m_usuario = new M_Usuario();

            if (!novaSenha.isEmpty()) {
                m_usuario.setSenha(novaSenha);
            } else {
                m_usuario.setSenha(senhaAtual);
            }


            m_usuario.setCpf(Long.valueOf(S_LimpaNumero.limpar(cpf)));
            m_usuario.setNomecompleto(nomecompleto);
            m_usuario.setCidade(cidade);
            m_usuario.setEstado(estado);
            m_usuario.setEndereco(endereco);
            m_usuario.setCep(Long.valueOf(cep));
            m_usuario.setEmail(email);
            m_usuario.setTelefone(Long.valueOf(S_LimpaNumero.limpar(telefone)));
            m_usuario.setUsuario(usuario);


            try {
                r_cadastro.save(m_usuario);
                mensagem += "Dados atualizads com sucesso<br/>";
            } catch (DataIntegrityViolationException e) {
                mensagem += e.getMessage() + "<br/>";
                salvar = false;
            }

        }

        M_Mensagens m_mensagem = new M_Mensagens(mensagem, salvar);
        return m_mensagem;
    }
}

