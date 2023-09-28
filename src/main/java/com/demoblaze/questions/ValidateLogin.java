package com.demoblaze.questions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.demoblaze.ui.HomeUI.LBL_WELCOME;

public class ValidateLogin implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {

        WebElementFacade label = LBL_WELCOME.resolveFor(actor);

        return label.isVisible();
    }

    public static ValidateLogin validate() {return new ValidateLogin();}


}
