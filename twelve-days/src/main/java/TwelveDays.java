class TwelveDays {
	String[] dayName={"first","second","third","fourth","fifth","sixth","seventh","eighth","ninth","tenth","eleventh","twelfth"};
	String[] verseForDay={" a Partridge in a Pear Tree"," two Turtle Doves"," three French Hens"," four Calling Birds"," five Gold Rings"," six Geese-a-Laying"," seven Swans-a-Swimming"," eight Maids-a-Milking"," nine Ladies Dancing"," ten Lords-a-Leaping"," eleven Pipers Piping"," twelve Drummers Drumming"};
    
    String startStringForm(int dayNumber){
    	return "On the "+dayName[dayNumber-1]+" day of Christmas my true love gave to me:";
    }

    String verse(int verseNumber) {
        String res=startStringForm(verseNumber);
        int i;
        for(i=verseNumber-1;i>=0;i--){
        	res+=verseForDay[i];
        	if(verseNumber>1 && i==1)
        		res+=", and";
        	else if(i>0)
        		res+=",";
        	if(i==0)
        		res+=".";
        }
        return res+'\n';
    }

    String verses(int startVerse, int endVerse) {
    	String res="";
        for(int i=startVerse;i<=endVerse;i++){
        	res+=verse(i);
        	if(i!=endVerse)
        		res+='\n';
        }
        return res;
    }
    
    String sing() {
    	return verses(1,12);
    }
    public static void main(String[] args) {
    	TwelveDays obj=new TwelveDays();
    	System.out.println(obj.verses(1,3));
    }
}
