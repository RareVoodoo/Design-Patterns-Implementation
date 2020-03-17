package com.DesignPatterns.creational.abstractfactory.project;

import com.DesignPatterns.creational.abstractfactory.BackEndFacade;
import com.DesignPatterns.creational.abstractfactory.FrontEndFacade;
import com.DesignPatterns.creational.abstractfactory.ProjectTemplateFactory;
import com.DesignPatterns.creational.abstractfactory.SecurityFacade;
import com.DesignPatterns.creational.abstractfactory.financesystemtemplate.FinanceProjectTemplateFactory;

public class BankingProject {
    public static void main(String[] args) {
        ProjectTemplateFactory bankingProject = new FinanceProjectTemplateFactory();

        BackEndFacade bankingProjectBackend = bankingProject.getBackend();
        FrontEndFacade bankingProjectFrontend = bankingProject.getFrontend();
        SecurityFacade bankingProjectSecurity = bankingProject.getProjectSecurity();

        bankingProjectBackend.initializeBackend();
        bankingProjectFrontend.initializeFrontend();
        bankingProjectSecurity.initializeProjectSecurity();
    }
}
