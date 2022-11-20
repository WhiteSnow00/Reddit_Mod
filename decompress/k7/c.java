// 
// Decompiled by Procyon v0.6.0
// 

package k7;

import fk2.e0;
import java.io.IOException;
import fk2.e;

public final class c extends d
{
    public static final String[] m;
    public final e k;
    public String l;
    
    static {
        new c.c$a();
        final String[] i = new String[128];
        int n = 0;
        while (true) {
            final int n2 = n + 1;
            final byte b = (byte)n;
            final StringBuilder sb = new StringBuilder();
            sb.append("0123456789abcdef".charAt(b >>> 4));
            sb.append("0123456789abcdef".charAt(b & 0xF));
            i[n] = ng2.e.l((Object)sb.toString(), "\\u00");
            if (n2 > 31) {
                break;
            }
            n = n2;
        }
        i[34] = "\\\"";
        i[92] = "\\\\";
        i[9] = "\\t";
        i[8] = "\\b";
        i[10] = "\\n";
        i[13] = "\\r";
        m = i;
    }
    
    public c(final fk2.c k) {
        this.k = (e)k;
        this.w(6);
    }
    
    public final c A(final String s) throws IOException {
        if (s == null) {
            this.t();
            return this;
        }
        this.I();
        this.B();
        c.c$a.a(this.k, s);
        final int[] i = super.i;
        final int n = super.f - 1;
        ++i[n];
        return this;
    }
    
    public final void B() throws IOException {
        final int v = this.v();
        if (v != 1) {
            if (v != 2) {
                if (v != 4) {
                    if (v != 6) {
                        if (v == 7) {
                            throw new IllegalStateException("JSON must have only one top-level value.".toString());
                        }
                        throw new IllegalStateException("Nesting problem.");
                    }
                    else {
                        super.g[super.f - 1] = 7;
                    }
                }
                else {
                    this.k.a1(":");
                    super.g[super.f - 1] = 5;
                }
            }
            else {
                this.k.writeByte(44);
            }
        }
        else {
            super.g[super.f - 1] = 2;
        }
    }
    
    public final void E(int f, final int n, final String s) throws IOException {
        final int v = this.v();
        final int n2 = 0;
        if (v != n && v != f) {
            f = 0;
        }
        else {
            f = 1;
        }
        if (f == 0) {
            throw new IllegalStateException("Nesting problem.".toString());
        }
        final String l = this.l;
        f = n2;
        if (l == null) {
            f = 1;
        }
        if (f != 0) {
            f = super.f - 1;
            super.f = f;
            super.h[f] = null;
            final int[] i = super.i;
            --f;
            ++i[f];
            this.k.a1(s);
            return;
        }
        throw new IllegalStateException(ng2.e.l((Object)l, "Dangling name: ").toString());
    }
    
    public final c F(final String s) throws IOException {
        if (s == null) {
            this.t();
            return this;
        }
        this.I();
        this.B();
        this.k.a1(s);
        final int[] i = super.i;
        final int n = super.f - 1;
        ++i[n];
        return this;
    }
    
    public final c H() throws IOException {
        this.I();
        this.B();
        this.k.a1(String.valueOf(1L));
        final int[] i = super.i;
        final int n = super.f - 1;
        ++i[n];
        return this;
    }
    
    public final void I() throws IOException {
        if (this.l != null) {
            final int v = this.v();
            if (v == 5) {
                this.k.writeByte(44);
            }
            else if (v != 3) {
                throw new IllegalStateException("Nesting problem.".toString());
            }
            super.g[super.f - 1] = 4;
            final e k = this.k;
            final String l = this.l;
            if (l == null) {
                ng2.e.m();
                throw null;
            }
            c.c$a.a(k, l);
            this.l = null;
        }
    }
    
    public final c b() throws IOException {
        this.I();
        this.B();
        this.w(1);
        super.i[super.f - 1] = 0;
        this.k.a1("[");
        return this;
    }
    
    public final void close() throws IOException {
        ((e0)this.k).close();
        final int f = super.f;
        if (f <= 1 && (f != 1 || super.g[f - 1] == 7)) {
            super.f = 0;
            return;
        }
        throw new IOException("Incomplete document");
    }
    
    public final void flush() throws IOException {
        if (super.f != 0) {
            this.k.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.".toString());
    }
    
    public final c h() throws IOException {
        this.I();
        this.B();
        this.w(3);
        super.i[super.f - 1] = 0;
        this.k.a1("{");
        return this;
    }
    
    public final c q() throws IOException {
        this.E(1, 2, "]");
        return this;
    }
    
    public final c r() throws IOException {
        this.E(3, 5, "}");
        return this;
    }
    
    public final c s(final String l) throws IOException {
        ng2.e.g((Object)l, "name");
        final int f = super.f;
        final int n = 0;
        if (f == 0) {
            throw new IllegalStateException("JsonWriter is closed.".toString());
        }
        int n2 = n;
        if (this.l == null) {
            n2 = 1;
        }
        if (n2 != 0) {
            this.l = l;
            super.h[f - 1] = l;
            return this;
        }
        throw new IllegalStateException("Nesting problem.".toString());
    }
    
    public final c t() throws IOException {
        if (this.l != null) {
            if (!super.j) {
                this.l = null;
                return this;
            }
            this.I();
        }
        this.B();
        this.k.a1("null");
        final int[] i = super.i;
        final int n = super.f - 1;
        ++i[n];
        return this;
    }
    
    public final c x(final Boolean b) throws IOException {
        if (b == null) {
            this.t();
        }
        else {
            this.I();
            this.B();
            final e k = this.k;
            String s;
            if (b) {
                s = "true";
            }
            else {
                s = "false";
            }
            k.a1(s);
            final int[] i = super.i;
            final int n = super.f - 1;
            ++i[n];
        }
        return this;
    }
    
    public final c y(final Number n) throws IOException {
        if (n == null) {
            this.t();
            return this;
        }
        final String string = n.toString();
        if (!ng2.e.a((Object)string, (Object)"-Infinity") && !ng2.e.a((Object)string, (Object)"Infinity") && !ng2.e.a((Object)string, (Object)"NaN")) {
            this.I();
            this.B();
            this.k.a1(string);
            final int[] i = super.i;
            final int n2 = super.f - 1;
            ++i[n2];
            return this;
        }
        throw new IllegalArgumentException(ng2.e.l((Object)n, "Numeric values must be finite, but was ").toString());
    }
}
