package com.stack.implementation;

public class InfixToPrefix {

	public static void main(String[] args) {
		InfixPrefix evaluate=new InfixPrefix();
		String exp = "(A-B/C)*(A/K-L)"; 
        System.out.println(evaluate.convertToPrefix(exp)); 
	}
}

class InfixPrefix{
	public String convertToPrefix(String str) {
		String result=new String("");
		String reverse=reverse(str);
		InfixPostfix post=new InfixPostfix();
		String changed=post.infixPostfixCheck(reverse);
		return reverse(changed);
		
			}
	public String reverse(String str) {
		String reverse="";
		char[] try1 = str.toCharArray(); 
		for (int i = try1.length-1; i>=0; i--) 
			if(try1[i]=='(')
				reverse+=')';
			else if(try1[i]==')')
				reverse+='(';
			else
				reverse+=try1[i];
		return reverse;
	}
}
