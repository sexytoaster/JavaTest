package ie.dit;

import java.io.IOException;
import java.io.FileReader;
import java.util.ArrayList;
import java.io.BufferedReader;

public class TuneBook
{
	ArrayList<Tune> tunes = new ArrayList<Tune>();

	String fileName = "hnj0.abc.txt";


	
	public TuneBook(String fileName)
	{
        BufferedReader inputStream = null;
		char X = X;
		char T = T;
		char D = D;
        try {
            inputStream = new BufferedReader(new FileReader(fileName));
            
            String l;
			String temp;
			int count = 1;
            while ((l = inputStream.readLine()) != null) {
                


				if(l.charAt(0) ==  X)
				{
					This.x = Tune.getX(l);
				}
				else if(l.charAt(0) == T)
				{
					This.title = Tune.getTitle(l);
				}
				else if(l.charAt(0) == D)
				{
					This.altTitle = Tune.getAltTitle(l);
				}
				if(count % 3 = 0)
				{
					temp = Tune.toString();
					This.notation = Tune.getNotation(l);

					tunes.add(new Tune(x, title, altTitle, notation));
				}

				

            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        } 
        finally 
        {
            if (inputStream != null) {
                try
                {
                    inputStream.close();
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
            }
        }
}