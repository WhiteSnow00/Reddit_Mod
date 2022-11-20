// 
// Decompiled by Procyon v0.6.0
// 

package p6;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;

public final class n implements Callable
{
    public final WeakReference f;
    public final Context g;
    public final int h;
    public final String i;
    
    public n(final WeakReference f, final Context g, final int h, final String i) {
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    @Override
    public final Object call() {
        final WeakReference f = this.f;
        Context g = this.g;
        final int h = this.h;
        final String i = this.i;
        final Context context = (Context)f.get();
        if (context != null) {
            g = context;
        }
        return r.g(g, h, i);
    }
}
