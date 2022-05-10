package com.example;

import java.util.*;

public class HeapAppExample {

  private static Integer[] arr;

  public static void main(String[] args) {
    // create a min heap
    PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();

    // add random value nodes
    final Integer min = 300;
    final Integer max = 1500;
    final Integer n = 110;
    System.out.printf("Race times in minutes:\n");
    for (Integer i = 0; i < n; i++) {
      // create a value
      Integer val = min + (int) Math.floor(Math.random() * (max - min));
      System.out.printf("%d ", val);
      // student needs to write code to
      // put the random value (val) into the heap
      minHeap.add(val);
    }
    System.out.printf("\n");
    System.out.printf("\n");
    // student needs to write code to
    // print the heap, without changing the heap
   Iterator<Integer> iterator = minHeap.iterator();
   System.out.println("printing the heap");
   while (iterator.hasNext()) {
     System.out.print(iterator.next() + " ");
   }
  System.out.printf("\n");
  System.out.printf("\n");

    // student needs to write code to
    // print the 5 smallest values in the heap
    // the values can be removed from the heap (the heap can be changed)
    System.out.printf("printing the top 5 race time ");
    for(int i=1; i <6; i++){
      System.out.println("#" +i + " " + minHeap.poll());
    }
    

    
    
  }
}
