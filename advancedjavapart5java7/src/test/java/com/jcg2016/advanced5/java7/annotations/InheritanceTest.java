package com.jcg2016.advanced5.java7.annotations;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class InheritanceTest {
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
    Inheritance testData;

    @Test
    void Test() {
        assertEquals( 0, 0 );
        assertNotEquals( 0, 1 );
    }
}