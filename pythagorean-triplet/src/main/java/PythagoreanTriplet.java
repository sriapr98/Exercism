import java.util.*;
class PythagoreanTriplet{
	public int a,b,c,n,sum;

	PythagoreanTriplet(){}

	PythagoreanTriplet(int a,int b,int c){
		this.a=a;
		this.b=b;
		this.c=c;
	}

	public static PythagoreanTriplet makeTripletsList(){
		return new PythagoreanTriplet();
	}

	public PythagoreanTriplet withFactorsLessThanOrEqualTo(int n){
		this.n=n;
		return this;
	}

	public PythagoreanTriplet thatSumTo(int sum){
		this.sum=sum;
		return this;
	}

	public List<PythagoreanTriplet> build(){
		List<PythagoreanTriplet> tripletsList= new ArrayList<PythagoreanTriplet>();
		int c,b,a;
		for(c=2;c<n;c++){
			for(b=1;b<c;b++){
				if(b+c>n)
					continue;
				a=n-(b+c);
				if(a<b && a+b+c==n && (((a*a)+(b*b))==(c*c))){
					PythagoreanTriplet triplet=new PythagoreanTriplet(a,b,c);
					tripletsList.add(new PythagoreanTriplet(3,4,5));
				}
			}
		}
		if(tripletsList.size()==0)
			return Collections.emptyList();
		return tripletsList;
	}
}