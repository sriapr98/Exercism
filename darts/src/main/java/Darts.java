import java.math.*;
class Darts {
	double x,y;
    Darts(double x, double y) {
    	this.x=x;
    	this.y=y;
    }

    int score() {
    	double dist=Math.sqrt((x*x)+(y*y));
    	if(dist<=1.0)
    		return 10;
    	else if(dist<=5.0)
    		return 5;
    	else if(dist<=10.0)
    		return 1;
    	else
    		return 0;
    }

}
