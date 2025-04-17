package com.mm.generics.method_example1;

/*The swap method is defined with a type parameter <T>. 
This type parameter can be any type, and it is used as the 
type of the elements in the array. The method swaps the elements 
at the specified indices.*/

public class GenericMethod {

// Generic method to swap elements in an array
	public <T> void swap(T[] array, int index1, int index2) {
		T temp = array[index1];
		array[index1] = array[index2];
		array[index2] = temp;
	}
	
}