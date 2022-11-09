// 
// Decompiled by Procyon v0.6.0
// 

package kc;

import vg.b;
import java.util.Comparator;
import java.util.TreeSet;

public final class d
{
    public final TreeSet<a> a;
    public int b;
    public int c;
    public boolean d;
    
    public d() {
        this.a = new TreeSet<a>((Comparator<? super a>)new e2.d(3));
        this.d();
    }
    
    public static int b(int n, final int n2) {
        final int n3 = n - n2;
        if (Math.abs(n3) > 1000) {
            final int n4 = Math.min(n, n2) - Math.max(n, n2) + 65535;
            if (n4 < 1000) {
                if (n < n2) {
                    n = n4;
                }
                else {
                    n = -n4;
                }
                return n;
            }
        }
        return n3;
    }
    
    public final void a(final a a) {
        synchronized (this) {
            this.b = a.a.c;
            this.a.add(a);
        }
    }
    
    public final c c(final long n) {
        synchronized (this) {
            if (this.a.isEmpty()) {
                return null;
            }
            final a a = this.a.first();
            final int c = a.a.c;
            if (c != vg.b.c(this.c + 1) && n < a.b) {
                return null;
            }
            this.a.pollFirst();
            this.c = c;
            return a.a;
        }
    }
    
    public final void d() {
        synchronized (this) {
            this.a.clear();
            this.d = false;
            this.c = -1;
            this.b = -1;
        }
    }
    
    public static final class a
    {
        public final c a;
        public final long b;
        
        public a(final c a, final long b) {
            this.a = a;
            this.b = b;
        }
    }
}
