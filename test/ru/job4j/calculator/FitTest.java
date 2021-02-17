package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
public class FitTest {

    @Test
    public void whenMan187Weight100() {
        short in = 187;
        double expected = 100;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.05);
    }

    @Test
    public void whenwoman160Weight57() {
        short in = 160;
        double expected = 57;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 0.50);
    }
}