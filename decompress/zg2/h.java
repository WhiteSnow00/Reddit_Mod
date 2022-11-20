// 
// Decompiled by Procyon v0.6.0
// 

package zg2;

import ch2.g;
import ch2.v;
import oi2.u0;
import oi2.t;
import java.util.AbstractMap;
import kotlin.collections.c;
import kotlin.Pair;
import cg.d;
import kotlin.reflect.jvm.internal.impl.builtins.UnsignedArrayType;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.util.ArrayList;
import kotlin.reflect.jvm.internal.impl.builtins.UnsignedType;
import java.util.LinkedHashSet;
import yh2.b;
import java.util.HashMap;
import yh2.e;
import java.util.Set;

public final class h
{
    public static final Set<e> a;
    public static final Set<e> b;
    public static final HashMap<b, b> c;
    public static final HashMap<b, b> d;
    public static final LinkedHashSet e;
    
    static {
        final UnsignedType[] values = UnsignedType.values();
        final ArrayList list = new ArrayList<e>(values.length);
        final int length = values.length;
        final int n = 0;
        for (int i = 0; i < length; ++i) {
            list.add(values[i].getTypeName());
        }
        a = CollectionsKt___CollectionsKt.M5((Iterable)list);
        final UnsignedArrayType[] values2 = UnsignedArrayType.values();
        final ArrayList list2 = new ArrayList<e>(values2.length);
        for (int length2 = values2.length, j = 0; j < length2; ++j) {
            list2.add(values2[j].getTypeName());
        }
        b = CollectionsKt___CollectionsKt.M5((Iterable)list2);
        c = new HashMap<b, b>();
        d = new HashMap<b, b>();
        kotlin.collections.c.C4((AbstractMap)new HashMap(cg.d.p3(4)), new Pair[] { new Pair((Object)UnsignedArrayType.UBYTEARRAY, (Object)yh2.e.g("ubyteArrayOf")), new Pair((Object)UnsignedArrayType.USHORTARRAY, (Object)yh2.e.g("ushortArrayOf")), new Pair((Object)UnsignedArrayType.UINTARRAY, (Object)yh2.e.g("uintArrayOf")), new Pair((Object)UnsignedArrayType.ULONGARRAY, (Object)yh2.e.g("ulongArrayOf")) });
        final UnsignedType[] values3 = UnsignedType.values();
        final LinkedHashSet e2 = new LinkedHashSet();
        for (int length3 = values3.length, k = 0; k < length3; ++k) {
            e2.add(values3[k].getArrayClassId().j());
        }
        e = e2;
        final UnsignedType[] values4 = UnsignedType.values();
        for (int length4 = values4.length, l = n; l < length4; ++l) {
            final UnsignedType unsignedType = values4[l];
            h.c.put(unsignedType.getArrayClassId(), unsignedType.getClassId());
            h.d.put(unsignedType.getClassId(), unsignedType.getArrayClassId());
        }
    }
    
    public static final boolean a(final t t) {
        final boolean p = u0.p(t);
        final boolean b = false;
        if (p) {
            return false;
        }
        final ch2.e f = t.I0().f();
        if (f == null) {
            return false;
        }
        final g b2 = ((g)f).b();
        boolean b3 = b;
        if (b2 instanceof v) {
            b3 = b;
            if (ng2.e.a((Object)((v)b2).d(), (Object)kotlin.reflect.jvm.internal.impl.builtins.e.j)) {
                b3 = b;
                if (h.a.contains(((g)f).getName())) {
                    b3 = true;
                }
            }
        }
        return b3;
    }
}
