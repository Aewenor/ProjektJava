package Projekt.Projekt;

import java.util.Random;
import java.util.Scanner;

public class RzutMonetaController implements Gra{
	
	RzutMoneta model;
	RzutMonetaView view;
	
	public RzutMonetaController(String imie, int poziom){
		this.model = new RzutMoneta(imie,poziom);
		this.view = new RzutMonetaView();
	}
	
	public void gra() {
        Reakcje reak = new Reakcje();
        Random rnd = new Random();
        int W, W1, W2, Pu1, Pu2, Pu, tmp;
        Pu1 = 0;
        Pu2 = 0;
        Scanner wejscie = new Scanner(System.in);
        view.start();
        Pu = wejscie.nextInt();
        wejscie.nextLine();
        do {
        	tmp = 0;
        	do{
            view.wybierz();
            W1 = wejscie.nextInt();
            if(W1 > 1 || W1 <0) view.zly();
            else tmp=1;
        	}while(tmp !=1);
            
            W2 = rnd.nextInt(2);
            view.wybKomp(W2);
            Rzut rzut = new Rzut();
            rzut.rzut();
            W = rzut.wynikRzutu;
            view.wynik(W, W1, W2);
            if (W == 0 && W1 == 0 && W2 == 1) {
                Pu1++;
                Pu--;
            }
            if (W == 0 && W1 == 1 && W2 == 0) {
                Pu2++;
                Pu--;
            }
            if (W == 1 && W1 == 0 && W2 == 1) {
                Pu2++;
                Pu--;
            }
            if (W == 1 && W1 == 1 && W2 == 0) {
                Pu1++;
                Pu--;
            }
        } while (Pu != 0);
        view.koniec(model.getName(), Pu1, Pu2, model.getPoziom(), reak);
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
