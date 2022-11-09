// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.Map;
import java.util.HashMap;
import com.bytedance.covode.number.Covode;

public class 1qo extends 1hx
{
    static {
        Covode.recordClassIndex(4657);
    }
    
    @Override
    public final String LIZ() {
        return "pipoAppInfo";
    }
    
    @Override
    public final void LIZ(final Pka pka, final Hya hya, final I0l i0l) {
        super.LIZ(pka, hya, i0l);
        final HashMap hashMap = new HashMap();
        hashMap.put("aid", 2112);
        hashMap.put("appVersion", "1.0.0-rc.11");
        hya.LIZ((Map)hashMap);
    }
    
    public final Psw LIZJ() {
        return Psw.PUBLIC;
    }
}
