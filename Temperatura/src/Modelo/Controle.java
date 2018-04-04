package Modelo;

public class Controle extends absPropriedades implements intMetodos
{

    public Controle(String tipo, String temp)
    {
        super(tipo, temp);
        Executar();
    }

    @Override
    public void Executar()
    {
        this.setMensagem("");
        Validacao validacao = new Validacao(this.getTemp());
        if (validacao.getMensagem().equals(""))
        {
            Conversao conversao = new Conversao(
                    this.getTipo(), validacao.getTemperatura());
            this.setResposta(conversao.getResposta());
        }
        else
        {
            this.setMensagem(validacao.getMensagem());
        }
    }
    
}
