package com.lancope.option;

import static com.lancope.option.Option.option;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.*;

import org.junit.Test;

public class OptionTest
{
    @Test
    public void testSome() throws Exception {
        String string = "foo";

        Option<String> foo = option(string);

        assertThat(foo, notNullValue());
        assertThat(foo.getOrElse(""), equalTo(string));
    }

    @Test
    public void testNone() throws Exception {
        String nothing = "nothing";

        Option<String> foo = option(null);

        assertThat(foo, notNullValue());
        assertThat(foo.getOrElse(nothing), equalTo(nothing));
    }
}
