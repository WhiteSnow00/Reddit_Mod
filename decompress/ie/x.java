// 
// Decompiled by Procyon v0.6.0
// 

package ie;

import java.util.Iterator;
import java.util.Map;
import a81.e;
import java.util.List;
import java.util.ArrayList;
import k3.a;
import com.google.android.gms.internal.measurement.zzbl;

public final class x extends w
{
    public final /* synthetic */ int b;
    
    public x(final int b) {
        this.b = b;
        if (b != 1) {
            super.a.add(zzbl.zzx);
            super.a.add(zzbl.zzL);
            super.a.add(zzbl.zzM);
            super.a.add(zzbl.zzN);
            super.a.add(zzbl.zzO);
            super.a.add(zzbl.zzQ);
            super.a.add(zzbl.zzR);
            super.a.add(zzbl.zzW);
            return;
        }
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
    
    public static boolean c(final p p2, final p p3) {
        if (p2.getClass().equals(p3.getClass())) {
            if (p2 instanceof u || p2 instanceof n) {
                return true;
            }
            if (p2 instanceof i) {
                if (!Double.isNaN(p2.u())) {
                    if (!Double.isNaN(p3.u())) {
                        if (p2.u() == (double)p3.u()) {
                            return true;
                        }
                    }
                }
                return false;
            }
            if (p2 instanceof t) {
                return p2.c().equals(p3.c());
            }
            if (p2 instanceof g) {
                return p2.d().equals(p3.d());
            }
            return p2 == p3;
        }
        else {
            if ((p2 instanceof u || p2 instanceof n) && (p3 instanceof u || p3 instanceof n)) {
                return true;
            }
            final boolean b = p2 instanceof i;
            if (b && p3 instanceof t) {
                return c(p2, (p)new i(p3.u()));
            }
            final boolean b2 = p2 instanceof t;
            if (b2 && p3 instanceof i) {
                return c((p)new i(p2.u()), p3);
            }
            if (p2 instanceof g) {
                return c((p)new i(p2.u()), p3);
            }
            if (p3 instanceof g) {
                return c(p2, (p)new i(p3.u()));
            }
            if ((!b2 && !b) || !(p3 instanceof l)) {
                return p2 instanceof l && (p3 instanceof t || p3 instanceof i) && c((p)new t(p2.c()), p3);
            }
            return c(p2, (p)new t(p3.c()));
        }
    }
    
    public static boolean d(p o, final p p2) {
        Object o2 = o;
        if (o instanceof l) {
            o2 = new t(((p)o).c());
        }
        o = p2;
        if (p2 instanceof l) {
            o = new t(p2.c());
        }
        if (o2 instanceof t && o instanceof t) {
            return ((p)o2).c().compareTo(((p)o).c()) < 0;
        }
        final double doubleValue = ((p)o2).u();
        final double doubleValue2 = ((p)o).u();
        if (!Double.isNaN(doubleValue)) {
            if (!Double.isNaN(doubleValue2)) {
                final double n = dcmpl(doubleValue, 0.0);
                if ((n == 0 && doubleValue2 == 0.0) || (n == 0 && doubleValue2 == 0.0)) {
                    return false;
                }
                if (Double.compare(doubleValue, doubleValue2) < 0) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public static boolean e(p o, final p p2) {
        Object o2 = o;
        if (o instanceof l) {
            o2 = new t(((p)o).c());
        }
        o = p2;
        if (p2 instanceof l) {
            o = new t(p2.c());
        }
        return ((o2 instanceof t && o instanceof t) || (!Double.isNaN(((p)o2).u()) && !Double.isNaN(((p)o).u()))) && !d((p)o, (p)o2);
    }
    
    public final p a(String c, final a a, final ArrayList list) {
        final int b = this.b;
        final int n = 0;
        final int n2 = 0;
        int n3 = 0;
        switch (b) {
            default: {
                final zzbl zza = zzbl.zza;
                final int ordinal = ((Enum)h4.e(c)).ordinal();
                Object o;
                if (ordinal != 3) {
                    if (ordinal != 14) {
                        if (ordinal != 24) {
                            if (ordinal != 33) {
                                if (ordinal != 49) {
                                    if (ordinal != 58) {
                                        if (ordinal != 17) {
                                            if (ordinal != 18) {
                                                if (ordinal != 35 && ordinal != 36) {
                                                    switch (ordinal) {
                                                        default: {
                                                            this.b(c);
                                                            throw null;
                                                        }
                                                        case 64: {
                                                            h4.i(((Enum)zzbl.zzam).name(), 1, (List)list);
                                                            final Iterator iterator = list.iterator();
                                                            while (iterator.hasNext()) {
                                                                final p d = a.d((p)iterator.next());
                                                                if (!(d instanceof t)) {
                                                                    throw new IllegalArgumentException(String.format("Expected string for var name. got %s", d.getClass().getCanonicalName()));
                                                                }
                                                                a.g(d.c(), (p)p.L3);
                                                            }
                                                            o = p.L3;
                                                            break;
                                                        }
                                                        case 63: {
                                                            h4.h(((Enum)zzbl.zzal).name(), 0, (List)list);
                                                            o = p.L3;
                                                            break;
                                                        }
                                                        case 62: {
                                                            final p d2 = a.d((p)e.l(zzbl.zzak, 1, list, 0));
                                                            if (d2 instanceof u) {
                                                                c = "undefined";
                                                            }
                                                            else if (d2 instanceof g) {
                                                                c = "boolean";
                                                            }
                                                            else if (d2 instanceof i) {
                                                                c = "number";
                                                            }
                                                            else if (d2 instanceof t) {
                                                                c = "string";
                                                            }
                                                            else if (d2 instanceof o) {
                                                                c = "function";
                                                            }
                                                            else {
                                                                if (d2 instanceof q || d2 instanceof h) {
                                                                    throw new IllegalArgumentException(String.format("Unsupported value type %s in typeof", d2));
                                                                }
                                                                c = "object";
                                                            }
                                                            o = new t(c);
                                                            break;
                                                        }
                                                    }
                                                }
                                                else {
                                                    final p d3 = a.d((p)e.l(zzbl.zzK, 2, list, 0));
                                                    final p d4 = a.d((p)list.get(1));
                                                    if (d3 instanceof f && h4.k(d4)) {
                                                        o = ((f)d3).n(d4.u().intValue());
                                                    }
                                                    else if (d3 instanceof l) {
                                                        o = ((l)d3).k(d4.c());
                                                    }
                                                    else {
                                                        if (d3 instanceof t) {
                                                            if ("length".equals(d4.c())) {
                                                                o = new i(Double.valueOf(d3.c().length()));
                                                                return (p)o;
                                                            }
                                                            if (h4.k(d4) && d4.u() < d3.c().length()) {
                                                                o = new t(String.valueOf(d3.c().charAt(d4.u().intValue())));
                                                                return (p)o;
                                                            }
                                                        }
                                                        o = p.L3;
                                                    }
                                                }
                                            }
                                            else if (list.isEmpty()) {
                                                o = new m();
                                            }
                                            else {
                                                if (list.size() % 2 != 0) {
                                                    throw new IllegalArgumentException(String.format("CREATE_OBJECT requires an even number of arguments, found %s", list.size()));
                                                }
                                                final m m = new m();
                                                while (true) {
                                                    o = m;
                                                    if (n3 >= list.size() - 1) {
                                                        break;
                                                    }
                                                    final p d5 = a.d((p)list.get(n3));
                                                    final p d6 = a.d((p)list.get(n3 + 1));
                                                    if (d5 instanceof h || d6 instanceof h) {
                                                        throw new IllegalStateException("Failed to evaluate map entry");
                                                    }
                                                    m.b(d5.c(), d6);
                                                    n3 += 2;
                                                }
                                            }
                                        }
                                        else if (list.isEmpty()) {
                                            o = new f();
                                        }
                                        else {
                                            final f f = new f();
                                            final Iterator iterator2 = list.iterator();
                                            int n4 = n;
                                            while (true) {
                                                o = f;
                                                if (!iterator2.hasNext()) {
                                                    break;
                                                }
                                                final p d7 = a.d((p)iterator2.next());
                                                if (d7 instanceof h) {
                                                    throw new IllegalStateException("Failed to evaluate array element");
                                                }
                                                f.z(n4, d7);
                                                ++n4;
                                            }
                                        }
                                    }
                                    else {
                                        final p d8 = a.d((p)e.l(zzbl.zzag, 3, list, 0));
                                        final p d9 = a.d((p)list.get(1));
                                        final p d10 = a.d((p)list.get(2));
                                        if (d8 == p.L3 || d8 == p.M3) {
                                            throw new IllegalStateException(String.format("Can't set property %s of %s", d9.c(), d8.c()));
                                        }
                                        if (d8 instanceof f && d9 instanceof i) {
                                            ((f)d8).z(d9.u().intValue(), d10);
                                            o = d10;
                                        }
                                        else {
                                            o = d10;
                                            if (d8 instanceof l) {
                                                ((l)d8).b(d9.c(), d10);
                                                o = d10;
                                            }
                                        }
                                    }
                                }
                                else {
                                    h4.h(((Enum)zzbl.zzX).name(), 0, (List)list);
                                    o = p.M3;
                                }
                            }
                            else {
                                final p d11 = a.d((p)e.l(zzbl.zzH, 1, list, 0));
                                if (!(d11 instanceof t)) {
                                    throw new IllegalArgumentException(String.format("Expected string for get var. got %s", d11.getClass().getCanonicalName()));
                                }
                                o = a.f(d11.c());
                            }
                        }
                        else {
                            h4.i(((Enum)zzbl.zzy).name(), 1, (List)list);
                            o = p.L3;
                            for (int i = n2; i < list.size(); ++i) {
                                o = a.d((p)list.get(i));
                                if (o instanceof h) {
                                    throw new IllegalStateException("ControlValue cannot be in an expression list");
                                }
                            }
                        }
                    }
                    else {
                        h4.i(((Enum)zzbl.zzo).name(), 2, (List)list);
                        if (list.size() % 2 != 0) {
                            throw new IllegalArgumentException(String.format("CONST requires an even number of arguments, found %s", list.size()));
                        }
                        for (int j = 0; j < list.size() - 1; j += 2) {
                            final p d12 = a.d((p)list.get(j));
                            if (!(d12 instanceof t)) {
                                throw new IllegalArgumentException(String.format("Expected string for const name. got %s", d12.getClass().getCanonicalName()));
                            }
                            c = d12.c();
                            a.g(c, a.d((p)list.get(j + 1)));
                            ((Map)a.i).put(c, Boolean.TRUE);
                        }
                        o = p.L3;
                    }
                }
                else {
                    final p d13 = a.d((p)e.l(zzbl.zzd, 2, list, 0));
                    if (!(d13 instanceof t)) {
                        throw new IllegalArgumentException(String.format("Expected string for assign var. got %s", d13.getClass().getCanonicalName()));
                    }
                    if (!a.i(d13.c())) {
                        throw new IllegalArgumentException(String.format("Attempting to assign undefined value %s", d13.c()));
                    }
                    o = a.d((p)list.get(1));
                    a.h(d13.c(), (p)o);
                }
                return (p)o;
            }
            case 0: {
                h4.h(((Enum)h4.e(c)).name(), 2, (List)list);
                final p d14 = a.d((p)list.get(0));
                final p d15 = a.d((p)list.get(1));
                final int ordinal2 = ((Enum)h4.e(c)).ordinal();
                boolean b2 = false;
                Label_0246: {
                    if (ordinal2 != 23) {
                        boolean b3 = false;
                        if (ordinal2 != 48) {
                            if (ordinal2 == 42) {
                                b2 = d(d14, d15);
                                break Label_0246;
                            }
                            if (ordinal2 == 43) {
                                b2 = e(d14, d15);
                                break Label_0246;
                            }
                            switch (ordinal2) {
                                default: {
                                    this.b(c);
                                    throw null;
                                }
                                case 40: {
                                    b3 = h4.l(d14, d15);
                                    break;
                                }
                                case 39: {
                                    b2 = h4.l(d14, d15);
                                    break Label_0246;
                                }
                                case 38: {
                                    b2 = e(d15, d14);
                                    break Label_0246;
                                }
                                case 37: {
                                    b2 = d(d15, d14);
                                    break Label_0246;
                                }
                            }
                        }
                        else {
                            b3 = c(d14, d15);
                        }
                        b2 = (b3 ^ true);
                    }
                    else {
                        b2 = c(d14, d15);
                    }
                }
                g g;
                if (b2) {
                    g = p.Q3;
                }
                else {
                    g = p.R3;
                }
                return (p)g;
            }
        }
    }
}
