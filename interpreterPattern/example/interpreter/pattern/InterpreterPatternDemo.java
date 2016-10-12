package example.interpreter.pattern;

public class InterpreterPatternDemo {

    public static Expression getMaleExpression() {
        Expression robert = new TerminalExpression("robert");
        Expression john  = new TerminalExpression("john");
        return new OrExpression(robert, john);
    }
    
    public static Expression getFemaleExpression(){
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("married");
        return new AndExpression(julie, married);
    }
    
    public static void main(String[] args) {
        
        Expression isMale = getMaleExpression();
        Expression isFemaleMarried = getFemaleExpression();
        
        System.out.println("is john male ? " + isMale.interpret("John is male"));
        
        System.out.println();
        
    }
}
