// 
// Decompiled by Procyon v0.6.0
// 

package ui2;

import ti2.v0;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import wi2.f;
import kotlin.reflect.jvm.internal.impl.types.a;
import o90.f3;
import ui.b;
import ti2.t;
import sg2.e;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypePreparator;

public final class h implements g
{
    public final d c;
    public final KotlinTypePreparator d;
    public final OverridingUtil e;
    
    public h(final d$a c) {
        final KotlinTypePreparator.a a = KotlinTypePreparator.a.a;
        sg2.e.f((Object)c, "kotlinTypeRefiner");
        sg2.e.f((Object)a, "kotlinTypePreparator");
        this.c = (d)c;
        this.d = (KotlinTypePreparator)a;
        this.e = new OverridingUtil((c$a)OverridingUtil.g, c, a);
    }
    
    @Override
    public final OverridingUtil a() {
        return this.e;
    }
    
    public final boolean b(final t t, final t t2) {
        sg2.e.f((Object)t, "a");
        sg2.e.f((Object)t2, "b");
        final TypeCheckerState t3 = ui.b.t(false, false, (f3)null, this.d, this.c, 6);
        final v0 l0 = t.L0();
        final v0 l2 = t2.L0();
        sg2.e.f((Object)l0, "a");
        sg2.e.f((Object)l2, "b");
        return a.e(t3, (f)l0, (f)l2);
    }
    
    @Override
    public final d c() {
        return this.c;
    }
    
    public final boolean d(final t t, final t t2) {
        sg2.e.f((Object)t, "subtype");
        sg2.e.f((Object)t2, "supertype");
        final TypeCheckerState t3 = ui.b.t(true, false, (f3)null, this.d, this.c, 6);
        final v0 l0 = t.L0();
        final v0 l2 = t2.L0();
        sg2.e.f((Object)l0, "subType");
        sg2.e.f((Object)l2, "superType");
        return a.i(a.a, t3, (f)l0, (f)l2);
    }
}
