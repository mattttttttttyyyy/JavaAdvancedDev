package org.example.exc1;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SorterTest {
    Sorter sorter = new Sorter();

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void testLetters(){
        List<String> randomLetters = new ArrayList<>(List.of("a", "b", "c", "d", "E", "B") );


    }

    @After
    public void tearDown() throws Exception {
    }
}