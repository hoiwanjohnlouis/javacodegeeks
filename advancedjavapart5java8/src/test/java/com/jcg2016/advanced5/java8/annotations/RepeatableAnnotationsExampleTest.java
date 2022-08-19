package com.jcg2016.advanced5.java8.annotations;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class RepeatableAnnotationsExampleTest {
    @BeforeAll
    static void beforeAll() {
    }
    @AfterAll
    static void afterAll() {
    }
    @BeforeEach
    void setUp() {
    }
    @AfterEach
    void tearDown() {
    }

    /*
     *  work data
     */
    RepeatableAnnotationsExample testData;

    @Test
    void Test() {
        assertEquals( 0, 0 );
        assertNotEquals( 0, 1 );
    }
}