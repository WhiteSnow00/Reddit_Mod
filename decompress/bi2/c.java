// 
// Decompiled by Procyon v0.6.0
// 

package bi2;

import kotlin.collections.EmptyList;
import ch2.j0;
import java.util.List;
import cg.d;
import oi2.t;
import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import ng2.e;
import kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor;
import oi2.o0;

public final class c implements b
{
    public final o0 a;
    public NewCapturedTypeConstructor b;
    
    public c(final o0 a) {
        e.f((Object)a, "projection");
        (this.a = a).b();
        final Variance invariant = Variance.INVARIANT;
    }
    
    public final o0 b() {
        return this.a;
    }
    
    public final Collection<t> e() {
        Object o;
        if (this.a.b() == Variance.OUT_VARIANCE) {
            o = this.a.getType();
        }
        else {
            o = this.p().p();
        }
        e.e(o, "if (projection.projectio\u2026 builtIns.nullableAnyType");
        return d.l3(o);
    }
    
    public final /* bridge */ ch2.e f() {
        return null;
    }
    
    public final boolean g() {
        return false;
    }
    
    public final List<j0> getParameters() {
        return (List<j0>)EmptyList.INSTANCE;
    }
    
    public final kotlin.reflect.jvm.internal.impl.builtins.c p() {
        final kotlin.reflect.jvm.internal.impl.builtins.c p = this.a.getType().I0().p();
        e.e((Object)p, "projection.type.constructor.builtIns");
        return p;
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("CapturedTypeConstructor(");
        t.append(this.a);
        t.append(')');
        return t.toString();
    }
}
