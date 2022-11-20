// 
// Decompiled by Procyon v0.6.0
// 

package je;

import java.util.Iterator;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import i6.g;
import com.google.android.gms.internal.measurement.zzbl;

public final class d0 extends v
{
    public d0() {
        super.a.add(zzbl.zzd);
        super.a.add(zzbl.zzo);
        super.a.add(zzbl.zzr);
        super.a.add(zzbl.zzs);
        super.a.add(zzbl.zzy);
        super.a.add(zzbl.zzH);
        super.a.add(zzbl.zzJ);
        super.a.add(zzbl.zzK);
        super.a.add(zzbl.zzX);
        super.a.add(zzbl.zzag);
        super.a.add(zzbl.zzak);
        super.a.add(zzbl.zzal);
        super.a.add(zzbl.zzam);
    }
    
    public final o a(String c, final g g, final ArrayList list) {
        final zzbl zza = zzbl.zza;
        final int ordinal = ((Enum)f4.e(c)).ordinal();
        final int n = 0;
        final int n2 = 0;
        int n3 = 0;
        if (ordinal != 3) {
            if (ordinal != 14) {
                if (ordinal == 24) {
                    f4.i(((Enum)zzbl.zzy).name(), 1, (List)list);
                    Object o = je.o.b3;
                    for (int i = n2; i < list.size(); ++i) {
                        o = g.c((o)list.get(i));
                        if (o instanceof je.g) {
                            throw new IllegalStateException("ControlValue cannot be in an expression list");
                        }
                    }
                    return (o)o;
                }
                if (ordinal != 33) {
                    if (ordinal == 49) {
                        f4.h(((Enum)zzbl.zzX).name(), 0, (List)list);
                        return (o)o.c3;
                    }
                    if (ordinal != 58) {
                        if (ordinal == 17) {
                            e e;
                            if (list.isEmpty()) {
                                e = new e();
                            }
                            else {
                                final e e2 = new e();
                                final Iterator iterator = list.iterator();
                                int n4 = n;
                                while (true) {
                                    e = e2;
                                    if (!iterator.hasNext()) {
                                        break;
                                    }
                                    final o c2 = g.c((o)iterator.next());
                                    if (c2 instanceof je.g) {
                                        throw new IllegalStateException("Failed to evaluate array element");
                                    }
                                    e2.z(n4, c2);
                                    ++n4;
                                }
                            }
                            return (o)e;
                        }
                        if (ordinal == 18) {
                            l l;
                            if (list.isEmpty()) {
                                l = new l();
                            }
                            else {
                                if (list.size() % 2 != 0) {
                                    throw new IllegalArgumentException(String.format("CREATE_OBJECT requires an even number of arguments, found %s", list.size()));
                                }
                                final l j = new l();
                                while (true) {
                                    l = j;
                                    if (n3 >= list.size() - 1) {
                                        break;
                                    }
                                    final o c3 = g.c((o)list.get(n3));
                                    final o c4 = g.c((o)list.get(n3 + 1));
                                    if (c3 instanceof je.g || c4 instanceof je.g) {
                                        throw new IllegalStateException("Failed to evaluate map entry");
                                    }
                                    j.f(c3.c(), c4);
                                    n3 += 2;
                                }
                            }
                            return (o)l;
                        }
                        if (ordinal == 35 || ordinal == 36) {
                            final o c5 = g.c((o)b.f(zzbl.zzK, 2, list, 0));
                            final o c6 = g.c((o)list.get(1));
                            Object o2;
                            if (c5 instanceof e && f4.k(c6)) {
                                o2 = ((e)c5).m(c6.v().intValue());
                            }
                            else if (c5 instanceof k) {
                                o2 = ((k)c5).a(c6.c());
                            }
                            else {
                                if (c5 instanceof s) {
                                    if ("length".equals(c6.c())) {
                                        o2 = new h(Double.valueOf(c5.c().length()));
                                        return (o)o2;
                                    }
                                    if (f4.k(c6) && c6.v() < c5.c().length()) {
                                        o2 = new s(String.valueOf(c5.c().charAt(c6.v().intValue())));
                                        return (o)o2;
                                    }
                                }
                                o2 = o.b3;
                            }
                            return (o)o2;
                        }
                        switch (ordinal) {
                            default: {
                                this.b(c);
                                throw null;
                            }
                            case 64: {
                                f4.i(((Enum)zzbl.zzam).name(), 1, (List)list);
                                final Iterator iterator2 = list.iterator();
                                while (iterator2.hasNext()) {
                                    final o c7 = g.c((o)iterator2.next());
                                    if (!(c7 instanceof s)) {
                                        throw new IllegalArgumentException(String.format("Expected string for var name. got %s", c7.getClass().getCanonicalName()));
                                    }
                                    g.f(c7.c(), (o)o.b3);
                                }
                                return (o)o.b3;
                            }
                            case 63: {
                                f4.h(((Enum)zzbl.zzal).name(), 0, (List)list);
                                return (o)o.b3;
                            }
                            case 62: {
                                final o c8 = g.c((o)b.f(zzbl.zzak, 1, list, 0));
                                if (c8 instanceof t) {
                                    c = "undefined";
                                }
                                else if (c8 instanceof f) {
                                    c = "boolean";
                                }
                                else if (c8 instanceof h) {
                                    c = "number";
                                }
                                else if (c8 instanceof s) {
                                    c = "string";
                                }
                                else if (c8 instanceof n) {
                                    c = "function";
                                }
                                else {
                                    if (c8 instanceof p || c8 instanceof je.g) {
                                        throw new IllegalArgumentException(String.format("Unsupported value type %s in typeof", c8));
                                    }
                                    c = "object";
                                }
                                return (o)new s(c);
                            }
                        }
                    }
                    else {
                        final o c9 = g.c((o)b.f(zzbl.zzag, 3, list, 0));
                        final o c10 = g.c((o)list.get(1));
                        final o c11 = g.c((o)list.get(2));
                        if (c9 != o.b3 && c9 != o.c3) {
                            if (c9 instanceof e && c10 instanceof h) {
                                ((e)c9).z(c10.v().intValue(), c11);
                            }
                            else if (c9 instanceof k) {
                                ((k)c9).f(c10.c(), c11);
                            }
                            return c11;
                        }
                        throw new IllegalStateException(String.format("Can't set property %s of %s", c10.c(), c9.c()));
                    }
                }
                else {
                    final o c12 = g.c((o)b.f(zzbl.zzH, 1, list, 0));
                    if (c12 instanceof s) {
                        return g.e(c12.c());
                    }
                    throw new IllegalArgumentException(String.format("Expected string for get var. got %s", c12.getClass().getCanonicalName()));
                }
            }
            else {
                f4.i(((Enum)zzbl.zzo).name(), 2, (List)list);
                if (list.size() % 2 == 0) {
                    for (int k = 0; k < list.size() - 1; k += 2) {
                        final o c13 = g.c((o)list.get(k));
                        if (!(c13 instanceof s)) {
                            throw new IllegalArgumentException(String.format("Expected string for const name. got %s", c13.getClass().getCanonicalName()));
                        }
                        c = c13.c();
                        g.f(c, g.c((o)list.get(k + 1)));
                        ((Map)g.d).put(c, Boolean.TRUE);
                    }
                    return (o)o.b3;
                }
                throw new IllegalArgumentException(String.format("CONST requires an even number of arguments, found %s", list.size()));
            }
        }
        else {
            final o c14 = g.c((o)b.f(zzbl.zzd, 2, list, 0));
            if (!(c14 instanceof s)) {
                throw new IllegalArgumentException(String.format("Expected string for assign var. got %s", c14.getClass().getCanonicalName()));
            }
            if (g.h(c14.c())) {
                final o c15 = g.c((o)list.get(1));
                g.g(c14.c(), c15);
                return c15;
            }
            throw new IllegalArgumentException(String.format("Attempting to assign undefined value %s", c14.c()));
        }
    }
}
