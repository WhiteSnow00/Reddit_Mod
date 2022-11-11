// 
// Decompiled by Procyon v0.6.0
// 

package com.google.accompanist.pager;

import zg2.p;
import androidx.compose.foundation.lazy.LazyListState;
import yl.a;
import n02.r;
import dev.chrisbanes.snapper.SnapOffsets;
import dev.chrisbanes.snapper.SnapperFlingBehaviorDefaults;
import k0.s;
import ah2.f;
import dev.chrisbanes.snapper.SnapperFlingBehavior;
import z0.d;
import l0.d0;
import l0.n;
import cf2.b;
import zg2.q;

public final class PagerDefaults
{
    public static final q<b, Integer, Integer, Integer> a;
    
    static {
        final PagerDefaults$singlePageFlingDistance$1 instance = PagerDefaults$singlePageFlingDistance$1.INSTANCE;
        a = (q)PagerDefaults$singlePageSnapIndex$1.INSTANCE;
    }
    
    public static SnapperFlingBehavior a(final PagerState pagerState, n a, d0 a2, float n, final d d, final int n2, final int n3) {
        f.f((Object)pagerState, "state");
        d.A(132228799);
        if ((n3 & 0x2) != 0x0) {
            a = s.a(d);
        }
        if ((n3 & 0x4) != 0x0) {
            a2 = SnapperFlingBehaviorDefaults.a;
        }
        if ((n3 & 0x8) != 0x0) {
            n = 0;
        }
        final q<b, Integer, Integer, Integer> a3 = PagerDefaults.a;
        f.f((Object)a3, "snapIndex");
        d.A(-776119664);
        final LazyListState a4 = pagerState.a;
        final p a5 = SnapOffsets.a;
        f.f((Object)a4, "lazyListState");
        d.A(-632875458);
        final SnapperFlingBehavior a6 = a.a1(r.S(a4, a5, n, d, 0), a, (l0.d)a2, (q)a3, d, 0);
        d.I();
        d.I();
        d.I();
        return a6;
    }
}
