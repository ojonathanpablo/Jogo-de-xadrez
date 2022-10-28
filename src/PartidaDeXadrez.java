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

    private void configuracaoInicial(){
        quadro.colocaPeca(new Torre(quadro, Cor.BRANCO), new Posicao(2,1));
        quadro.colocaPeca(new Rei(quadro, Cor.PRETO), new Posicao(0,4));
        quadro.colocaPeca(new Rei(quadro, Cor.BRANCO), new Posicao(7,4));
    }
}
