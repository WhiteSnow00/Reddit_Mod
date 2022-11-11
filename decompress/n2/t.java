// 
// Decompiled by Procyon v0.6.0
// 

package n2;

import a4.v;
import sg2.e;
import android.graphics.Typeface;
import android.content.Context;

public final class t
{
    public static final t a;
    
    static {
        a = new t();
    }
    
    public final Typeface a(final Context context, final s s) {
        e.f((Object)context, "context");
        e.f((Object)s, "font");
        final Typeface d = v.d(context.getResources(), s.a);
        e.e((Object)d, "context.resources.getFont(font.resId)");
        return d;
    }
}
