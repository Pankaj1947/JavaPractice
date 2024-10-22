
package com.masai;

public class Demo {

	A fun1(String username, String password) {
		if (username.equals("admin") && password.equals("123")) {
			System.out.println("Inside fun1 of Demo");
			A a1 = new A();
			return a1;
		} else {
			return null;
		}

	}

	public static void main(String[] args) {
		Demo d1 = new Demo();
		A obj = d1.fun1("admin","123");
		if(obj!=null)
			obj.funA();
		else
			System.out.println("Invalid username or password");
	}

}

There are two classes: Demo and A. The Demo class has a method fun1 that takes a username and password as parameters. If the username is "admin" and 
the password is "123", it prints a message and returns a new instance of the A class. If the credentials are incorrect, it returns null. In the 
main method of Demo, an object of Demo is created, and fun1 is called with the credentials. If a valid object is returned, the funA method of 
class A is called, which prints "Inside funA of A". Otherwise, it prints "Invalid username or password". This code is a simple example of how 
objects are created and returned based on certain conditions, and how we can check for null to avoid calling methods on a null reference.