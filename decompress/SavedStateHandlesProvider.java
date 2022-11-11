// 
// Decompiled by Procyon v0.6.0
// 

package androidx.lifecycle;

import java.util.Iterator;
import java.util.Map;
import kotlin.a;
import sg2.e;
import hg2.f;
import android.os.Bundle;
import m5.b;

public final class SavedStateHandlesProvider implements b
{
    public final m5.b a;
    public boolean b;
    public Bundle c;
    public final f d;
    
    public SavedStateHandlesProvider(final m5.b a, final q0 q0) {
        sg2.e.f((Object)a, "savedStateRegistry");
        sg2.e.f((Object)q0, "viewModelStoreOwner");
        this.a = a;
        this.d = kotlin.a.b((rg2.a)new SavedStateHandlesProvider$viewModel.SavedStateHandlesProvider$viewModel$2(q0));
    }
    
    @Override
    public final Bundle D() {
        final Bundle bundle = new Bundle();
        final Bundle c = this.c;
        if (c != null) {
            bundle.putAll(c);
        }
        for (final Map.Entry<String, V> entry : this.d.getValue().d.entrySet()) {
            final String s = entry.getKey();
            final Bundle d = ((f0)entry.getValue()).e.D();
            if (!sg2.e.a((Object)d, (Object)Bundle.EMPTY)) {
                bundle.putBundle(s, d);
            }
        }
        this.b = false;
        return bundle;
    }
}
