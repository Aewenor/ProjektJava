package Projekt.Projekt;


public class RzutMoneta{
	private String imie;
	private int poziom;
	
	public RzutMoneta(String iimie, int poz){		
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