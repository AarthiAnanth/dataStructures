package com.stack.implementation;

public class InfixtoPostfixConversion {

	public static void main(String[] args) {
		InfixPostfix evaluate=new InfixPostfix();
		String exp = "a+b*(c^d-e)^(f+g*h)-i"; 
        System.out.println(evaluate.infixPostfixCheck(exp)); 
	}
}
	
class InfixPostfix{
	public int operatorCheck(char c) {
		switch(c){
	
		case '+':
		case'-':
			return 1;
		case '*':
		case '/':
			return 2;
		case '^':
			return 3;
		}
		return -1;
	}
	
	public String infixPostfixCheck(String strg) {
		String result=new String("");
		Stack operatorStack=new Stack();
		for(int i=0;i<strg.length();i++) {
			char c=strg.charAt(i);
			if(Character.isLetterOrDigit(c)) {
				result+=c;
			}else if(c=='(') {
				operatorStack.push(c);
			}else if(c==')') {
				while(!operatorStack.isEmpty()&& operatorStack.peek()!=')') 
					result+=operatorStack.pop();
				if(!operatorStack.isEmpty()&& operatorStack.peek()!=')') 
					return "Invalid Expression";
				else
					operatorStack.pop();
				
			}else {
				while(!operatorStack.isEmpty() && operatorCheck(c)<=operatorCheck(operatorStack.peek())) {
					if(operatorStack.peek() == '(') 
                        return "Invalid Expression";
					result+=operatorStack.pop();
				}
				operatorStack.push(c);
			}
		}
		while (!operatorStack.isEmpty()){ 
            if(operatorStack.peek() == '(') 
                return "Invalid Expression"; 
            result += operatorStack.pop(); 
         } 
        return result;
	}
}

