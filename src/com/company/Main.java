package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.print("Zaproponuj wysokość choinki: ");
	int a =  in.nextInt();
	int b = 1;
	for(int i = a; i > 0; i--){
	    for(int j = 1; j < a; j++){
	        System.out.print(" ");
        }
        for(int k = 0; k < b; k++){
	        System.out.print("*");
        }
        System.out.println();
        a--;
        b +=2;
    }
    }
}
