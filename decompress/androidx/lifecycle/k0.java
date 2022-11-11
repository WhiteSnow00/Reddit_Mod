// 
// Decompiled by Procyon v0.6.0
// 

package androidx.lifecycle;

import o.a;

public final class k0 implements y<Object>
{
    public final /* synthetic */ v a;
    public final /* synthetic */ a b;
    
    public k0(final v a, final a b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void a(final Object o) {
        ((x)this.a).k(this.b.apply(o));
    }
}
