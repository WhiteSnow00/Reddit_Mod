// 
// Decompiled by Procyon v0.6.0
// 

package androidx.lifecycle;

import android.app.Application$ActivityLifecycleCallbacks;
import android.os.Build$VERSION;
import android.os.Bundle;
import android.app.Activity;

public final class c0 extends f
{
    public final /* synthetic */ b0 this$0;
    
    public c0(final b0 this$0) {
        this.this$0 = this$0;
    }
    
    @Override
    public void onActivityCreated(final Activity activity, final Bundle bundle) {
        if (Build$VERSION.SDK_INT < 29) {
            final int g = d0.g;
            ((d0)activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag")).f = (d0.a)this.this$0.m;
        }
    }
    
    @Override
    public void onActivityPaused(final Activity activity) {
        final b0 this$0 = this.this$0;
        final int g = this$0.g - 1;
        this$0.g = g;
        if (g == 0) {
            this$0.j.postDelayed((Runnable)this$0.l, 700L);
        }
    }
    
    public void onActivityPreCreated(final Activity activity, final Bundle bundle) {
        b0.c.a(activity, (Application$ActivityLifecycleCallbacks)new f() {
            public void onActivityPostResumed(final Activity activity) {
                c0.this.this$0.a();
            }
            
            public void onActivityPostStarted(final Activity activity) {
                final b0 this$0 = c0.this.this$0;
                final int f = this$0.f + 1;
                this$0.f = f;
                if (f == 1 && this$0.i) {
                    this$0.k.f(Lifecycle.Event.ON_START);
                    this$0.i = false;
                }
            }
        });
    }
    
    @Override
    public void onActivityStopped(final Activity activity) {
        final b0 this$0 = this.this$0;
        final int f = this$0.f - 1;
        this$0.f = f;
        if (f == 0 && this$0.h) {
            this$0.k.f(Lifecycle.Event.ON_STOP);
            this$0.i = true;
        }
    }
}
