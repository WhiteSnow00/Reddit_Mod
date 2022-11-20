// 
// Decompiled by Procyon v0.6.0
// 

package okhttp3.internal.connection;

import java.util.Iterator;
import okhttp3.internal._UtilCommonKt;
import kotlin.Pair;
import java.net.Inet6Address;
import java.util.ArrayList;
import ng2.e;
import java.net.InetAddress;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0004" }, d2 = { "reorderForHappyEyeballs", "", "Ljava/net/InetAddress;", "addresses", "okhttp" }, k = 2, mv = { 1, 6, 0 }, xi = 48)
public final class InetAddressOrderKt
{
    public static final List<InetAddress> reorderForHappyEyeballs(final List<? extends InetAddress> list) {
        e.f((Object)list, "addresses");
        if (list.size() < 2) {
            return (List<InetAddress>)list;
        }
        final ArrayList list2 = new ArrayList();
        final ArrayList list3 = new ArrayList();
        for (final Object next : list) {
            if (((InetAddress)next) instanceof Inet6Address) {
                list2.add(next);
            }
            else {
                list3.add(next);
            }
        }
        final Pair pair = new Pair((Object)list2, (Object)list3);
        final List list4 = (List)pair.component1();
        final List list5 = (List)pair.component2();
        List<Object> interleave = (List<Object>)list;
        if (!list4.isEmpty()) {
            if (list5.isEmpty()) {
                interleave = (List<Object>)list;
            }
            else {
                interleave = _UtilCommonKt.interleave((Iterable<?>)list4, (Iterable<?>)list5);
            }
        }
        return (List<InetAddress>)interleave;
    }
}
