// 
// Decompiled by Procyon v0.6.0
// 

package androidx.lifecycle;

import X.0CC;
import X.0CH;
import com.bytedance.covode.number.Covode;
import X.15t;

public class FullLifecycleObserverAdapter implements 15t
{
    public final 15t LIZ;
    
    static {
        Covode.recordClassIndex(1196);
    }
    
    public FullLifecycleObserverAdapter(final 15t liz) {
        this.LIZ = liz;
    }
    
    @Override
    public void onStateChanged(final 0CH 0ch, final 0CC.a a) {
        if (FullLifecycleObserverAdapter$1.LIZ[a.ordinal()] != 7) {
            final 15t liz = this.LIZ;
            if (liz != null) {
                liz.onStateChanged(0ch, a);
            }
            return;
        }
        throw new IllegalArgumentException("ON_ANY must not been send by anybody");
    }
}
