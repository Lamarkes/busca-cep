package br.com.buscarcep.dominio;

public class Endereco {

    private String logradouro;
    private String bairro;
    private String localidade;

    public String getLogadouro() {
        return logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public String getLocalidade() {
        return localidade;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "logadouro='" + logradouro + '\'' +
                ", bairro='" + bairro + '\'' +
                ", localidade='" + localidade + '\'' +
                '}';
    }
}
