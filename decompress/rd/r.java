// 
// Decompiled by Procyon v0.6.0
// 

package rd;

import java.util.Arrays;
import com.google.android.gms.common.api.a$c;

public final class r implements a$c
{
    public static final r g;
    public final String f = null;
    
    static {
        g = new r();
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o == this || (o instanceof r && m.a(this.f, ((r)o).f));
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.f });
    }
}
