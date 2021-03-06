/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.github.fartherp.framework.common.util;

import org.testng.annotations.Test;

import java.math.BigDecimal;

import static org.testng.Assert.assertEquals;

public class BigDecimalUtilTest {

    @Test
    public void testAdd() throws Exception {
        assertEquals(357.0, BigDecimalUtil.add(123, 234));
    }

    @Test
    public void testAdd1() throws Exception {
        BigDecimal v1 = new BigDecimal(123);
        BigDecimal v2 = new BigDecimal(234);
        assertEquals("357.00", BigDecimalUtil.add(v1, v2).toString());
    }

    @Test
    public void testSub() throws Exception {
        assertEquals(-111.0, BigDecimalUtil.sub(123, 234));
    }

    @Test
    public void testSub1() throws Exception {
        BigDecimal v1 = new BigDecimal(123);
        BigDecimal v2 = new BigDecimal(234);
        assertEquals("-111.00", BigDecimalUtil.sub(v1, v2).toString());
    }

    @Test
    public void testMul() throws Exception {
        assertEquals(230.0, BigDecimalUtil.mul(10, 23));
    }

    @Test
    public void testMul1() throws Exception {
        BigDecimal v1 = new BigDecimal(10);
        BigDecimal v2 = new BigDecimal(23);
        assertEquals("230.00", BigDecimalUtil.mul(v1, v2).toString());
    }

    @Test
    public void testDiv() throws Exception {
        assertEquals(2.3, BigDecimalUtil.div(23, 10));
    }

    @Test
    public void testDiv1() throws Exception {
        BigDecimal v1 = new BigDecimal(23);
        BigDecimal v2 = new BigDecimal(10);
        assertEquals("2.30", BigDecimalUtil.div(v1, v2).toString());
    }
}