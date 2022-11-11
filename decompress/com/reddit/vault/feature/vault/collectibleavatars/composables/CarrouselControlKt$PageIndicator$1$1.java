// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.vault.feature.vault.collectibleavatars.composables;

import aa1.a;
import z0.t0;
import z0.y0;
import z0.c;
import rg2.q;
import z0.d$a;
import androidx.compose.foundation.layout.SizeKt;
import z0.o0;
import androidx.compose.ui.platform.CompositionLocalsKt;
import com.reddit.ui.compose.theme.RedditTheme;
import androidx.compose.runtime.ComposerKt;
import z0.d;
import rg2.r;
import sg2.e;
import kotlin.Metadata;
import hg2.j;
import androidx.compose.foundation.lazy.b;
import rg2.l;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
final class CarrouselControlKt$PageIndicator$1$1 extends Lambda implements l<b, j>
{
    public final /* synthetic */ int $currentPage;
    public final /* synthetic */ int $numberOfPages;
    
    public CarrouselControlKt$PageIndicator$1$1(final int $numberOfPages, final int $currentPage) {
        this.$numberOfPages = $numberOfPages;
        this.$currentPage = $currentPage;
        super(1);
    }
    
    public final void invoke(final b b) {
        e.f((Object)b, "$this$LazyRow");
        b.b(b, this.$numberOfPages, (l)null, (l)null, a.S((Lambda)new r<q0.e, Integer, z0.d, Integer, j>() {
            public final /* synthetic */ int $currentPage = CarrouselControlKt$PageIndicator$1$1.this.$currentPage;
            
            public final void invoke(final q0.e e, final int n, final z0.d d, final int n2) {
                e.f((Object)e, "$this$items");
                int n3 = n2;
                if ((n2 & 0x70) == 0x0) {
                    int n4;
                    if (d.q(n)) {
                        n4 = 32;
                    }
                    else {
                        n4 = 16;
                    }
                    n3 = (n2 | n4);
                }
                if ((n3 & 0x2D1) == 0x90 && d.c()) {
                    d.k();
                }
                else {
                    final q<c<?>, y0, t0, j> a = ComposerKt.a;
                    long n5;
                    if (n == this.$currentPage) {
                        d.A(1861376458);
                        n5 = RedditTheme.a(d).f();
                        d.I();
                    }
                    else {
                        d.A(1861376506);
                        n5 = RedditTheme.a(d).h();
                        d.I();
                    }
                    final float n6 = 8;
                    final float m0 = ((u2.b)d.u((o0)CompositionLocalsKt.e)).M0(n6);
                    final j1.d s = SizeKt.s((j1.d)j1.d.a.f, n6);
                    final o1.r r = new o1.r(n5);
                    d.A(511388516);
                    final boolean i = d.m((Object)r);
                    final boolean j = d.m((Object)m0);
                    final Object b = d.B();
                    Object o;
                    if ((i | j) || (o = b) == d$a.a) {
                        o = new CarrouselControlKt$PageIndicator$1$1$1$1.CarrouselControlKt$PageIndicator$1$1$1$1$1(n5, m0);
                        d.w(o);
                    }
                    d.I();
                    androidx.compose.foundation.b.a(6, d, s, (l)o);
                }
            }
        }, -1186320486, true), 6);
    }
}
