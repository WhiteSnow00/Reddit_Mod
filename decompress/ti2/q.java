// 
// Decompiled by Procyon v0.6.0
// 

package ti2;

import wi2.f;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import ei2.b;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import ui2.d;
import vl.a;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.NoWhenBranchMatchedException;
import hh2.j0;
import sg2.e;

public final class q extends p implements h
{
    public q(final x x, final x x2) {
        e.f((Object)x, "lowerBound");
        e.f((Object)x2, "upperBound");
        super(x, x2);
    }
    
    public final boolean E0() {
        return ((t)super.g).I0().f() instanceof j0 && e.a((Object)((t)super.g).I0(), (Object)((t)super.h).I0());
    }
    
    public final v0 F(final t t) {
        e.f((Object)t, "replacement");
        final v0 l0 = t.L0();
        v0 c;
        if (l0 instanceof p) {
            c = l0;
        }
        else {
            if (!(l0 instanceof x)) {
                throw new NoWhenBranchMatchedException();
            }
            final x x = (x)l0;
            c = KotlinTypeFactory.c(x, x.P0(true));
        }
        return a.b0(c, (t)l0);
    }
    
    public final v0 M0(final boolean b) {
        return KotlinTypeFactory.c(super.g.P0(b), super.h.P0(b));
    }
    
    public final v0 O0(final ti2.j0 j0) {
        e.f((Object)j0, "newAttributes");
        return KotlinTypeFactory.c(super.g.Q0(j0), super.h.Q0(j0));
    }
    
    public final x P0() {
        return super.g;
    }
    
    public final String Q0(final DescriptorRenderer descriptorRenderer, final b b) {
        e.f((Object)descriptorRenderer, "renderer");
        e.f((Object)b, "options");
        if (b.e()) {
            final StringBuilder p2 = d.p('(');
            p2.append(descriptorRenderer.s((t)super.g));
            p2.append("..");
            p2.append(descriptorRenderer.s((t)super.h));
            p2.append(')');
            return p2.toString();
        }
        return descriptorRenderer.p(descriptorRenderer.s((t)super.g), descriptorRenderer.s((t)super.h), TypeUtilsKt.g((t)this));
    }
    
    public final p R0(final d d) {
        e.f((Object)d, "kotlinTypeRefiner");
        final t b1 = d.b1((f)super.g);
        e.d((Object)b1, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        final x x = (x)b1;
        final t b2 = d.b1((f)super.h);
        e.d((Object)b2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new q(x, (x)b2);
    }
    
    public final String toString() {
        final StringBuilder p = d.p('(');
        p.append(super.g);
        p.append("..");
        p.append(super.h);
        p.append(')');
        return p.toString();
    }
}
