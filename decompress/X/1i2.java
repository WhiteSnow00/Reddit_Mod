// 
// Decompiled by Procyon v0.6.0
// 

package X;

import kotlin.jvm.internal.n;
import com.bytedance.android.livesdk.livesetting.game.FloatingBallCancelSnappedStateSetting;
import android.view.View;
import com.bytedance.covode.number.Covode;
import android.widget.TextView;
import android.content.Context;

public final class 1i2 extends 1Fc
{
    public 0YK LIZ;
    public boolean LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final Context LJ;
    public final TextView LJFF;
    public final TextView LJI;
    public final boolean LJII;
    
    static {
        Covode.recordClassIndex(5103);
    }
    
    public 1i2(final Context lj, final View ljjiii) {
        CTM.LIZ((Object)lj, (Object)ljjiii);
        super(lj);
        final boolean enable = FloatingBallCancelSnappedStateSetting.INSTANCE.isEnable();
        this.LJII = enable;
        final int liz = 0cB.LIZ(36.0f);
        this.LIZJ = liz;
        final int liz2 = 0cB.LIZ(15.0f);
        this.LIZLLL = liz2;
        this.LJ = lj;
        this.LJFF = (TextView)ljjiii.findViewById(2131363190);
        this.LJI = (TextView)ljjiii.findViewById(2131363191);
        super.LJJIII = ljjiii;
        this.LIZIZ(liz, liz2);
        this.LIZ(8388659, -liz, -(int)GlD.LIZ(36.0f));
        if (enable) {
            GlD.LIZ(ljjiii);
        }
    }
    
    public final void LIZ() {
        final TextView ljff = this.LJFF;
        if (ljff != null) {
            GlD.LIZ((View)ljff);
        }
        final TextView lji = this.LJI;
        if (lji != null) {
            GlD.LIZ((View)lji);
        }
        this.LIZIZ = false;
    }
    
    public final void LIZ(final int n) {
        if (n == 1) {
            final View ljjiii = super.LJJIII;
            n.LIZIZ((Object)ljjiii, "");
            ljjiii.setRotationY(0.0f);
            final TextView ljff = this.LJFF;
            if (ljff != null) {
                ljff.setRotationY(0.0f);
            }
            final TextView lji = this.LJI;
            if (lji != null) {
                lji.setRotationY(0.0f);
            }
        }
        else {
            final View ljjiii2 = super.LJJIII;
            n.LIZIZ((Object)ljjiii2, "");
            ljjiii2.setRotationY(180.0f);
            final TextView ljff2 = this.LJFF;
            if (ljff2 != null) {
                ljff2.setRotationY(180.0f);
            }
            final TextView lji2 = this.LJI;
            if (lji2 != null) {
                lji2.setRotationY(180.0f);
            }
        }
        this.LIZIZ = true;
    }
}
