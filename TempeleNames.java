class TempeleNames{
	static String[] names={null,null,null,null,null};
	
	static int position=0;
	static void saveDate(String Name){
		
		System.out.println("svae: Recent add");
		names[position]=Name;
		position++;
	}
	static void displayNames()
	{
		for(int index=0;index<names.length;index++)
	
	{
		String ref=names[index];
		System.out.println("TempeleNames ;"+ref);
	}
    
	
	}

	}
