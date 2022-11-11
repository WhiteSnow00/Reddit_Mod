// 
// Decompiled by Procyon v0.6.0
// 

package uj2;

import a4.a0;
import java.util.NoSuchElementException;
import kotlinx.serialization.json.internal.JsonTreeDecoder;
import kotlinx.serialization.json.JsonObject;
import qj2.i$c;
import sg2.h;
import qj2.c;
import qj2.i$b;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlinx.serialization.json.JsonNull;
import tj2.g;
import bg.d;
import tj2.j;
import tj2.n;
import tj2.e;
import tj2.a;
import tj2.f;
import kotlinx.serialization.internal.TaggedDecoder;

public abstract class b extends TaggedDecoder implements f
{
    public final tj2.a c;
    public final e d;
    
    public b(final tj2.a c) {
        this.c = c;
        this.d = c.a;
    }
    
    public static j N(final n n, final String s) {
        j j;
        if (n instanceof j) {
            j = (j)n;
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
        throw d.j(-1, sb.toString());
    }
    
    public final g A() {
        return this.P();
    }
    
    @Override
    public final String C(final Object o) {
        final String s = (String)o;
        sg2.e.f((Object)s, "tag");
        final n r = this.R(s);
        if (!this.c.a.c && !N(r, "string").f) {
            throw bg.d.k((CharSequence)this.P().toString(), -1, a.k("String literal for key '", s, "' should be quoted.\nUse 'isLenient = true' in 'Json {}` builder to accept non-compliant JSON."));
        }
        if (!(r instanceof JsonNull)) {
            return r.a();
        }
        throw bg.d.k((CharSequence)this.P().toString(), -1, "Unexpected 'null' value instead of string literal");
    }
    
    @Override
    public boolean K() {
        return this.P() instanceof JsonNull ^ true;
    }
    
    public final tj2.a L() {
        return this.c;
    }
    
    public abstract g O(final String p0);
    
    public final g P() {
        final String s = (String)CollectionsKt___CollectionsKt.M3((List)super.a);
        g g;
        if (s == null || (g = this.O(s)) == null) {
            g = this.T();
        }
        return g;
    }
    
    public abstract String Q(final qj2.e p0, final int p1);
    
    public final n R(String string) {
        sg2.e.f((Object)string, "tag");
        final g o = this.O(string);
        n n;
        if (o instanceof n) {
            n = (n)o;
        }
        else {
            n = null;
        }
        if (n != null) {
            return n;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Expected JsonPrimitive at ");
        sb.append(string);
        sb.append(", found ");
        sb.append(o);
        string = sb.toString();
        throw bg.d.k((CharSequence)this.P().toString(), -1, string);
    }
    
    public final String S(final qj2.e e, final int n) {
        sg2.e.f((Object)e, "<this>");
        final String q = this.Q(e, n);
        sg2.e.f((Object)q, "nestedName");
        final String s = (String)CollectionsKt___CollectionsKt.M3((List)super.a);
        return q;
    }
    
    public abstract g T();
    
    public final void U(String g) {
        g = b.g("Failed to parse '", g, '\'');
        throw bg.d.k((CharSequence)this.P().toString(), -1, g);
    }
    
    public a a(final qj2.e e) {
        sg2.e.f((Object)e, "descriptor");
        final g p = this.P();
        final qj2.h kind = e.getKind();
        Object o;
        if (sg2.e.a((Object)kind, (Object)i$b.a) || kind instanceof qj2.c) {
            final tj2.a c = this.c;
            if (!(p instanceof tj2.b)) {
                final StringBuilder r = a.r("Expected ");
                r.append(h.a((Class)tj2.b.class));
                r.append(" as the serialized body of ");
                r.append(e.h());
                r.append(", but had ");
                r.append(h.a((Class)((JsonObject)p).getClass()));
                throw bg.d.j(-1, r.toString());
            }
            o = new uj2.j(c, (tj2.b)p);
        }
        else if (sg2.e.a((Object)kind, (Object)i$c.a)) {
            final tj2.a c2 = this.c;
            final qj2.e v = vl.a.v(e.d(0), c2.b);
            final qj2.h kind2 = v.getKind();
            if (!(kind2 instanceof qj2.d) && !sg2.e.a((Object)kind2, (Object)qj2.h.b.a)) {
                if (!c2.a.d) {
                    throw bg.d.i(v);
                }
                final tj2.a c3 = this.c;
                if (!(p instanceof tj2.b)) {
                    final StringBuilder r2 = a.r("Expected ");
                    r2.append(h.a((Class)tj2.b.class));
                    r2.append(" as the serialized body of ");
                    r2.append(e.h());
                    r2.append(", but had ");
                    r2.append(h.a((Class)((JsonObject)p).getClass()));
                    throw bg.d.j(-1, r2.toString());
                }
                o = new uj2.j(c3, (tj2.b)p);
            }
            else {
                final tj2.a c4 = this.c;
                if (!(p instanceof JsonObject)) {
                    final StringBuilder r3 = a.r("Expected ");
                    r3.append(h.a((Class)JsonObject.class));
                    r3.append(" as the serialized body of ");
                    r3.append(e.h());
                    r3.append(", but had ");
                    r3.append(h.a((Class)((JsonObject)p).getClass()));
                    throw bg.d.j(-1, r3.toString());
                }
                o = new k(c4, (JsonObject)p);
            }
        }
        else {
            final tj2.a c5 = this.c;
            if (!(p instanceof JsonObject)) {
                final StringBuilder r4 = a.r("Expected ");
                r4.append(h.a((Class)JsonObject.class));
                r4.append(" as the serialized body of ");
                r4.append(e.h());
                r4.append(", but had ");
                r4.append(h.a((Class)((JsonObject)p).getClass()));
                throw bg.d.j(-1, r4.toString());
            }
            o = new JsonTreeDecoder(c5, (JsonObject)p, (String)null, (qj2.e)null);
        }
        return (a)o;
    }
    
    @Override
    public final boolean b(Object o) {
        final String s = (String)o;
        sg2.e.f((Object)s, "tag");
        final n r = this.R(s);
        if (!this.c.a.c) {
            if (N(r, "boolean").f) {
                throw bg.d.k((CharSequence)this.P().toString(), -1, a.k("Boolean literal for key '", s, "' should be unquoted.\nUse 'isLenient = true' in 'Json {}` builder to accept non-compliant JSON."));
            }
        }
        try {
            final String a = r.a();
            final String[] a2 = p.a;
            sg2.e.f((Object)a, "<this>");
            Boolean b;
            if (cj2.j.F0(a, "true", true)) {
                b = Boolean.TRUE;
            }
            else if (cj2.j.F0(a, "false", true)) {
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
            this.U("boolean");
            throw null;
        }
    }
    
    public final android.support.v4.media.b c() {
        return this.c.b;
    }
    
    public void d(final qj2.e e) {
        sg2.e.f((Object)e, "descriptor");
    }
    
    @Override
    public final byte g(final Object o) {
        final String s = (String)o;
        sg2.e.f((Object)s, "tag");
        final n r = this.R(s);
        try {
            final int int1 = Integer.parseInt(r.a());
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
            this.U("byte");
            throw null;
        }
        catch (final IllegalArgumentException ex) {
            this.U("byte");
            throw null;
        }
    }
    
    @Override
    public final char l(Object o) {
        final String s = (String)o;
        sg2.e.f((Object)s, "tag");
        final n r = this.R(s);
        try {
            final String a = r.a();
            sg2.e.f((Object)a, "<this>");
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
            this.U("char");
            throw null;
        }
    }
    
    public final <T> T o(final pj2.a<T> a) {
        sg2.e.f((Object)a, "deserializer");
        return (T)a0.C((f)this, a);
    }
    
    @Override
    public final double t(final Object o) {
        final String s = (String)o;
        sg2.e.f((Object)s, "tag");
        final n r = this.R(s);
        try {
            final double double1 = Double.parseDouble(r.a());
            if (!this.c.a.k && (Double.isInfinite(double1) || Double.isNaN(double1))) {
                throw bg.d.g((Number)double1, s, this.P().toString());
            }
            return double1;
        }
        catch (final IllegalArgumentException ex) {
            this.U("double");
            throw null;
        }
    }
    
    @Override
    public final float v(final Object o) {
        final String s = (String)o;
        sg2.e.f((Object)s, "tag");
        final n r = this.R(s);
        try {
            final float float1 = Float.parseFloat(r.a());
            if (!this.c.a.k && (Float.isInfinite(float1) || Float.isNaN(float1))) {
                throw bg.d.g((Number)float1, s, this.P().toString());
            }
            return float1;
        }
        catch (final IllegalArgumentException ex) {
            this.U("float");
            throw null;
        }
    }
    
    @Override
    public final short w(final Object o) {
        final String s = (String)o;
        sg2.e.f((Object)s, "tag");
        final n r = this.R(s);
        try {
            final int int1 = Integer.parseInt(r.a());
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
            this.U("short");
            throw null;
        }
        catch (final IllegalArgumentException ex) {
            this.U("short");
            throw null;
        }
    }
}
