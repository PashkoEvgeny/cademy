package by.cadememy.Homework4;

import java.util.Arrays;

public class Method8 {

	Integer[] arr;

	Method8() {
		this.arr = new Integer[3];
	}

	// метод уменьшения массива. нужно дополнить им при удалении элементов

	// метод увеличения при необходимости размера массива growArray
	private void growArray() {
		if (arr[arr.length - 1] != null) {
			Integer[] arr2 = new Integer[arr.length * 2 + 1];
			System.arraycopy(arr, 0, arr2, 0, arr.length);
			arr = arr2;
		}
	}

	// добавления в наш массив объекта типа T - add(T obj)
	// 1.1 метод добавления в конец и увеличения при необходимости размера массива
	public void addElementToLast(Integer value) {
		growArray();
		for (int i = 0; i <= arr.length; i++) {
			if (arr[i] == null) {
				arr[i] = value;
				break;
			}
		}
	}

	// 1.2 метод добавления в начало и увеличения при необходимости размера массива
	public void addElementToFirst(Integer value) {
		growArray();
		for (int i = arr.length - 2; i >= 0; i--) {
			if (arr[i] != null) {
				arr[i + 1] = arr[i];
			}
		}
		arr[0] = value;
	}

	// 1.3 метод добавления по индексу и увеличения при необходимости размера
	// массива
	// addElementByIndex(int index=4)
	// добавить условие: проверка на вхождение индекса. если индекс первышает
	// значение(размер массива) то ошибка
	public void addElementByIndex(int index, Integer value) {
		growArray();
		for (int i = arr.length - 2; i >= index; i--) {
			if (arr[i] != null) {
				arr[i + 1] = arr[i];
			}
		}
		arr[index] = value;
	}

	// 2 Взятие лемента по индексу
	// getElemenByIndex(int index)
	// добавить условие: проверка на вхождение индекса. если индекс первышает
	// значение(размер массива) то ошибка
	public Integer getElemenByIndex(int index) {
		return arr[index];
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
	// outputSize()
	public int size() {
		return arr.length;
	}

	// 6 вывод индекса последнего заполненого элемента (не путать с размерностью)
	// getLastIndex!=null()
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
			// нужно исрользовать 6 задание lastIndex. проверка на вхождение индекса

	public void removeElementByIndex(int index) {
		

			for (int i = index; i < getLastFullIndex(); i++) {
				arr[i] = arr[i + 1];

			}
			arr[getLastFullIndex()] = null;
	}
	
	
	
	// 8 удаление элемента по значению removeElementByValue(T obj)
			// нужно исрользовать 6 задание lastIndex
			public void removeElementByValue(Integer value) {

			
			int removeIndex = 0;
			for (int i = 0; i <= getLastFullIndex(); i++) {
				if (arr[i] == value) { // нужно будет применить сравнение объектов
					removeIndex = i;
					
					
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

}
