package com.company;

public abstract class Composent {
    protected String name;
    protected int level;
    public Composent(String name){
        this.name = name;
    }
    public abstract void view();
    public String indentation(){
        String str ="";
        for (int i=0;i<level;i++){
            str += "\t";
        }
        return str;
    }

}
