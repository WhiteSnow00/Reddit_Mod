// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.analytics.util;

import android.content.pm.ActivityInfo;
import java.lang.reflect.InvocationTargetException;
import X.0R7;
import android.app.Instrumentation$ActivityResult;
import android.os.IBinder;
import android.content.Context;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import X.0II;
import com.bytedance.covode.number.Covode;
import android.app.Instrumentation;

public class BTMInstrumentationProxy extends Instrumentation
{
    public final Instrumentation mBaseInstrumentation;
    
    static {
        Covode.recordClassIndex(4406);
    }
    
    public BTMInstrumentationProxy(final Instrumentation mBaseInstrumentation) {
        this.mBaseInstrumentation = mBaseInstrumentation;
    }
    
    public static void hook() {
        try {
            final Class<?> forName = Class.forName("android.app.ActivityThread");
            final Method declaredMethod = forName.getDeclaredMethod("currentActivityThread", (Class[])new Class[0]);
            declaredMethod.setAccessible(true);
            final Object invoke = declaredMethod.invoke(null, new Object[0]);
            final Field declaredField = forName.getDeclaredField("mInstrumentation");
            declaredField.setAccessible(true);
            declaredField.set(invoke, new BTMInstrumentationProxy((Instrumentation)declaredField.get(invoke)));
        }
        catch (final Exception ex) {
            0II.LIZ(ex);
        }
    }
    
    public void callActivityOnCreate(final Activity activity, final Bundle bundle) {
        final Instrumentation mBaseInstrumentation = this.mBaseInstrumentation;
        if (mBaseInstrumentation != null) {
            mBaseInstrumentation.callActivityOnCreate(activity, bundle);
            return;
        }
        super.callActivityOnCreate(activity, bundle);
    }
    
    public void callActivityOnDestroy(final Activity activity) {
        final Instrumentation mBaseInstrumentation = this.mBaseInstrumentation;
        if (mBaseInstrumentation != null) {
            mBaseInstrumentation.callActivityOnDestroy(activity);
            return;
        }
        super.callActivityOnDestroy(activity);
    }
    
    public void callActivityOnNewIntent(final Activity activity, final Intent intent) {
        final Instrumentation mBaseInstrumentation = this.mBaseInstrumentation;
        if (mBaseInstrumentation != null) {
            mBaseInstrumentation.callActivityOnNewIntent(activity, intent);
            return;
        }
        super.callActivityOnNewIntent(activity, intent);
    }
    
    public void callActivityOnPause(final Activity activity) {
        final Instrumentation mBaseInstrumentation = this.mBaseInstrumentation;
        if (mBaseInstrumentation != null) {
            mBaseInstrumentation.callActivityOnPause(activity);
            return;
        }
        super.callActivityOnPause(activity);
    }
    
    public void callActivityOnRestart(final Activity activity) {
        final Instrumentation mBaseInstrumentation = this.mBaseInstrumentation;
        if (mBaseInstrumentation != null) {
            mBaseInstrumentation.callActivityOnRestart(activity);
            return;
        }
        super.callActivityOnRestart(activity);
    }
    
    public void callActivityOnRestoreInstanceState(final Activity activity, final Bundle bundle) {
        final Instrumentation mBaseInstrumentation = this.mBaseInstrumentation;
        if (mBaseInstrumentation != null) {
            mBaseInstrumentation.callActivityOnRestoreInstanceState(activity, bundle);
            return;
        }
        super.callActivityOnRestoreInstanceState(activity, bundle);
    }
    
    public void callActivityOnResume(final Activity activity) {
        final Instrumentation mBaseInstrumentation = this.mBaseInstrumentation;
        if (mBaseInstrumentation != null) {
            mBaseInstrumentation.callActivityOnResume(activity);
            return;
        }
        super.callActivityOnResume(activity);
    }
    
    public void callActivityOnSaveInstanceState(final Activity activity, final Bundle bundle) {
        final Instrumentation mBaseInstrumentation = this.mBaseInstrumentation;
        if (mBaseInstrumentation != null) {
            mBaseInstrumentation.callActivityOnSaveInstanceState(activity, bundle);
            return;
        }
        super.callActivityOnSaveInstanceState(activity, bundle);
    }
    
    public void callActivityOnStart(final Activity activity) {
        final Instrumentation mBaseInstrumentation = this.mBaseInstrumentation;
        if (mBaseInstrumentation != null) {
            mBaseInstrumentation.callActivityOnStart(activity);
            return;
        }
        super.callActivityOnStart(activity);
    }
    
    public void callActivityOnStop(final Activity activity) {
        final Instrumentation mBaseInstrumentation = this.mBaseInstrumentation;
        if (mBaseInstrumentation != null) {
            mBaseInstrumentation.callActivityOnStop(activity);
            return;
        }
        super.callActivityOnStop(activity);
    }
    
    public void callActivityOnUserLeaving(final Activity activity) {
        final Instrumentation mBaseInstrumentation = this.mBaseInstrumentation;
        if (mBaseInstrumentation != null) {
            mBaseInstrumentation.callActivityOnUserLeaving(activity);
            return;
        }
        super.callActivityOnUserLeaving(activity);
    }
    
    public void callApplicationOnCreate(final Application application) {
        final Instrumentation mBaseInstrumentation = this.mBaseInstrumentation;
        if (mBaseInstrumentation != null) {
            mBaseInstrumentation.callApplicationOnCreate(application);
            return;
        }
        super.callApplicationOnCreate(application);
    }
    
    public Instrumentation$ActivityResult execStartActivity(final Context ex, final IBinder binder, final IBinder binder2, final Activity activity, final Intent intent, final int n, final Bundle bundle) {
        Label_0165: {
            Method declaredMethod;
            try {
                0R7.LIZ.LIZ((Context)ex, intent);
                declaredMethod = Instrumentation.class.getDeclaredMethod("execStartActivity", Context.class, IBinder.class, IBinder.class, Activity.class, Intent.class, Integer.TYPE, Bundle.class);
                declaredMethod.setAccessible(true);
                final Method method = declaredMethod;
                final BTMInstrumentationProxy btmInstrumentationProxy = this;
                final Instrumentation instrumentation = btmInstrumentationProxy.mBaseInstrumentation;
                final int n2 = 7;
                final Object[] array = new Object[n2];
                final int n3 = 0;
                final Exception ex2 = ex;
                array[n3] = ex2;
                final int n4 = 1;
                final IBinder binder3 = binder;
                array[n4] = binder3;
                final int n5 = 2;
                final IBinder binder4 = binder2;
                array[n5] = binder4;
                final int n6 = 3;
                final Activity activity2 = activity;
                array[n6] = activity2;
                final int n7 = 4;
                final Intent intent2 = intent;
                array[n7] = intent2;
                final int n8 = 5;
                final int n9 = n;
                final Integer n10 = n9;
                array[n8] = n10;
                final int n11 = 6;
                final Bundle bundle2 = bundle;
                array[n11] = bundle2;
                final Object o = method.invoke(instrumentation, array);
                return (Instrumentation$ActivityResult)o;
            }
            catch (final Exception ex) {
                goto Label_0125;
            }
            catch (final InvocationTargetException ex) {
                break Label_0165;
            }
            try {
                final Method method = declaredMethod;
                final BTMInstrumentationProxy btmInstrumentationProxy = this;
                final Instrumentation instrumentation = btmInstrumentationProxy.mBaseInstrumentation;
                final int n2 = 7;
                final Object[] array = new Object[n2];
                final int n3 = 0;
                final Exception ex2 = ex;
                array[n3] = ex2;
                final int n4 = 1;
                final IBinder binder3 = binder;
                array[n4] = binder3;
                final int n5 = 2;
                final IBinder binder4 = binder2;
                array[n5] = binder4;
                final int n6 = 3;
                final Activity activity2 = activity;
                array[n6] = activity2;
                final int n7 = 4;
                final Intent intent2 = intent;
                array[n7] = intent2;
                final int n8 = 5;
                final int n9 = n;
                final Integer n10 = n9;
                array[n8] = n10;
                final int n11 = 6;
                final Bundle bundle2 = bundle;
                array[n11] = bundle2;
                final Object o = method.invoke(instrumentation, array);
                return (Instrumentation$ActivityResult)o;
            }
            catch (final Exception ex3) {}
            catch (final InvocationTargetException ex4) {}
        }
        0II.LIZ(ex);
        throw new RuntimeException(((InvocationTargetException)ex).getTargetException());
    }
    
    public Activity newActivity(final Class<?> clazz, final Context context, final IBinder binder, final Application application, final Intent intent, final ActivityInfo activityInfo, final CharSequence charSequence, final Activity activity, final String s, final Object o) {
        final Instrumentation mBaseInstrumentation = this.mBaseInstrumentation;
        if (mBaseInstrumentation != null) {
            return mBaseInstrumentation.newActivity((Class)clazz, context, binder, application, intent, activityInfo, charSequence, activity, s, o);
        }
        return super.newActivity((Class)clazz, context, binder, application, intent, activityInfo, charSequence, activity, s, o);
    }
    
    public Activity newActivity(final ClassLoader classLoader, final String s, final Intent intent) {
        return this.mBaseInstrumentation.newActivity(classLoader, s, intent);
    }
    
    public Application newApplication(final ClassLoader classLoader, final String s, final Context context) {
        final Instrumentation mBaseInstrumentation = this.mBaseInstrumentation;
        if (mBaseInstrumentation != null) {
            return mBaseInstrumentation.newApplication(classLoader, s, context);
        }
        return super.newApplication(classLoader, s, context);
    }
    
    public boolean onException(final Object o, final Throwable t) {
        final Instrumentation mBaseInstrumentation = this.mBaseInstrumentation;
        if (mBaseInstrumentation != null) {
            return mBaseInstrumentation.onException(o, t);
        }
        return super.onException(o, t);
    }
}
