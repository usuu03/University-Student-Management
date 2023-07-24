import java.util.ArrayList;

/**
 * The Course class represents a university course.
 * It holds relevant details of a course.
 *
 */
public class Course
{
    // the course title
    private String title;

    // the course convener
    private String convener;

    // students registered on this course
    private ArrayList<UG> students;

    //Constructor for the Course Class
    public Course(String title, String convener)
    {
        this.title = title;
        this.convener = convener;
        this.students = new ArrayList<>();
    }

    //Method that returns the title of this course
    public String getTitle()
    {                         
        return title;
    }
        
    // Method that enrolls a student onto the course, it takes a UG student
    // as a parameter
    public void enrol(UG student)
    {                               
        students.add(student);
    }

    // Method that returns a list of students in the course
    public ArrayList<UG> getStudents()
    {                                    
        return students;
    }

    // Method that returns the details of the course
    public String toString() {
        return title + " (Convener: " + convener + ")";
    }

    // Method that checks if another course is the same as this course. Two 
    // courses are the same if they have the same title. Takes an object as its
    // parameter. Returns true if the titles are the same
    public boolean equals(Object obj) {
        if (this == obj) return true;

        if (!(obj instanceof Course)) return false;

        Course c = (Course) obj;

        return title.equals(c.getTitle());
    }
}