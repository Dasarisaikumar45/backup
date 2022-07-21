package com.ibm.bank;

	public class Customer {                             
		private int cid;                                
		private String cName;                           
		private double cLimit;                          
		private static int counter=1;                   
		public Customer() {                             
			                                            
		}                                               
		public Customer(String cName,double cLimit)     
		{                                               
			this.cid =counter++;                        
			this.cName = cName;                         
			this.cLimit = cLimit;                       
			                                          
		}                                               
		public void print()                             
		{                                               
			System.out.println("id:"+ cid);             
			System.out.println("Name:"+ cName);         
			System.out.println("Limit:"+ cLimit);       
			                                            
		}                                               
		public static void main(String[]args) {         
			Customer d=new Customer("Raju",8800.0000);  
			Customer d1=new Customer ("mahesh",8700.00);
			Customer d2=new Customer ("sai",8600.0);    
			d.print();                                  
			d1.print();                                 
			d2.print();                                 
			                                            
		}                                               
	                                                    
	}


