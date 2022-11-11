// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.text.selection;

import kotlin.Metadata;
import pg2.j;
import z0.d;
import zg2.p;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = { 1, 6, 0 }, xi = 48)
final class SimpleLayoutKt$SimpleLayout$2 extends Lambda implements p<d, Integer, j>
{
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ p<d, Integer, j> $content;
    public final /* synthetic */ j1.d $modifier;
    
    public SimpleLayoutKt$SimpleLayout$2(final j1.d $modifier, final p<? super d, ? super Integer, j> $content, final int $$changed, final int $$default) {
        this.$modifier = $modifier;
        this.$content = (p<d, Integer, j>)$content;
        this.$$changed = $$changed;
        this.$$default = $$default;
        super(2);
    }
    
    public final void invoke(final d d, final int n) {
        b.a(this.$$changed | 0x1, this.$$default, d, this.$modifier, (p)this.$content);
    }
}
