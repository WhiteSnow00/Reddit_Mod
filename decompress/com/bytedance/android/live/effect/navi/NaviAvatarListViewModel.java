// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.effect.navi;

import com.bytedance.covode.number.Covode;
import X.1LC;
import java.util.List;
import X.15z;
import X.0hn;
import X.0Bq;

public final class NaviAvatarListViewModel extends 0Bq
{
    public final 0hn LIZ;
    public final 15z<List<1LC>> LIZIZ;
    public final 15z<Integer> LIZJ;
    public final 15z<Integer> LIZLLL;
    
    static {
        Covode.recordClassIndex(6487);
    }
    
    public NaviAvatarListViewModel() {
        this.LIZ = new 0hn();
        this.LIZIZ = new 15z<List<1LC>>();
        this.LIZJ = new 15z<Integer>();
        this.LIZLLL = new 15z<Integer>();
    }
    
    public final void LIZ(final Integer n) {
        this.LIZJ.postValue(n);
    }
}
