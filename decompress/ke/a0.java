// 
// Decompiled by Procyon v0.6.0
// 

package ke;

import a2.b;
import java.util.List;
import java.util.ArrayList;
import x6.h;
import com.google.android.gms.internal.measurement.zzbl;

public final class a0 extends v
{
    public final /* synthetic */ int b;
    
    public a0(final int b) {
        this.b = b;
        if (b != 1) {
            super.a.add(zzbl.zzb);
            super.a.add(zzbl.zzV);
            super.a.add(zzbl.zzY);
            return;
        }
    }
    
    @Override
    public final o a(final String s, final h h, final ArrayList list) {
        switch (this.b) {
            default: {
                if (s == null || s.isEmpty() || !h.g(s)) {
                    throw new IllegalArgumentException(String.format("Command not found: %s", s));
                }
                final o d = h.d(s);
                if (d instanceof i) {
                    return ((i)d).h(h, (List)list);
                }
                throw new IllegalArgumentException(String.format("Function %s is not defined", s));
            }
            case 0: {
                final zzbl zza = zzbl.zza;
                final int ordinal = ((Enum)f4.e(s)).ordinal();
                Object o;
                if (ordinal != 1) {
                    if (ordinal != 47) {
                        if (ordinal != 50) {
                            this.b(s);
                            throw null;
                        }
                        o = h.b((o)a2.b.e(zzbl.zzY, 2, list, 0));
                        if (!((o)o).d()) {
                            o = h.b(list.get(1));
                        }
                    }
                    else {
                        o = new f(Boolean.valueOf(h.b((o)a2.b.e(zzbl.zzV, 1, list, 0)).d() ^ true));
                    }
                }
                else {
                    o = h.b((o)a2.b.e(zzbl.zzb, 2, list, 0));
                    if (((o)o).d()) {
                        o = h.b(list.get(1));
                    }
                }
                return (o)o;
            }
        }
    }
}
