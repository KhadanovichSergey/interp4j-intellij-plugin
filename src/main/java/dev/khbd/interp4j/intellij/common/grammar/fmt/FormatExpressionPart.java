package dev.khbd.interp4j.intellij.common.grammar.fmt;

/**
 * Format expression part model.
 *
 * @author Sergei Khadanovich
 */
public sealed interface FormatExpressionPart permits FormatCode, FormatSpecifier, FormatText {

    /**
     * Get expression part kind.
     */
    FormatExpressionPartKind kind();

    /**
     * Visit expression part.
     */
    void visit(FormatExpressionVisitor visitor);

    /**
     * Get part position.
     */
    Position position();

    /**
     * Is expression part text or not.
     *
     * @return {@literal true} if expression part is text and {@literal false} otherwise
     */
    default boolean isText() {
        return kind() == FormatExpressionPartKind.TEXT;
    }

    /**
     * Is expression part specifier or not.
     *
     * @return {@literal true} if expression part is specifier and {@literal false} otherwise
     */
    default boolean isSpecifier() {
        return kind() == FormatExpressionPartKind.SPECIFIER;
    }

    /**
     * Is expression part code or not.
     *
     * @return {@literal true} if expression part is code and {@literal false} otherwise
     */
    default boolean isCode() {
        return kind() == FormatExpressionPartKind.CODE;
    }
}
