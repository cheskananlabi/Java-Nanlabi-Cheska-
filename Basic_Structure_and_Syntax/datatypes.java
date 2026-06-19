package Basic_Structure_and_Syntax;

public class datatypes {
    public static void main(String[] args) {

        String Title = "Activity # 2 : Data Types";
        System.out.println(Title);

        String name = "Cheska L. Nanlabi";
        System.out.println("Name: " + name);
        
        int age = 16;
        System.out.println("(Integer) Age: " + age);
        
        double LRN = 136635140361d;
        System.out.println("(Double) LRN: " + LRN);
        
        float Weight = 55.0f;
        System.out.println("(Float) Weight: " + Weight);

        byte Allowance = 100;
        System.out.println("(Byte) Allowance: " + Allowance);

        long cpnumber = 639638672919L;
        System.out.println("(Long) Cellphone Number: " + cpnumber);

        short zipcode = 1440;
        System.out.println("(Short) Zip Code" + zipcode);
 
        Boolean gender = true;
        System.out.println("(Boolean) Female: "+ gender); 
        
        float scientificFloat = 5.9e1f;
        System.out.println("Scientific Float: " + scientificFloat);

        double scientificDouble = 2.1e6d;
        System.out.println("Scientific Double: " + scientificDouble);

        char bloodtype1 = 'O', bloodtype2 = 'A', bloodtype3 = 'B';
        System.out.println("(Char) Blood Type " + bloodtype1);
        System.out.println("(Char) Blood Type " + bloodtype2);
        System.out.println("(Char) Blood Type " + bloodtype3);

        String firstName = "Cheska", middleName = "Limen", lastName = "Nanlabi";
        System.out.println("First Name: " + firstName);
        System.out.println("Middle Name: " + middleName);
        System.out.println("Last Name: " + lastName);

        var myIntvar = 153;
        System.out.println("(Integer Var) Height: " + myIntvar);

        var myDoublevar = 24.5d;
        System.out.println("(Double Var) BMI Result: " + myDoublevar);

        var myCharvar = 'A';
        System.out.println("(Char Var) Grade Result: " + myCharvar);

        var myBooleanvar = false;
        System.out.println("(Status) Teacher: " + myBooleanvar);

        var myStringvar = "I hate u";
        System.out.println("(String)" + myStringvar);
    }
}