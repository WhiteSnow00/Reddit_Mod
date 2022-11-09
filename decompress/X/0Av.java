// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;

public enum 0aV
{
    Scene_TiktokGameLiveAuto("tiktok_game_live_auto"), 
    Scene_TiktokGameLiveManual("tiktok_game_live_manual"), 
    Scene_TiktokServerErrorDebug("tiktok_server_error_debug"), 
    Scene_Unknown("unknown");
    
    public final String LIZIZ;
    
    static {
        Covode.recordClassIndex(5519);
    }
    
    public 0aV(final String liziz) {
        this.LIZIZ = liziz;
    }
    
    public final String getValue() {
        return this.LIZIZ;
    }
}
