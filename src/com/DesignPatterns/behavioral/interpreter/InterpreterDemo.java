package com.DesignPatterns.behavioral.interpreter;

public class InterpreterDemo {

    public static final String DEFAULT_USER_LIGHT_MOUNT = "Mount";
    public static final String DEFAULT_USER_LIGHT_PROFILE = "Profile";


    public static final String DEFAULT_USER_LIGHT_TEMPLATE_HOLDER = "Holder";
    public static final String DEFAULT_USER_LIGHT_TEMPLATE_DIFFUSER = "diffuser";
    public static void main(String[] args) {



        Expression lightAddition = checkLightAddition();
        Expression lightTemplate = checkLightTemplate();

        System.out.println("User uses default light addition: " + lightAddition.interpret("Mount"));
        System.out.println("Does uses default light template:" + lightTemplate.interpret("Holder diffuser"));
    }

    public static Expression checkLightAddition(){
        Expression java = new TerminalExpression(DEFAULT_USER_LIGHT_PROFILE);
        Expression javaCore = new TerminalExpression(DEFAULT_USER_LIGHT_MOUNT);

        return new OrExpression(java,javaCore);
    }

    public static Expression checkLightTemplate(){
        Expression java = new TerminalExpression(DEFAULT_USER_LIGHT_TEMPLATE_HOLDER);
        Expression spring = new TerminalExpression(DEFAULT_USER_LIGHT_TEMPLATE_DIFFUSER);

        return new AndExpression(java,spring);
    }
}
