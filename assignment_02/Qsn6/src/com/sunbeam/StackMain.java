package com.sunbeam;

import java.util.Scanner;

public class StackMain {
public static void main(String[] args) {
	
    Stack st = new Stack(4);
    int choice;
    
    Scanner sc = new Scanner(System.in);
    
    do {
    	
    	
    	
    	System.out.println("-----------------------------------");
		System.out.println("0.Exit");
		System.out.println("1.push");
		System.out.println("2.pop");
		System.out.println("3.peek");
		System.out.println("-------------------------------------");
		choice = sc.nextInt();
    	switch(choice) {
    	case 1:
    		if(st.isFull()) {
    			System.out.println("stack is full");
    			
    		}else {
    			System.out.println("enter data");
    			int data = sc.nextInt();
    			st.push(data);
    		}
    		break;
    		
    	case 2:
    		if(st.isEmpty()) {
    			System.out.println("stack is empty");
    		}else {
    			System.out.println("poped data :"+ st.pop());
    		}
    		break;
    		
    	case 3:
    		if(st.isEmpty()) {
    			System.out.println("stack is empty");
    		}else {
    			System.out.println("peeked data :" + st.peek());
    		}
    		break;
    	
    	
    	}
    	
    }while(choice!= 0);
    
    sc.close();
    
    System.out.println(st.peek());
}

}
