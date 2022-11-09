// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.android.widget.Widget;
import java.util.Map;
import java.util.HashMap;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import kotlin.jvm.internal.n;
import com.bytedance.android.livesdkapi.host.IHostApp;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveSdkAppealWebviewSetting;
import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;
import com.bytedance.android.live.liveinteract.multiguest.opt.widget.MultiGuestAsGuestWidget;
import android.content.DialogInterface$OnClickListener;

public final class 0rJ implements DialogInterface$OnClickListener
{
    public final /* synthetic */ MultiGuestAsGuestWidget LIZ;
    
    static {
        Covode.recordClassIndex(8649);
    }
    
    public 0rJ(final MultiGuestAsGuestWidget liz) {
        this.LIZ = liz;
    }
    
    public final void onClick(final DialogInterface dialogInterface, final int n) {
        CTM.LIZ((Object)dialogInterface);
        dialogInterface.dismiss();
        String value;
        if (TextUtils.isEmpty((CharSequence)(value = LiveSdkAppealWebviewSetting.INSTANCE.getValue()))) {
            final 0Vq liz = 0jR.LIZ((Class<0Vq>)IHostApp.class);
            n.LIZIZ((Object)liz, "");
            if (((IHostApp)liz).isInMusicallyRegion()) {
                value = "sslocal://webcast_webview?url=https%3A%2F%2Finapp-va.tiktokv.com%2Ffalcon%2Fwebcast_mt%2Fpage%2Fappeal%2Findex.html&type=fullscreen&title=&hide_more=0&hide_nav_bar=1&hide_status_bar=0";
            }
            else {
                value = "sslocal://webcast_webview?url=https%3A%2F%2Finapp.tiktokv.com%2Ffalcon%2Fwebcast_mt%2Fpage%2Fappeal%2Findex.html&type=fullscreen&title=&hide_more=0&hide_nav_bar=1&hide_status_bar=0";
            }
        }
        0jR.LIZ(IActionHandlerService.class).handle(((Widget)this.LIZ).context, value);
        if (Fk2.LIZ().LIZIZ() != null) {
            final HashMap hashMap = new HashMap();
            final GIK liziz = Fk2.LIZ().LIZIZ();
            n.LIZIZ((Object)liziz, "");
            hashMap.put("user_id", String.valueOf(liziz.LIZJ()));
            final Gkn liz2 = Gkn.LJFF.LIZ("livesdk_user_click_contact_us");
            liz2.LIZ((Map)hashMap);
            liz2.LIZ(this.LIZ.dataChannel);
            liz2.LIZLLL();
        }
        0xy.LIZ(false);
    }
}
