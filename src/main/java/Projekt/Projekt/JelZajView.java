package Projekt.Projekt;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class JelZajView {
	
	static JFrame frame,frame2,uwaga = new JFrame("Uwaga!");
	static JTextField txtPodajRundy;
	
	public void frstart(String imie){
		frame = new JFrame();
	    frame.setTitle("Jelenie i Zające");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel contentPane = new JPanel();
		frame.setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		JButton btnPotwierdz = new JButton("Potwierdz");
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
	    
	    JButton toggleButton = new JButton("Jeleń");
	    
	    Container contentPane2 = frame2.getContentPane();
	    contentPane2.add(toggleButton, BorderLayout.NORTH);


	    JButton toggleButton3 = new JButton("Zając");
	    contentPane2.add(toggleButton3, BorderLayout.SOUTH);
		
	    frame2.setSize(300, 125);
	    frame2.setLocationRelativeTo(null);
		
		toggleButton.addActionListener(new ButtonListener());
		toggleButton3.addActionListener(new ButtonListener());
	}
	
	public static void frmess(int x){
	    if(x==1)JOptionPane.showMessageDialog(uwaga, "Upolowaliście jelenia!");
	    if(x==2)JOptionPane.showMessageDialog(uwaga, "Nic nie upolowałeś!");
	    if(x==3)JOptionPane.showMessageDialog(uwaga, "Upolowaliście po zającu!");
	    if(x==4) JOptionPane.showMessageDialog(uwaga, "Upolowałeś zająca!");
	    if(x==5){
	    	Reakcje reak = new Reakcje();
	    	JOptionPane.showMessageDialog(uwaga, Projekt.Projekt.App.imie + " " + Projekt.Projekt.JelZajController.Pu1 + "-" + Projekt.Projekt.JelZajController.Pu2 + " Komputer");
	    	if (Projekt.Projekt.JelZajController.Pu1 > Projekt.Projekt.JelZajController.Pu2) {
	    		JOptionPane.showMessageDialog(uwaga,reak.reakcjaw(Projekt.Projekt.App.wybor));
	        } else {
	        	JOptionPane.showMessageDialog(uwaga,reak.reakcjap(Projekt.Projekt.App.wybor));
	        }
	    	System.exit(0);
	    }
	}
}
