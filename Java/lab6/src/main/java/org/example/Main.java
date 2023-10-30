package org.example;

public class Main {
    public static void main(String[] args) {
        Client client1 = new Client("Name1", "LastName1");
        Client client2 = new Client("Name2", "LastName2");
        Client client3 = new Client("Name3", "LastName3");
        Client client4 = new Client("Name4", "LastName4");

        ConsultantPool consultantPool = new ConsultantPool();

        client1.getConsultant(consultantPool);
        client1.returnConsultant(consultantPool);

        System.out.println(" ");
        client2.getConsultant(consultantPool);
        client3.getConsultant(consultantPool);
        client4.getConsultant(consultantPool);

        System.out.println(" ");

        client1.getConsultant(consultantPool);
        client1.returnConsultant(consultantPool);

        System.out.println(" ");

        client4.getConsultant(consultantPool);
    }
}
