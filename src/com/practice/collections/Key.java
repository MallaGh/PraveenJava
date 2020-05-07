package com.practice.collections;

 public class Key {
	String key;

	
	public  Key(String key) {
		this.key = key;
		System.out.println("Constructor called.....");
	}

	@Override
	public int hashCode() {
		//int hash = (int) key.charAt(0) + key.charAt(1);
		int hash = (int) key.charAt(0);
		System.out.println("hashCode for key: " + key + " = " + hash);
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		return key.equals(((Key) obj).key);
	}

}
