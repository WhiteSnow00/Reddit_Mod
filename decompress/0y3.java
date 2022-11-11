// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.ss.avframework.livestreamv2.core.interact.model.Config$Vendor;
import com.bytedance.android.livesdk.chatroom.api.LinkApi;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.live.liveinteract.cohost.remote.api.CoHostApi;
import com.bytedance.covode.number.Covode;

public final class 0y3
{
    public static int LIZ;
    public static int LIZIZ;
    public static int LIZJ;
    public static int LIZLLL;
    
    static {
        Covode.recordClassIndex(10355);
        0y3.LIZLLL = 4;
        0y3.LIZ = 5;
        0y3.LIZJ = 1;
    }
    
    public static long LIZ(final Throwable t) {
        final boolean b = t instanceof 0VX;
        long n = -1L;
        if (b) {
            final 0VX 0vx = (0VX)t;
            n = n;
            if (0vx.getErrorCode() != 0) {
                n = 0vx.getErrorCode();
            }
        }
        return n;
    }
    
    public static void LIZ(final int n, final long n2) {
        final String ljff = a.LIZJ.LJFF;
        final String lji = a.LIZJ.LJI;
        final StringBuilder sb = new StringBuilder();
        sb.append(a.LIZJ.LJI);
        sb.append(":");
        sb.append(n2);
        final String string = sb.toString();
        if (n == 0y3.LIZIZ) {
            LIZ(ljff, lji, -1L, string);
            return;
        }
        if (n == 0y3.LIZJ) {
            LIZIZ(ljff, lji, -1L, string);
        }
    }
    
    public static void LIZ(final int n, final long n2, final String s) {
        final String ljff = a.LIZLLL.LJFF;
        final String lji = a.LIZLLL.LJI;
        if (n == 0y3.LIZIZ) {
            LIZ(ljff, lji, n2, s);
            return;
        }
        if (n == 0y3.LIZJ) {
            LIZIZ(ljff, lji, n2, s);
        }
    }
    
    public static void LIZ(final int n, final Throwable t) {
        final String ljff = a.LIZIZ.LJFF;
        final String lji = a.LIZIZ.LJI;
        final long liz = LIZ(t);
        final String string = t.toString();
        if (n == 0y3.LIZIZ) {
            LIZ(ljff, lji, liz, string);
            return;
        }
        if (n == 0y3.LIZJ) {
            LIZIZ(ljff, lji, liz, string);
        }
    }
    
    public static void LIZ(final long n, final long n2, final long n3, final String s, final long n4, final String s2, final String s3, final int n5, final String s4, final String s5, final long n6, final String s6) {
        0yr.LIZ().LIZ(CoHostApi.class).reportBroadcasterLinkIssue(n, n2, n3, s, n4, s2, s3, n5, s4, s5, n6, s6).LIZ((FCD)new FC5()).LIZ(1dE.LIZ, 1dF.LIZ);
    }
    
    public static void LIZ(final String s, final String s2, final long n, final String s3) {
        final long id = ((Room)DataChannelGlobal.LIZJ.LIZIZ((Class)HQ5.class)).getId();
        final long lj = 1NN.LLFF.LIZ().LJ;
        final 1NN liz = 1NN.LLFF.LIZ();
        final 0W5 liz2 = Fk2.LIZ().LIZIZ().LIZ();
        long n2;
        if (liz.LJIIZILJ) {
            n2 = liz2.getId();
        }
        else {
            n2 = liz.LJFF;
        }
        String s4;
        if (liz.LJIIZILJ) {
            s4 = liz2.getSecUid();
        }
        else {
            s4 = liz.LJI;
        }
        long n3;
        if (liz.LJIIZILJ) {
            n3 = liz.LJFF;
        }
        else {
            n3 = liz2.getId();
        }
        String s5;
        if (liz.LJIIZILJ) {
            s5 = liz.LJI;
        }
        else {
            s5 = liz2.getSecUid();
        }
        LIZ(id, lj, n2, s4, n3, s5, String.valueOf(0y3.LIZ), 1NN.LLFF.LIZ().LIZLLL().getValue(), s, s2, n, s3);
    }
    
    public static void LIZIZ(final String s, final String s2, final long n, final String s3) {
        final Room room = (Room)DataChannelGlobal.LIZJ.LIZIZ((Class)HQ5.class);
        if (room == null) {
            0ba.LIZ(5, "LinkIssueInterfaceReport", "room is null, so return");
            return;
        }
        final long id = room.getId();
        0yr.LIZ().LIZ(LinkApi.class).reportAudienceLinkIssue(id, id, 0y3.LIZLLL, Config$Vendor.fromValue(GCe.LIZ().LJIIJJI).getValue(), s, s2, n, s3).LIZ((FCD)new FC5()).LIZ(1dG.LIZ, 1dH.LIZ);
    }
    
    public static void LIZIZ(final Throwable t) {
        LIZIZ(a.LJ.LJFF, a.LJ.LJI, LIZ(t), t.toString());
    }
    
    public enum a
    {
        LIZ("server", "reply_fail"), 
        LIZIZ("server", "join_channel_fail"), 
        LIZJ("rtc", "rtc_timeout"), 
        LIZLLL("rtc", "rtc_error"), 
        LJ("server", "permit_fail");
        
        public String LJFF;
        public String LJI;
        
        static {
            Covode.recordClassIndex(10356);
        }
        
        public a(final String ljff, final String lji) {
            this.LJFF = ljff;
            this.LJI = lji;
        }
    }
}
