// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.Objects;
import org.json.JSONObject;
import java.util.Map;
import com.bytedance.covode.number.Covode;

@0kX(LIZ = "LINK_LOGGER")
public final class 1lb extends 1ct
{
    static {
        Covode.recordClassIndex(8429);
    }
    
    @Override
    public final void LIZJ(final Throwable t, final Map<String, Object> map) {
        CTM.LIZ((Object)map);
        super.LIZJ(t, map);
        final 5E4 5e4 = map.get("source");
        if (5e4 != null) {
            1ml.LIZ(5e4, t);
        }
    }
    
    @Override
    public final void LIZLLL() {
        super.LIZLLL();
        0xo.LIZLLL("OnStartSuccess", "position:LinkIn_Anchor");
    }
    
    @Override
    public final void LJI(final Map<String, Object> map) {
        CTM.LIZ((Object)map);
        super.LJI(map);
        final 5E4 5e4 = map.get("source");
        if (5e4 != null) {
            CTM.LIZ((Object)5e4);
            final JSONObject jsonObject = new JSONObject();
            0d3.LIZ(jsonObject, "support_vendor", "12");
            0d3.LIZ(jsonObject, "turn_on_source", 5e4.value);
            1ml.LIZ(1ml.LJIIIIZZ, true, "init_request", jsonObject);
            1ml.LIZ = System.currentTimeMillis();
        }
    }
    
    @Override
    public final void LJII(final Map<String, Object> map) {
        CTM.LIZ((Object)map);
        super.LJII(map);
        final 5E4 5e4 = map.get("source");
        final 5E4 value = map.get("response");
        Objects.requireNonNull((String)value, "null cannot be cast to non-null type kotlin.String");
        final String s = (String)value;
        if (5e4 != null) {
            CTM.LIZ((Object)5e4, (Object)s);
            final JSONObject jsonObject = new JSONObject();
            0d3.LIZ(jsonObject, "response", s);
            0d3.LIZ(jsonObject, "turn_on_source", 5e4.value);
            0d3.LIZ(jsonObject, "cost", System.currentTimeMillis() - 1ml.LIZ);
            1ml.LIZ(1ml.LJIIIIZZ, true, "init_succeed", jsonObject);
        }
    }
    
    @Override
    public final void LJIIIIZZ(final Map<String, Object> map) {
        CTM.LIZ((Object)map);
        super.LJIIIIZZ(map);
    }
}
