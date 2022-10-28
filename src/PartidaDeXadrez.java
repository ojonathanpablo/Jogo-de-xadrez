public class PartidaDeXadrez {
    private Quadro quadro;

    public PartidaDeXadrez(){
        quadro = new Quadro(8, 8);
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
}
