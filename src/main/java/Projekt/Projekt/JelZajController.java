package Projekt.Projekt;

public class JelZajController  implements Gra{
	
	private JelZaj model;
	private JelZajView view;
	static int Pu,Pu1=0,Pu2=0;
	
	public JelZajController(String imie, int poziom){
		this.model = new JelZaj(imie,poziom);
		this.view = new JelZajView();
	}
	
	public void gra() {
	    Pu1=0;
	    Pu2=0;
		view.frstart(model.getName());
		view.frwybor();
	}	
}
