// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.core.model.startlive;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.bytedance.android.livesdk.model.Extra;

public class StartLiveExtra extends Extra
{
    @c(LIZ = "is_phone_binded")
    public boolean isPhoneBinded;
    @c(LIZ = "live_agreement")
    public boolean liveAgreement;
    @c(LIZ = "live_answer")
    public boolean liveAnswer;
    @c(LIZ = "realname_verify")
    public int realnameVerify;
    
    static {
        Covode.recordClassIndex(5772);
    }
}
