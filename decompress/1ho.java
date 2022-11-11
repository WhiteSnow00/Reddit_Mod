// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.Iterator;
import android.text.TextUtils;
import java.util.Map;
import com.bytedance.covode.number.Covode;

public final class 1ho extends 1Dv
{
    static {
        Covode.recordClassIndex(4548);
    }
    
    public 1ho(final 1hm 1hm) {
        super(1hm);
    }
    
    @Override
    public final 0Sp LIZ(final 0Sp 0Sp) {
        String liz = 0Sp.LIZIZ;
        final Map<String, String> ljiijji = 0Sp.LJ.LJIIJJI;
        if (ljiijji == null) {
            super.LIZ(0Sp);
            return 0Sp;
        }
        try {
            for (final Map.Entry<CharSequence, V> entry : ljiijji.entrySet()) {
                if (liz.contains(entry.getKey())) {
                    final String liziz = 0Ry.LIZIZ((String)entry.getValue());
                    if (TextUtils.isEmpty((CharSequence)liziz)) {
                        continue;
                    }
                    liz = liz.replace(entry.getKey(), liziz);
                }
            }
            final 0Sp.a liz2 = 0Sp.LIZ;
            liz2.LIZ = liz;
            return liz2.LIZ();
        }
        finally {
            super.LIZ(0Sp);
            return 0Sp;
        }
    }
}
