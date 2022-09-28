class  Colour{
	
	static String[] colours={null,null,null,null,null,null,null};
	static int position = 0;
	static void save(String rainbow)
	
	{
		colours[position]=rainbow;
		position++;
		if(rainbow!=null&& rainbow.length()>3)
		{
			System.out.println("rainbow is pointing to null or not pointing to null having more than 3 char");	
		}else
		{
			System.out.println(" rainbow are not pointing null");
		}
		if(position>6)
		{
			System.out.println("rainbow colours are exceds");
		}else
		{
			System.out.println("rainbow is not exceds");
		}
		
	}
			   static void displayDetails()
			   {
				   for(int index=0;index<colours.length;index++)
				   {
					   String ref = colours[index];
					   System.out.println(" Rainbow colors :"+ref);
				   }
			   }
			     static boolean findColour(String colour)
				 {
					 if(colour!=null && colour.length()>3)
			     {
			 System.out.println("perfect colours");
			 for(int find=0;find<colours.length;find++)
				 
			   {
				 String ref = colours[find];
				 if(ref==colour)
				 {
					 System.out.println("colour is found array");
					 return true;
				 }else
				 {
					 System.out.println("colours is not found in array");
					               
					 }
					 }
				 }return false;
				 }
}