package Projekt.Projekt;
/*
import java.io.*;
import javazoom.jl.player.*;

public class Singleton extends Thread{
	   private static Singleton instance = new Singleton();

	   private Singleton(){}

	   public static Singleton getInstance(){
	      return instance;
	   }

	   
	   public void run(){
		   try {               
               FileInputStream fis = new FileInputStream("src/main/java/media/bckgrd.mp3");// tutaj należy podać ścieżkę do pliku z muzyką
               Player playMP3 = new Player(fis); 
               playMP3.play(); // odtwarza muzykę
		   } catch (Exception exc) {
           exc.printStackTrace();
           System.out.println("Nie można otworzyc pliku MP3");
		   }
	   }
	   
	   public void graj() {
           new Singleton.start();
       }
}
*/

import java.io.*;
import javazoom.jl.player.*;

public class Singleton implements Runnable {
    private static final String mp3 = "src/main/java/media/bckgrd.mp3";

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