package cse12pa2student;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.NoSuchElementException;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;



@RunWith(Parameterized.class)
public class TestLists {

	public static Collection<Object[]> LISTNUMS =
			Arrays.asList(new Object[][] { {"Linked"}, {"Array"} });
	private String listType;

	public TestLists(String listType) {
		super();
		this.listType = listType;
	}

	@Parameterized.Parameters(name = "{0}List")
	public static Collection<Object[]> bags() {
		return LISTNUMS;
	}

	private StringList makeList(String[] contents) {
		switch(this.listType) {
		case "Linked": return new LinkedSL(contents);
		case "Array": return new ArraySL(contents);
		}
		return null;
	}

  // Don't change code above this line, it ensures the autograder works as
  // expected


  // This is a sample test; you can keep it, change it, or remove it as you like.
  // Note that it uses the method `assertArrayEquals`, which you should use to
  // test equality of arrays in this PA.
	@Test
	public void testSimpleToArray() {
		String[] input = {"a", "b", "c"};
		StringList s = makeList(input);
		
		assertArrayEquals(input, s.toArray());
	}
	
	@Test
	public void testIsEmpty() {
		String[] input = {"This", "is", "a", "test"};
		StringList s = makeList(input);
		
		assertFalse(s.isEmpty());
	}
	
	@Test
	public void testDuplicateTransformer() {
		String[] input1 = {"rob", "ron", "bob", "bon"};
		String[] transformed = {"robrob", "ronron", "bobbob", "bonbon"};
		StringList s = makeList(input1);
		DuplicateStringTransformer trans = new DuplicateStringTransformer();
		s.transformAll(trans);
		
		assertArrayEquals(s.toArray(), transformed);
	}
	
	@Test
	public void testReduceTransformer() {
		String[] input = {"Big Long", "Strings", "Will be reduced", "to",
				"mere characters"};
		StringList s = makeList(input);
		String[] transformed = {"B", "S", "W", "t", "m" };
		ReductionTransformer rt = new ReductionTransformer();
		s.transformAll(rt);
		
		assertArrayEquals(s.toArray(), transformed);
	}
	
	@Test
	public void testShortWordChooser() {
		String[] input = { "a", "too long", "not me", "b", "eek!",
				"c", "d"};
		StringList s = makeList(input);
		String[] chosen = {"a", "b", "c", "d"};
		ShortWordChooser swc = new ShortWordChooser();
		s.chooseAll(swc);
		
		assertArrayEquals(s.toArray(), chosen);
	}

	@Test
	public void testWordWithVowelChooser() {
		String[] input = { "apple sauce", "n0 v0w3ls", "vowels!", "n6mb3rs", 
				"88469261", "bwnedx"};
		StringList s = makeList(input);
		String[] chosen = {"apple sauce", "vowels!", "bwnedx" };
		WordWithVowelChooser wwvc = new WordWithVowelChooser();
		s.chooseAll(wwvc);
		
		assertArrayEquals(s.toArray(), chosen);
	}
	
	@Test
	public void testToArrayWithNull() {
		String[] input = {null, "a", "b", null, "c"};
		StringList s = makeList(input);
		String[] noNull = {"a", "b", "c"};
		assertArrayEquals(s.toArray(), noNull);
	}
	
	@Test
	public void testReductionTransformerWithNull() {
		String[] input = {"Wow", "I sure do hope", null, "won't mess", 
				"this up"};
		StringList s = makeList(input);
		String[] transformed = {"W", "I", "w", "t"};
		ReductionTransformer rt = new ReductionTransformer();
		s.transformAll(rt);
		assertArrayEquals(s.toArray(), transformed);
	}
	

}
