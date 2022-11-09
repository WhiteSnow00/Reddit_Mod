// 
// Decompiled by Procyon v0.6.0
// 

package ie;

import java.io.UnsupportedEncodingException;

public final class a7
{
    public static final m6 a;
    public static final k6 b;
    public static final b6 c;
    public static final z5 d;
    
    static {
        try {
            final ia a2 = ia.a("type.googleapis.com/google.crypto.tink.AesCmacKey".getBytes("ASCII"));
            a = new m6();
            b = new k6(a2);
            c = new b6();
            d = new z5(a2);
        }
        catch (final UnsupportedEncodingException ex) {
            throw new IllegalArgumentException(ex);
        }
    }
}
