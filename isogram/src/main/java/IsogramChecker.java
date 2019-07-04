class IsogramChecker {

    boolean isIsogram(String phrase) {
    	int[] letters=new int[26];
    	int i;
    	for(i=0;i<phrase.length();i++){
    		if(phrase.charAt(i)>='a' && phrase.charAt(i)<='z'){
    			if(letters[phrase.charAt(i)-'a']>0)
    				return false;
    			else
    				letters[phrase.charAt(i)-'a']++;
    		}
    		if(phrase.charAt(i)>='A' && phrase.charAt(i)<='Z'){
    			if(letters[phrase.charAt(i)-'A']>0)
    				return false;
    			else
    				letters[phrase.charAt(i)-'A']++;
    		}
    	}
    	return true;
    }

}
