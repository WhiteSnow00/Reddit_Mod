// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;

public enum 0k4
{
    FIRST_SEI("first_sei"), 
    LINK_ENTER("link_enter"), 
    NONE("none"), 
    OTHER_SEI("other_sei"), 
    ROOM_ENTER("room_enter"), 
    SUCCESS("success");
    
    public final String LIZIZ;
    
    static {
        Covode.recordClassIndex(7063);
    }
    
    public 0k4(final String liziz) {
        this.LIZIZ = liziz;
    }
    
    public final String getValue() {
        return this.LIZIZ;
    }
}
