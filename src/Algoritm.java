//Duplicate olmayan ən uzun substring

public class Algoritm {
	public static void main(String[] args) {
		
		String word = "jsifuesikjsciwLsjgemosmrldoav";
		
		String longest = "";
		String reserve = "";
		
		for(;word.length() > 0;) {
			
			System.out.println(longest);
			System.out.println(reserve);
			
			char letter = word.charAt(0);
			
			if(!longest.contains(String.valueOf(letter))) {
				longest += letter;
				word = word.replaceFirst(String.valueOf(letter),"");
			}else {
				if(longest.length() > word.length())
					break;
				else {
					if(longest.length() > reserve.length()) {
						reserve = longest;
						longest = "";
					}else {
						longest = "";
					}
				}	
			}
		}
		if(longest.length() > reserve.length()) {
			System.out.println("Ən uzun substring : " + longest + "  Uzunluğu : " + longest.length());
		}else {
			System.out.println("Ən uzun substring : " + reserve + "  Uzunluğu : " + reserve.length());
		}
		
	}
}
