package org.example;

import java.util.ArrayList;
import java.util.List;


public class Pc implements Component{
    List<Component> components=new ArrayList<>();
    public void addComponent(Component component){
        components.add(component);
    }
    public void removeComponent(Component component){
        if(!components.isEmpty()){
            components.remove(component);
        }else {
            System.out.println("no component to repair");
        }
    }
    @Override
    public void repair() {
        System.out.println("\nWe repair component");
        for (Component component : components) {
            component.repair();
        }
    }

}
