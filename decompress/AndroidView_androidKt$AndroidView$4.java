// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.viewinterop;

import android.content.Context;
import rg2.l;
import kotlin.Metadata;
import hg2.j;
import z0.d;
import rg2.p;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = { 1, 6, 0 }, xi = 48)
final class AndroidView_androidKt$AndroidView$4 extends Lambda implements p<z0.d, Integer, j>
{
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ l<Context, Object> $factory;
    public final /* synthetic */ j1.d $modifier;
    public final /* synthetic */ l<Object, j> $update;
    
    public AndroidView_androidKt$AndroidView$4(final l<? super Context, Object> $factory, final j1.d $modifier, final l<Object, j> $update, final int $$changed, final int $$default) {
        this.$factory = (l<Context, Object>)$factory;
        this.$modifier = $modifier;
        this.$update = $update;
        this.$$changed = $$changed;
        this.$$default = $$default;
        super(2);
    }
    
    public final void invoke(final z0.d d, final int n) {
        AndroidView_androidKt.a(this.$$changed | 0x1, this.$$default, d, this.$modifier, this.$factory, this.$update);
    }
}
