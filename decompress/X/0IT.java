// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.os.SystemClock;
import java.util.HashMap;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;

public final class 0it
{
    public static final 0it LIZ;
    
    static {
        Covode.recordClassIndex(6804);
        LIZ = new 0it();
    }
    
    public static final boolean LIZ(final Room room) {
        if (room != null) {
            final RoomAuthStatus roomAuthStatus = room.getRoomAuthStatus();
            if (roomAuthStatus != null && roomAuthStatus.enableDrawGuess == 1L) {
                return true;
            }
        }
        return false;
    }
    
    private final Gkn LIZIZ(final Gkn gkn, final DataChannel dataChannel) {
        gkn.LIZ("pictionary_session_id", (Number)this.LIZ(dataChannel));
        return gkn;
    }
    
    private final Gkn LIZJ(final Gkn gkn, final DataChannel dataChannel) {
        gkn.LIZ("pictionary_id", (Number)this.LIZIZ(dataChannel));
        return gkn;
    }
    
    public final Gkn LIZ(final Gkn gkn, final DataChannel dataChannel) {
        gkn.LIZ(dataChannel);
        this.LIZIZ(gkn, dataChannel);
        this.LIZJ(gkn, dataChannel);
        return gkn;
    }
    
    public final Long LIZ(final DataChannel dataChannel) {
        if (dataChannel != null) {
            return (Long)dataChannel.LIZIZ((Class)2Cx.class);
        }
        return null;
    }
    
    public final void LIZ(final DataChannel dataChannel, final boolean b) {
        HashMap hashMap;
        if (dataChannel == null || (hashMap = (HashMap)dataChannel.LIZIZ((Class)2Cm.class)) == null) {
            hashMap = new HashMap();
        }
        final Long liziz = this.LIZIZ(dataChannel);
        if (liziz != null) {
            String s;
            if (hashMap.containsKey(liziz)) {
                s = "right";
            }
            else {
                s = "wrong";
            }
            HashMap hashMap2;
            if (dataChannel == null || (hashMap2 = (HashMap)dataChannel.LIZIZ((Class)2Cw.class)) == null) {
                hashMap2 = new HashMap();
            }
            final long uptimeMillis = SystemClock.uptimeMillis();
            final Long n = (Long)hashMap2.get(this.LIZIZ(dataChannel));
            long longValue;
            if (n != null) {
                longValue = n;
            }
            else {
                longValue = 0L;
            }
            final Gkn liz = Gkn.LJFF.LIZ("livesdk_audience_pictionary_round_end");
            this.LIZ(liz, dataChannel);
            liz.LIZ("result", s);
            liz.LIZ("time", Math.min(uptimeMillis - longValue, 120000L));
            String s2;
            if (b) {
                s2 = "1";
            }
            else {
                s2 = "0";
            }
            liz.LIZ("before_end", s2);
            liz.LIZLLL();
            if (dataChannel != null) {
                dataChannel.LIZIZ((Class)2Co.class, (Object)true);
            }
        }
    }
    
    public final Long LIZIZ(final DataChannel dataChannel) {
        if (dataChannel != null) {
            return (Long)dataChannel.LIZIZ((Class)2Cu.class);
        }
        return null;
    }
    
    public final void LIZIZ(final DataChannel dataChannel, final boolean b) {
        if (dataChannel == null) {
            return;
        }
        if (GTi.LIZ((Boolean)dataChannel.LIZIZ((Class)2Cq.class))) {
            final int n = 0;
            dataChannel.LIZIZ((Class)2Cq.class, (Object)false);
            if (GTi.LIZ((Boolean)dataChannel.LIZIZ((Class)2Cp.class)) || GTi.LIZIZ((Boolean)dataChannel.LIZIZ((Class)2Co.class))) {
                dataChannel.LIZIZ((Class)2Co.class, (Object)true);
                dataChannel.LIZIZ((Class)2Cp.class, (Object)false);
                this.LIZ(dataChannel, b);
            }
            final long uptimeMillis = SystemClock.uptimeMillis();
            final Long n2 = (Long)dataChannel.LIZIZ((Class)2Cy.class);
            long longValue;
            if (n2 != null) {
                longValue = n2;
            }
            else {
                longValue = 0L;
            }
            final Gkn liz = Gkn.LJFF.LIZ("livesdk_audience_pictionary_end");
            liz.LIZ(dataChannel);
            this.LIZIZ(liz, dataChannel);
            liz.LIZ("time", Math.min(uptimeMillis - longValue, 120000L));
            final Integer n3 = (Integer)dataChannel.LIZIZ((Class)2Cs.class);
            int intValue;
            if (n3 != null) {
                intValue = n3;
            }
            else {
                intValue = 0;
            }
            liz.LIZ("number_cnt", intValue);
            final HashMap hashMap = (HashMap)dataChannel.LIZIZ((Class)2Cm.class);
            int size = n;
            if (hashMap != null) {
                size = hashMap.size();
            }
            liz.LIZ("correct_cnt", size);
            String s;
            if (b) {
                s = "1";
            }
            else {
                s = "0";
            }
            liz.LIZ("before_end", s);
            liz.LIZLLL();
        }
    }
}
