// 
// Decompiled by Procyon v0.6.0
// 

package zc;

import java.nio.ByteBuffer;

public interface h
{
    default long a(final h h) {
        final byte[] array = ((j)h).b.get("exo_len");
        long long1;
        if (array != null) {
            long1 = ByteBuffer.wrap(array).getLong();
        }
        else {
            long1 = -1L;
        }
        return long1;
    }
}
