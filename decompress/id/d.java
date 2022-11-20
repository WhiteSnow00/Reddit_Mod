// 
// Decompiled by Procyon v0.6.0
// 

package id;

import java.util.Arrays;
import com.google.android.gms.common.api.a$c;

public final class d implements a$c
{
    public final String f;
    
    public d(final String f) {
        this.f = f;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof d;
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { d.class });
    }
}
