// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.HashMap;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;

public class 1qi extends 1hx
{
    static {
        Covode.recordClassIndex(4648);
    }
    
    @Override
    public final String LIZ() {
        return "pipo.encryptString";
    }
    
    @Override
    public final void LIZ(final Pka pka, final Hya hya, final I0l i0l) {
        super.LIZ(pka, hya, i0l);
        final String ljff = pka.LJFF("key");
        final String ljff2 = pka.LJFF("origin_str");
        if (TextUtils.isEmpty((CharSequence)ljff)) {
            0U7.LIZ("key is null!", hya);
            return;
        }
        if (TextUtils.isEmpty((CharSequence)ljff2)) {
            0U7.LIZ("origin_str is null!", hya);
            return;
        }
        String liz;
        if ((liz = 0UY.LIZ(ljff, ljff2)) == null) {
            liz = "";
        }
        final HashMap hashMap = new HashMap();
        hashMap.put("result", liz);
        0U7.LIZ(hashMap, hya);
    }
}
