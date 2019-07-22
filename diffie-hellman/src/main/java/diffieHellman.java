import java.util.*;
import java.math.*;
class diffieHellman{
	public BigInteger privateKey(BigInteger prime){
		BigInteger privateKey=new BigInteger(prime.bitLength(),new Random());
		while(privateKey.compareTo(BigInteger.ONE)<=1 || privateKey.compareTo(prime)==1)
			privateKey=new BigInteger(prime.bitLength(),new Random());
		return privateKey;
	}

	public BigInteger publicKey(BigInteger primeA,BigInteger primeB,BigInteger privateKey){
		return primeA.modPow(primeB,privateKey);
	}

	public BigInteger secretKey(BigInteger prime,BigInteger publicKey,BigInteger privateKey){
		return publicKey.modPow(prime,privateKey);
	}
}