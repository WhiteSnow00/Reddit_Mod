// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;
import androidx.fragment.app.Fragment;
import java.lang.ref.WeakReference;

public final class 15k extends 9Mp
{
    public final 0Bu LIZ;
    public final WeakReference<1nL> LIZIZ;
    public final WeakReference<Fragment> LIZJ;
    
    static {
        Covode.recordClassIndex(1234);
    }
    
    public 15k(final 0Bu liz, final WeakReference<1nL> liziz, final WeakReference<Fragment> lizj) {
        CTM.LIZ((Object)liz);
        this.LIZ = liz;
        this.LIZIZ = liziz;
        this.LIZJ = lizj;
    }
    
    public final Object[] getObjects() {
        return new Object[] { this.LIZ, this.LIZIZ, this.LIZJ };
    }
}
