public class StudentBioData {

    public static void main(String[] args) {
        // Printing bio-data using primitive data types
        String name= "Dileep";
       int age= 25;
        Float height= 5.9f;
        Double weight = 75.0;
        System.out.println("Name:"+ name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height +"feet");
        System.out.println("Weight: "+weight);

        // Creating an array to store 10 student names
        String[] studentNames = new String[10];

        // Assigning names to the array
        studentNames[0] = "Dileep N";
        studentNames[1] = "Venkatesh Daggubati";
        studentNames[2] = "Prabhas Uppalapati";
        studentNames[3] = "David Miller";
        studentNames[4] = "Rohit Sharma";
        studentNames[5] = "Virat Kohli";
        studentNames[6] = "Prudhvi D";
        studentNames[7] = "James Anderson";
        studentNames[8] = "Straw Hat";
        studentNames[9] = "Bumrah Jasprit";

        // Printing the first and last name of the students in the array
        System.out.println("\nFirst and Last Names of Students:");
        System.out.println("First Name: " + studentNames[1].split(" ")[0]);
        System.out.println("Last Name: " + studentNames[1].split(" ")[1]);

    }
}

