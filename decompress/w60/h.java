// 
// Decompiled by Procyon v0.6.0
// 

package w60;

import java.util.Iterator;
import rw0.a$a;
import rw0.a$a$a;
import kotlin.collections.EmptyList;
import java.util.ArrayList;
import qg2.m;
import com.reddit.fragment.AvatarStorefrontListing$g;
import java.util.List;
import javax.inject.Inject;
import ah2.f;
import rw0.a;

public final class h implements p
{
    public final a a;
    
    @Inject
    public h(final a a) {
        f.f((Object)a, "findValidPricePackage");
        this.a = a;
    }
    
    public final AvatarStorefrontListing$g a(final List<AvatarStorefrontListing$g> list) {
        f.f((Object)list, "pricePackages");
        final ArrayList list2 = new ArrayList(m.P0((Iterable)list, 10));
        for (final AvatarStorefrontListing$g avatarStorefrontListing$g : list) {
            final String b = avatarStorefrontListing$g.b;
            Object o;
            if ((o = avatarStorefrontListing$g.d) == null) {
                o = EmptyList.INSTANCE;
            }
            list2.add((Object)new a$a$a(b, (List)o, avatarStorefrontListing$g.c, Long.parseLong(avatarStorefrontListing$g.f), avatarStorefrontListing$g.e.getRawValue(), Long.parseLong(avatarStorefrontListing$g.g)));
        }
        final rw0.f a = this.a.a(new a$a((List)list2));
        AvatarStorefrontListing$g avatarStorefrontListing$g2 = null;
        final AvatarStorefrontListing$g avatarStorefrontListing$g3 = null;
        if (a != null) {
            final Iterator<Object> iterator2 = list.iterator();
            AvatarStorefrontListing$g next;
            do {
                next = avatarStorefrontListing$g3;
                if (!iterator2.hasNext()) {
                    break;
                }
                next = iterator2.next();
            } while (!f.a((Object)next.b, (Object)a.a));
            avatarStorefrontListing$g2 = next;
        }
        return avatarStorefrontListing$g2;
    }
}
