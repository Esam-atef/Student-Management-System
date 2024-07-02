public class Student
{
    private String name;
    private String studentId;
    private String email;
    private String dateOfBirth;

    public Student() {
    }

    public Student(String name, String studentId, String email, String dateOfBirth)
    {
        this.name = name;
        this.studentId = studentId;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setStudentId(String studentId)
    {
        this.studentId = studentId;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public void setDateOfBirth(String dateOfBirth)
    {
        this.dateOfBirth = dateOfBirth;
    }

    public String getName()
    {
        return name;
    }

    public String getStudentId()
    {
        return studentId;
    }

    public String getEmail()
    {
        return email;
    }

    public String getDateOfBirth()
    {
        return dateOfBirth;
    }
    public void display()
    {
        System.out.println("Name: " + name);
        System.out.println("Student ID: " + studentId);
        System.out.println("Email: " + email);
        System.out.println("Date of Birth: " + dateOfBirth);
    }
}
