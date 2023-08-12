package PseudoCodes;
class Person {
    String name1="first";
    String name;

    Person() {
        System.out.println("In Person class ");
    }

    void print() {
        System.out.println("Person name");
    }
}


public class DMD1_DynamicMethodDispatch  extends Person {
    int id;
    String name1="Second";

    DMD1_DynamicMethodDispatch() {
        System.out.println("In Student class");
    }

    void print() {
        System.out.println("student name");
    }

    public static void main(String args[]) {
        Person person = null;

        person = new DMD1_DynamicMethodDispatch();
        person.name = "John";
        person.print();
        System.out.println(person.name1);

    }
}


