package com.sophossolutions.tasks;

import com.sophossolutions.userinterfaces.PageCarShopping;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class DeleteProduct implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(PageCarShopping.REMOVE));
		
	}
	
	public static DeleteProduct deleteProduct() {
		return Tasks.instrumented(DeleteProduct.class);
	}

}
