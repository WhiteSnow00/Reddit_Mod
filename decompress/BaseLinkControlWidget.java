// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.liveinteract.api;

import X.0CC;
import X.0CH;
import com.bytedance.covode.number.Covode;
import X.6mZ;
import X.1Nb;
import com.bytedance.ies.sdk.widgets.LiveWidget;

public abstract class BaseLinkControlWidget extends LiveWidget implements 1Nb, 6mZ
{
    public boolean LIZ;
    
    static {
        Covode.recordClassIndex(7050);
    }
    
    public abstract void LIZ();
    
    public final void a_(final boolean liz) {
        if (!(this.LIZ = liz)) {
            this.LIZ();
        }
    }
    
    public void onStateChanged(final 0CH 0ch, final 0CC.a a) {
        super.onStateChanged(0ch, a);
    }
}
