// 
// Decompiled by Procyon v0.6.0
// 

package kb;

import bd.s;
import ak0.m;
import ak0.n;
import java.util.Arrays;
import java.util.ArrayList;

public abstract class a
{
    public final int a;
    
    public a(final int a) {
        this.a = a;
    }
    
    public static String a(final int n) {
        final char c = (char)(n >> 24 & 0xFF);
        final char c2 = (char)(n >> 16 & 0xFF);
        final char c3 = (char)(n >> 8 & 0xFF);
        final char c4 = (char)(n & 0xFF);
        final StringBuilder sb = new StringBuilder(4);
        sb.append(c);
        sb.append(c2);
        sb.append(c3);
        sb.append(c4);
        return sb.toString();
    }
    
    @Override
    public String toString() {
        return a(this.a);
    }
    
    public static final class a extends kb.a
    {
        public final long b;
        public final ArrayList c;
        public final ArrayList d;
        
        public a(final int n, final long b) {
            super(n);
            this.b = b;
            this.c = new ArrayList();
            this.d = new ArrayList();
        }
        
        public final a b(final int n) {
            for (int size = this.d.size(), i = 0; i < size; ++i) {
                final a a = this.d.get(i);
                if (a.a == n) {
                    return a;
                }
            }
            return null;
        }
        
        public final b c(final int n) {
            for (int size = this.c.size(), i = 0; i < size; ++i) {
                final b b = this.c.get(i);
                if (b.a == n) {
                    return b;
                }
            }
            return null;
        }
        
        @Override
        public final String toString() {
            final String a = kb.a.a(super.a);
            final String string = Arrays.toString(this.c.toArray());
            final String string2 = Arrays.toString(this.d.toArray());
            final StringBuilder q = m.q(n.f(string2, n.f(string, n.f(a, 22))), a, " leaves: ", string, " containers: ");
            q.append(string2);
            return q.toString();
        }
    }
    
    public static final class b extends a
    {
        public final s b;
        
        public b(final int n, final s b) {
            super(n);
            this.b = b;
        }
    }
}
