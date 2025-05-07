public class Main2Mod {
                    
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
            
                // StudentCourse class to display courses and marks
                static class StudentCourse {
                    String studentName;
                    String[] courses;
                    int[] marks;
            
                    // Constructor to initialize student name, courses, and marks
                    public StudentCourse(String studentName, String[] courses, int[] marks) {
                        this.studentName = studentName;
                        this.courses = courses;
                        this.marks = marks;
                    }
            
                    // Method to display course information
                    public void displayCourseInfo() {
                        System.out.println("Courses and Marks for Student: " + studentName);
                        for (int i = 0; i < courses.length; i++) {
                            System.out.println(courses[i] + ": " + marks[i]);
                        }
                    }
                }
            
                // Main method to execute the program
                public static void main(String[] args) {
                    // Create Student object
                    Student student = new Student("John Doe", "15-08-2000");
                    student.displayStudentInfo();
            
                    // Create StudentCourse object
                    String[] courses = {"Math", "Physics", "Chemistry"};
                    int[] marks = {85, 90, 88};
                    StudentCourse studentCourse = new StudentCourse("John Doe", courses, marks);
                    studentCourse.displayCourseInfo();
                }
            }
