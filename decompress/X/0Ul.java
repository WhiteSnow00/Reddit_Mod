// 
// Decompiled by Procyon v0.6.0
// 

package X;

import androidx.recyclerview.widget.RecyclerView;
import java.util.LinkedHashMap;
import java.util.ListIterator;
import java.util.Iterator;
import java.util.Objects;
import java.util.Map;
import kotlin.jvm.internal.n;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import java.util.List;
import com.bytedance.covode.number.Covode;

public final class 0uL
{
    public static final 0uL LIZ;
    
    static {
        Covode.recordClassIndex(9464);
        LIZ = new 0uL();
    }
    
    private final int LIZ(final GQk gQk, final GQk gQk2) {
        int size = 0;
        int size2;
        if (gQk != null) {
            size2 = gQk.size();
        }
        else {
            size2 = 0;
        }
        if (gQk2 != null) {
            size = gQk2.size();
        }
        return size2 + size;
    }
    
    private final int LIZ(final List<? extends LinkPlayerInfo> list, final List<? extends LinkPlayerInfo> list2) {
        int size = 0;
        int size2;
        if (list != null) {
            size2 = list.size();
        }
        else {
            size2 = 0;
        }
        if (list2 != null) {
            size = list2.size();
        }
        return size2 + size;
    }
    
    private final LinkPlayerInfo LIZ() {
        final Room room = (Room)DataChannelGlobal.LIZJ.LIZIZ((Class)HQ5.class);
        if (room == null) {
            return null;
        }
        final LinkPlayerInfo linkPlayerInfo = new LinkPlayerInfo();
        linkPlayerInfo.LJ = 2;
        final User owner = room.getOwner();
        if (owner == null) {
            return null;
        }
        linkPlayerInfo.LIZJ = owner;
        return linkPlayerInfo;
    }
    
    private final String LIZ(final LinkPlayerInfo linkPlayerInfo) {
        final StringBuilder sb = new StringBuilder();
        final User lizj = linkPlayerInfo.LIZJ;
        n.LIZIZ((Object)lizj, "");
        sb.append(lizj.getId());
        sb.append('_');
        sb.append(linkPlayerInfo.LJ);
        sb.append('_');
        sb.append(linkPlayerInfo.LJI);
        sb.append('_');
        sb.append(linkPlayerInfo.LIZLLL);
        return sb.toString();
    }
    
    private final void LIZ(final GQk gQk, final GQk gQk2, final List<? extends LinkPlayerInfo> list, final List<? extends LinkPlayerInfo> list2, final Evr evr) {
        for (final Map.Entry<K, a> entry : this.LIZ(gQk2, list2).entrySet()) {
            final List liziz = evr.LIZIZ;
            Objects.requireNonNull(liziz, "null cannot be cast to non-null type me.drakeet.multitype.Items");
            final GQk gQk3 = (GQk)liziz;
            if (entry.getValue().LIZIZ) {
                final Iterator iterator2 = ((List)gQk3).iterator();
                int n = 0;
                while (iterator2.hasNext()) {
                    final Object next = iterator2.next();
                    if (next instanceof LinkPlayerInfo) {
                        final LinkPlayerInfo linkPlayerInfo = (LinkPlayerInfo)next;
                        final User lizj = linkPlayerInfo.LIZJ;
                        Object value = null;
                        Long value2;
                        if (lizj != null) {
                            value2 = lizj.getId();
                        }
                        else {
                            value2 = null;
                        }
                        final User lizj2 = entry.getValue().LIZ.LIZJ;
                        if (lizj2 != null) {
                            value = lizj2.getId();
                        }
                        if (kotlin.jvm.internal.n.LIZ((Object)value2, value) && linkPlayerInfo.LJIILL == 2 && !linkPlayerInfo.LJIILLIIL) {
                            if (n != -1) {
                                0uL.LIZ.LIZ(gQk3, n, evr);
                                break;
                            }
                            break;
                        }
                    }
                    ++n;
                }
            }
            else {
                final 0uL liz = 0uL.LIZ;
                final 8u7<Integer, Integer, Integer> ljff = liz.LJFF(gQk3);
                final int intValue = ((Number)ljff.getFirst()).intValue();
                final int intValue2 = ((Number)ljff.getSecond()).intValue();
                final int intValue3 = ((Number)ljff.getThird()).intValue();
                int n3;
                if (intValue2 == -1) {
                    final int liz2 = liz.LIZ(list, list2);
                    int n2;
                    if (liz2 == 1) {
                        n2 = 2131830178;
                    }
                    else {
                        n2 = 2131830179;
                    }
                    final String liz3 = 0cB.LIZ(n2, new Object[] { liz2 });
                    n.LIZIZ((Object)liz3, "");
                    liz.LIZ(gQk3, intValue3 + 1, new 1P7(liz3, 0), evr);
                    n3 = 1;
                }
                else {
                    n3 = 0;
                }
                final LinkPlayerInfo liz4 = entry.getValue().LIZ;
                liz4.LJIILL = 2;
                liz4.LJIILLIIL = false;
                int n4;
                if (n3 != 0) {
                    n4 = intValue3 + 2;
                }
                else {
                    n4 = intValue + 1;
                }
                liz.LIZ(gQk3, n4, liz4, evr);
            }
            if ((list2 == null || list2.isEmpty()) && (list == null || list.isEmpty())) {
                final List liziz2 = evr.LIZIZ;
                Objects.requireNonNull(liziz2, "null cannot be cast to non-null type me.drakeet.multitype.Items");
                final GQk gQk4 = (GQk)liziz2;
                final 0uL liz5 = 0uL.LIZ;
                final int lizlll = liz5.LIZLLL(gQk4);
                if (lizlll == -1) {
                    continue;
                }
                liz5.LIZ(gQk4, lizlll, evr);
            }
        }
        this.LIZ(list2, list, gQk, gQk2, evr);
    }
    
    private final void LIZ(final List<? extends LinkPlayerInfo> list, final List<? extends LinkPlayerInfo> list2, final GQk gQk, GQk gQk2, final Evr evr) {
        int n;
        if ((list == null || list.isEmpty()) && (list2 == null || list2.isEmpty())) {
            n = 1;
        }
        else {
            n = 0;
        }
        final int liz = this.LIZ(gQk, gQk2);
        final int liz2 = this.LIZ(list2, list);
        if (n == 0) {
            if (liz != liz2) {
                final List liziz = evr.LIZIZ;
                Objects.requireNonNull(liziz, "null cannot be cast to non-null type me.drakeet.multitype.Items");
                gQk2 = (GQk)liziz;
                final int lizlll = this.LIZLLL(gQk2);
                if (lizlll != -1) {
                    final Object value = gQk2.get(lizlll);
                    Objects.requireNonNull(value, "null cannot be cast to non-null type com.bytedance.android.live.liveinteract.cohost.ui.item.TitleItem");
                    final 1P7 1p7 = (1P7)value;
                    String s;
                    if (liz2 == 1) {
                        s = 0cB.LIZ(2131830178, new Object[] { liz2 });
                        kotlin.jvm.internal.n.LIZIZ((Object)s, "");
                    }
                    else {
                        s = 0cB.LIZ(2131830179, new Object[] { liz2 });
                        kotlin.jvm.internal.n.LIZIZ((Object)s, "");
                    }
                    1p7.LIZ(s);
                    1p7.LIZIZ = 0;
                    gQk2.set(lizlll, value);
                    evr.LIZ((List)gQk2);
                    ((RecyclerView.a)evr).notifyItemChanged(lizlll);
                }
            }
        }
        else {
            final List liziz2 = evr.LIZIZ;
            Objects.requireNonNull(liziz2, "null cannot be cast to non-null type me.drakeet.multitype.Items");
            final GQk gQk3 = (GQk)liziz2;
            final int lizlll2 = this.LIZLLL(gQk3);
            if (lizlll2 != -1) {
                this.LIZ(gQk3, lizlll2, evr);
            }
        }
    }
    
    private final void LIZ(final boolean b, final Evr evr) {
        if (b) {
            final List liziz = evr.LIZIZ;
            n.LIZIZ((Object)liziz, "");
            int n = 0;
            final Iterator iterator = liziz.iterator();
            while (iterator.hasNext()) {
                if (iterator.next() instanceof 0ti) {
                    if (n != -1) {
                        final List liziz2 = evr.LIZIZ;
                        Objects.requireNonNull(liziz2, "null cannot be cast to non-null type me.drakeet.multitype.Items");
                        this.LIZ((GQk)liziz2, n, evr);
                        break;
                    }
                    break;
                }
                else {
                    ++n;
                }
            }
        }
    }
    
    private final void LIZIZ(final GQk gQk) {
        if (gQk.size() == 0) {
            if (0ql.LIZ.LIZLLL()) {
                final LinkPlayerInfo liziz = 0ql.LIZ.LIZIZ();
                if (liziz != null) {
                    gQk.add((Object)liziz);
                }
                return;
            }
            final LinkPlayerInfo liz = this.LIZ();
            if (liz != null) {
                gQk.add((Object)liz);
            }
        }
    }
    
    private final void LIZIZ(final GQk gQk, final GQk gQk2, final List<? extends LinkPlayerInfo> list, final List<? extends LinkPlayerInfo> list2, final Evr evr) {
        for (final Map.Entry<K, a> entry : this.LIZ(gQk, list).entrySet()) {
            final List liziz = evr.LIZIZ;
            Objects.requireNonNull(liziz, "null cannot be cast to non-null type me.drakeet.multitype.Items");
            final GQk gQk3 = (GQk)liziz;
            final boolean liziz2 = entry.getValue().LIZIZ;
            boolean b = false;
            if (liziz2) {
                final Iterator iterator2 = ((List)gQk3).iterator();
                int n = 0;
                while (iterator2.hasNext()) {
                    final Object next = iterator2.next();
                    if (next instanceof LinkPlayerInfo) {
                        final LinkPlayerInfo linkPlayerInfo = (LinkPlayerInfo)next;
                        final User lizj = linkPlayerInfo.LIZJ;
                        Long value;
                        if (lizj != null) {
                            value = lizj.getId();
                        }
                        else {
                            value = null;
                        }
                        final User lizj2 = entry.getValue().LIZ.LIZJ;
                        Long value2;
                        if (lizj2 != null) {
                            value2 = lizj2.getId();
                        }
                        else {
                            value2 = null;
                        }
                        if (kotlin.jvm.internal.n.LIZ((Object)value, (Object)value2) && linkPlayerInfo.LJIILL == 2 && linkPlayerInfo.LJIILLIIL) {
                            if (n != -1) {
                                0uL.LIZ.LIZ(gQk3, n, evr);
                                break;
                            }
                            break;
                        }
                    }
                    ++n;
                }
            }
            else {
                final 0uL liz = 0uL.LIZ;
                final 8u7<Integer, Integer, Integer> lji = liz.LJI(gQk3);
                final int intValue = ((Number)lji.getFirst()).intValue();
                final int intValue2 = ((Number)lji.getSecond()).intValue();
                final int intValue3 = ((Number)lji.getThird()).intValue();
                if (intValue2 == -1) {
                    final int liz2 = liz.LIZ(list, list2);
                    int n2;
                    if (liz2 == 1) {
                        n2 = 2131830178;
                    }
                    else {
                        n2 = 2131830179;
                    }
                    final String liz3 = 0cB.LIZ(n2, new Object[] { liz2 });
                    n.LIZIZ((Object)liz3, "");
                    liz.LIZ(gQk3, intValue3 + 1, new 1P7(liz3, 0), evr);
                    b = true;
                }
                final LinkPlayerInfo liz4 = entry.getValue().LIZ;
                liz4.LJIILL = 2;
                liz4.LJIILLIIL = true;
                int n3;
                if (b) {
                    n3 = intValue3 + 2;
                }
                else {
                    n3 = intValue + 1;
                }
                liz.LIZ(gQk3, n3, liz4, evr);
            }
        }
        this.LIZ(list2, list, gQk, gQk2, evr);
    }
    
    private final void LIZIZ(GQk gQk, final List<? extends LinkPlayerInfo> list, final Evr evr) {
        final Iterator<Map.Entry<String, a>> iterator = this.LIZ(gQk, list).entrySet().iterator();
        while (true) {
            final boolean hasNext = iterator.hasNext();
            boolean b = false;
            if (!hasNext) {
                break;
            }
            final Map.Entry<K, a> entry = iterator.next();
            final List liziz = evr.LIZIZ;
            Objects.requireNonNull(liziz, "null cannot be cast to non-null type me.drakeet.multitype.Items");
            final GQk gQk2 = (GQk)liziz;
            if (entry.getValue().LIZIZ) {
                final Iterator iterator2 = ((List)gQk2).iterator();
                int n = 0;
                while (iterator2.hasNext()) {
                    final Object next = iterator2.next();
                    if (next instanceof LinkPlayerInfo) {
                        final LinkPlayerInfo linkPlayerInfo = (LinkPlayerInfo)next;
                        final User lizj = linkPlayerInfo.LIZJ;
                        Object value = null;
                        Long value2;
                        if (lizj != null) {
                            value2 = lizj.getId();
                        }
                        else {
                            value2 = null;
                        }
                        final User lizj2 = entry.getValue().LIZ.LIZJ;
                        if (lizj2 != null) {
                            value = lizj2.getId();
                        }
                        if (kotlin.jvm.internal.n.LIZ((Object)value2, value) && linkPlayerInfo.LJIILL == 3) {
                            if (n != -1) {
                                0uL.LIZ.LIZ(gQk2, n, evr);
                                break;
                            }
                            break;
                        }
                    }
                    ++n;
                }
            }
            else {
                final 0uL liz = 0uL.LIZ;
                final 8u7<Integer, Integer, Integer> lizj3 = liz.LIZJ(gQk2);
                final int intValue = ((Number)lizj3.getFirst()).intValue();
                final int intValue2 = ((Number)lizj3.getSecond()).intValue();
                final int intValue3 = ((Number)lizj3.getThird()).intValue();
                if (intValue2 == -1) {
                    final String liz2 = 0cB.LIZ(2131832263);
                    n.LIZIZ((Object)liz2, "");
                    liz.LIZ(gQk2, intValue3 + 1, new 1P7(liz2, 1), evr);
                    b = true;
                }
                final LinkPlayerInfo liz3 = entry.getValue().LIZ;
                liz3.LJIILL = 3;
                int n2;
                if (b) {
                    n2 = intValue3 + 2;
                }
                else {
                    n2 = intValue + 1;
                }
                liz.LIZ(gQk2, n2, liz3, evr);
            }
        }
        if (list == null || list.isEmpty()) {
            final List liziz2 = evr.LIZIZ;
            Objects.requireNonNull(liziz2, "null cannot be cast to non-null type me.drakeet.multitype.Items");
            gQk = (GQk)liziz2;
            final int lj = this.LJ(gQk);
            if (lj != -1) {
                this.LIZ(gQk, lj, evr);
            }
        }
    }
    
    private final 8u7<Integer, Integer, Integer> LIZJ(final GQk gQk) {
        final ListIterator<Object> listIterator = ((List<Object>)gQk).listIterator(((List)gQk).size());
        int lj;
        int nextIndex;
        while (true) {
            LinkPlayerInfo previous;
            do {
                final boolean hasPrevious = listIterator.hasPrevious();
                lj = 0;
                if (hasPrevious) {
                    previous = listIterator.previous();
                }
                else {
                    lj = this.LJ(gQk);
                    if (lj == -1) {
                        final 8u7<Integer, Integer, Integer> ljff = this.LJFF(gQk);
                        return (8u7<Integer, Integer, Integer>)new 8u7(ljff.getFirst(), (Object)(-1), ljff.getFirst());
                    }
                    nextIndex = lj;
                    return (8u7<Integer, Integer, Integer>)new 8u7((Object)nextIndex, (Object)lj, (Object)nextIndex);
                }
            } while (!(previous instanceof LinkPlayerInfo) || previous.LJIILL != 3);
            if ((nextIndex = listIterator.nextIndex()) == -1) {
                continue;
            }
            break;
        }
        return (8u7<Integer, Integer, Integer>)new 8u7((Object)nextIndex, (Object)lj, (Object)nextIndex);
    }
    
    private final void LIZJ(final GQk gQk, final List<? extends LinkPlayerInfo> list, final Evr evr) {
        for (final Map.Entry<K, a> entry : this.LIZ(gQk, list).entrySet()) {
            final List liziz = evr.LIZIZ;
            Objects.requireNonNull(liziz, "null cannot be cast to non-null type me.drakeet.multitype.Items");
            final GQk gQk2 = (GQk)liziz;
            if (entry.getValue().LIZIZ) {
                final Iterator iterator2 = ((List)gQk2).iterator();
                int n = 0;
                while (iterator2.hasNext()) {
                    final Object next = iterator2.next();
                    if (next instanceof LinkPlayerInfo) {
                        final LinkPlayerInfo linkPlayerInfo = (LinkPlayerInfo)next;
                        final User lizj = linkPlayerInfo.LIZJ;
                        Object value = null;
                        Long value2;
                        if (lizj != null) {
                            value2 = lizj.getId();
                        }
                        else {
                            value2 = null;
                        }
                        final User lizj2 = entry.getValue().LIZ.LIZJ;
                        if (lizj2 != null) {
                            value = lizj2.getId();
                        }
                        if (kotlin.jvm.internal.n.LIZ((Object)value2, value) && linkPlayerInfo.LJIILL == 1) {
                            if (n != -1) {
                                0uL.LIZ.LIZ(gQk2, n, evr);
                                break;
                            }
                            break;
                        }
                    }
                    ++n;
                }
            }
            else {
                final 0uL liz = 0uL.LIZ;
                final int ljii = liz.LJII(gQk2);
                final LinkPlayerInfo liz2 = entry.getValue().LIZ;
                liz.LIZ(gQk2, ljii + (liz2.LJIILL = 1), liz2, evr);
            }
        }
    }
    
    private final int LIZLLL(final GQk gQk) {
        final Iterator<Object> iterator = ((List<Object>)gQk).iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final 1P7 next = iterator.next();
            if (next instanceof 1P7 && next.LIZIZ == 0) {
                return n;
            }
            ++n;
        }
        return -1;
    }
    
    private final int LJ(final GQk gQk) {
        final Iterator<Object> iterator = ((List<Object>)gQk).iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final 1P7 next = iterator.next();
            if (next instanceof 1P7 && next.LIZIZ == 1) {
                return n;
            }
            ++n;
        }
        return -1;
    }
    
    private final 8u7<Integer, Integer, Integer> LJFF(final GQk gQk) {
        final ListIterator<Object> listIterator = ((List<Object>)gQk).listIterator(((List)gQk).size());
        int lizlll;
        int nextIndex;
        while (true) {
            LinkPlayerInfo previous;
            do {
                final boolean hasPrevious = listIterator.hasPrevious();
                lizlll = 0;
                if (hasPrevious) {
                    previous = listIterator.previous();
                }
                else {
                    lizlll = this.LIZLLL(gQk);
                    if (lizlll == -1) {
                        final int ljii = this.LJII(gQk);
                        return (8u7<Integer, Integer, Integer>)new 8u7((Object)ljii, (Object)(-1), (Object)ljii);
                    }
                    nextIndex = lizlll;
                    return (8u7<Integer, Integer, Integer>)new 8u7((Object)nextIndex, (Object)lizlll, (Object)nextIndex);
                }
            } while (!(previous instanceof LinkPlayerInfo) || previous.LJIILL != 2);
            if ((nextIndex = listIterator.nextIndex()) == -1) {
                continue;
            }
            break;
        }
        return (8u7<Integer, Integer, Integer>)new 8u7((Object)nextIndex, (Object)lizlll, (Object)nextIndex);
    }
    
    private final 8u7<Integer, Integer, Integer> LJI(final GQk gQk) {
        final ListIterator<Object> listIterator = ((List<Object>)gQk).listIterator(((List)gQk).size());
        while (true) {
            final boolean hasPrevious = listIterator.hasPrevious();
            final int lizlll = 0;
            if (!hasPrevious) {
                break;
            }
            final LinkPlayerInfo previous = listIterator.previous();
            if (!(previous instanceof LinkPlayerInfo)) {
                continue;
            }
            final LinkPlayerInfo linkPlayerInfo = previous;
            if (linkPlayerInfo.LJIILL != 2 || !linkPlayerInfo.LJIILLIIL) {
                continue;
            }
            final int n;
            if ((n = listIterator.nextIndex()) == -1) {
                break;
            }
            return (8u7<Integer, Integer, Integer>)new 8u7((Object)n, (Object)lizlll, (Object)n);
        }
        final int lizlll = this.LIZLLL(gQk);
        int n;
        if (lizlll == -1) {
            n = this.LJII(gQk);
        }
        else {
            n = lizlll;
        }
        return (8u7<Integer, Integer, Integer>)new 8u7((Object)n, (Object)lizlll, (Object)n);
    }
    
    private final int LJII(final GQk gQk) {
        final ListIterator<Object> listIterator = ((List<Object>)gQk).listIterator(((List)gQk).size());
        LinkPlayerInfo previous;
        int n;
        do {
            final boolean hasPrevious = listIterator.hasPrevious();
            final int nextIndex;
            n = (nextIndex = 0);
            if (!hasPrevious) {
                return nextIndex;
            }
            previous = listIterator.previous();
        } while (!(previous instanceof LinkPlayerInfo) || previous.LJIILL != 1);
        int nextIndex = listIterator.nextIndex();
        if (nextIndex == -1) {
            nextIndex = n;
            return nextIndex;
        }
        return nextIndex;
    }
    
    private final 8u7<Integer, Integer, Integer> LJIIIIZZ(final GQk gQk) {
        final ListIterator<Object> listIterator = ((List<Object>)gQk).listIterator(((List)gQk).size());
        int n;
        int nextIndex;
        while (true) {
            LinkPlayerInfo previous;
            do {
                final boolean hasPrevious = listIterator.hasPrevious();
                n = 0;
                final int n2 = 0;
                if (!hasPrevious) {
                    final Iterator<Object> iterator = ((List<Object>)gQk).iterator();
                    int n3 = n2;
                    while (iterator.hasNext()) {
                        if (iterator.next() instanceof 1ZV) {
                            if (n3 == -1) {
                                break;
                            }
                            final int n4 = n3;
                            n = n3;
                            nextIndex = n4;
                            return (8u7<Integer, Integer, Integer>)new 8u7((Object)nextIndex, (Object)n, (Object)nextIndex);
                        }
                        else {
                            ++n3;
                        }
                    }
                    final int liz = this.LIZ(gQk);
                    return (8u7<Integer, Integer, Integer>)new 8u7((Object)liz, (Object)(-1), (Object)liz);
                }
                previous = listIterator.previous();
            } while (!(previous instanceof LinkPlayerInfo) || previous.LJ != 1);
            if ((nextIndex = listIterator.nextIndex()) == -1) {
                continue;
            }
            break;
        }
        return (8u7<Integer, Integer, Integer>)new 8u7((Object)nextIndex, (Object)n, (Object)nextIndex);
    }
    
    public final int LIZ(final GQk gQk) {
        final ListIterator<Object> listIterator = ((List<Object>)gQk).listIterator(((List)gQk).size());
        LinkPlayerInfo previous;
        int n;
        do {
            final boolean hasPrevious = listIterator.hasPrevious();
            final int nextIndex;
            n = (nextIndex = 0);
            if (!hasPrevious) {
                return nextIndex;
            }
            previous = listIterator.previous();
        } while (!(previous instanceof LinkPlayerInfo) || previous.LJ != 2);
        int nextIndex = listIterator.nextIndex();
        if (nextIndex == -1) {
            nextIndex = n;
            return nextIndex;
        }
        return nextIndex;
    }
    
    public final Map<String, a> LIZ(final GQk gQk, final List<? extends LinkPlayerInfo> list) {
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        final LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (final LinkPlayerInfo next : gQk) {
            Objects.requireNonNull(next, "null cannot be cast to non-null type com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo");
            final LinkPlayerInfo linkPlayerInfo = next;
            linkedHashMap2.put(0uL.LIZ.LIZ(linkPlayerInfo), new 8si((Object)linkPlayerInfo, (Object)1));
        }
        if (list != null) {
            for (final LinkPlayerInfo linkPlayerInfo2 : list) {
                final String liz = 0uL.LIZ.LIZ(linkPlayerInfo2);
                final 8si 8si = (8si)linkedHashMap2.get(liz);
                if (8si != null) {
                    linkedHashMap2.put(liz, new 8si(8si.getFirst(), (Object)2));
                }
                else {
                    linkedHashMap.put(liz, new a(linkPlayerInfo2, false));
                }
            }
        }
        for (final Map.Entry<K, 8si> entry : linkedHashMap2.entrySet()) {
            if (((Number)entry.getValue().getSecond()).intValue() == 1) {
                linkedHashMap.put(entry.getKey(), new a((LinkPlayerInfo)entry.getValue().getFirst(), true));
            }
        }
        return linkedHashMap;
    }
    
    public final void LIZ(final GQk gQk, final int n, final Evr evr) {
        CTM.LIZ((Object)gQk, (Object)evr);
        try {
            gQk.remove(n);
            evr.LIZ((List)gQk);
            ((RecyclerView.a)evr).notifyItemRemoved(n);
            if (n != evr.LIZIZ.size()) {
                ((RecyclerView.a)evr).notifyItemRangeChanged(n, evr.LIZIZ.size() - n);
            }
        }
        finally {
            final Throwable t;
            0ba.LIZ("MultiGuestUpdateUserInfoHelper", "notifyItemRemoved failed,", t);
        }
    }
    
    public final void LIZ(final GQk gQk, final int n, final Object o, final Evr evr) {
        try {
            this.LIZIZ(gQk);
            gQk.add(n, o);
            evr.LIZ((List)gQk);
            ((RecyclerView.a)evr).notifyItemInserted(n);
            if (n != evr.LIZIZ.size()) {
                ((RecyclerView.a)evr).notifyItemRangeChanged(n, evr.LIZIZ.size() - n);
            }
        }
        finally {
            final Throwable t;
            0ba.LIZ("MultiGuestUpdateUserInfoHelper", "notifyItemInserted failed,", t);
        }
    }
    
    public final void LIZ(GQk gQk, final List<? extends LinkPlayerInfo> list, final Evr evr) {
        for (final Map.Entry<K, a> entry : this.LIZ(gQk, list).entrySet()) {
            final List liziz = evr.LIZIZ;
            Objects.requireNonNull(liziz, "null cannot be cast to non-null type me.drakeet.multitype.Items");
            final GQk gQk2 = (GQk)liziz;
            final boolean liziz2 = entry.getValue().LIZIZ;
            final int n = 0;
            if (liziz2) {
                final Iterator iterator2 = ((List)gQk2).iterator();
                int n2 = 0;
                while (iterator2.hasNext()) {
                    final Object next = iterator2.next();
                    if (next instanceof LinkPlayerInfo) {
                        final LinkPlayerInfo linkPlayerInfo = (LinkPlayerInfo)next;
                        final User lizj = linkPlayerInfo.LIZJ;
                        Object value = null;
                        Long value2;
                        if (lizj != null) {
                            value2 = lizj.getId();
                        }
                        else {
                            value2 = null;
                        }
                        final User lizj2 = entry.getValue().LIZ.LIZJ;
                        if (lizj2 != null) {
                            value = lizj2.getId();
                        }
                        if (kotlin.jvm.internal.n.LIZ((Object)value2, value) && linkPlayerInfo.LJ == 1) {
                            if (n2 != -1) {
                                0uL.LIZ.LIZ(gQk2, n2, evr);
                                break;
                            }
                            break;
                        }
                    }
                    ++n2;
                }
            }
            else {
                final 0uL liz = 0uL.LIZ;
                final 8u7<Integer, Integer, Integer> ljiiiizz = liz.LJIIIIZZ(gQk2);
                final int intValue = ((Number)ljiiiizz.getFirst()).intValue();
                final int intValue2 = ((Number)ljiiiizz.getSecond()).intValue();
                final int intValue3 = ((Number)ljiiiizz.getThird()).intValue();
                int n3;
                if (intValue2 == -1) {
                    if (list != null) {
                        liz.LIZ(gQk2, intValue3 + 1, new 1ZV(list.size()), evr);
                    }
                    n3 = 1;
                }
                else {
                    n3 = 0;
                }
                final LinkPlayerInfo liz2 = entry.getValue().LIZ;
                liz2.LJ = 1;
                int n4;
                if (n3 != 0) {
                    n4 = intValue3 + 2;
                }
                else {
                    n4 = intValue + 1;
                }
                liz.LIZ(gQk2, n4, liz2, evr);
            }
            if (list == null || list.isEmpty()) {
                final List liziz3 = evr.LIZIZ;
                Objects.requireNonNull(liziz3, "null cannot be cast to non-null type me.drakeet.multitype.Items");
                gQk = (GQk)liziz3;
                final Iterator<Object> iterator3 = ((List<Object>)gQk).iterator();
                int n5 = n;
                while (iterator3.hasNext()) {
                    if (iterator3.next() instanceof 1ZV) {
                        if (n5 != -1) {
                            0uL.LIZ.LIZ(gQk, n5, evr);
                            break;
                        }
                        break;
                    }
                    else {
                        ++n5;
                    }
                }
            }
        }
    }
    
    public final void LIZ(final boolean b, final b b2, final d d, final Evr evr) {
        CTM.LIZ((Object)b2, (Object)d, (Object)evr);
        final List<LinkPlayerInfo> liz = b2.LIZ;
        final List<LinkPlayerInfo> liziz = b2.LIZIZ;
        final List<LinkPlayerInfo> lizj = b2.LIZJ;
        final List<LinkPlayerInfo> lizlll = b2.LIZLLL;
        final GQk liz2 = d.LIZ;
        final GQk liziz2 = d.LIZIZ;
        final GQk lizj2 = d.LIZJ;
        final GQk lizlll2 = d.LIZLLL;
        this.LIZ(b, evr);
        this.LIZJ(liz2, liz, evr);
        this.LIZIZ(liziz2, lizj2, liziz, lizj, evr);
        this.LIZ(liziz2, lizj2, liziz, lizj, evr);
        this.LIZIZ(lizlll2, lizlll, evr);
    }
    
    public static final class a
    {
        public final LinkPlayerInfo LIZ;
        public final boolean LIZIZ;
        
        static {
            Covode.recordClassIndex(9465);
        }
        
        public a(final LinkPlayerInfo liz, final boolean liziz) {
            CTM.LIZ((Object)liz);
            this.LIZ = liz;
            this.LIZIZ = liziz;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this != o) {
                if (o instanceof a) {
                    final a a = (a)o;
                    if (n.LIZ((Object)this.LIZ, (Object)a.LIZ) && this.LIZIZ == a.LIZIZ) {
                        return true;
                    }
                }
                return false;
            }
            return true;
        }
        
        @Override
        public final int hashCode() {
            final LinkPlayerInfo liz = this.LIZ;
            int hashCode;
            if (liz != null) {
                hashCode = liz.hashCode();
            }
            else {
                hashCode = 0;
            }
            int liziz;
            if ((liziz = (this.LIZIZ ? 1 : 0)) != 0) {
                liziz = 1;
            }
            return hashCode * 31 + liziz;
        }
        
        @Override
        public final String toString() {
            final StringBuilder sb = new StringBuilder("LinkPlayerInfoDiffData(linkPlayerInfo=");
            sb.append(this.LIZ);
            sb.append(", isInOldList=");
            sb.append(this.LIZIZ);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class b
    {
        public final List<LinkPlayerInfo> LIZ;
        public final List<LinkPlayerInfo> LIZIZ;
        public final List<LinkPlayerInfo> LIZJ;
        public final List<LinkPlayerInfo> LIZLLL;
        
        static {
            Covode.recordClassIndex(9466);
        }
        
        public b(final List<? extends LinkPlayerInfo> liz, final List<? extends LinkPlayerInfo> liziz, final List<? extends LinkPlayerInfo> lizj, final List<? extends LinkPlayerInfo> lizlll) {
            this.LIZ = (List<LinkPlayerInfo>)liz;
            this.LIZIZ = (List<LinkPlayerInfo>)liziz;
            this.LIZJ = (List<LinkPlayerInfo>)lizj;
            this.LIZLLL = (List<LinkPlayerInfo>)lizlll;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this != o) {
                if (o instanceof b) {
                    final b b = (b)o;
                    if (n.LIZ((Object)this.LIZ, (Object)b.LIZ) && n.LIZ((Object)this.LIZIZ, (Object)b.LIZIZ) && n.LIZ((Object)this.LIZJ, (Object)b.LIZJ) && n.LIZ((Object)this.LIZLLL, (Object)b.LIZLLL)) {
                        return true;
                    }
                }
                return false;
            }
            return true;
        }
        
        @Override
        public final int hashCode() {
            final List<LinkPlayerInfo> liz = this.LIZ;
            int hashCode = 0;
            int hashCode2;
            if (liz != null) {
                hashCode2 = liz.hashCode();
            }
            else {
                hashCode2 = 0;
            }
            final List<LinkPlayerInfo> liziz = this.LIZIZ;
            int hashCode3;
            if (liziz != null) {
                hashCode3 = liziz.hashCode();
            }
            else {
                hashCode3 = 0;
            }
            final List<LinkPlayerInfo> lizj = this.LIZJ;
            int hashCode4;
            if (lizj != null) {
                hashCode4 = lizj.hashCode();
            }
            else {
                hashCode4 = 0;
            }
            final List<LinkPlayerInfo> lizlll = this.LIZLLL;
            if (lizlll != null) {
                hashCode = lizlll.hashCode();
            }
            return ((hashCode2 * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode;
        }
        
        @Override
        public final String toString() {
            final StringBuilder sb = new StringBuilder("NewUserListDataAnchorSide(onlineList=");
            sb.append(this.LIZ);
            sb.append(", connectingList=");
            sb.append(this.LIZIZ);
            sb.append(", waitingList=");
            sb.append(this.LIZJ);
            sb.append(", viewerList=");
            sb.append(this.LIZLLL);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class c
    {
        public final List<LinkPlayerInfo> LIZ;
        public final List<LinkPlayerInfo> LIZIZ;
        
        static {
            Covode.recordClassIndex(9467);
        }
        
        public c(final List<? extends LinkPlayerInfo> liz, final List<? extends LinkPlayerInfo> liziz) {
            this.LIZ = (List<LinkPlayerInfo>)liz;
            this.LIZIZ = (List<LinkPlayerInfo>)liziz;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this != o) {
                if (o instanceof c) {
                    final c c = (c)o;
                    if (n.LIZ((Object)this.LIZ, (Object)c.LIZ) && n.LIZ((Object)this.LIZIZ, (Object)c.LIZIZ)) {
                        return true;
                    }
                }
                return false;
            }
            return true;
        }
        
        @Override
        public final int hashCode() {
            final List<LinkPlayerInfo> liz = this.LIZ;
            int hashCode = 0;
            int hashCode2;
            if (liz != null) {
                hashCode2 = liz.hashCode();
            }
            else {
                hashCode2 = 0;
            }
            final List<LinkPlayerInfo> liziz = this.LIZIZ;
            if (liziz != null) {
                hashCode = liziz.hashCode();
            }
            return hashCode2 * 31 + hashCode;
        }
        
        @Override
        public final String toString() {
            final StringBuilder sb = new StringBuilder("NewUserListDataGuestSide(onlineList=");
            sb.append(this.LIZ);
            sb.append(", waitingList=");
            sb.append(this.LIZIZ);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class d
    {
        public final GQk LIZ;
        public final GQk LIZIZ;
        public final GQk LIZJ;
        public final GQk LIZLLL;
        
        static {
            Covode.recordClassIndex(9468);
        }
        
        public d(final GQk liz, final GQk liziz, final GQk lizj, final GQk lizlll) {
            CTM.LIZ((Object)liz, (Object)liziz, (Object)lizj, (Object)lizlll);
            this.LIZ = liz;
            this.LIZIZ = liziz;
            this.LIZJ = lizj;
            this.LIZLLL = lizlll;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this != o) {
                if (o instanceof d) {
                    final d d = (d)o;
                    if (n.LIZ((Object)this.LIZ, (Object)d.LIZ) && n.LIZ((Object)this.LIZIZ, (Object)d.LIZIZ) && n.LIZ((Object)this.LIZJ, (Object)d.LIZJ) && n.LIZ((Object)this.LIZLLL, (Object)d.LIZLLL)) {
                        return true;
                    }
                }
                return false;
            }
            return true;
        }
        
        @Override
        public final int hashCode() {
            final GQk liz = this.LIZ;
            int hashCode = 0;
            int hashCode2;
            if (liz != null) {
                hashCode2 = liz.hashCode();
            }
            else {
                hashCode2 = 0;
            }
            final GQk liziz = this.LIZIZ;
            int hashCode3;
            if (liziz != null) {
                hashCode3 = liziz.hashCode();
            }
            else {
                hashCode3 = 0;
            }
            final GQk lizj = this.LIZJ;
            int hashCode4;
            if (lizj != null) {
                hashCode4 = lizj.hashCode();
            }
            else {
                hashCode4 = 0;
            }
            final GQk lizlll = this.LIZLLL;
            if (lizlll != null) {
                hashCode = lizlll.hashCode();
            }
            return ((hashCode2 * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode;
        }
        
        @Override
        public final String toString() {
            final StringBuilder sb = new StringBuilder("OldUserItemsDataAnchorSide(oldOnlineItems=");
            sb.append(this.LIZ);
            sb.append(", oldConnectingItems=");
            sb.append(this.LIZIZ);
            sb.append(", oldWaitingItems=");
            sb.append(this.LIZJ);
            sb.append(", oldViewerItems=");
            sb.append(this.LIZLLL);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class e
    {
        public final GQk LIZ;
        public final GQk LIZIZ;
        
        static {
            Covode.recordClassIndex(9469);
        }
        
        public e(final GQk liz, final GQk liziz) {
            CTM.LIZ((Object)liz, (Object)liziz);
            this.LIZ = liz;
            this.LIZIZ = liziz;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this != o) {
                if (o instanceof e) {
                    final e e = (e)o;
                    if (n.LIZ((Object)this.LIZ, (Object)e.LIZ) && n.LIZ((Object)this.LIZIZ, (Object)e.LIZIZ)) {
                        return true;
                    }
                }
                return false;
            }
            return true;
        }
        
        @Override
        public final int hashCode() {
            final GQk liz = this.LIZ;
            int hashCode = 0;
            int hashCode2;
            if (liz != null) {
                hashCode2 = liz.hashCode();
            }
            else {
                hashCode2 = 0;
            }
            final GQk liziz = this.LIZIZ;
            if (liziz != null) {
                hashCode = liziz.hashCode();
            }
            return hashCode2 * 31 + hashCode;
        }
        
        @Override
        public final String toString() {
            final StringBuilder sb = new StringBuilder("OldUserItemsDataGuestSide(oldOnlineItems=");
            sb.append(this.LIZ);
            sb.append(", oldWaitingItems=");
            sb.append(this.LIZIZ);
            sb.append(")");
            return sb.toString();
        }
    }
}
