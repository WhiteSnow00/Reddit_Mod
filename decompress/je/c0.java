// 
// Decompiled by Procyon v0.6.0
// 

package je;

import androidx.compose.ui.platform.p1;
import java.util.ArrayList;
import java.util.Iterator;
import com.google.android.gms.internal.measurement.zzbl;

public final class c0 extends v
{
    public c0() {
        super.a.add(zzbl.zzA);
        super.a.add(zzbl.zzB);
        super.a.add(zzbl.zzC);
        super.a.add(zzbl.zzD);
        super.a.add(zzbl.zzE);
        super.a.add(zzbl.zzF);
        super.a.add(zzbl.zzG);
        super.a.add(zzbl.zzan);
    }
    
    public static o c(final a0 a0, final Iterator iterator, final o o) {
        if (iterator != null) {
            while (iterator.hasNext()) {
                final o d = a0.a((o)iterator.next()).d((e)o);
                if (d instanceof g) {
                    final g g = (g)d;
                    if ("break".equals(g.g)) {
                        return (o)o.b3;
                    }
                    if ("return".equals(g.g)) {
                        return (o)g;
                    }
                    continue;
                }
            }
        }
        return (o)o.b3;
    }
    
    public static o d(final a0 a0, final o o, final o o2) {
        if (o instanceof Iterable) {
            return c(a0, ((Iterable)o).iterator(), o2);
        }
        throw new IllegalArgumentException("Non-iterable type in for...of loop.");
    }
    
    public final o a(String s, final i6.g g, final ArrayList list) {
        final zzbl zza = zzbl.zza;
        final int ordinal = ((Enum)f4.e(s)).ordinal();
        if (ordinal == 65) {
            final o o = (o)b.f(zzbl.zzan, 4, list, 0);
            final o o2 = list.get(1);
            final o o3 = list.get(2);
            final o c = g.c((o)list.get(3));
            if (g.c(o3).d()) {
                final o d = g.d((e)c);
                if (d instanceof g) {
                    Object o4 = d;
                    if ("break".equals(((g)o4).g)) {
                        o4 = je.o.b3;
                        return (o)o4;
                    }
                    if ("return".equals(((g)o4).g)) {
                        return (o)o4;
                    }
                }
            }
            while (g.c(o).d()) {
                final o d2 = g.d((e)c);
                if (d2 instanceof g) {
                    Object o4 = d2;
                    if ("break".equals(((g)o4).g)) {
                        o4 = je.o.b3;
                        return (o)o4;
                    }
                    if ("return".equals(((g)o4).g)) {
                        return (o)o4;
                    }
                }
                g.c(o2);
            }
            Object o4 = je.o.b3;
            return (o)o4;
        }
        switch (ordinal) {
            default: {
                this.b(s);
                throw null;
            }
            case 32: {
                if (b.f(zzbl.zzG, 3, list, 0) instanceof s) {
                    s = list.get(0).c();
                    return d((a0)new oe2.e(4, (Object)g, (Object)s), g.c((o)list.get(1)), g.c((o)list.get(2)));
                }
                throw new IllegalArgumentException("Variable name in FOR_OF_LET must be a string");
            }
            case 31: {
                if (b.f(zzbl.zzF, 3, list, 0) instanceof s) {
                    return d((a0)new p1(3, g, list.get(0).c()), g.c((o)list.get(1)), g.c((o)list.get(2)));
                }
                throw new IllegalArgumentException("Variable name in FOR_OF_CONST must be a string");
            }
            case 30: {
                if (b.f(zzbl.zzE, 3, list, 0) instanceof s) {
                    return d((a0)new b0(g, list.get(0).c()), g.c((o)list.get(1)), g.c((o)list.get(2)));
                }
                throw new IllegalArgumentException("Variable name in FOR_OF must be a string");
            }
            case 29: {
                final o c2 = g.c((o)b.f(zzbl.zzD, 4, list, 0));
                if (c2 instanceof e) {
                    final e e = (e)c2;
                    final o o5 = list.get(1);
                    final o o6 = list.get(2);
                    final o c3 = g.c((o)list.get(3));
                    final i6.g b = g.b();
                    int n = 0;
                    i6.g g2;
                    while (true) {
                        g2 = b;
                        if (n >= e.k()) {
                            break;
                        }
                        s = e.m(n).c();
                        b.g(s, g.e(s));
                        ++n;
                    }
                    while (g.c(o5).d()) {
                        final o d3 = g.d((e)c3);
                        Label_0507: {
                            if (d3 instanceof g) {
                                final g g3 = (g)d3;
                                Object o7;
                                if ("break".equals(g3.g)) {
                                    o7 = o.b3;
                                }
                                else {
                                    if (!"return".equals(g3.g)) {
                                        break Label_0507;
                                    }
                                    o7 = g3;
                                }
                                return (o)o7;
                            }
                        }
                        final i6.g b2 = g.b();
                        for (int i = 0; i < e.k(); ++i) {
                            final String c4 = e.m(i).c();
                            b2.g(c4, g2.e(c4));
                        }
                        b2.c(o6);
                        g2 = b2;
                    }
                    Object o7 = o.b3;
                    return (o)o7;
                }
                throw new IllegalArgumentException("Initializer variables in FOR_LET must be an ArrayList");
            }
            case 28: {
                if (b.f(zzbl.zzC, 3, list, 0) instanceof s) {
                    return c((a0)new oe2.e(4, (Object)g, (Object)list.get(0).c()), g.c((o)list.get(1)).e(), g.c((o)list.get(2)));
                }
                throw new IllegalArgumentException("Variable name in FOR_IN_LET must be a string");
            }
            case 27: {
                if (b.f(zzbl.zzB, 3, list, 0) instanceof s) {
                    s = list.get(0).c();
                    return c((a0)new p1(3, g, s), g.c((o)list.get(1)).e(), g.c((o)list.get(2)));
                }
                throw new IllegalArgumentException("Variable name in FOR_IN_CONST must be a string");
            }
            case 26: {
                if (b.f(zzbl.zzA, 3, list, 0) instanceof s) {
                    return c((a0)new b0(g, list.get(0).c()), g.c((o)list.get(1)).e(), g.c((o)list.get(2)));
                }
                throw new IllegalArgumentException("Variable name in FOR_IN must be a string");
            }
        }
    }
}
