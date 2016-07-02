package Projekt.Projekt;

import java.util.Random;
import java.util.Scanner;

public class Gry {
	
	public void gras(String imie, int x) {
	    Reakcje reak = new Reakcje();
	    Random rnd = new Random();
	    int W1,W2,Pu1,Pu2,Pu;
	    Pu1=0;
	    Pu2=0;
	    Scanner wejscie = new Scanner(System.in);
	    System.out.printf("Podaj ilość rund\n");
	    Pu = wejscie.nextInt();
	    wejscie.nextLine();
	    do
	    {
	    System.out.printf("Wybierz stronę...(0 - Zając, 1 - Jeleń)\n",imie);
	    W1 = wejscie.nextInt();
	    System.out.printf("Komputer wybiera...\n");
	    W2 = rnd.nextInt(2);
	    if(W2==0) System.out.printf("Komputer wybrał Zająca\n");
	    else System.out.printf("Komputer wybrał Jelenia\n");
	    if(W1==1 && W2==1) 
	    {
	        System.out.printf("Upolowaliście jelenia!\n");
	        Pu1+=2;
	        Pu2+=2;
	        Pu--;
	    }
	    if(W1==0 && W2==0) 
	    {
	        System.out.printf("Upolowaliście po zającu!\n");
	        Pu2++;
	        Pu1++;
	        Pu--;
	    }
	    if(W1==1 && W2==0) 
	    {
	        System.out.printf("Nic nie upolowałeś!\n");
	        Pu2++;
	        Pu--;
	    }
	    if(W1==0 && W2==1) 
	    {
	        System.out.printf("Upolowałeś zająca!\n");
	        Pu1++;
	        Pu--;
	    }
	    }while(Pu!=0);
	    System.out.printf("%s %d-%d Komputer\n", imie, Pu1, Pu2);
	    if(Pu1>Pu2) reak.reakcjaw(x);
	    else reak.reakcjap(x);
	    wejscie.close();
	}
	
	public void grau(String imie, int x) {
        Reakcje reak = new Reakcje();
        int wyb1, wyb2, Pu;
        int Pu1, Pu2;
        Pu1 = 0;
        Pu2 = 0;
        Random rnd = new Random();
        Scanner wejscie = new Scanner(System.in);
        System.out.printf("Podaj ilość rund\n");
        Pu = wejscie.nextInt();
        wejscie.nextLine();
        do {
            System.out.printf("Wybierz...(0 - Kamień, 1 - Nożyce, 2-Papier)\n");
            wyb1 = wejscie.nextInt();
            System.out.printf("Komputer wybiera...\n");
            wyb2 = rnd.nextInt(3);
            if (wyb2 == 0) {
                System.out.printf("Komputer wybrał Kamień\n");
            }
            if (wyb2 == 1) {
                System.out.printf("Komputer wybrał Nożyce\n");
            }
            if (wyb2 == 2) {
                System.out.printf("Komputer wybrał Papier\n");
            }
            if (wyb1 == 0 && wyb2 == 0) {
                System.out.printf("Remis!\n");
            }
            if (wyb1 == 1 && wyb2 == 1) {
                System.out.printf("Remis!\n");
            }
            if (wyb1 == 2 && wyb2 == 2) {
                System.out.printf("Remis!\n");
            }
            if (wyb1 == 0 && wyb2 == 1) {
                System.out.printf("Wygrywasz rundę!\n");
                Pu1++;
                Pu--;
            }
            if (wyb1 == 1 && wyb2 == 0) {
                System.out.printf("Przegrywasz rundę!\n");
                Pu2++;
                Pu--;
            }
            if (wyb1 == 0 && wyb2 == 2) {
                System.out.printf("Przegrywasz rundę!\n");
                Pu2++;
                Pu--;
            }
            if (wyb1 == 2 && wyb2 == 0) {
                System.out.printf("Wygrywasz rundę!\n");
                Pu1++;
                Pu--;
            }
            if (wyb1 == 1 && wyb2 == 2) {
                System.out.printf("Przegrywasz rundę!\n");
                Pu2++;
                Pu--;
            }
            if (wyb1 == 2 && wyb2 == 1) {
                System.out.printf("Wygrywasz rundę!\n");
                Pu1++;
                Pu--;
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