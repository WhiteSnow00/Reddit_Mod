// 
// Decompiled by Procyon v0.6.0
// 

package androidx.lifecycle;

import X.0CO;
import X.0CC;
import X.0CH;
import com.bytedance.covode.number.Covode;
import X.0C6;
import X.15t;

public class SingleGeneratedAdapterObserver implements 15t
{
    public final 0C6 LIZ;
    
    static {
        Covode.recordClassIndex(1215);
    }
    
    public SingleGeneratedAdapterObserver(final 0C6 liz) {
        this.LIZ = liz;
    }
    
    @Override
    public void onStateChanged(final 0CH 0ch, final 0CC.a a) {
        this.LIZ.LIZ(0ch, a, false, null);
        this.LIZ.LIZ(0ch, a, true, null);
    }
}
