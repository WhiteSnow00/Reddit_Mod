// 
// Decompiled by Procyon v0.6.0
// 

package ae2;

import java.nio.charset.Charset;

public final class g extends e<String, String>
{
    public g(final int n) {
        super(n);
    }
    
    public final int c(final Object o, final Object o2) {
        final String s = (String)o;
        return ((String)o2).getBytes(Charset.defaultCharset()).length;
    }
}
