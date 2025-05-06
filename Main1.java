public class Main1 {

    // Student class to display name and age based on date of birth
    static class Student {
        String name;
        String dob; // Date of Birth in DD-MM-YYYY format

        // Constructor to initialize the student name and date of birth
        public Student(String name, String dob) {
            this.name = name;
            this.dob = dob;
        }

        // Method to display student details
        public void displayStudentInfo() {
            System.out.println("Student Name: " + name);
            System.out.println("Date of Birth: " + dob);
        }
    }

    // Main method to execute the program
    public static void main(String[] args) {
        // Create Student object
        Student student = new Student("John Doe", "15-08-2000");
        student.displayStudentInfo();
    }
}
