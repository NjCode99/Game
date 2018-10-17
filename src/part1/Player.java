package part1;

import java.util.*;

public class Player {
		String Name;
		int score = 0;
		public int HighScores[] = {0,0,0,0,0};
		int i = 0;
		
		Player(String name) {
			this.Name = name;
		}
		
		int getScore(){
			return score;
		}	
		String getName() {
			return Name;
		}
		void setTable(int[] HighScores) {
			this.HighScores = HighScores;
		}
		
		void createList(int x) {
			if(HighScores[i] > 0) {
				HighScores[i] = x;
				i++;
			}
			System.out.println(Arrays.toString(HighScores));
		}	
		
	    public static int[] selectionSort(int[] Scores) {
	        for (int i = 0; i < Scores.length - 1; i++)
	        {
	            int index = i;
	            for (int j = i + 1; j < Scores.length; j++)
	                if (Scores[j] > Scores[index]) 
	                    index = j;
	      
	            int higherNumber = Scores[index];  
	            Scores[index] = Scores[i];
	            Scores[i] = higherNumber;
	        }
	        return Scores;
	    }
}
