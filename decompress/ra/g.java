// 
// Decompiled by Procyon v0.6.0
// 

package ra;

import android.content.Context;
import javax.inject.Provider;
import ma.b;

public final class g implements b<String>
{
    public final Provider<Context> a;
    
    public g(final Provider<Context> a) {
        this.a = a;
    }
    
    public final Object get() {
        final String packageName = ((Context)this.a.get()).getPackageName();
        if (packageName != null) {
            return packageName;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
