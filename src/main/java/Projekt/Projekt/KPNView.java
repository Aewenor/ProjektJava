package Projekt.Projekt;

public class KPNView {

	public void wybierz(){
		System.out.printf("Wybierz...(0 - Kamień, 1 - Nożyce, 2-Papier)\n");
	}
	
	public void start(){
		System.out.printf("Podaj ilość rund\n");
	}
	
	public void wybKomp(int x){
		System.out.printf("Komputer wybiera...\n");
		if (x == 0) {
            System.out.printf("Komputer wybrał Kamień\n");
        }
        if (x == 1) {
            System.out.printf("Komputer wybrał Nożyce\n");
        }
        if (x == 2) {
            System.out.printf("Komputer wybrał Papier\n");
        }
	}
	
	public void wynik(int wyb1, int wyb2){
		if (wyb1 == 0 && wyb2 == 0) {
            System.out.printf("Remis!\n");
        }
        if (wyb1 == 1 && wyb2 == 1) {
            System.out.printf("Remis!\n");
        }
        if (wyb1 == 2 && wyb2 == 2) {
            System.out.printf("Remis!\n");
        }
        if (wyb1 == 0 && wyb2 == 1) {
            System.out.printf("Wygrywasz rundę!\n");
        }
        if (wyb1 == 1 && wyb2 == 0) {
            System.out.printf("Przegrywasz rundę!\n");
        }
        if (wyb1 == 0 && wyb2 == 2) {
            System.out.printf("Przegrywasz rundę!\n");
        }
        if (wyb1 == 2 && wyb2 == 0) {
            System.out.printf("Wygrywasz rundę!\n");
        }
        if (wyb1 == 1 && wyb2 == 2) {
            System.out.printf("Przegrywasz rundę!\n");
        }
        if (wyb1 == 2 && wyb2 == 1) {
            System.out.printf("Wygrywasz rundę!\n");
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
