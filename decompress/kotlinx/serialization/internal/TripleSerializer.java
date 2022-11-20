// 
// Decompiled by Procyon v0.6.0
// 

package kotlinx.serialization.internal;

import pj2.i;
import lj2.f;
import kotlinx.serialization.SerializationException;
import oj2.a1;
import nj2.c;
import mg2.l;
import kotlinx.serialization.descriptors.a;
import mj2.e;
import kotlinx.serialization.descriptors.SerialDescriptorImpl;
import kotlin.Triple;
import lj2.b;

public final class TripleSerializer<A, B, C> implements b<Triple<? extends A, ? extends B, ? extends C>>
{
    public final b<A> a;
    public final b<B> b;
    public final b<C> c;
    public final SerialDescriptorImpl d;
    
    public TripleSerializer(final b<A> a, final b<B> b, final b<C> c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = kotlinx.serialization.descriptors.a.a("kotlin.Triple", new e[0], (l)new TripleSerializer$descriptor$1(this));
    }
    
    public final Object deserialize(final c c) {
        ng2.e.f((Object)c, "decoder");
        final nj2.a a = c.a((e)this.d);
        a.j();
        Object o = a1.a;
        Object u2;
        Object u = u2 = o;
        while (true) {
            final int h = a.H((e)this.d);
            if (h != -1) {
                if (h != 0) {
                    if (h != 1) {
                        if (h != 2) {
                            throw new SerializationException(d.h("Unexpected index ", h));
                        }
                        u2 = a.u((e)this.d, 2, (lj2.a)this.c, (Object)null);
                    }
                    else {
                        u = a.u((e)this.d, 1, (lj2.a)this.b, (Object)null);
                    }
                }
                else {
                    o = a.u((e)this.d, 0, (lj2.a)this.a, (Object)null);
                }
            }
            else {
                a.d((e)this.d);
                final Object a2 = a1.a;
                if (o == a2) {
                    throw new SerializationException("Element 'first' is missing");
                }
                if (u == a2) {
                    throw new SerializationException("Element 'second' is missing");
                }
                if (u2 != a2) {
                    return new Triple(o, u, u2);
                }
                throw new SerializationException("Element 'third' is missing");
            }
        }
    }
    
    public final e getDescriptor() {
        return this.d;
    }
    
    public final void serialize(final nj2.d d, final Object o) {
        final Triple triple = (Triple)o;
        ng2.e.f((Object)d, "encoder");
        ng2.e.f((Object)triple, "value");
        final i a = d.a((e)this.d);
        ((nj2.b)a).w((e)this.d, 0, (f)this.a, triple.getFirst());
        ((nj2.b)a).w((e)this.d, 1, (f)this.b, triple.getSecond());
        ((nj2.b)a).w((e)this.d, 2, (f)this.c, triple.getThird());
        ((nj2.b)a).d((e)this.d);
    }
}
