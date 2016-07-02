package Projekt.Projekt;

import java.util.Random;
import java.util.Scanner;


public class KPNController implements Gra{

	private KPN model;
	private KPNView view;
	
	public KPNController(String imie, int poziom){
		this.model = new KPN(imie,poziom);
		this.view = new KPNView();
	}
	
	public void gra() {
        Reakcje reak = new Reakcje();
        int wyb1, wyb2, Pu,tmp;
        int Pu1, Pu2;
        Pu1 = 0;
        Pu2 = 0;
        Random rnd = new Random();
        Scanner wejscie = new Scanner(System.in);
        view.start();
        Pu = wejscie.nextInt();
        wejscie.nextLine();
        do {
        	tmp = 0;
        	do{
            view.wybierz();
            wyb1 = wejscie.nextInt();
            if(wyb1 > 2 || wyb1 <0) view.zly();
            else tmp=1;
        	}while(tmp !=1);
            
            wyb2 = rnd.nextInt(3);

            view.wybKomp(wyb2);
            view.wynik(wyb1, wyb2);
            if (wyb1 == 0 && wyb2 == 1) {
                Pu1++;
                Pu--;
            } 
            if (wyb1 == 1 && wyb2 == 0) {
                Pu2++;
                Pu--;
            }
            if (wyb1 == 0 && wyb2 == 2) {
                Pu2++;
                Pu--;
            }
            if (wyb1 == 2 && wyb2 == 0) {
                Pu1++;
                Pu--;
            }
            if (wyb1 == 1 && wyb2 == 2) {
                Pu2++;
                Pu--;
            }
            if (wyb1 == 2 && wyb2 == 1) {
                Pu1++;
                Pu--;
            }
        } while (Pu != 0);

        view.koniec(model.getName(), Pu1, Pu2, model.getPoziom(), reak);
        wejscie.close();
    }
}
