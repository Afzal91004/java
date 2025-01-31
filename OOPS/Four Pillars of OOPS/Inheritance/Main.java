class Car {
    private int numberOfWheels;
    private int bhp;
    private int cc;

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public int getBhp() {
        return bhp;
    }

    public void setBhp(int bhp) {
        this.bhp = bhp;
    }

    private String make;
    private String modelName;

    public void startEngine(){
        System.out.println("Car Engine is started");
    }

    public void run(){
        System.out.println("Car Engine is running");
    }

    public void stop(){
        System.out.println("Car Engine is stopped");
    }

    Car(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }
}

class Honda extends Car {
    Honda(int num) {
        super(num);
    }
    public void startEngine(){
        System.out.println("Some Magic is going on and honda engine os running");
    };
}

class Tesla extends Car {
    public void autoPilot(){
        System.out.println("Your car is in autopilot mode");
    }

    Tesla(){
        super(8);
    }
}

public class Main {
    public static void main(String[] args) {
        Honda city = new Honda(4);
        Tesla hero = new Tesla();

        city.startEngine();
        city.run();
        city.stop();

        hero.startEngine();
        hero.autoPilot();

        hero.setNumberOfWheels(6);

        System.out.println(hero.getNumberOfWheels());
    }
}