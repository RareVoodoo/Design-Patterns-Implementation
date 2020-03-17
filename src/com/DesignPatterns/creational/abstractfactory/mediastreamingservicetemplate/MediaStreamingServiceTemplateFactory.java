package com.DesignPatterns.creational.abstractfactory.mediastreamingservicetemplate;

import com.DesignPatterns.creational.abstractfactory.BackEndFacade;
import com.DesignPatterns.creational.abstractfactory.FrontEndFacade;
import com.DesignPatterns.creational.abstractfactory.ProjectTemplateFactory;
import com.DesignPatterns.creational.abstractfactory.SecurityFacade;

public class MediaStreamingServiceTemplateFactory implements ProjectTemplateFactory {
    @Override
    public FrontEndFacade getFrontend() {
        return new MediaStreamingFrontendFacade();
    }

    @Override
    public BackEndFacade getBackend() {
        return new MediaStreamingBackendFacade();
    }

    @Override
    public SecurityFacade getProjectSecurity() {
        return new MediaStreamingSecurityFacade();
    }
}
