package Modelo;

public class Validacao extends absPropriedades implements intMetodos
{

    public Validacao(String temp)
    {
        super(temp);
        Executar();
    }

    @Override
    public void Executar()
    {
        this.mensagem = "";
        try
        {
            this.temperatura = Double.parseDouble(this.temp);
        }
        catch (NumberFormatException e)
        {
            this.mensagem = "Erro de conversão";
        }
    }
    
}
