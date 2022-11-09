// 
// Decompiled by Procyon v0.6.0
// 

package com.aweme.storage;

import X.67l;
import X.0Gq;
import X.0Gn;
import java.util.concurrent.Executor;
import X.0Gx;
import X.6v3;
import android.content.Context;
import X.0Me;
import java.util.concurrent.Callable;
import android.os.IBinder;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import android.app.Service;

public class JobService extends Service
{
    static {
        Covode.recordClassIndex(2731);
    }
    
    public IBinder onBind(final Intent intent) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
    
    public void onCreate() {
        0Gx.LIZ((Callable<Object>)new Callable<String>() {
            static {
                Covode.recordClassIndex(2734);
            }
            
            private String LIZ() {
                0Me.LIZJ((Context)JobService.this);
                return null;
            }
        }, 6v3.LIZ(), null).LIZJ((0Gq<Object, Object>)new 0Gq<String, String>() {
            static {
                Covode.recordClassIndex(2733);
            }
        }, 0Gx.LIZIZ).LIZIZ((0Gq<Object, 0Gx<Object>>)new 0Gq<String, 0Gx<String>>() {
            static {
                Covode.recordClassIndex(2732);
            }
        });
    }
    
    public int onStartCommand(final Intent intent, final int n, final int n2) {
        67l.LIZ((Service)this, intent, n, n2);
        return 2;
    }
}
