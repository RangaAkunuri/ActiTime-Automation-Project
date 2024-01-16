package utilities;

import java.util.Random;

public class RandomNumber 
{

	
	 public int getRandomNumber()
	 {
		 
		 
	 Random r = new Random();
		 
	 int R = r.nextInt(10);
		 return R;
	 }
}
