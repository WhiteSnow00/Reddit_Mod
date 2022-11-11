// 
// Decompiled by Procyon v0.6.0
// 

package ti2;

import ei2.b;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import ui2.d;
import sg2.e;
import kotlin.reflect.jvm.internal.impl.builtins.c;

public final class o extends p
{
    public final j0 i;
    
    public o(final c c, final j0 i) {
        e.f((Object)i, "attributes");
        final x o = c.o();
        e.e((Object)o, "builtIns.nothingType");
        final x p2 = c.p();
        e.e((Object)p2, "builtIns.nullableAnyType");
        super(o, p2);
        this.i = i;
    }
    
    public final j0 H0() {
        return this.i;
    }
    
    public final boolean J0() {
        return false;
    }
    
    public final t K0(final d d) {
        e.f((Object)d, "kotlinTypeRefiner");
        return (t)this;
    }
    
    public final v0 M0(final boolean b) {
        return (v0)this;
    }
    
    public final v0 N0(final d d) {
        e.f((Object)d, "kotlinTypeRefiner");
        return (v0)this;
    }
    
    public final v0 O0(final j0 j0) {
        e.f((Object)j0, "newAttributes");
        return (v0)new o(TypeUtilsKt.g((t)super.h), j0);
    }
    
    public final x P0() {
        return super.h;
    }
    
    public final String Q0(final DescriptorRenderer descriptorRenderer, final b b) {
        e.f((Object)descriptorRenderer, "renderer");
        e.f((Object)b, "options");
        return "dynamic";
    }
}
