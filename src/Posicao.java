public class Posicao{
    private int fileira;
    private int coluna;

    //Construtor
    public Posicao(int fileira, int coluna){
       this.fileira = fileira;
       this.coluna = coluna;
    }
    // Get é Set
    public int getFileira(){
        return fileira;
    }
    public void setFileira(int fileira){
        this.fileira = fileira;
    }

    public int getColuna(){
        return coluna;
    }
    public void setColuna(int coluna){
        this.coluna = coluna;
    }

    @Override 
    public String toString(){
        return fileira + "," + coluna;
    }
}