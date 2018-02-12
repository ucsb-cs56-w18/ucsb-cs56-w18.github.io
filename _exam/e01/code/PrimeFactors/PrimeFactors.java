import java.util.ArrayList;

public class Factors extends ArrayList<Integer> {

    /* Precondition: this object contains a list of factors
       computed from some number.  All but the last is guaranteed
       to be a prime number.

       Postcondition: If the last element is a prime number,
        return the same ArrayList, unchanged.

       Otherwise, take the last element, factor out one prime factor,
       and replace the last element with two elements; the prime
       factor, and the product of the remaining factors. 
     */
    
    public void addNextFactor(int num) {
	int lastElement = 
	    this.get(this.size() - 1);
	for (int i=2; i<num/2; i++) {
	    if (lastElement % i == 0) {
		this.replaceLastElement(i);
		this.add(num/i);
		return;
	    }
	}
    }

    public Factors primeFactors(int num) {
	Factors f = new Factors();
	f.add(num);
	int prevSize = 0;
	while ( this.size() != prevSize) {
	    prevSize = this.size();
	    this.addNextFactor();
	}
    }

}
