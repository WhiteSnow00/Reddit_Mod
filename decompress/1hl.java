// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.text.TextUtils;
import android.webkit.WebSettings;
import com.bytedance.covode.number.Covode;
import android.content.Context;

public final class 1hl extends 1Dj
{
    public final /* synthetic */ Context LIZ;
    
    static {
        Covode.recordClassIndex(4470);
    }
    
    public 1hl(final Context liz) {
        this.LIZ = liz;
    }
    
    @Override
    public final void LIZ() {
        final String defaultUserAgent = WebSettings.getDefaultUserAgent(this.LIZ);
        if (!TextUtils.isEmpty((CharSequence)defaultUserAgent)) {
            0S0.LIZ = defaultUserAgent;
            1hk.LIZLLL().LJFF.LIZ("WEB_UA_KEY", 0S0.LIZ);
        }
    }
}
