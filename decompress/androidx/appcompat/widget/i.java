// 
// Decompiled by Procyon v0.6.0
// 

package androidx.appcompat.widget;

import android.graphics.drawable.Drawable;
import android.content.Context;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuff$Mode;

public final class i
{
    public static final PorterDuff$Mode b;
    public static i c;
    public ResourceManagerInternal a;
    
    static {
        b = PorterDuff$Mode.SRC_IN;
    }
    
    public static i a() {
        synchronized (i.class) {
            if (i.c == null) {
                d();
            }
            return i.c;
        }
    }
    
    public static PorterDuffColorFilter c(final int n, final PorterDuff$Mode porterDuff$Mode) {
        synchronized (i.class) {
            return ResourceManagerInternal.getPorterDuffColorFilter(n, porterDuff$Mode);
        }
    }
    
    public static void d() {
        synchronized (i.class) {
            if (i.c == null) {
                (i.c = new i()).a = ResourceManagerInternal.get();
                i.c.a.setHooks((ResourceManagerInternal.c)new i$a());
            }
        }
    }
    
    public final Drawable b(final Context context, final int n) {
        synchronized (this) {
            return this.a.getDrawable(context, n);
        }
    }
}
