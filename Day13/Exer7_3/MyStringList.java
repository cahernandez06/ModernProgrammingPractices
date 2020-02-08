package Day13.Exer7_3;

import java.util.*;
import java.util.function.Consumer;


public class MyStringList implements StringList, Iterable<String> {
	private static final int INITIAL_SIZE = 100;
	String[] strArray;
	int size;
	
	/* constructor */
	public MyStringList() {
		strArray = new String[INITIAL_SIZE];
		size = 0;
	}
	
	
	public String[] strArray() {
		return strArray;
	}
	public void setSize(int x) {
		size = x;
	}
	
	//implementations of interface methods
	
	public void add(String s) {
		strArray[size++] = s;
	}
	
	public String get(int i) {
		if (i < 0 || i >= size) {
			return null;
		}
		return strArray[i];
	}

	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		for (int i = 0; i < size - 1; ++i) {
			sb.append(strArray[i] + ", ");
		}
		if(size > 0)
		   sb.append(strArray[size - 1] + "]");
		return sb.toString();
	}


	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size();
	}


	@Override
	public Iterator<String> iterator() {
		// TODO Auto-generated method stub
		
		return new NewIterator;
	}
	
	class MyIterator implements Iterator<String> {

		private int pos;

		public MyIterator() {
		pos = 0;
		}

		@Override
		public boolean hasNext() {

		return pos < size;
		}

		@Override
		public String next() {

		if (!hasNext())
		throw new ArrayIndexOutOfBoundsException();
		String str = strArray[pos];
		pos++;
		return str;

		// return strArray[pos++];
		}

		// do not care about remove method for now.
		@Override
		public void remove() {
		// TODO Auto-generated method stub

		}

		}
	
}
