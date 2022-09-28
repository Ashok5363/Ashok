class ColourRunner{
	
	public static void main(String...ra)
	{
		
		System.out.println("Favirate colours");
		
		Colour.save("blue");
		Colour.save("block");
		Colour.save("yellow");
		Colour.save("white");
		Colour.save("brown");
		Colour.save("Red");
		Colour.save("pink");
		Colour.save("parpul");
		Colour.save("sky blue");
		
		Colour.displayDetails();
		
		boolean find=Colour.findColour("red");
		System.out.println("colours are found in array"+find);
		
		
		
	
	}
}