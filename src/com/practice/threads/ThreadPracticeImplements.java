package com.practice.threads;

class Thread3 implements Runnable {

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Hi Thread3");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Thread4 implements Runnable {

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Hi Thread4");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class ThreadPracticeImplements {

	public static void main(String[] args) {
		Thread3 obj1 = new Thread3();
		Thread4 obj2 = new Thread4();

		Thread t3 = new Thread(obj1);
		Thread t4 = new Thread(obj2);
		t3.setPriority(10);
		System.out.println("t3 priority " + t3.getPriority());
		System.out.println("t4 priority " + t4.getPriority());
		t3.start();
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t4.start();

	}

}