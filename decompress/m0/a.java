// 
// Decompiled by Procyon v0.6.0
// 

package m0;

import a4.j1;
import a4.k1;
import sg2.e;
import android.widget.EdgeEffect;
import android.util.AttributeSet;
import android.content.Context;

public final class a
{
    public static final a a;
    
    static {
        a = new a();
    }
    
    public final EdgeEffect a(Context context, final AttributeSet set) {
        e.f((Object)context, "context");
        EdgeEffect edgeEffect;
        try {
            context = (Context)new EdgeEffect(context, set);
        }
        finally {
            edgeEffect = new EdgeEffect(context);
        }
        return edgeEffect;
    }
    
    public final float b(final EdgeEffect edgeEffect) {
        e.f((Object)edgeEffect, "edgeEffect");
        float n;
        try {
            k1.a(edgeEffect);
        }
        finally {
            n = 0.0f;
        }
        return n;
    }
    
    public final float c(final EdgeEffect edgeEffect, float a, final float n) {
        e.f((Object)edgeEffect, "edgeEffect");
        try {
            a = j1.a(edgeEffect, a, n);
        }
        finally {
            edgeEffect.onPull(a, n);
            a = 0.0f;
        }
        return a;
    }
}
