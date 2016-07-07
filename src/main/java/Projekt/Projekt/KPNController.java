package Projekt.Projekt;

public class KPNController implements Gra{

	private KPN model;
	private KPNView view;
	static int Pu,Pu1,Pu2;
	
	public KPNController(String imie, int poziom){
		this.model = new KPN(imie,poziom);
		this.view = new KPNView();
	}
	
	public void gra() {
		Pu1=0;
		Pu2=0;
		view.frstart(model.getName());
		view.frwybor();
    }
}
