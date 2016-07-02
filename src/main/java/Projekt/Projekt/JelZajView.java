package Projekt.Projekt;

public class JelZajView {
	
	public void start(){
		System.out.printf("Podaj ilość rund\n");
	}
	
	public void wybierz(){
		System.out.printf("Wybierz stronę...(0 - Zając, 1 - Jeleń)\n");
	}
	
	public void wybKomp(int x){
		System.out.printf("Komputer wybiera...\n");
		if(x==0) System.out.printf("Komputer wybrał Zająca\n");
	    else System.out.printf("Komputer wybrał Jelenia\n");
	}
	
	public void wynik(int W1, int W2){
		if(W1==1 && W2==1) 
		{
			System.out.printf("Upolowaliście jelenia!\n");
		}
		if(W1==0 && W2==0) 
		{
			System.out.printf("Upolowaliście po zającu!\n");
		}
		if(W1==1 && W2==0) 
		{
			System.out.printf("Nic nie upolowałeś!\n");
		}
		if(W1==0 && W2==1) 
		{
			System.out.printf("Upolowałeś zająca!\n");
		}
	}
	
	public void koniec(String imie,int Pu1,int Pu2,int poziom,Reakcje reak){
		System.out.printf("%s %d-%d Komputer\n", imie, Pu1, Pu2);
        if (Pu1 > Pu2) {
            reak.reakcjaw(poziom);
        } else {
            reak.reakcjap(poziom);
        }
	}
	
	public void zly() {System.out.printf("Zły wybór!\n");}
}
