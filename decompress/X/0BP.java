// 
// Decompiled by Procyon v0.6.0
// 

package X;

import androidx.fragment.app.Fragment;
import java.lang.ref.WeakReference;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.ConcurrentHashMap;

public final class 0Bp
{
    public static final ConcurrentHashMap<0Bu, 15k> LIZ;
    
    static {
        Covode.recordClassIndex(1239);
        LIZ = new ConcurrentHashMap<0Bu, 15k>();
    }
    
    public static final void LIZ(final 0Bq 0Bq, final 0Bu 0Bu) {
        CTM.LIZ((Object)0Bq, (Object)0Bu);
        final ConcurrentHashMap<0Bu, 15k> liz = 0Bp.LIZ;
        0Bq.setTagIfAbsent("v_scope_vm_key", liz.get(0Bu));
        liz.remove(0Bu);
    }
    
    public static final void LIZ(final 0Bu 0Bu, final 1nL 1nL) {
        CTM.LIZ((Object)0Bu, (Object)1nL);
        0Bp.LIZ.put(0Bu, new 15k(0Bu, new WeakReference((T)1nL), null, 4));
    }
    
    public static final void LIZ(final 0Bu 0Bu, final Fragment fragment) {
        CTM.LIZ((Object)0Bu, (Object)fragment);
        final 15k 15k = new 15k(0Bu, null, new WeakReference((T)fragment), 2);
        if (fragment.getActivity() != null) {
            0Bp.LIZ.put(0Bu, 15k);
        }
    }
}
