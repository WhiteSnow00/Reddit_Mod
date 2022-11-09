// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.Iterator;
import android.util.SparseBooleanArray;
import java.util.HashSet;
import android.content.Context;
import android.ss.com.vboost.CapabilityType;
import com.bytedance.covode.number.Covode;
import android.util.SparseArray;

public class 006
{
    public static 00x LIZ;
    public static volatile long LIZIZ;
    public static SparseArray<00a> LIZJ;
    
    static {
        Covode.recordClassIndex(11);
        006.LIZIZ = 0L;
        006.LIZJ = (SparseArray<00a>)new SparseArray();
        006.LIZ = null;
    }
    
    public static int LIZ(final 00n 00n, final int n) {
        final 00a 00a = new 00a(CapabilityType.PRESET_SCENE, 00n);
        00a.LIZJ = n;
        00j.a.LIZ.LIZ(00a);
        return 1;
    }
    
    public static int LIZ(final 00n 00n, final 00z 00z) {
        if (00z == 00z.END) {
            final 00a 00a = (00a)006.LIZJ.get(00n.getId());
            if (00a == null) {
                00n.getDesc();
                00s.LIZ(5);
                return 0;
            }
            00a.LJII = true;
            00j.a.LIZ.LIZ(00a);
            006.LIZJ.remove(00n.getId());
        }
        else {
            final 00a 00a2 = new 00a(CapabilityType.PRESET_SCENE, 00n);
            00a2.LJII = false;
            if (00j.a.LIZ.LIZ(00a2) != null) {
                006.LIZJ.put(00n.getId(), (Object)00a2);
            }
        }
        return 1;
    }
    
    public static void LIZ(final Context context) {
        if (00j.LJII.LIZIZ() && !00j.LJI.LIZIZ()) {
            00s.LIZ(4);
            00O.LIZ.LIZ(context);
            00O.LIZ();
            00j.LJI.LIZ(true);
        }
    }
    
    public static void LIZ(final HashSet<Integer> set) {
        final 00j liz = 00j.a.LIZ;
        for (final Integer n : set) {
            synchronized (liz.LJFF) {
                liz.LJFF.LIZIZ().append((int)n, true);
                continue;
            }
            break;
        }
    }
}
