// 
// Decompiled by Procyon v0.6.0
// 

package q60;

import com.reddit.data.snoovatar.entity.OutfitJson;
import com.reddit.queries.k$d;
import com.reddit.marketplace.domain.model.Rarity$Companion;
import com.reddit.marketplace.domain.model.Rarity;
import ie0.m;
import com.reddit.queries.k$s;
import ie0.n;
import javax.inject.Inject;
import ng2.e;
import ox1.a;

public final class q implements o
{
    public final a a;
    public final dw0.a b;
    
    @Inject
    public q(final a a, final dw0.a b) {
        e.f((Object)a, "fakeSnoovatarRepository");
        e.f((Object)b, "logger");
        this.a = a;
        this.b = b;
    }
    
    public static n c(final String s, final String s2, final String s3) {
        final int n = 0;
        if ((s == null || s.length() == 0) && (s2 == null || s2.length() == 0)) {
            int n2 = 0;
            Label_0069: {
                if (s3 != null) {
                    n2 = n;
                    if (s3.length() != 0) {
                        break Label_0069;
                    }
                }
                n2 = 1;
            }
            if (n2 != 0) {
                return null;
            }
        }
        return new n(s, s2, s3);
    }
    
    public final m a(final k$s k$s) {
        final k$d n = k$s.n;
        final m m = null;
        if (n == null) {
            return null;
        }
        m i;
        if (this.a.i(k$s.b)) {
            i = new m(Rarity.Epic, new n("test_fake_token_id", "test_fake_contract_address", "test_fake_wallet_address"));
        }
        else {
            final String q = n.q;
            final int n2 = 0;
            Rarity rarity;
            if (q == null || q.length() == 0) {
                rarity = Rarity.Unknown;
            }
            else {
                final Rarity$Companion companion = Rarity.Companion;
                final dw0.a b = this.b;
                companion.getClass();
                rarity = Rarity$Companion.a(q, b);
            }
            final m j = new m(rarity, c(n.n, n.o, n.p));
            int n3 = n2;
            if (j.g == null) {
                n3 = 1;
            }
            i = m;
            if ((n3 ^ 0x1) != 0x0) {
                i = j;
            }
        }
        return i;
    }
    
    public final m b(final OutfitJson outfitJson) {
        m m;
        if (this.a.i(outfitJson.a)) {
            m = new m(Rarity.Epic, new n("test_fake_token_id", "test_fake_contract_address", "test_fake_wallet_address"));
        }
        else {
            final String p = outfitJson.p;
            final int n = 0;
            Rarity rarity;
            if (p == null || p.length() == 0) {
                rarity = Rarity.Unknown;
            }
            else {
                final Rarity$Companion companion = Rarity.Companion;
                final dw0.a b = this.b;
                companion.getClass();
                rarity = Rarity$Companion.a(p, b);
            }
            m = new m(rarity, c(outfitJson.n, outfitJson.o, outfitJson.q));
            int n2 = n;
            if (m.g == null) {
                n2 = 1;
            }
            if ((n2 ^ 0x1) == 0x0) {
                m = null;
            }
        }
        return m;
    }
}
