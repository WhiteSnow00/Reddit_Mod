// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.als.dsl;

import kotlin.jvm.internal.n;
import X.CTM;
import X.0QS;
import com.bytedance.covode.number.Covode;
import X.WBR;
import X.WBS;
import X.0Bq;

public final class OCAdapterViewModel extends 0Bq
{
    public final WBS LIZ;
    public WBR LIZIZ;
    
    static {
        Covode.recordClassIndex(4288);
    }
    
    public OCAdapterViewModel(final WBR wbr, final 0QS 0qs) {
        CTM.LIZ((Object)0qs);
        WBS liz;
        if (wbr == null) {
            liz = new WBS((WBR)null, 0qs.LIZ);
        }
        else {
            liz = new WBS(wbr, 0qs.LIZ);
        }
        this.LIZ = liz;
    }
    
    public final WBR LIZ() {
        final WBR liz = this.LIZ.LIZ();
        n.LIZ((Object)(this.LIZIZ = liz), "");
        return liz;
    }
    
    public final WBR LIZIZ() {
        WBR wbr;
        if ((wbr = this.LIZIZ) == null) {
            wbr = this.LIZ();
        }
        return wbr;
    }
}
