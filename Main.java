
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    public static void run(){
        System.out.print("\u000C");

        UG su1 = new UG("01", "Tom" , 20);
        UG su2 = new UG("02", "Rob" , 19);
        UG su3 = new UG("03", "Sara" , 21);
        UG su4 = new UG("08", "Liza" , 18);

        PG sp1 = new PG("04", "Ben" , 24, "Dr Smith");
        PG sp2 = new PG("05", "Ling" , 23, "Dr Jones");
        PG sp3 = new PG("06", "Mary" , 25, "Dr Smith");
        PG sp4 = new PG("08", "Alice" , 22, "Dr Clark");

        Course cp1 = new Course("Computing", "Dr Meng");
        Course cp2 = new Course("Multimedia", "Prof Muller");
        Course cp3 = new Course("Web design", "Prof Hodgson");

        Database db1 = new Database();

        db1.addStudent(su1);
        db1.addStudent(su2);
        db1.addStudent(su3);
        // db1.addStudent(su4);
        // db1.addStudent(su5);
        db1.addStudent(sp1);
        db1.addStudent(sp2);
        db1.addStudent(sp3);
        db1.addStudent(sp4);

        db1.addCourse(cp1);
        db1.addCourse(cp2);
        db1.addCourse(cp3);

        System.out.println();

        db1.printAllStudents();

        db1.registration(su1, "Computing");
        db1.registration(su2, "Multimedia");
        db1.registration(su3, "Web design");

        db1.registration(su1, "Computing");

        db1.registration(su4, "Web design");
        db1.registration(su3, "Cooking");
        db1.registration(su4, "Cooking");

        System.out.println();

        System.out.println();
        System.out.println(db1.findCourse("Computing"));
        System.out.println(db1.studentsSupervisedBy("Dr Smith"));
        System.out.println(db1.studentsSupervisedBy("Dr Clark"));
        System.out.println();
        //testing 1d equals:
        System.out.println();
        System.out.println(su1.equals(su1));
        System.out.println(su1.equals(su2));
        System.out.println(su1.equals(sp2));
        System.out.println(sp2.equals(su3));
        System.out.println(sp2.equals(sp2));
        System.out.println(su4.equals(sp4));
        System.out.println();
        // testing challenge:
        db1.printStatsOfStudents(UG.class);
        db1.printStatsOfStudents(PG.class);

    }

    public static void main(String[] args) {
        Main main = new Main();
        run();
    }
    
}
