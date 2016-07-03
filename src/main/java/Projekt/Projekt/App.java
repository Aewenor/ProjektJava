package Projekt.Projekt;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public abstract class App{
	
	static String imie;
	static JFrame frame,frame2,frame3;
	static JTextField txtPodajImie;
	static int wybor;
		
    public static void main(String[] args) {

    	Singleton obj = Singleton.getInstance();
    	Thread muz = new Thread(obj);
        muz.start();
        
        
        frame = new JFrame();
        frame.setTitle("Witaj!");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel contentPane = new JPanel();
		frame.setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		JButton btnZatwierd = new JButton("Zatwierdz");
		contentPane.add(btnZatwierd, BorderLayout.SOUTH);
		txtPodajImie = new JTextField("Podaj imie");
		txtPodajImie.setHorizontalAlignment(SwingConstants.CENTER);
		txtPodajImie.setText("Podaj imie");
		txtPodajImie.setColumns(1);
		contentPane.add(txtPodajImie, BorderLayout.NORTH);
		frame.setSize(300, 100);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		frame2 = new JFrame("Wybierz poziom");
	    frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	    JButton toggleButton = new JButton("Przedszkolak");
	    
	    Container contentPane2 = frame2.getContentPane();
	    contentPane2.add(toggleButton, BorderLayout.NORTH);

	    JButton toggleButton2 = new JButton("Uczeń");
	    contentPane2.add(toggleButton2, BorderLayout.CENTER);

	    JButton toggleButton3 = new JButton("Student");
	    contentPane2.add(toggleButton3, BorderLayout.SOUTH);
		
	    frame2.setSize(300, 125);
	    frame2.setLocationRelativeTo(null);
		
		btnZatwierd.addActionListener(new ButtonListener());
		toggleButton.addActionListener(new ButtonListener());
		toggleButton2.addActionListener(new ButtonListener());
		toggleButton3.addActionListener(new ButtonListener());
    }
    
    public static void wybor(int x){
	  	frame3 = new JFrame("Wybierz grę");
	    frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	    JButton toggleButton = new JButton("Rzut Monetą");
	    
	    Container contentPane2 = frame3.getContentPane();
	    contentPane2.add(toggleButton, BorderLayout.NORTH);

	    JButton toggleButton2 = new JButton("Kamień, Papier i Nożyce");
	    contentPane2.add(toggleButton2, BorderLayout.CENTER);
	    
	if(x == 1){
	    JButton toggleButton3 = new JButton("Jelenie i Zające");
	    contentPane2.add(toggleButton3, BorderLayout.SOUTH);
	    toggleButton3.addActionListener(new ButtonListener());
	} 
	toggleButton.addActionListener(new ButtonListener());
	toggleButton2.addActionListener(new ButtonListener());
	frame3.setSize(300, 125);
	frame3.setLocationRelativeTo(null);				
  }
}

class ButtonListener implements ActionListener {
	  ButtonListener() {
	  }
	  
	  public void actionPerformed(ActionEvent e) {
		  RzutMonetaController rz;
		  KPNController kpn;
		  JelZajController jz;
		  Fabryka f = new Fabryka();
		  
		
	    if (e.getActionCommand().equals("Zatwierdz")) {
	    	Projekt.Projekt.App.imie = Projekt.Projekt.App.txtPodajImie.getText();
	    	Projekt.Projekt.App.frame.setVisible(false);
	    	Projekt.Projekt.App.frame2.setVisible(true);
	    }
	    if (e.getActionCommand().equals("Przedszkolak")) {
	    	rz = (RzutMonetaController) f.zrobGre(1, 0, Projekt.Projekt.App.imie);
	    	Projekt.Projekt.App.frame2.setVisible(false);
	    	rz.gra();
	    }
	    if (e.getActionCommand().equals("Uczeń")) {
	    	Projekt.Projekt.App.imie = Projekt.Projekt.App.txtPodajImie.getText();
	    	Projekt.Projekt.App.frame2.setVisible(false);
	    	Projekt.Projekt.App.wybor = 1;
	    	Projekt.Projekt.App.wybor(0);
	    	Projekt.Projekt.App.frame3.setVisible(true);
	    }
	    if (e.getActionCommand().equals("Student")) {
	    	Projekt.Projekt.App.imie = Projekt.Projekt.App.txtPodajImie.getText();
	    	Projekt.Projekt.App.frame2.setVisible(false);
	    	Projekt.Projekt.App.wybor = 2;
	    	Projekt.Projekt.App.wybor(1);
	    	Projekt.Projekt.App.frame3.setVisible(true);
	    }
	    if (e.getActionCommand().equals("Rzut Monetą")) {
	    	Projekt.Projekt.App.frame3.setVisible(false);
	    	rz = (RzutMonetaController) f.zrobGre(1, Projekt.Projekt.App.wybor, Projekt.Projekt.App.imie);
	    	rz.gra();
	    }
	    if (e.getActionCommand().equals("Kamień, Papier i Nożyce")) {
	    	Projekt.Projekt.App.frame3.setVisible(false);
	    	kpn = (KPNController) f.zrobGre(2, Projekt.Projekt.App.wybor, Projekt.Projekt.App.imie);
	    	kpn.gra();
	    }
	    if (e.getActionCommand().equals("Jelenie i Zające")) {
	    	Projekt.Projekt.App.frame3.setVisible(false);
	    	jz = (JelZajController) f.zrobGre(3, 2, Projekt.Projekt.App.imie);
	    	jz.gra();
	    }
	  }
	}