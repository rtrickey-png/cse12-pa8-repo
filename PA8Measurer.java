package cse12pa2student;
import java.util.Arrays;

public class PA8Measurer {
	public static void main(String[] args){
		ShortWordChooser swc = new ShortWordChooser();
		
		String[] input1 = new String[100000000];
		Arrays.fill(input1, 0, 40000000, "sike");
		Arrays.fill(input1, 40000000, 40000005, "a");
		Arrays.fill(input1, 40000005, 100000000, "woohoo");
		
		ArraySL test1 = new ArraySL(input1);
		
		long start = System.currentTimeMillis();
		test1.chooseAll(swc);
		long end = System.currentTimeMillis();
		
		System.out.println(end - start);
		System.gc();
		//***************************************************//
		String[] input3 = new String[110000000];
		Arrays.fill(input3, 0, 50000000, "c");
		Arrays.fill(input3, 50000000, 110000000, "apple");
		ArraySL test3 = new ArraySL(input3);
		start = System.currentTimeMillis();
		test3.chooseAll(swc);
		end = System.currentTimeMillis();
		
		System.out.println(end - start);
		System.gc();

		//***************************************************//
		String[] input2 = new String[50000000];
		Arrays.fill(input2, 0, 49000000, "W");
		Arrays.fill(input2, 49000000, 50000000, "All I do is win");
		ArraySL test2 = new ArraySL(input2);
		start = System.currentTimeMillis();
		test2.chooseAll(swc);
		end = System.currentTimeMillis();
		
		System.out.println(end - start);
		System.gc();

		//***************************************************//
		String[] input4 = new String[55000000];
		Arrays.fill(input4, 0, 30000000, "cats are cool");
		Arrays.fill(input4, 30000000, 50000000, "facts");
		Arrays.fill(input4,  50000000, 55000000, "h");
		ArraySL test4 = new ArraySL(input4);
		start = System.currentTimeMillis();
		test4.chooseAll(swc);
		end = System.currentTimeMillis();
		
		System.out.println(end - start);
		System.gc();

		//***************************************************//
		String[] input5 = new String[30000000];
		input5[0] = "a";
		Arrays.fill(input5, 1, 29500000, "bcdefghijklmnop");
		Arrays.fill(input5, 29500000, 30000000, "q");
		ArraySL test5 = new ArraySL(input5);
		start = System.currentTimeMillis();
		test5.chooseAll(swc);
		end = System.currentTimeMillis();
		
		System.out.println(end - start);
		System.gc();

		//***************************************************//
		String[] input6 = new String[20000000];
		input6[10000000] = "a";
		Arrays.fill(input6, 0, 10000000, "bcdefghijklmnop");
		Arrays.fill(input6, 10000001, 12000000, "b");
		Arrays.fill(input6, 12000000, 20000000, "big random");
		ArraySL test6 = new ArraySL(input5);
		start = System.currentTimeMillis();
		test6.chooseAll(swc);
		end = System.currentTimeMillis();
		
		System.out.println(end - start);
		System.gc();

		//***************************************************//
		String[] input7 = new String[15000000];
		input7[14999999] = "O";
		Arrays.fill(input7, 0, 14999999, "BLAH BLAH BLAH");
		input7[6] = "Y";
		Arrays.fill(input7,  7000000, 8000000, "j");
		ArraySL test7 = new ArraySL(input7);
		start = System.currentTimeMillis();
		test7.chooseAll(swc);
		end = System.currentTimeMillis();
		
		System.out.println(end - start);
		System.gc();
		//***************************************************//
		String[] input8 = new String[18000000];
		Arrays.fill(input8, 0, 18000000, "c");

		ArraySL test8 = new ArraySL(input8);
		start = System.currentTimeMillis();
		test8.chooseAll(swc);
		end = System.currentTimeMillis();
		
		System.out.println(end - start);
		System.gc();

		//***************************************************//
		String[] input9 = new String[25000000];
		input9[0] = "d";
		Arrays.fill(input9, 1, 500000, "soup");
		Arrays.fill(input9, 500000, 20000000, "water");
		input9[20000000] = "e";
		Arrays.fill(input9, 15000000, 22000000, "big random");
		input9[24999999] = "g";
		ArraySL test9 = new ArraySL(input9);
		start = System.currentTimeMillis();
		test9.chooseAll(swc);
		end = System.currentTimeMillis();
		
		System.out.println(end - start);
		System.gc();

		//***************************************************//
		String[] input10 = new String[150000000];
		input10[10000000] = "a";
		Arrays.fill(input10, 0, 10000000, "nani");
		Arrays.fill(input10, 10000001, 149000000, "kinoko");

		ArraySL test10 = new ArraySL(input10);
		start = System.currentTimeMillis();
		test10.chooseAll(swc);
		end = System.currentTimeMillis();
		
		System.out.println(end - start);
	}
}