public class Courses
{
    private String courseName;
    private String courseCode;
    private int courseCredit;

    public Courses()
    {

    }
    public Courses(String courseName, String courseCode, int courseCredit)
    {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.courseCredit = courseCredit;
    }

    public String getCourseName()
    {
        return courseName;
    }

    public void setCourseName(String courseName)
    {
        this.courseName = courseName;
    }

    public String getCourseCode()
    {
        return courseCode;
    }

    public void setCourseCode(String courseCode)
    {
        this.courseCode = courseCode;
    }

    public int getCourseCredit()
    {
        return courseCredit;
    }

    public void setCourseCredit(int courseCredit)
    {
        this.courseCredit = courseCredit;
    }
    public void displayCourseDetails()
    {
        System.out.println("Details of Course : ");
        System.out.println("Course ID: " + courseCode);
        System.out.println("Course Name: " + courseName);
        System.out.println("Credits: " + courseCredit);
    }
}
