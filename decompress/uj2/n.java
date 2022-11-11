// 
// Decompiled by Procyon v0.6.0
// 

package uj2;

import kotlinx.serialization.descriptors.SerialDescriptorImpl;
import qj2.c;
import qj2.h;
import rj2.d;
import ej2.c0;
import a4.a0;
import pj2.f;
import android.support.v4.media.b;
import kotlinx.serialization.json.internal.WriteMode;
import tj2.i;
import bd0.a;

public final class n extends a implements i
{
    public final e h;
    public final tj2.a i;
    public final WriteMode j;
    public final i[] k;
    public final b l;
    public final tj2.e m;
    public boolean n;
    public String o;
    
    public n(final e h, final tj2.a i, final WriteMode j, final i[] k) {
        sg2.e.f((Object)h, "composer");
        sg2.e.f((Object)i, "json");
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = i.b;
        this.m = i.a;
        final int ordinal = ((Enum)j).ordinal();
        if (k != null) {
            final i l = k[ordinal];
            if (l != null || l != this) {
                k[ordinal] = (i)this;
            }
        }
    }
    
    public final void E(final qj2.e e, final int n, final pj2.b b, final Object o) {
        sg2.e.f((Object)e, "descriptor");
        sg2.e.f((Object)b, "serializer");
        if (o != null || this.m.f) {
            this.f0(e, n);
            if (((f)b).getDescriptor().b()) {
                this.g((pj2.f<? super Object>)b, o);
            }
            else if (o == null) {
                this.O();
            }
            else {
                this.g((pj2.f<? super Object>)b, o);
            }
        }
    }
    
    public final void G(final long n) {
        if (this.n) {
            this.w(String.valueOf(n));
        }
        else {
            this.h.a.writeLong(n);
        }
    }
    
    public final void O() {
        final e h = this.h;
        h.getClass();
        h.a.c("null");
    }
    
    public final void Q(final char c) {
        this.w(String.valueOf(c));
    }
    
    public final i a(final qj2.e e) {
        sg2.e.f((Object)e, "descriptor");
        final WriteMode c0 = vl.a.C0(e, this.i);
        final char begin = c0.begin;
        if (begin != '\0') {
            this.h.c(begin);
            this.h.a();
        }
        if (this.o != null) {
            this.h.b();
            final String o = this.o;
            sg2.e.c((Object)o);
            this.w(o);
            this.h.c(':');
            this.h.d();
            this.w(e.h());
            this.o = null;
        }
        if (this.j == c0) {
            return (i)this;
        }
        final i[] k = this.k;
        if (k != null) {
            final Object o2 = k[((Enum)c0).ordinal()];
            if (o2 != null) {
                return (i)o2;
            }
        }
        final Object o2 = new n(this.h, this.i, c0, this.k);
        return (i)o2;
    }
    
    public final void b(final byte b) {
        if (this.n) {
            this.w(String.valueOf(b));
        }
        else {
            this.h.a.writeLong((long)b);
        }
    }
    
    public final b c() {
        return this.l;
    }
    
    public final void d(final qj2.e e) {
        sg2.e.f((Object)e, "descriptor");
        if (this.j.end != '\0') {
            this.h.e();
            this.h.b();
            this.h.c(this.j.end);
        }
    }
    
    public final void f0(final qj2.e e, final int n) {
        sg2.e.f((Object)e, "descriptor");
        final int n2 = n$a.a[((Enum)this.j).ordinal()];
        boolean n3 = true;
        if (n2 != 1) {
            if (n2 != 2) {
                if (n2 != 3) {
                    final e h = this.h;
                    if (!h.b) {
                        h.c(',');
                    }
                    this.h.b();
                    this.w(e.f(n));
                    this.h.c(':');
                    this.h.d();
                }
                else {
                    if (n == 0) {
                        this.n = true;
                    }
                    if (n == 1) {
                        this.h.c(',');
                        this.h.d();
                        this.n = false;
                    }
                }
            }
            else {
                final e h2 = this.h;
                if (!h2.b) {
                    if (n % 2 == 0) {
                        h2.c(',');
                        this.h.b();
                    }
                    else {
                        h2.c(':');
                        this.h.d();
                        n3 = false;
                    }
                    this.n = n3;
                }
                else {
                    this.n = true;
                    h2.b();
                }
            }
        }
        else {
            final e h3 = this.h;
            if (!h3.b) {
                h3.c(',');
            }
            this.h.b();
        }
    }
    
    public final <T> void g(final f<? super T> f, final T t) {
        sg2.e.f((Object)f, "serializer");
        if (f instanceof sj2.b && !this.i.a.i) {
            final sj2.b b = (sj2.b)f;
            final String s = a0.s(f.getDescriptor(), this.i);
            sg2.e.d((Object)t, "null cannot be cast to non-null type kotlin.Any");
            final f b2 = c0.b3(b, (d)this, (Object)t);
            if (b instanceof kotlinx.serialization.a) {
                final qj2.e descriptor = b2.getDescriptor();
                sg2.e.f((Object)descriptor, "<this>");
                if (yd.b.f(descriptor).contains(s)) {
                    final StringBuilder r = d.r("Sealed class '", b2.getDescriptor().h(), "' cannot be serialized as base class '", ((f)b).getDescriptor().h(), "' because it has property name that conflicts with JSON class discriminator '");
                    r.append(s);
                    r.append("'. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism");
                    throw new IllegalStateException(r.toString().toString());
                }
            }
            final h kind = b2.getDescriptor().getKind();
            sg2.e.f((Object)kind, "kind");
            if (kind instanceof h.b) {
                throw new IllegalStateException("Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead".toString());
            }
            if (kind instanceof qj2.d) {
                throw new IllegalStateException("Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead".toString());
            }
            if (kind instanceof c) {
                throw new IllegalStateException("Actual serializer for polymorphic cannot be polymorphic itself".toString());
            }
            this.o = s;
            b2.serialize((d)this, (Object)t);
        }
        else {
            f.serialize((d)this, (Object)t);
        }
    }
    
    public final void h(final SerialDescriptorImpl serialDescriptorImpl, final int n) {
        sg2.e.f((Object)serialDescriptorImpl, "enumDescriptor");
        this.w(serialDescriptorImpl.f[n]);
    }
    
    public final boolean j(final qj2.e e) {
        sg2.e.f((Object)e, "descriptor");
        return this.m.a;
    }
    
    public final void q(final short n) {
        if (this.n) {
            this.w(String.valueOf(n));
        }
        else {
            this.h.a.writeLong((long)n);
        }
    }
    
    public final void r(final boolean b) {
        if (this.n) {
            this.w(String.valueOf(b));
        }
        else {
            this.h.a.c(String.valueOf(b));
        }
    }
    
    public final void s(final float n) {
        if (this.n) {
            this.w(String.valueOf(n));
        }
        else {
            this.h.a.c(String.valueOf(n));
        }
        if (!this.m.k && (Float.isInfinite(n) || Float.isNaN(n))) {
            throw bg.d.h(this.h.a.toString(), (Number)n);
        }
    }
    
    public final void u(final int n) {
        if (this.n) {
            this.w(String.valueOf(n));
        }
        else {
            this.h.a.writeLong((long)n);
        }
    }
    
    public final void w(final String s) {
        sg2.e.f((Object)s, "value");
        final e h = this.h;
        h.getClass();
        h.a.b(s);
    }
    
    public final void x(final double n) {
        if (this.n) {
            this.w(String.valueOf(n));
        }
        else {
            this.h.a.c(String.valueOf(n));
        }
        if (!this.m.k && (Double.isInfinite(n) || Double.isNaN(n))) {
            throw bg.d.h(this.h.a.toString(), (Number)n);
        }
    }
}
