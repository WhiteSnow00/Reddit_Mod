// 
// Decompiled by Procyon v0.6.0
// 

package qj2;

import mj2.c;
import mj2.h$b;
import nj2.d;
import kotlinx.serialization.descriptors.SerialDescriptorImpl;
import lj2.f;
import lj2.b;
import kotlinx.serialization.json.internal.WriteMode;
import pj2.a;
import pj2.i;
import b6.h;

public final class n extends h implements i
{
    public final e f;
    public final pj2.a g;
    public final WriteMode h;
    public final i[] i;
    public final h j;
    public final pj2.e k;
    public boolean l;
    public String m;
    
    public n(final e f, final pj2.a g, final WriteMode h, final i[] i) {
        ng2.e.f((Object)f, "composer");
        ng2.e.f((Object)g, "json");
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = g.b;
        this.k = g.a;
        final int ordinal = h.ordinal();
        if (i != null) {
            final i j = i[ordinal];
            if (j != null || j != this) {
                i[ordinal] = (i)this;
            }
        }
    }
    
    public final void A(final mj2.e e, final int n, final b b, final Object o) {
        ng2.e.f((Object)e, "descriptor");
        ng2.e.f((Object)b, "serializer");
        if (o != null || this.k.f) {
            this.G(e, n);
            if (((f)b).getDescriptor().b()) {
                this.j((f<? super Object>)b, o);
            }
            else if (o == null) {
                this.z();
            }
            else {
                this.j((f<? super Object>)b, o);
            }
        }
    }
    
    public final void B(final char c) {
        this.r(String.valueOf(c));
    }
    
    public final void G(final mj2.e e, final int n) {
        ng2.e.f((Object)e, "descriptor");
        final int n2 = a.a[this.h.ordinal()];
        boolean l = true;
        if (n2 != 1) {
            if (n2 != 2) {
                if (n2 != 3) {
                    final e f = this.f;
                    if (!f.b) {
                        f.c(',');
                    }
                    this.f.b();
                    this.r(e.f(n));
                    this.f.c(':');
                    this.f.d();
                }
                else {
                    if (n == 0) {
                        this.l = true;
                    }
                    if (n == 1) {
                        this.f.c(',');
                        this.f.d();
                        this.l = false;
                    }
                }
            }
            else {
                final e f2 = this.f;
                if (!f2.b) {
                    if (n % 2 == 0) {
                        f2.c(',');
                        this.f.b();
                    }
                    else {
                        f2.c(':');
                        this.f.d();
                        l = false;
                    }
                    this.l = l;
                }
                else {
                    this.l = true;
                    f2.b();
                }
            }
        }
        else {
            final e f3 = this.f;
            if (!f3.b) {
                f3.c(',');
            }
            this.f.b();
        }
    }
    
    public final i a(final mj2.e e) {
        ng2.e.f((Object)e, "descriptor");
        final WriteMode q1 = xd.a.q1(e, this.g);
        final char begin = q1.begin;
        if (begin != '\0') {
            this.f.c(begin);
            this.f.a();
        }
        if (this.m != null) {
            this.f.b();
            final String m = this.m;
            ng2.e.c((Object)m);
            this.r(m);
            this.f.c(':');
            this.f.d();
            this.r(e.h());
            this.m = null;
        }
        if (this.h == q1) {
            return (i)this;
        }
        final i[] i = this.i;
        if (i != null) {
            final Object o = i[q1.ordinal()];
            if (o != null) {
                return (i)o;
            }
        }
        final Object o = new n(this.f, this.g, q1, this.i);
        return (i)o;
    }
    
    public final h c() {
        return this.j;
    }
    
    public final void d(final mj2.e e) {
        ng2.e.f((Object)e, "descriptor");
        if (this.h.end != '\0') {
            this.f.e();
            this.f.b();
            this.f.c(this.h.end);
        }
    }
    
    public final void f(final byte b) {
        if (this.l) {
            this.r(String.valueOf(b));
        }
        else {
            this.f.a.writeLong(b);
        }
    }
    
    public final boolean h(final mj2.e e) {
        ng2.e.f((Object)e, "descriptor");
        return this.k.a;
    }
    
    public final void i(final SerialDescriptorImpl serialDescriptorImpl, final int n) {
        ng2.e.f((Object)serialDescriptorImpl, "enumDescriptor");
        this.r(serialDescriptorImpl.f[n]);
    }
    
    public final <T> void j(final f<? super T> f, final T t) {
        ng2.e.f((Object)f, "serializer");
        if (f instanceof oj2.b && !this.g.a.i) {
            final oj2.b b = (oj2.b)f;
            final String n = p2.b.n(f.getDescriptor(), this.g);
            ng2.e.d((Object)t, "null cannot be cast to non-null type kotlin.Any");
            final f h = zg.a.H(b, (d)this, (Object)t);
            if (b instanceof kotlinx.serialization.a) {
                final mj2.e descriptor = h.getDescriptor();
                ng2.e.f((Object)descriptor, "<this>");
                if (if0.a.i(descriptor).contains(n)) {
                    final StringBuilder l = m5.a.l("Sealed class '", h.getDescriptor().h(), "' cannot be serialized as base class '", ((f)b).getDescriptor().h(), "' because it has property name that conflicts with JSON class discriminator '");
                    l.append(n);
                    l.append("'. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism");
                    throw new IllegalStateException(l.toString().toString());
                }
            }
            final mj2.h kind = h.getDescriptor().getKind();
            ng2.e.f((Object)kind, "kind");
            if (kind instanceof h$b) {
                throw new IllegalStateException("Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead".toString());
            }
            if (kind instanceof mj2.d) {
                throw new IllegalStateException("Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead".toString());
            }
            if (kind instanceof c) {
                throw new IllegalStateException("Actual serializer for polymorphic cannot be polymorphic itself".toString());
            }
            this.m = n;
            h.serialize((d)this, t);
        }
        else {
            f.serialize((d)this, t);
        }
    }
    
    public final void k(final short n) {
        if (this.l) {
            this.r(String.valueOf(n));
        }
        else {
            this.f.a.writeLong(n);
        }
    }
    
    public final void m(final boolean b) {
        if (this.l) {
            this.r(String.valueOf(b));
        }
        else {
            this.f.a.c(String.valueOf(b));
        }
    }
    
    public final void o(final float n) {
        if (this.l) {
            this.r(String.valueOf(n));
        }
        else {
            this.f.a.c(String.valueOf(n));
        }
        if (!this.k.k && (Float.isInfinite(n) || Float.isNaN(n))) {
            throw kotlinx.coroutines.channels.a.c(this.f.a.toString(), n);
        }
    }
    
    public final void q(final int n) {
        if (this.l) {
            this.r(String.valueOf(n));
        }
        else {
            this.f.a.writeLong(n);
        }
    }
    
    public final void r(final String s) {
        ng2.e.f((Object)s, "value");
        final e f = this.f;
        f.getClass();
        f.a.b(s);
    }
    
    public final void t(final double n) {
        if (this.l) {
            this.r(String.valueOf(n));
        }
        else {
            this.f.a.c(String.valueOf(n));
        }
        if (!this.k.k && (Double.isInfinite(n) || Double.isNaN(n))) {
            throw kotlinx.coroutines.channels.a.c(this.f.a.toString(), n);
        }
    }
    
    public final void y(final long n) {
        if (this.l) {
            this.r(String.valueOf(n));
        }
        else {
            this.f.a.writeLong(n);
        }
    }
    
    public final void z() {
        final e f = this.f;
        f.getClass();
        f.a.c("null");
    }
    
    public final class a
    {
        public static final int[] a;
        
        static {
            final int[] a2 = new int[WriteMode.values().length];
            a2[WriteMode.LIST.ordinal()] = 1;
            a2[WriteMode.MAP.ordinal()] = 2;
            a2[WriteMode.POLY_OBJ.ordinal()] = 3;
            a = a2;
        }
    }
}
