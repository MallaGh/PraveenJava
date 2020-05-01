package com.practisejava;

public class SuperClass {

	public SuperClass() {
		//this("Java");
		// TODO Auto-generated constructor stub
		System.out.println("Super class  defconstructor ........SuperClass");
	}
	
	public SuperClass(String vl) {
		// TODO Auto-generated constructor stub
		System.out.println("Super class over loaded constructor ........SuperClass :: "+vl);
	}
	
	public String method2() {
		// TODO Auto-generated method stub
		System.out.println("Java method2 programme...........SuperClass");
		return "Java method2 programme...........SuperClass--returnvalue";
	}
	public void method3() {
		
		System.out.println("Java method3 programme............SuperClass");
		
	}


}
