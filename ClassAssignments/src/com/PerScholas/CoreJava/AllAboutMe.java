package com.PerScholas.CoreJava;

public class AllAboutMe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Name,Eyes,Teeth,Hair;
		int Age,Height;
		
		Name = "Madhubala";
		Age = 31;
		Eyes = "Black";
		Teeth = "White";
		Hair = "Black";
		Height = 175;
		double htincm = Height * 2.54;
		
		System.out.println("Let\'s talk about "+Name+".\nThey\'re "+
				Height+" inches tall.\nThey\'re "+Age+" years old.\n"
				+ "Huh that\'s older than I expected...\nThey have "+
				Eyes+" eyes and "+Hair+" hair.\nTheir teeth are usually "+Teeth+
				", but it depends on the coffee.\nAlright, this is pretty"
				+ " boring.Let\'s stop talking about "+Name);
		System.out.println("Height in cm:"+htincm);

	}

}
