// 
// Decompiled by Procyon v0.6.0
// 

package androidx.core.app;

import a4.q0;
import android.os.Build$VERSION;
import android.view.View;
import android.app.Dialog;

public class DialogCompat
{
    private DialogCompat() {
    }
    
    public static View requireViewById(final Dialog dialog, final int n) {
        if (Build$VERSION.SDK_INT >= 28) {
            return a.a(dialog, n);
        }
        final View viewById = dialog.findViewById(n);
        if (viewById != null) {
            return viewById;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this Dialog");
    }
    
    public static final class a
    {
        public static <T> T a(final Dialog dialog, final int n) {
            return (T)q0.b(dialog, n);
        }
    }
}
