import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.util.List;
import java.util.ArrayList;

public class CohortTest {
    Cohort cohortTest;
    Student student1 = new Student(22233, "Felicia");
    Student student2 = new Student(4455, "Gio");
    Student student3 = new Student(66754, "Kassandra");
    Student student4;




@Before
public void setUp (){
cohortTest = new Cohort();
    cohortTest.addStudent(student1);
    student1.addGrade(56);
    student1.addGrade(77);
    student2.addGrade(100);
    student2.addGrade(80);
    student3.addGrade(77);
    student3.addGrade(97);
}

@Test
    public void testAddStudent(){

    assertEquals(1, cohortTest.getStudents().size());
    assertNotEquals(0, cohortTest.getStudents().size());
}
@Test
    public void testGetStudents(){
    List<Student> test = new ArrayList<>();
    test.add(student1);
    test.add(student3);
    test.add(student4);

    cohortTest.addStudent(student3);
    cohortTest.addStudent(student4);

    assertEquals(test.size(), cohortTest.getStudents().size());
    assertEquals(test, cohortTest.getStudents());
    assertEquals(test.get(0), cohortTest.getStudents().get(0));

    cohortTest.addStudent(student2);
    assertNotEquals(test, cohortTest.getStudents());
}
@Test
    public void testGetCohortAverage(){
    cohortTest.addStudent(student2);

    assertEquals(78.25, cohortTest.getCohortAverage(), 0.1);
    assertNotEquals(78, cohortTest.getCohortAverage(), 0.1);

    cohortTest.addStudent(student3);

    assertNotEquals(81.5, cohortTest.getCohortAverage(), 0.1);
    assertEquals(81.2, cohortTest.getCohortAverage(), 0.1);

    }
    @Test
    public void testFindStudentById(){

    assertEquals("Felicia", cohortTest.findStudentById(22233));
    assertEquals("Student not found.", cohortTest.findStudentById(55555555));
    assertNotEquals("Felicia", cohortTest.findStudentById(66754));
    }

}

