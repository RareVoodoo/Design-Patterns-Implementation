package com.DesignPatterns.creational.abstractfactory.financesystemtemplate;

import com.DesignPatterns.creational.abstractfactory.SecurityFacade;

public class FinanceSecurityFacade implements SecurityFacade {
    @Override
    public void initializeProjectSecurity() {
        System.out.println("Initializing strong finance security layer");
    }
}
