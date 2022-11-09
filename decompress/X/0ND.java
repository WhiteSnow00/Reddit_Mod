// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;

public enum 0nD
{
    MATCH_BATTLE_INFO("match_battle_info"), 
    MATCH_OPEN_MESSAGE("match_open_message"), 
    MATCH_ROOM_ENTER("match_room_enter"), 
    MATCH_SEI("match_sei"), 
    NONE("none");
    
    public final String LIZIZ;
    
    static {
        Covode.recordClassIndex(7788);
    }
    
    public 0nD(final String liziz) {
        this.LIZIZ = liziz;
    }
    
    public final String getValue() {
        return this.LIZIZ;
    }
}
