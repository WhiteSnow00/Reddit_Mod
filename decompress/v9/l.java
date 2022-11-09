// 
// Decompiled by Procyon v0.6.0
// 

package v9;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import au2.c;
import au2.b;

public final class l
{
    public static final b a;
    
    static {
        a = c.b("ProxyCacheUtils");
    }
    
    public static String a(String decode) {
        try {
            decode = URLDecoder.decode(decode, "utf-8");
            return decode;
        }
        catch (final UnsupportedEncodingException ex) {
            throw new RuntimeException("Error decoding url", ex);
        }
    }
}
