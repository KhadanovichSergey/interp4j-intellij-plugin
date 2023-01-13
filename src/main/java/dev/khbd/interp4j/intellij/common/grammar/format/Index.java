package dev.khbd.interp4j.intellij.common.grammar.format;

/**
 * Index part in format specifier.
 *
 * <p>Index can be numeric and implicit.
 * Numeric index is written as 1$, 2$ and so on.<br>
 * Implicit index is written as {@literal <} symbol.
 *
 * @author Sergei_Khadanovich
 * @see java.util.Formatter
 */
public sealed interface Index permits NumericIndex, ImplicitIndex {
}
