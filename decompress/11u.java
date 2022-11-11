// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.ss.com.vboost.VboostListener;
import java.lang.ref.WeakReference;
import org.json.JSONObject;
import com.bytedance.covode.number.Covode;

public final class 11u implements a
{
    public final /* synthetic */ 00j LIZ;
    
    static {
        Covode.recordClassIndex(69);
    }
    
    public 11u(final 00j liz) {
        this.LIZ = liz;
    }
    
    @Override
    public final void LIZ(final String s, final JSONObject jsonObject, final String s2) {
        if (this.LIZ.LJIIIIZZ.LIZIZ() != null && this.LIZ.LJIIIIZZ.LIZIZ().get() != null) {
            ((VboostListener.b)this.LIZ.LJIIIIZZ.LIZIZ().get()).LIZ(s, jsonObject, s2);
        }
    }
}
