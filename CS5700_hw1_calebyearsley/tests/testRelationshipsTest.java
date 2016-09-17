import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Caleb on 9/16/2016.
 * Tests the methods that check for relationships
 */
public class testRelationshipsTest {
    @Test
    public void test1Name_valid() throws Exception {
        Person person1 = new Adult();
        Person person2 = new Adult();

        person1.setFirstName("Jim");
        person2.setFirstName("Jim");

        testRelationships testRel = new testRelationships(person1, person2);

        assertTrue(testRel.test1Name());
    }

    @Test
    public void test1Name_invalid() throws Exception {
        Person person1 = new Adult();
        Person person2 = new Adult();

        person1.setFirstName("Jim");
        person2.setFirstName("Frank");

        testRelationships testRel = new testRelationships(person1, person2);

        assertFalse(testRel.test1Name());
    }

    @Test
    public void test1Uniqiue_valid1() throws Exception {
        Person person1 = new Adult();
        Person person2 = new Adult();

        person1.setSocialSecurityNumber("123-12-1234");
        person2.setSocialSecurityNumber("123-12-1234");

        testRelationships testRel = new testRelationships(person1, person2);
        assertTrue(testRel.test1Uniqiue());
    }

    @Test
    public void test1Uniqiue_valid2() throws Exception {
        Person person1 = new Adult();
        Person person2 = new Adult();

        person1.setSocialSecurityNumber("123-12-1234");
        person2.setSocialSecurityNumber("432-43-4321");
        person1.setStateFileNumber("1423 434");
        person2.setStateFileNumber("1423 434");

        testRelationships testRel = new testRelationships(person1, person2);
        assertTrue(testRel.test1Uniqiue());
    }

    @Test
    public void test1Unique_invalid() throws Exception {
        Person person1 = new Adult();
        Person person2 = new Adult();

        person1.setSocialSecurityNumber("123-12-1234");
        person2.setSocialSecurityNumber("432-43-4321");
        person1.setStateFileNumber("1423 434");
        person2.setStateFileNumber("1423 142");

        testRelationships testRel = new testRelationships(person1, person2);
        assertFalse(testRel.test1Uniqiue());
    }

    @Test
    public void testGender_valid() throws Exception {
        Person person1 = new Child();
        Person person2 = new Child();

        person1.setGender("M");
        person2.setGender("M");

        testRelationships testRel = new testRelationships(person1, person2);
        assertTrue(testRel.testGender());
    }

    @Test
    public void testGender_invalid() throws Exception {
        Person person1 = new Child();
        Person person2 = new Child();

        person1.setGender("M");
        person2.setGender("F");

        testRelationships testRel = new testRelationships(person1, person2);
        assertFalse(testRel.testGender());
    }

}