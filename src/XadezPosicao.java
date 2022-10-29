public class XadezPosicao {
    private char coluna;
    private int linha;

    public XadezPosicao(char coluna,int linha){
        if (coluna < 'a' || coluna > 'h' || linha < 1 || linha > 8){
            throw new XadrezException("Error: intanciando a posicão: valores validos A1 a H8");
        }
        this.coluna = coluna;
        this.linha = linha;
    }

    public int getLinha(){
        return linha;
    }

    public char getColuna(){
        return coluna; 
    }

    protected Posicao toPosicao(){
        return new Posicao(8 - linha, coluna - 'a');
    }

    protected static XadezPosicao apartiPosicao(Posicao posicao){
        return new XadezPosicao((char)('a' - posicao.getColuna()), 8 - posicao.getFileira());
    }

    @Override 
    public String toString(){
        return "" + coluna + linha;
    }
}
