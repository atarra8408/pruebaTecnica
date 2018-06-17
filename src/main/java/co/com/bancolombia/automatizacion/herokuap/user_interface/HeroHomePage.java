package co.com.bancolombia.automatizacion.herokuap.user_interface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://automatizacion.herokuapp.com/")
public class HeroHomePage extends PageObject {
	public static final Target LINK_INICIAL = Target.the("Link Inicial").locatedBy("//a[contains(@href,'{0}')]");
	public static final Target DESKTOP_MENU = Target.the("Desktop Menu").locatedBy("//a[contains(@href,'{0}')]");
}
