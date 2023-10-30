package org.example;

public class PersonalComputer extends DevicePrototype {
    private String outputDevice;
    private String inputDevice;

    public PersonalComputer(String outputDevice, String inputDevice, String memory, String cpu, String gpu) {
        super(memory, cpu, gpu);
        this.outputDevice = outputDevice;
        this.inputDevice = inputDevice;
    }

    public String getOutputDevice() {
        return outputDevice;
    }

    public void setOutputDevice(String outputDevice) {
        this.outputDevice = outputDevice;
    }

    public String getInputDevice() {
        return inputDevice;
    }

    public void setInputDevice(String inputDevice) {
        this.inputDevice = inputDevice;
    }

    @Override
    public String toString() {
        return "PersonalComputer{" +
                "outputDevice='" + outputDevice + '\'' +
                ", inputDevice='" + inputDevice + '\'' +
                ", memory='" + memory + '\'' +
                ", cpu='" + cpu + '\'' +
                ", gpu='" + gpu + '\'' +
                '}';
    }

    @Override
    public PersonalComputer copy() {
        return new PersonalComputer(this.outputDevice, this.inputDevice, this.memory, this.cpu, this.gpu);
    }
}
