// 
// Decompiled by Procyon v0.6.0
// 

package androidx.work;

import java.util.Iterator;
import java.util.Map;
import java.util.Collections;
import java.util.HashMap;
import java.util.ArrayList;
import c6.f;

public final class OverwritingInputMerger extends f
{
    public final b a(final ArrayList list) {
        final b$a b$a = new b$a();
        final HashMap hashMap = new HashMap();
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            hashMap.putAll(Collections.unmodifiableMap((Map<?, ?>)((b)iterator.next()).a));
        }
        b$a.c((Map)hashMap);
        return b$a.a();
    }
}
