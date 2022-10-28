public class PartidaDeXadrez {
    private Quadro quadro;

    public PartidaDeXadrez(){
        quadro = new Quadro(8, 8);
        configuracaoInicial();
    }

    public PecaDeXadrez[][] getPecas() {
        PecaDeXadrez[][] mat = new PecaDeXadrez[quadro.getLinhas()][quadro.getColunas()];
        for (int i=0; i <quadro.getLinhas() ; i++) {
            for (int j=0 ; j<quadro.getColunas() ; j++) {
                mat[i][j] = (PecaDeXadrez) quadro.peca(i, j);
            }
        }
        return mat;
    }

    private void colocaNovaPeca(char coluna, int linha, PecaDeXadrez peca){
        quadro.colocaPeca(peca, new XadezPosicao(coluna, linha).toPosicao());
    }   
    private void configuracaoInicial(){
        colocaNovaPeca('b', 6, new Torre(quadro, Cor.BRANCO));
        colocaNovaPeca('e', 8, new Rei(quadro, Cor.PRETO));
        colocaNovaPeca('e', 1, new Rei(quadro, Cor.BRANCO));
    }
}
