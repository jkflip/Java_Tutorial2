package com.company.BuildingAComputer;
// To be up of several Java classes: Case, Monitor & Motherboard
public class Computer {

    private Case pcCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public Computer(Case pcCase, Monitor monitor, Motherboard motherboard) {
        this.pcCase = pcCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    // Un/comment where necessary
    // Part 1: Getters declared as public i.e. accessible to main class
    // =====================================================================
//    public Case getPcCase() {
//        return pcCase;
//    }
//
//    public Monitor getMonitor() {
//        return monitor;
//    }
//
//    public Motherboard getMotherboard() {
//        return motherboard;
//    }

    // Part 2: Getters declared as private i.e. NOT accessible to main class
    // =====================================================================
    // Now that the getters are inaccessible by the main class, we create 2 methods to access the object used in composition
    public void powerUp(){
        pcCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo(){
        //getMonitor().drawPixelAt(1200,50,"yellow");
        monitor.drawPixelAt(1200,50,"yellow");
    }

    // The privated getters here can be commented out for part 2 - the point here is just to let everyone know that they
    // are not publicly accessible
//    private Case getPcCase() {
//        return pcCase;
//    }
//
//    private Monitor getMonitor() {
//        return monitor;
//    }
//
//    private Motherboard getMotherboard() {
//        return motherboard;
//    }

}
