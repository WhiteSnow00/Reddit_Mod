// 
// Decompiled by Procyon v0.6.0
// 

package com.aweme.storage;

import X.0Gq;
import X.0Gn;
import java.util.concurrent.Executor;
import X.0Gx;
import X.6v3;
import X.0Me;
import java.util.concurrent.Callable;
import android.app.job.JobParameters;
import android.app.Service;
import X.67l;
import android.content.Intent;
import java.lang.reflect.Field;
import X.6G9;
import X.6Nw;
import X.2Lq;
import android.os.Handler;
import android.os.Looper;
import android.content.ClipboardManager;
import X.2JT;
import android.os.Build$VERSION;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import android.app.job.JobService;

public class CompatJobService extends JobService
{
    public static volatile boolean LIZ;
    
    static {
        Covode.recordClassIndex(2727);
    }
    
    public static Object LIZ(Context context, String ex) {
        MethodCollector.i(14251);
    Label_0161_Outer:
        while (true) {
            if (Build$VERSION.SDK_INT <= 27 && "clipboard".equals(ex)) {
                if (!2JT.LIZ) {
                    break Label_0161_Outer;
                }
                monitorenter(ClipboardManager.class);
                try {
                    final Object systemService = context.getSystemService((String)ex);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            final Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            ex = (Exception)new 2Lq((Handler)declaredField.get(systemService));
                            declaredField.set(systemService, ex);
                        }
                        catch (final Exception ex) {
                            6Nw.LIZ((Throwable)ex, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    2JT.LIZ = false;
                    monitorexit(ClipboardManager.class);
                    break Label_0176;
                }
                finally {
                    monitorexit(ClipboardManager.class);
                    MethodCollector.o(14251);
                }
            }
            while (true) {
                if (2JT.LIZIZ || !"connectivity".equals(ex)) {
                    break Label_0161;
                }
                try {
                    new 6G9().LIZ();
                    2JT.LIZIZ = true;
                    context = (Context)context.getSystemService((String)ex);
                    MethodCollector.o(14251);
                    return context;
                    context = (Context)context.getSystemService((String)ex);
                    continue Label_0161_Outer;
                    context = (Context)context.getSystemService((String)ex);
                    continue Label_0161_Outer;
                }
                finally {
                    continue;
                }
                break;
            }
            break;
        }
    }
    
    public int onStartCommand(final Intent intent, final int n, final int n2) {
        67l.LIZ((Service)this, intent, n, n2);
        return 2;
    }
    
    public boolean onStartJob(final JobParameters jobParameters) {
        0Gx.LIZ((Callable<Object>)new Callable<String>() {
            static {
                Covode.recordClassIndex(2730);
            }
        }, 6v3.LIZ(), null).LIZJ((0Gq<Object, Object>)new 0Gq<String, String>() {
            static {
                Covode.recordClassIndex(2729);
            }
        }, 0Gx.LIZIZ).LIZIZ((0Gq<Object, 0Gx<Object>>)new 0Gq<String, 0Gx<String>>() {
            static {
                Covode.recordClassIndex(2728);
            }
        });
        return true;
    }
    
    public boolean onStopJob(final JobParameters jobParameters) {
        return false;
    }
}
