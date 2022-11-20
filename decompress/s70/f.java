// 
// Decompiled by Procyon v0.6.0
// 

package s70;

import ng2.e;
import com.reddit.debug.config.AppConfigDebugScreen;

public final class f
{
    public final b a;
    
    public f(final AppConfigDebugScreen a) {
        e.f((Object)a, "view");
        this.a = (b)a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof f && e.a((Object)this.a, (Object)((f)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("AppConfigDebugScreenDependencies(view=");
        t.append(this.a);
        t.append(')');
        return t.toString();
    }
}
