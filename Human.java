public class Human {
    private String firstName, lastName;
    private int age;

    public Human(String fN, String lN, int a){
        firstName = fN;
        lastName = lN;
        age = a;
    }

    public void printInfo(){
        System.out.println("My name is " + firstName);
        System.out.println("My last name is " + lastName);
        System.out.println("I am " + age + " years old");
    }
}
