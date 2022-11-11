// 
// Decompiled by Procyon v0.6.0
// 

package x3;

import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver$OnPreDrawListener;
import android.content.res.Resources$Theme;
import android.util.TypedValue;
import sg2.e;
import android.os.Build$VERSION;
import android.app.Activity;

public final class c
{
    public final b a;
    
    public c(final Activity activity) {
        Object a;
        if (Build$VERSION.SDK_INT >= 31) {
            a = new c$a(activity);
        }
        else {
            a = new b(activity);
        }
        this.a = (b)a;
    }
    
    public static class b
    {
        public final Activity a;
        public c b;
        
        public b(final Activity a) {
            e.f((Object)a, "activity");
            this.a = a;
            this.b = (c)new a();
        }
        
        public void a() {
            final TypedValue typedValue = new TypedValue();
            final Resources$Theme theme = ((Context)this.a).getTheme();
            theme.resolveAttribute(2130970075, typedValue, true);
            if (theme.resolveAttribute(2130970073, typedValue, true)) {
                theme.getDrawable(typedValue.resourceId);
            }
            theme.resolveAttribute(2130969806, typedValue, true);
            this.c(theme, typedValue);
        }
        
        public void b(final ep0.a b) {
            this.b = (c)b;
            final View viewById = this.a.findViewById(16908290);
            viewById.getViewTreeObserver().addOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)new x3.b(this, viewById));
        }
        
        public final void c(final Resources$Theme resources$Theme, final TypedValue typedValue) {
            if (resources$Theme.resolveAttribute(2130969478, typedValue, true)) {
                final int resourceId = typedValue.resourceId;
                if (resourceId != 0) {
                    this.a.setTheme(resourceId);
                }
            }
        }
    }
    
    public interface c
    {
        boolean a();
    }
}
