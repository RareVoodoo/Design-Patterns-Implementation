package com.DesignPatterns.creational.abstractfactory.financesystemtemplate;

import com.DesignPatterns.creational.abstractfactory.BackEndFacade;
import com.DesignPatterns.creational.abstractfactory.FrontEndFacade;
import com.DesignPatterns.creational.abstractfactory.ProjectTemplateFactory;
import com.DesignPatterns.creational.abstractfactory.SecurityFacade;

public class FinanceProjectTemplateFactory implements ProjectTemplateFactory {
    @Override
    public FrontEndFacade getFrontend() {
        return new FinanceFrontendFacade();
    }

    @Override
    public BackEndFacade getBackend() {
        return new FinanceBackendFacade();
    }

    @Override
    public SecurityFacade getProjectSecurity() {
        return new FinanceSecurityFacade();
    }
}
