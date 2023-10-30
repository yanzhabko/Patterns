package org.example;

public class Laptop extends DevicePrototype {
    private String screen;
    private String ports;
    public Laptop(String screen, String ports, String memory, String cpu, String gpu) {
        super(memory, cpu, gpu);
        this.screen = screen;
        this.ports = ports;
    }

    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }

    public String getPorts() {
        return ports;
    }

    public void setPorts(String ports) {
        this.ports = ports;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "screen='" + screen + '\'' +
                ", ports='" + ports + '\'' +
                ", memory='" + memory + '\'' +
                ", cpu='" + cpu + '\'' +
                ", gpu='" + gpu + '\'' +
                '}';
    }

    @Override
    public Laptop copy() {
        return new Laptop(this.screen, this.ports, this.memory, this.cpu, this.gpu);
    }
}
