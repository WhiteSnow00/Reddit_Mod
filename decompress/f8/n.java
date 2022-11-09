// 
// Decompiled by Procyon v0.6.0
// 

package f8;

import u5.m;
import com.bluelinelabs.conductor.b;
import android.view.View;
import android.view.ViewGroup;
import com.bluelinelabs.conductor.c;

public abstract class n extends c
{
    public boolean i;
    public boolean j;
    public c k;
    
    @Override
    public final void b() {
        this.j = true;
    }
    
    @Override
    public void g(final c c) {
        this.i = true;
    }
    
    @Override
    public final void h(final ViewGroup viewGroup, final View view, final View view2, final boolean b, final com.bluelinelabs.conductor.b k) {
        this.k = (c)k;
        if (this.i) {
            k.a();
            return;
        }
        if (this.j) {
            this.n(viewGroup, view, view2, null, b);
            k.a();
            return;
        }
        final k i = new k(k);
        final m o = this.o(viewGroup, view, view2, b);
        o.a((m.d)new l(this, viewGroup, i));
        this.p(viewGroup, view, view2, o, b, new f8.m(this, viewGroup, o, view, view2, b, i));
    }
    
    @Override
    public final boolean i() {
        return true;
    }
    
    public void n(final ViewGroup viewGroup, final View view, final View view2, final m m, final boolean b) {
        if (view != null && view.getParent() == viewGroup) {
            viewGroup.removeView(view);
        }
        if (view2 != null && view2.getParent() == null) {
            viewGroup.addView(view2);
        }
    }
    
    public abstract m o(final ViewGroup p0, final View p1, final View p2, final boolean p3);
    
    public void p(final ViewGroup viewGroup, final View view, final View view2, final m m, final boolean b, final f8.m i) {
        i.onPrepared();
    }
}
