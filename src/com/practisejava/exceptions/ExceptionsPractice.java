package com.practisejava.exceptions;

public class ExceptionsPractice {

	public static void main(String[] args) {

		try {
			userCreation();
		} catch (UserException e) {
			//e.printStackTrace();
		}
		
		try {
			userEdit();
		} catch (UserException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
		System.out.println("End of main method.....");

	}

	
	public static void userCreation() throws UserException {
		System.out.println("111111111");
		try {
			testException();
		} catch (Exception e) {
			System.out.println("Exception......");
			//e.printStackTrace();
			throw new UserException("User creation error message......");
			//return;
		}
		System.out.println("222222222");
	}
	/**
	 * 
	 * @throws UserException
	 */
	public static void userEdit() throws UserException {
		System.out.println("3333333");
		try {
			testException();
		} catch (Exception e) {
			System.out.println("Exception......");
			//e.printStackTrace();
			throw new UserException("User Edit or update error message......");
			//return;
		}
		System.out.println("4444444");
	}
	/**
	 * 
	 * @throws Exception
	 */
	public static void testException() throws Exception,ArithmeticException {
		int i = 25;

		int y = 25 / 5;

		// try {
		int z = y / 0;
		System.out.println(" z ====" + z);
		/*
		 * } catch (Exception e) {
		 * System.out.println("Ctach block executed...."); e.printStackTrace();
		 * } finally { System.out.println("Finally block executed."); }
		 */
	}

}
