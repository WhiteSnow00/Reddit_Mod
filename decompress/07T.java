// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.SubMenu;
import android.view.MenuItem;
import android.view.View;
import com.bytedance.covode.number.Covode;

public abstract class 07t
{
    public a LIZJ;
    
    static {
        Covode.recordClassIndex(838);
    }
    
    public abstract View LIZ();
    
    public View LIZ(final MenuItem menuItem) {
        return this.LIZ();
    }
    
    public void LIZ(final b b) {
    }
    
    public void LIZ(final SubMenu subMenu) {
    }
    
    public final void LIZ(final boolean b) {
        final a lizj = this.LIZJ;
        if (lizj != null) {
            lizj.LIZIZ(b);
        }
    }
    
    public boolean LIZIZ() {
        return false;
    }
    
    public boolean LIZJ() {
        return false;
    }
    
    public boolean LIZLLL() {
        return false;
    }
    
    public boolean LJ() {
        return true;
    }
    
    public interface a
    {
        default static {
            Covode.recordClassIndex(839);
        }
        
        void LIZIZ(final boolean p0);
    }
    
    public interface b
    {
        default static {
            Covode.recordClassIndex(840);
        }
        
        void LIZ();
    }
}
