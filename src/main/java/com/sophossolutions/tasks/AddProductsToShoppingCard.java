package com.sophossolutions.tasks;

import com.sophossolutions.userinterfaces.PageHomePracticeAutotesting;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class AddProductsToShoppingCard implements Task {

	private final String producto1;
	private final String producto2;

	public AddProductsToShoppingCard(String producto1, String producto2) {
		this.producto1 = producto1;
		this.producto2 = producto2;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Scroll.to(PageHomePracticeAutotesting.CARD_REFERENCE),
				JavaScriptClick.on(PageHomePracticeAutotesting.BUTTON1), 
				JavaScriptClick.on(PageHomePracticeAutotesting.BUTTON2), 
				WaitUntil.the(PageHomePracticeAutotesting.LOADING2, isVisible()),
				JavaScriptClick.on(PageHomePracticeAutotesting.SHOPPING_CAR));

	}

	public static AddProductsToShoppingCard addProductsToShoppingCard(String producto1, String producto2) {
		return Tasks.instrumented(AddProductsToShoppingCard.class, producto1, producto2);
	}

}
