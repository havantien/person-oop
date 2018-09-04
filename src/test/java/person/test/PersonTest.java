package person.test;

import org.junit.Test;
import person.Person;
import person.Staff;
import person.Student;
import static junit.framework.TestCase.assertEquals;

public class PersonTest {
    @Test
    public void testClassPerson() {
        Person person = new Person("Jonh", "USA");
        String expect = "Person has name: John address: USA";
        String actual = person.toString();
        assertEquals(expect, actual);
    }

    @Test
    public void testClassStudent() {
        Student person = new Student("John", "USA", "A", 2, 2.0);
        String expect = "Student has name: John address: USA program: A year: 2 free 2.0";
        String actual = person.toString();
        assertEquals(expect, actual);

    }

    @Test
    public void testClassStaff(){
        Staff person = new Staff("John", "USA", "A", 2);
        String expect = "Staff has name: John address: USA school: A pay: 2.0";
        String actual = person.toString();
        assertEquals(expect, actual);
    }
}

