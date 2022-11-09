// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestSeiAbnormalDetectorSwitch;
import com.bytedance.covode.number.Covode;

@0kX(LIZ = "MULTI_GUEST_SEI_ABNORMAL_DETECTOR")
public final class 0xf
{
    public static final /* synthetic */ SRC[] LIZ;
    public static final a LJIIJ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public String LIZLLL;
    public 0xa LJ;
    public L76 LJFF;
    public int LJI;
    public int LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;
    public final 0kU LJIIJJI;
    
    static {
        Covode.recordClassIndex(10317);
        LIZ = new SRC[] { (SRC)new SRK((Class)0xf.class, "linkUserInfoCenter", "getLinkUserInfoCenter()Lcom/bytedance/android/live/liveinteract/multiguest/business/helper/LinkUserInfoCenter;", 0) };
        LJIIJ = new a((byte)0);
    }
    
    public 0xf() {
        this.LJIIJJI = new 0kU("LINK_USER_INFO_CENTER");
        this.LJII = MultiGuestSeiAbnormalDetectorSwitch.INSTANCE.getValue().LIZJ;
        this.LJIIIZ = MultiGuestSeiAbnormalDetectorSwitch.INSTANCE.getValue().LIZIZ;
    }
    
    private final 1Tr LIZJ() {
        return this.LJIIJJI.LIZ(this, 0xf.LIZ[0]);
    }
    
    public final int LIZ() {
        if (0sD.LIZJ.LIZ().LIZLLL()) {
            return 0sM.LIZ(0jz.LIZJ());
        }
        final 1Tr lizj = this.LIZJ();
        if (lizj != null) {
            return lizj.LJFF();
        }
        return 0;
    }
    
    public final void LIZIZ() {
        this.LIZIZ = true;
        this.LIZJ = false;
    }
    
    public static final class a
    {
        static {
            Covode.recordClassIndex(10318);
        }
        
        public final 0xf LIZ() {
            if (MultiGuestSeiAbnormalDetectorSwitch.INSTANCE.getValue().LIZ) {
                return 1jw.LIZ.LIZIZ("MULTI_GUEST_SEI_ABNORMAL_DETECTOR");
            }
            return null;
        }
    }
}
