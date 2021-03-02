package by.academy.Iterator;

import java.util.Iterator;

public class IteratorArray<T> implements Iterator<T> {

	private T[][][] array;
	private int i = 0;
	private int q = 0;
	private int k=0;

	IteratorArray(T[][][] array) {
		super();
		this.array = array;
	}


	public T[][][] getArray() {
		return array;
	}


	public void setArray(T[][][] array) {
		this.array = array;
	}


	@Override
	public boolean hasNext() {

		if (i>=array.length || array == null) {
			return false;
		}
		return true;
	}

	@Override
	public T next() {
		T temp=array[i][q][k++];
		
		
		if (q==array.length) {
			i++;
			q=0;
			if (k==array[i].length) {
				k++;
				i=0;
			}
		}
			return temp;
		
	}

}
