package Projekt.Projekt;

import java.util.Scanner;

public abstract class App {
	
    public static void main(String[] args) {
    	
    	Singleton obj = Singleton.getInstance();
    	Thread muz = new Thread(obj);
        muz.start();
        
        Scanner wejscie = new Scanner(System.in);
        RzutMoneta rz;
        KPNController kpn;
        JelZaj jz;
        int wybor;
        String imie;
        
        System.out.printf("Jak sie nazywasz?\n");
        imie = wejscie.nextLine();
        System.out.printf("Wybierz poziom:\n1.Przedszkolak\n2.Uczeń\n3.Student\n");
        wybor = wejscie.nextInt();
        Fabryka f = new Fabryka();
        
        switch (wybor) {
            case 1:
            	rz = (RzutMoneta) f.zrobGre(wybor, 0, imie);
            	rz.gra();
                break;

            case 2:
                System.out.printf("Wybierz grę:\n1.Rzut Monetą\n2.Kamień, Papier, Nożyce\n");
                wybor = wejscie.nextInt();
                switch (wybor) {
                    case 1:
                    	rz = (RzutMoneta) f.zrobGre(wybor, 1, imie);
                    	rz.gra();
                        break;

                    case 2:
                    	kpn = (KPNController) f.zrobGre(wybor, 1, imie);
                    	kpn.gra();
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
                    	rz = (RzutMoneta) f.zrobGre(wybor, 2, imie);
                    	rz.gra();
                        break;

                    case 2:
                    	kpn = (KPNController) f.zrobGre(wybor, 2, imie);
                    	kpn.gra();
                        break;

                    case 3:
                    	jz = (JelZaj) f.zrobGre(wybor, 2, imie);
                    	jz.gra();
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

