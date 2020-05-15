package org.launchcode.studio7;

public abstract class Disc {
    private String name;
    private int totalCapacity;
    private int capacityUsed;

    public Disc(String aName, int aTotalCapacity, int aCapacityUsed) {
        name = aName;
        totalCapacity = aTotalCapacity;
        capacityUsed = aCapacityUsed;
    }

    private int checkCapacity(int dataWritten) {
        if (totalCapacity < dataWritten) {
            return totalCapacity;
        }
        return dataWritten;

    }

    private int spaceLeft() {
        return totalCapacity = capacityUsed;
    }

    public String diskInfo() {
        String info = String.format("Disk name: %s", name);

        return info;
    }
}