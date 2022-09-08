public class Student {
    String surname;
    String firstName;
    char middleInitial;
    String dateOfBirth;
    int studentNumber;
    String studentEmailAddress;
    boolean iAmAwesome;

    public void sayMyStudentNumber() {
        System.out.println("Hello, I am "+ firstName +" "+ middleInitial +". "+ surname +"! My student number is "+ studentNumber +".");
    }

    public void sayMyEmailAddress() {
        System.out.println("My school email address ís "+ studentEmailAddress +".");
    }

    public void amIAwesome() {
        System.out.println("Am I awesome? "+ iAmAwesome +"!");
    }

    public Student(String sun, String fn, char mi, String dob, int sn, String sea, boolean iam) {
    surname = sun;
    firstName = fn;
    middleInitial = mi;
    dateOfBirth = dob;
    studentNumber = sn;
    studentEmailAddress = sea;
    iAmAwesome = iam;
    }
}
