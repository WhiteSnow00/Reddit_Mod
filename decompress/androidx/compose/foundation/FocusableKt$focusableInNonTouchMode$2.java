// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation;

import d2.e;
import androidx.compose.ui.platform.p0;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.focus.FocusPropertiesKt;
import zg2.l;
import z0.o0;
import androidx.compose.ui.platform.CompositionLocalsKt;
import v1.b;
import ah2.f;
import o0.j;
import kotlin.Metadata;
import j1.d;
import zg2.q;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = { "\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002" }, d2 = { "Lj1/d;", "invoke", "(Lj1/d;Lz0/d;I)Lj1/d;", "<anonymous>" }, k = 3, mv = { 1, 6, 0 })
final class FocusableKt$focusableInNonTouchMode$2 extends Lambda implements q<d, z0.d, Integer, d>
{
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ j $interactionSource;
    
    public FocusableKt$focusableInNonTouchMode$2(final boolean $enabled, final j $interactionSource) {
        this.$enabled = $enabled;
        this.$interactionSource = $interactionSource;
        super(3);
    }
    
    public final d invoke(d b, final z0.d d, final int n) {
        f.f((Object)b, "$this$composed");
        d.A(-618949501);
        final b b2 = (b)d.t(CompositionLocalsKt.j);
        final d.a f = d.a.f;
        final l<m1.j, pg2.j> l = (l<m1.j, pg2.j>)new l<m1.j, pg2.j>() {
            public final void invoke(final m1.j j) {
                ah2.f.f((Object)j, "$this$focusProperties");
                j.a(b2.a() == 1 ^ true);
            }
        };
        final e a = FocusPropertiesKt.a;
        final m1.l i = new m1.l((l<? super m1.j, pg2.j>)l, (l<? super p0, pg2.j>)InspectableValueKt.a);
        f.f0((d)i);
        b = d.b(this.$interactionSource, (d)i, this.$enabled);
        d.I();
        return b;
    }
}
