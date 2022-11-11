// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.base.model.media;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class VideoMark
{
    @c(LIZ = "id")
    public int id;
    
    static {
        Covode.recordClassIndex(4950);
    }
    
    public int getId() {
        return this.id;
    }
    
    public void setId(final int id) {
        this.id = id;
    }
}
