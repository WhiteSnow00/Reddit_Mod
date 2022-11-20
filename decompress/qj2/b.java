// 
// Decompiled by Procyon v0.6.0
// 

package qj2;

import java.util.NoSuchElementException;
import kotlinx.serialization.json.internal.JsonTreeDecoder;
import kotlinx.serialization.json.JsonObject;
import mj2.h$b;
import mj2.d;
import mj2.i$c;
import ng2.h;
import mj2.c;
import mj2.i$b;
import kotlinx.serialization.json.JsonNull;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import pj2.g;
import pj2.j;
import pj2.m;
import pj2.e;
import pj2.a;
import pj2.f;
import kotlinx.serialization.internal.TaggedDecoder;

public abstract class b extends TaggedDecoder implements f
{
    public final a h;
    public final e i;
    
    public b(final a h) {
        this.h = h;
        this.i = h.a;
    }
    
    public static j E(final m m, final String s) {
        j j;
        if (m instanceof j) {
            j = (j)m;
        }
        else {
            j = null;
        }
        if (j != null) {
            return j;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Unexpected 'null' when ");
        sb.append(s);
        sb.append(" was expected");
        throw kotlinx.coroutines.channels.a.e(-1, sb.toString());
    }
    
    public final g B() {
        return this.I();
    }
    
    public abstract g G(final String p0);
    
    public final g I() {
        final String s = (String)CollectionsKt___CollectionsKt.e5((List)super.f);
        g g;
        if (s == null || (g = this.G(s)) == null) {
            g = this.M();
        }
        return g;
    }
    
    public abstract String J(final mj2.e p0, final int p1);
    
    public final m K(String string) {
        ng2.e.f((Object)string, "tag");
        final g g = this.G(string);
        m m;
        if (g instanceof m) {
            m = (m)g;
        }
        else {
            m = null;
        }
        if (m != null) {
            return m;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Expected JsonPrimitive at ");
        sb.append(string);
        sb.append(", found ");
        sb.append(g);
        string = sb.toString();
        throw kotlinx.coroutines.channels.a.f(this.I().toString(), -1, string);
    }
    
    public final String L(final mj2.e e, final int n) {
        ng2.e.f((Object)e, "<this>");
        final String j = this.J(e, n);
        ng2.e.f((Object)j, "nestedName");
        final String s = (String)CollectionsKt___CollectionsKt.e5((List)super.f);
        return j;
    }
    
    public abstract g M();
    
    public final void N(String m) {
        m = aq2.a.m("Failed to parse '", m, '\'');
        throw kotlinx.coroutines.channels.a.f(this.I().toString(), -1, m);
    }
    
    @Override
    public boolean W() {
        return this.I() instanceof JsonNull ^ true;
    }
    
    public nj2.a a(final mj2.e e) {
        ng2.e.f((Object)e, "descriptor");
        final g i = this.I();
        final mj2.h kind = e.getKind();
        Object o;
        if (ng2.e.a((Object)kind, (Object)i$b.a) || kind instanceof c) {
            final a h = this.h;
            if (!(i instanceof pj2.b)) {
                final StringBuilder t = a.t("Expected ");
                t.append(ng2.h.a((Class)pj2.b.class));
                t.append(" as the serialized body of ");
                t.append(e.h());
                t.append(", but had ");
                t.append(ng2.h.a((Class)((JsonObject)i).getClass()));
                throw kotlinx.coroutines.channels.a.e(-1, t.toString());
            }
            o = new qj2.j(h, (pj2.b)i);
        }
        else if (ng2.e.a((Object)kind, (Object)i$c.a)) {
            final a h2 = this.h;
            final mj2.e z = xd.a.z(e.d(0), h2.b);
            final mj2.h kind2 = z.getKind();
            if (!(kind2 instanceof d) && !ng2.e.a((Object)kind2, (Object)h$b.a)) {
                if (!h2.a.d) {
                    throw kotlinx.coroutines.channels.a.d(z);
                }
                final a h3 = this.h;
                if (!(i instanceof pj2.b)) {
                    final StringBuilder t2 = a.t("Expected ");
                    t2.append(ng2.h.a((Class)pj2.b.class));
                    t2.append(" as the serialized body of ");
                    t2.append(e.h());
                    t2.append(", but had ");
                    t2.append(ng2.h.a((Class)((JsonObject)i).getClass()));
                    throw kotlinx.coroutines.channels.a.e(-1, t2.toString());
                }
                o = new qj2.j(h3, (pj2.b)i);
            }
            else {
                final a h4 = this.h;
                if (!(i instanceof JsonObject)) {
                    final StringBuilder t3 = a.t("Expected ");
                    t3.append(ng2.h.a((Class)JsonObject.class));
                    t3.append(" as the serialized body of ");
                    t3.append(e.h());
                    t3.append(", but had ");
                    t3.append(ng2.h.a((Class)((JsonObject)i).getClass()));
                    throw kotlinx.coroutines.channels.a.e(-1, t3.toString());
                }
                o = new k(h4, (JsonObject)i);
            }
        }
        else {
            final a h5 = this.h;
            if (!(i instanceof JsonObject)) {
                final StringBuilder t4 = a.t("Expected ");
                t4.append(ng2.h.a((Class)JsonObject.class));
                t4.append(" as the serialized body of ");
                t4.append(e.h());
                t4.append(", but had ");
                t4.append(ng2.h.a((Class)((JsonObject)i).getClass()));
                throw kotlinx.coroutines.channels.a.e(-1, t4.toString());
            }
            o = new JsonTreeDecoder(h5, (JsonObject)i, (String)null, (mj2.e)null);
        }
        return (nj2.a)o;
    }
    
    public final a a0() {
        return this.h;
    }
    
    @Override
    public final boolean b(Object o) {
        final String s = (String)o;
        ng2.e.f((Object)s, "tag");
        final m k = this.K(s);
        if (!this.h.a.c) {
            if (E(k, "boolean").f) {
                throw kotlinx.coroutines.channels.a.f(this.I().toString(), -1, a.n("Boolean literal for key '", s, "' should be unquoted.\nUse 'isLenient = true' in 'Json {}` builder to accept non-compliant JSON."));
            }
        }
        try {
            final String a = k.a();
            final String[] a2 = p.a;
            ng2.e.f((Object)a, "<this>");
            Boolean b;
            if (xi2.j.z0(a, "true", true)) {
                b = Boolean.TRUE;
            }
            else if (xi2.j.z0(a, "false", true)) {
                b = Boolean.FALSE;
            }
            else {
                b = null;
            }
            if (b != null) {
                return b;
            }
            o = new IllegalArgumentException();
            throw o;
        }
        catch (final IllegalArgumentException ex) {
            this.N("boolean");
            throw null;
        }
    }
    
    public final b6.h c() {
        return this.h.b;
    }
    
    public void d(final mj2.e e) {
        ng2.e.f((Object)e, "descriptor");
    }
    
    @Override
    public final byte i(final Object o) {
        final String s = (String)o;
        ng2.e.f((Object)s, "tag");
        final m k = this.K(s);
        try {
            final int int1 = Integer.parseInt(k.a());
            int n = 0;
            if (-128 <= int1) {
                n = n;
                if (int1 <= 127) {
                    n = 1;
                }
            }
            Byte value;
            if (n != 0) {
                value = (byte)int1;
            }
            else {
                value = null;
            }
            if (value != null) {
                return value.byteValue();
            }
            this.N("byte");
            throw null;
        }
        catch (final IllegalArgumentException ex) {
            this.N("byte");
            throw null;
        }
    }
    
    @Override
    public final char k(Object o) {
        final String s = (String)o;
        ng2.e.f((Object)s, "tag");
        final m k = this.K(s);
        try {
            final String a = k.a();
            ng2.e.f((Object)a, "<this>");
            final int length = a.length();
            if (length == 0) {
                o = new NoSuchElementException("Char sequence is empty.");
                throw o;
            }
            if (length == 1) {
                return a.charAt(0);
            }
            o = new IllegalArgumentException("Char sequence has more than one element.");
            throw o;
        }
        catch (final IllegalArgumentException ex) {
            this.N("char");
            throw null;
        }
    }
    
    public final <T> T l(final lj2.a<T> a) {
        ng2.e.f((Object)a, "deserializer");
        return (T)p2.b.x((f)this, (lj2.a)a);
    }
    
    @Override
    public final double m(final Object o) {
        final String s = (String)o;
        ng2.e.f((Object)s, "tag");
        final m k = this.K(s);
        try {
            final double double1 = Double.parseDouble(k.a());
            if (!this.h.a.k && (Double.isInfinite(double1) || Double.isNaN(double1))) {
                throw kotlinx.coroutines.channels.a.b(double1, s, this.I().toString());
            }
            return double1;
        }
        catch (final IllegalArgumentException ex) {
            this.N("double");
            throw null;
        }
    }
    
    @Override
    public final float n(final Object o) {
        final String s = (String)o;
        ng2.e.f((Object)s, "tag");
        final m k = this.K(s);
        try {
            final float float1 = Float.parseFloat(k.a());
            if (!this.h.a.k && (Float.isInfinite(float1) || Float.isNaN(float1))) {
                throw kotlinx.coroutines.channels.a.b(float1, s, this.I().toString());
            }
            return float1;
        }
        catch (final IllegalArgumentException ex) {
            this.N("float");
            throw null;
        }
    }
    
    @Override
    public final short o(final Object o) {
        final String s = (String)o;
        ng2.e.f((Object)s, "tag");
        final m k = this.K(s);
        try {
            final int int1 = Integer.parseInt(k.a());
            int n = 0;
            if (-32768 <= int1) {
                n = n;
                if (int1 <= 32767) {
                    n = 1;
                }
            }
            Short value;
            if (n != 0) {
                value = (short)int1;
            }
            else {
                value = null;
            }
            if (value != null) {
                return value.shortValue();
            }
            this.N("short");
            throw null;
        }
        catch (final IllegalArgumentException ex) {
            this.N("short");
            throw null;
        }
    }
    
    @Override
    public final String p(final Object o) {
        final String s = (String)o;
        ng2.e.f((Object)s, "tag");
        final m k = this.K(s);
        if (!this.h.a.c && !E(k, "string").f) {
            throw kotlinx.coroutines.channels.a.f(this.I().toString(), -1, a.n("String literal for key '", s, "' should be quoted.\nUse 'isLenient = true' in 'Json {}` builder to accept non-compliant JSON."));
        }
        if (!(k instanceof JsonNull)) {
            return k.a();
        }
        throw kotlinx.coroutines.channels.a.f(this.I().toString(), -1, "Unexpected 'null' value instead of string literal");
    }
}
