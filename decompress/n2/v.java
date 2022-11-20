// 
// Decompiled by Procyon v0.6.0
// 

package n2;

import a4.q;
import ng2.e;
import android.graphics.Typeface;
import android.content.Context;

public final class v
{
    public static final v a;
    
    static {
        a = new v();
    }
    
    public final Typeface a(final Context context, final u u) {
        e.f((Object)context, "context");
        e.f((Object)u, "font");
        final Typeface e = q.e(context.getResources(), u.a);
        ng2.e.e((Object)e, "context.resources.getFont(font.resId)");
        return e;
    }
}
