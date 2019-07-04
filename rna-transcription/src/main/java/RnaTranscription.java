class RnaTranscription {

    String transcribe(String dnaStrand) {
    	String res="";
    	for(int i=0;i<dnaStrand.length();i++){
    		if(dnaStrand.charAt(i)=='G')
    			res+="C";
    		else if(dnaStrand.charAt(i)=='C')
    			res+="G";
    		else if(dnaStrand.charAt(i)=='T')
    			res+="A";
    		else if(dnaStrand.charAt(i)=='A')
    			res+="U";
    	}
    	return res;
    }

}
