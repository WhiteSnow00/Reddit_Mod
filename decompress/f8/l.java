// 
// Decompiled by Procyon v0.6.0
// 

package f8;

import android.view.View;
import com.bluelinelabs.conductor.b;
import android.view.ViewGroup;
import u5.m;

public final class l implements d
{
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ Runnable b;
    public final /* synthetic */ n c;
    
    public l(final n c, final ViewGroup a, final k b) {
        this.c = c;
        this.a = a;
        this.b = (Runnable)b;
    }
    
    @Override
    public final void a(final m m) {
        ((com.bluelinelabs.conductor.b)this.c.k).a();
        this.c.k = null;
    }
    
    @Override
    public final void b(final m m) {
        ((com.bluelinelabs.conductor.b)this.c.k).a();
        this.c.k = null;
    }
    
    @Override
    public final void c(final m m) {
    }
    
    @Override
    public final void d(final m m) {
        ((View)this.a).removeCallbacks(this.b);
    }
    
    @Override
    public final void e(final m m) {
    }
}
