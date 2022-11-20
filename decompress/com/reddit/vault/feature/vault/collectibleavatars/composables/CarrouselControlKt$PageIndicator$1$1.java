// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.vault.feature.vault.collectibleavatars.composables;

import xd.a;
import mg2.q;
import z0.d$a;
import androidx.compose.foundation.layout.SizeKt;
import z0.m0;
import androidx.compose.ui.platform.CompositionLocalsKt;
import com.reddit.ui.compose.theme.RedditTheme;
import androidx.compose.runtime.ComposerKt;
import z0.d;
import mg2.r;
import ng2.e;
import kotlin.Metadata;
import cg2.j;
import androidx.compose.foundation.lazy.b;
import mg2.l;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
final class CarrouselControlKt$PageIndicator$1$1 extends Lambda implements l<b, j>
{
    public final int $currentPage;
    public final int $numberOfPages;
    
    public CarrouselControlKt$PageIndicator$1$1(final int $numberOfPages, final int $currentPage) {
        this.$numberOfPages = $numberOfPages;
        this.$currentPage = $currentPage;
        super(1);
    }
    
    public /* bridge */ Object invoke(final Object o) {
        this.invoke((b)o);
        return j.a;
    }
    
    public final void invoke(final b b) {
        e.f((Object)b, "$this$LazyRow");
        b.f(b, this.$numberOfPages, (l)null, (l)null, a.D((Lambda)new r<q0.e, Integer, d, Integer, j>(this.$currentPage) {
            public final int $currentPage;
            
            public /* bridge */ Object invoke(final Object o, final Object o2, final Object o3, final Object o4) {
                this.invoke((q0.e)o, ((Number)o2).intValue(), (d)o3, ((Number)o4).intValue());
                return j.a;
            }
            
            public final void invoke(final q0.e e, final int n, final d d, final int n2) {
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
                if ((n3 & 0x2D1) == 0x90 && d.d()) {
                    d.j();
                }
                else {
                    final q a = ComposerKt.a;
                    long n5;
                    if (n == this.$currentPage) {
                        d.A(1861376458);
                        n5 = RedditTheme.a(d).f();
                        d.H();
                    }
                    else {
                        d.A(1861376506);
                        n5 = RedditTheme.a(d).h();
                        d.H();
                    }
                    final float n6 = 8;
                    final float m0 = ((u2.b)d.u((m0)CompositionLocalsKt.e)).M0(n6);
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
                    d.H();
                    androidx.compose.foundation.b.a(6, d, s, (l)o);
                }
            }
        }, -1186320486, true), 6);
    }
}
