// Device Interface (Implementor)
interface Device {
    void switchOn();
    void switchOff();
    void setVolume(int num);
    void switchSource(String source);
}

// Concrete Implementation (TV)
class TV implements Device {
    private int volume = 10; // Default volume

    @Override
    public void switchOn() {
        System.out.println("TV is ON");
    }

    @Override
    public void switchOff() {
        System.out.println("TV is OFF");
    }

    @Override
    public void setVolume(int num) {
        volume = num;
        System.out.println("Volume is now: " + volume);
    }

    @Override
    public void switchSource(String source) {
        System.out.println("Source is now: " + source);
    }
}

// Abstraction (RemoteControl)
class RemoteControl {
    protected Device device;

    RemoteControl(Device device) {
        this.device = device;
    }

    public void turnVolUp() {
        System.out.println("Increasing volume...");
        device.setVolume(15);
    }

    public void turnVolDown() {
        System.out.println("Decreasing volume...");
        device.setVolume(5);
    }

    public void switchSource(String source) {
        device.switchSource(source);
    }
}

// Refined Abstraction (Advanced Remote)
class AdvancedRemote extends RemoteControl {
    AdvancedRemote(Device device) {
        super(device);
    }

    public void mute() {
        System.out.println("Muting TV...");
        device.setVolume(0);
    }
}

// Main Class
public class BridgeDesignPattern {
    public static void main(String[] args) {
        Device tv = new TV();
        RemoteControl rc = new RemoteControl(tv);
        AdvancedRemote arc = new AdvancedRemote(tv);

        tv.switchOn();
        rc.turnVolUp();
        rc.turnVolDown();
        rc.switchSource("HDMI");

        // Using Advanced Remote
        arc.mute();
        tv.switchOff();
    }
}
