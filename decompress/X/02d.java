// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.Iterator;
import com.bytedance.covode.number.Covode;
import android.view.SubMenu;
import android.view.MenuItem;
import java.util.Map;
import android.content.Context;

public abstract class 02d
{
    public final Context LIZ;
    public Map<05o, MenuItem> LIZIZ;
    public Map<13w, SubMenu> LIZJ;
    
    static {
        Covode.recordClassIndex(338);
    }
    
    public 02d(final Context liz) {
        this.LIZ = liz;
    }
    
    public final MenuItem LIZ(MenuItem menuItem) {
        Object o = menuItem;
        if (menuItem instanceof 05o) {
            final 05o 05o = (05o)menuItem;
            if (this.LIZIZ == null) {
                this.LIZIZ = new 13j<05o, MenuItem>();
            }
            menuItem = this.LIZIZ.get(menuItem);
            if ((o = menuItem) == null) {
                o = new 133(this.LIZ, 05o);
                this.LIZIZ.put(05o, (MenuItem)o);
            }
        }
        return (MenuItem)o;
    }
    
    public final SubMenu LIZ(SubMenu o) {
        if (o instanceof 13w) {
            final 13w 13w = (13w)o;
            if (this.LIZJ == null) {
                this.LIZJ = new 13j<13w, SubMenu>();
            }
            if ((o = this.LIZJ.get(13w)) == null) {
                o = new 1fa(this.LIZ, 13w);
                this.LIZJ.put(13w, (SubMenu)o);
            }
            return (SubMenu)o;
        }
        return (SubMenu)o;
    }
    
    public final void LIZ() {
        final Map<05o, MenuItem> liziz = this.LIZIZ;
        if (liziz != null) {
            liziz.clear();
        }
        final Map<13w, SubMenu> lizj = this.LIZJ;
        if (lizj != null) {
            lizj.clear();
        }
    }
    
    public final void LIZ(final int n) {
        final Map<05o, MenuItem> liziz = this.LIZIZ;
        if (liziz == null) {
            return;
        }
        final Iterator<05o> iterator = liziz.keySet().iterator();
        while (iterator.hasNext()) {
            if (n == ((MenuItem)iterator.next()).getGroupId()) {
                iterator.remove();
            }
        }
    }
    
    public final void LIZIZ(final int n) {
        final Map<05o, MenuItem> liziz = this.LIZIZ;
        if (liziz == null) {
            return;
        }
        final Iterator<05o> iterator = liziz.keySet().iterator();
        while (iterator.hasNext()) {
            if (n == ((MenuItem)iterator.next()).getItemId()) {
                iterator.remove();
                break;
            }
        }
    }
}
