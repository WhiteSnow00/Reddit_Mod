// 
// Decompiled by Procyon v0.6.0
// 

package ka;

import com.google.android.datatransport.runtime.EventInternal$a;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.EventInternal;
import ha.g;
import ha.a;
import ha.d;
import ha.b;
import com.google.android.datatransport.runtime.c;
import ha.e;

public final class k<T> implements e<T>
{
    public final c a;
    public final String b;
    public final b c;
    public final d<T, byte[]> d;
    public final l e;
    
    public k(final c a, final String b, final b c, final d<T, byte[]> d, final l e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final void a(final a c, final g g) {
        final l e = this.e;
        final ka.b.a a = new ka.b.a();
        final c a2 = this.a;
        if (a2 == null) {
            throw new NullPointerException("Null transportContext");
        }
        a.a = a2;
        a.c = (ha.c<?>)c;
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
        String l = "";
        if (a.e == null) {
            l = b.l("", " encoding");
        }
        if (l.isEmpty()) {
            final ka.b b2 = new ka.b(a.a, a.b, a.c, a.d, a.e);
            final com.google.android.datatransport.runtime.d d2 = (com.google.android.datatransport.runtime.d)e;
            final qa.e c3 = d2.c;
            final c a3 = b2.a;
            final Priority c4 = b2.c.c();
            a3.getClass();
            final com.google.android.datatransport.runtime.b.a a4 = c.a();
            a4.b(a3.b());
            a4.c(c4);
            a4.b = a3.c();
            final com.google.android.datatransport.runtime.b a5 = a4.a();
            final EventInternal$a builder = EventInternal.builder();
            ((com.google.android.datatransport.runtime.a.a)builder).d = d2.a.a();
            final long a6 = d2.b.a();
            final com.google.android.datatransport.runtime.a.a a7 = (com.google.android.datatransport.runtime.a.a)builder;
            a7.e = a6;
            builder.d(b2.b);
            builder.c(new ka.e(b2.e, (byte[])b2.d.apply(b2.c.b())));
            a7.b = b2.c.a();
            c3.a(g, a7.b(), a5);
            return;
        }
        throw new IllegalStateException(b.l("Missing required properties:", l));
    }
}
