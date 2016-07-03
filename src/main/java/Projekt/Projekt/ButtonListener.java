package Projekt.Projekt;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
