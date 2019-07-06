public class PangramChecker {

    public boolean isPangram(String input) {
    	input=input.toLowerCase();
    	int[] alphabets=new int[26];int i;
    	for(i=0;i<input.length();i++){
    		if(input.charAt(i)>='a' && input.charAt(i)<='z')
    			alphabets[input.charAt(i)-97]=1;
    	}
    	for(i=0;i<26;i++)
    		if(alphabets[i]!=1)
    			return false;
    	return true;
    }

}
