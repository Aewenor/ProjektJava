package Projekt.Projekt;
import java.util.Random;
import java.util.Scanner;

public class KPN {
	public void grau(String imie, int x) {
        Reakcje reak = new Reakcje();
        int wyb1, wyb2, Pu;
        int Pu1, Pu2;
        Pu1 = 0;
        Pu2 = 0;
        Random rnd = new Random();
        Scanner wejscie = new Scanner(System.in);
        System.out.printf("Podaj ilość rund\n");
        Pu = wejscie.nextInt();
        wejscie.nextLine();
        do {
            System.out.printf("Wybierz...(0 - Kamień, 1 - Nożyce, 2-Papier)\n");
            wyb1 = wejscie.nextInt();
            System.out.printf("Komputer wybiera...\n");
            wyb2 = rnd.nextInt(3);
            if (wyb2 == 0) {
                System.out.printf("Komputer wybrał Kamień\n");
            }
            if (wyb2 == 1) {
                System.out.printf("Komputer wybrał Nożyce\n");
            }
            if (wyb2 == 2) {
                System.out.printf("Komputer wybrał Papier\n");
            }
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
                Pu1++;
                Pu--;
            }
            if (wyb1 == 1 && wyb2 == 0) {
                System.out.printf("Przegrywasz rundę!\n");
                Pu2++;
                Pu--;
            }
            if (wyb1 == 0 && wyb2 == 2) {
                System.out.printf("Przegrywasz rundę!\n");
                Pu2++;
                Pu--;
            }
            if (wyb1 == 2 && wyb2 == 0) {
                System.out.printf("Wygrywasz rundę!\n");
                Pu1++;
                Pu--;
            }
            if (wyb1 == 1 && wyb2 == 2) {
                System.out.printf("Przegrywasz rundę!\n");
                Pu2++;
                Pu--;
            }
            if (wyb1 == 2 && wyb2 == 1) {
                System.out.printf("Wygrywasz rundę!\n");
                Pu1++;
                Pu--;
            }
        } while (Pu != 0);
        System.out.printf("%s %d-%d Komputer\n", imie, Pu1, Pu2);
        if (Pu1 > Pu2) {
            reak.reakcjaw(x);
        } else {
            reak.reakcjap(x);
        }
        wejscie.close();
    }
}
