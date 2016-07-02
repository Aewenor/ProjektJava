package Projekt.Projekt;

public class Reakcje implements ReakcjaPrzegr, ReakcjaWygr {

	public void reakcjaw(int x) {
		 if (x == PW) {
	            System.out.printf("Wygrywasz! Od dziś nie nosisz pieluchy!\n");
	        }
	        if (x == UW) {
	            System.out.printf("Wygrywasz! Idziemy na pizzę!\n");
	        }
	        if (x == SW) {
	            System.out.printf("Wygrywasz! Jestę Zwycięzcą!\n");
	        }
	        System.out.printf("KONIEC!\n");

	}

	public void reakcjap(int x) {
		if (x == PP) {
            System.out.printf("Przegrywasz! Tylko proszę nie płacz...\n");
        }
        if (x == UP) {
            System.out.printf("Przegrywasz! Grrrrr....\n");
        }
        if (x == SP) {
            System.out.printf("Przegrywasz! Widzimy się na poprawce...\n");
        }
        System.out.printf("KONIEC!\n");

	}

}
