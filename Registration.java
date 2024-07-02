import java.util.ArrayList;
import java.util.HashMap;
public class Registration
{
    private HashMap<String,ArrayList<String>>registration;

    public Registration()
    {
        registration=new HashMap<>();
    }
    public void registerStudentInCourse(String studentId, String courseId)
    {
        registration.putIfAbsent(studentId, new ArrayList<>());
        registration.get(studentId).add(courseId);
        System.out.println("Student " + studentId + " registered in course " + courseId);
    }
    public void unregisterStudentFromCourse(String studentId, String courseId)
    {
        if(registration.containsKey(studentId))
        {
        registration.get(studentId).remove(courseId);
        System.out.println("Student " + studentId + " unregistered in course " + courseId);
        }
        else
        {
            System.out.println("Student " + studentId + " not registered in course " + courseId);
        }
    }
    public void getRegisteredCourse(String studentId)
    {
        if(registration.containsKey(studentId))
        {
            System.out.println("Student " + studentId + " registered in course " + registration.get(studentId));
        }
        else
        {
            System.out.println("No courses found for student " + studentId);
        }
    }
}
