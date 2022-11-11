// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.base.model.media;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class MediaDebugInfo
{
    @c(LIZ = "info")
    public String info;
    
    static {
        Covode.recordClassIndex(4945);
    }
    
    public String getInfo() {
        return this.info;
    }
    
    public void setInfo(final String info) {
        this.info = info;
    }
}
