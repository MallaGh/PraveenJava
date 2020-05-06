package com.practice.threads;

class Thread1 extends Thread {

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Hi Thread1");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Thread2 extends Thread {

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Hi Thread2");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class ThreadPracticeExtends {

	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();

		System.out.println("t1 priority " + t1.getPriority());
		System.out.println("t2 priority " + t2.getPriority());
		t1.start();
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t2.start();

	}

}