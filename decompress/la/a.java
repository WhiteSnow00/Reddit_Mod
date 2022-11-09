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
    
    @Override
    public final Iterable<EventInternal> a() {
        return this.a;
    }
    
    @Override
    public final byte[] b() {
        return this.b;
    }
    
    @Override
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
    
    @Override
    public final int hashCode() {
        return (this.a.hashCode() ^ 0xF4243) * 1000003 ^ Arrays.hashCode(this.b);
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("BackendRequest{events=");
        k.append(this.a);
        k.append(", extras=");
        k.append(Arrays.toString(this.b));
        k.append("}");
        return k.toString();
    }
    
    public static final class a extends e.a
    {
        public Iterable<EventInternal> a;
        public byte[] b;
    }
}
