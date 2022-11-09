// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.analytics.page;

import X.CTM;
import X.0CC;
import X.0CH;
import com.bytedance.covode.number.Covode;
import X.15t;

public final class TrackerProcessLifecycleObserver implements 15t
{
    public static final TrackerProcessLifecycleObserver LIZ;
    public static boolean LIZIZ;
    
    static {
        Covode.recordClassIndex(4385);
        LIZ = new TrackerProcessLifecycleObserver();
        TrackerProcessLifecycleObserver.LIZIZ = true;
    }
    
    @Override
    public final void onStateChanged(final 0CH 0ch, final 0CC.a a) {
        CTM.LIZ((Object)0ch, (Object)a);
        if (TrackerProcessLifecycleObserver.a.LIZ[a.ordinal()] == 1 && TrackerProcessLifecycleObserver.LIZIZ) {
            TrackerProcessLifecycleObserver.LIZIZ = false;
        }
    }
}
