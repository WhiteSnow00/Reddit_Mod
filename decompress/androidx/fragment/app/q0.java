// 
// Decompiled by Procyon v0.6.0
// 

package androidx.fragment.app;

import java.util.Collection;
import java.util.List;
import v3.d;
import android.transition.Transition$EpicenterCallback;
import android.graphics.Rect;
import android.transition.Transition$TransitionListener;
import android.transition.TransitionManager;
import android.view.ViewGroup;
import android.transition.TransitionSet;
import java.util.ArrayList;
import android.view.View;
import android.transition.Transition;

public final class q0 extends u0
{
    public static boolean s(final Transition transition) {
        return !u0.h(transition.getTargetIds()) || !u0.h(transition.getTargetNames()) || !u0.h(transition.getTargetTypes());
    }
    
    @Override
    public final void a(final View view, final Object o) {
        ((Transition)o).addTarget(view);
    }
    
    @Override
    public final void b(final ArrayList list, final Object o) {
        final Transition transition = (Transition)o;
        if (transition == null) {
            return;
        }
        final boolean b = transition instanceof TransitionSet;
        final int n = 0;
        int i = 0;
        if (b) {
            for (TransitionSet set = (TransitionSet)transition; i < set.getTransitionCount(); ++i) {
                this.b(list, set.getTransitionAt(i));
            }
        }
        else if (!s(transition) && u0.h(transition.getTargets())) {
            for (int size = list.size(), j = n; j < size; ++j) {
                transition.addTarget((View)list.get(j));
            }
        }
    }
    
    @Override
    public final void c(final ViewGroup viewGroup, final Object o) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition)o);
    }
    
    @Override
    public final boolean e(final Object o) {
        return o instanceof Transition;
    }
    
    @Override
    public final Object f(final Object o) {
        Transition clone;
        if (o != null) {
            clone = ((Transition)o).clone();
        }
        else {
            clone = null;
        }
        return clone;
    }
    
    @Override
    public final Object i(final Object o, Object o2, final Object o3) {
        Object setOrdering = o;
        final Transition transition = (Transition)o2;
        final Transition transition2 = (Transition)o3;
        if (setOrdering != null && transition != null) {
            setOrdering = new TransitionSet().addTransition((Transition)setOrdering).addTransition(transition).setOrdering(1);
        }
        else if (setOrdering == null) {
            if (transition != null) {
                setOrdering = transition;
            }
            else {
                setOrdering = null;
            }
        }
        if (transition2 != null) {
            o2 = new TransitionSet();
            if (setOrdering != null) {
                ((TransitionSet)o2).addTransition((Transition)setOrdering);
            }
            ((TransitionSet)o2).addTransition(transition2);
            return o2;
        }
        return setOrdering;
    }
    
    @Override
    public final Object j(final Object o, final Object o2) {
        final TransitionSet set = new TransitionSet();
        if (o != null) {
            set.addTransition((Transition)o);
        }
        set.addTransition((Transition)o2);
        return set;
    }
    
    @Override
    public final void k(final Object o, final View view, final ArrayList<View> list) {
        ((Transition)o).addListener((Transition$TransitionListener)new Transition$TransitionListener() {
            public final void onTransitionCancel(final Transition transition) {
            }
            
            public final void onTransitionEnd(final Transition transition) {
                transition.removeListener((Transition$TransitionListener)this);
                view.setVisibility(8);
                for (int size = list.size(), i = 0; i < size; ++i) {
                    ((View)list.get(i)).setVisibility(0);
                }
            }
            
            public final void onTransitionPause(final Transition transition) {
            }
            
            public final void onTransitionResume(final Transition transition) {
            }
            
            public final void onTransitionStart(final Transition transition) {
                transition.removeListener((Transition$TransitionListener)this);
                transition.addListener((Transition$TransitionListener)this);
            }
        });
    }
    
    @Override
    public final void l(final Object o, final Object o2, final ArrayList list, final Object o3, final ArrayList list2) {
        ((Transition)o).addListener((Transition$TransitionListener)new r0(this, o2, list, o3, list2));
    }
    
    @Override
    public final void m(final View view, final Object o) {
        if (view != null) {
            final Transition transition = (Transition)o;
            final Rect rect = new Rect();
            u0.g(rect, view);
            transition.setEpicenterCallback((Transition$EpicenterCallback)new p0(rect));
        }
    }
    
    @Override
    public final void n(final Object o, final Rect rect) {
        ((Transition)o).setEpicenterCallback((Transition$EpicenterCallback)new Transition$EpicenterCallback() {
            public final Rect onGetEpicenter(final Transition transition) {
                final Rect a = rect;
                if (a != null && !a.isEmpty()) {
                    return rect;
                }
                return null;
            }
        });
    }
    
    @Override
    public final void o(final Object o, final d d, final m m) {
        ((Transition)o).addListener((Transition$TransitionListener)new s0(m));
    }
    
    @Override
    public final void p(final Object o, final View view, final ArrayList<View> list) {
        final TransitionSet set = (TransitionSet)o;
        final List targets = ((Transition)set).getTargets();
        targets.clear();
        for (int size = list.size(), i = 0; i < size; ++i) {
            u0.d((View)list.get(i), targets);
        }
        targets.add(view);
        list.add(view);
        this.b(list, set);
    }
    
    @Override
    public final void q(final Object o, final ArrayList<View> list, final ArrayList<View> list2) {
        final TransitionSet set = (TransitionSet)o;
        if (set != null) {
            ((Transition)set).getTargets().clear();
            ((Transition)set).getTargets().addAll(list2);
            this.t(set, list, list2);
        }
    }
    
    @Override
    public final Object r(final Object o) {
        if (o == null) {
            return null;
        }
        final TransitionSet set = new TransitionSet();
        set.addTransition((Transition)o);
        return set;
    }
    
    public final void t(final Object o, final ArrayList<View> list, final ArrayList<View> list2) {
        final Transition transition = (Transition)o;
        final boolean b = transition instanceof TransitionSet;
        int i = 0;
        int j = 0;
        if (b) {
            for (TransitionSet set = (TransitionSet)transition; j < set.getTransitionCount(); ++j) {
                this.t(set.getTransitionAt(j), list, list2);
            }
        }
        else if (!s(transition)) {
            final List targets = transition.getTargets();
            if (targets != null && targets.size() == list.size() && targets.containsAll(list)) {
                int size;
                if (list2 == null) {
                    size = 0;
                }
                else {
                    size = list2.size();
                }
                while (i < size) {
                    transition.addTarget((View)list2.get(i));
                    ++i;
                }
                int size2 = list.size();
                while (--size2 >= 0) {
                    transition.removeTarget((View)list.get(size2));
                }
            }
        }
    }
}
