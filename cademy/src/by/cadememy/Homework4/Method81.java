package by.cadememy.Homework4;

import java.util.Arrays;

public class Method81<T extends Object> {
	private T[] arr;

	@SuppressWarnings("unchecked")
	public Method81() {
		super();
		this.arr = (T[]) new Object[16];
	}
	
	@SuppressWarnings("unchecked")
	public Method81(int n) {
		super();
		this.arr = (T[]) new Object[n];
	}
	
	// метод увеличения при необходимости размера массива
	@SuppressWarnings("unchecked")
	void growArray() {
		if (arr[arr.length - 1] != null) {
			T[] arr2 = (T[]) new Object[arr.length * 2 + 1];
			System.arraycopy(arr, 0, arr2, 0, arr.length);
			arr = arr2;
		}
	}

	// 1.1 метод добавления элемента в конец массива (в первое пустое место) и увеличения при необходимости размера
		@SuppressWarnings("unchecked")
		public void addElementToLast(Object value) {
			growArray();
			for (int i = 0; i <= arr.length; i++) {
				if (arr[i] == null) {
					arr[i] =(T) value;
					break;
				}
			}
		}

		// 1.2 метод добавления элемента в начало массива и увеличения при необходимости размера
		@SuppressWarnings("unchecked")
		public void addElementToFirst(Object value) {
			growArray();
			for (int i = arr.length - 2; i >= 0; i--) {
				if (arr[i] != null) {
					arr[i + 1] = arr[i];
				}
			}
			arr[0] = (T) value;
		}

		// 1.3 метод добавления элемента по индексу и увеличения при необходимости размера массива
		@SuppressWarnings("unchecked")
		public void addElementByIndex(int index, Object value) {
			growArray();
			if (index < arr.length) {
			for (int i = arr.length - 2; i >= index; i--) {
				if (arr[i] != null) {
					arr[i + 1] = arr[i];
				}
			}
			arr[index] =(T) value;
		} else
			System.out.println("Element is not added! Index " + index + " out of bounds for array length. Max Index " + (arr.length - 1));
	}
		
		// 2 Взятие элемента по индексу
		
		public T getElemenByIndex(int index) {
			if (index < arr.length) {
			return arr[index];
		}
			else {
				System.out.print("Index " + index + " out of bounds for array length! Max Index ");
			}
			return ;
		}

		// 3 взятие последнего элемента
		public T getLastElement() {
			T elemetLast = null;
			for (int i = arr.length - 1; i >= 0; i--) {
				if (arr[i] != null) {
					elemetLast = arr[i];
					break;
				}
			}
			return (T) elemetLast;
		}

		// 4 взятие первого элемента
		public T getFirstElement() {
			return arr[0];
		}

		// 5 вывод размера массива
		public int size() {
			return arr.length;
		}
		
		// 6 вывод индекса последнего заполненого элемента
		public int getLastFullIndex() {
			int lastFullIndex = 0;
			for (int i = arr.length - 1; i >= 0; i--) {
				if (arr[i] != null) {
					lastFullIndex = i;
					break;
				}
			}
			return lastFullIndex;
		}

		// 7 удаление элемента по индексу
		public void removeElementByIndex(int index) {
			if (index < arr.length) {
				if (index <= getLastFullIndex()) {
					for (int i = index; i < getLastFullIndex(); i++) {
						arr[i] = arr[i + 1];
					}
					arr[getLastFullIndex()] = null;
				} else
					System.out.println("Value of Index " + index + " = null");
			} else
				System.out.println("Index " + index + " out of bounds for array length " + arr.length);
		}
		
		// 8 удаление элемента по значению
		public void removeElementByValue(Object value) {
			int removeIndex = 0;
			for (int i = 0; i <= getLastFullIndex(); i++) {
				while (arr[i].equals(value)) {
					removeIndex = i;
					i--;
					for (int q = removeIndex; q < getLastFullIndex(); q++) {
						arr[q] = arr[q + 1];
					}
					arr[getLastFullIndex()] = null;
					break;
				}
			}
		}
	
	@Override
	public String toString() {
		return "Values on array: " + Arrays.toString(arr);
	}
	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}

}
