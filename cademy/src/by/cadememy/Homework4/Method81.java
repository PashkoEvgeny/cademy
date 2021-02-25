package by.cadememy.Homework4;

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

	// ����� ���������� ��� ������������� ������� �������
	@SuppressWarnings("unchecked")
	private void growArray() {
		if (arr[arr.length - 1] != null) {
			T[] arr2 = (T[]) new Object[arr.length * 2 + 1];
			System.arraycopy(arr, 0, arr2, 0, arr.length);
			arr = arr2;
		}
	}

	// 1.1 ����� ���������� �������� � ����� ������� (� ������ ������ �����) �
	// ���������� ��� ������������� �������
	@SuppressWarnings("unchecked")
	public void addElementToLast(Object value) {
		growArray();
		for (int i = 0; i <= arr.length; i++) {
			if (arr[i] == null) {
				arr[i] = (T) value;
				break;
			}
		}
	}

	// 1.2 ����� ���������� �������� � ������ ������� � ���������� ��� �������������
	// �������
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

	// 1.3 ����� ���������� �������� �� ������� � ���������� ��� �������������
	// ������� �������
	@SuppressWarnings("unchecked")
	public void addElementByIndex(int index, Object value) {
		growArray();
		if (index <= size()) {
			for (int i = size(); i >= index; i--) {
				if (arr[i] != null) {
					arr[i + 1] = arr[i];
				}
			}
			arr[index] = (T) value;
		} else
			System.out.println(
					"Element is not added! Index " + index + " out of bounds for array length. Max Index " + size());
	}

	// 2 ������ �������� �� �������
	@SuppressWarnings("unchecked")
	public T getElemenByIndex(int index) {
		if (index < size()) {
			return arr[index];
		} else
			return (T) ("Index " + index + " out of bounds for array length! Max Index " + getLastFullIndex());
	}

	// 3 ������ ���������� ��������
	public T getLastElement() {
		return arr[getLastFullIndex()];
	}

	// 4 ������ ������� ��������
	public T getFirstElement() {
		return arr[0];
	}

	// 5 ����� ������� �������
	public int size() {
		return getLastFullIndex() + 1;
	}

	// 6 ����� ������� ���������� ����������� ��������
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

	// 7 �������� �������� �� �������
	public void removeElementByIndex(int index) {
		if (index <= getLastFullIndex()) {
			for (int i = index; i < getLastFullIndex(); i++) {
				arr[i] = arr[i + 1];
			}
			arr[getLastFullIndex()] = null;
		} else
			System.out.println("Index " + index + " out of bounds for array length! Max Index " + getLastFullIndex());
	}

	// 8 �������� �������� �� ��������
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
		String s = "Values on array: ";
		for (int i = 0; i <= getLastFullIndex(); i++) {
			s = s + arr[i];
			if (i < getLastFullIndex()) {
				s += ", ";
			}
		}
		return s;
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
