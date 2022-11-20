// 
// Decompiled by Procyon v0.6.0
// 

package pi2;

import oi2.w0;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import ri2.f;
import kotlin.reflect.jvm.internal.impl.types.a;
import oy0.b;
import oi2.t;
import ng2.e;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypePreparator$a;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypePreparator;

public final class h implements g
{
    public final d c;
    public final KotlinTypePreparator d;
    public final OverridingUtil e;
    
    public h(final d$a c) {
        final KotlinTypePreparator$a g = KotlinTypePreparator$a.g;
        ng2.e.f((Object)c, "kotlinTypeRefiner");
        ng2.e.f((Object)g, "kotlinTypePreparator");
        this.c = (d)c;
        this.d = (KotlinTypePreparator)g;
        this.e = new OverridingUtil((c$a)OverridingUtil.g, c, g);
    }
    
    public final boolean a(final t t, final t t2) {
        ng2.e.f((Object)t, "a");
        ng2.e.f((Object)t2, "b");
        final TypeCheckerState k = b.k(false, false, (k)null, this.d, this.c, 6);
        final w0 l0 = t.L0();
        final w0 l2 = t2.L0();
        ng2.e.f((Object)l0, "a");
        ng2.e.f((Object)l2, "b");
        return a.e(k, (f)l0, (f)l2);
    }
    
    public final OverridingUtil b() {
        return this.e;
    }
    
    public final d c() {
        return this.c;
    }
    
    public final boolean d(final t t, final t t2) {
        ng2.e.f((Object)t, "subtype");
        ng2.e.f((Object)t2, "supertype");
        final TypeCheckerState k = b.k(true, false, (k)null, this.d, this.c, 6);
        final w0 l0 = t.L0();
        final w0 l2 = t2.L0();
        ng2.e.f((Object)l0, "subType");
        ng2.e.f((Object)l2, "superType");
        return a.i(a.a, k, (f)l0, (f)l2);
    }
}
