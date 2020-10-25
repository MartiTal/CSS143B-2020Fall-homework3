package Problem1;

public class ValidParentheses {

    // Do not change signature (function name, parameters, return type)
    public static boolean isValid(String str) {
        LinkedListStack<Character> lefties = new LinkedListStack<Character>();

        lefties.push('*'); //To avoid a NullPointerException, I have added a star

        if (str == null) { //Speaking of null, the input String must be checked
            return true;
        }

        for (int i = 0; i < str.length(); i++) { //Go through the entire input String

            if (str.charAt(i) == ')') { //Check for matching round parenthesis on top of stack
                if (lefties.peek() == '(') {
                    lefties.pop();
                } else {
                    return false; //String must be invalid
                }
            } else if (str.charAt(i) == '}') { //Check for matching curly parenthesis on top of stack
                if (lefties.peek() == '{') {
                    lefties.pop();
                } else {
                    return false; //String must be invalid
                }
            } else if (str.charAt(i) == ']') { //Check for matching rectangular parenthesis on top of stack
                if (lefties.peek() == '[') {
                    lefties.pop();
                } else {
                    return false; //String must be invalid
                }
            } else { //If the current char is a left parenthesis
                lefties.push(str.charAt(i));
            }

        }
        if (lefties.peek() == '*') {
            return true; //String must be valid if the code gets to here and there is nothing in the stack (besides my beautiful star)
        } else {
            return false;
        }
    }
}
