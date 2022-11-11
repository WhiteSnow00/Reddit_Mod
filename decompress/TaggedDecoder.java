// 
// Decompiled by Procyon v0.6.0
// 

package kotlinx.serialization.internal;

import kotlinx.serialization.json.internal.JsonNamesMapKt;
import kotlinx.serialization.descriptors.SerialDescriptorImpl;
import sj2.u0;
import java.util.List;
import tj2.n;
import sg2.e;
import uj2.b;
import java.util.ArrayList;
import rj2.a;
import rj2.c;

public abstract class TaggedDecoder<Tag> implements c, a
{
    public final ArrayList<Tag> a;
    public boolean b;
    
    public TaggedDecoder() {
        this.a = new ArrayList<Tag>();
    }
    
    @Override
    public final int B() {
        final String g = this.G();
        final b b = (b)this;
        final String s = g;
        e.f((Object)s, "tag");
        final n r = b.R(s);
        try {
            return Integer.parseInt(r.a());
        }
        catch (final IllegalArgumentException ex) {
            b.U("int");
            throw null;
        }
    }
    
    public abstract String C(final Tag p0);
    
    @Override
    public final boolean D(final qj2.e e, final int n) {
        e.f((Object)e, "descriptor");
        return this.b(((b)this).S(e, n));
    }
    
    @Override
    public final double E(final qj2.e e, final int n) {
        e.f((Object)e, "descriptor");
        return this.t(((b)this).S(e, n));
    }
    
    @Override
    public final float F() {
        return this.v(this.G());
    }
    
    public final Tag G() {
        final ArrayList<Tag> a = this.a;
        final Tag remove = a.remove(lw0.b.L0((List)a));
        this.b = true;
        return remove;
    }
    
    @Override
    public final char H(final u0 u0, final int n) {
        e.f((Object)u0, "descriptor");
        return this.l(((b)this).S((qj2.e)u0, n));
    }
    
    @Override
    public final boolean I() {
        return this.b(this.G());
    }
    
    @Override
    public final int J(final qj2.e e, int int1) {
        e.f((Object)e, "descriptor");
        final b b = (b)this;
        final n r = b.R(b.S(e, int1));
        try {
            int1 = Integer.parseInt(r.a());
            return int1;
        }
        catch (final IllegalArgumentException ex) {
            b.U("int");
            throw null;
        }
    }
    
    @Override
    public abstract boolean K();
    
    @Override
    public final byte M() {
        return this.g(this.G());
    }
    
    public abstract boolean b(final Tag p0);
    
    @Override
    public final void f() {
    }
    
    public abstract byte g(final Tag p0);
    
    @Override
    public final short h(final u0 u0, final int n) {
        e.f((Object)u0, "descriptor");
        return this.w(((b)this).S((qj2.e)u0, n));
    }
    
    @Override
    public final long i() {
        final String g = this.G();
        final b b = (b)this;
        final String s = g;
        e.f((Object)s, "tag");
        final n r = b.R(s);
        try {
            return Long.parseLong(r.a());
        }
        catch (final IllegalArgumentException ex) {
            b.U("long");
            throw null;
        }
    }
    
    @Override
    public final int j(final SerialDescriptorImpl serialDescriptorImpl) {
        e.f((Object)serialDescriptorImpl, "enumDescriptor");
        final String g = this.G();
        final b b = (b)this;
        final String s = g;
        e.f((Object)s, "tag");
        return JsonNamesMapKt.c(serialDescriptorImpl, b.c, b.R(s).a(), "");
    }
    
    @Override
    public final String k(final qj2.e e, final int n) {
        e.f((Object)e, "descriptor");
        return this.C(((b)this).S(e, n));
    }
    
    public abstract char l(final Tag p0);
    
    @Override
    public final void m() {
    }
    
    @Override
    public final float n(final qj2.e e, final int n) {
        e.f((Object)e, "descriptor");
        return this.v(((b)this).S(e, n));
    }
    
    @Override
    public final short p() {
        return this.w(this.G());
    }
    
    @Override
    public final double q() {
        return this.t(this.G());
    }
    
    @Override
    public final Object r(final qj2.e e, final int n, final pj2.b b, final Object o) {
        e.f((Object)e, "descriptor");
        e.f((Object)b, "deserializer");
        final String s = ((b)this).S(e, n);
        final TaggedDecoder$decodeNullableSerializableElement$1 taggedDecoder$decodeNullableSerializableElement$1 = new TaggedDecoder$decodeNullableSerializableElement$1(this, (pj2.a)b, o);
        this.a.add((Tag)s);
        final Object invoke = ((rg2.a<Object>)taggedDecoder$decodeNullableSerializableElement$1).invoke();
        if (!this.b) {
            this.G();
        }
        this.b = false;
        return invoke;
    }
    
    @Override
    public final char s() {
        return this.l(this.G());
    }
    
    public abstract double t(final Tag p0);
    
    @Override
    public final byte u(final u0 u0, final int n) {
        e.f((Object)u0, "descriptor");
        return this.g(((b)this).S((qj2.e)u0, n));
    }
    
    public abstract float v(final Tag p0);
    
    public abstract short w(final Tag p0);
    
    @Override
    public final String x() {
        return this.C(this.G());
    }
    
    @Override
    public final long y(final qj2.e e, final int n) {
        e.f((Object)e, "descriptor");
        final b b = (b)this;
        final n r = b.R(b.S(e, n));
        try {
            return Long.parseLong(r.a());
        }
        catch (final IllegalArgumentException ex) {
            b.U("long");
            throw null;
        }
    }
    
    @Override
    public final <T> T z(final qj2.e e, final int n, final pj2.a<T> a, final T t) {
        e.f((Object)e, "descriptor");
        e.f((Object)a, "deserializer");
        final String s = ((b)this).S(e, n);
        final TaggedDecoder$decodeSerializableElement$1 taggedDecoder$decodeSerializableElement$1 = new TaggedDecoder$decodeSerializableElement$1(this, (pj2.a)a, (Object)t);
        this.a.add((Tag)s);
        final T invoke = ((rg2.a<T>)taggedDecoder$decodeSerializableElement$1).invoke();
        if (!this.b) {
            this.G();
        }
        this.b = false;
        return invoke;
    }
}
