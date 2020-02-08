package Day13.Exer7_1;

public interface StringList {
	//uncomment these	
	abstract String[] strArray();
	abstract int size();
	abstract void setSize(int s);
	
	/** Adds a string to the end of the list */
	public default void add(String s) {
		strArray()[size()]=s;
		setSize(size()+1);
	}
	
	/** Gets the i_th string in the list */
	public default String get(int i) {
		if (i < 0 || i > 99)
			return null;
		return strArray()[i];
	}
	
}
