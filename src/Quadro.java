public class Quadro {
    private int linhas;
    private int colunas;
    private Peca[][] pecas;

    public Quadro(int linhas,int colunas){
        if(linhas <1 || colunas < 1){
            throw new QuadroException("Error: é necessario que tenha uma linha ou uma coluna: ");
        }

        this.linhas = linhas;
        this.colunas = colunas;
        pecas = new Peca[linhas][colunas];
    }

    public int getLinhas(){
        return linhas;
    }

    public int getColunas(){
        return colunas;
    }
// METODOS
    public Peca peca(int linha, int coluna){
        if (!existeposicao(linha,coluna)){
            throw new QuadroException("Error: Posição invalida");
        }
        return pecas[linha][coluna];
    }

    public Peca peca( Posicao posicao){
        if (!existeposicao(posicao)){
            throw new QuadroException("Error: Posição invalida");
        }
        return pecas[posicao.getFileira()][posicao.getColuna()];
    }

    public void colocaPeca(Peca peca, Posicao posicao){
        if (existeUmaPeca(posicao)){
            throw new QuadroException("Error: Posição: "+posicao+" Já está sendo ultilizada");
        }
        pecas[posicao.getFileira()][posicao.getColuna()] = peca;
        peca.posicao = posicao;
    }

    private boolean existeposicao(int linha, int coluna){
       return linha >= 0 && linha < linhas && colunas >= 0 && coluna < colunas;     
    }

    public boolean existeposicao(Posicao posicao){
        return existeposicao(posicao.getFileira(),posicao.getColuna());
    }

    public boolean existeUmaPeca(Posicao posicao){
        if (!existeposicao(posicao)){
            throw new QuadroException("Error: Posição invalida");
        }
        return peca(posicao) != null;
    }

}
