// 
// Decompiled by Procyon v0.6.0
// 

package ti2;

import wi2.f;
import ei2.b;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import vl.a;
import ui2.d;
import sg2.e;

public final class r extends p implements u0
{
    public final p i;
    public final t j;
    
    public r(final p i, final t j) {
        e.f((Object)i, "origin");
        e.f((Object)j, "enhancement");
        super(i.g, i.h);
        this.i = i;
        this.j = j;
    }
    
    public final v0 M0(final boolean b) {
        return a.L0(((v0)this.i).M0(b), (t)this.j.L0().M0(b));
    }
    
    public final v0 O0(final j0 j0) {
        e.f((Object)j0, "newAttributes");
        return a.L0(((v0)this.i).O0(j0), this.j);
    }
    
    public final x P0() {
        return this.i.P0();
    }
    
    public final String Q0(final DescriptorRenderer descriptorRenderer, final b b) {
        e.f((Object)descriptorRenderer, "renderer");
        e.f((Object)b, "options");
        if (b.b()) {
            return descriptorRenderer.s(this.j);
        }
        return this.i.Q0(descriptorRenderer, b);
    }
    
    public final r R0(final d d) {
        e.f((Object)d, "kotlinTypeRefiner");
        final t b1 = d.b1((f)this.i);
        e.d((Object)b1, "null cannot be cast to non-null type org.jetbrains.kotlin.types.FlexibleType");
        return new r((p)b1, d.b1((f)this.j));
    }
    
    public final v0 S() {
        return (v0)this.i;
    }
    
    public final t p0() {
        return this.j;
    }
    
    public final String toString() {
        final StringBuilder r = a.r("[@EnhancedForWarnings(");
        r.append(this.j);
        r.append(")] ");
        r.append(this.i);
        return r.toString();
    }
}
