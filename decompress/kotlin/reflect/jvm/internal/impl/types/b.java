// 
// Decompiled by Procyon v0.6.0
// 

package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import ui2.d;
import si2.e;
import ti2.t;
import rg2.a;
import si2.h;
import ti2.w0;

public final class b extends w0
{
    public final h g;
    public final a<t> h;
    public final e<t> i;
    
    public b(final h g, final a<? extends t> h) {
        sg2.e.f((Object)g, "storageManager");
        this.g = g;
        this.h = (a<t>)h;
        this.i = (e<t>)g.e((a)h);
    }
    
    public final t K0(final d d) {
        sg2.e.f((Object)d, "kotlinTypeRefiner");
        return new b(this.g, new LazyWrappedType$refine$1(d, this));
    }
    
    @Override
    public final t M0() {
        return ((a<t>)this.i).invoke();
    }
    
    @Override
    public final boolean N0() {
        return ((LockBasedStorageManager.f)this.i).b();
    }
}
