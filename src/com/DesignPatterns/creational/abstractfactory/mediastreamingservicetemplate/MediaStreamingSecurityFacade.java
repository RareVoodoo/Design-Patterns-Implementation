package com.DesignPatterns.creational.abstractfactory.mediastreamingservicetemplate;

import com.DesignPatterns.creational.abstractfactory.SecurityFacade;

public class MediaStreamingSecurityFacade implements SecurityFacade {
    @Override
    public void initializeProjectSecurity() {
        System.out.println("Initializing steaming security layer");
    }
}
