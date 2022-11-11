// 
// Decompiled by Procyon v0.6.0
// 

package com.appsflyer.internal;

import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.util.Map;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public abstract class cf extends cl
{
    static {
        Covode.recordClassIndex(2668);
    }
    
    public cf(final String s, final Runnable runnable) {
        super(s, runnable);
    }
    
    public final void valueOf(final Context context, final ax<Map<String, Object>> ax) {
        ai.valueOf();
        if (ai.AFInAppEventParameterName(ai.values(context), "appsFlyerCount", false) <= 0 && ax.AFInAppEventParameterName()) {
            new PthreadThread((Runnable)ax.valueOf, "r/internal/cf").start();
            this.AFInAppEventType();
        }
    }
}
