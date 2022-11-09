// 
// Decompiled by Procyon v0.6.0
// 

package z1;

import c2.l;
import java.util.Map;
import a1.e;

public class j
{
    public final e<i> a;
    
    public j() {
        this.a = new e<i>(new i[16]);
    }
    
    public boolean a(final Map<n, o> map, final l l, final f f, final boolean b) {
        ah2.f.f((Object)map, "changes");
        ah2.f.f((Object)l, "parentCoordinates");
        final e<i> a = this.a;
        final int h = a.h;
        boolean b2 = false;
        if (h > 0) {
            final i[] f2 = a.f;
            int n2;
            int n = n2 = 0;
            int i;
            do {
                b2 = (f2[n].a(map, l, f, b) || n2 != 0);
                i = ++n;
                n2 = (b2 ? 1 : 0);
            } while (i < h);
        }
        return b2;
    }
    
    public void b(final f f) {
        for (int n = this.a.h - 1; -1 < n; --n) {
            if (this.a.f[n].c.j()) {
                this.a.n(n);
            }
        }
    }
    
    public void c() {
        final e<i> a = this.a;
        final int h = a.h;
        if (h > 0) {
            int n = 0;
            final i[] f = a.f;
            do {
                f[n].c();
            } while (++n < h);
        }
    }
    
    public boolean d(final f f) {
        final e<i> a = this.a;
        final int h = a.h;
        boolean b = false;
        if (h > 0) {
            final i[] f2 = a.f;
            int n2;
            int n = n2 = 0;
            int i;
            do {
                b = (f2[n].d(f) || n2 != 0);
                i = ++n;
                n2 = (b ? 1 : 0);
            } while (i < h);
        }
        this.b(f);
        return b;
    }
    
    public boolean e(final Map<n, o> map, final l l, final f f, final boolean b) {
        ah2.f.f((Object)map, "changes");
        ah2.f.f((Object)l, "parentCoordinates");
        final e<i> a = this.a;
        final int h = a.h;
        boolean b2 = false;
        if (h > 0) {
            final i[] f2 = a.f;
            int n2;
            int n = n2 = 0;
            int i;
            do {
                b2 = (f2[n].e(map, l, f, b) || n2 != 0);
                i = ++n;
                n2 = (b2 ? 1 : 0);
            } while (i < h);
        }
        return b2;
    }
    
    public final void f() {
        int n = 0;
        while (true) {
            final e<i> a = this.a;
            if (n >= a.h) {
                break;
            }
            final i i = a.f[n];
            if (!i.b.g) {
                a.n(n);
                i.c();
            }
            else {
                ++n;
                i.f();
            }
        }
    }
}
