package Projekt.Projekt;

import java.util.Random;
import java.util.Scanner;


public class JelZajController  implements Gra{
	
	private JelZaj model;
	private JelZajView view;
	
	public JelZajController(String imie, int poziom){
		this.model = new JelZaj(imie,poziom);
		this.view = new JelZajView();
	}
	
	public void gra() {
	    Reakcje reak = new Reakcje();
	    Random rnd = new Random();
	    int W1,W2,Pu1,Pu2,tmp,Pu;
	    Pu1=0;
	    Pu2=0;
	    Scanner wejscie = new Scanner(System.in);
	    view.start();
	    Pu = wejscie.nextInt();
	    wejscie.nextLine();
	    
	    do
	    {
	    	tmp=0;
	    	do{
	            view.wybierz();
	            W1 = wejscie.nextInt();
	            if(W1 > 1 || W1 <0) view.zly();
	            else tmp=1;
	        	}while(tmp !=1);
	    
	    W2 = rnd.nextInt(2);
	    view.wybKomp(W2);
	    view.wynik(W1,W2);
	    if(W1==1 && W2==1) 
	    {
	        Pu1+=2;
	        Pu2+=2;
	        Pu--;
	    }
	    if(W1==0 && W2==0) 
	    {
	        Pu2++;
	        Pu1++;
	        Pu--;
	    }
	    if(W1==1 && W2==0) 
	    {
	        Pu2++;
	        Pu--;
	    }
	    if(W1==0 && W2==1) 
	    {
	        Pu1++;
	        Pu--;
	    }	    
	    }while(Pu!=0);
	    view.koniec(model.getName(), Pu1, Pu2, model.getPoziom(), reak);
	    wejscie.close();
	}
}
