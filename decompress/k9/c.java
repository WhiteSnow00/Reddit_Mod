// 
// Decompiled by Procyon v0.6.0
// 

package k9;

import java.security.MessageDigest;
import p8.d;

public final class c implements d
{
    public static final c a;
    
    static {
        a = new c();
    }
    
    @Override
    public final String toString() {
        return "EmptySignature";
    }
    
    @Override
    public final void updateDiskCacheKey(final MessageDigest messageDigest) {
    }
}
