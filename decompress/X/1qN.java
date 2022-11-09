// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.Map;
import java.util.HashMap;
import com.bytedance.covode.number.Covode;

public class 1qn extends 1hx
{
    static {
        Covode.recordClassIndex(4656);
    }
    
    @Override
    public final String LIZ() {
        return "pipo.openWebView";
    }
    
    @Override
    public final void LIZ(final Pka pka, final Hya hya, final I0l i0l) {
        super.LIZ(pka, hya, i0l);
        String ljff;
        if (pka.LIZ("url")) {
            ljff = pka.LJFF("url");
        }
        else {
            ljff = "";
        }
        hya.LIZ((Map)new HashMap());
        1EK.LIZ.LJIIIZ().LIZ(ljff);
        hya.LIZ((Map)null);
    }
}
