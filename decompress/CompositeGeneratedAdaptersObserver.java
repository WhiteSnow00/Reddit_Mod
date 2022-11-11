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

public class CompositeGeneratedAdaptersObserver implements 15t
{
    public final 0C6[] LIZ;
    
    static {
        Covode.recordClassIndex(1195);
    }
    
    public CompositeGeneratedAdaptersObserver(final 0C6[] liz) {
        this.LIZ = liz;
    }
    
    @Override
    public void onStateChanged(final 0CH 0ch, final 0CC.a a) {
        final 0CO 0co = new 0CO();
        final 0C6[] liz = this.LIZ;
        final int length = liz.length;
        final int n = 0;
        for (int i = 0; i < length; ++i) {
            liz[i].LIZ(0ch, a, false, 0co);
        }
        final 0C6[] liz2 = this.LIZ;
        for (int length2 = liz2.length, j = n; j < length2; ++j) {
            liz2[j].LIZ(0ch, a, true, 0co);
        }
    }
}
