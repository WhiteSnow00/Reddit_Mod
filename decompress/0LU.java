// 
// Decompiled by Procyon v0.6.0
// 

package X;

import kotlin.jvm.internal.n;
import com.bytedance.covode.number.Covode;

public enum 0lu
{
    INVITATION_DENIED(liz2), 
    IS_LINKING(liz), 
    LOW_CLIENT_VERSION(liz4), 
    MATURE_THEME_NOT_MATCH(liz7), 
    PERMISSION_DENIED(liz3), 
    POS_FULL(liz6), 
    ROOM_PAUSED(liz5);
    
    public final String LIZIZ;
    
    static {
        Covode.recordClassIndex(7472);
        final String liz = 0cB.LIZ(2131829339);
        n.LIZIZ((Object)liz, "");
        final String liz2 = 0cB.LIZ(2131832198);
        n.LIZIZ((Object)liz2, "");
        final String liz3 = 0cB.LIZ(2131831321);
        n.LIZIZ((Object)liz3, "");
        final String liz4 = 0cB.LIZ(2131832198);
        n.LIZIZ((Object)liz4, "");
        final String liz5 = 0cB.LIZ(2131832198);
        n.LIZIZ((Object)liz5, "");
        final String liz6 = 0cB.LIZ(2131829248);
        n.LIZIZ((Object)liz6, "");
        final String liz7 = 0cB.LIZ(2131832198);
        n.LIZIZ((Object)liz7, "");
    }
    
    public 0lu(final String liziz) {
        this.LIZIZ = liziz;
    }
    
    public final String getReason() {
        return this.LIZIZ;
    }
}
