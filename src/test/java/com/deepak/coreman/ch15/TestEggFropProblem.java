package com.deepak.coreman.ch15;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestEggFropProblem {

	private EggDropProblemSolver eggDropProblemSolver;

	@Before
	public void setup() {
		eggDropProblemSolver = new EggDropProblemSolver();
	}

	@Test
	public void drop1EggFrom0floor() throws Exception {
        int minWay = eggDropProblemSolver.drop(1,0);
        assertEquals(0, minWay);
        
	}

	@Test
	public void drop1EggFrom1floor() throws Exception {
        int minWay = eggDropProblemSolver.drop(1,1);
        assertEquals(1, minWay);
	}
	
	@Test
	public void drop1EggFrom3floor() throws Exception {
        int minWay = eggDropProblemSolver.drop(1,3);
        assertEquals(3, minWay);
	}
	
	@Test
	public void drop1EggFrom10floor() throws Exception {
        int minWay = eggDropProblemSolver.drop(1,10);
        assertEquals(10, minWay);
	}
	
	@Test
	public void drop2EggFrom10floor() throws Exception {
        int minWay = eggDropProblemSolver.drop(2,10);
        assertEquals(4, minWay);
	}
	
	@Test
	public void drop2EggFrom6floor() throws Exception {
        int minWay = eggDropProblemSolver.drop(2,6);
        assertEquals(3, minWay);
	}
	
	
	
}
