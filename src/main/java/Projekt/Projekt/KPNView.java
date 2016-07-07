package Projekt.Projekt;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class KPNView {

	static JFrame frame,frame2,uwaga = new JFrame("Uwaga!");
	static JTextField txtPodajRundy;
	
	public void frstart(String imie){
		frame = new JFrame();
	    frame.setTitle("Kamień, Papier i Nożyce");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel contentPane = new JPanel();
		frame.setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		JButton btnPotwierdz = new JButton("Dalej");
		contentPane.add(btnPotwierdz, BorderLayout.SOUTH);
		txtPodajRundy = new JTextField("Podaj ilość rund");
		txtPodajRundy.setHorizontalAlignment(SwingConstants.CENTER);
		txtPodajRundy.setText("Witaj "+ imie + "! Podaj ilość rund");
		txtPodajRundy.setColumns(1);
		contentPane.add(txtPodajRundy, BorderLayout.NORTH);
		frame.setSize(300, 100);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		btnPotwierdz.addActionListener(new ButtonListener());
	}
	
	public void frwybor(){
		frame2 = new JFrame("Wybierz:");
	    frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	    JButton toggleButton = new JButton("Kamień");
	    
	    Container contentPane2 = frame2.getContentPane();
	    contentPane2.add(toggleButton, BorderLayout.NORTH);

	    JButton toggleButton2 = new JButton("Nożyczki");
	    contentPane2.add(toggleButton2, BorderLayout.CENTER);

	    JButton toggleButton3 = new JButton("Papier");
	    contentPane2.add(toggleButton3, BorderLayout.SOUTH);
		
	    frame2.setSize(300, 125);
	    frame2.setLocationRelativeTo(null);
		
		toggleButton.addActionListener(new ButtonListener());
		toggleButton2.addActionListener(new ButtonListener());
		toggleButton3.addActionListener(new ButtonListener());
	}
	
	public static void frmess(int x){
	    if(x==1)JOptionPane.showMessageDialog(uwaga, "Papier zakrywa kamień!");
	    if(x==2)JOptionPane.showMessageDialog(uwaga, "Kamień tępi nozyczki!");
	    if(x==3)JOptionPane.showMessageDialog(uwaga, "Nożyczki tną papier!");
	    if(x==4)JOptionPane.showMessageDialog(uwaga, "Remis!");
	    if(x==5){
	    	Reakcje reak = new Reakcje();
	    	JOptionPane.showMessageDialog(uwaga, Projekt.Projekt.App.imie + " " + Projekt.Projekt.KPNController.Pu1 + "-" + Projekt.Projekt.KPNController.Pu2 + " Komputer");
	    	if (Projekt.Projekt.RzutMonetaController.Pu1 > Projekt.Projekt.RzutMonetaController.Pu2) {
	    		JOptionPane.showMessageDialog(uwaga,reak.reakcjaw(Projekt.Projekt.App.wybor));
	        } else {
	        	JOptionPane.showMessageDialog(uwaga,reak.reakcjap(Projekt.Projekt.App.wybor));
	        }
	    	System.exit(0);
	    }
	}
}
