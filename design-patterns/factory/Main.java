import java.util.Scanner;

interface IVehicle {
    String type = null;
    void deliver();
}

class Truck implements IVehicle {
    public String type;

    Truck(String type) {
        this.type = type;
    }

    @Override
    public void deliver() {
        System.out.println("Delivering via "+ this.type);
    }
}

class Ship implements IVehicle {
    public String type;

    Ship(String type){
        this.type = type;
    }

    @Override
    public void deliver() {
        System.out.println("Delivering via "+this.type);
    }
}

class Airplane implements IVehicle {
    String type;

    Airplane(String type) {
        this.type = type;
    }

    @Override
    public void deliver() {
        System.out.println("Delivering via "+type);
    }
}

class VehicleFactory {

    public static IVehicle getVehicle(int load) {
        IVehicle object = null;

        if(load <= 100){
            object = new Truck("Truck");
        } else if (load > 100 && load <= 300){
            object = new Airplane("Airplane");
        } else {
            object = new Ship("Ship");
        }
        return object;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter load(in kgs)");
        int load = sc.nextInt();

        IVehicle vehicle = VehicleFactory.getVehicle(load);
        vehicle.deliver();
    }
}