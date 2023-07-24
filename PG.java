/**
 * The PG class represents postgraduate student in a university.
 * It holds relevant details of a postgraduate student.
 *
 */
public class PG extends Student 
{
    // the student's supervisor
    private String supervisor;
    
    //Constructor of the PG Clas
    public PG(String id, String name, int age, String supervisor)
    {
        super(id, name, age);
        
        this.supervisor = supervisor;
    }
        
    // Method that returns the student's supervisor
    public String getSupervisor()
    {
        return supervisor;
    }

    @Override
    public String toString() {
        String details = super.toString();
        details += ", Supervisor: " + supervisor;
        return details;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;

        return obj instanceof PG;
    }

}