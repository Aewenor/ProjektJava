package Projekt.Projekt;
import java.io.*;
import javazoom.jl.player.*;

public class Singleton implements Runnable {
    private static final String mp3 = "src/main/java/resources/bckgrd.mp3";

    private static Singleton instance = new Singleton();

	   private Singleton(){}

	   public static Singleton getInstance(){
	      return instance;
	   }
    
    public void run() {
        try {
            Player player = new Player(new FileInputStream(mp3));
            while(true){
            player.play();
            }
        }
        catch (Exception e) {
            System.out.printf("BŁĄD: plik '%s' nie istnieje\n",mp3);
            System.exit(1);
        }
    }
 
}   