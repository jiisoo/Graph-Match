class Warmup1Starthi{ 
/* Given a string, return true if the string starts with "hi" and false 
 * otherwise.
 */
public boolean startHi(String str) {
	if(str.length() >= 2 && str.substring(0, 2).equals("hi")){
		return true;
	}else{
		return false;
	}
}
}