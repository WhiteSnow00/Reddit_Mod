// 
// Decompiled by Procyon v0.6.0
// 

package l;

import android.view.SubMenu;
import t3.c;
import android.view.MenuItem;
import j0.i;
import android.content.Context;

public abstract class b
{
    public final Context a;
    public i<t3.b, MenuItem> b;
    public i<c, SubMenu> c;
    
    public b(final Context a) {
        this.a = a;
    }
    
    public final MenuItem c(MenuItem o) {
        if (o instanceof t3.b) {
            final t3.b b = (t3.b)o;
            if (this.b == null) {
                this.b = (i<t3.b, MenuItem>)new i();
            }
            if ((o = this.b.getOrDefault((Object)b, (Object)null)) == null) {
                o = new l.c(this.a, b);
                this.b.put((Object)b, o);
            }
            return (MenuItem)o;
        }
        return (MenuItem)o;
    }
    
    public final SubMenu d(SubMenu o) {
        if (o instanceof c) {
            final c c = (c)o;
            if (this.c == null) {
                this.c = (i<c, SubMenu>)new i();
            }
            if ((o = this.c.getOrDefault((Object)c, (Object)null)) == null) {
                o = new g(this.a, c);
                this.c.put((Object)c, o);
            }
            return (SubMenu)o;
        }
        return (SubMenu)o;
    }
}
