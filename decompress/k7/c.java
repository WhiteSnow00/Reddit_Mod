// 
// Decompiled by Procyon v0.6.0
// 

package k7;

import rk2.e0;
import java.io.IOException;
import ah2.f;
import rk2.e;

public final class c extends d
{
    public static final String[] m;
    public final e k;
    public String l;
    
    static {
        new a();
        final String[] i = new String[128];
        int n = 0;
        while (true) {
            final int n2 = n + 1;
            final byte b = (byte)n;
            final StringBuilder sb = new StringBuilder();
            sb.append("0123456789abcdef".charAt(b >>> 4));
            sb.append("0123456789abcdef".charAt(b & 0xF));
            i[n] = f.l((Object)sb.toString(), "\\u00");
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
    
    public c(final rk2.c k) {
        this.k = (e)k;
        this.w(6);
    }
    
    @Override
    public final c A(final String s) throws IOException {
        if (s == null) {
            this.t();
            return this;
        }
        this.J();
        this.B();
        a.a(this.k, s);
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
                    this.k.Y0(":");
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
    
    public final void D(int f, final int n, final String s) throws IOException {
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
            this.k.Y0(s);
            return;
        }
        throw new IllegalStateException(f.l((Object)l, "Dangling name: ").toString());
    }
    
    public final c F(final String s) throws IOException {
        if (s == null) {
            this.t();
            return this;
        }
        this.J();
        this.B();
        this.k.Y0(s);
        final int[] i = super.i;
        final int n = super.f - 1;
        ++i[n];
        return this;
    }
    
    public final c H() throws IOException {
        this.J();
        this.B();
        this.k.Y0(String.valueOf(1L));
        final int[] i = super.i;
        final int n = super.f - 1;
        ++i[n];
        return this;
    }
    
    public final void J() throws IOException {
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
                ah2.f.m();
                throw null;
            }
            a.a(k, l);
            this.l = null;
        }
    }
    
    @Override
    public final c b() throws IOException {
        this.J();
        this.B();
        this.w(1);
        super.i[super.f - 1] = 0;
        this.k.Y0("[");
        return this;
    }
    
    @Override
    public final void close() throws IOException {
        ((e0)this.k).close();
        final int f = super.f;
        if (f <= 1 && (f != 1 || super.g[f - 1] == 7)) {
            super.f = 0;
            return;
        }
        throw new IOException("Incomplete document");
    }
    
    @Override
    public final void flush() throws IOException {
        if (super.f != 0) {
            this.k.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.".toString());
    }
    
    @Override
    public final c h() throws IOException {
        this.J();
        this.B();
        this.w(3);
        super.i[super.f - 1] = 0;
        this.k.Y0("{");
        return this;
    }
    
    @Override
    public final c q() throws IOException {
        this.D(1, 2, "]");
        return this;
    }
    
    @Override
    public final c r() throws IOException {
        this.D(3, 5, "}");
        return this;
    }
    
    @Override
    public final c s(final String l) throws IOException {
        ah2.f.g((Object)l, "name");
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
    
    @Override
    public final c t() throws IOException {
        if (this.l != null) {
            if (!super.j) {
                this.l = null;
                return this;
            }
            this.J();
        }
        this.B();
        this.k.Y0("null");
        final int[] i = super.i;
        final int n = super.f - 1;
        ++i[n];
        return this;
    }
    
    @Override
    public final c x(final Boolean b) throws IOException {
        if (b == null) {
            this.t();
        }
        else {
            this.J();
            this.B();
            final e k = this.k;
            String s;
            if (b) {
                s = "true";
            }
            else {
                s = "false";
            }
            k.Y0(s);
            final int[] i = super.i;
            final int n = super.f - 1;
            ++i[n];
        }
        return this;
    }
    
    @Override
    public final c y(final Number n) throws IOException {
        if (n == null) {
            this.t();
            return this;
        }
        final String string = n.toString();
        if (!ah2.f.a((Object)string, (Object)"-Infinity") && !ah2.f.a((Object)string, (Object)"Infinity") && !ah2.f.a((Object)string, (Object)"NaN")) {
            this.J();
            this.B();
            this.k.Y0(string);
            final int[] i = super.i;
            final int n2 = super.f - 1;
            ++i[n2];
            return this;
        }
        throw new IllegalArgumentException(ah2.f.l((Object)n, "Numeric values must be finite, but was ").toString());
    }
    
    public static final class a
    {
        public static void a(final e e, final String s) throws IOException {
            f.g((Object)e, "sink");
            f.g((Object)s, "value");
            final String[] m = c.m;
            e.writeByte(34);
            final int length = s.length();
            int n = 0;
            int n2 = 0;
            if (length > 0) {
                int n3 = 0;
                while (true) {
                    final int n4 = n2 + 1;
                    final char char1 = s.charAt(n2);
                    Label_0150: {
                        String s2;
                        if (char1 < '\u0080') {
                            if ((s2 = m[char1]) == null) {
                                n = n3;
                                break Label_0150;
                            }
                        }
                        else if (char1 == '\u2028') {
                            s2 = "\\u2028";
                        }
                        else {
                            n = n3;
                            if (char1 != '\u2029') {
                                break Label_0150;
                            }
                            s2 = "\\u2029";
                        }
                        if (n3 < n2) {
                            e.U(n3, n2, s);
                        }
                        e.Y0(s2);
                        n = n4;
                    }
                    if (n4 >= length) {
                        break;
                    }
                    n2 = n4;
                    n3 = n;
                }
            }
            if (n < length) {
                e.U(n, length, s);
            }
            e.writeByte(34);
        }
    }
}
