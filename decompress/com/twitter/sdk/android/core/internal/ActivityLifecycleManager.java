// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.core.internal;

import android.os.Bundle;
import android.app.Activity;
import java.util.Iterator;
import java.util.HashSet;
import android.app.Application$ActivityLifecycleCallbacks;
import java.util.Set;
import android.app.Application;
import android.content.Context;

public class ActivityLifecycleManager
{
    private final ActivityLifecycleCallbacksWrapper callbacksWrapper;
    
    public ActivityLifecycleManager(final Context context) {
        this.callbacksWrapper = new ActivityLifecycleCallbacksWrapper((Application)context.getApplicationContext());
    }
    
    public boolean registerCallbacks(final Callbacks callbacks) {
        final ActivityLifecycleCallbacksWrapper callbacksWrapper = this.callbacksWrapper;
        return callbacksWrapper != null && callbacksWrapper.registerLifecycleCallbacks(callbacks);
    }
    
    public void resetCallbacks() {
        final ActivityLifecycleCallbacksWrapper callbacksWrapper = this.callbacksWrapper;
        if (callbacksWrapper != null) {
            callbacksWrapper.clearCallbacks();
        }
    }
    
    public static class ActivityLifecycleCallbacksWrapper
    {
        private final Application application;
        private final Set<Application$ActivityLifecycleCallbacks> registeredCallbacks;
        
        public ActivityLifecycleCallbacksWrapper(final Application application) {
            this.registeredCallbacks = new HashSet<Application$ActivityLifecycleCallbacks>();
            this.application = application;
        }
        
        private void clearCallbacks() {
            final Iterator<Application$ActivityLifecycleCallbacks> iterator = this.registeredCallbacks.iterator();
            while (iterator.hasNext()) {
                this.application.unregisterActivityLifecycleCallbacks((Application$ActivityLifecycleCallbacks)iterator.next());
            }
        }
        
        private boolean registerLifecycleCallbacks(final Callbacks callbacks) {
            if (this.application != null) {
                final Application$ActivityLifecycleCallbacks application$ActivityLifecycleCallbacks = (Application$ActivityLifecycleCallbacks)new Application$ActivityLifecycleCallbacks() {
                    public void onActivityCreated(final Activity activity, final Bundle bundle) {
                        callbacks.onActivityCreated(activity, bundle);
                    }
                    
                    public void onActivityDestroyed(final Activity activity) {
                        callbacks.onActivityDestroyed(activity);
                    }
                    
                    public void onActivityPaused(final Activity activity) {
                        callbacks.onActivityPaused(activity);
                    }
                    
                    public void onActivityResumed(final Activity activity) {
                        callbacks.onActivityResumed(activity);
                    }
                    
                    public void onActivitySaveInstanceState(final Activity activity, final Bundle bundle) {
                        callbacks.onActivitySaveInstanceState(activity, bundle);
                    }
                    
                    public void onActivityStarted(final Activity activity) {
                        callbacks.onActivityStarted(activity);
                    }
                    
                    public void onActivityStopped(final Activity activity) {
                        callbacks.onActivityStopped(activity);
                    }
                };
                this.application.registerActivityLifecycleCallbacks((Application$ActivityLifecycleCallbacks)application$ActivityLifecycleCallbacks);
                this.registeredCallbacks.add((Application$ActivityLifecycleCallbacks)application$ActivityLifecycleCallbacks);
                return true;
            }
            return false;
        }
    }
    
    public abstract static class Callbacks
    {
        public void onActivityCreated(final Activity activity, final Bundle bundle) {
        }
        
        public void onActivityDestroyed(final Activity activity) {
        }
        
        public void onActivityPaused(final Activity activity) {
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
