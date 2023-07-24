
/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student
{
    //The student's id
    private String id;
    
    //The students's name
    private String name;
    
    //The student's age
    private int age;
    //TODO
    
    public Student(String id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getId(){
        return id;
    }
    
    public String getName(){
        return name;
    }
    
    public int getAge(){
        return age;
    }
    
    /**
     * Return the student's details.     
     */
    @Override
    public String toString() {
        return id + ": " + name + ", aged " + age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;

        if (!(obj instanceof Student)) return false;

        Student student = (Student) obj;

        return getId().equals(student.getId());
    }

}
