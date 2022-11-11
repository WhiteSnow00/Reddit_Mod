// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.network.gson;

import com.bytedance.covode.number.Covode;
import com.google.gson.Gson;
import com.google.gson.i;

public abstract class AbsJsonDeserializer<T> implements i<T>
{
    public Gson LIZ;
    
    static {
        Covode.recordClassIndex(10445);
    }
    
    public AbsJsonDeserializer(final Gson liz) {
        this.LIZ = liz;
    }
}
