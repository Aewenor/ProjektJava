package Projekt.Projekt;
import java.util.Random;
import java.util.Scanner;

public class RzutMoneta {
	public void grap(String imie, int x) {
        Reakcje reak = new Reakcje();
        Random rnd = new Random();
        int W, W1, W2, Pu1, Pu2, Pu, tmp;
        Pu1 = 0;
        Pu2 = 0;
        Scanner wejscie = new Scanner(System.in);
        System.out.printf("Podaj ilość rund\n");
        Pu = wejscie.nextInt();
        wejscie.nextLine();
        do {
        	tmp = 0;
        	do{
            System.out.printf("Wybierz stronę...(0 - Orzeł, 1 - Reszka)\n", imie);
            W1 = wejscie.nextInt();
            if(W1 > 1 || W1 <0) System.out.printf("Zły wybór!\n");
            else tmp=1;
        	}while(tmp !=1);
            System.out.printf("Komputer wybiera...\n");
            W2 = rnd.nextInt(2);
            if (W2 == 0) {
                System.out.printf("Komputer wybrał Orła\n");
            } else {
                System.out.printf("Komputer wybrał Reszkę\n");
            }
            System.out.printf("Moneta w powietrzu...\n");
            Rzut rzut = new Rzut();
            rzut.rzut();
            W = rzut.wynikRzutu;
            if (W == 0 && W1 == 0 && W2 == 0) {
                System.out.printf("Remis!\n");
            }
            if (W == 0 && W1 == 0 && W2 == 1) {
                System.out.printf("Wygrywasz rundę!\n");
                Pu1++;
                Pu--;
            }
            if (W == 0 && W1 == 1 && W2 == 0) {
                System.out.printf("Przegrywasz rundę!\n");
                Pu2++;
                Pu--;
            }
            if (W == 0 && W1 == 1 && W2 == 1) {
                System.out.printf("Remis!\n");
            }
            if (W == 1 && W1 == 0 && W2 == 0) {
                System.out.printf("Remis!\n");
            }
            if (W == 1 && W1 == 0 && W2 == 1) {
                System.out.printf("Przegrywasz rundę!\n");
                Pu2++;
                Pu--;
            }
            if (W == 1 && W1 == 1 && W2 == 0) {
                System.out.printf("Wygrywasz rundę!\n");
                Pu1++;
                Pu--;
            }
            if (W == 1 && W1 == 1 && W2 == 1) {
                System.out.printf("Remis!\n");
            }
        } while (Pu != 0);
        System.out.printf("%s %d-%d Komputer\n", imie, Pu1, Pu2);
        if (Pu1 > Pu2) {
            reak.reakcjaw(x);
        } else {
            reak.reakcjap(x);
        }
        wejscie.close();
    }
}

class Rzut {

    private enum Moneta {
        Orzeł, Reszka
    };

    Random losowyNum = new Random();
    private int wynik;
    Moneta rzucaj;
    public int wynikRzutu;

    public void rzut() {
        wynik = losowyNum.nextInt(2);
        if (wynik == 0) {
            rzucaj = Moneta.Orzeł;
            System.out.println("Wypadł Orzeł!");
            wynikRzutu = 0;
        } else {
            rzucaj = Moneta.Reszka;
            System.out.println("Wypadła Reszka!");
            wynikRzutu = 1;
        }
    }
}
