// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.discoveryunits.domain;

import java.util.Iterator;
import java.util.ArrayList;
import zg2.p;
import jj2.u;
import zg2.l;
import jj2.k;
import java.util.List;
import java.util.Collection;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.text.b;
import bv2.a;
import kotlin.text.Regex;
import kotlin.jvm.internal.Ref$IntRef;
import ah2.f;

public final class AppVersionNameConverter
{
    public static long a(final String s) {
        f.f((Object)s, "versionName");
        final Ref$IntRef ref$IntRef = new Ref$IntRef();
        ref$IntRef.element = 1;
        if (!new Regex("[0-9.]+").matches((CharSequence)s)) {
            a.a.d(a40.f.n("The version name ", s, " is invalid"), new Object[0]);
            return Long.MAX_VALUE;
        }
        final ArrayList i2 = CollectionsKt___CollectionsKt.i2((Collection)b.D2(0, 6, (CharSequence)s, new char[] { '.' }));
        while (i2.size() < 3) {
            i2.add("0");
        }
        final List k1 = kotlin.sequences.b.k1((k)new u((k)kotlin.sequences.b.d1((k)CollectionsKt___CollectionsKt.e1((Iterable)CollectionsKt___CollectionsKt.Q1((List)i2)), (l)AppVersionNameConverter$convertVersionNameToValue$1.INSTANCE), (p)new AppVersionNameConverter$convertVersionNameToValue$2(ref$IntRef)));
        long n = 0L;
        final Iterator iterator = k1.iterator();
        while (iterator.hasNext()) {
            n += ((Number)iterator.next()).longValue();
        }
        return n;
    }
}
