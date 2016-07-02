package Projekt.Projekt;

public class Fabryka {

	public Gra zrobGre(int gra,int poziom,String imie)
	  {
	    if ( gra == 1 )
	      return new RzutMoneta(imie,poziom);
	    else if ( gra == 2 )
	      return new KPNController(imie,poziom);
	    else if ( gra == 3)
	      return new JelZaj(imie,poziom);

	    return null;
	  }
}
