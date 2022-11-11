// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.android.livesdk.model.Extra;
import com.bytedance.android.live.network.response.RequestError;
import com.bytedance.covode.number.Covode;

public final class 0yl
{
    static {
        Covode.recordClassIndex(10437);
    }
    
    public static void LIZ(final int n, final 0bs 0bs, final String s) {
        final 1mo 1mo = new 1mo(n, 0bs.LIZJ, s);
        1mo.setPrompt(0bs.LIZIZ);
        throw 1mo;
    }
    
    public static void LIZ(final int n, final RequestError requestError, final Extra extra, final String s) {
        LIZ(n, requestError, 0b8.a.LIZIZ.LIZIZ((Object)extra), s);
    }
    
    public static void LIZ(final int n, final RequestError requestError, final Extra extra, final String s, final Object data) {
        RequestError requestError2 = requestError;
        if (requestError == null) {
            requestError2 = new RequestError();
            requestError2.prompts = 0cB.LIZ(2131836087);
        }
        final 1mo 1mo = new 1mo(n, requestError2.url, s);
        1mo.setErrorMsg(requestError2.message);
        1mo.setPrompt(requestError2.prompts);
        1mo.setAlert(requestError2.alert);
        1mo.setExtra(0b8.a.LIZIZ.LIZIZ((Object)extra));
        1mo.setData(data);
        throw 1mo;
    }
    
    public static void LIZ(final int n, final RequestError requestError, final String extra, final String s) {
        RequestError requestError2 = requestError;
        if (requestError == null) {
            requestError2 = new RequestError();
            requestError2.prompts = 0cB.LIZ(2131836087);
        }
        final 1mo 1mo = new 1mo(n, requestError2.url, s);
        1mo.setErrorMsg(requestError2.message);
        1mo.setPrompt(requestError2.prompts);
        1mo.setAlert(requestError2.alert);
        1mo.setExtra(extra);
        throw 1mo;
    }
}
