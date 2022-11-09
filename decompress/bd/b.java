// 
// Decompiled by Procyon v0.6.0
// 

package bd;

import com.google.common.collect.ImmutableCollection$a;
import java.util.Iterator;
import java.util.Collection;
import com.google.android.exoplayer2.f;
import java.util.List;
import com.google.common.collect.ImmutableList$a;
import android.os.Bundle;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import com.google.android.exoplayer2.f$a;

public final class b
{
    public static ImmutableList a(final f$a f$a, final ArrayList list) {
        final ImmutableList$a builder = ImmutableList.builder();
        for (int i = 0; i < list.size(); ++i) {
            final Bundle bundle = (Bundle)list.get(i);
            bundle.getClass();
            ((ImmutableCollection$a)builder).c((Object)f$a.a(bundle));
        }
        return builder.f();
    }
    
    public static List b(final f$a f$a, final ArrayList list, ImmutableList a) {
        if (list != null) {
            a = a(f$a, list);
        }
        return (List)a;
    }
    
    public static <T extends f> T c(final f$a<T> f$a, final Bundle bundle) {
        f a;
        if (bundle == null) {
            a = null;
        }
        else {
            a = f$a.a(bundle);
        }
        return (T)a;
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
