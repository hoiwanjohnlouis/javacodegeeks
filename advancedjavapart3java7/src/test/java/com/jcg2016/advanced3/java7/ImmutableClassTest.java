package com.jcg2016.advanced3.java7;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class ImmutableClassTest {
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
    ImmutableClass testData;

    @Test
    void Test() {
        assertEquals( 0, 0 );
        assertNotEquals( 0, 1 );
    }
}