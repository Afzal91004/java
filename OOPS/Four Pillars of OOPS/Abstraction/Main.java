class Person {
    String name;
    private int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Boolean canVote(){
        return age >=18;
    }

}

public class Main {
    public static void main(String[] args){
        Person afzal = new Person("Mohammed Afjal", 20);

        System.out.println(afzal.canVote()); // only this shown to the user the canVote not the implementation of this method
    }
}