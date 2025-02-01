import java.util.ArrayList;
import java.util.List;

class Person {
    private String fullName;

    public String getFullName(){
        return this.fullName;
    }

    public void setFullName(String fullName){
        this.fullName = fullName;
    }

    Person(String fullName){
        this.fullName = fullName;
    };
}

class Student extends Person {
    private int rollNumber;
    private List<Student> friends;
    public static int numberOfStudents = 0;

    public void setRollNumber(int rollNumber){
        this.rollNumber = rollNumber;
    }

    public List<Student> getFriends(){
        return friends;
    }

    public void addFriend(Student student) {
        this.friends.add(student);
        student.friends.add(this);
    }

    public void removeFriend(Student student){
        this.friends.remove(student);
        student.friends.remove(this);
    }

    public void removeAllFriends(){
        for (Student student: friends){
            student.friends.remove(this);
        }
        this.friends.clear();
    }

    public Boolean isFriendOf(Student student){
        return this.friends.contains(student);
    }

    public int getRollNumber(Student student) throws IllegalAccessException {
        if(this.isFriendOf(student)){
            return student.rollNumber;
        } else throw new IllegalAccessException(this + " is not a friend of "+student);
    }

    Student(String fullName, int rollNumber){
        super(fullName);
        this.rollNumber = rollNumber;
        this.friends = new ArrayList<>();
        numberOfStudents++;
    }

    @Override
    public String toString(){
        return this.getFullName();
    }
}

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        Student afzal = new Student("Mohammed Afjal Shaikh",221246);
        Student shadab = new Student("Mohammed Shadab Ali", 221217);
        Student arsalan = new Student("Arsalan Shaikh", 221241);
        Student lutuful = new Student("Lutuful Islam", 221200);

        afzal.addFriend(shadab);
        arsalan.addFriend(afzal);
        lutuful.addFriend(afzal);
        arsalan.addFriend(shadab);

        System.out.println(afzal.getFriends());

        afzal.removeFriend(lutuful);

        System.out.println(afzal.getFriends());
        System.out.println(arsalan.getFriends());

        try {
            System.out.println(lutuful.getRollNumber(shadab));
        } catch (IllegalAccessException e) {
            System.out.println(e);;
        }

        System.out.println(shadab.isFriendOf(afzal));

        afzal.removeAllFriends();
        System.out.println(afzal.getFriends());
        System.out.println(shadab.getFriends());

    }
}