// 
// Decompiled by Procyon v0.6.0
// 

package ie;

import a81.e;
import java.util.List;
import java.util.ArrayList;
import k3.a;
import com.google.android.gms.internal.measurement.zzbl;

public final class y extends w
{
    public y() {
        super.a.add(zzbl.zzc);
        super.a.add(zzbl.zzl);
        super.a.add(zzbl.zzm);
        super.a.add(zzbl.zzn);
        super.a.add(zzbl.zzt);
        super.a.add(zzbl.zzp);
        super.a.add(zzbl.zzu);
        super.a.add(zzbl.zzz);
        super.a.add(zzbl.zzP);
        super.a.add(zzbl.zzac);
        super.a.add(zzbl.zzaf);
        super.a.add(zzbl.zzai);
        super.a.add(zzbl.zzaj);
    }
    
    public static o c(final a a, final ArrayList list) {
        h4.i(((Enum)zzbl.zzz).name(), 2, (List)list);
        final p d = a.d((p)list.get(0));
        final p d2 = a.d((p)list.get(1));
        if (d2 instanceof f) {
            final ArrayList q = ((f)d2).q();
            List subList = new ArrayList();
            if (list.size() > 2) {
                subList = list.subList(2, list.size());
            }
            return new o(d.c(), q, (List)subList, a);
        }
        throw new IllegalArgumentException(String.format("FN requires an ArrayValue of parameter names found %s", ((f)d2).getClass().getCanonicalName()));
    }
    
    public final p a(String f, final a a, final ArrayList list) {
        final zzbl zza = zzbl.zza;
        final int ordinal = ((Enum)h4.e(f)).ordinal();
        if (ordinal != 2) {
            if (ordinal == 15) {
                h4.h(((Enum)zzbl.zzm).name(), 0, (List)list);
                return (p)p.N3;
            }
            if (ordinal == 25) {
                return (p)c(a, list);
            }
            final f f2 = null;
            if (ordinal != 41) {
                if (ordinal == 54) {
                    return (p)new f((List)list);
                }
                if (ordinal != 57) {
                    if (ordinal != 19) {
                        if (ordinal == 20) {
                            h4.i(((Enum)zzbl.zzu).name(), 2, (List)list);
                            final o c = c(a, list);
                            f = ((j)c).f;
                            if (f == null) {
                                a.h("", (p)c);
                            }
                            else {
                                a.h(f, (p)c);
                            }
                            return (p)c;
                        }
                        if (ordinal != 60) {
                            if (ordinal == 61) {
                                p p3;
                                if (a.d((p)e.l(zzbl.zzaj, 3, list, 0)).d()) {
                                    p3 = a.d((p)list.get(1));
                                }
                                else {
                                    p3 = a.d((p)list.get(2));
                                }
                                return p3;
                            }
                            switch (ordinal) {
                                default: {
                                    this.b(f);
                                    throw null;
                                }
                                case 12: {
                                    h4.h(((Enum)zzbl.zzm).name(), 0, (List)list);
                                    return (p)p.O3;
                                }
                                case 11: {
                                    return a.c().e(new f((List)list));
                                }
                                case 13: {
                                    break;
                                }
                            }
                        }
                        else {
                            final p d = a.d((p)e.l(zzbl.zzai, 3, list, 0));
                            final p d2 = a.d((p)list.get(1));
                            final p d3 = a.d((p)list.get(2));
                            if (!(d2 instanceof f)) {
                                throw new IllegalArgumentException("Malformed SWITCH statement, cases are not a list");
                            }
                            if (d3 instanceof f) {
                                final f f3 = (f)d2;
                                final f f4 = (f)d3;
                                int n;
                                for (int i = n = 0; i < f3.m(); ++i) {
                                    if (n == 0 && !d.equals(a.d(f3.n(i)))) {
                                        n = 0;
                                    }
                                    else {
                                        final p d4 = a.d(f4.n(i));
                                        if (d4 instanceof h) {
                                            final p p4 = d4;
                                            if (((h)d4).g.equals("break")) {
                                                return (p)p.L3;
                                            }
                                            return p4;
                                        }
                                        else {
                                            n = 1;
                                        }
                                    }
                                }
                                if (f3.m() + 1 == f4.m()) {
                                    final p d5 = a.d(f4.n(f3.m()));
                                    if (d5 instanceof h) {
                                        final String g = ((h)d5).g;
                                        p p4 = d5;
                                        if (g.equals("return")) {
                                            return p4;
                                        }
                                        p4 = d5;
                                        if (g.equals("continue")) {
                                            return p4;
                                        }
                                    }
                                }
                                return (p)p.L3;
                            }
                            throw new IllegalArgumentException("Malformed SWITCH statement, case statements are not a list");
                        }
                    }
                    Object o;
                    if (list.isEmpty()) {
                        o = p.L3;
                    }
                    else {
                        final p d6 = a.d((p)list.get(0));
                        if (d6 instanceof f) {
                            o = a.e((f)d6);
                        }
                        else {
                            o = p.L3;
                        }
                    }
                    return (p)o;
                }
                h p5;
                if (list.isEmpty()) {
                    p5 = p.P3;
                }
                else {
                    p5 = new h("return", a.d((p)e.l(zzbl.zzaf, 1, list, 0)));
                }
                return (p)p5;
            }
            else {
                h4.i(((Enum)zzbl.zzP).name(), 2, (List)list);
                final p d7 = a.d((p)list.get(0));
                final p d8 = a.d((p)list.get(1));
                Object d9 = f2;
                if (list.size() > 2) {
                    d9 = a.d((p)list.get(2));
                }
                final u l3 = p.L3;
                Object o2;
                if (d7.d()) {
                    o2 = a.e((f)d8);
                }
                else if (d9 != null) {
                    o2 = a.e((f)d9);
                }
                else {
                    o2 = l3;
                }
                if (o2 instanceof h) {
                    return (p)o2;
                }
                return (p)l3;
            }
        }
        else {
            final p d10 = a.d((p)e.l(zzbl.zzc, 3, list, 0));
            final String c2 = a.d((p)list.get(1)).c();
            final p d11 = a.d((p)list.get(2));
            if (!(d11 instanceof f)) {
                throw new IllegalArgumentException(String.format("Function arguments for Apply are not a list found %s", ((f)d11).getClass().getCanonicalName()));
            }
            if (!c2.isEmpty()) {
                return d10.i(c2, a, ((f)d11).q());
            }
            throw new IllegalArgumentException("Function name for apply is undefined");
        }
    }
}
