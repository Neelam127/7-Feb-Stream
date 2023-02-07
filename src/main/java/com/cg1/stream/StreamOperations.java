package com.cg1.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOperations {
	
	public static void main(String[] args) {
		List<String> list=List.of("Neelam","Priya","Nisha");
		List<String> stream=list.stream().filter(i->i.startsWith("N")).collect(Collectors.toList());
		System.out.println(stream);
		
		List<Integer> num=List.of(1,4,2,1,5);
		List<Integer> sq=num.stream().map(i->i*i).collect(Collectors.toList());
		System.out.println(sq);
		
		//Sorting
		List<Integer> sort=num.stream().sorted().collect(Collectors.toList());
		System.out.println(sort);
		
		//Min
		int min=num.stream().min((x,y)->x.compareTo(y)).get();
		
		//Max
		int max=num.stream().max((x,y)->x.compareTo(y)).get();
		
		System.out.println("Min "+min+" Max "+max);
		
	}

}
