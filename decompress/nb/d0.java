// 
// Decompiled by Procyon v0.6.0
// 

package nb;

import m5.a;
import u10.o;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import com.google.android.exoplayer2.ParserException;
import bd.t;
import db.j;
import bd.a0;

public interface d0
{
    void a(final a0 p0, final j p1, final d p2);
    
    void b();
    
    void c(final int p0, final t p1) throws ParserException;
    
    public static final class a
    {
        public final String a;
        public final byte[] b;
        
        public a(final String a, final byte[] b) {
            this.a = a;
            this.b = b;
        }
    }
    
    public static final class b
    {
        public final String a;
        public final List<a> b;
        public final byte[] c;
        
        public b(final int n, final String a, final ArrayList list, final byte[] c) {
            this.a = a;
            List<Object> b;
            if (list == null) {
                b = (List<Object>)Collections.emptyList();
            }
            else {
                b = (List<Object>)Collections.unmodifiableList((List<? extends a>)list);
            }
            this.b = (List<a>)b;
            this.c = c;
        }
    }
    
    public interface c
    {
        d0 a(final int p0, final b p1);
    }
    
    public static final class d
    {
        public final String a;
        public final int b;
        public final int c;
        public int d;
        public String e;
        
        public d(final int n, final int n2) {
            this(Integer.MIN_VALUE, n, n2);
        }
        
        public d(final int n, final int b, final int c) {
            String string;
            if (n != Integer.MIN_VALUE) {
                final StringBuilder sb = new StringBuilder(12);
                sb.append(n);
                sb.append("/");
                string = sb.toString();
            }
            else {
                string = "";
            }
            this.a = string;
            this.b = b;
            this.c = c;
            this.d = Integer.MIN_VALUE;
            this.e = "";
        }
        
        public final void a() {
            final int d = this.d;
            int b;
            if (d == Integer.MIN_VALUE) {
                b = this.b;
            }
            else {
                b = d + this.c;
            }
            this.d = b;
            final String a = this.a;
            this.e = m5.a.c(o.e(a, 11), a, b);
        }
        
        public final void b() {
            if (this.d != Integer.MIN_VALUE) {
                return;
            }
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }
}
