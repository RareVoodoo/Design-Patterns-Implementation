package com.DesignPatterns.creational.abstractfactory.financesystemtemplate;

import com.DesignPatterns.creational.abstractfactory.BackEndFacade;
import com.DesignPatterns.creational.abstractfactory.FrontEndFacade;

public class FinanceFrontendFacade implements FrontEndFacade {

    @Override
    public void initializeFrontend() {
        System.out.println("Initializing of a strict, enterprise UI");
    }
}
