// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;
import com.bytedance.covode.number.Covode;

public class 1hn extends 1Dv
{
    static {
        Covode.recordClassIndex(4546);
    }
    
    public 1hn() {
        super(null);
    }
    
    @Override
    public final 0Sp LIZ(final 0Sp 0Sp) {
        if (0Sp == null) {
            return null;
        }
        final String liziz = 0Sp.LIZIZ;
        final 1Dx liz = super.LIZ.LIZ;
        final boolean b = this instanceof 1qd;
        String liz2 = liziz;
        if (liz.LJIIIIZZ) {
            liz2 = 0Rv.LIZ(liziz, b ^ true);
        }
        if (!b) {
            final 1Dk lj = 0Sp.LJ;
            if (lj != null) {
                JSONObject ljii;
                if ((ljii = lj.LJII) == null) {
                    ljii = new JSONObject();
                    lj.LJII = ljii;
                }
                try {
                    ljii.putOpt("custom_net", (Object)1);
                }
                catch (final JSONException ex) {
                    0II.LIZ((Exception)ex);
                }
            }
        }
        final 0Sp.a liz3 = 0Sp.LIZ;
        liz3.LIZ = liz2;
        return liz3.LIZ();
    }
    
    @Override
    public final 0Sq LIZ(final 0Sm.a a) {
        final 0Sp liz = this.LIZ(a.LIZ());
        final String liziz = liz.LIZIZ;
        final 1Dx liz2 = super.LIZ.LIZ;
        int ljii;
        if (liz2 != null) {
            ljii = liz2.LJII;
        }
        else {
            ljii = 10000;
        }
        final String liz3 = 0Rv.LIZ(liziz);
        final boolean empty = TextUtils.isEmpty((CharSequence)liz3);
        boolean b = true;
        if (!empty) {
            if (super.LIZ.LIZ.LJIIIZ.contains(liz3)) {
                b = false;
            }
        }
        final 0Sq liz4 = this.LIZ(liz, ljii, b);
        this.LIZ(liz4);
        return liz4;
    }
    
    public 0Sq LIZ(final 0Sp 0Sp, final int n, final boolean b) {
        throw new RuntimeException("Not implemented");
    }
}
