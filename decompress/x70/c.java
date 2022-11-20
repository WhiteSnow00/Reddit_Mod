// 
// Decompiled by Procyon v0.6.0
// 

package x70;

import ng2.e;
import android.app.Activity;
import mg2.a;

public final class c
{
    public final a<Activity> a;
    
    public c(final a<? extends Activity> a) {
        this.a = (a<Activity>)a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof c && e.a((Object)this.a, (Object)((c)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        return m5.a.j(a.t("DeeplinkFallbackActivityDependencies(getActivity="), (a)this.a, ')');
    }
}
