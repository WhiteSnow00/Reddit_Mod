// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;

public final class 1Vu extends 9Mp
{
    public final String LIZ;
    public final String LIZIZ;
    public final MultiLiveAnchorPanelSettings LIZJ;
    public final boolean LIZLLL;
    public final String LJ;
    public final String LJFF;
    
    static {
        Covode.recordClassIndex(8826);
    }
    
    public 1Vu() {
        this(null, null, null, false, null, null, 63);
    }
    
    public 1Vu(final String liz, final String liziz, final MultiLiveAnchorPanelSettings lizj, final boolean lizlll, final String lj, final String ljff) {
        CTM.LIZ((Object)lj, (Object)ljff);
        this.LIZ = liz;
        this.LIZIZ = liziz;
        this.LIZJ = lizj;
        this.LIZLLL = lizlll;
        this.LJ = lj;
        this.LJFF = ljff;
    }
    
    public final Object[] getObjects() {
        return new Object[] { this.LIZ, this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ, this.LJFF };
    }
}
