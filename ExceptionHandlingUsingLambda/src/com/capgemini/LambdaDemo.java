package com.capgemini;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class LambdaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers= Arrays.asList(2,5,0,7,9);
		
		List<Student> stulist = new ArrayList<>();
		stulist.add(new Student("angshu", 22));
		stulist.add(new Student("angshuman", 23));
		stulist.add(new Student("ramya", 20));
		stulist.add(new Student("tanya", 21));
		stulist.add(new Student("eleena", 22));
		stulist.add(new Student("arka", 22));
		
		Stream<Student> para = stulist.stream();
		
		para.forEach(s->display(s));
		
		System.out.println("-----------------------------------------------------------------------");
		
		numbers.forEach(lambdaWrapperConsumer(i->System.out.println(50/i), IOException.class));
	}
	
	
	private static void display(Student s) {
		// TODO Auto-generated method stub
		System.out.println(s.getName()+"    "+s.getAge());
	}


	public static <T,E extends Exception> Consumer<T> lambdaWrapperConsumer(Consumer<T> consume, Class<E> clazz){
		return i->{
			try {
				consume.accept(i);
			} catch (Exception e) {
				
				try {
					System.err.println("Exception occured== "+e.getMessage());
				} catch (ClassCastException e1) {
					// TODO Auto-generated catch block
					throw new RuntimeException("Class cast Exception Occured---"+e1.getMessage());
				}
			}
			
		};
		
	}
	
	
	
	/*public static Consumer<Integer> lambdaWrapperConsumer(Consumer<Integer> consume){
		return i->{
			try {
				consume.accept(i);
			} catch (ArithmeticException e) {
				System.err.println("Exception occured== "+e.getMessage());
			}
			
		};
		
	}*/

}
