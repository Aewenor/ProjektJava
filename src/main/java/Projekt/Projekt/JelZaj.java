package Projekt.Projekt;

public class JelZaj{
	private String imie;
	private int poziom;
	
	public JelZaj(String iimie, int poz){		
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
