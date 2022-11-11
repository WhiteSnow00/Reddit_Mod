// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.vault.feature.vault.feed.composables;

import y2.c$b;
import z0.d$a;
import com.reddit.marketplace.ui.composables.NftCardKt;
import rg2.l;
import androidx.compose.foundation.layout.SizeKt;
import y2.c;
import rg2.a;
import kotlin.Metadata;
import hg2.j;
import z0.d;
import rg2.p;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
public final class CollectibleAvatarsKt$NftCardItem$$inlined$ConstraintLayout$2 extends Lambda implements p<z0.d, Integer, j>
{
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$dirty$inlined;
    public final /* synthetic */ a $onHelpersChanged;
    public final /* synthetic */ c $scope;
    public final /* synthetic */ fa2.a $uiModel$inlined;
    
    public CollectibleAvatarsKt$NftCardItem$$inlined$ConstraintLayout$2(final c $scope, final int $$changed, final a $onHelpersChanged, final fa2.a $uiModel$inlined, final int $$dirty$inlined) {
        this.$scope = $scope;
        this.$onHelpersChanged = $onHelpersChanged;
        this.$uiModel$inlined = $uiModel$inlined;
        this.$$dirty$inlined = $$dirty$inlined;
        this.$$changed = $$changed;
        super(2);
    }
    
    public final void invoke(final z0.d d, int n) {
        final int n2 = 2;
        if (((n & 0xB) ^ 0x2) == 0x0 && d.c()) {
            d.k();
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
            if ((n & 0x5B) == 0x12 && d.c()) {
                d.k();
            }
            else {
                final c$b d2 = $scope2.d();
                final y2.a a = d2.a();
                final y2.a c = d2.a.c();
                final String c2 = this.$uiModel$inlined.c;
                final j1.d.a f = j1.d.a.f;
                NftCardKt.c(0, 0, d, y2.c.b(SizeKt.k((j1.d)f, (float)232), a, (l)CollectibleAvatarsKt$NftCardItem$1$1.INSTANCE), c2);
                final fa2.a $uiModel$inlined = this.$uiModel$inlined;
                d.A(1157296644);
                final boolean m = d.m((Object)a);
                final Object b2 = d.B();
                l l;
                if (m || (l = (l)b2) == d$a.a) {
                    l = new CollectibleAvatarsKt$NftCardItem$1$2$1(a);
                    d.w((Object)l);
                }
                d.I();
                CollectibleAvatarsKt.b($uiModel$inlined, y2.c.b((j1.d)f, c, (l)l), d, this.$$dirty$inlined & 0xE, 0);
            }
            if (((androidx.constraintlayout.compose.a)this.$scope).b != b) {
                this.$onHelpersChanged.invoke();
            }
        }
    }
}
