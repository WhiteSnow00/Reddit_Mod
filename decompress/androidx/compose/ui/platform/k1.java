// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.platform;

import vl.a;

public interface k1
{
    long a();
    
    float b();
    
    long c();
    
    long d();
    
    default long e() {
        final float n = 48;
        return a.R(n, n);
    }
}
