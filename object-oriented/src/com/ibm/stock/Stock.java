package com.ibm.stock;

public class Stock  implements Exchange{
		
		public void get() { 

			System.out.println("View quote");
		}
		
		public void view() {
			System.out.println("Get quote");
		}
		
		public void set() {
			System.out.println("Set quote");
		}
		
		
		public static void main(String[] args) {

			Stock ibm = new Stock(); 
			Holder h= ibm;
			h.view();

			System.out.println("\n");

			Broker b=ibm; b.view();

			b.get(); System.out.println("\n");

			Exchange e= ibm;
			e.view();

			e.get();

			e.set();
		}

	}

