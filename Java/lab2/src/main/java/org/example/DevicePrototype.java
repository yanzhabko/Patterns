package org.example;

public abstract class DevicePrototype {
    protected String memory;
    protected String cpu;
    protected String gpu;

    public DevicePrototype(String memory, String cpu, String gpu) {
        this.memory = memory;
        this.cpu = cpu;
        this.gpu = gpu;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public abstract DevicePrototype copy();
}
