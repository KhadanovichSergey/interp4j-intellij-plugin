package dev.khbd.interp4j.intellij.common.grammar.format;

import lombok.Value;

/**
 * Numeric index.
 *
 * @author Sergei_Khadanovich
 */
@Value
public class NumericIndex implements Index {

    int position;
}
