package Modelo;

public class absPropriedades
{
    public String mensagem;
    public String tipo;
    public String temp;
    public Double temperatura;
    public String resposta;

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
}
