// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import kotlin.jvm.internal.n;
import com.bytedance.covode.number.Covode;

@0kX(LIZ = "DATA_MULTI_LIVE_DEEP_LINK_ENTER_ROOM")
public final class 1ZT implements 0kZ
{
    public static final a LJ;
    public String LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public int LIZLLL;
    public boolean LJFF;
    public int LJI;
    
    static {
        Covode.recordClassIndex(9566);
        LJ = new a((byte)0);
    }
    
    public 1ZT() {
        this.LIZLLL = -1;
        this.LJFF = true;
    }
    
    private final boolean LJFF() {
        final String liz = this.LIZ;
        return liz != null && (this.LIZLLL == -1 && n.LIZ((Object)liz, (Object)"1"));
    }
    
    private final void LJI() {
        if (this.LIZ == null) {
            return;
        }
        this.LIZLLL = 0;
        this.LJI = 0;
        if (GCe.LIZ().LIZJ) {
            FGP.LIZ().LIZ((Object)new 0kF());
            return;
        }
        this.LIZIZ();
    }
    
    public final void LIZ() {
        if (this.LJFF()) {
            this.LJI();
        }
    }
    
    @Override
    public final void LIZ(final Room room) {
        this.LIZ("1", room, false);
        this.LIZ();
    }
    
    public final void LIZ(final String liz, final Room room, final boolean ljff) {
        if (room == null) {
            return;
        }
        if (liz == null) {
            return;
        }
        if (!room.isWithLinkMic() && !GCe.LIZ().LIZJ && n.LIZ((Object)liz, (Object)"1")) {
            this.LIZ = null;
            Hf4.LIZ(0cB.LJ(), 2131829206);
            return;
        }
        if (room.isWithLinkMic() && n.LIZ((Object)liz, (Object)"0")) {
            this.LIZ = null;
            return;
        }
        this.LIZLLL = -1;
        this.LIZIZ = false;
        this.LIZJ = false;
        this.LJFF = ljff;
        this.LIZ = liz;
    }
    
    public final void LIZIZ() {
        this.LIZ = null;
        this.LJI = 0;
        this.LIZLLL = -1;
    }
    
    public final void LIZJ() {
        if (this.LIZ == null) {
            return;
        }
        int lji = this.LJI;
        int lizlll = 1;
        ++lji;
        this.LJI = lji;
        if (this.LIZLLL == 0 && lji == 1) {
            this.LIZIZ = true;
        }
        else {
            this.LIZIZ();
            lizlll = -1;
        }
        this.LIZLLL = lizlll;
    }
    
    public final String LIZLLL() {
        if (2 != this.LIZLLL) {
            return "";
        }
        if (this.LJFF) {
            return "from_activitypage_redirect";
        }
        return "from_activitypage";
    }
    
    public final String LJ() {
        final Fzp liz = Fhf.LIZ;
        final String s = "";
        n.LIZIZ((Object)liz, "");
        final EnterRoomLinkSession liziz = liz.LIZIZ();
        String s2 = s;
        if (liziz != null) {
            final EnterRoomConfig liziz2 = liziz.LIZIZ;
            if (liziz2 == null) {
                s2 = s;
            }
            else {
                final String ljiizilj = liziz2.LIZLLL.LJIIZILJ;
                s2 = s;
                if (ljiizilj != null) {
                    s2 = s;
                    if (GTi.LIZ((CharSequence)ljiizilj)) {
                        s2 = "from_activitypage";
                    }
                }
            }
        }
        return s2;
    }
    
    public static final class a
    {
        static {
            Covode.recordClassIndex(9567);
        }
        
        public final 1ZT LIZ() {
            return 1jw.LIZ.LIZIZ("DATA_MULTI_LIVE_DEEP_LINK_ENTER_ROOM");
        }
        
        public final void LIZIZ() {
            final 1ZT liz = this.LIZ();
            if (liz != null) {
                liz.LIZIZ();
            }
        }
    }
}
