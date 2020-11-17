package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Folder root = new Folder("Root");
        Folder f1 = new Folder("Structure");
        Folder f2 = new Folder("Comportement");
        Folder f3 = new Folder("Creation");

        root.addComponent(f1);
        root.addComponent(f2);
        root.addComponent(f3);

        f1.addComponent(new File("Composite"));
        f1.addComponent(new File("Decorator"));
        f2.addComponent(new File("Strategy"));
        f3.addComponent(new File("Singleton"));
        f3.addComponent(new File("Builder"));


        f1.addComponent(new Folder("fSt1"));
        Folder fSt1 = (Folder) f1.getComponent("fSt1");
        fSt1.addComponent(new File("Composite version 2"));
        root.view();



    }
}
