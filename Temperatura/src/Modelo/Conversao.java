package Modelo;

public class Conversao extends absPropriedades implements intMetodos
{

    public Conversao(String tipo, Double temperatura)
    {
        super(tipo, temperatura);
        Executar();
    }

    @Override
    public void Executar()
    {
        if (this.getTipo().equals("CF"))
        {
            this.setResposta
                (String.valueOf((this.getTemperatura()- 32)/ 1.8));
        }
        if (this.getTipo().equals("FC"))
        {
            this.setResposta(String.valueOf(this.getTemperatura() * 1.8 + 32));
        }
    }
    
}
