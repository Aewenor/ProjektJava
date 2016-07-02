package Projekt.Projekt;

import org.junit.Test;
import org.junit.Assert;
import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase
{
   
	@Test
    public void test1()
    {
    	Fabryka f = new Fabryka();
    	RzutMonetaController f1 = (RzutMonetaController) f.zrobGre(1, 1, "janusz");
    	RzutMonetaController f2 = new RzutMonetaController("janusz",1);  	
        Assert.assertEquals(f1.model.getName(),f2.model.getName());
        Assert.assertEquals(f1.model.getPoziom(),f2.model.getPoziom());
    }
    
	@Test
    public void test2()
    {
    	KPNController p = new KPNController("janusz",1);
    	Assert.assertEquals(p instanceof Gra, true);
    }
	
	@Test
	public void test3(){
		Singleton obj = Singleton.getInstance();
		Assert.assertEquals(obj instanceof Singleton, true);
	}
	
	@Test
	public void test4(){
		Reakcje r = new Reakcje();
		Assert.assertEquals(r instanceof ReakcjaWygr, true);
	}
	
	@Test
	public void test5(){
		KPN r = new KPN("romek",0);
		Assert.assertEquals(r instanceof ReakcjaWygr, false);
	}
	
	@Test
	public void test6(){
		KPN r = new KPN("romek",0);
		String str = "janusz";
		Assert.assertNotEquals(r.getName(), str);
	}
}
