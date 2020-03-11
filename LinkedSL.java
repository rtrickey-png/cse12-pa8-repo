package cse12pa2student;

class Node {
	String value;
	Node next;

	public Node(String value, Node next) {
		this.value = value;
		this.next = next;
	}
}

public class LinkedSL implements StringList {
	Node front;
	int size;

	public LinkedSL(String[] contents) {
		front = new Node(null, null);
		size = 0;
		Node temp = front;
		for(int i = 0; i < contents.length; ++i) {
			if(contents[i] != null) {
			temp.next = new Node(contents[i], null);
			temp = temp.next;
			size +=1;
			}
		}
	}

	@Override
	public String[] toArray() {
		String[] arr = new String[size];
		Node temp = front.next;
		for(int i = 0; i < size; ++i) {
			arr[i] = temp.value;
			temp = temp.next;
		}
		return arr;
	}

	public void transformAll(StringTransformer st) {
		Node temp = front.next;
		while(!(temp.next == null)) {
			if(temp.value != null) {
				String newStr = st.transformElement(temp.value);
				temp.value = newStr;
				temp  = temp.next;
			}
		}
		if(temp.value != null)
			temp.value = st.transformElement(temp.value);
	}

	public void chooseAll(StringChooser sc) {
		Node newFront = new Node(null, null);
		Node newTemp = newFront;
		int newSize = 0;
		Node temp = front.next;
		while(!(temp.next == null)) {
			if(temp.value != null && sc.chooseElement(temp.value)) {
				newTemp.next = new Node(temp.value, null);
				newTemp = newTemp.next;
				newSize++;
			}
			temp = temp.next;
		}
		if(temp.value != null && sc.chooseElement(temp.value)) {
			newTemp.next = new Node(temp.value, null);
			newSize++;
		}
		this.front = newFront;
		this.size = newSize;
	}

	public boolean isEmpty() {
		return size == 0;
	}


}
