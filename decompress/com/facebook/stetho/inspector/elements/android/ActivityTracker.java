// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho.inspector.elements.android;

import android.os.Bundle;
import android.app.Application$ActivityLifecycleCallbacks;
import android.app.Application;
import java.util.Iterator;
import android.os.Looper;
import com.facebook.stetho.common.Util;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.Collections;
import java.util.List;
import android.app.Activity;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public final class ActivityTracker
{
    private static final ActivityTracker sInstance;
    private final ArrayList<WeakReference<Activity>> mActivities;
    private final List<WeakReference<Activity>> mActivitiesUnmodifiable;
    private AutomaticTracker mAutomaticTracker;
    private final List<Listener> mListeners;
    
    static {
        sInstance = new ActivityTracker();
    }
    
    public ActivityTracker() {
        final ArrayList mActivities = new ArrayList();
        this.mActivities = mActivities;
        this.mActivitiesUnmodifiable = (List<WeakReference<Activity>>)Collections.unmodifiableList((List<?>)mActivities);
        this.mListeners = new CopyOnWriteArrayList<Listener>();
    }
    
    public static ActivityTracker get() {
        return ActivityTracker.sInstance;
    }
    
    private static <T> boolean removeFromWeakList(final ArrayList<WeakReference<T>> list, final T t) {
        for (int size = list.size(), i = 0; i < size; ++i) {
            if (((WeakReference)list.get(i)).get() == t) {
                list.remove(i);
                return true;
            }
        }
        return false;
    }
    
    public void add(final Activity activity) {
        Util.throwIfNull(activity);
        Util.throwIfNot(Looper.myLooper() == Looper.getMainLooper());
        this.mActivities.add(new WeakReference<Activity>(activity));
        final Iterator<Listener> iterator = this.mListeners.iterator();
        while (iterator.hasNext()) {
            iterator.next().onActivityAdded(activity);
        }
    }
    
    public boolean beginTrackingIfPossible(final Application application) {
        if (this.mAutomaticTracker == null) {
            final AutomaticTracker instance = AutomaticTracker.newInstance(application, this);
            instance.register();
            this.mAutomaticTracker = instance;
            return true;
        }
        return false;
    }
    
    public boolean endTracking() {
        final AutomaticTracker mAutomaticTracker = this.mAutomaticTracker;
        if (mAutomaticTracker != null) {
            mAutomaticTracker.unregister();
            this.mAutomaticTracker = null;
            return true;
        }
        return false;
    }
    
    public List<WeakReference<Activity>> getActivitiesView() {
        return this.mActivitiesUnmodifiable;
    }
    
    public void registerListener(final Listener listener) {
        this.mListeners.add(listener);
    }
    
    public void remove(final Activity activity) {
        Util.throwIfNull(activity);
        Util.throwIfNot(Looper.myLooper() == Looper.getMainLooper());
        if (removeFromWeakList(this.mActivities, activity)) {
            final Iterator<Listener> iterator = this.mListeners.iterator();
            while (iterator.hasNext()) {
                iterator.next().onActivityRemoved(activity);
            }
        }
    }
    
    public Activity tryGetTopActivity() {
        if (this.mActivitiesUnmodifiable.isEmpty()) {
            return null;
        }
        for (int i = this.mActivitiesUnmodifiable.size() - 1; i >= 0; --i) {
            final Activity activity = this.mActivitiesUnmodifiable.get(i).get();
            if (activity != null) {
                return activity;
            }
        }
        return null;
    }
    
    public void unregisterListener(final Listener listener) {
        this.mListeners.remove(listener);
    }
    
    public abstract static class AutomaticTracker
    {
        private AutomaticTracker() {
        }
        
        public static AutomaticTracker newInstance(final Application application, final ActivityTracker activityTracker) {
            return new AutomaticTrackerICSAndBeyond(application, activityTracker);
        }
        
        public abstract void register();
        
        public abstract void unregister();
        
        public static class AutomaticTrackerICSAndBeyond extends AutomaticTracker
        {
            private final Application mApplication;
            private final Application$ActivityLifecycleCallbacks mLifecycleCallbacks;
            private final ActivityTracker mTracker;
            
            public AutomaticTrackerICSAndBeyond(final Application mApplication, final ActivityTracker mTracker) {
                super(null);
                this.mLifecycleCallbacks = (Application$ActivityLifecycleCallbacks)new Application$ActivityLifecycleCallbacks() {
                    public void onActivityCreated(final Activity activity, final Bundle bundle) {
                        AutomaticTrackerICSAndBeyond.access$100(AutomaticTrackerICSAndBeyond.this).add(activity);
                    }
                    
                    public void onActivityDestroyed(final Activity activity) {
                        AutomaticTrackerICSAndBeyond.access$100(AutomaticTrackerICSAndBeyond.this).remove(activity);
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
                };
                this.mApplication = mApplication;
                this.mTracker = mTracker;
            }
            
            public static /* synthetic */ ActivityTracker access$100(final AutomaticTrackerICSAndBeyond automaticTrackerICSAndBeyond) {
                return automaticTrackerICSAndBeyond.mTracker;
            }
            
            @Override
            public void register() {
                this.mApplication.registerActivityLifecycleCallbacks(this.mLifecycleCallbacks);
            }
            
            @Override
            public void unregister() {
                this.mApplication.unregisterActivityLifecycleCallbacks(this.mLifecycleCallbacks);
            }
        }
    }
    
    public interface Listener
    {
        void onActivityAdded(final Activity p0);
        
        void onActivityRemoved(final Activity p0);
    }
}
