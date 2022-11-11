// 
// Decompiled by Procyon v0.6.0
// 

package m4;

import s5.c;
import java.nio.ByteBuffer;
import s5.a;

public final class b
{
    public static final ThreadLocal<a> d;
    public final int a;
    public final h b;
    public volatile int c;
    
    static {
        d = new ThreadLocal<a>();
    }
    
    public b(final h b, final int a) {
        this.c = 0;
        this.b = b;
        this.a = a;
    }
    
    public final int a(int int1) {
        final a c = this.c();
        final int a = ((c)c).a(16);
        if (a != 0) {
            final ByteBuffer b = ((c)c).b;
            final int n = a + ((c)c).a;
            int1 = b.getInt(int1 * 4 + (b.getInt(n) + n + 4));
        }
        else {
            int1 = 0;
        }
        return int1;
    }
    
    public final int b() {
        final a c = this.c();
        final int a = ((c)c).a(16);
        int int1;
        if (a != 0) {
            final int n = a + ((c)c).a;
            int1 = ((c)c).b.getInt(((c)c).b.getInt(n) + n);
        }
        else {
            int1 = 0;
        }
        return int1;
    }
    
    public final a c() {
        final ThreadLocal<a> d = m4.b.d;
        a a;
        if ((a = d.get()) == null) {
            a = new a();
            d.set(a);
        }
        final s5.b a2 = this.b.a;
        final int a3 = this.a;
        final int a4 = ((c)a2).a(6);
        if (a4 != 0) {
            final int n = a4 + ((c)a2).a;
            final int n2 = a3 * 4 + (((c)a2).b.getInt(n) + n + 4);
            final int int1 = ((c)a2).b.getInt(n2);
            final ByteBuffer b = ((c)a2).b;
            ((c)a).a = int1 + n2;
            ((c)a).b = b;
        }
        return a;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        final a c = this.c();
        final int a = ((c)c).a(4);
        final int n = 0;
        int int1;
        if (a != 0) {
            int1 = ((c)c).b.getInt(a + ((c)c).a);
        }
        else {
            int1 = 0;
        }
        sb.append(Integer.toHexString(int1));
        sb.append(", codepoints:");
        for (int b = this.b(), i = n; i < b; ++i) {
            sb.append(Integer.toHexString(this.a(i)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
