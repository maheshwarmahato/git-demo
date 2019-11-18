package com.git.demo;

/**
 * Hello world!
 *
 */
public class App 
{
	public void addData(String data) {
		if(data.equals(Constant.DATA_TYPE)) {
			System.out.println("Welcome");
		}
	}
	
	public void addNewMethod() {
		System.out.println( "New Method" );
	}
	
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
