package com.DesignPatterns.creational.abstractfactory.financesystemtemplate;

import com.DesignPatterns.creational.abstractfactory.BackEndFacade;

public class FinanceBackendFacade implements BackEndFacade {
    @Override
    public void initializeBackend() {
        System.out.println("Initializing strong finance backend");
    }
}
