// 
// Decompiled by Procyon v0.6.0
// 

package la;

import java.util.Arrays;
import com.google.android.datatransport.runtime.EventInternal;

public final class a extends e
{
    public final Iterable<EventInternal> a;
    public final byte[] b;
    
    public a() {
        throw null;
    }
    
    public a(final Iterable a, final byte[] b) {
        this.a = a;
        this.b = b;
    }
    
    public final Iterable<EventInternal> a() {
        return this.a;
    }
    
    public final byte[] b() {
        return this.b;
    }
    
    public final boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof e) {
            final e e = (e)o;
            if (this.a.equals(e.a())) {
                final byte[] b2 = this.b;
                byte[] array;
                if (e instanceof a) {
                    array = ((a)e).b;
                }
                else {
                    array = e.b();
                }
                if (Arrays.equals(b2, array)) {
                    return b;
                }
            }
            b = false;
            return b;
        }
        return false;
    }
    
    public final int hashCode() {
        return (this.a.hashCode() ^ 0xF4243) * 1000003 ^ Arrays.hashCode(this.b);
    }
    
    public final String toString() {
        final StringBuilder t = a.t("BackendRequest{events=");
        t.append(this.a);
        t.append(", extras=");
        t.append(Arrays.toString(this.b));
        t.append("}");
        return t.toString();
    }
    
    public static final class a extends e$a
    {
        public Iterable<EventInternal> a;
        public byte[] b;
    }
}
