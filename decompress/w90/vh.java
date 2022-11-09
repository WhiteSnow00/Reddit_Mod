// 
// Decompiled by Procyon v0.6.0
// 

package w90;

import java.util.Map;
import android.app.Activity;
import zg2.a;

public final class vh implements du
{
    public final a<? extends Activity> a;
    public final kl b;
    
    public vh(final kl b, final a a) {
        this.b = b;
        this.a = (a<? extends Activity>)a;
    }
    
    public final Map<Class<?>, yt<?, ?>> getSubFeatureInjectors() {
        return this.b.k();
    }
}
