package com.cg1.stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CreationOfStream {
	
	public static void main(String[] args) {
		//Stream Creation
		
		//Empty Stream
		Stream<Object> emptyStream=Stream.empty();
		
		//Creating stream using array
		String names[]= {"Neelam","Priya","Nisha"};
		Stream.of(names).forEach(i->{System.out.println(i);});
		
		//Creating Stream using builder
		Stream<Object> stream=Stream.builder().build();
		
		//Creating Stream using array
		IntStream arrayStream=Arrays.stream(new int[] {2,1,4,5});
		arrayStream.forEach(i->System.out.println(i));
		
		
	}

}
