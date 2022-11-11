// 
// Decompiled by Procyon v0.6.0
// 

package androidx.fragment.app;

import android.view.View;
import android.transition.Transition;
import java.util.ArrayList;
import android.transition.Transition$TransitionListener;

public final class r0 implements Transition$TransitionListener
{
    public final /* synthetic */ Object a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ ArrayList f;
    public final /* synthetic */ q0 g;
    
    public r0(final q0 g, final Object a, final ArrayList b, final Object e, final ArrayList f) {
        this.g = g;
        this.a = a;
        this.b = b;
        this.c = null;
        this.d = null;
        this.e = e;
        this.f = f;
    }
    
    public final void onTransitionCancel(final Transition transition) {
    }
    
    public final void onTransitionEnd(final Transition transition) {
        transition.removeListener((Transition$TransitionListener)this);
    }
    
    public final void onTransitionPause(final Transition transition) {
    }
    
    public final void onTransitionResume(final Transition transition) {
    }
    
    public final void onTransitionStart(final Transition transition) {
        final Object a = this.a;
        if (a != null) {
            this.g.t(a, this.b, null);
        }
        final Object c = this.c;
        if (c != null) {
            this.g.t(c, this.d, null);
        }
        final Object e = this.e;
        if (e != null) {
            this.g.t(e, this.f, null);
        }
    }
}
