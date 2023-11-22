package org.example;

import java.util.ArrayList;
import java.util.List;

public class Consultant implements Observer{
    public static List<Consultant> consultants=new ArrayList<>();
    private final String fullName;
    private String rang;
    private Boolean isActive;

    public Consultant(String fullName, String rang, Boolean isActive) {
        this.fullName = fullName;
        this.rang = rang;
        this.isActive = isActive;
        consultants.add(this);
    }

    @Override
    public void remove() {
        consultants.remove(this);
        notufy(this,"remove");
    }

    @Override
    public void add(Consultant consultant) {
        notufy(consultant,"add");
    }
    @Override
    public void changeStatus() {
        if(isActive){
            isActive=false;
            notufy(this,"false");
        }else {
            isActive=true;
            notufy(this,"true");
        }
    }
    @Override
    public void notufy(Consultant consultant,String command) {
        for(Consultant c:consultants){
            if(!c.equals(consultant)){
                switch (command) {
                    case "remove" -> System.out.println("Consultant: " + c.fullName
                            + " get, that consultant " + consultant.fullName + " is dismissed");
                case "add" -> System.out.println("Consultant: " + c.fullName
                        + " get, that consultant " + consultant.fullName + " is hiring");
                    case "true" -> System.out.println("Consultant: " + c.fullName
                            + " get, that consultant " + consultant.fullName + " took over the shift");
                    case "false" -> System.out.println("Consultant: " + c.fullName
                            + " get, that consultant " + consultant.fullName + " finished the shift");
                }
            }

        }
    }
}
