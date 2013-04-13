package controleatleta;

public class Endereco {
    
    private String logradouro;
    private String numero;
    private String bairro;
    private String cidade;
    private String estado; // 0=Acre, 1=Alagoas, 2=Amapá, 3=Amazonas, 4=Bahia, 5=Ceará, 6=Distrito Federal, 7=Espírito Santo, 8=Goiás, 9=Maranhão, 10=Mato Grosso, 11-Mato Grosso do Sul, 12=Minas Gerais, 13=Pará, 14=Paraíba, 15=Paraná, 16=Pernambuco, 17=Piauí, 18=Rio de Janeiro, 19=Rio Grande do Norte, 20=Rio Grande do Sul, 21=Rondônia, 22=Roraima, 23=Santa Catarina, 24=São Paulo, 25=Sergipe, 26=Tocantins
    private String pais;
    private String complemento;
    private String cep;

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}
