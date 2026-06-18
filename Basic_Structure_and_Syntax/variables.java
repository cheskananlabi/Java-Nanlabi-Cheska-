package Basic_Structure_and_Syntax;

public class variables {
    public static void main(String[] args) {
        String name = "Cheska L. Nanlabi";
        int age = 16;
        final int score = 10; 
        String subject; // declaring variables without initializing
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Score: " + score);
        // score = 15; 
        age = 17; // reassigning the value of age
        System.out.println("Updated Age: " + age);

        float height = 5.3f;
        System.out.println("Height: " + height);

        char section = 'P';
        System.out.println("Section: " + section);

        boolean regularStudent = true;
        System.out.println("Regular Student" + regularStudent);
    }   
}