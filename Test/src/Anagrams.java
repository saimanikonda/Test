
import java.util.*;

class Anagrams {
	public static void main(String[] args) {
		System.out.println(angrams("abcdef"));
	}
	static Set<String>  angrams(String in) {
		Set<Integer> indices = new HashSet<Integer>();
	
		for(int i = 0; i < in.length(); i++) {
			indices.add(i);
		}
		System.out.println(indices);
		
		Set<String> out = new HashSet<String>();
		for(StringBuilder sb : angrams(in, indices)) {
			out.add(sb.toString());
		}
		return out;
	}
	
	static Set<StringBuilder>  angrams(String in, Set<Integer> indices) {
		Set<StringBuilder> out = new HashSet<StringBuilder>();
		if(indices.isEmpty()) {
			out.add(new StringBuilder());
			return out;
		}
			
		for(Iterator<Integer> it = indices.iterator(); it.hasNext();) {
			Integer i = it.next(); 
			
			Set<Integer> newIndices = new HashSet<Integer>(indices);
			newIndices.remove(i);
			for(StringBuilder suffix : angrams(in, newIndices)) {
				suffix.insert(0, in.charAt(i));
				out.add(suffix);
			}
		}
		return out;
	}
}