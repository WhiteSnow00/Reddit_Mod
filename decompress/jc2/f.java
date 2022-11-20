// 
// Decompiled by Procyon v0.6.0
// 

package jc2;

import java.io.IOException;
import fc2.a0;
import fc2.n;
import fc2.w;
import ic2.d;
import ic2.g;
import fc2.s;
import java.util.List;
import fc2.s$a;

public final class f implements s$a
{
    public final List<s> a;
    public final g b;
    public final c c;
    public final d d;
    public final int e;
    public final w f;
    public final fc2.d g;
    public final n h;
    public final int i;
    public final int j;
    public final int k;
    public int l;
    
    public f(final List<s> a, final g b, final c c, final d d, final int e, final w f, final fc2.d g, final n h, final int i, final int j, final int k) {
        this.a = a;
        this.d = d;
        this.b = b;
        this.c = c;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
    }
    
    public final a0 a(final w w, final g g, final c c, final d d) throws IOException {
        if (this.e >= this.a.size()) {
            throw new AssertionError();
        }
        ++this.l;
        if (this.c != null && !this.d.j(w.a)) {
            final StringBuilder t = a.t("network interceptor ");
            t.append(this.a.get(this.e - 1));
            t.append(" must retain the same host and port");
            throw new IllegalStateException(t.toString());
        }
        if (this.c != null && this.l > 1) {
            final StringBuilder t2 = a.t("network interceptor ");
            t2.append(this.a.get(this.e - 1));
            t2.append(" must call proceed() exactly once");
            throw new IllegalStateException(t2.toString());
        }
        final List<s> a = this.a;
        final int e = this.e;
        final f f = new f(a, g, c, d, e + 1, w, this.g, this.h, this.i, this.j, this.k);
        final s s = a.get(e);
        final a0 a2 = s.a(f);
        if (c != null && this.e + 1 < this.a.size() && f.l != 1) {
            final StringBuilder sb = new StringBuilder();
            sb.append("network interceptor ");
            sb.append(s);
            sb.append(" must call proceed() exactly once");
            throw new IllegalStateException(sb.toString());
        }
        if (a2 == null) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("interceptor ");
            sb2.append(s);
            sb2.append(" returned null");
            throw new NullPointerException(sb2.toString());
        }
        if (a2.l != null) {
            return a2;
        }
        final StringBuilder sb3 = new StringBuilder();
        sb3.append("interceptor ");
        sb3.append(s);
        sb3.append(" returned a response with no body");
        throw new IllegalStateException(sb3.toString());
    }
}
