// 
// Decompiled by Procyon v0.6.0
// 

package nb1;

import cg2.j;
import com.bluelinelabs.conductor.b;
import com.bluelinelabs.conductor.c;
import com.bluelinelabs.conductor.c$c;
import android.view.View;
import android.view.ViewGroup;
import android.view.View$OnAttachStateChangeListener;

public class f extends e implements View$OnAttachStateChangeListener
{
    public ViewGroup i;
    public View j;
    public c$c k;
    public boolean l;
    
    public final void b() {
        this.n();
    }
    
    public c c() {
        return (c)new f();
    }
    
    public final void g(final c c) {
        this.l = true;
        this.n();
    }
    
    public final void h(final ViewGroup i, final View j, final View view, final boolean b, final b k) {
        if (!this.l) {
            if (view != null && view.getParent() == null) {
                i.addView(view);
            }
            if (j != null && !b) {
                i.removeView(j);
            }
            else {
                this.j = j;
            }
            this.k = (c$c)k;
            this.i = i;
        }
    }
    
    public final boolean i() {
        return true;
    }
    
    public final void l() {
    }
    
    public final void n() {
        final View j = this.j;
        if (j != null) {
            final ViewGroup i = this.i;
            if (i != null) {
                i.removeView(j);
            }
        }
        this.j = null;
        final ViewGroup k = this.i;
        if (k != null && ((View)k).getWindowToken() != null) {
            final c$c l = this.k;
            if (l != null) {
                ((b)l).a();
            }
            this.k = null;
            this.i = null;
        }
        final ViewGroup m = this.i;
        if (m != null) {
            ((View)m).addOnAttachStateChangeListener((View$OnAttachStateChangeListener)this);
            final j a = cg2.j.a;
        }
    }
    
    public final void onViewAttachedToWindow(final View view) {
        ng2.e.f((Object)view, "v");
        this.n();
    }
    
    public final void onViewDetachedFromWindow(final View view) {
        ng2.e.f((Object)view, "v");
    }
}
