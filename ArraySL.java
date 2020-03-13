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
		int index1 = -1, index2 = -1, index3 = -1;
		for(int i = 0; i < size; ++i) {
			if(sc.chooseElement(elements[i]))
				{
				count++;
				if(index1 == -1)
					{
					index1 = i;
					continue;
					}
				if(index2 == -1) {
					index2 = i;
					continue;
				}
				if(index3 == -1) {
					index3 = i;
					continue;
				}
				
				}
		}
		if(count != 0) {
		String[] newElements = new String[count];
		int index = 0;
		if(index1 > -1) {
			newElements[index] = elements[index1];
			index++;
		}
		if(count == 1) {
			elements = newElements;
			size = count;
			return;
		}
		if(index2 > -1) {
			newElements[index] = elements[index2];
			index++;
		}
		if(count == 2) {
			elements = newElements;
			size = count;
			return;
		}
		
		if(index3 > -1) {
			newElements[index] = elements[index3];
			index++;
		}
		if(count == 3) {
			elements = newElements;
			size = count;
			return;
		}
		if(index1 > -1 && index2 > -1 && index3 > -1) {
			for(int i = index3+1; i < size; ++i) {
				if(sc.chooseElement(elements[i])) {
					newElements[index] = elements[i];
					index++;
				}
			}
		}
		else if(index1 > -1 && index2 > -1) {
			for(int i = index2+1; i < size; ++i) {
				if(sc.chooseElement(elements[i])) {
					newElements[index] = elements[i];
					index++;
				}
			}
		}
		else /*if(index1 > -1) */{
			for(int i = index1+1; i < size; ++i) {
				if(sc.chooseElement(elements[i])) {
					newElements[index] = elements[i];
					index++;
				}
			}
		}
		
		elements = newElements;
		size = count;
		}
		else {
			elements = new String[0];
			size = 0;
		}
		
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
