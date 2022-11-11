// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.text.selection;

import java.util.Map;
import w0.g;
import rg2.a;
import androidx.compose.runtime.CompositionLocalKt;
import z0.r;

public final class SelectionRegistrarKt
{
    public static final r a;
    
    static {
        a = CompositionLocalKt.c((a)SelectionRegistrarKt$LocalSelectionRegistrar$1.INSTANCE);
    }
    
    public static final boolean a(final g g, final long n) {
        if (g != null) {
            final Map d = g.d();
            if (d != null) {
                return d.containsKey(n);
            }
        }
        return false;
    }
}
