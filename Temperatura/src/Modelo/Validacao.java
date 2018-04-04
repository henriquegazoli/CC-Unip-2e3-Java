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
        this.setMensagem("");
        try
        {
            this.setTemperatura(Double.parseDouble(this.getTemp()));
        }
        catch (NumberFormatException e)
        {
            this.setMensagem("Erro de conversão");
        }
    }
    
}
