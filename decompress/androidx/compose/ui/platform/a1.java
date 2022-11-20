// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.platform;

import ng2.e;
import java.util.ArrayList;
import h2.h;
import java.util.List;
import e2.c0;

public final class a1 implements c0
{
    public final int f;
    public final List<a1> g;
    public Float h;
    public Float i;
    public h j;
    public h k;
    
    public a1(final int f, final ArrayList g) {
        e.f((Object)g, "allScopes");
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
