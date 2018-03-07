
public class CommonSuffix {
	
	public static void main (String[] args) {
		String s1 = "commonsuffix";
		String s2 = "nsuffix";
		CommonSuffix cs = new CommonSuffix();
		cs.findSuffix(s1,s2);
	}
	
	public void findSuffix(String s1, String s2) {
	
		StringBuilder sb = new StringBuilder();
		int count = 0;
		char c1[] = s1.toCharArray();
		char c2[] = s2.toCharArray();
		
		for (int i=s1.length()-1, j=s2.length()-1; i>=0 & j>=0 ; i--,j--) {
			try {
		     if(c1[i] == c2[j])
		    	 count++;
		    	 continue;
			}
		    catch(ArrayIndexOutOfBoundsException  e){
				System.out.println(e);
			}
		}
		
	    for (int k=s1.length()-1; k>s1.length()-count-1; k--) 
	    	sb.append(c1[k]); 
		System.out.println(sb.reverse());
		
	}
}
