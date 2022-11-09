// 
// Decompiled by Procyon v0.6.0
// 

package n2;

import a4.u;
import ah2.f;
import android.graphics.Typeface;
import android.content.Context;

public final class t
{
    public static final t a;
    
    static {
        a = new t();
    }
    
    public final Typeface a(final Context context, final s s) {
        f.f((Object)context, "context");
        f.f((Object)s, "font");
        final Typeface b = u.b(context.getResources(), s.a);
        f.e((Object)b, "context.resources.getFont(font.resId)");
        return b;
    }
}
