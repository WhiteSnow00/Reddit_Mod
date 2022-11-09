// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.content.Context;
import android.view.View;
import android.view.LayoutInflater;
import kotlin.jvm.internal.n;
import com.bytedance.covode.number.Covode;
import android.view.ViewGroup;

public abstract class 0xS
{
    public ViewGroup LJIIIIZZ;
    public ViewGroup LJIIIZ;
    public boolean LJIIJ;
    
    static {
        Covode.recordClassIndex(10263);
    }
    
    public abstract int LIZ();
    
    public abstract void LIZ(final ViewGroup p0);
    
    public final void LIZIZ(final ViewGroup ljiiiz) {
        CTM.LIZ((Object)ljiiiz);
        final Context context = ljiiiz.getContext();
        n.LIZIZ((Object)context, "");
        if (GTi.LIZJ(context) == null) {
            return;
        }
        this.LJIIIZ = ljiiiz;
        final Context context2 = ljiiiz.getContext();
        n.LIZIZ((Object)context2, "");
        Object liz;
        if (!((liz = 0II.LIZ(LayoutInflater.from(GTi.LIZJ(context2)), this.LIZ(), ljiiiz, false)) instanceof ViewGroup)) {
            liz = null;
        }
        ljiiiz.addView((View)(this.LJIIIIZZ = (ViewGroup)liz));
        this.LIZ(this.LJIIIIZZ);
        this.LJIIJ = true;
    }
    
    public abstract String LIZLLL();
}
