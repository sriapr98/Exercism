class ResistorColor {
	String[] colorsArray = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
    int colorCode(String color) {
    	for(int i=0;i<colorsArray.length;i++){
    		if(colorsArray[i].equals(color))
    			return i;
    	}
    	return 0;
    }

    String[] colors() {
    	return colorsArray;
    }
}
