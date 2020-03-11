package cse12pa2student;

class LongWordChooser implements StringChooser {

	@Override
	public boolean chooseElement(String s) {
		return s.length() > 5;
	}

}

class ShortWordChooser implements StringChooser {
	
	@Override
	public boolean chooseElement(String s) {
		
		return s.length() == 1;
	}
}

class WordWithVowelChooser implements StringChooser {
	
	@Override 
	public boolean chooseElement(String s) {
		return s.contains("a") || s.contains("e") || s.contains("i") ||
				s.contains("o") || s.contains("u") || s.contains("A") ||
				s.contains("E") || s.contains("I") || s.contains("O") ||
				s.contains("U");
	}
}