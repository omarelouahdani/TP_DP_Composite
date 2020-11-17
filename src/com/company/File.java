package com.company;

public class File extends Composent{


    public File(String name) {
        super(name);
    }
    @Override
    public void view() {
        String tab = indentation();
        System.out.println(tab+"File : "+name);
    }

}
