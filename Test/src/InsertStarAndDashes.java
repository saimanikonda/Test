
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InsertStarAndDashes {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please Enter Number String");
		String numberString = br.readLine();

		if (numberString != null) {

			char[] charArray = numberString.toCharArray();
			StringBuilder sb = new StringBuilder();
			sb.append(charArray[0]);
			
			for (int i = 0; i < charArray.length-1 ; i++) {
				int firstElement = Integer.parseInt(String.valueOf(charArray[i]));
				int nextElement = Integer.parseInt(String.valueOf(charArray[i + 1]));
				
				if (firstElement == 0) {
					sb.append(nextElement);
				}
				else if(firstElement%2 == 0 & nextElement%2 == 0 ) {
					sb.append("*" + nextElement);
					
				}
				else if(firstElement%2 != 0 & nextElement%2 != 0) {
					sb.append("-"+nextElement);
				}
				else {
					sb.append(nextElement);
				}
			}

			System.out.println(sb);
		}
	}
}
