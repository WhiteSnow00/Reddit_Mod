// 
// Decompiled by Procyon v0.6.0
// 

package k;

import android.view.MenuItem;
import android.view.MenuInflater;
import androidx.appcompat.view.menu.MenuBuilder;
import android.view.View;

public abstract class b
{
    public Object f;
    public boolean g;
    
    public abstract void c();
    
    public abstract View d();
    
    public abstract MenuBuilder e();
    
    public abstract MenuInflater f();
    
    public abstract CharSequence g();
    
    public abstract CharSequence h();
    
    public abstract void i();
    
    public abstract boolean j();
    
    public abstract void k(final View p0);
    
    public abstract void l(final int p0);
    
    public abstract void m(final CharSequence p0);
    
    public abstract void n(final int p0);
    
    public abstract void o(final CharSequence p0);
    
    public abstract void p(final boolean p0);
    
    public interface a
    {
        boolean a(final b p0, final MenuBuilder p1);
        
        boolean b(final b p0, final MenuBuilder p1);
        
        boolean c(final b p0, final MenuItem p1);
        
        void d(final b p0);
    }
}
