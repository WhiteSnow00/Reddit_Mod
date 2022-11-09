// 
// Decompiled by Procyon v0.6.0
// 

package p8;

import java.security.MessageDigest;
import java.nio.charset.Charset;

public interface d
{
    public static final Charset c = Charset.forName("UTF-8");
    
    boolean equals(final Object p0);
    
    int hashCode();
    
    void updateDiskCacheKey(final MessageDigest p0);
}
