// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.ies.sdk.datachannel.DataChannel;
import org.json.JSONObject;
import android.view.View;
import com.bytedance.covode.number.Covode;
import android.view.View$OnClickListener;

public final class 0v0 implements View$OnClickListener
{
    public final /* synthetic */ 1mP LIZ;
    
    static {
        Covode.recordClassIndex(9599);
    }
    
    public 0v0(final 1mP liz) {
        this.LIZ = liz;
    }
    
    public final void onClick(final View view) {
        final 1Uo lizj = this.LIZ.LIZJ;
        if (lizj == null) {
            return;
        }
        lizj.LIZ ^= true;
        0uW.LIZJ.LIZ(lizj.LJJIIZI, lizj.LJIJI, lizj.LIZ ^ true, "guest_connection_panel");
        final DataChannel liziz = this.LIZ.LIZIZ;
        if (liziz != null) {
            liziz.LIZJ((Class)2G9.class, (Object)lizj.LIZ);
        }
        final JSONObject jsonObject = new JSONObject();
        jsonObject.put("log_name", (Object)"ttlive_multilive_guest_switch_mic");
        String s;
        if (lizj.LIZ) {
            s = "on";
        }
        else {
            s = "off";
        }
        jsonObject.put("switch", (Object)s);
        jsonObject.put("way", (Object)"Guest switch mic in MultiGuestUserViewBinder");
        0ba.LIZ(4, this.LIZ.LIZ, jsonObject.toString());
    }
}
