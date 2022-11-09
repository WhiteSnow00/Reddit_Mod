// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import com.bytedance.covode.number.Covode;

public class 1qm extends 1hx
{
    static {
        Covode.recordClassIndex(4655);
    }
    
    @Override
    public final String LIZ() {
        return "pipo.onEvent";
    }
    
    @Override
    public final void LIZ(Pka pka, final Hya hya, I0l ljff) {
        super.LIZ(pka, hya, ljff);
        ljff = (I0l)pka.LJFF("event_name");
        final Pka ljii = pka.LJII("params");
        pka = (Pka)new JSONObject();
        if (ljii != null) {
            final Map liziz = ljii.LIZIZ();
            for (final String s : liziz.keySet()) {
                try {
                    ((JSONObject)pka).put(s, liziz.get(s));
                }
                catch (final JSONException ex) {
                    0II.LIZ((Exception)ex);
                }
            }
        }
        1EK.LIZ.LJFF().LIZ((String)ljff, (JSONObject)pka);
        0U7.LIZ((Object)"success", hya);
    }
    
    @Override
    public final String LIZIZ() {
        return "pipo.onEvent";
    }
}
