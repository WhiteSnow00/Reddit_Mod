// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation;

import q1.e;
import zg2.l;
import kotlin.Metadata;
import pg2.j;
import z0.d;
import zg2.p;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = { 1, 6, 0 }, xi = 48)
final class CanvasKt$Canvas$1 extends Lambda implements p<d, Integer, j>
{
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ j1.d $modifier;
    public final /* synthetic */ l<e, j> $onDraw;
    
    public CanvasKt$Canvas$1(final j1.d $modifier, final l<? super e, j> $onDraw, final int $$changed) {
        this.$modifier = $modifier;
        this.$onDraw = (l<e, j>)$onDraw;
        this.$$changed = $$changed;
        super(2);
    }
    
    public final void invoke(final d d, final int n) {
        b.a(this.$$changed | 0x1, d, this.$modifier, this.$onDraw);
    }
}
