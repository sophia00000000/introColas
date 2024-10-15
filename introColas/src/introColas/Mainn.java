package introColas;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Mainn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> cola= new LinkedList<>(); //lista doblemente encadenada, tiene la referncia al siguiente y el anterior
		Queue<Integer> cola2= new LinkedList<>(); 
		Stack<Integer> pila= new Stack<>();
		
		
		pila.push(10);
		pila.push(20);
		pila.push(30);
		pila.push(40);
		
		while (!pila.isEmpty()) {
			cola2.add(pila.pop());
		}
		
		while(!cola2.isEmpty()) {
			pila.push(cola2.poll());
		}

		System.out.println(cola2);
		
		
		
		cola.add(100);
		cola.add(500);
		cola.add(300);
		
		System.out.println(cola.peek());
		System.out.println(cola.poll());
		
		char[] palabra = {'o','s','o'};
		char[] palabra2 = {'h','s','o'};
		
		System.out.println(esPalindrome2(palabra2));
		
	}
	
	/**
	
	public static Boolean esPalindrome(String palabra) {
		Queue<Integer> cola= new LinkedList<>(); 
		Stack<Character> pila= new Stack<>();
		String invertida;
		for(int i=0; i<palabra.length(); i++) {
			pila.push(palabra.charAt(i));
		}
		
		while(!pila.isEmpty()) {
			invertida+=pila.pop();
		}
		
		
		
		if(palabra==invertida) {
			return true;
		}
		
		*/
	
	public static Boolean esPalindrome2(char[] palabra) {
		Queue<Character> cola= new LinkedList<>(); 
		Stack<Character> pila= new Stack<>();
		
		for(int i=0; i<palabra.length; i++) {
			pila.push(palabra[i]);
			cola.add(palabra[i]);
			
		}
		
		while (!pila.isEmpty()) {
			if(pila.pop()!=cola.poll()) {
				return false;
			}
		}
		return true;
		
	}
	
		
		
	

}
