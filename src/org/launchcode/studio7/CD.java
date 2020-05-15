package org.launchcode.studio7;

public class CD extends Disc implements OpticalDisk {

    // TODO: Implement your custom interface.
    public CD(String aName, int aTotalCapacity, int aCapacityUsed) {
        super(aName, aTotalCapacity, aCapacityUsed);
    }

    @Override
    public void spinDisc() {
        System.out.println("This spinny Disc is a CD");
    }

    @Override
    public void readData() {
        System.out.println("I hope you are ready to listen");
    }

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
