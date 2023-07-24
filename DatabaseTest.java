

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class DatabaseTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class DatabaseTest
{
    private Database db;
    private Student st1, st2;
    
    /**
     * Default constructor for test class DatabaseTest
     */
    public DatabaseTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        db = new Database();
        st1 = new Student("ug1", "Sam", 20);
        st2 = new Student("ug2", "Ben", 18);
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
    /*
     * Testing addUGStudent method
     */
    @Test
    public void shouldAddNewStudent() {

        db.addStudent(st1);
        db.addStudent(st2);        

        db.printAllStudents();
        db.printStatsOfStudents(UG.class);

        assertEquals(db.getTotalStudents(), 2);
    }

    @Test
    public void shouldNotAddNull() {

        db.addStudent(null);
        
        assertEquals(db.getTotalStudents(), 0);
    }

    @Test
    public void shouldNotAddDuplicateStudent() {

        db.addStudent(st1);
        db.addStudent(st1);
        
        assertEquals(db.getTotalStudents(), 1);
    }

    @Test
    public void shouldNotAddStudentWithTheSameID() {

        db.addStudent(st1);
        
        String id = st1.getId();
        db.addStudent(new Student(id, "test", 0));
        
        assertEquals(db.getTotalStudents(), 1);
    }
}
