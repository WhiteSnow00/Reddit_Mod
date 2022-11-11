// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;

public class 1qj extends 1hx
{
    static {
        Covode.recordClassIndex(4649);
    }
    
    @Override
    public final String LIZ() {
        return "pipo.executeRiskJS";
    }
    
    @Override
    public final void LIZ(final Pka pka, final Hya hya, final I0l i0l) {
        super.LIZ(pka, hya, i0l);
        String ljff;
        if (pka.LIZ("session_id")) {
            ljff = pka.LJFF("session_id");
        }
        else {
            ljff = "";
        }
        if (TextUtils.isEmpty((CharSequence)ljff)) {
            0U7.LIZ("orgId/sessionId/merchantId is null!", hya);
            return;
        }
        try {
            final String liz = 1EK.LIZ.LJIIIIZZ().LIZ(ljff);
            if (TextUtils.equals((CharSequence)liz, (CharSequence)"success")) {
                0U7.LIZ((Object)"success", hya);
                return;
            }
            0U7.LIZ(liz, hya);
        }
        finally {
            final Throwable t;
            0U7.LIZ(t.getMessage(), hya);
        }
    }
}
