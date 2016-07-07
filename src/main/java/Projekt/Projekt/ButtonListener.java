package Projekt.Projekt;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

class ButtonListener implements ActionListener {
	  ButtonListener() {
	  }
	  
	  public void actionPerformed(ActionEvent e) {
		  RzutMonetaController rz;
		  KPNController kpn;
		  JelZajController jz;
		  Fabryka f = new Fabryka();
		  Random rnd = new Random();
	      Rzut rzut = new Rzut();
		  
		
	    if (e.getActionCommand().equals("Zatwierdz")) {
	    	Projekt.Projekt.App.imie = Projekt.Projekt.App.txtPodajImie.getText();
	    	Projekt.Projekt.App.frame.setVisible(false);
	    	Projekt.Projekt.App.frame2.setVisible(true);
	    }
	    if (e.getActionCommand().equals("Przedszkolak")) {
	    	rz = (RzutMonetaController) f.zrobGre(1, 0, Projekt.Projekt.App.imie);
	    	Projekt.Projekt.App.wybor = 0;
	    	Projekt.Projekt.App.frame2.setVisible(false);
	    	rz.gra();
	    }
	    if (e.getActionCommand().equals("Uczeń")) {
	    	Projekt.Projekt.App.frame2.setVisible(false);
	    	Projekt.Projekt.App.wybor = 1;
	    	Projekt.Projekt.App.wybor(0);
	    	Projekt.Projekt.App.frame3.setVisible(true);
	    }
	    if (e.getActionCommand().equals("Student")) {
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
	    if (e.getActionCommand().equals("Potwierdz")) {
	    	Projekt.Projekt.JelZajController.Pu = Integer.parseInt(Projekt.Projekt.JelZajView.txtPodajRundy.getText());
	    	Projekt.Projekt.JelZajView.frame.setVisible(false);
	    	Projekt.Projekt.JelZajView.frame2.setVisible(true);
	    }
	    if (e.getActionCommand().equals("Jeleń")) {
	    	int W2 = rnd.nextInt(2);
	    	if(W2==1)
		    {
	    		Projekt.Projekt.JelZajController.Pu1+=2;
	    		Projekt.Projekt.JelZajController.Pu2+=2;
	    		Projekt.Projekt.JelZajController.Pu--;
	    		Projekt.Projekt.JelZajView.frmess(1);
		    }
		    if(W2==0)
		    {
		    	Projekt.Projekt.JelZajController.Pu2++;
		    	Projekt.Projekt.JelZajController.Pu--;
		    	Projekt.Projekt.JelZajView.frmess(2);
		    }
		    if(Projekt.Projekt.JelZajController.Pu==0){
		    	Projekt.Projekt.JelZajView.frame2.setVisible(false);
		    	Projekt.Projekt.JelZajView.frmess(5);
		    }
	    }
	    if (e.getActionCommand().equals("Zając")) {
	    	int W2 = rnd.nextInt(2);
	    	if(W2==0)
		    {
	    		Projekt.Projekt.JelZajController.Pu2++;
	    		Projekt.Projekt.JelZajController.Pu1++;
	    		Projekt.Projekt.JelZajController.Pu--;
	    		Projekt.Projekt.JelZajView.frmess(3);
		    }
		    if(W2==1)
		    {
		    	Projekt.Projekt.JelZajController.Pu1++;
		    	Projekt.Projekt.JelZajController.Pu--;
		    	Projekt.Projekt.JelZajView.frmess(4);
		    }
		    if(Projekt.Projekt.JelZajController.Pu==0){
		    	Projekt.Projekt.JelZajView.frame2.setVisible(false);
		    	Projekt.Projekt.JelZajView.frmess(5);
		    }
	    }
	    if (e.getActionCommand().equals("Kontynuuj")) {
	    	Projekt.Projekt.RzutMonetaController.Pu = Integer.parseInt(Projekt.Projekt.RzutMonetaView.txtPodajRundy.getText());
	    	Projekt.Projekt.RzutMonetaView.frame.setVisible(false);
	    	Projekt.Projekt.RzutMonetaView.frame2.setVisible(true);
	    }
	    if (e.getActionCommand().equals("Orzeł")) {
	    	int W2 = rnd.nextInt(2);
            rzut.rzut();
            int W = rzut.wynikRzutu;
	    	if(W == 1 && W2 == 1)
		    {
	    		Projekt.Projekt.RzutMonetaController.Pu2++;
	    		Projekt.Projekt.RzutMonetaController.Pu--;
	    		Projekt.Projekt.RzutMonetaView.frmess(2);
		    }
		    if(W == 0 && W2 == 0)
		    {
		    	Projekt.Projekt.RzutMonetaView.frmess(3);
		    }
		    if(W == 0 && W2 == 1)
		    {
		    	Projekt.Projekt.RzutMonetaController.Pu1++;
		    	Projekt.Projekt.RzutMonetaController.Pu--;
		    	Projekt.Projekt.RzutMonetaView.frmess(1);
		    }
		    if(W == 1 && W2 == 0)
		    {
		    	Projekt.Projekt.RzutMonetaView.frmess(3);
		    }
		    if(Projekt.Projekt.RzutMonetaController.Pu==0){
		    	Projekt.Projekt.RzutMonetaView.frame2.setVisible(false);
		    	Projekt.Projekt.RzutMonetaView.frmess(4);
		    }
	    }
	    if (e.getActionCommand().equals("Reszka")) {
	    	int W2 = rnd.nextInt(2);
            rzut.rzut();
            int W = rzut.wynikRzutu;
	    	if(W == 0 && W2 == 0)
		    {
	    		Projekt.Projekt.RzutMonetaController.Pu2++;
	    		Projekt.Projekt.RzutMonetaController.Pu--;
	    		Projekt.Projekt.RzutMonetaView.frmess(2);
		    }
		    if(W == 0 && W2 == 1)
		    {
		    	Projekt.Projekt.RzutMonetaView.frmess(3);
		    }
		    if(W == 1 && W2 == 0)
		    {
		    	Projekt.Projekt.RzutMonetaController.Pu1++;
		    	Projekt.Projekt.RzutMonetaController.Pu--;
		    	Projekt.Projekt.RzutMonetaView.frmess(1);
		    }
		    if(W == 1 && W2 == 1)
		    {
		    	Projekt.Projekt.RzutMonetaView.frmess(3);
		    }
		    if(Projekt.Projekt.RzutMonetaController.Pu==0){
		    	Projekt.Projekt.RzutMonetaView.frame2.setVisible(false);
		    	Projekt.Projekt.RzutMonetaView.frmess(4);
		    }
	    }
	    
	    if (e.getActionCommand().equals("Dalej")) {
	    	Projekt.Projekt.KPNController.Pu = Integer.parseInt(Projekt.Projekt.KPNView.txtPodajRundy.getText());
	    	Projekt.Projekt.KPNView.frame.setVisible(false);
	    	Projekt.Projekt.KPNView.frame2.setVisible(true);
	    }
	    if (e.getActionCommand().equals("Kamień")) {
	    	int W2 = rnd.nextInt(3);
	    	if(W2 == 0)
		    {
	    		Projekt.Projekt.KPNView.frmess(4);
		    }
		    if(W2 == 1)
		    {
		    	Projekt.Projekt.KPNController.Pu1++;
	    		Projekt.Projekt.KPNController.Pu--;
		    	Projekt.Projekt.KPNView.frmess(2);
		    }
		    if(W2 == 2)
		    {
		    	Projekt.Projekt.KPNController.Pu2++;
		    	Projekt.Projekt.KPNController.Pu--;
		    	Projekt.Projekt.KPNView.frmess(1);
		    }
		    if(Projekt.Projekt.KPNController.Pu==0){
		    	Projekt.Projekt.KPNView.frame2.setVisible(false);
		    	Projekt.Projekt.KPNView.frmess(5);
		    }
	    }
	    if (e.getActionCommand().equals("Nożyczki")) {
	    	int W2 = rnd.nextInt(3);
	    	if(W2 == 0)
		    {
	    		Projekt.Projekt.KPNController.Pu2++;
	    		Projekt.Projekt.KPNController.Pu--;
		    	Projekt.Projekt.KPNView.frmess(2);
		    }
		    if(W2 == 1)
		    {
		    	Projekt.Projekt.KPNView.frmess(4);
		    }
		    if(W2 == 2)
		    {
		    	Projekt.Projekt.KPNController.Pu1++;
		    	Projekt.Projekt.KPNController.Pu--;
		    	Projekt.Projekt.KPNView.frmess(3);
		    }
		    if(Projekt.Projekt.KPNController.Pu==0){
		    	Projekt.Projekt.KPNView.frame2.setVisible(false);
		    	Projekt.Projekt.KPNView.frmess(5);
		    }
	    }
	    if (e.getActionCommand().equals("Papier")) {
	    	int W2 = rnd.nextInt(3);
	    	if(W2 == 0)
		    {
	    		Projekt.Projekt.KPNController.Pu1++;
		    	Projekt.Projekt.KPNController.Pu--;
	    		Projekt.Projekt.KPNView.frmess(1);
		    }
		    if(W2 == 1)
		    {
		    	Projekt.Projekt.KPNController.Pu2++;
	    		Projekt.Projekt.KPNController.Pu--;
		    	Projekt.Projekt.KPNView.frmess(3);
		    }
		    if(W2 == 2)
		    {		    	
		    	Projekt.Projekt.KPNView.frmess(4);
		    }
		    if(Projekt.Projekt.KPNController.Pu==0){
		    	Projekt.Projekt.KPNView.frame2.setVisible(false);
		    	Projekt.Projekt.KPNView.frmess(5);
		    }
	    }
	  }
	}
