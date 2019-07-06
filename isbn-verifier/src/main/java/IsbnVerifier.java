class IsbnVerifier {

    boolean isValid(String stringToVerify) {
    	int numToMultiply=10,resnum=0,i;
    	for(i=0;i<stringToVerify.length();i++){
    		if(stringToVerify.charAt(i)=='X' && numToMultiply==1){
    			resnum+=(10*numToMultiply);
    			numToMultiply--;
    		}
    		else if(stringToVerify.charAt(i)>='0' && stringToVerify.charAt(i)<='9'){
    			resnum+=((stringToVerify.charAt(i)-48)*numToMultiply);
    			numToMultiply--;
    		}
    	}
    	return resnum%11==0 && numToMultiply==0;
    }

}
