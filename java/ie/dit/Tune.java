package ie.dit;

import java.io.IOException;
import java.util.ArrayList;

public class Tune
{
	//ArrayList<String> words = new ArrayList<String>();


	private int x;
	private String title;
	private String altTitle;
	private String notation;

	/*public void Tune(int x, String title, String altTitle, String notation)
	{
		String line;
		getX(line);
		getTitle(line);
		getAltTitle(line);
		toString();
		getNotation(line);
	}*/

	public int getX(String line)
	{
		int i;
		char X = X;
		char temp;
		if (line.charAt(0) == X)
		{
			temp = line.charAt(2);
			i = Character.getNumericValue(temp);
			return i;
		}
	}

	public String getTitle(String line)
	{
		char T = T;
		String temp;
		if (line.charAt(0) == T)
		{
			temp = line.substring(2, line.length());
			return temp;
		}
	}

	public String getAltTitle(String line)
	{
		char T = T;
		String temp;
		if (line.charAt(0) == T)
		{
			temp = line.substring(2, line.length());
			return temp;
		}
	
	}
	
	public String getNotation(String Line)
	{
	
	}

	public String toString(words)
	{

		StringBuffer sb = new StringBuffer();

        for(String word:words)
        {
            sb.append(word + ", ");
        }

        return sb.toString();
	}
}
