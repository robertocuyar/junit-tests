import org.junit.*;
import static org.junit.Assert.*;

public class StudentTest {
    Student student1;
    Student student2;
    Student student3;

    @Before
    public void setUp(){
        student1 = new Student (12345, "Marco");
        student2 = new Student (45678, "Susie");
        student3 = new Student (7890, "Fred");
    }
    @Test
    public void testGetId(){
        assertEquals(student1.getId(),12345);
        assertNotEquals(student2.getId(),12345);
        assertEquals(student3.getId(),7890);
    }
    @Test
    public void testGetName(){
        assertEquals(student1.getName(), "Marco");
        assertNotEquals(student2.getName(), "Fred");
        assertEquals(student3.getName(), "Fred");
    }

}
