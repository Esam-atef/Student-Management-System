import java.util.HashMap;
public class Grade
{
    private HashMap<String,HashMap<String,Double>>grades;
    public Grade()
    {
        grades=new HashMap<>();
    }
    public void addGrade(String studentId,String courseId,Double grade)
    {
        grades.putIfAbsent(studentId, new HashMap<>());
        grades.get(studentId).put(courseId,grade);
        System.out.println("Grade added/updated for student " + studentId + " in course " + courseId + ": " + grade);
    }
    public void getGrade(String studentId)
    {
        if (grades.containsKey(studentId))
        {
            System.out.println("Grades for student " + studentId + ": " + grades.get(studentId));
        }
        else
        {
            System.out.println("No grades found for student " + studentId);
        }
    }
}
