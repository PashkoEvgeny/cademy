package by.cadememy.Homework4;

import java.util.Arrays;

public class Method8 {

	Integer[] arr;

	Method8() {
		this.arr = new Integer[2];
	}

	// метод увеличения при необходимости размера массива growArray
	private void growArray() {
		if (arr[arr.length - 1] != null) {
			Integer[] arr2 = new Integer[arr.length * 2 + 1];
			System.arraycopy(arr, 0, arr2, 0, arr.length);
			arr = arr2;
		}
	}

	// 1.1 метод добавления элемента в первое null место (скорее всего в конец) и увеличения при необходимости размера
	// массива
	public void addElementToLast(Integer value) {
		growArray();
		for (int i = 0; i <= arr.length; i++) {
			if (arr[i] == null) {
				arr[i] = value;
				break;
			}
		}
	}

	// 1.2 метод добавления элемента в начало и увеличения при необходимости размера
	// массива
	public void addElementToFirst(Integer value) {
		growArray();
		for (int i = arr.length - 2; i >= 0; i--) {
			if (arr[i] != null) {
				arr[i + 1] = arr[i];
			}
		}
		arr[0] = value;
	}

	// 1.3 метод добавления элемента по индексу и увеличения при необходимости
	// размера массива

	public void addElementByIndex(int index, Integer value) {
		growArray();
		if (index < arr.length) {
			for (int i = arr.length - 2; i >= index; i--) {
				if (arr[i] != null) {
					arr[i + 1] = arr[i];
				}
			}
			arr[index] = value;
		} else
			System.out.println("Element is not added! Index " + index + " out of bounds for array length. Max Index " + (arr.length - 1));
	}

	// 2 Взятие лемента по индексу
	public Integer getElemenByIndex(int index) {
		if (index < arr.length) {
			return arr[index];
		}
		else {
			System.out.print("Index " + index + " out of bounds for array length! Max Index ");
		}
		return (arr.length - 1);
	}

	// 3 взятие последнего элемента getLastElement()
	public Integer getLastElement() {
		Integer elemetLast = null;
		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i] != null) {
				elemetLast = arr[i];
				break;
			}
		}
		return elemetLast;
	}

	// 4 взятие первого элемента getFirstElement()
	public Integer getFirstElement() {
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

	// 7 удаление элемента по индексу removeElementByIndex(int i)

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

	// 8 удаление элемента по значению removeElementByValue(T obj)
	public void removeElementByValue(Integer value) {
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
