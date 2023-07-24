import java.util.ArrayList;
import java.util.HashMap;

/**
 * The class Database provide facility to store
 * all registrations made by students on courses.
 *
 * @author Yang He
 * @version 2022
 */
public class Database {

    // The maximum number of courses 
    // for an undergraduate student
    public static final int MAX_NUM_COURSES = 4;

    private final ArrayList<Student> studentList;
    private final ArrayList<Course> courseList;

    /**
     * Construct an empty Database.
     */
    //Constructor for the Database Class
    public Database() {
        studentList = new ArrayList<>();
        courseList = new ArrayList<>();
    }

    /**
     * Add a new student.
     *
     * @param student The student to be added.
     */
    //Method to add to the database takes a student as its parameter.
    public void addStudent(Student student){
        if (student == null) {
            System.out.println("** Student list should not contain null values");
            return;
        }

        if(studentList.contains(student)){
            System.out.println("** Student list should not contain any duplicates");
        }

        studentList.add(student);

    }

    
    //Method to print all the students
    public void printAllStudents() {

        System.out.println("-----------------------------");
        System.out.println("All students in the database:");
        for (Student stn : studentList) {
            System.out.println(stn);
        }

    }

    /**
     * Print the total number of all students
     * 
     */
    //Method that returns the total number of students
    public int getTotalStudents()
    {
        return studentList.size();
    }

    
    // Method that finds a course with the given title in the database takes a 
    // a string title as a parameter. If not, it will return null
    public Course findCourse(String title) {
        for(Course crs: courseList){
            if(crs.getTitle().equals(title)){
                return crs;
            }
        }
        return null;
    }
    
    
    // Method that returns an ArrayList of students supervised by the given 
    // supervisor. If the supervisor does not have any students, it returns null
    public ArrayList<PG> studentsSupervisedBy(String supervisor) {
        ArrayList<PG> pgList = new ArrayList<>();
        ArrayList<PG> svList = new ArrayList<>();
        for(Student student : studentList){
            if(student instanceof PG){
                pgList.add((PG) student);
            }
        }
        for(PG pg : pgList){
            if(pg.getSupervisor().equals(supervisor)){
                svList.add(pg);
                return svList;
            }
        }
        return null;
    }

     
    // Method that registers a student and takes a student and the course title
    // as its parameters.
    public void registration(Student student, String courseTitle) {
        Course crs = findCourse(courseTitle);
        if(student != null && courseTitle != null ){
            if(studentList.contains(student) && courseList.contains(crs)){
                if(student instanceof UG){
                    UG ug = (UG) student;
                    if(ug.getCourses().size() < MAX_NUM_COURSES){
                        if(!crs.getStudents().contains(ug)){
                            ug.registerOn(crs);
                            crs.enrol(ug);
                            System.out.println("Student successfully " +
                                "registered on the course");
                        } 
                    }
                    else{
                        System.out.println("Student registered in too many " +
                            "courses");
                    }
                }
                else{
                    System.out.println("Student is a postgraduate, therefore " +
                        "they cannot be registered");
                }
            }
            else{
                System.out.println("Student/Course cannot be found in the " +
                    "database");

            }
        }
        else{
            System.out.println("Student/Course is not valid");
        }

    }

    
    //Method that ets the stats of the students depending on the type. 
    // The parameter can beeither a UG or PG class. 
    // Returns A Hashmaps of stats for the given type
    // of students which are the total number and their average age.
    public HashMap<String, Integer> getStats(Class type) {

        HashMap<String,Integer> stats = new HashMap<>();
        stats.put("Total", 0);  
        stats.put("Mean", 0);

        ArrayList<UG> ugList = new ArrayList<>();
        ArrayList<PG> pgList = new ArrayList<>();
        int edad = 0;
        int avrAge = 0;
        
        for(Student st : studentList){
            if (type == UG.class && st instanceof UG){
                ugList.add((UG) st);
                edad = edad + st.getAge();
                avrAge = edad / ugList.size();
                stats.put("Total", ugList.size());
                stats.put("Mean", avrAge);
            }
            else if (type == PG.class && st instanceof PG) {
                pgList.add((PG) st);
                edad = edad + st.getAge();
                avrAge = edad / pgList.size();
                stats.put("Total", pgList.size());
                stats.put("Mean", avrAge);
            }
        }

        return stats;
    }

    //////////////////////////////////////////////////////////////////////////
    // Prints outs the stats of the students depending on the type
    public void printStatsOfStudents(Class type) {
        HashMap<String, Integer> stats = getStats(type);

        System.out.println("-----------------------------");
        System.out.println("Stats of " + type.getName() + " students:");
        System.out.println("Total number: " + stats.get("Total")); 
        System.out.println("Average age: " + stats.get("Mean"));

    }

    
    //Method that adds a new course and takes the course to be added as its
    //parameter.
    public void addCourse(Course course) {
        if (course == null) {
            System.out.println("** Course list should not contain null values");
            return;
        }

        if (courseList.contains(course)) {
            System.out.println("** Course list should not contain any duplicates");
            return;
        }

        courseList.add(course);
    }

    public int getTotalCoures()
    {
        return courseList.size();
    }
}

