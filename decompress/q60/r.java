// 
// Decompiled by Procyon v0.6.0
// 

package q60;

import com.reddit.data.snoovatar.entity.AccessoryAssetsJson;
import kotlin.text.b;
import com.reddit.data.snoovatar.entity.AccessoryJson;
import com.reddit.data.snoovatar.entity.OutfitJson;
import com.reddit.domain.snoovatar.model.State;
import java.util.Iterator;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.util.Collection;
import dg2.o;
import com.reddit.type.AvatarCapability;
import com.reddit.domain.snoovatar.model.AccessoryModel;
import com.reddit.queries.k$s;
import java.util.ArrayList;
import dg2.m;
import java.util.LinkedHashMap;
import java.util.List;
import javax.inject.Inject;
import ng2.e;
import com.reddit.data.snoovatar.mapper.OutfitMapper;

public final class r implements OutfitMapper
{
    public final a a;
    public final ge0.a b;
    
    @Inject
    public r(final a a, final ge0.a b) {
        e.f((Object)a, "accessoryMapper");
        e.f((Object)b, "snoovatarFeatures");
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final Outfits a(final List list, final LinkedHashMap linkedHashMap) {
        e.f((Object)list, "outfits");
        Outfits c3;
        if (this.b.Fc() && (list.isEmpty() ^ true)) {
            final ArrayList list2 = new ArrayList(m.u4((Iterable)list, 10));
            for (final k$s k$s : list) {
                final a a = this.a;
                a.getClass();
                e.f((Object)k$s, "outfit");
                final d$a a2 = a.b.a(k$s.h);
                final List d = k$s.d;
                final ArrayList<AccessoryModel> list3 = new ArrayList<AccessoryModel>();
                final Iterator iterator2 = d.iterator();
                while (iterator2.hasNext()) {
                    final AccessoryModel accessoryModel = linkedHashMap.get(iterator2.next());
                    if (accessoryModel != null) {
                        list3.add(accessoryModel);
                    }
                }
                final String b = k$s.b;
                final String c = k$s.c;
                final boolean b2 = k$s.f == AvatarCapability.PREMIUM;
                final State c2 = a.d.c(b, k$s.e, a2);
                final List g = k$s.g;
                final ArrayList list4 = new ArrayList();
                final Iterator<AccessoryModel> iterator3 = list3.iterator();
                while (iterator3.hasNext()) {
                    o.B4((Iterable)iterator3.next().k, (Collection)list4);
                }
                list2.add(new AccessoryModel(b, c, b2, c2, g, CollectionsKt___CollectionsKt.L4((Iterable)list4), a2.c, a2.a, a.c.b(k$s, (ArrayList)list3)));
            }
            c3 = new Outfits(list2);
        }
        else {
            c3 = Outfits.c;
        }
        return c3;
    }
    
    @Override
    public final Outfits b(final List list, final LinkedHashMap linkedHashMap) {
        e.f((Object)list, "outfits");
        Outfits c2;
        if (this.b.Fc() && (list.isEmpty() ^ true)) {
            final ArrayList list2 = new ArrayList(m.u4((Iterable)list, 10));
            for (final OutfitJson outfitJson : list) {
                final List c = outfitJson.c;
                final ArrayList<AccessoryJson> list3 = new ArrayList<AccessoryJson>();
                final Iterator iterator2 = c.iterator();
                while (iterator2.hasNext()) {
                    final AccessoryJson accessoryJson = linkedHashMap.get(iterator2.next());
                    if (accessoryJson != null) {
                        list3.add(accessoryJson);
                    }
                }
                final a a = this.a;
                a.getClass();
                final d$a a2 = a.b.a(outfitJson.g);
                final ArrayList list4 = new ArrayList<AccessoryModel>(m.u4((Iterable)list3, 10));
                final Iterator<AccessoryJson> iterator3 = list3.iterator();
                while (iterator3.hasNext()) {
                    list4.add(a.a((AccessoryJson)iterator3.next()));
                }
                final String a3 = outfitJson.a;
                final String b = outfitJson.b;
                final String e = outfitJson.e;
                final boolean b2 = e != null && kotlin.text.b.J0((CharSequence)e, (CharSequence)"PREMIUM", false);
                final State a4 = a.d.a(outfitJson, a2);
                final List f = outfitJson.f;
                final ArrayList list5 = new ArrayList();
                final Iterator<AccessoryJson> iterator4 = list3.iterator();
                while (iterator4.hasNext()) {
                    o.B4((Iterable)iterator4.next().f, (Collection)list5);
                }
                final ArrayList list6 = new ArrayList<ie0.a>(m.u4((Iterable)list5, 10));
                for (final AccessoryAssetsJson accessoryAssetsJson : list5) {
                    ng2.e.f((Object)accessoryAssetsJson, "<this>");
                    list6.add(new ie0.a(accessoryAssetsJson.a, accessoryAssetsJson.c, accessoryAssetsJson.b));
                }
                list2.add(new AccessoryModel(a3, b, b2, a4, f, (List)list6, a2.c, a2.a, a.c.a(outfitJson, list4)));
            }
            c2 = new Outfits(list2);
        }
        else {
            c2 = Outfits.c;
        }
        return c2;
    }
}
