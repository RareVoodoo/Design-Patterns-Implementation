package com.DesignPatterns.behavioral.iterator;

public class MainConsole {
    private static final String serverDescription = "Central Server 1-245-3DS";
    private static final String computerName = "SER-32-OE32";
    private static final long maxWorkflowMemory = 768768532;
    private static final long [] defaultIpPorts =  {1560, 1567, 1578, 1581, 1583 , 1589};


    public static void main(String[] args) {
        Cluster cluster = new Cluster(serverDescription,computerName,maxWorkflowMemory, defaultIpPorts);
        Iterator iterator = cluster.getIterator();

        while(iterator.hasNext()){
            cluster.printPortNumber(iterator.next());
        }

    }

}
