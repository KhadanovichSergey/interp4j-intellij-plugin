package dev.khbd.interp4j.intellij.common.grammar.fmt;

/**
 * Conversion part in format specifiers.
 *
 * <p>Conversion can be one or two symbol string. See {@link java.util.Formatter} documentation
 * for more details about allowed symbols and their meanings.
 *
 * @author Sergei_Khadanovich
 */
public record Conversion(String symbols) {
}
