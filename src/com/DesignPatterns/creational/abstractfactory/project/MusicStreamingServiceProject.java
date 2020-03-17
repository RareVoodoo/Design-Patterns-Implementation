package com.DesignPatterns.creational.abstractfactory.project;

import com.DesignPatterns.creational.abstractfactory.BackEndFacade;
import com.DesignPatterns.creational.abstractfactory.FrontEndFacade;
import com.DesignPatterns.creational.abstractfactory.ProjectTemplateFactory;
import com.DesignPatterns.creational.abstractfactory.SecurityFacade;
import com.DesignPatterns.creational.abstractfactory.mediastreamingservicetemplate.MediaStreamingServiceTemplateFactory;

public class MusicStreamingServiceProject {
    public static void main(String[] args) {
        ProjectTemplateFactory streamingService = new MediaStreamingServiceTemplateFactory();

        BackEndFacade mediaStreamingServiceBackend = streamingService.getBackend();
        FrontEndFacade mediaStreamingServiceFrontend = streamingService.getFrontend();
        SecurityFacade mediaStreamingServiceSecurity = streamingService.getProjectSecurity();

        mediaStreamingServiceBackend.initializeBackend();
        mediaStreamingServiceFrontend.initializeFrontend();
        mediaStreamingServiceSecurity.initializeProjectSecurity();
    }
}
