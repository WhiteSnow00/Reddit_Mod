// 
// Decompiled by Procyon v0.6.0
// 

package cg;

import vf.h;
import vf.c;
import android.graphics.RectF;
import vf.j$b;

public final class j implements j$b
{
    public final /* synthetic */ RectF a;
    
    public j(final RectF a) {
        this.a = a;
    }
    
    public final c a(c c) {
        if (!(c instanceof h)) {
            c = (c)new h(c.a(this.a) / this.a.height());
        }
        return c;
    }
}
