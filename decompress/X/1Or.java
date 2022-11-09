// 
// Decompiled by Procyon v0.6.0
// 

package X;

import kotlin.jvm.internal.n;
import android.text.TextUtils;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;
import com.bytedance.ies.sdk.datachannel.DataChannel;

public final class 1Or implements 0lF
{
    public final /* synthetic */ 1NX LIZ;
    public final /* synthetic */ DataChannel LIZIZ;
    public final /* synthetic */ WeakReference LIZJ;
    
    static {
        Covode.recordClassIndex(7346);
    }
    
    public 1Or(final 1NX liz, final DataChannel liziz, final WeakReference lizj) {
        this.LIZ = liz;
        this.LIZIZ = liziz;
        this.LIZJ = lizj;
    }
    
    @Override
    public final void LIZ() {
        if (this.LIZ.LJ == 0kf.ACTIVITY) {
            FGP.LIZ().LIZ((Object)new 0kC(true, 200, "Success"));
        }
        this.LIZIZ.LIZJ((Class)2EA.class);
    }
    
    @Override
    public final void LIZ(final Throwable t) {
        if (!(t instanceof W1e) && !(t instanceof 0kk)) {
            final Context context = (Context)this.LIZJ.get();
            int errorCode;
            if (t instanceof 0VX) {
                errorCode = ((0VX)t).getErrorCode();
            }
            else {
                errorCode = 0;
            }
            String s = "";
            Label_0095: {
                if (context != null) {
                    while (true) {
                        Label_0150: {
                            if (t == null) {
                                break Label_0150;
                            }
                            String s2;
                            if (t instanceof 1Ev) {
                                final 1Ev 1Ev = (1Ev)t;
                                s2 = 1Ev.getAlert();
                                final String prompt = 1Ev.getPrompt();
                                if (TextUtils.isEmpty((CharSequence)s2)) {
                                    if (TextUtils.isEmpty((CharSequence)prompt)) {
                                        break Label_0150;
                                    }
                                    s2 = prompt;
                                }
                            }
                            else {
                                s2 = context.getString(2131835711);
                            }
                            n.LIZIZ((Object)s2, "");
                            s = s2;
                            break Label_0095;
                        }
                        String s2 = "";
                        continue;
                    }
                }
            }
            if (this.LIZ.LJ == 0kf.ACTIVITY) {
                FGP.LIZ().LIZ((Object)new 0kC(false, errorCode, s));
                return;
            }
            Hf4.LIZ(0cB.LJ(), s, 0L);
        }
    }
}
