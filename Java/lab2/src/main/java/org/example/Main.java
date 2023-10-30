//package org.example;
//
//public class Main {
//    public static void main(String[] args) {
//        Phone phone=new Phone("6dym","48Mpix","256Gb","SnapDragon",null);
//        Laptop laptop=new Laptop("24dym","USB, HDMI","2Tb SSD","i7-7300","3060TI");
//        PersonalComputer personalComputer=new PersonalComputer("Screen, Headphones",
//                "Mouse, Keyboard, Microphonr","500Gb SSD, 1TB HHd",
//                "i3-7300","RX 550");
//        Phone copyPhone=phone.copy();
//        Laptop copyLaptop=laptop.copy();
//        PersonalComputer copyPersonalComputer=personalComputer.copy();
//        copyPhone.setCamera("64Mpix");
//        copyPhone.setScreen("5dym");
//        copyPhone.setMemory("64Gb");
//        copyLaptop.setGpu("2070Ti");
//        copyLaptop.setGpu("I5-7200");
//        copyLaptop.setScreen("22Dym");
//        copyPersonalComputer.setGpu("2060Ti");
//        copyPersonalComputer.setCpu("I9-7200");
//        copyPersonalComputer.setInputDivace("Mouse, Keyboard");
//        System.out.println();
//        System.out.println("початкові елементи");
//        System.out.println("телефон: "+phone);
//        System.out.println("ноут: "+laptop);
//        System.out.println("комп: "+personalComputer);
//        System.out.println();
//        System.out.println("копійовані та змінені елементи");
//        System.out.println("телефон: "+copyPhone);
//        System.out.println("ноут: "+copyLaptop);
//        System.out.println("комп: "+copyPersonalComputer);
//    }
//}
package org.example;

public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone("6dym", "48Mpix", "256Gb", "SnapDragon", null);
        Laptop laptop = new Laptop("24dym", "USB, HDMI", "2Tb SSD", "i7-7300", "3060TI");
        PersonalComputer personalComputer = new PersonalComputer("Screen, Headphones",
                "Mouse, Keyboard, Microphonr", "500Gb SSD, 1TB HHd",
                "i3-7300", "RX 550");

        Phone copyPhone = phone.copy();
        Laptop copyLaptop = laptop.copy();
        PersonalComputer copyPersonalComputer = personalComputer.copy();

        copyPhone.setCamera("64Mpix");
        copyPhone.setScreen("5dym");
        copyPhone.setMemory("64Gb");
        copyLaptop.setGpu("2070Ti");
        copyLaptop.setCpu("I5-7200");
        copyLaptop.setScreen("22Dym");
        copyPersonalComputer.setGpu("2060Ti");
        copyPersonalComputer.setCpu("I9-7200");
        copyPersonalComputer.setInputDevice("Mouse, Keyboard");

        System.out.println();
        System.out.println("початкові елементи");
        System.out.println("телефон: " + phone);
        System.out.println("ноутбук: " + laptop);
        System.out.println("комп'ютер: " + personalComputer);
        System.out.println();
        System.out.println("копійовані та змінені елементи");
        System.out.println("телефон: " + copyPhone);
        System.out.println("ноутбук: " + copyLaptop);
        System.out.println("комп'ютер: " + copyPersonalComputer);
    }
}

