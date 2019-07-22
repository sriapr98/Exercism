class Palindrome{

	public boolean isAlphaNumeric(char ch){
		return (Character.isDigit(ch) || Character.isLetter(ch)) ? true : false;
	}

	public boolean check(String sentence){
		sentence=sentence.toLowerCase();
		int leftPointer=0,rightPointer=sentence.length()-1;
		while(leftPointer<rightPointer){
			if(isAlphaNumeric(sentence.charAt(leftPointer)) && isAlphaNumeric(sentence.charAt(rightPointer))){
				if(sentence.charAt(leftPointer)!=sentence.charAt(rightPointer))
					return false;
				else{
					leftPointer++;
					rightPointer--;
				}
			}
			else{
				while(!isAlphaNumeric(sentence.charAt(leftPointer)))
					leftPointer++;
				while(!isAlphaNumeric(sentence.charAt(rightPointer)))
					rightPointer--;
			}
		}
		return true;
	}
}