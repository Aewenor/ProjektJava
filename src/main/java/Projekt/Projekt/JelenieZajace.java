package Projekt.Projekt;
import java.util.Random;
import java.util.Scanner;

public class JelenieZajace {
	public void gras(String imie, int x) {
	    Reakcje reak = new Reakcje();
	    Random rnd = new Random();
	    int W1,W2,Pu1,Pu2,Pu;
	    Pu1=0;
	    Pu2=0;
	    Scanner wejscie = new Scanner(System.in);
	    System.out.printf("Podaj ilość rund\n");
	    Pu = wejscie.nextInt();
	    wejscie.nextLine();
	    do
	    {
	    System.out.printf("Wybierz stronę...(0 - Zając, 1 - Jeleń)\n",imie);
	    W1 = wejscie.nextInt();
	    System.out.printf("Komputer wybiera...\n");
	    W2 = rnd.nextInt(2);
	    if(W2==0) System.out.printf("Komputer wybrał Zająca\n");
	    else System.out.printf("Komputer wybrał Jelenia\n");
	    if(W1==1 && W2==1) 
	    {
	        System.out.printf("Upolowaliście jelenia!\n");
	        Pu1+=2;
	        Pu2+=2;
	        Pu--;
	    }
	    if(W1==0 && W2==0) 
	    {
	        System.out.printf("Upolowaliście po zającu!\n");
	        Pu2++;
	        Pu1++;
	        Pu--;
	    }
	    if(W1==1 && W2==0) 
	    {
	        System.out.printf("Nic nie upolowałeś!\n");
	        Pu2++;
	        Pu--;
	    }
	    if(W1==0 && W2==1) 
	    {
	        System.out.printf("Upolowałeś zająca!\n");
	        Pu1++;
	        Pu--;
	    }
	    }while(Pu!=0);
	    System.out.printf("%s %d-%d Komputer\n", imie, Pu1, Pu2);
	    if(Pu1>Pu2) reak.reakcjaw(x);
	    else reak.reakcjap(x);
	    wejscie.close();
	}
}
