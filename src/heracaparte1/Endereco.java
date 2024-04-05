package heracaparte1;

public class Endereco {
    private String rua;
    private String estado;
    private String cidade;

    public Endereco(String rua, String cidade, String estado){
        this.rua = rua;
        this.estado = estado;
        this.cidade = cidade;
    }

    public String getRua() {
        return rua;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }
}
