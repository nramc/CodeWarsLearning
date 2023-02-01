package dev.codewithram.level.medium.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StripCommentsTest {

    @Test
    void stripComments() {
        assertEquals("apples, pears\ngrapes\nbananas",
                StripComments.stripComments("apples, pears # and bananas\ngrapes\nbananas !apples", new String[]{"#", "!"}));

        assertEquals("a\nc\nd", StripComments.stripComments("a #b\nc\nd $e f g", new String[]{"#", "$"}));

    }

}