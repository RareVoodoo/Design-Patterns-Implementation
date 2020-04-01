package com.DesignPatterns.behavioral.visitor;

import java.util.ArrayList;

public class SessionStorage extends AccountElement {
    private ArrayList<AccountElement> websiteAccountElement = new ArrayList<>();


    public void addSession(AccountElement accountElement) {
        this.websiteAccountElement.add(accountElement);
    }

    public SessionStorage(String sessionUuid) {
        super(sessionUuid);
    }


    @Override
    public void accept(Visitor v) {
        for (AccountElement acc : this.websiteAccountElement) {
            acc.accept(v);
        }
    }
}
