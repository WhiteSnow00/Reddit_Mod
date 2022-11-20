// 
// Decompiled by Procyon v0.6.0
// 

package kotlinx.serialization.internal;

import oj2.p0;
import kotlinx.serialization.json.internal.JsonNamesMapKt;
import kotlinx.serialization.descriptors.SerialDescriptorImpl;
import java.util.List;
import cg.d;
import pj2.m;
import qj2.b;
import mj2.e;
import java.util.ArrayList;
import nj2.a;
import nj2.c;

public abstract class TaggedDecoder<Tag> implements c, a
{
    public final ArrayList<Tag> f;
    public boolean g;
    
    public TaggedDecoder() {
        this.f = new ArrayList<Tag>();
    }
    
    public final double A(final e e, final int n) {
        ng2.e.f((Object)e, "descriptor");
        return this.m(((b)this).L(e, n));
    }
    
    public final int C() {
        final String d = this.D();
        final b b = (b)this;
        final String s = d;
        ng2.e.f((Object)s, "tag");
        final m k = b.K(s);
        try {
            return Integer.parseInt(k.a());
        }
        catch (final IllegalArgumentException ex) {
            b.N("int");
            throw null;
        }
    }
    
    public final Tag D() {
        final ArrayList<Tag> f = this.f;
        final Tag remove = f.remove(d.R2((List)f));
        this.g = true;
        return remove;
    }
    
    public final float F(final e e, final int n) {
        ng2.e.f((Object)e, "descriptor");
        return this.n(((b)this).L(e, n));
    }
    
    public final float O() {
        return this.n(this.D());
    }
    
    public final boolean P() {
        return this.b(this.D());
    }
    
    public final int V(final e e, int int1) {
        ng2.e.f((Object)e, "descriptor");
        final b b = (b)this;
        final m k = b.K(b.L(e, int1));
        try {
            int1 = Integer.parseInt(k.a());
            return int1;
        }
        catch (final IllegalArgumentException ex) {
            b.N("int");
            throw null;
        }
    }
    
    public abstract boolean W();
    
    public abstract boolean b(final Tag p0);
    
    public final byte d0() {
        return this.i(this.D());
    }
    
    public final Object e(final e e, final int n, final lj2.b b, final Object o) {
        ng2.e.f((Object)e, "descriptor");
        ng2.e.f((Object)b, "deserializer");
        final String l = ((b)this).L(e, n);
        final TaggedDecoder$decodeNullableSerializableElement$1 taggedDecoder$decodeNullableSerializableElement$1 = new TaggedDecoder$decodeNullableSerializableElement$1(this, (lj2.a)b, o);
        this.f.add((Tag)l);
        final Object invoke = ((mg2.a)taggedDecoder$decodeNullableSerializableElement$1).invoke();
        if (!this.g) {
            this.D();
        }
        this.g = false;
        return invoke;
    }
    
    public final void f() {
    }
    
    public final long g() {
        final String d = this.D();
        final b b = (b)this;
        final String s = d;
        ng2.e.f((Object)s, "tag");
        final m k = b.K(s);
        try {
            return Long.parseLong(k.a());
        }
        catch (final IllegalArgumentException ex) {
            b.N("long");
            throw null;
        }
    }
    
    public final int h(final SerialDescriptorImpl serialDescriptorImpl) {
        ng2.e.f((Object)serialDescriptorImpl, "enumDescriptor");
        final String d = this.D();
        final b b = (b)this;
        final String s = d;
        ng2.e.f((Object)s, "tag");
        return JsonNamesMapKt.c(serialDescriptorImpl, b.h, b.K(s).a(), "");
    }
    
    public abstract byte i(final Tag p0);
    
    public final char i0(final p0 p2, final int n) {
        ng2.e.f((Object)p2, "descriptor");
        return this.k(((b)this).L((e)p2, n));
    }
    
    public final void j() {
    }
    
    public abstract char k(final Tag p0);
    
    public abstract double m(final Tag p0);
    
    public abstract float n(final Tag p0);
    
    public abstract short o(final Tag p0);
    
    public abstract String p(final Tag p0);
    
    public final long q(final e e, final int n) {
        ng2.e.f((Object)e, "descriptor");
        final b b = (b)this;
        final m k = b.K(b.L(e, n));
        try {
            return Long.parseLong(k.a());
        }
        catch (final IllegalArgumentException ex) {
            b.N("long");
            throw null;
        }
    }
    
    public final short r() {
        return this.o(this.D());
    }
    
    public final double s() {
        return this.m(this.D());
    }
    
    public final char t() {
        return this.k(this.D());
    }
    
    public final <T> T u(final e e, final int n, final lj2.a<T> a, final T t) {
        ng2.e.f((Object)e, "descriptor");
        ng2.e.f((Object)a, "deserializer");
        final String l = ((b)this).L(e, n);
        final TaggedDecoder$decodeSerializableElement$1 taggedDecoder$decodeSerializableElement$1 = new TaggedDecoder$decodeSerializableElement$1(this, (lj2.a)a, (Object)t);
        this.f.add((Tag)l);
        final Object invoke = ((mg2.a)taggedDecoder$decodeSerializableElement$1).invoke();
        if (!this.g) {
            this.D();
        }
        this.g = false;
        return (T)invoke;
    }
    
    public final byte v(final p0 p2, final int n) {
        ng2.e.f((Object)p2, "descriptor");
        return this.i(((b)this).L((e)p2, n));
    }
    
    public final String w() {
        return this.p(this.D());
    }
    
    public final boolean x(final e e, final int n) {
        ng2.e.f((Object)e, "descriptor");
        return this.b(((b)this).L(e, n));
    }
    
    public final String y(final e e, final int n) {
        ng2.e.f((Object)e, "descriptor");
        return this.p(((b)this).L(e, n));
    }
    
    public final short z(final p0 p2, final int n) {
        ng2.e.f((Object)p2, "descriptor");
        return this.o(((b)this).L((e)p2, n));
    }
}
