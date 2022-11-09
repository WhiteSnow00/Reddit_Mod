// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;

public final class 0lX
{
    static {
        Covode.recordClassIndex(7388);
    }
    
    public static final 0lu LIZ(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 1: {
                return 0lu.IS_LINKING;
            }
            case 2: {
                return 0lu.INVITATION_DENIED;
            }
            case 3: {
                return 0lu.PERMISSION_DENIED;
            }
            case 4: {
                return 0lu.LOW_CLIENT_VERSION;
            }
            case 5: {
                return 0lu.ROOM_PAUSED;
            }
            case 6: {
                return 0lu.POS_FULL;
            }
            case 7: {
                return 0lu.MATURE_THEME_NOT_MATCH;
            }
        }
    }
}
