// 
// Decompiled by Procyon v0.6.0
// 

package rd;

import java.util.Arrays;
import yd.a;
import android.net.Uri$Builder;
import android.net.Uri;

public final class e1
{
    public static final Uri e;
    public final String a;
    public final String b;
    public final int c;
    public final boolean d;
    
    static {
        e = new Uri$Builder().scheme("content").authority("com.google.android.gms.chimera").build();
    }
    
    public e1(final int c, final String a, final String b, final boolean d) {
        yd.a.P0(a);
        this.a = a;
        yd.a.P0(b);
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof e1)) {
            return false;
        }
        final e1 e1 = (e1)o;
        return m.a(this.a, e1.a) && m.a(this.b, e1.b) && m.a(null, null) && this.c == e1.c && this.d == e1.d;
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.a, this.b, null, this.c, this.d });
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        if (a != null) {
            return a;
        }
        yd.a.S0((Object)null);
        throw null;
    }
}
