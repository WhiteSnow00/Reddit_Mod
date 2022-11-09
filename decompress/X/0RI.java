// 
// Decompiled by Procyon v0.6.0
// 

package X;

import androidx.fragment.app.Fragment;
import android.app.Activity;
import java.lang.ref.WeakReference;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicLong;

public final class 0RI
{
    public static final 0RI LIZ;
    public static final AtomicLong LIZIZ;
    
    static {
        Covode.recordClassIndex(4402);
        LIZ = new 0RI();
        LIZIZ = new AtomicLong(0L);
    }
    
    public final 0RH LIZ(final 0R4 0r4) {
        CTM.LIZ((Object)0r4);
        final 0RH 0rh = new 0RH(0r4.LIZ, (int)0RI.LIZIZ.incrementAndGet());
        0rh.LIZ(0r4.LIZIZ);
        final StringBuilder sb = new StringBuilder();
        sb.append((Object)0RG.LIZIZ);
        sb.append('.');
        sb.append(0r4.LIZIZ);
        sb.append(".c0.d0");
        0rh.LIZIZ(sb.toString());
        0rh.LJIJI = 0r4.LJ;
        final 0R4.b lizj = 0r4.LIZJ;
        final 0R4.b activity = 0R4.b.Activity;
        final String s = null;
        String simpleName = null;
        if (lizj == activity) {
            final WeakReference<Activity> lj = 0r4.LJ;
            if (lj != null) {
                final Object value = lj.get();
                if (value != null) {
                    final Class<?> class1 = value.getClass();
                    if (class1 != null) {
                        simpleName = class1.getSimpleName();
                    }
                }
            }
            0rh.LJII = simpleName;
            0rh.LJIJ = true;
        }
        else if (0r4.LIZJ == 0R4.b.Fragment) {
            final WeakReference<Fragment> lizlll = 0r4.LIZLLL;
            String simpleName2;
            if (lizlll == null) {
                simpleName2 = s;
            }
            else {
                final Object value2 = lizlll.get();
                if (value2 == null) {
                    simpleName2 = s;
                }
                else {
                    final Class<?> class2 = value2.getClass();
                    if (class2 == null) {
                        simpleName2 = s;
                    }
                    else {
                        simpleName2 = class2.getSimpleName();
                    }
                }
            }
            0rh.LJII = simpleName2;
            0rh.LJIJJ = true;
            0rh.LJIJJLI = 0r4.LIZLLL;
        }
        if (0r4.LJFF) {
            0rh.LJJ = true;
            0rh.LIZJ(0r4.LJI);
        }
        else {
            0rh.LIZJ(0r4.LIZ);
        }
        return 0rh;
    }
}
