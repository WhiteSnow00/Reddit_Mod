// 
// Decompiled by Procyon v0.6.0
// 

package androidx.appcompat.widget;

import android.view.MenuItem;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuBuilder$a;

public final class l0 implements MenuBuilder$a
{
    public final /* synthetic */ o0 f;
    
    public l0(final o0 f) {
        this.f = f;
    }
    
    public final boolean a(final MenuBuilder menuBuilder, final MenuItem menuItem) {
        final o0.a e = this.f.e;
        return e != null && e.onMenuItemClick(menuItem);
    }
    
    public final void b(final MenuBuilder menuBuilder) {
    }
}
