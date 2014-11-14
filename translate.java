import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import java.util.Scanner;


public class translate {

	public translate() {}
	
	public void toBeTranslated() throws FileNotFoundException
	{

		File file = new File("l.in");
		@SuppressWarnings({ "resource"})
		Scanner input = new Scanner(file);

		ArrayList<String> Language = new ArrayList<String>();
		ArrayList<String> parse = new ArrayList<String>();
		
		int nCases = input.nextInt(); 
		int found = 0; 

		//adding the text to Language 
		for(int i = 0; i < nCases + 1; i++)
		{
			Language.add(input.nextLine());
		}
		
		//removing the 4 place holder
		Language.remove(Language.get(0));
		
		//adding the rest of the text file to parse
		while(input.hasNext())
		{
			parse.add(input.next());
		}

		//This look goes throught the actual text that has the different languages. I check each word against each word from the 
		//defined langauges (Star Trek theme), Starting from the first language if I find a word that matches, then I return the first 
		//word of the line, which is the language type. 
		for(int j = 0; j < Language.size(); j++)
		{
			for(int i = 0; i < parse.size(); i++)
			{				
				if(Language.get(j).contains(parse.get(i)))
				{		
					found++;
					if(found == 1)
					{
						System.out.println(Language.get(j).substring(0, Language.get(j).indexOf(" ")));
					}
				}
			}
			found = 0; 
		}
	}

	public static void main(String[] args) throws FileNotFoundException {

		 translate t = new translate();
		 t.toBeTranslated(); 
		 

	}


}
