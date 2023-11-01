package com.vega.PowerCtrl.Model;

public class M_Mensagens {

    private String mensagem;
    private boolean salvar;

    public M_Mensagens(String mensagem, boolean salvar) {
        this.mensagem = mensagem;
        this.salvar = salvar;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public boolean getSalvar() {
        return salvar;
    }

    public void setSalvar(boolean salvar) {
        this.salvar = salvar;
    }
}
