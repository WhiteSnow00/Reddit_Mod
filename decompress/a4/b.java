// 
// Decompiled by Procyon v0.6.0
// 

package a4;

import android.util.Log;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.l;
import android.view.MenuItem;
import android.view.View;

public abstract class b
{
    public a a;
    
    public boolean a() {
        return false;
    }
    
    public boolean b() {
        return true;
    }
    
    public abstract View c();
    
    public View d(final MenuItem menuItem) {
        return this.c();
    }
    
    public boolean e() {
        return false;
    }
    
    public void f(final l l) {
    }
    
    public boolean g() {
        return false;
    }
    
    public void h(final g.g$a a) {
        if (this.a != null) {
            final StringBuilder k = a.k("setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this ");
            k.append(this.getClass().getSimpleName());
            k.append(" instance while it is still in use somewhere else?");
            Log.w("ActionProvider(support)", k.toString());
        }
        this.a = (a)a;
    }
    
    public interface a
    {
    }
}
