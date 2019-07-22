import java.util.*;
class BracketChecker{
	private String test;
	
	BracketChecker(String test){
		this.test=test;
	}

	public boolean areBracketsMatchedAndNestedCorrectly(){
		int i;
		Stack<Character> st=new Stack<Character>();
		for(i=0;i<test.length();i++){
			if(test.charAt(i)=='(' || test.charAt(i)=='{' || test.charAt(i)=='[')
				st.push(test.charAt(i));
			else if(test.charAt(i)==')' || test.charAt(i)=='}' || test.charAt(i)==']'){
				if(st.empty())
					return false;
				Character ch=st.pop();
				if((ch=='[' && test.charAt(i)==']') || (ch=='{' && test.charAt(i)=='}') || (ch=='(' && test.charAt(i)==')'))
					continue;
				else
					return false;
			}
		}
		if(st.empty())
			return true;
		return false;
	}

}