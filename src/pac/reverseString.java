package pac;

public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String word="abcde";
		int wlen=word.length();
		System.out.println(wlen);
		
		System.out.println(word.charAt(wlen-1));
		System.out.println(word.charAt(wlen-2));
		System.out.println(word.charAt(wlen-3));
		System.out.println(word.charAt(wlen-4));
		System.out.println(word.charAt(wlen-5));
		String rev="";
		for(int i=word.length()-1;i>=0;i--)
		{
			rev=rev+word.charAt(i);
			//System.out.println(rev);
			
		}
		
		System.out.println(rev);

	}

}
