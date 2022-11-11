// 
// Decompiled by Procyon v0.6.0
// 

package com.evernote.android.state;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.d0;
import androidx.fragment.app.z;
import androidx.fragment.app.r;
import android.os.Bundle;
import android.app.Activity;
import android.app.Application$ActivityLifecycleCallbacks;
import androidx.fragment.app.d0$k;

final class AndroidLifecycleCallbacks extends d0$k implements Application$ActivityLifecycleCallbacks
{
    public static final AndroidLifecycleCallbacks INSTANCE;
    public boolean mEnabled;
    
    static {
        INSTANCE = new AndroidLifecycleCallbacks();
    }
    
    private AndroidLifecycleCallbacks() {
    }
    
    public void onActivityCreated(final Activity activity, final Bundle bundle) {
        if (this.mEnabled) {
            StateSaver.restoreInstanceState((Object)activity, bundle);
        }
        if (activity instanceof r) {
            ((r)activity).getSupportFragmentManager().n.a.add(new z.a(this));
        }
    }
    
    public void onActivityDestroyed(final Activity activity) {
    }
    
    public void onActivityPaused(final Activity activity) {
    }
    
    public void onActivityResumed(final Activity activity) {
    }
    
    public void onActivitySaveInstanceState(final Activity activity, final Bundle bundle) {
        if (this.mEnabled) {
            StateSaver.saveInstanceState((Object)activity, bundle);
        }
    }
    
    public void onActivityStarted(final Activity activity) {
    }
    
    public void onActivityStopped(final Activity activity) {
    }
    
    public void onFragmentPreCreated(final d0 d0, final Fragment fragment, final Bundle bundle) {
        if (this.mEnabled) {
            StateSaver.restoreInstanceState((Object)fragment, bundle);
        }
    }
    
    public void onFragmentSaveInstanceState(final d0 d0, final Fragment fragment, final Bundle bundle) {
        if (this.mEnabled) {
            StateSaver.saveInstanceState((Object)fragment, bundle);
        }
    }
}
