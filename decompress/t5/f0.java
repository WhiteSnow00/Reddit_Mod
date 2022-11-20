// 
// Decompiled by Procyon v0.6.0
// 

package t5;

import android.view.ViewGroupOverlay;
import android.view.View;
import android.view.ViewGroup;

public final class f0 extends p
{
    public final ViewGroup a;
    public final View b;
    public final View c;
    public final g0 d;
    
    public f0(final g0 d, final ViewGroup a, final View b, final View c) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void a(final m m) {
        this.c.setTag(2131431074, (Object)null);
        ((ViewGroupOverlay)new x(this.a).f).remove(this.b);
        m.x((m.d)this);
    }
    
    public final void b(final m m) {
        ((ViewGroupOverlay)new x(this.a).f).remove(this.b);
    }
    
    public final void e(final m m) {
        if (this.b.getParent() == null) {
            ((ViewGroupOverlay)new x(this.a).f).add(this.b);
        }
        else {
            ((m)this.d).cancel();
        }
    }
}
