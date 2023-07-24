import java.util.ArrayList;

/**
 * The UG class represents undergraduate student in a university.
 * It holds relevant details of a student.
 *
 */
public class UG extends Student
{

    private ArrayList<Course> courses;

    //Constructor for the UG Class
    public UG(String id, String name, int age)
    {
        super(id, name, age);
        courses = new ArrayList<Course>();
    }

    //Method that returns the courses taken by the student
    public ArrayList<Course> getCourses()
    {
        return courses;
    }

    //Method that registers a students on a course. Takes a course aws its 
    //parameter
    public void registerOn(Course course) {
        courses.add(course);
    }

    @Override
    public String toString() {
        String details = super.toString();
        details += ", Courses: " + courses; // Assuming Course class has a proper toString method
        return details;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;

        return obj instanceof UG;
    }
}