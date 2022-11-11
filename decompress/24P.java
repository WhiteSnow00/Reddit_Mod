// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.covode.number.Covode;

public final class 24P extends F5g implements SRS<1Ws, 1Wk>
{
    public final /* synthetic */ 24s LIZ;
    
    static {
        Covode.recordClassIndex(9207);
    }
    
    public 24P(final 24s liz) {
        this.LIZ = liz;
        super(1);
    }
    
    public final 1Wk LIZ(final 1Ws 1Ws) {
        1Wv liz;
        if (1Ws != null) {
            liz = 1Ws.LIZ;
        }
        else {
            liz = null;
        }
        String s = "";
        1Wk 1Wk;
        if (liz == null) {
            final boolean liziz = this.LIZ.LIZLLL().LIZIZ;
            final boolean lizlll = this.LIZ.LIZLLL().LIZLLL;
            final int liziz2 = 1NO.LIZ().LIZIZ;
            final LiveEffect lizj = 1NO.LIZ().LIZJ;
            final boolean liziz3 = this.LIZ.LIZLLL().LIZIZ;
            final boolean lizlll2 = this.LIZ.LIZLLL().LIZLLL;
            final int liziz4 = 1NO.LIZ().LIZIZ;
            final LiveEffect lizj2 = 1NO.LIZ().LIZJ;
            String liziz5;
            if (1Ws == null || (liziz5 = 1Ws.LIZIZ) == null) {
                liziz5 = "";
            }
            final String ljjiizi = this.LIZ.LIZLLL().LJJIIZI;
            if (ljjiizi != null) {
                s = ljjiizi;
            }
            1Wk = new 1Wk(liziz, lizlll, liziz2, lizj, liziz3, lizlll2, liziz4, lizj2, liziz5, s);
        }
        else {
            final boolean liziz6 = this.LIZ.LIZLLL().LIZIZ;
            final boolean lizlll3 = this.LIZ.LIZLLL().LIZLLL;
            final int liziz7 = 1NO.LIZ().LIZIZ;
            final LiveEffect lizj3 = 1NO.LIZ().LIZJ;
            final boolean liz2 = 1Ws.LIZ.LIZ;
            final boolean liziz8 = 1Ws.LIZ.LIZIZ;
            final int lizj4 = 1Ws.LIZ.LIZJ;
            final LiveEffect lizlll4 = 1Ws.LIZ.LIZLLL;
            final String liziz9 = 1Ws.LIZIZ;
            String ljjiizi2 = this.LIZ.LIZLLL().LJJIIZI;
            if (ljjiizi2 == null) {
                ljjiizi2 = s;
            }
            1Wk = new 1Wk(liziz6, lizlll3, liziz7, lizj3, liz2, liziz8, lizj4, lizlll4, liziz9, ljjiizi2);
        }
        return 1Wk;
    }
}
