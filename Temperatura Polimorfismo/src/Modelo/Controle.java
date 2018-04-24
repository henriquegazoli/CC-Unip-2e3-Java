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
        this.mensagem = "";
        absPropriedades validacao = new Validacao(this.temp);
        if (validacao.mensagem.equals(""))
        {
            absPropriedades conversao = new Conversao(
                    this.tipo, validacao.temperatura);
            this.resposta = conversao.toString();
        }
        else
        {
            this.mensagem = validacao.mensagem;
        }
    }
    
}
