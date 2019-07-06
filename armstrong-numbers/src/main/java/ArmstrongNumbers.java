import java.lang.*;
class ArmstrongNumbers {

	boolean isArmstrongNumber(int numberToCheck) {
		int i,temp=numberToCheck,numDigits=0,resNum=0;
		while(temp!=0){
			numDigits++;
			temp/=10;
		}
		temp=numberToCheck;
		while(temp!=0){
			resNum+=Math.pow(temp%10,numDigits);
			temp/=10;
		}		
		if(resNum==numberToCheck)
			return true;
		else
			return false;
	}

}
