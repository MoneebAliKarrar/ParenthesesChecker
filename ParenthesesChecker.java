
import java.util.Scanner;
public class ParenthesesChecker {

    public static void main(String[] args) {
        int opencount = 0 ;
        System.out.println("PLEASE ENTER THE ARITHMETIC EXPRESSION :");
        Scanner s = new Scanner(System.in);
        String expression = s.nextLine();
        for (char charac : expression.toCharArray() ){
        if (charac == '('){
        opencount += 1;
        }else if(charac == ')'){
        opencount -=1;
         if (opencount < 0) {
                    System.out.println("Parentheses not matched");
                    return;
        }
        
        }
        }
        if (opencount == 0){
            System.out.println("parentheses matched");
        }else {
            System.out.println("parentheses not matched");
        }
        
    
}
}
