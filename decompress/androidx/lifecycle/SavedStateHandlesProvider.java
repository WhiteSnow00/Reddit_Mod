// 
// Decompiled by Procyon v0.6.0
// 

package androidx.lifecycle;

import java.util.Iterator;
import java.util.Map;
import kotlin.a;
import pg2.f;
import android.os.Bundle;
import m5.b;
import m5.b$b;

public final class SavedStateHandlesProvider implements b$b
{
    public final b a;
    public boolean b;
    public Bundle c;
    public final f d;
    
    public SavedStateHandlesProvider(final b a, final q0 q0) {
        ah2.f.f((Object)a, "savedStateRegistry");
        ah2.f.f((Object)q0, "viewModelStoreOwner");
        this.a = a;
        this.d = kotlin.a.b((zg2.a)new SavedStateHandlesProvider$viewModel$2(q0));
    }
    
    public final Bundle E() {
        final Bundle bundle = new Bundle();
        final Bundle c = this.c;
        if (c != null) {
            bundle.putAll(c);
        }
        for (final Map.Entry<String, V> entry : ((g0)this.d.getValue()).d.entrySet()) {
            final String s = entry.getKey();
            final Bundle e = ((f0)entry.getValue()).e.E();
            if (!ah2.f.a((Object)e, (Object)Bundle.EMPTY)) {
                bundle.putBundle(s, e);
            }
        }
        this.b = false;
        return bundle;
    }
}
