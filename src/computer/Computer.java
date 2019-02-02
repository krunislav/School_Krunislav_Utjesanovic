/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computer;

/**
 *
 * @author qa-popodne
 */
public class Computer {

    private String operatingSystem;
    private double processTact;
    private double memory;
    private int hardDrive;

    public void setOperatingSystem(String setCustomOperatingSystem) {
        this.operatingSystem = setCustomOperatingSystem;
    }

    public void setProcessTact(double setCustomProccesTact) {
        this.processTact = setCustomProccesTact;
    }

    public void setMemory(Double setCustomMemory) {
        this.memory = setCustomMemory;
    }

    public void setHardDrive(int setCustomHardDrive) {
        this.hardDrive = setCustomHardDrive;
    }

    public String getOperatingSystem() {
        return this.operatingSystem;
    }

    public double getProcessTact() {
        return this.processTact;
    }

    public double getMemory() {
        return this.memory;
    }

    public int getHardDrive() {
        return this.hardDrive;
    }

    public Computer() {
        this.operatingSystem = "Linux";
        this.processTact = 2.4;
        this.memory = 16;
        this.hardDrive = 500;

    }

    public Computer(String operatingSystem, double processTact, double memory, int hardDrive) {
        this.operatingSystem = operatingSystem;
        this.processTact = processTact;
        this.memory = memory;
        this.hardDrive = hardDrive;

    }

    public void info() {
        System.out.println("Operating system: " + this.operatingSystem);
        System.out.println("Process Tact: " + this.processTact + " GHz");
        System.out.println("Memory: " + this.memory + " GB");
        System.out.println("hard drive: " + this.hardDrive + " GB");
        System.out.println();

    }
}
