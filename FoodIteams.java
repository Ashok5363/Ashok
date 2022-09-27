class FoodIteams{
	
static String[] foodName={null,null,null};
	
	static int position=0;
	static int[] collections={0,0,0};
	static void saveName(String name,int value)
	
	{
		foodName[position]=name;
		collections[position]=value;
		position++;
	}
	static String displayDetails()
	{
		for(int index=0;index<foodName.length;index++)
		
	{
		String ref=foodName[index];
		int ref1=collections[index];
		System.out.println("names :"+ref+" price :"+ref1+ "rupies");
		
	}
	     return "taste foods";
	
	
	
	}
}