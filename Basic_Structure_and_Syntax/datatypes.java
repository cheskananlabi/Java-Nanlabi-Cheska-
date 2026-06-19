package Basic_Structure_and_Syntax;

public class datatypes {
    public static void main(String[] args) {

        String Title = "Activity # 2 : Data Types";
        System.out.println(Title);

        String name = "Linda Marie Walker";
        System.out.println("Name: " + name);
        
        int age = 16;
        System.out.println("(Integer) Age: " + age);
        
        double LRN = 136635140361d;
        System.out.println("(Double) LRN: " + LRN);
        
        float Weight = 55.0f;
        System.out.println("(Float) Weight: " + Weight);

        short height = 153;
        System.out.println("(Short) Height" + height);

        byte subjectsPassed = 9;
        System.out.println("(Byte) Allowance: " + subjectsPassed);

        float generalAverage = 99.25f;
        System.out.println("(Float) General Average: " + generalAverage);

        long cpnumber = 639638672919L;
        System.out.println("(Long) Cellphone Number: " + cpnumber);

        Boolean honorStudent = true;
        System.out.println("(Boolean) Honor Student: "+ honorStudent); 
        
        float scientificFloat = 2.4e1f;
        System.out.println("(Scientific Float) BMI Result: " + scientificFloat);

        double scientificDouble = 9.8e2d;
        System.out.println("(Scientific Double) Mathematics Grade: " + scientificDouble);

        char bloodtype = 'O', Section = 'R', grading = 'A';
        System.out.println("(Char) Blood Type " + bloodtype);
        System.out.println("(Char) Blood Type " + Section);
        System.out.println("(Char) Blood Type " + grading);

        String firstName = "Linda", secondName = "Marie", lastName = "Walker";
        System.out.println("First Name: " + firstName);
        System.out.println("Middle Name: " + secondName);
        System.out.println("Last Name: " + lastName);

        var myIntvar = 153;
        System.out.println("(Integer Var) Height: " + myIntvar);

        var myDoublevar = 24.5d;
        System.out.println("(Double Var) BMI Result: " + myDoublevar);

        var myCharvar = 'A';
        System.out.println("(Char Var) Grade Result: " + myCharvar);

        var myBooleanvar = false;
        System.out.println("(Boolean Var) Honor Student: " + myBooleanvar);

        var myStringvar = "Programming";
        System.out.println("(String) Major Subject: " + myStringvar);
    }
}