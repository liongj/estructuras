package com.jp.pila;

import java.util.ArrayDeque;
import java.util.Queue;

public class colas {

	public static void main(String[] args) {
        Queue<String> colas = new ArrayDeque<>();
        colas.add("Amador");
        colas.add("Alex");
        colas.add("Pedro");

        System.out.println(colas);
       
        System.out.println(colas.poll());

        System.out.println(colas);
	}

}
