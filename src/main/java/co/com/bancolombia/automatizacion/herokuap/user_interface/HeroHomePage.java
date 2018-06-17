package co.com.bancolombia.automatizacion.herokuap.user_interface;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.serenitybdd.screenplay.targets.Target;

@DefaultUrl("http://automatizacion.herokuapp.com/")
public class HeroHomePage extends PageObject {
	public static final Target LINK_INICIAL = Target.the("Link Inicial").locatedBy("//a[contains(@href,'http://automatizacion.herokuapp.com/pperez/')]");

}
