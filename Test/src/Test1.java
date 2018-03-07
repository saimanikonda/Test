import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test1 { //Main1
  /**
   * Iterate through each line of input.
   */
  public static void main(String[] args) throws IOException {
    InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
    BufferedReader in = new BufferedReader(reader);
    String line;
    Test1 obj = new Test1();
    
    while ((line = in.readLine()) != null) {
      System.out.println(line);
      List<String> list = new ArrayList<String>();
      list = Arrays.asList(line.split(" "));
      
      List<String> hand1 = new ArrayList<String>();
      List<String> hand2 = new ArrayList<String>();
      List<Integer> value1 = new ArrayList<Integer>();
      List<Integer> value2 = new ArrayList<Integer>();
      for (int i=0,j=5; i<5 & j<10; i++,j++) {
    	  hand1.add(list.get(i));
      	  hand2.add(list.get(j));
      	  char[] v1 = ((hand1.get(i)).toString()).toCharArray();
      	  value1.add(obj.rankCards(v1[0]));
      	  v1 = ((hand2.get(i)).toString()).toCharArray();
      	  value2.add(obj.rankCards(v1[0]));
      }
      
      System.out.println(value1);
      System.out.println(obj.highCard(value1,value2));
 
    }
  }
  
  public String highCard(List value1, List value2 ) {  
	  char[] highValueCard;
	  Test1 obj = new Test1();
	  Collections.sort(value1);
	  Collections.sort(value2);
	  value1.size();
	  
	  int h1 = Integer.parseInt(value1.get(4).toString());
	  int h2 = Integer.parseInt(value2.get(4).toString());
	  if(h1 < h2)
		  return "Right";
	  else if (h1 > h2)
		  return "Left";
	  else 
		  return "None";
				
	  

	  
}
		  
	  
	  
  
  public int rankCards(char cardvalue) {
	   Map<Character,Integer> cardRanks = new HashMap<Character,Integer>();
	    cardRanks.put('A', 14);
	    cardRanks.put('K', 13);
	    cardRanks.put('Q', 12);
	    cardRanks.put('J', 11);
	    cardRanks.put('T', 10);
	    cardRanks.put('9', 9);
	    cardRanks.put('8', 8);
	    cardRanks.put('7', 7);
	    cardRanks.put('6', 6);
	    cardRanks.put('5', 5);
	    cardRanks.put('4', 4);
	    cardRanks.put('3', 3);
	    cardRanks.put('2', 2);
	    
	   return cardRanks.get(cardvalue) ;
	  
  }
}
