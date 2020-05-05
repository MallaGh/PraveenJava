package com.practisejava;

public class JavaApplication extends SuperClass implements InterfceTest {

	public String gVar = "Welcome";
	public String gVar2 = new String("Welcome");
	String dbcUrl ="";
	public JavaApplication() {
		 super("Helooo...");
		 dbcUrl = "abc@host:port";
		System.out.println("Java Sub class default constructor ............Subclass");
	}

	public JavaApplication(String val) {
		// super();
		//super(val);
		//this();
		gVar = val;
		System.out
				.println("Java Sub class over loaded constructor ............Subclass");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * System.out.println("Args Length :"+ args.length);
		 * System.out.println("Args 0 :"+ args[0]);
		 * System.out.println("Args 1 :"+ args[1]);
		 * System.out.println("Args 2 :"+ args[2]);
		 */
		JavaApplication obj = new JavaApplication();
	/*	obj.method1();
		obj.method4();
		int retValue = obj.method1(40, 100);
		System.out.println("retValue ===" + retValue);
		int retValue1 = obj.method1(Integer.valueOf(args[3]),Integer.valueOf(args[4])); 
		System.out.println("retValue1 ===" + retValue1);  */
    	obj.method2(); // not defined in super class 
    	
		System.out	.println("---------------------------------------------------------------------");
	/*	JavaApplication objV = new JavaApplication("Namaskar");
		objV.method1();
		objV.method4();
		System.out.println("---------------------------------------------------------------------");

		SuperClass obj1 = new SuperClass();
		obj1.method2();
		System.out.println("---------------------------------------------------------------------"); */
		SuperClass obj2 = new JavaApplication();
		String retVal = obj2.method2();       // Polymorphison //
		System.out.println("retVal === " + retVal);
	/*	obj2.method3(); */
		System.out.println("---------------------------------------------------------------------"); 
		System.out.println("print main method exit ..... ");

	}

	/**
	 * 
	 */
	public void method1() {
		String gVar = "Hello";
		System.out
				.println("Java method1................Subclass LocalVariable ::: "
						+ gVar);
		System.out
				.println("Java method1................Subclass Global Variable ::: "
						+ this.gVar);
	}

	/**
	 * 
	 * @param val
	 * @param val2
	 * @return
	 */
	public synchronized int method1(int val, int val2) {
		System.out.println("Java overloaded method1......Subclass......::"	+ (val + val2));
		return (val + val2);
	}

	/**
	 * 
	 */
	public String method2() {
		System.out.println("Java over riding method2 ..........SubClass");
		return "Java over riding method2 ..........SubClass...return type";

	}

	public void method4() {
		System.out.println("Java method4 ................subClass :  " + gVar);
	}

	@Override
	public void intfMethod() {
		System.out.println("aaaaaaaa");
		
	}

}
