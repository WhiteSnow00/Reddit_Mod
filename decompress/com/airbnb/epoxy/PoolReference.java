// 
// Decompiled by Procyon v0.6.0
// 

package com.airbnb.epoxy;

import X.0CH;
import X.0CC;
import X.0Bg;
import X.0Im;
import X.CTM;
import com.bytedance.covode.number.Covode;
import X.0IY;
import android.content.Context;
import java.lang.ref.WeakReference;
import androidx.recyclerview.widget.RecyclerView;
import X.6mZ;

public final class PoolReference implements 6mZ
{
    public final RecyclerView.RecycledViewPool LIZ;
    public final WeakReference<Context> LIZIZ;
    public final 0IY LIZJ;
    
    static {
        Covode.recordClassIndex(2117);
    }
    
    public PoolReference(final Context context, final RecyclerView.RecycledViewPool liz, final 0IY lizj) {
        CTM.LIZ((Object)context, (Object)liz, (Object)lizj);
        this.LIZ = liz;
        this.LIZJ = lizj;
        this.LIZIZ = new WeakReference<Context>(context);
    }
    
    public final Context LIZ() {
        return this.LIZIZ.get();
    }
    
    @0Bg(LIZ = 0CC.a.ON_DESTROY)
    public final void onContextDestroyed() {
        final 0IY lizj = this.LIZJ;
        CTM.LIZ((Object)this);
        if (0Im.LIZ(this.LIZ())) {
            this.LIZ.clear();
            lizj.LIZ.remove(this);
        }
    }
    
    public final void onStateChanged(final 0CH 0ch, final 0CC.a a) {
        if (a == 0CC.a.ON_DESTROY) {
            this.onContextDestroyed();
        }
    }
}
