import java.util.Stack;

/*
 * Write a program to check if a given string of parentheses, brackets, and braces is balanced. 
For instance, "({[]})" is balanced, but "({[)})" is not
Input - (Abc[i]) or (Abc[2])
Output true
Input ((Abc[i]) or (Abc[2])) 
Output true
Input ((Abc[i]) or Abc[2)])
Output False

 */
public class finfding_paranthesis {

	public static void main(String[] args) {
		
		String str="((Abc[i]) or (Abc[2]))";
		String brac="";
		for(int i=0;i<str.length();i++) {
			if(!Character.isAlphabetic(str.charAt(i)) && !Character.isDigit(str.charAt(i)) && !Character.isWhitespace(str.charAt(i))){
				brac+=str.charAt(i);
			}
		}
		System.out.println(brac);
		Stack<Character> stack=new Stack<>();
		
		for(int i=0;i<brac.length();i++) {
			
			char currword=brac.charAt(i);
			if(currword=='{' || currword=='[' || currword=='(') {
				stack.push(currword);
			}else{
				if(stack.isEmpty()) {
				break;
				}
			
			char prechar=stack.peek();
			
			if((currword=='}' && prechar!='{') || (currword==']' && prechar!='[') || (currword==')' && prechar!='(') ) {
				break;
			}else {
				stack.pop();
			}
		}
		}
		if(stack.isEmpty()) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}
}
/*
 * input:-
 * ((Abc[i]) or (Abc[2]))
 * 
 * Output:-
 * (([])([]))
 *	true
 */
