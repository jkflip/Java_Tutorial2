package com.company.BuildAHouse;

public class LivingRoom {

    private String name;
    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;
    private Ceiling ceiling;
    private Tv tv;
    private Sofa sofa;

    public LivingRoom(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, Tv tv, Sofa sofa) {
        this.name = name;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.ceiling = ceiling;
        this.tv = tv;
        this.sofa = sofa;
    }

    public Sofa getSofa() {
        return this.sofa;
    }

//    public Tv getTv() {
//        return tv;
//    }

    public void changeTvChannel(){  // Why is changeTvChannel method considered to be "static context" ?
        System.out.println("Living room: ChangeTvChannel");
        Tv.pressRemote();   // intelliJ insisted on making pressRemote() static
        //this.getTv().pressRemote();

    }
}
