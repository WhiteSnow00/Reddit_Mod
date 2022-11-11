// 
// Decompiled by Procyon v0.6.0
// 

package ie;

import java.util.List;
import a81.e;
import java.util.ArrayList;
import k3.a;
import com.google.android.gms.internal.measurement.zzbl;

public final class v extends w
{
    public final /* synthetic */ int b;
    
    public v(final int b) {
        this.b = b;
        if (b != 1) {
            super.a.add(zzbl.zze);
            super.a.add(zzbl.zzf);
            super.a.add(zzbl.zzg);
            super.a.add(zzbl.zzh);
            super.a.add(zzbl.zzi);
            super.a.add(zzbl.zzj);
            super.a.add(zzbl.zzk);
            return;
        }
        super.a.add(zzbl.zza);
        super.a.add(zzbl.zzv);
        super.a.add(zzbl.zzS);
        super.a.add(zzbl.zzT);
        super.a.add(zzbl.zzU);
        super.a.add(zzbl.zzaa);
        super.a.add(zzbl.zzab);
        super.a.add(zzbl.zzad);
        super.a.add(zzbl.zzae);
        super.a.add(zzbl.zzah);
    }
    
    public final p a(final String s, final a a, final ArrayList list) {
        switch (this.b) {
            default: {
                final zzbl zza = zzbl.zza;
                final int ordinal = ((Enum)h4.e(s)).ordinal();
                Object o;
                if (ordinal != 0) {
                    if (ordinal != 21) {
                        if (ordinal != 59) {
                            if (ordinal != 52 && ordinal != 53) {
                                if (ordinal != 55 && ordinal != 56) {
                                    switch (ordinal) {
                                        default: {
                                            this.b(s);
                                            throw null;
                                        }
                                        case 46: {
                                            o = new i(Double.valueOf(-a.d((p)e.l(zzbl.zzU, 1, list, 0)).u()));
                                            break;
                                        }
                                        case 45: {
                                            o = new i(Double.valueOf(a.d((p)e.l(zzbl.zzT, 2, list, 0)).u() * a.d((p)list.get(1)).u()));
                                            break;
                                        }
                                        case 44: {
                                            o = new i(Double.valueOf(a.d((p)e.l(zzbl.zzS, 2, list, 0)).u() % a.d((p)list.get(1)).u()));
                                            break;
                                        }
                                    }
                                }
                                else {
                                    h4.h(s, 1, (List)list);
                                    o = a.d((p)list.get(0));
                                }
                            }
                            else {
                                h4.h(s, 2, (List)list);
                                o = a.d((p)list.get(0));
                                a.d((p)list.get(1));
                            }
                        }
                        else {
                            o = new i(Double.valueOf(new i(Double.valueOf(-a.d((p)list.get(1)).u())).f + a.d((p)e.l(zzbl.zzah, 2, list, 0)).u()));
                        }
                    }
                    else {
                        o = new i(Double.valueOf(a.d((p)e.l(zzbl.zzv, 2, list, 0)).u() / a.d((p)list.get(1)).u()));
                    }
                }
                else {
                    final p d = a.d((p)e.l(zzbl.zza, 2, list, 0));
                    final p d2 = a.d((p)list.get(1));
                    if (!(d instanceof l) && !(d instanceof t) && !(d2 instanceof l) && !(d2 instanceof t)) {
                        o = new i(Double.valueOf(d2.u() + d.u()));
                    }
                    else {
                        o = new t(String.valueOf(d.c()).concat(String.valueOf(d2.c())));
                    }
                }
                return (p)o;
            }
            case 0: {
                final zzbl zza2 = zzbl.zza;
                i i = null;
                switch (((Enum)h4.e(s)).ordinal()) {
                    default: {
                        this.b(s);
                        throw null;
                    }
                    case 10: {
                        i = new i(Double.valueOf(h4.b((double)a.d((p)e.l(zzbl.zzk, 2, list, 0)).u()) ^ h4.b((double)a.d((p)list.get(1)).u())));
                        break;
                    }
                    case 9: {
                        i = new i(Double.valueOf(h4.d((double)a.d((p)e.l(zzbl.zzj, 2, list, 0)).u()) >>> (int)(h4.d((double)a.d((p)list.get(1)).u()) & 0x1FL)));
                        break;
                    }
                    case 8: {
                        i = new i(Double.valueOf(h4.b((double)a.d((p)e.l(zzbl.zzi, 2, list, 0)).u()) >> (int)(h4.d((double)a.d((p)list.get(1)).u()) & 0x1FL)));
                        break;
                    }
                    case 7: {
                        i = new i(Double.valueOf(h4.b((double)a.d((p)e.l(zzbl.zzh, 2, list, 0)).u()) | h4.b((double)a.d((p)list.get(1)).u())));
                        break;
                    }
                    case 6: {
                        i = new i(Double.valueOf(~h4.b((double)a.d((p)e.l(zzbl.zzg, 1, list, 0)).u())));
                        break;
                    }
                    case 5: {
                        i = new i(Double.valueOf(h4.b((double)a.d((p)e.l(zzbl.zzf, 2, list, 0)).u()) << (int)(h4.d((double)a.d((p)list.get(1)).u()) & 0x1FL)));
                        break;
                    }
                    case 4: {
                        i = new i(Double.valueOf(h4.b((double)a.d((p)e.l(zzbl.zze, 2, list, 0)).u()) & h4.b((double)a.d((p)list.get(1)).u())));
                        break;
                    }
                }
                return (p)i;
            }
        }
    }
}
