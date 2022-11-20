// 
// Decompiled by Procyon v0.6.0
// 

package qj2;

import java.util.Arrays;
import mj2.i$b;
import mj2.e;

public final class h
{
    public Object[] a;
    public int[] b;
    public int c;
    
    public h() {
        this.a = new Object[8];
        final int[] b = new int[8];
        for (int i = 0; i < 8; ++i) {
            b[i] = -1;
        }
        this.b = b;
        this.c = -1;
    }
    
    public final String a() {
        final StringBuilder t = a.t("$");
        for (int c = this.c, i = 0; i < c + 1; ++i) {
            final Object o = this.a[i];
            if (o instanceof e) {
                final e e = (e)o;
                if (ng2.e.a((Object)e.getKind(), (Object)i$b.a)) {
                    if (this.b[i] != -1) {
                        t.append("[");
                        t.append(this.b[i]);
                        t.append("]");
                    }
                }
                else {
                    final int n = this.b[i];
                    if (n >= 0) {
                        t.append(".");
                        t.append(e.f(n));
                    }
                }
            }
            else if (o != h.a.a) {
                t.append("[");
                t.append("'");
                t.append(o);
                t.append("'");
                t.append("]");
            }
        }
        final String string = t.toString();
        ng2.e.e((Object)string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
    
    public final void b() {
        final int n = this.c * 2;
        final Object[] copy = Arrays.copyOf(this.a, n);
        ng2.e.e((Object)copy, "copyOf(this, newSize)");
        this.a = copy;
        final int[] copy2 = Arrays.copyOf(this.b, n);
        ng2.e.e((Object)copy2, "copyOf(this, newSize)");
        this.b = copy2;
    }
    
    @Override
    public final String toString() {
        return this.a();
    }
    
    public static final class a
    {
        public static final a a;
        
        static {
            a = new a();
        }
    }
}
