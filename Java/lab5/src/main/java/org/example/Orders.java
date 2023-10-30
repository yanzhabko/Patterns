package org.example;
public  class Orders {
    public String name;
    public String lastName;
    public String typeOfDevice;
    public String cpu;
    public String gpu;
    public String rom;
    public String ssd;
    public String hhd;
    public String power;
    public String motherboard;

    public Orders(String name,
                  String lastName,
                  String typeOfDevice,
                  String cpu,
                  String gpu,
                  String rom,
                  String ssd,
                  String hhd,
                  String power,
                  String motherboard) {
        this.name = name;
        this.lastName = lastName;
        this.typeOfDevice = typeOfDevice;
        this.cpu = cpu;
        this.gpu = gpu;
        this.rom = rom;
        this.ssd = ssd;
        this.hhd = hhd;
        this.power = power;
        this.motherboard = motherboard;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", typeOfDevice='" + typeOfDevice + '\'' +
                ", cpu='" + cpu + '\'' +
                ", gpu='" + gpu + '\'' +
                ", rom='" + rom + '\'' +
                ", ssd='" + ssd + '\'' +
                ", hhd='" + hhd + '\'' +
                ", power='" + power + '\'' +
                ", motherboard='" + motherboard + '\'' +
                '}';
    }

    public static OrdersBuilder builder(){
        return new OrdersBuilder();
    }

    public static class OrdersBuilder{
        public String name;
        public String lastName;
        public String typeOfDevice;
        public String cpu;
        public String gpu;
        public String rom;
        public String ssd;
        public String hhd;
        public String power;
        public String motherboard;

        public OrdersBuilder name(String name){
            this.name=name;
            return this;
        }
        public OrdersBuilder lastName(String lastName){
            this.lastName=lastName;
            return this;
        }
        public OrdersBuilder typeOfDevice(String typeOfDevice){
            this.typeOfDevice=typeOfDevice;
            return this;
        }
        public OrdersBuilder cpu(String cpu){
            this.cpu=cpu;
            return this;
        }
        public OrdersBuilder gpu(String gpu){
            this.gpu=gpu;
            return this;
        }
        public OrdersBuilder rom(String rom){
            this.rom=rom;
            return this;
        }
        public OrdersBuilder ssd(String ssd){
            this.ssd=ssd;
            return this;
        }
        public OrdersBuilder hhd(String hhd){
            this.hhd=hhd;
            return this;
        }
        public OrdersBuilder power(String power){
            this.power=power;
            return this;
        }
        public OrdersBuilder motherboard(String motherboard){
            this.motherboard=motherboard;
            return this;
        }

        public Orders build(){
            return new Orders(this.name,
                    this.lastName,
                    this.typeOfDevice,
                    this.cpu,
                    this.gpu,
                    this.rom,
                    this.ssd,
                    this.hhd,
                    this.power,
                    this.motherboard);
        }
    }
}
