// 
// Decompiled by Procyon v0.6.0
// 

package zc;

import java.util.Comparator;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;
import kc.d;
import ec.a;

public final class q
{
    public static final ec.a h;
    public static final d i;
    public final int a;
    public final ArrayList<a> b;
    public final a[] c;
    public int d;
    public int e;
    public int f;
    public int g;
    
    static {
        h = new ec.a(3);
        i = new d(4);
    }
    
    public q(final int a) {
        this.a = a;
        this.c = new a[5];
        this.b = new ArrayList<a>();
        this.d = -1;
    }
    
    public final void a(final float c, int b) {
        if (this.d != 1) {
            Collections.sort(this.b, (Comparator<? super a>)q.h);
            this.d = 1;
        }
        int g = this.g;
        a a;
        if (g > 0) {
            final a[] c2 = this.c;
            --g;
            this.g = g;
            a = c2[g];
        }
        else {
            a = new a();
        }
        a.a = this.e++;
        a.b = b;
        a.c = c;
        this.b.add(a);
        this.f += b;
        while (true) {
            b = this.f;
            final int a2 = this.a;
            if (b <= a2) {
                break;
            }
            b -= a2;
            final a a3 = this.b.get(0);
            final int b2 = a3.b;
            if (b2 <= b) {
                this.f -= b2;
                this.b.remove(0);
                b = this.g;
                if (b >= 5) {
                    continue;
                }
                final a[] c3 = this.c;
                this.g = b + 1;
                c3[b] = a3;
            }
            else {
                a3.b = b2 - b;
                this.f -= b;
            }
        }
    }
    
    public final float b() {
        final int d = this.d;
        int i = 0;
        if (d != 0) {
            Collections.sort(this.b, (Comparator<? super a>)q.i);
            this.d = 0;
        }
        final float n = (float)this.f;
        int n2 = 0;
        while (i < this.b.size()) {
            final a a = this.b.get(i);
            n2 += a.b;
            if (n2 >= 0.5f * n) {
                return a.c;
            }
            ++i;
        }
        float c;
        if (this.b.isEmpty()) {
            c = Float.NaN;
        }
        else {
            final ArrayList<a> b = this.b;
            c = ((a)b.get(b.size() - 1)).c;
        }
        return c;
    }
    
    public static final class a
    {
        public int a;
        public int b;
        public float c;
    }
}
