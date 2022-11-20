// 
// Decompiled by Procyon v0.6.0
// 

package r5;

import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.ByteBuffer;

public class c
{
    public int a;
    public ByteBuffer b;
    
    static {
        new ThreadLocal<CharsetDecoder>() {
            public final Object initialValue() {
                return Charset.forName("UTF-8").newDecoder();
            }
        };
        new ThreadLocal<Charset>() {
            public final Object initialValue() {
                return Charset.forName("UTF-8");
            }
        };
        new ThreadLocal();
    }
    
    public final int a(int short1) {
        final int a = this.a;
        final int n = a - this.b.getInt(a);
        if (short1 < this.b.getShort(n)) {
            short1 = this.b.getShort(n + short1);
        }
        else {
            short1 = 0;
        }
        return short1;
    }
}
