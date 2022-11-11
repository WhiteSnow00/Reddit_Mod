// 
// Decompiled by Procyon v0.6.0
// 

package ja;

import com.google.android.datatransport.runtime.b$a;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.a$a;
import com.google.android.datatransport.runtime.EventInternal;
import ga.g;
import ga.a;
import ga.d;
import ga.b;
import com.google.android.datatransport.runtime.c;
import ga.e;

public final class l<T> implements e<T>
{
    public final c a;
    public final String b;
    public final b c;
    public final d<T, byte[]> d;
    public final m e;
    
    public l(final c a, final String b, final b c, final d<T, byte[]> d, final m e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final void a(final a c, final g g) {
        final m e = this.e;
        final ja.b.a a = new ja.b.a();
        final c a2 = this.a;
        if (a2 == null) {
            throw new NullPointerException("Null transportContext");
        }
        a.a = a2;
        a.c = (ga.c<?>)c;
        final String b = this.b;
        if (b == null) {
            throw new NullPointerException("Null transportName");
        }
        a.b = b;
        final d<T, byte[]> d = this.d;
        if (d == null) {
            throw new NullPointerException("Null transformer");
        }
        a.d = d;
        final b c2 = this.c;
        if (c2 == null) {
            throw new NullPointerException("Null encoding");
        }
        a.e = c2;
        String h = "";
        if (a.e == null) {
            h = al0.b.h("", " encoding");
        }
        if (h.isEmpty()) {
            final ja.b b2 = new ja.b(a.a, a.b, a.c, a.d, a.e);
            final com.google.android.datatransport.runtime.d d2 = (com.google.android.datatransport.runtime.d)e;
            final pa.e c3 = d2.c;
            final c a3 = b2.a;
            final Priority c4 = b2.c.c();
            a3.getClass();
            final b$a a4 = c.a();
            a4.b(a3.b());
            a4.c(c4);
            a4.b = a3.c();
            final com.google.android.datatransport.runtime.b a5 = a4.a();
            final EventInternal.a builder = EventInternal.builder();
            ((a$a)builder).d = d2.a.a();
            final long a6 = d2.b.a();
            final a$a a$a = (a$a)builder;
            a$a.e = a6;
            builder.d(b2.b);
            builder.c(new ja.e(b2.e, (byte[])b2.d.apply(b2.c.b())));
            a$a.b = b2.c.a();
            c3.a(g, a$a.b(), a5);
            return;
        }
        throw new IllegalStateException(al0.b.h("Missing required properties:", h));
    }
}
