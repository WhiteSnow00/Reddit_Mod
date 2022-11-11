// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation;

import z0.d$a;
import z0.o0;
import m0.k;
import ah2.f;
import h2.g;
import pg2.j;
import zg2.a;
import kotlin.Metadata;
import j1.d;
import zg2.q;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = { "\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002" }, d2 = { "Lj1/d;", "invoke", "(Lj1/d;Lz0/d;I)Lj1/d;", "<anonymous>" }, k = 3, mv = { 1, 6, 0 })
final class ClickableKt$clickable$2 extends Lambda implements q<d, z0.d, Integer, d>
{
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ a<j> $onClick;
    public final /* synthetic */ String $onClickLabel;
    public final /* synthetic */ g $role;
    
    public ClickableKt$clickable$2(final boolean $enabled, final String $onClickLabel, final g $role, final a<j> $onClick) {
        this.$enabled = $enabled;
        this.$onClickLabel = $onClickLabel;
        this.$role = $role;
        this.$onClick = $onClick;
        super(3);
    }
    
    public final d invoke(d b, final z0.d d, final int n) {
        f.f((Object)b, "$this$composed");
        d.A(-756081143);
        final d.a f = j1.d.a.f;
        final k k = (k)d.t(IndicationKt.a);
        d.A(-492369756);
        Object b2;
        if ((b2 = d.B()) == d$a.a) {
            b2 = new o0.k();
            d.v(b2);
        }
        d.I();
        b = ClickableKt.b((d)f, (o0.j)b2, k, this.$enabled, this.$onClickLabel, this.$role, this.$onClick);
        d.I();
        return b;
    }
}
