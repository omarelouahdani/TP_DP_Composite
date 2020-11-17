package com.company;

import java.util.ArrayList;
import java.util.List;

public class Folder extends Composent {
    private List<Composent> composentList=new ArrayList<>();
    public Folder(String name) {
        super(name);
    }

    @Override
    public void view() {
        String tab = indentation();
        System.out.println(tab+"Folder :"+name);
            for(Composent c : composentList){
                c.view();
            }
    }

    public Composent addComponent(Composent composent){
        composent.level = this.level+1;
        this.composentList.add(composent);
        return composent;
    }

    public Composent getComponent(String name){
        for(Composent c : composentList){
            if(c.name.equals(name)) return c;
        }
        return null;
    }

}
