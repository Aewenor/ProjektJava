package Projekt.Projekt;

public class RzutMonetaView {
	
	public void wybierz(){
		System.out.printf("Wybierz stronę...(0 - Orzeł, 1 - Reszka)\n");
	}
	
	public void start(){
		System.out.printf("Podaj ilość rund\n");
	}
	
	public void wybKomp(int x){
		System.out.printf("Komputer wybiera...\n");
		if (x == 0) {
            System.out.printf("Komputer wybrał Orła\n");
        } else {
            System.out.printf("Komputer wybrał Reszkę\n");
        }
        System.out.printf("Moneta w powietrzu...\n");
	}
	
	public void wynik(int W,int W1, int W2){
		if (W == 0 && W1 == 0 && W2 == 0) {
            System.out.printf("Remis!\n");
        }
        if (W == 0 && W1 == 0 && W2 == 1) {
            System.out.printf("Wygrywasz rundę!\n");
        }
        if (W == 0 && W1 == 1 && W2 == 0) {
            System.out.printf("Przegrywasz rundę!\n");
        }
        if (W == 0 && W1 == 1 && W2 == 1) {
            System.out.printf("Remis!\n");
        }
        if (W == 1 && W1 == 0 && W2 == 0) {
            System.out.printf("Remis!\n");
        }
        if (W == 1 && W1 == 0 && W2 == 1) {
            System.out.printf("Przegrywasz rundę!\n");
        }
        if (W == 1 && W1 == 1 && W2 == 0) {
            System.out.printf("Wygrywasz rundę!\n");
        }
        if (W == 1 && W1 == 1 && W2 == 1) {
            System.out.printf("Remis!\n");
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
	
}
