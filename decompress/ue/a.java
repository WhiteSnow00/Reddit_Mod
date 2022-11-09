// 
// Decompiled by Procyon v0.6.0
// 

package ue;

import java.util.Arrays;
import rd.m;
import com.google.android.gms.common.api.a$c;

public final class a implements a$c
{
    public static final a f;
    
    static {
        f = new a();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof a)) {
            return false;
        }
        o.getClass();
        return m.a(null, null) && m.a(null, null) && m.a(null, null) && m.a(null, null) && m.a(null, null);
    }
    
    @Override
    public final int hashCode() {
        final Boolean false = Boolean.FALSE;
        return Arrays.hashCode(new Object[] { false, false, null, false, false, null, null, null, null });
    }
}
