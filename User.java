package Inhertance.programs;

public class User {

	public static void main(String[] args) {
		Guest gst = new Guest();
		gst.read();
		
		Devloper Dev = new Devloper();
		Dev.write();
		Dev.read();
		
		Adimn ad = new Adimn();
		ad.manage();
		ad.read();
		ad.write();

	}

}
