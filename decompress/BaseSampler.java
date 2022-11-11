// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.core.performance;

import X.0ba;
import X.0CC;
import X.0Bg;
import com.bytedance.covode.number.Covode;
import android.os.Handler;

public abstract class BaseSampler<T> implements Runnable
{
    public static final String LIZJ;
    public Handler LIZ;
    public BaseSampler.a LIZIZ;
    
    static {
        Covode.recordClassIndex(5849);
        LIZJ = BaseSampler.class.getClass().getSimpleName();
    }
    
    @0Bg(LIZ = 0CC.a.ON_CREATE)
    public void onCreate() {
    }
    
    @0Bg(LIZ = 0CC.a.ON_DESTROY)
    public void onDestroy() {
        0ba.LIZ(3, BaseSampler.LIZJ, "onDestroy");
        final Handler liz = this.LIZ;
        if (liz != null) {
            liz.removeCallbacks((Runnable)this);
            this.LIZ = null;
        }
        if (this.LIZIZ != null) {
            this.LIZIZ = null;
        }
    }
    
    @0Bg(LIZ = 0CC.a.ON_PAUSE)
    public void onPause() {
    }
    
    @0Bg(LIZ = 0CC.a.ON_RESUME)
    public void onResume() {
    }
    
    @0Bg(LIZ = 0CC.a.ON_START)
    public void onStart() {
    }
    
    @0Bg(LIZ = 0CC.a.ON_STOP)
    public void onStop() {
    }
}
