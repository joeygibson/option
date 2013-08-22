package com.lancope.other;

import com.lancope.option.Option;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class OtherPackageTest {
    @Test
    public void testOptionFromDifferentPackage() {
        Option<String> opt = Option.option("bar");

        Assert.assertThat(opt.getOrElse(""), CoreMatchers.equalTo("bar"));
    }
}
