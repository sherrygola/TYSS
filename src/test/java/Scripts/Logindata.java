package Scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import Generic.Utils;

public class Logindata {

	@Test
	public void loginData() throws IOException, Exception
	{
		int row=Utils.xlRowCount();
		for(int i=0;i<=row;i++)
		{
			for(int j=0;j<2;j++)
			{
	 String s=Utils.xlRead("Logind",i,j);
	System.out.println(s);
	}
		}
		
	}	
}
