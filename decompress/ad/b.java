// 
// Decompiled by Procyon v0.6.0
// 

package ad;

import com.google.common.collect.ImmutableCollection$a;
import java.util.Iterator;
import java.util.Collection;
import java.util.List;
import com.google.common.collect.ImmutableList$a;
import android.os.Bundle;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import com.google.android.exoplayer2.f;

public final class b
{
    public static ImmutableList a(final f.a a, final ArrayList list) {
        final ImmutableList$a builder = ImmutableList.builder();
        for (int i = 0; i < list.size(); ++i) {
            final Bundle bundle = (Bundle)list.get(i);
            bundle.getClass();
            ((ImmutableCollection$a)builder).c(a.a(bundle));
        }
        return builder.f();
    }
    
    public static List b(final f.a a, final ArrayList list, ImmutableList a2) {
        if (list != null) {
            a2 = a(a, list);
        }
        return (List)a2;
    }
    
    public static <T extends f> T c(final f.a<T> a, final Bundle bundle) {
        f a2;
        if (bundle == null) {
            a2 = null;
        }
        else {
            a2 = a.a(bundle);
        }
        return (T)a2;
    }
    
    public static <T extends f> ArrayList<Bundle> d(final Collection<T> collection) {
        final ArrayList list = new ArrayList(collection.size());
        final Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            list.add(((f)iterator.next()).toBundle());
        }
        return list;
    }
    
    public static Bundle e(final f f) {
        Bundle bundle;
        if (f == null) {
            bundle = null;
        }
        else {
            bundle = f.toBundle();
        }
        return bundle;
    }
}
