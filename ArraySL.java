package cse12pa2student;

public class ArraySL implements StringList {

	String[] elements;
	int size;
	
	public ArraySL(String[] initialElements) {
		size = countNonNullElements(initialElements);
		elements = new String[size];
		int index = 0;
		for(int i = 0; i < initialElements.length; ++i) {
			if(initialElements[i] != null) {
				elements[index] = initialElements[i];
				index++;
			}
		}
	}
	public String[] toArray() {
		return this.elements;
			}
	
	public void transformAll(StringTransformer st) {
		for(int i = 0; i < size; ++i)
		{
			//if(elements[i] != null)
				elements[i] = st.transformElement(elements[i]);
		}
	}
	
	public void chooseAll(StringChooser sc) { 
		int count = 0;
		for(int i = 0; i < size; ++i) {
			if(sc.chooseElement(elements[i]))
				count++;
		}
		String[] newElements = new String[count];
		int index = 0;
		for(int i = 0; i < size; ++i) {
			if(sc.chooseElement(elements[i])) {
				newElements[index] = elements[i];
				index++;
			}
		}
		elements = newElements;
		size = count;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	private int countNonNullElements(String[] in) {
		int count = in.length;
		for(int i = 0; i < in.length; ++i) {
			if(in[i] == null)
				count--;
		}
		return count;
	}

}
