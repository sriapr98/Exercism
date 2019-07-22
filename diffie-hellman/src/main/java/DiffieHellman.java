import java.util.*;
import java.math.*;
class DiffieHellman{
	public BigInteger privateKey(BigInteger prime){
		BigInteger privateKey=new BigInteger(prime.bitLength(),new Random());
		while(privateKey.compareTo(BigInteger.ONE)<0 || privateKey.compareTo(prime)>=0)
			privateKey=new BigInteger(prime.bitLength(),new Random());
		return privateKey;
	}

	public BigInteger publicKey(BigInteger primeA,BigInteger primeB,BigInteger privateKey){
		return primeB.modPow(privateKey,primeA);
	}

	public BigInteger secret(BigInteger prime,BigInteger publicKey,BigInteger privateKey){
		return publicKey.modPow(privateKey,prime);
	}
}