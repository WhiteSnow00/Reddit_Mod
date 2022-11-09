// 
// Decompiled by Procyon v0.6.0
// 

package androidx.fragment.app;

import android.transition.Transition;
import android.transition.Transition$TransitionListener;

public final class s0 implements Transition$TransitionListener
{
    public final /* synthetic */ Runnable a;
    
    public s0(final m a) {
        this.a = a;
    }
    
    public final void onTransitionCancel(final Transition transition) {
    }
    
    public final void onTransitionEnd(final Transition transition) {
        this.a.run();
    }
    
    public final void onTransitionPause(final Transition transition) {
    }
    
    public final void onTransitionResume(final Transition transition) {
    }
    
    public final void onTransitionStart(final Transition transition) {
    }
}
