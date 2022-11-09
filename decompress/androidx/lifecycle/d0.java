// 
// Decompiled by Procyon v0.6.0
// 

package androidx.lifecycle;

import a4.f2;
import android.app.Application$ActivityLifecycleCallbacks;
import android.os.Bundle;
import android.app.FragmentManager;
import android.os.Build$VERSION;
import android.app.Activity;
import android.app.Fragment;

public final class d0 extends Fragment
{
    public a f;
    
    public static void a(final Activity activity, final Lifecycle.Event event) {
        if (activity instanceof s) {
            ((s)activity).getLifecycle().f(event);
            return;
        }
        if (activity instanceof q) {
            final Lifecycle lifecycle = ((q)activity).getLifecycle();
            if (lifecycle instanceof r) {
                ((r)lifecycle).f(event);
            }
        }
    }
    
    public static void c(final Activity activity) {
        if (Build$VERSION.SDK_INT >= 29) {
            b.registerIn(activity);
        }
        final FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add((Fragment)new d0(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
    
    public final void b(final Lifecycle.Event event) {
        if (Build$VERSION.SDK_INT < 29) {
            a(this.getActivity(), event);
        }
    }
    
    public final void onActivityCreated(final Bundle bundle) {
        super.onActivityCreated(bundle);
        this.b(Lifecycle.Event.ON_CREATE);
    }
    
    public final void onDestroy() {
        super.onDestroy();
        this.b(Lifecycle.Event.ON_DESTROY);
        this.f = null;
    }
    
    public final void onPause() {
        super.onPause();
        this.b(Lifecycle.Event.ON_PAUSE);
    }
    
    public final void onResume() {
        super.onResume();
        final a f = this.f;
        if (f != null) {
            ((b0.b0$b)f).a.a();
        }
        this.b(Lifecycle.Event.ON_RESUME);
    }
    
    public final void onStart() {
        super.onStart();
        final a f = this.f;
        if (f != null) {
            final b0 a = ((b0.b0$b)f).a;
            if (++a.f == 1 && a.i) {
                a.k.f(Lifecycle.Event.ON_START);
                a.i = false;
            }
        }
        this.b(Lifecycle.Event.ON_START);
    }
    
    public final void onStop() {
        super.onStop();
        this.b(Lifecycle.Event.ON_STOP);
    }
    
    public interface a
    {
    }
    
    public static final class b implements Application$ActivityLifecycleCallbacks
    {
        public static void registerIn(final Activity activity) {
            f2.c(activity, new b());
        }
        
        public void onActivityCreated(final Activity activity, final Bundle bundle) {
        }
        
        public void onActivityDestroyed(final Activity activity) {
        }
        
        public void onActivityPaused(final Activity activity) {
        }
        
        public void onActivityPostCreated(final Activity activity, final Bundle bundle) {
            d0.a(activity, Lifecycle.Event.ON_CREATE);
        }
        
        public void onActivityPostResumed(final Activity activity) {
            d0.a(activity, Lifecycle.Event.ON_RESUME);
        }
        
        public void onActivityPostStarted(final Activity activity) {
            d0.a(activity, Lifecycle.Event.ON_START);
        }
        
        public void onActivityPreDestroyed(final Activity activity) {
            d0.a(activity, Lifecycle.Event.ON_DESTROY);
        }
        
        public void onActivityPrePaused(final Activity activity) {
            d0.a(activity, Lifecycle.Event.ON_PAUSE);
        }
        
        public void onActivityPreStopped(final Activity activity) {
            d0.a(activity, Lifecycle.Event.ON_STOP);
        }
        
        public void onActivityResumed(final Activity activity) {
        }
        
        public void onActivitySaveInstanceState(final Activity activity, final Bundle bundle) {
        }
        
        public void onActivityStarted(final Activity activity) {
        }
        
        public void onActivityStopped(final Activity activity) {
        }
    }
}
