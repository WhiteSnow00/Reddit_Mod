// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.layout;

import c2.t;
import u2.a;
import c2.i0;
import kotlin.Metadata;
import pg2.j;
import z0.d;
import zg2.p;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = { 1, 6, 0 }, xi = 48)
final class SubcomposeLayoutKt$SubcomposeLayout$2 extends Lambda implements p<d, Integer, j>
{
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ p<i0, a, t> $measurePolicy;
    public final /* synthetic */ j1.d $modifier;
    
    public SubcomposeLayoutKt$SubcomposeLayout$2(final j1.d $modifier, final p<? super i0, ? super a, ? extends t> $measurePolicy, final int $$changed, final int $$default) {
        this.$modifier = $modifier;
        this.$measurePolicy = (p<i0, a, t>)$measurePolicy;
        this.$$changed = $$changed;
        this.$$default = $$default;
        super(2);
    }
    
    public final void invoke(final d d, final int n) {
        SubcomposeLayoutKt.a(this.$$changed | 0x1, this.$$default, d, this.$modifier, (p)this.$measurePolicy);
    }
}
