// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.Set;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;

public final class 15j implements b
{
    public final /* synthetic */ 0Bl LIZ;
    
    static {
        Covode.recordClassIndex(1232);
    }
    
    public 15j(final 0Bl liz) {
        this.LIZ = liz;
    }
    
    @Override
    public final Bundle LIZ() {
        for (final Map.Entry<K, b> entry : new HashMap(this.LIZ.LIZIZ).entrySet()) {
            this.LIZ.LIZ((String)entry.getKey(), entry.getValue().LIZ());
        }
        final Set<String> keySet = this.LIZ.LIZ.keySet();
        final ArrayList list = new ArrayList(keySet.size());
        final ArrayList list2 = new ArrayList<Object>(list.size());
        for (final Object next : keySet) {
            list.add(next);
            list2.add(this.LIZ.LIZ.get(next));
        }
        final Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("keys", list);
        bundle.putParcelableArrayList("values", list2);
        return bundle;
    }
}
