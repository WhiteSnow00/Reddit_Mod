// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation;

import zg2.a;
import androidx.compose.runtime.saveable.b;
import zg2.q;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.platform.InspectableValueKt;
import ah2.f;
import j1.d;

public final class g
{
    public static d a(final d d, final ScrollState scrollState) {
        f.f((Object)d, "<this>");
        f.f((Object)scrollState, "state");
        return ComposedModifierKt.a(d, InspectableValueKt.a, (q)new ScrollKt$scroll$2(false, scrollState, true, null, false));
    }
    
    public static final ScrollState b(final z0.d d) {
        d.A(-1464256199);
        final ScrollState scrollState = (ScrollState)b.a(new Object[0], ScrollState.f, (a)new ScrollKt$rememberScrollState$1(0), d, 4);
        d.I();
        return scrollState;
    }
    
    public static d c(final d d, final ScrollState scrollState) {
        f.f((Object)d, "<this>");
        f.f((Object)scrollState, "state");
        return ComposedModifierKt.a(d, InspectableValueKt.a, (q)new ScrollKt$scroll$2(true, scrollState, true, null, false));
    }
}
