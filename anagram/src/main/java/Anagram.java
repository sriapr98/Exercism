import java.util.*;
public class Anagram {
	 String source;
	 ArrayList<String> resultArray=new ArrayList<String>();

	Anagram(String source){
		this.source=source;
	}

	ArrayList<String> match(List<String> checkStrings){

		for (int i=0;i<checkStrings.size();i++ ) {
			if(areAnagrams(source,checkStrings.get(i))){
				resultArray.add(checkStrings.get(i));
			}
		}
		return resultArray;
	}

	Boolean areAnagrams(String str1,String str2){
		int[] count1=new int[52];
		int i;
		if(str1.length()!=str2.length())
			return false;
		else if(str1.equalsIgnoreCase(str2)){
			return false;
		}
		else{
			for(i=0;i<str1.length();i++){
				if(str1.charAt(i)>='a')
					count1[str1.charAt(i)-97]++;
				else
					count1[str1.charAt(i)-'A']++;

				if(str2.charAt(i)>='a')
					count1[str2.charAt(i)-97]--;
				else
					count1[str2.charAt(i)-'A']--;
			}
			for(i=0;i<52;i++){
				if(count1[i]>0)
					return false;
			}
			return true;
		}
	}

}