package com.jcg2016.advanced3.java8;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class AnonymousClassTest {
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
    AnonymousClass testData;

    @Test
    void Test() {
        assertEquals( 0, 0 );
        assertNotEquals( 0, 1 );
    }
}