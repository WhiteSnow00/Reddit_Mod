// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.liveinteract.api;

import X.0CC;
import X.0CH;
import com.bytedance.covode.number.Covode;
import X.6mZ;
import X.1Nc;
import com.bytedance.ies.sdk.widgets.LiveWidget;

public abstract class LinkMicGuestWidget extends LiveWidget implements 1Nc, 6mZ
{
    public boolean LIZ;
    
    static {
        Covode.recordClassIndex(7058);
    }
    
    public void LIZ(final String s) {
    }
    
    public boolean LIZ(final Runnable runnable, final boolean b) {
        return false;
    }
    
    public void onPause() {
        this.LIZ = false;
        super.onPause();
    }
    
    public void onResume() {
        this.LIZ = true;
        super.onResume();
    }
    
    public void onStateChanged(final 0CH 0ch, final 0CC.a a) {
        super.onStateChanged(0ch, a);
    }
}
