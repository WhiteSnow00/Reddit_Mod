// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.platform;

import a4.v;
import sg2.e;
import android.graphics.Typeface;
import android.content.Context;

public final class w
{
    public static final w a;
    
    static {
        a = new w();
    }
    
    public final Typeface a(final Context context, final int n) {
        e.f((Object)context, "context");
        final Typeface d = v.d(context.getResources(), n);
        e.e((Object)d, "context.resources.getFont(resourceId)");
        return d;
    }
}
