// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.broadcast.api;

import X.0Bf;
import X.0CH;
import android.app.Dialog;
import com.bytedance.covode.number.Covode;
import X.0Vq;

public interface IBroadcastDialogManager extends 0Vq
{
    default static {
        Covode.recordClassIndex(5010);
    }
    
    void addDialogToManager(final Dialog p0);
    
    void addToShow(final int p0, final 0CH p1, final 0Bf<Integer> p2);
    
    void promoteTasks();
}
