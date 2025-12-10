package leetcode.customImplementation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class MyArrayListMain{
	public static void main(String[] args) {
		MyArrayList<Integer>  integers=new MyArrayList<>();
		System.out.println(integers+" "+integers.size());
//		integers.remove(4);
		System.out.println("Updated size"+integers.size()+" Actual size"+integers.accuiredSpace());
		List<Integer> integers2=new ArrayList<>();
		integers2.add(1);
		integers2.add(2);
		integers2.add(3);
		for (Integer integer : integers2) {
			System.out.println(integer);
			integers2.remove(1);
		}
	}
}

public class MyArrayList<T> {

	Object[] arrObj= {};
	private int size=0;
    private static final int DEFAULT_CAPACITY = 10;

	public MyArrayList() {
		arrObj=new Object[DEFAULT_CAPACITY];
	}
	
	public void add(T element) {
		checkCapacity();
		arrObj[size++]=element;
	}

	private void checkCapacity() {
		if(size==arrObj.length) {
			int newLen=(arrObj.length * 3) /2;  // growing by 1.5x
			arrObj=Arrays.copyOf(arrObj, newLen);
		}
	}
	
	public T get(int idx) {
		if(idx >= size  || idx < 0) {
			throw new IndexOutOfBoundsException("Index out of range");
		}
			return (T) arrObj[idx];
	}
	
	public T remove(int idx) {
		if (idx >= size || idx < 0) {
			throw new IndexOutOfBoundsException("Index out of range");
		}
		T removedElement = (T) arrObj[idx];
		for (int i = idx; i < size - 1; i++) {
			arrObj[i] = arrObj[i + 1];
		}
		size--;
		return removedElement;
	}
	public int size() {
		return size;
	}
	public int accuiredSpace() {
		return arrObj.length;
	}
	@Override
	public String toString() {
		return Arrays.toString(Arrays.copyOf(arrObj, size));
	}
	
}
