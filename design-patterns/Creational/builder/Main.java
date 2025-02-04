class Car {

    public String color;
    public String make;
    public String model;
  
    public int cc;
    public int price;
    public int bhp;
    public int torqe;
  
    void startCar() {
      System.out.println(make + " " + model + " is now started");
    }
  }
  
  class CarBuilder {
  
    public static Car buildMyCar(
      String make,
      String model,
      String color,
      int cc,
      int price,
      int bhp
    ) {
      Car car = new Car();
      car.make = make;
      car.model = model;
      car.color = color;
      car.cc = cc;
      car.price = price;
      car.bhp = bhp;
      return car;
    }
  }
  
  public class Main {
  
    public static void main(String args[]) {
      Car kia = CarBuilder.buildMyCar("Kia", "Seltos", "White", 1999, 2000, 100);
      kia.startCar();
    }
  }
  