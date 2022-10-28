public class PecaDeXadrez extends Peca{
    private Cor cor;

    public PecaDeXadrez(Quadro quadro, Cor cor){
        super(quadro);
        this.cor = cor;
    }

    public Cor getCor(){
        return cor;
    }
}
