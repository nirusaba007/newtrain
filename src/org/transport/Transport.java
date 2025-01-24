package org.transport;
import org.road.*;
import org.air.*;
import org.water.*;

public class Transport {
	private void transportForm() {
		System.out.print("transport form is:bus depo");
	}
	public static void main(String[]args) {
		Transport y6= new Transport();
		y6.transportForm();
		Road z1= new Road ();
		z1.bike();
		z1.bus();
		z1.cycle();
		z1.car();
      Air v6=new  Air();
		v6.aeroplane();
		v6.helicopter();
		Water g4=new Water();
		g4.boat();
		g4.ship();
																											
		
		
	}

}
