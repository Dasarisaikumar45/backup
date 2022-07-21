package com.ibm.lib;
public class Member {
	private String Name;
	private Book bk;
	public Member(String Name) {
		this.Name = Name;
	}
	public String getName() {
		return Name;
	}
	
	public void setBook(Book bk) {
		this.bk = bk;
	}
	public void status() {
		if (bk == null)
			System.out.println(Name+"not issued");
		else 
			System.out.println(Name +"  has issued"+ bk.getTitle());
		
	}
}