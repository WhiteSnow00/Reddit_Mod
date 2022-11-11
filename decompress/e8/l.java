// 
// Decompiled by Procyon v0.6.0
// 

package e8;

import android.view.View;
import com.bluelinelabs.conductor.b;
import u5.m;
import android.view.ViewGroup;
import u5.m$d;

public final class l implements m$d
{
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ Runnable b;
    public final /* synthetic */ n c;
    
    public l(final n c, final ViewGroup a, final k b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public final void a(final m m) {
        ((b)this.c.k).a();
        this.c.k = null;
    }
    
    public final void b(final m m) {
        ((b)this.c.k).a();
        this.c.k = null;
    }
    
    public final void c(final m m) {
    }
    
    public final void d(final m m) {
        ((View)this.a).removeCallbacks(this.b);
    }
    
    public final void e(final m m) {
    }
}
