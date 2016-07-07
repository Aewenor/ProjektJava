package Projekt.Projekt;

import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class RzutMonetaController implements Gra{
	
	RzutMoneta model;
	RzutMonetaView view;
	static int Pu,Pu1,Pu2;
	
	public RzutMonetaController(String imie, int poziom){
		this.model = new RzutMoneta(imie,poziom);
		this.view = new RzutMonetaView();
	}
	
	public void gra() {
		
		Pu1=0;
		Pu2=0;
		view.frstart(model.getName());
		view.frwybor();
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
    	JFrame uwaga = new JFrame("Uwaga!");
        wynik = losowyNum.nextInt(2);
        if (wynik == 0) {
            rzucaj = Moneta.Orzeł;
            JOptionPane.showMessageDialog(uwaga,"Wypadł Orzeł!");
            wynikRzutu = 0;
        } else {
            rzucaj = Moneta.Reszka;
            JOptionPane.showMessageDialog(uwaga,"Wypadła Reszka!");
            wynikRzutu = 1;
        }
    }
}
