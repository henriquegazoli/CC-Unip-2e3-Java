package Modelo;

public class absPropriedades
{
    private String mensagem;
    private String tipo;
    private String temp;
    private Double temperatura;
    private String resposta;

    public absPropriedades(String tipo, String temp)
    {
        this.tipo = tipo;
        this.temp = temp;
    }

    public absPropriedades(String tipo, Double temperatura)
    {
        this.tipo = tipo;
        this.temperatura = temperatura;
    }

    public absPropriedades(String temp)
    {
        this.temp = temp;
    }
    
    

    public String getMensagem()
    {
        return mensagem;
    }

    public void setMensagem(String mensagem)
    {
        this.mensagem = mensagem;
    }

    public String getTipo()
    {
        return tipo;
    }

    public void setTipo(String tipo)
    {
        this.tipo = tipo;
    }

    public String getTemp()
    {
        return temp;
    }

    public void setTemp(String temp)
    {
        this.temp = temp;
    }

    public Double getTemperatura()
    {
        return temperatura;
    }

    public void setTemperatura(Double temperatura)
    {
        this.temperatura = temperatura;
    }

    public String getResposta()
    {
        return resposta;
    }

    public void setResposta(String resposta)
    {
        this.resposta = resposta;
    }
    
    
}
