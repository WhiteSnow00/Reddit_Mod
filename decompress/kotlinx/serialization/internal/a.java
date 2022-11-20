// 
// Decompiled by Procyon v0.6.0
// 

package kotlinx.serialization.internal;

import kotlinx.serialization.SerializationException;
import nj2.c;
import kotlin.LazyThreadSafetyMode;
import ng2.e;
import cg2.j;
import cg2.f;
import kotlin.collections.EmptyList;
import lj2.b;

public final class a<T> implements b<T>
{
    public final T a;
    public EmptyList b;
    public final f c;
    
    public a(final j a) {
        e.f((Object)a, "objectInstance");
        this.a = (T)a;
        this.b = EmptyList.INSTANCE;
        this.c = kotlin.a.a(LazyThreadSafetyMode.PUBLICATION, (mg2.a)new ObjectSerializer$descriptor$2("kotlin.Unit", this));
    }
    
    public final T deserialize(final c c) {
        e.f((Object)c, "decoder");
        final mj2.e descriptor = this.getDescriptor();
        final nj2.a a = c.a(descriptor);
        final int h = a.H(this.getDescriptor());
        if (h == -1) {
            final j a2 = j.a;
            a.d(descriptor);
            return this.a;
        }
        throw new SerializationException(d.h("Unexpected index ", h));
    }
    
    public final mj2.e getDescriptor() {
        return (mj2.e)this.c.getValue();
    }
    
    public final void serialize(final nj2.d d, final T t) {
        e.f((Object)d, "encoder");
        e.f((Object)t, "value");
        ((nj2.b)d.a(this.getDescriptor())).d(this.getDescriptor());
    }
}
