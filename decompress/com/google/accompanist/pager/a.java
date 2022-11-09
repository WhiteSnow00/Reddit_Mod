// 
// Decompiled by Procyon v0.6.0
// 

package com.google.accompanist.pager;

import androidx.compose.runtime.saveable.b;
import z0.d;

public final class a
{
    public static final PagerState a(int n, final int n2, final d d) {
        d.A(1352421093);
        if ((n2 & 0x1) != 0x0) {
            n = 0;
        }
        final PagerState pagerState = (PagerState)b.a(new Object[0], PagerState.h, (zg2.a)new PagerStateKt$rememberPagerState$1(n), d, 4);
        d.I();
        return pagerState;
    }
}
