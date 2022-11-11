// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.livepullstream.api;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import X.0jB;
import X.0yZ;
import X.0jA;
import X.1ND;
import X.0TR;
import X.0yY;
import X.0j5;
import X.0yW;
import X.0TP;
import android.content.Context;
import X.0TS;
import X.Fgi;
import com.bytedance.android.livesdkapi.depend.model.live.StreamUrlExtra$SrConfig;
import X.Fra;
import com.bytedance.covode.number.Covode;
import X.0Vq;

public interface IPullStreamService extends 0Vq
{
    default static {
        Covode.recordClassIndex(10406);
    }
    
    0TP createRoomPlayer(final long p0, final String p1, final Fra p2, final StreamUrlExtra$SrConfig p3, final Fgi p4, final 0TS p5, final Context p6, final String p7);
    
    0TP createRoomPlayer(final long p0, final String p1, final String p2, final Fra p3, final StreamUrlExtra$SrConfig p4, final Fgi p5, final 0TS p6, final Context p7);
    
    0TP ensureRoomPlayer(final long p0, final String p1, final Fra p2, final StreamUrlExtra$SrConfig p3, final Fgi p4, final 0TS p5, final Context p6, final String p7, final String p8);
    
    0TP ensureRoomPlayer(final long p0, final String p1, final String p2, final Fra p3, final StreamUrlExtra$SrConfig p4, final Fgi p5, final 0TS p6, final Context p7, final String p8);
    
    0yW getCpuInfoFetcher();
    
    0j5 getDnsOptimizer();
    
    0yY getGpuInfoFetcher();
    
    0TR getIRoomPlayerManager();
    
    1ND getLivePlayController();
    
    0jA getLivePlayControllerManager();
    
    0yZ getLivePlayerLog();
    
    0jB getLiveStreamStrategy();
    
    String getProjectKey();
    
    boolean preCreatedSurface(final String p0, final Context p1);
    
    void recycleRoomPlayer(final String p0);
    
    void stopRoomPlayer(final String p0, final boolean p1);
    
    0TP warmUp(final long p0, final EnterRoomConfig p1, final Context p2);
    
    0TP warmUp(final Room p0, final Context p1);
}
