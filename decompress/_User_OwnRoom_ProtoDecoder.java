// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.base.model.user;

import X.0Tb;
import java.util.ArrayList;
import X.0Ta;
import com.bytedance.covode.number.Covode;
import X.0TU;

public final class _User_OwnRoom_ProtoDecoder implements 0TU<User.OwnRoom>
{
    static {
        Covode.recordClassIndex(4990);
    }
    
    public static User.OwnRoom LIZ(final 0Ta 0Ta) {
        final User.OwnRoom ownRoom = new User.OwnRoom();
        ownRoom.LIZ = new ArrayList<Long>();
        final long liz = 0Ta.LIZ();
        while (true) {
            final int liziz = 0Ta.LIZIZ();
            if (liziz == -1) {
                break;
            }
            if (liziz != 1) {
                0Tb.LIZJ(0Ta);
            }
            else {
                ownRoom.LIZ.add(0Tb.LIZIZ(0Ta));
            }
        }
        0Ta.LIZ(liz);
        return ownRoom;
    }
}
