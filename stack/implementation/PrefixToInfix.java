package stack;

public class PrefixToInfix {
	public static void main(String[] args) {
		String exp = "*-A/BC-/AKL"; 
		PreInfix prefix=new PreInfix();
		System.out.println(prefix.checkPreToInfix(exp));
		}
}

class PreInfix{
	public String checkPreToInfix(String strg) {
		String result=new String("");
		Stack newStack=new Stack();
		String rev=reverse(strg);
		System.out.println("Reverse"+rev);
		for(int i=0;i<rev.length();i++) {
			if(Character.isLetterOrDigit(rev.charAt(i))) {
				newStack.push(rev.charAt(i)+"");
			}else {
				String op1=newStack.peek();
				newStack.pop();
				String op2=newStack.peek();
				newStack.pop();
				newStack.push(")"+op2+rev.charAt(i)+op1+"(");
			}
		}
		return reverse(newStack.peek());
	}
	
	public String reverse(String str) {
		String reverseString="";
		for(int i=str.length()-1;i>=0;--i) {
			reverseString+=str.charAt(i);
		}
		return reverseString;
	}
}

