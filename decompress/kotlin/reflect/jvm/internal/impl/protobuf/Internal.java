// 
// Decompiled by Procyon v0.6.0
// 

package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.UnsupportedEncodingException;
import lw0.b;
import java.nio.ByteBuffer;

public class Internal
{
    public static final byte[] EMPTY_BYTE_ARRAY;
    public static final ByteBuffer EMPTY_BYTE_BUFFER;
    
    static {
        EMPTY_BYTE_BUFFER = ByteBuffer.wrap(EMPTY_BYTE_ARRAY = new byte[0]);
    }
    
    public static boolean isValidUtf8(final byte[] array) {
        final int length = array.length;
        boolean b = false;
        if (lw0.b.O1(0, length, array) == 0) {
            b = true;
        }
        return b;
    }
    
    public static String toStringUtf8(final byte[] array) {
        try {
            return new String(array, "UTF-8");
        }
        catch (final UnsupportedEncodingException ex) {
            throw new RuntimeException("UTF-8 not supported?", ex);
        }
    }
    
    public interface a
    {
        int getNumber();
    }
    
    public interface b<T extends a>
    {
        T a(final int p0);
    }
}
