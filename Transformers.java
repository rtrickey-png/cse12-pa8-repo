package cse12pa2student;

class UpperCaseTransformer implements StringTransformer {

	public String transformElement(String s) {
		return s.toUpperCase();
	}

}

class DuplicateStringTransformer implements StringTransformer {
	public String transformElement(String s) {
		return s + s;
	}
}

class ReductionTransformer implements StringTransformer {
	public String transformElement(String s) {
		return s.substring(0,1);
	}
}