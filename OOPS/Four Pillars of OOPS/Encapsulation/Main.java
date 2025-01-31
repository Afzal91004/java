class Bike {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getYol() {
        return yol;
    }

    public void setYol(int yol) {
        this.yol = yol;
    }

    private String name;
    private String company;
    private int yol; //Date of Launch

//    we can bind properties and methods to the class of an object
}

public class Main {
    public static void main(String[] args) {
         Bike Freedom = new Bike();

         Freedom.setName("Freedom");
         Freedom.setCompany("Bajaj");
         Freedom.setYol(2024);

        System.out.println("Bike Name: "+Freedom.getName()+" | Company Name: "+Freedom.getCompany()+" | Year of Launch: "+Freedom.getYol());
    }
}