package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.

        // TODO: Call each CD and DVD method to verify that they work as expected.
    CD cd = new CD("Now", 15, 7);
    DVD dvd = new DVD("Star Wars", 44, 15);

    cd.spinDisc();
    cd.readData();
System.out.println("\r\n");
    dvd.spinDisc();
    dvd.readData();
    }
}
