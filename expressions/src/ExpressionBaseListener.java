public class ExpressionBaseListener extends InterpreterBaseListener{
    int total = 0;
    int totalM = 1;
    @Override public void exitExpressions(InterpreterParser.ExpressionsContext ctx) {
        System.out.println("Final result is "+total);
    }
    @Override public void enterNumExpression(InterpreterParser.NumExpressionContext ctx) {
        if(ctx.PLUS()!=null){
            if(ctx.numExpression(0).INT()!=null && ctx.numExpression(1).INT()!=null ){
                total += Integer.parseInt(ctx.numExpression(0).getText()) +
                      Integer.parseInt(ctx.numExpression(1).getText());
            }
            // Int on left side
            else if(ctx.numExpression(1).INT()!=null){
                total+=Integer.parseInt(ctx.numExpression(1).getText());
            }
            // Int on right side
            else if(ctx.numExpression(0).INT()!=null){
                total+=Integer.parseInt(ctx.numExpression(0).getText());
            }
        }
        else if(ctx.MULT()!=null && ctx.numExpression(0).INT()!=null && ctx.numExpression(1).INT()!=null ){
                Integer one = Integer.parseInt(ctx.numExpression(0).getText());
                Integer two = Integer.parseInt(ctx.numExpression(1).getText());
                total += one*two*totalM;
            }
            else{
                if(ctx.numExpression().size()>1){
                    totalM *= Integer.parseInt(ctx.numExpression(1).getText());
                }
            }
    }
}
