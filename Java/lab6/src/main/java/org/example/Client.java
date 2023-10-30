package org.example;
public class Client {
    public String name;
    public String lastName;
    private Consultant consultant;

    public Client(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public void getConsultant(ConsultantPool consultantPool) {
        if (consultant == null) {
            consultant = consultantPool.getConsultant();
            if (consultant == null) {
                System.out.println("I haven't consultant");
            } else {
                System.out.println("I have consultant");
            }
        } else {
            System.out.println("I don't want a second consultant");
        }
    }
    public void returnConsultant(ConsultantPool consultantPool) {
        if (consultant == null) {
            System.out.println("I haven't consultant, I can't return");
        } else {
            consultantPool.returnConsultant(consultant);
            consultant = null;
            System.out.println("I return consultant");
        }
    }
}
