package dev.khbd.interp4j.intellij.common.grammar.fmt;

/**
 * Code part in s expression.
 *
 * <p>For example, in fmt("hello, %s$name"), expression part is name.
 *
 * @author Sergei_Khadanovich
 */
public record FormatCode(String expression, Position position) implements FormatExpressionPart {

    @Override
    public FormatExpressionPartKind kind() {
        return FormatExpressionPartKind.CODE;
    }

    @Override
    public void visit(FormatExpressionVisitor visitor) {
        visitor.visitCodePart(this);
    }
}
