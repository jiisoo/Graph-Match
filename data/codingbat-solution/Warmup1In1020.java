class Warmup1In1020{ 
/* Given 2 int values, return true if either of them is in the range 10..20 
 * inclusive.
 */
public boolean in1020(int a, int b) {
	if((10 <= a && a <= 20) || (10 <= b && b <= 20)){
		return true;
	}else{
		return false;
	}
   
}
}