public class OiTchau 
{
    public static void main(String[] args) 
    {
        Oi oi = new Oi("Oi");
        oi.exibirOi();

        Tchau tchau = new Tchau("Tchau");
        tchau.exibirTchau();
    }
}

class Oi 
{
    private String mensagemOi;

    public Oi(String mensagemOi) 
    {
        this.mensagemOi = mensagemOi;
    }

    public void exibirOi() 
    {
        System.out.println(mensagemOi);
    }
}

class Tchau 
{
    private String mensagemTchau;

    public Tchau(String mensagemTchau) 
    {
        this.mensagemTchau = mensagemTchau;
    }

    public void exibirTchau() 
    {
        System.out.println(mensagemTchau);
    }
}
