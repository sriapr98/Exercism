class Hamming {
	String left="";
	String right="";
    Hamming(String leftStrand, String rightStrand) {
        left=leftStrand;
        right=rightStrand;
        checkExceptions();
    }
    void checkExceptions(){
        if(left.length()!=right.length()){
            if(left.length()==0)
                throw new IllegalArgumentException("left strand must not be empty.");
            else if(right.length()==0)
                throw new IllegalArgumentException("right strand must not be empty.");
            else
                throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }
    }
    int getHammingDistance() throws IllegalArgumentException {
    	int count=0;
    	for(int i=0;i<right.length();i++){
    		if(left.charAt(i)!=right.charAt(i))
    			count++;
    	}
    	return count;
    }
}

