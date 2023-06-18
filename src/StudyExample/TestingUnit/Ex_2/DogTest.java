package StudyExample.TestingUnit.Ex_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DogTest {

    @Test
    void getName() {}

   @Test
    void setName() {
        Dog dog = new Dog("Albert", 2);
        dog.setName("Roman");
        assertEquals("Albert", dog.getName());
    }

    @Test
    void setNameIfEmpty() {
        Dog dog = new Dog("", 2);
        dog.setName("Roman");
        assertEquals("Roman", dog.getName());
    }

    @Test
    void getAge() {
    }

    @Test
    void setAge() {
    }
}