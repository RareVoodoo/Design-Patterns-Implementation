package com.DesignPatterns.creational.abstractfactory;

public interface ProjectTemplateFactory {
    FrontEndFacade getFrontend();
    BackEndFacade getBackend();
    SecurityFacade getProjectSecurity();
}
