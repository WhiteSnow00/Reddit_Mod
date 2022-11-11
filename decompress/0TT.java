// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.ies.sdk.datachannel.DataChannel;
import org.json.JSONObject;
import android.view.View;
import com.bytedance.covode.number.Covode;
import android.view.View$OnClickListener;

public final class 0tt implements View$OnClickListener
{
    public final /* synthetic */ 1mL LIZ;
    
    static {
        Covode.recordClassIndex(9410);
    }
    
    public 0tt(final 1mL liz) {
        this.LIZ = liz;
    }
    
    public final void onClick(final View view) {
        final 1mL liz = this.LIZ;
        final int ljii = liz.LJI.LJII;
        String s = "off";
        if (ljii == 0 || liz.LJI.LIZJ == 0) {
            Hf4.LIZ(0cB.LJ(), 2131829185);
            0uW.LIZJ.LIZ("off", "icon", 0);
            return;
        }
        final boolean liziz = liz.LJI.LIZIZ ^ true;
        liz.LJI.LIZIZ = liziz;
        final 1Uo lji = liz.LJI;
        int lizj;
        if (liziz) {
            lizj = 1;
        }
        else {
            lizj = 2;
        }
        lji.LIZJ = lizj;
        final DataChannel lj = liz.LJ;
        if (lj != null) {
            lj.LIZJ((Class)2G5.class, (Object)liziz);
        }
        if (liziz) {
            FGP.LIZ().LIZ((Object)new Fgq(40));
            0uW.LIZJ.LIZ("on", "icon", 1);
        }
        else {
            FGP.LIZ().LIZ((Object)new Fgq(41));
            0uW.LIZJ.LIZ("off", "icon", 1);
            Hf4.LIZ(0cB.LJ(), 2131832177);
        }
        final JSONObject jsonObject = new JSONObject();
        jsonObject.put("log_name", (Object)"ttlive_multilive_anchor_switch_camera");
        if (liziz) {
            s = "on";
        }
        jsonObject.put("switch", (Object)s);
        jsonObject.put("way", (Object)"Anchor switch camera in MultiLiveAsAnchorListDialogV2");
        0ba.LIZ(4, liz.LIZJ, jsonObject.toString());
        liz.LIZIZ();
        liz.LIZJ();
    }
}
