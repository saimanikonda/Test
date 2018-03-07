import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class pangrams {
  /**
   * Iterate through each line of input.
   */
  public static void main(String[] args) throws IOException {
    InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
    BufferedReader in = new BufferedReader(reader);
    String line;
    
    while ((line = in.readLine()) != null) {
      System.out.println(line);
      
      String[] str = line.split(" ");
      StringBuilder sb = new StringBuilder();
      for(int i = 0; i<str.length;i++)
    	  sb.append(str[i].toLowerCase());

      mapFunctionality obj= new mapFunctionality();
 	  Integer[] storeIndex = new Integer[26];
 	  int temp=0;
      for(int i=0; i<sb.length()-1; i++) {
    	  temp = obj.getRank(sb.charAt(i));
    	  
    	  if(temp != -1)
    		  storeIndex[temp] = temp;
      } 
      
      /* Result to print unmatched alphabets*/
      int counter = 0;
      for(int i=0; i<sb.length()-1;i++) {
    	  if(storeIndex[i] == null || storeIndex[i] == -1) 
    		  counter++;
    	        System.out.print(Character.toString ((char) (i+'a')));
      }
      if(counter == 0)
    	  System.out.println("NULL");
    	  
    	  
      
    }
  }
} 
  class mapFunctionality {
	  
	  public int getRank(char alphabet) {
			 
		  Map<Character,Integer> rank = new HashMap<Character,Integer>();
		  
		  for (int i = 0; i + 'a' <= 'z'; i++) {
			    char key = (char) ('a' + i);
			    int defaultValue = i ;
			    rank.put(key, defaultValue);
		  }
		  
		  if(rank.containsKey(alphabet))
			  return rank.get(alphabet);
		  else 
			  return -1;
  
	  }
	  
  }


