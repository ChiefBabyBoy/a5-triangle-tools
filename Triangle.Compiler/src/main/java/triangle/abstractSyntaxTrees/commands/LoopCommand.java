package triangle.abstractSyntaxTrees.commands;

import triangle.abstractSyntaxTrees.expressions.Expression;
import triangle.abstractSyntaxTrees.visitors.CommandVisitor;
import triangle.syntacticAnalyzer.SourcePosition;

public class LoopCommand extends Command {

    public LoopCommand(Command c1AST, Expression eAST, Command c3AST, SourcePosition position) {
        super(position);
        C1 = c1AST;
        E = eAST;
        C3 = c3AST;
    }

    public <TArg, TResult> TResult visit(CommandVisitor<TArg, TResult> v, TArg arg) {
        return v.visitLoopCommand(this, arg);
    }

    public final Command C1, C3;
    public final Expression E;
}
