package org.example;

public class Phone extends DevicePrototype {
    private String screen;
    private String camera;

    public Phone(String screen, String camera, String memory, String cpu, String gpu) {
        super(memory, cpu, gpu);
        this.screen = screen;
        this.camera = camera;
    }

    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }

    public String getCamera() {
        return camera;
    }

    public void setCamera(String camera) {
        this.camera = camera;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "screen='" + screen + '\'' +
                ", camera='" + camera + '\'' +
                ", memory='" + memory + '\'' +
                ", cpu='" + cpu + '\'' +
                ", gpu='" + gpu + '\'' +
                '}';
    }

    @Override
    public Phone copy() {
        return new Phone(this.screen, this.camera, this.memory, this.cpu, this.gpu);
    }
}
