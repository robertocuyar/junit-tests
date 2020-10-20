import org.junit.*;
import static org.junit.Assert.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class StudentTest {
    Student student1;
    Student student2;
    Student student3;
    Student student4;
    Student student5;


    @Before
    public void setUp(){
        student1 = new Student (12345, "Marco");
        student2 = new Student (45678, "Susie");
        student3 = new Student (7890, "Fred");
        student4 = new Student (44444, "Carmen");
        student5 = new Student (333, "Charles");


        student2.addGrade(99);
        student2.addGrade(89);
        student3.addGrade(77);
        student3.addGrade(98);
        student3.addGrade(100);
        student4.addGrade(88);
        student4.addGrade(78);
        student4.addGrade(88);
        student5.addGrade(90);
        student5.addGrade(88);
        student5.addGrade(78);
        student5.addGrade(90);

    }
    @Test
    public void testGetId(){
        assertEquals(12345, student1.getId());
        assertNotEquals(12345, student2.getId());
        assertEquals(7890, student3.getId());
    }
    @Test
    public void testGetName(){
        assertEquals("Marco", student1.getName());
        assertNotEquals("Fred", student2.getName());
        assertEquals("Fred", student3.getName());
    }
    @Test
    public void testAddGrade(){

        assertEquals(2, student2.getGrades().size());
        assertNotEquals(2, student3.getGrades().size());
        assertEquals(0, student1.getGrades().size());
    }
    @Test
    public void testGetGrades(){

        ArrayList<Integer> test = new ArrayList<>();
        ArrayList<Integer> test2 = new ArrayList<>();
        test2.add(99);
        test2.add(89);

        assertEquals(test, student1.getGrades());
        assertEquals(test2, student2.getGrades());
        assertNotEquals(test2, student3.getGrades());
    }
    @Test
    public void testGetGradeAverage(){

        assertEquals(94.0, student2.getGradeAverage(), 0);
        assertNotEquals(92, student3.getGradeAverage());
        assertEquals(Float.NaN, student1.getGradeAverage(), 0);
        assertEquals(91.7, student3.getGradeAverage(), 0.1);

    }
    @Test
    public void testUpdateGrade(){
        ArrayList<Integer> test = new ArrayList<>();
        test.add(77);
        test.add(98);
        test.add(99);

        ArrayList<Integer> test2 = new ArrayList<>();
        test2.add(70);
        test2.add(78);
        test2.add(88);

        assertNotEquals(test, student3.getGrades());
        assertEquals(test, student3.updateGrade(100, 99));
        assertNotEquals(test2, student4.getGrades());
        assertEquals(test2, student4.updateGrade(88, 70));

    }
    @Test
    public void testDeleteGrade(){
        ArrayList<Integer> test = new ArrayList<>();
        test.add(99);

        ArrayList<Integer> test2 = new ArrayList<>();
        test2.add(88);
        test2.add(78);
        test2.add(90);

        assertNotEquals(test, student2.getGrades());
        assertEquals(test, student2.deleteGrade(89));
        assertNotEquals(test2, student5.getGrades());
        assertEquals(test2, student5.deleteGrade(90));
    }

}
