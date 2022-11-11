// 
// Decompiled by Procyon v0.6.0
// 

package ax0;

import rx0.c$c;
import rx0.c$a;
import rx0.c$b;
import rx0.c$d;
import rx0.c$e;
import kotlin.NoWhenBranchMatchedException;
import sg2.e;
import rx0.c;
import com.reddit.marketplace.domain.model.Rarity;

public final class a
{
    public static final c a(final Rarity rarity, final Integer n) {
        e.f((Object)rarity, "<this>");
        final int n2 = a.a[((Enum)rarity).ordinal()];
        Object o;
        if (n2 != 1) {
            if (n2 != 2) {
                if (n2 != 3) {
                    if (n2 != 4) {
                        if (n2 != 5) {
                            throw new NoWhenBranchMatchedException();
                        }
                        o = new c$e(n);
                    }
                    else {
                        o = new c$d(n);
                    }
                }
                else {
                    o = new c$b(n);
                }
            }
            else {
                o = new c$a(n);
            }
        }
        else {
            o = new c$c(n);
        }
        return (c)o;
    }
}
