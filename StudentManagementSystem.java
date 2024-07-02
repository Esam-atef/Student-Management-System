public class StudentManagementSystem
{
    public static void main(String[] args)
    {
        Student student1 = new Student("Essam", "202201928", "alice@example.com", "2000-01-01");
        Student student2 = new Student("Ali", "202201875", "bob@example.com", "2001-02-02");

        student1.display();
        student2.display();

        Courses course1 = new Courses("Mathematics", "CSY101", 3);
        Courses course2 = new Courses("Physics", "MSF210", 4);

        course1.displayCourseDetails();
        course2.displayCourseDetails();

        Registration registration = new Registration();
        registration.registerStudentInCourse("202201928", "CSY101");
        registration.registerStudentInCourse("202201928", "MSF210");
        registration.registerStudentInCourse("202201875", "CSY101");
        registration.registerStudentInCourse("202201875", "MSF210");

        registration.getRegisteredCourse("202201928");
        registration.getRegisteredCourse("202201875");

        Grade grade = new Grade();
        grade.addGrade("202201928", "CSY101", 85.5);
        grade.addGrade("202201928", "MSF210", 90.0);
        grade.addGrade("202201875", "CSY101", 78.0);

        grade.getGrade("202201928");
        grade.getGrade("202201875");

    }
}
