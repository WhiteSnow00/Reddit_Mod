// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.livepullstream.api;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import X.0jB;
import X.Hha;
import X.0yZ;
import X.0jA;
import X.1ND;
import X.0TR;
import X.0yY;
import X.0j5;
import X.0yW;
import X.0j3;
import X.GrO;
import X.0TP;
import android.content.Context;
import X.0TS;
import X.Fgi;
import com.bytedance.android.livesdkapi.depend.model.live.StreamUrlExtra$SrConfig;
import X.Fra;
import com.bytedance.covode.number.Covode;

public class PullStreamServiceDummy implements IPullStreamService
{
    static {
        Covode.recordClassIndex(10407);
    }
    
    @Override
    public 0TP createRoomPlayer(final long n, final String s, final Fra fra, final StreamUrlExtra$SrConfig streamUrlExtra$SrConfig, final Fgi fgi, final 0TS 0ts, final Context context, final String s2) {
        return null;
    }
    
    @Override
    public 0TP createRoomPlayer(final long n, final String s, final String s2, final Fra fra, final StreamUrlExtra$SrConfig streamUrlExtra$SrConfig, final Fgi fgi, final 0TS 0ts, final Context context) {
        return null;
    }
    
    @Override
    public 0TP ensureRoomPlayer(final long n, final String s, final Fra fra, final StreamUrlExtra$SrConfig streamUrlExtra$SrConfig, final Fgi fgi, final 0TS 0ts, final Context context, final String s2, final String s3) {
        return null;
    }
    
    @Override
    public 0TP ensureRoomPlayer(final long n, final String s, final String s2, final Fra fra, final StreamUrlExtra$SrConfig streamUrlExtra$SrConfig, final Fgi fgi, final 0TS 0ts, final Context context, final String s3) {
        return null;
    }
    
    public 0j3 getAudioFocusController(final GrO grO) {
        return null;
    }
    
    @Override
    public 0yW getCpuInfoFetcher() {
        return null;
    }
    
    @Override
    public 0j5 getDnsOptimizer() {
        return null;
    }
    
    @Override
    public 0yY getGpuInfoFetcher() {
        return null;
    }
    
    @Override
    public 0TR getIRoomPlayerManager() {
        return null;
    }
    
    @Override
    public 1ND getLivePlayController() {
        return null;
    }
    
    @Override
    public 0jA getLivePlayControllerManager() {
        return null;
    }
    
    @Override
    public 0yZ getLivePlayerLog() {
        return null;
    }
    
    public Hha getLivePlayerView(final Context context) {
        return null;
    }
    
    @Override
    public 0jB getLiveStreamStrategy() {
        return null;
    }
    
    @Override
    public String getProjectKey() {
        return "";
    }
    
    @Override
    public void onInit() {
    }
    
    @Override
    public boolean preCreatedSurface(final String s, final Context context) {
        return false;
    }
    
    @Override
    public void recycleRoomPlayer(final String s) {
    }
    
    @Override
    public void stopRoomPlayer(final String s, final boolean b) {
    }
    
    @Override
    public 0TP warmUp(final long n, final EnterRoomConfig enterRoomConfig, final Context context) {
        return null;
    }
    
    @Override
    public 0TP warmUp(final Room room, final Context context) {
        return null;
    }
}
