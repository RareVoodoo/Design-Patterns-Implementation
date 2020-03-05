package com.DesignPatterns.behavioral.iterator;

public class Cluster implements Container {


    private String serverDescription;
    private String computerName;
    private long maxWorkflowMemory;
    private long[] ipPorts= {};

    public Cluster(String serverDescription, String computerName, long maxWorkflowMemory, long[] ipPorts) {
        this.serverDescription = serverDescription;
        this.computerName = computerName;
        this.maxWorkflowMemory = maxWorkflowMemory;
        this.ipPorts = ipPorts;
    }

    public void printPortNumber(Object port){
        System.out.println(port);
    }

    @Override
    public Iterator getIterator() {
        return new ClusterParameterIterator();
    }

    private class ClusterParameterIterator implements Iterator{

        int index;
        @Override
        public boolean hasNext() {
            return index < ipPorts.length;
        }

        @Override
        public Object next() {
            return ipPorts[index++];
        }
    }
}
