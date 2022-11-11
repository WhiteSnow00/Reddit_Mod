// 
// Decompiled by Procyon v0.6.0
// 

package androidx.lifecycle;

import java.util.List;
import X.0CC;
import X.0CH;
import com.bytedance.covode.number.Covode;
import X.0Be;
import X.15t;

public class ReflectiveGenericLifecycleObserver implements 15t
{
    public final Object LIZ;
    public final 0Be.a LIZIZ;
    
    static {
        Covode.recordClassIndex(1209);
    }
    
    public ReflectiveGenericLifecycleObserver(final Object liz) {
        this.LIZ = liz;
        this.LIZIZ = 0Be.LIZ.LIZIZ(liz.getClass());
    }
    
    @Override
    public void onStateChanged(final 0CH 0ch, final 0CC.a a) {
        final 0Be.a liziz = this.LIZIZ;
        final Object liz = this.LIZ;
        0Be.a.LIZ(liziz.LIZ.get(a), 0ch, a, liz);
        0Be.a.LIZ(liziz.LIZ.get(0CC.a.ON_ANY), 0ch, a, liz);
    }
}
