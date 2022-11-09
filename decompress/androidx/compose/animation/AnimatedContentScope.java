// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.animation;

import ah2.f;
import androidx.compose.ui.unit.LayoutDirection;
import u2.i;
import z0.e1;
import java.util.LinkedHashMap;
import z0.l0;
import j1.a;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.Transition$b;

public final class AnimatedContentScope<S> implements Transition$b<S>
{
    public final Transition<S> a;
    public a b;
    public final l0 c;
    public final LinkedHashMap d;
    public e1<i> e;
    
    public AnimatedContentScope(final Transition<S> a, final a b, final LayoutDirection layoutDirection) {
        f.f((Object)a, "transition");
        f.f((Object)b, "contentAlignment");
        f.f((Object)layoutDirection, "layoutDirection");
        this.a = a;
        this.b = b;
        this.c = a80.a.n0(new i(0L));
        this.d = new LinkedHashMap();
    }
    
    public final S b() {
        return (S)this.a.c().b();
    }
    
    public final S c() {
        return (S)this.a.c().c();
    }
}
