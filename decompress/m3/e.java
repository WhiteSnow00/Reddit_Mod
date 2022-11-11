// 
// Decompiled by Procyon v0.6.0
// 

package m3;

import java.lang.reflect.Method;
import android.util.Log;

public final class e implements Runnable
{
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    
    public e(final Object f, final Object g) {
        this.f = f;
        this.g = g;
    }
    
    @Override
    public final void run() {
        try {
            final Method d = m3.f.d;
            if (d != null) {
                d.invoke(this.f, this.g, Boolean.FALSE, "AppCompat recreation");
            }
            else {
                m3.f.e.invoke(this.f, this.g, Boolean.FALSE);
            }
        }
        catch (final RuntimeException ex) {
            if (ex.getClass() == RuntimeException.class && ex.getMessage() != null) {
                if (ex.getMessage().startsWith("Unable to stop")) {
                    throw ex;
                }
            }
        }
        finally {
            final Throwable t;
            Log.e("ActivityRecreator", "Exception while invoking performStopActivity", t);
        }
    }
}
