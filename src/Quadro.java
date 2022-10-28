public class Quadro {
    private int linhas;
    private int colunas;
    private Peca[][] pecas;

    public Quadro(int linhas,int colunas){
        this.linhas = linhas;
        this.colunas = colunas;
        pecas = new Peca[linhas][colunas];
    }

    public int getLinhas(){
        return linhas;
    }
    public void setLinhas(int linhas){
        this.linhas = linhas;
    }

    public int getColunas(){
        return colunas;
    }
    public void setColunas(int coluna){
        this.colunas = colunas;
    }

}
