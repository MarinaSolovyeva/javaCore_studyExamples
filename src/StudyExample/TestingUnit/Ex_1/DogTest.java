package StudyExample.TestingUnit.Ex_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    @Test
    void getName() {
    }
    @Test
    void setName() {
        Dog dog = new Dog("Albert", 2);
        assertEquals("Albert", dog.getName());
    }

    @Test
    void getAge() {
    }

    @Test
    void setAge() {
    }
}