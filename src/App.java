import java.util.Scanner;


public class App {
    public static void main(String[] args)  {
      
        Scanner sc = new Scanner(System.in);
        PartidaDeXadrez partidaDeXadrez = new PartidaDeXadrez();
       
        while (true) {
            UI.printQuadro(partidaDeXadrez.getPecas());
            System.out.println();
            System.out.print("Origem: ");
            XadezPosicao origem = UI.lerXadrezPosicao(sc);

            System.out.println();
            System.out.print("Alvo: ");
            XadezPosicao alvo = UI.lerXadrezPosicao(sc);

           PecaDeXadrez capturePeca =  partidaDeXadrez.executarPecaDeXadrez(origem, alvo);
        }
      
    }
}
