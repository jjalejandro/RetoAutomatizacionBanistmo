package com.sophossolutions.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class PageHomePracticeAutotesting {

	public static final Target BUTTON_READ_MORE = Target.the("boton agregar al carrito").locatedBy("(//h3[text()='{0}']//following::a)[1]");
	public static final Target SHOPPING_CAR = Target.the("ver carrito de compras").locatedBy("//span[@class='amount']");
	public static final Target CARD_REFERENCE = Target.the("tarjeta de referencia").locatedBy("//*[text()='Android Quick Start Guide']");
	public static final Target BUTTON1 = Target.the("compra 1").locatedBy("(//*[text()='Add to basket'])[1]");
	public static final Target BUTTON2 = Target.the("compra 2").locatedBy("(//*[text()='Add to basket'])[2]");
	public static final Target LOADING1 = Target.the("Espera").locatedBy("(//*[text()='View Basket'])[1]");
	public static final Target LOADING2 = Target.the("Espera").locatedBy("(//*[text()='View Basket'])[2]");
	
	
}
