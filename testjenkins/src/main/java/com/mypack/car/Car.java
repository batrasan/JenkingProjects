/**
 * 
 */
package com.mypack.car;

import com.mypack.Vehicle.Vehicle;

/**
 * @author Pillu
 *
 */
public class Car extends Vehicle {

	@Override
	public void move() {
		System.out.println("This is car object, this is moving very fast");
	}
	
	public static void main(String[] args) {
		Vehicle v= new Car();
		v.move();
	}

}
