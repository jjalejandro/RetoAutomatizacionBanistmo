package com.sophossolutions.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class PageCarShopping {
	public static final Target REMOVE = Target.the("remover producto").locatedBy("(//*[@class='remove'])[1]");
	public static final Target PRICE = Target.the("precio")
			.locatedBy("(//*[@class='woocommerce-Price-amount amount'])[5]");
}
