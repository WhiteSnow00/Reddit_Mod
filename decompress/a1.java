// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.platform;

import ah2.f;
import java.util.ArrayList;
import h2.h;
import java.util.List;
import e2.n;

public final class a1 implements n
{
    public final int f;
    public final List<a1> g;
    public Float h;
    public Float i;
    public h j;
    public h k;
    
    public a1(final int f, final ArrayList g) {
        ah2.f.f((Object)g, "allScopes");
        this.f = f;
        this.g = g;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = null;
    }
    
    public final boolean isValid() {
        return this.g.contains(this);
    }
}
