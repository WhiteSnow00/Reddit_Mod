// 
// Decompiled by Procyon v0.6.0
// 

package com.appsflyer.internal;

import java.util.Timer;
import android.app.Application;
import com.appsflyer.AFLogger;
import java.util.TimerTask;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadTimer;
import X.5WL;
import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.app.Application$ActivityLifecycleCallbacks;
import java.util.concurrent.Executor;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public final class ag
{
    public static b valueOf;
    public static long values;
    
    static {
        Covode.recordClassIndex(2582);
        ag.values = 500L;
    }
    
    public static void AFKeystoreWrapper(final Context context, final b valueOf, final Executor executor) {
        ag.valueOf = valueOf;
        final Application$ActivityLifecycleCallbacks application$ActivityLifecycleCallbacks = (Application$ActivityLifecycleCallbacks)new Application$ActivityLifecycleCallbacks() {
            public boolean AFKeystoreWrapper;
            public boolean values = true;
            
            static {
                Covode.recordClassIndex(2583);
            }
            
            public final void onActivityCreated(final Activity activity, final Bundle bundle) {
                executor.execute(new Runnable() {
                    static {
                        Covode.recordClassIndex(2587);
                    }
                    
                    @Override
                    public final void run() {
                        i.values();
                        final Intent intent = activity.getIntent();
                        if (i.AFKeystoreWrapper(intent) != null && intent != i.AFInAppEventParameterName) {
                            i.AFInAppEventParameterName = intent;
                        }
                    }
                });
            }
            
            public final void onActivityDestroyed(final Activity activity) {
            }
            
            public final void onActivityPaused(final Activity activity) {
                executor.execute(new Runnable() {
                    static {
                        Covode.recordClassIndex(2584);
                    }
                    
                    public static Context INVOKEVIRTUAL_com_appsflyer_internal_ag$1$1_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(Context applicationContext) {
                        applicationContext = applicationContext.getApplicationContext();
                        if (!5WL.LIZIZ) {
                            return applicationContext;
                        }
                        if (applicationContext != null) {
                            return applicationContext;
                        }
                        return (Context)5WL.LIZ;
                    }
                    
                    @Override
                    public final void run() {
                        Application$ActivityLifecycleCallbacks.this.values = true;
                        final Context invokevirtual_com_appsflyer_internal_ag$1$1_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext = INVOKEVIRTUAL_com_appsflyer_internal_ag$1$1_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext((Context)activity);
                        try {
                            ((Timer)new PthreadTimer("ternal/ag$1$1")).schedule(new TimerTask() {
                                static {
                                    Covode.recordClassIndex(2585);
                                }
                                
                                @Override
                                public final void run() {
                                    if (Application$ActivityLifecycleCallbacks.this.AFKeystoreWrapper && Application$ActivityLifecycleCallbacks.this.values) {
                                        Application$ActivityLifecycleCallbacks.this.AFKeystoreWrapper = false;
                                        try {
                                            valueOf.valueOf(invokevirtual_com_appsflyer_internal_ag$1$1_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext);
                                        }
                                        catch (final Exception ex) {
                                            AFLogger.valueOf("Listener threw exception! ", ex);
                                        }
                                    }
                                }
                            }, ag.values);
                        }
                        finally {
                            final Throwable t;
                            AFLogger.valueOf("Background task failed with a throwable: ", t);
                        }
                    }
                });
            }
            
            public final void onActivityResumed(final Activity activity) {
                executor.execute(new Runnable() {
                    static {
                        Covode.recordClassIndex(2586);
                    }
                    
                    @Override
                    public final void run() {
                        if (!Application$ActivityLifecycleCallbacks.this.AFKeystoreWrapper) {
                            try {
                                valueOf.AFKeystoreWrapper(activity);
                            }
                            catch (final Exception ex) {
                                AFLogger.values("Listener thrown an exception: ", ex);
                            }
                        }
                        Application$ActivityLifecycleCallbacks.this.values = false;
                        Application$ActivityLifecycleCallbacks.this.AFKeystoreWrapper = true;
                    }
                });
            }
            
            public final void onActivitySaveInstanceState(final Activity activity, final Bundle bundle) {
            }
            
            public final void onActivityStarted(final Activity activity) {
            }
            
            public final void onActivityStopped(final Activity activity) {
            }
        };
        if (context instanceof Activity) {
            application$ActivityLifecycleCallbacks.onActivityResumed((Activity)context);
        }
        ((Application)INVOKEVIRTUAL_com_appsflyer_internal_ag_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(context)).registerActivityLifecycleCallbacks((Application$ActivityLifecycleCallbacks)application$ActivityLifecycleCallbacks);
    }
    
    public static Context INVOKEVIRTUAL_com_appsflyer_internal_ag_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(Context applicationContext) {
        applicationContext = applicationContext.getApplicationContext();
        if (!5WL.LIZIZ) {
            return applicationContext;
        }
        if (applicationContext != null) {
            return applicationContext;
        }
        return (Context)5WL.LIZ;
    }
    
    public interface b
    {
        default static {
            Covode.recordClassIndex(2588);
        }
        
        void AFKeystoreWrapper(final Activity p0);
        
        void valueOf(final Context p0);
    }
}
