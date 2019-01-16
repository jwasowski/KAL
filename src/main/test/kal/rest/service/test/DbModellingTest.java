package kal.rest.service.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Stream;

import org.junit.Test;

public class DbModellingTest {

	@Test
	public void test() {
		List<String> testList = Arrays.asList("yolo");
		List<String> testList2 = new ArrayList<>(Arrays.asList("yolo"));
		testList2.add("something");
		testList2.add("something");
		assertEquals(true,testList2.stream().anyMatch(string -> string.equals("something")));
	}

}
