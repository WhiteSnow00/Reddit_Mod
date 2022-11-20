// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.platform;

import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import android.os.Bundle;
import h1.c;
import h1.b;
import l5.b$b;

public final class h0 implements b$b
{
    public final b a;
    
    public h0(final c a) {
        this.a = (b)a;
    }
    
    public final Bundle D() {
        final Map b = this.a.b();
        final Bundle bundle = new Bundle();
        for (final Map.Entry<String, V> entry : b.entrySet()) {
            final String s = entry.getKey();
            final List list = (List)entry.getValue();
            ArrayList list2;
            if (list instanceof ArrayList) {
                list2 = (ArrayList)list;
            }
            else {
                list2 = new ArrayList(list);
            }
            bundle.putParcelableArrayList(s, list2);
        }
        return bundle;
    }
}
