package com.kh.git;

import com.kh.animal.Cat.Cat;
import com.kh.animal.Dog.Dog;
import com.kh.foo.Foo;

/**
 * 
 * 원격저장소 등록 후 push할 수 있다.
 *
 */

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello world~");
		System.out.println("Hello git~");
		System.out.println("Good luck~");
		
		new Foo().sayFoo();
		
		new Dog().say();
		new Cat().say();
	}

}
