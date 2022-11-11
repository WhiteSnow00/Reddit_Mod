// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.material;

import androidx.compose.ui.ComposedModifierKt;
import x0.q;
import androidx.compose.ui.platform.InspectableValueKt;
import x0.m;
import o0.j;
import androidx.compose.foundation.gestures.Orientation;
import l0.d0;
import rg2.a;
import androidx.compose.runtime.saveable.SaverKt;
import x0.o;
import rg2.l;
import z0.d;
import sg2.e;
import java.util.Map;
import java.util.List;
import java.util.Iterator;
import java.util.Collection;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.util.ArrayList;
import rg2.p;
import java.util.Set;

public final class b
{
    public static final float a(float floatValue, final float n, final Set set, final p p6, final float n2, final float n3) {
        final ArrayList list = new ArrayList();
        final Iterator iterator = set.iterator();
        while (true) {
            final boolean hasNext = iterator.hasNext();
            boolean b = true;
            if (!hasNext) {
                break;
            }
            final Object next = iterator.next();
            if (((Number)next).floatValue() > floatValue + 0.001) {
                b = false;
            }
            if (!b) {
                continue;
            }
            list.add(next);
        }
        final Float o3 = CollectionsKt___CollectionsKt.O3((Collection)list);
        final ArrayList<Number> list2 = new ArrayList<Number>();
        for (final Object next2 : set) {
            if (((Number)next2).floatValue() >= floatValue - 0.001) {
                list2.add((Number)next2);
            }
        }
        final Float q3 = CollectionsKt___CollectionsKt.Q3((Collection)list2);
        List list3;
        if (o3 == null) {
            list3 = lw0.b.t1((Object)q3);
        }
        else if (q3 == null) {
            list3 = lw0.b.r1((Object)o3);
        }
        else if (o3 == (float)q3) {
            list3 = lw0.b.r1((Object)o3);
        }
        else {
            list3 = lw0.b.s1((Object[])new Float[] { o3, q3 });
        }
        final int size = list3.size();
        if (size != 0) {
            if (size != 1) {
                final float floatValue2 = list3.get(0).floatValue();
                final float floatValue3 = list3.get(1).floatValue();
                Label_0400: {
                    if (n <= floatValue) {
                        if (n2 >= n3) {
                            floatValue = floatValue3;
                            return floatValue;
                        }
                        if (floatValue < ((Number)p6.invoke(floatValue2, floatValue3)).floatValue()) {
                            break Label_0400;
                        }
                    }
                    else {
                        if (n2 <= -n3) {
                            floatValue = floatValue2;
                            return floatValue;
                        }
                        if (floatValue <= ((Number)p6.invoke(floatValue3, floatValue2)).floatValue()) {
                            break Label_0400;
                        }
                    }
                    floatValue = floatValue3;
                    return floatValue;
                }
                floatValue = floatValue2;
            }
            else {
                floatValue = ((Number)list3.get(0)).floatValue();
            }
        }
        else {
            floatValue = n;
        }
        return floatValue;
    }
    
    public static final Float b(final Map map, final Object o) {
        final Iterator iterator = map.entrySet().iterator();
        while (true) {
            Object next;
            do {
                final boolean hasNext = iterator.hasNext();
                final Float n = null;
                if (!hasNext) {
                    next = null;
                    final Map.Entry<Float, V> entry = (Map.Entry<Float, V>)next;
                    Float n2 = n;
                    if (entry != null) {
                        n2 = entry.getKey();
                    }
                    return n2;
                }
                next = iterator.next();
            } while (!e.a(((Map.Entry<K, Object>)next).getValue(), o));
            continue;
        }
    }
    
    public static final SwipeableState c(final d d, final Integer n, final l l) {
        e.f((Object)n, "initialValue");
        d.A(-1237755169);
        final d0<Float> a = o.a;
        e.f((Object)l, "confirmStateChange");
        final SwipeableState swipeableState = (SwipeableState)androidx.compose.runtime.saveable.b.a(new Object[0], SaverKt.a(new SwipeableState$Companion$Saver$2((l0.d<Float>)a, l), SwipeableState$Companion$Saver$1.INSTANCE), new SwipeableKt$rememberSwipeableState$2(n, (l0.d<Float>)a, l), d, 4);
        d.I();
        return swipeableState;
    }
    
    public static j1.d d(final j1.d d, final SwipeableState swipeableState, final Map map, final Orientation orientation, boolean b, boolean b2, final j j, p instance, final m m, final int n) {
        if ((n & 0x8) != 0x0) {
            b = true;
        }
        if ((n & 0x10) != 0x0) {
            b2 = false;
        }
        j i;
        if ((n & 0x20) != 0x0) {
            i = null;
        }
        else {
            i = j;
        }
        if ((n & 0x40) != 0x0) {
            instance = SwipeableKt$swipeable$1.INSTANCE;
        }
        m k;
        if ((n & 0x80) != 0x0) {
            final d0<Float> a = o.a;
            final Set keySet = map.keySet();
            e.f((Object)keySet, "anchors");
            if (keySet.size() <= 1) {
                k = null;
            }
            else {
                final Float o3 = CollectionsKt___CollectionsKt.O3((Collection)keySet);
                e.c((Object)o3);
                final float floatValue = o3;
                final Float q3 = CollectionsKt___CollectionsKt.Q3((Collection)keySet);
                e.c((Object)q3);
                k = new m(floatValue - q3, 10.0f, 10.0f);
            }
        }
        else {
            k = m;
        }
        float b3;
        if ((n & 0x100) != 0x0) {
            b3 = o.b;
        }
        else {
            b3 = 0.0f;
        }
        e.f((Object)d, "$this$swipeable");
        e.f((Object)swipeableState, "state");
        e.f((Object)map, "anchors");
        e.f((Object)orientation, "orientation");
        e.f((Object)instance, "thresholds");
        return ComposedModifierKt.a(d, InspectableValueKt.a, (rg2.q)new SwipeableKt$swipeable$3(map, swipeableState, orientation, b, i, b2, k, instance, b3));
    }
}
