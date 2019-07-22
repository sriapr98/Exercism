class Scrabble {
	private String word;
	private int[] ScrabbleScoreArray={1,3,3,2,1,4,2,4,1,8,5,1,3,1,1,3,10,1,1,1,1,4,4,8,4,10};
	private int score=0;
    Scrabble(String word) {
    	this.word=word;
    	for(int i=0;i<word.length();i++){
    		if(word.charAt(i)>='A' && word.charAt(i)<='Z')
    			score+=ScrabbleScoreArray[word.charAt(i)-'A'];
    		else if(word.charAt(i)>='a' && word.charAt(i)<='z')
    			score+=ScrabbleScoreArray[word.charAt(i)-'a'];
    	}

    }

    int getScore() {
    	return score;
    }

}
