package Projekt.Projekt;

public class KPN{
	private String imie;
	private int poziom;
		
	public KPN(String iimie, int poz){		
		imie = iimie;
		poziom = poz;
	}
	
	public String getName(){
		return imie;
	}
	
	public int getPoziom(){
		return poziom;
	}

}
