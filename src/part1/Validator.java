package part1;

import javax.swing.JOptionPane;
	public class Validator {
	   public String isNotNull(String str) {						//Checks if a string is null or not
		   boolean bool = false;									//declare variables
		   while(bool == false) {									
			   if(str != null && !str.isEmpty())					//if String is not empty
			   {
				   bool = true;										//break out of if statement
			   }
			   else {
				   str = JOptionPane.showInputDialog("Please enter a valid name");	//else enter a non-empty String
			   }
		   }
		   return str;												//returns new String
	   }
	   
		public static int validateInt(int x) {	
			String s;
			boolean IsOk= false;									//declare variables
			while(!IsOk)											//while(false)
			{
				try 												//try catch statement
				{
					/*if (inRange(x))
					{
					IsOk = true;									//break loop
					}
					else
					{
						 s = JOptionPane.showInputDialog(null, 		//prompts user to enter in a nonnegative value
								 "Please enter a nonnegative value");
			             value = Double.parseDouble(s);
					}*/
				}	
				catch(NumberFormatException e) {					//if not a number, enter a variable that is a number					
					s = JOptionPane.showInputDialog(null, "Please enter a number");
					x = Integer.parseInt(s);
				}
			}
			return x;											//returns value
		}
}
