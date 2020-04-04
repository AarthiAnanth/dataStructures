package stack;

public class PostfixToInfix {
	String exp = "ab*c+"; 
	PostInfix post=new PostInfix();
    System.out.println(post.checkPostToInfix(exp)); 
}

class PostInfix{
	public char checkPostToInfix(String strg) {
		String result=new String("");
		Stack newStack=new Stack();
		for(int i=0;i<strg.length();i++) {
			if(Character.isLetterOrDigit(strg.charAt(i))) {
				newStack.push(strg.charAt(i)+' ');
			}else {
				char op1=newStack.peek();
				newStack.pop();
				char op2=newStack.peek();
				newStack.pop();
				newStack.push('('+op2+strg.charAt(i)+op1+')');
			}
		}
		return newStack.peek();
	}
}
