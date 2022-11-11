// 
// Decompiled by Procyon v0.6.0
// 

package kotlin.reflect.jvm.internal.impl.types;

import ti2.t;
import ti2.n0;
import ui2.d;
import kotlin.a;
import kotlin.LazyThreadSafetyMode;
import sg2.e;
import hg2.f;
import hh2.j0;
import ti2.o0;

public final class StarProjectionImpl extends o0
{
    public final j0 a;
    public final f b;
    
    public StarProjectionImpl(final j0 a) {
        e.f((Object)a, "typeParameter");
        this.a = a;
        this.b = kotlin.a.a(LazyThreadSafetyMode.PUBLICATION, (rg2.a)new StarProjectionImpl$_type.StarProjectionImpl$_type$2(this));
    }
    
    public final n0 a(final d d) {
        e.f((Object)d, "kotlinTypeRefiner");
        return (n0)this;
    }
    
    public final boolean b() {
        return true;
    }
    
    public final Variance c() {
        return Variance.OUT_VARIANCE;
    }
    
    public final t getType() {
        return this.b.getValue();
    }
}
