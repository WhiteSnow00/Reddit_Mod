// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.als.dsl;

import kotlin.jvm.internal.n;
import X.CTM;
import com.bytedance.covode.number.Covode;
import X.1nL;
import java.lang.ref.WeakReference;
import com.bytedance.als.AlsLogicContainer;
import X.0QS;
import X.0Bq;

public final class AlsVMContainer extends 0Bq
{
    public 0QS LIZ;
    public AlsLogicContainer LIZIZ;
    public OCAdapterViewModel LIZJ;
    public WeakReference<1nL> LIZLLL;
    
    static {
        Covode.recordClassIndex(4287);
    }
    
    public AlsVMContainer() {
        this.LIZ = new 0QS((byte)0);
    }
    
    private final void LIZ() {
        this.LIZIZ = null;
        this.LIZJ = null;
    }
    
    public final void LIZ(final 0QS liz) {
        CTM.LIZ((Object)liz);
        this.LIZ = liz;
    }
    
    public final void LIZ(final 1nL 1nL) {
        CTM.LIZ((Object)1nL);
        final WeakReference<1nL> lizlll = this.LIZLLL;
        Object value;
        if (lizlll != null) {
            value = lizlll.get();
        }
        else {
            value = null;
        }
        if (n.LIZ(value, (Object)1nL) ^ true) {
            this.LIZLLL = new WeakReference<1nL>(1nL);
            this.LIZ();
        }
    }
}
