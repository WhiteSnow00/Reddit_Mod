// 
// Decompiled by Procyon v0.6.0
// 

package ke;

import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;
import com.google.android.gms.internal.measurement.zzlf;

public final class v6
{
    public static final void a(final Object o, final Object o2) {
        final zzlf zzlf = (zzlf)o;
        final u6 u6 = (u6)o2;
        if (!((AbstractMap)zzlf).isEmpty()) {
            final Iterator iterator = zzlf.entrySet().iterator();
            if (iterator.hasNext()) {
                final Map.Entry entry = (Map.Entry)iterator.next();
                entry.getKey();
                entry.getValue();
                throw null;
            }
        }
    }
    
    public static final zzlf b(final Object o, final Object o2) {
        final zzlf zzlf = (zzlf)o;
        final zzlf zzlf2 = (zzlf)o2;
        zzlf zzb = zzlf;
        if (!((AbstractMap)zzlf2).isEmpty()) {
            zzb = zzlf;
            if (!zzlf.zze()) {
                zzb = zzlf.zzb();
            }
            zzb.zzd(zzlf2);
        }
        return zzb;
    }
}
