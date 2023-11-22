package org.example;

public interface Observer {
    void remove();
    void add(Consultant consultant);
    void notufy(Consultant consultant, String command);
    void changeStatus();
}
