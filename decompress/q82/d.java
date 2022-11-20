// 
// Decompiled by Procyon v0.6.0
// 

package q82;

import java.util.Iterator;
import java.util.Map;
import r82.c0$a;
import r82.c0$c;
import r82.c0$b;
import com.reddit.vault.model.AllowedContractMethod;
import java.util.List;
import r82.c0;
import u82.c;
import u82.b;
import kotlin.NoWhenBranchMatchedException;
import s82.g$b;
import s82.g$d;
import s82.g$e;
import s82.g$a;
import com.reddit.vault.data.exception.MissingTransactionContractException;
import s82.g$c;
import s82.g;
import t82.a;
import javax.inject.Inject;
import ng2.e;
import wa0.d0;

public final class d
{
    public final d0 a;
    
    @Inject
    public d(final d0 a) {
        e.f((Object)a, "vaultFeatures");
        this.a = a;
    }
    
    public static r82.a a(final a a, final g g) {
        if (g instanceof g$c) {
            final u82.a b = a.b;
            if (b != null) {
                final r82.a a2 = b.a;
                if (a2 != null) {
                    return a2;
                }
            }
            throw new MissingTransactionContractException();
        }
        if (g instanceof g$a) {
            final b d = a.d;
            if (d != null) {
                final r82.a a2 = d.a;
                if (a2 != null) {
                    return a2;
                }
            }
            throw new MissingTransactionContractException();
        }
        if (g instanceof g$e) {
            final b d2 = a.d;
            if (d2 != null) {
                final r82.a a2 = d2.a;
                if (a2 != null) {
                    return a2;
                }
            }
            throw new MissingTransactionContractException();
        }
        if (g instanceof g$d) {
            final c c = a.c;
            if (c != null) {
                final r82.a a2 = c.a;
                if (a2 != null) {
                    return a2;
                }
            }
            throw new MissingTransactionContractException();
        }
        if (g instanceof g$b) {
            final c c2 = a.c;
            if (c2 != null) {
                final r82.a a2 = c2.a;
                if (a2 != null) {
                    return a2;
                }
            }
            throw new MissingTransactionContractException();
        }
        throw new NoWhenBranchMatchedException();
    }
    
    public final j82.a<c0> b(final a a, final g g) {
        e.f((Object)g, "operation");
        try {
            final r82.a a2 = a(a, g);
            if (this.a.db()) {
                final Map<r82.a, List<AllowedContractMethod>> f = a.f;
                final boolean b = false;
                int n = 0;
                Label_0140: {
                    if (f == null) {
                        n = (b ? 1 : 0);
                    }
                    else {
                        final List list = f.get(a2);
                        if (list == null) {
                            n = (b ? 1 : 0);
                        }
                        else if (list.isEmpty()) {
                            n = (b ? 1 : 0);
                        }
                        else {
                            final Iterator iterator = list.iterator();
                            do {
                                n = (b ? 1 : 0);
                                if (iterator.hasNext()) {
                                    continue;
                                }
                                break Label_0140;
                            } while (!e.a((Object)g.b.getAction(), (Object)((AllowedContractMethod)iterator.next()).a));
                            n = 1;
                        }
                    }
                }
                if (n != 0) {
                    return new j82.a.b<c0>((c0)new c0$b(a.a));
                }
            }
            final c0$c c = c0$c.c;
            if (e.a((Object)"ethereum:200", (Object)a.a)) {
                return new j82.a.b<c0>((c0)c);
            }
            return new j82.a.b<c0>((c0)new c0$a(a.a));
        }
        catch (final MissingTransactionContractException ex) {
            return new j82.a.a<c0>((Exception)ex);
        }
    }
}
