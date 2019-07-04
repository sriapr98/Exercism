class RaindropConverter {

    String convert(int number) {
    	String result="";int flag=0;
        if(number%3==0){
        	result+="Pling";
        	flag=1;
        }
        if(number%5==0){
        	result+="Plang";
        	flag=1;
        }
        if(number%7==0){
        	result+="Plong";
        	flag=1;
        }
        if(flag==0){
        	result+=Integer.toString(number);
        }
        return result;
    }

}
