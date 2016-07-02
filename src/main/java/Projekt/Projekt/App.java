package Projekt.Projekt;
import java.util.Scanner;

public abstract class App {

    public static void main(String[] args) {
    	Singleton obj = Singleton.getInstance();
    	Thread muz = new Thread(obj);
        muz.start();
        Scanner wejscie = new Scanner(System.in);
        int wybor;
        String imie;
        System.out.printf("Jak sie nazywasz?\n");
        imie = wejscie.nextLine();
        System.out.printf("Wybierz poziom:\n1.Przedszkolak\n2.Uczeń\n3.Student\n");
        wybor = wejscie.nextInt();
        RzutMoneta G1 = new RzutMoneta();
        KPN G2 = new KPN();
        JelenieZajace G3 = new JelenieZajace();
        switch (wybor) {
            case 1:
                G1.grap(imie, 0);
                break;

            case 2:
                System.out.printf("Wybierz grę:\n1.Rzut Monetą\n2.Kamień, Papier, Nożyce\n");
                wybor = wejscie.nextInt();
                switch (wybor) {
                    case 1:
                        G1.grap(imie, 1);
                        break;

                    case 2:
                        G2.grau(imie, 1);
                        break;

                    default:
                        System.out.println("Zły wybór\n");
                }
                break;

            case 3:
                System.out.printf("Wybierz grę:\n1.Rzut Monetą\n2.Kamień, Papier, Nożyce\n3.Polowanie na Jelenie\n");
                wybor = wejscie.nextInt();
                switch (wybor) {
                    case 1:
                        G1.grap(imie, 2);
                        break;

                    case 2:
                        G2.grau(imie, 2);
                        break;

                    case 3:
                        G3.gras(imie, 2);
                        break;

                    default:
                        System.out.println("Zły wybór\n");
                }
                break;

            default:
                System.out.println("Zły wybór\n");
        }
        wejscie.close();
        muz.interrupt();
    }

}

