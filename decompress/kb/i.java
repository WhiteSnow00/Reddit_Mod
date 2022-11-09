// 
// Decompiled by Procyon v0.6.0
// 

package kb;

import android.util.Log;
import ak0.m;
import ag0.a;
import bd.s;
import java.nio.ByteBuffer;
import java.util.UUID;

public final class i
{
    public static byte[] a(UUID uuid, final UUID[] array, final byte[] array2) {
        final int n = 0;
        int length;
        if (array2 != null) {
            length = array2.length;
        }
        else {
            length = 0;
        }
        int b;
        final int n2 = b = length + 32;
        if (array != null) {
            b = b.b(array.length, 16, 4, n2);
        }
        final ByteBuffer allocate = ByteBuffer.allocate(b);
        allocate.putInt(b);
        allocate.putInt(1886614376);
        int n3;
        if (array != null) {
            n3 = 16777216;
        }
        else {
            n3 = 0;
        }
        allocate.putInt(n3);
        allocate.putLong(uuid.getMostSignificantBits());
        allocate.putLong(uuid.getLeastSignificantBits());
        if (array != null) {
            allocate.putInt(array.length);
            for (int length2 = array.length, i = n; i < length2; ++i) {
                uuid = array[i];
                allocate.putLong(uuid.getMostSignificantBits());
                allocate.putLong(uuid.getLeastSignificantBits());
            }
        }
        if (array2 != null && array2.length != 0) {
            allocate.putInt(array2.length);
            allocate.put(array2);
        }
        return allocate.array();
    }
    
    public static a b(final byte[] array) {
        final s s = new s(array);
        if (s.c < 32) {
            return null;
        }
        s.B(0);
        if (s.c() != s.c - s.b + 4) {
            return null;
        }
        if (s.c() != 1886614376) {
            return null;
        }
        final int n = s.c() >> 24 & 0xFF;
        if (n > 1) {
            ag0.a.u(37, "Unsupported pssh version: ", n, "PsshAtomUtil");
            return null;
        }
        final UUID uuid = new UUID(s.k(), s.k());
        if (n == 1) {
            s.C(s.u() * 16);
        }
        final int u = s.u();
        if (u != s.c - s.b) {
            return null;
        }
        final byte[] array2 = new byte[u];
        s.b(0, u, array2);
        return new a(uuid, n, array2);
    }
    
    public static byte[] c(final UUID uuid, final byte[] array) {
        final a b = b(array);
        if (b == null) {
            return null;
        }
        if (!uuid.equals(b.a)) {
            final String value = String.valueOf(uuid);
            final String value2 = String.valueOf(b.a);
            final StringBuilder q = m.q(value2.length() + (value.length() + 33), "UUID mismatch. Expected: ", value, ", got: ", value2);
            q.append(".");
            Log.w("PsshAtomUtil", q.toString());
            return null;
        }
        return b.c;
    }
    
    public static final class a
    {
        public final UUID a;
        public final int b;
        public final byte[] c;
        
        public a(final UUID a, final int b, final byte[] c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }
}
