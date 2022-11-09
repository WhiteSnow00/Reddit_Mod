// 
// Decompiled by Procyon v0.6.0
// 

package sf;

import android.util.TypedValue;
import android.content.Context;

public final class b
{
    public static TypedValue a(final int n, final Context context) {
        final TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(n, typedValue, true)) {
            return typedValue;
        }
        return null;
    }
    
    public static int b(final Context context, final int n, final String s) {
        final TypedValue a = a(n, context);
        if (a != null) {
            return a.data;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", s, context.getResources().getResourceName(n)));
    }
}
