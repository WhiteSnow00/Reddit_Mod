// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.vault.feature.vault.feed.composables;

import y2.c$b;
import z0.d$a;
import com.reddit.marketplace.ui.composables.NftCardKt;
import mg2.l;
import androidx.compose.foundation.layout.SizeKt;
import y2.c;
import mg2.a;
import kotlin.Metadata;
import cg2.j;
import z0.d;
import mg2.p;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
public final class CollectibleAvatarsKt$NftCardItem$$inlined$ConstraintLayout$2 extends Lambda implements p<d, Integer, j>
{
    public final int $$changed;
    public final int $$dirty$inlined;
    public final a $onHelpersChanged;
    public final c $scope;
    public final z92.a $uiModel$inlined;
    
    public CollectibleAvatarsKt$NftCardItem$$inlined$ConstraintLayout$2(final c $scope, final int $$changed, final a $onHelpersChanged, final z92.a $uiModel$inlined, final int $$dirty$inlined) {
        this.$scope = $scope;
        this.$onHelpersChanged = $onHelpersChanged;
        this.$uiModel$inlined = $uiModel$inlined;
        this.$$dirty$inlined = $$dirty$inlined;
        this.$$changed = $$changed;
        super(2);
    }
    
    public /* bridge */ Object invoke(final Object o, final Object o2) {
        this.invoke((d)o, ((Number)o2).intValue());
        return j.a;
    }
    
    public final void invoke(final d d, int n) {
        final int n2 = 2;
        if (((n & 0xB) ^ 0x2) == 0x0 && d.d()) {
            d.j();
        }
        else {
            final c $scope = this.$scope;
            final int b = ((androidx.constraintlayout.compose.a)$scope).b;
            $scope.e();
            final c $scope2 = this.$scope;
            final int n3 = n = ((this.$$changed >> 3 & 0x70) | 0x8);
            if ((n3 & 0xE) == 0x0) {
                n = n2;
                if (d.m((Object)$scope2)) {
                    n = 4;
                }
                n |= n3;
            }
            if ((n & 0x5B) == 0x12 && d.d()) {
                d.j();
            }
            else {
                final c$b d2 = $scope2.d();
                final y2.a a = d2.a();
                final y2.a c = d2.a.c();
                final String c2 = this.$uiModel$inlined.c;
                final j1.d.a f = j1.d.a.f;
                NftCardKt.c(0, 0, d, y2.c.b(SizeKt.k((j1.d)f, (float)232), a, (l)CollectibleAvatarsKt$NftCardItem$1$1.INSTANCE), c2);
                final z92.a $uiModel$inlined = this.$uiModel$inlined;
                d.A(1157296644);
                final boolean m = d.m((Object)a);
                final Object b2 = d.B();
                Object o;
                if (m || (o = b2) == d$a.a) {
                    o = new CollectibleAvatarsKt$NftCardItem$1$2$1(a);
                    d.w(o);
                }
                d.H();
                CollectibleAvatarsKt.b($uiModel$inlined, y2.c.b((j1.d)f, c, (l)o), d, this.$$dirty$inlined & 0xE, 0);
            }
            if (((androidx.constraintlayout.compose.a)this.$scope).b != b) {
                this.$onHelpersChanged.invoke();
            }
        }
    }
}
