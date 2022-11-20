// 
// Decompiled by Procyon v0.6.0
// 

package e2;

import ng2.e;
import androidx.compose.ui.platform.p0;
import j1.d;

public abstract class u<N extends d.c> extends p0 implements b
{
    public abstract N d();
    
    public abstract d.c e();
    
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (!(o instanceof u)) {
            return false;
        }
        e.f(o, "b");
        if (u.class != o.getClass()) {
            b = false;
        }
        if (!b) {
            return false;
        }
        final u u = (u)o;
        return e.a((Object)null, (Object)null);
    }
    
    public final int hashCode() {
        return 0;
    }
}
