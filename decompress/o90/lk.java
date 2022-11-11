// 
// Decompiled by Procyon v0.6.0
// 

package o90;

import java.util.Map;
import android.app.Activity;
import rg2.a;

public final class lk implements yt
{
    public final a<? extends Activity> a;
    public final dl b;
    
    public lk(final dl b, final a a) {
        this.b = b;
        this.a = a;
    }
    
    public final Map<Class<?>, tt<?, ?>> getSubFeatureInjectors() {
        return this.b.k();
    }
}
