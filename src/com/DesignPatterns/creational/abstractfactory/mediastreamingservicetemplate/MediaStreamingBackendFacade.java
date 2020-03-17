package com.DesignPatterns.creational.abstractfactory.mediastreamingservicetemplate;

import com.DesignPatterns.creational.abstractfactory.BackEndFacade;

public class MediaStreamingBackendFacade implements BackEndFacade {
    @Override
    public void initializeBackend() {
        System.out.println("Initializing streaming service backend");
    }
}
