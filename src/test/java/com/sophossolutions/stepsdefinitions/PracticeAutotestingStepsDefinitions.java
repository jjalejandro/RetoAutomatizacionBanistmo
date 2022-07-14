package com.sophossolutions.stepsdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import com.sophossolutions.questions.GetText;
import com.sophossolutions.tasks.AddProductsToShoppingCard;
import com.sophossolutions.tasks.DeleteProduct;
import com.sophossolutions.userinterfaces.PageCarShopping;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class PracticeAutotestingStepsDefinitions {

	@Before
	public void setup() {
		setTheStage(new OnlineCast());
	}

	@Given("^Desea navegar a la pagina con la siguiente url \"([^\"]*)\"$")
	public void deseaNavegarALaPaginaConLaSiguienteUrl(String url) {
		theActorCalled("usuario").wasAbleTo(Open.url(url));
	}

	@When("^Quiere comprar los productos con los nombres de \"([^\"]*)\" y \"([^\"]*)\"$")
	public void quiereComprarLosProductosConLosNombresDeY(String producto1, String producto2) {
		theActorInTheSpotlight().attemptsTo(AddProductsToShoppingCard.addProductsToShoppingCard(producto1, producto2));
	}

	@When("^Elimina un producto del carrito de compras$")
	public void eliminaUnProductoDelCarritoDeCompras() {
		theActorInTheSpotlight().attemptsTo(DeleteProduct.deleteProduct());
	}

	@Then("^Valida que el precio total es menor a \"([^\"]*)\"$")
	public void validaQueElPrecioTotalEsMenorA(String precio) {
		theActorInTheSpotlight().should(seeThat(GetText.ofField(PageCarShopping.PRICE), equalTo(precio)));
	}
}
