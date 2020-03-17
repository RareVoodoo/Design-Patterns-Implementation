package com.DesignPatterns.creational.abstractfactory.mediastreamingservicetemplate;

import com.DesignPatterns.creational.abstractfactory.FrontEndFacade;

public class MediaStreamingFrontendFacade implements FrontEndFacade {
    @Override
    public void initializeFrontend() {
        System.out.println("Initializing light,simple, mannered UI");
    }
}
