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
        if (this.tipo.equals("CF"))
        {
            this.resposta = String.valueOf((this.temperatura- 32)/ 1.8);
        }
        if (this.tipo.equals("FC"))
        {
            this.resposta = String.valueOf(this.temperatura * 1.8 + 32);
        }
    }

    @Override
    public String toString()
    {
        return this.resposta;
    }
    
    
    
}
