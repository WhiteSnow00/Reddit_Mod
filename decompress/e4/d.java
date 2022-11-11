// 
// Decompiled by Procyon v0.6.0
// 

package e4;

import a4.j1;
import a4.k1;
import android.util.AttributeSet;
import android.content.Context;
import android.os.Build$VERSION;
import android.widget.EdgeEffect;

public final class d
{
    public static float a(final EdgeEffect edgeEffect) {
        if (Build$VERSION.SDK_INT >= 31) {
            return b.b(edgeEffect);
        }
        return 0.0f;
    }
    
    public static float b(final EdgeEffect edgeEffect, final float n, final float n2) {
        if (Build$VERSION.SDK_INT >= 31) {
            return b.c(edgeEffect, n, n2);
        }
        a.a(edgeEffect, n, n2);
        return n;
    }
    
    public static final class a
    {
        public static void a(final EdgeEffect edgeEffect, final float n, final float n2) {
            edgeEffect.onPull(n, n2);
        }
    }
    
    public static final class b
    {
        public static EdgeEffect a(final Context context, final AttributeSet set) {
            try {
                return new EdgeEffect(context, set);
            }
            finally {
                return new EdgeEffect(context);
            }
        }
        
        public static float b(final EdgeEffect edgeEffect) {
            try {
                return k1.a(edgeEffect);
            }
            finally {
                return 0.0f;
            }
        }
        
        public static float c(final EdgeEffect edgeEffect, final float n, final float n2) {
            try {
                return j1.a(edgeEffect, n, n2);
            }
            finally {
                edgeEffect.onPull(n, n2);
                return 0.0f;
            }
        }
    }
}
