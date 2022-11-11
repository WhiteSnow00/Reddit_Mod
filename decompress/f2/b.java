// 
// Decompiled by Procyon v0.6.0
// 

package f2;

import android.view.MenuItem;
import android.view.ActionMode;
import java.util.List;
import android.os.RemoteException;
import ge.qb;
import java.util.Collection;
import ge.gd;
import java.util.ArrayList;
import android.util.Base64;
import android.text.TextUtils;
import ge.kd;
import ge.bc;
import sg2.e;
import androidx.compose.ui.platform.actionmodecallback.MenuItemOption;
import android.view.Menu;
import n1.d;
import rg2.a;
import ge.jd;
import ge.ad;
import ge.vc;
import ge.r5;
import androidx.lifecycle.w;
import ge.ic;

public final class b implements ic
{
    public final Object f = f;
    public Object g = null;
    public Object h = null;
    public Object i = null;
    public Object j = null;
    public Object k = e;
    
    public static void a(final Menu menu, final MenuItemOption menuItemOption) {
        e.f((Object)menu, "menu");
        e.f((Object)menuItemOption, "item");
        menu.add(0, menuItemOption.getId(), menuItemOption.getOrder(), menuItemOption.getTitleResource()).setShowAsAction(1);
    }
    
    public static void c(final Menu menu, final MenuItemOption menuItemOption, final a a) {
        if (a != null && menu.findItem(menuItemOption.getId()) == null) {
            a(menu, menuItemOption);
        }
        else if (a == null && menu.findItem(menuItemOption.getId()) != null) {
            menu.removeItem(menuItemOption.getId());
        }
    }
    
    @Override
    public final void b(final String s) {
        ((ic)this.j).b(s);
    }
    
    @Override
    public final void d(final bc bc) {
        final kd kd = (kd)bc;
        final jd jd = (jd)this.f;
        jd.getClass();
        lw0.b.O("EMAIL");
        final boolean contains = jd.i.g.contains("EMAIL");
        final List list = null;
        if (contains) {
            ((vc)this.g).g = null;
        }
        else {
            final String g = ((jd)this.f).g;
            if (g != null) {
                ((vc)this.g).g = g;
            }
        }
        final jd jd2 = (jd)this.f;
        jd2.getClass();
        lw0.b.O("DISPLAY_NAME");
        if (jd2.i.g.contains("DISPLAY_NAME")) {
            ((vc)this.g).i = null;
        }
        else {
            this.f.getClass();
        }
        final jd jd3 = (jd)this.f;
        jd3.getClass();
        lw0.b.O("PHOTO_URL");
        if (jd3.i.g.contains("PHOTO_URL")) {
            ((vc)this.g).j = null;
        }
        else {
            this.f.getClass();
        }
        if (!TextUtils.isEmpty((CharSequence)((jd)this.f).h)) {
            final vc vc = (vc)this.g;
            final byte[] bytes = "redacted".getBytes();
            String encodeToString;
            if (bytes == null) {
                encodeToString = null;
            }
            else {
                encodeToString = Base64.encodeToString(bytes, 0);
            }
            vc.getClass();
            lw0.b.O(encodeToString);
            vc.l = encodeToString;
        }
        final gd f = kd.f;
        List f2 = list;
        if (f != null) {
            f2 = f.f;
        }
        List list2;
        if ((list2 = f2) == null) {
            list2 = new ArrayList();
        }
        final vc vc2 = (vc)this.g;
        vc2.getClass();
        final gd k = new gd();
        vc2.k = k;
        k.f.addAll(list2);
        final r5 r5 = (r5)this.h;
        final ad ad = (ad)this.i;
        lw0.b.R((Object)ad);
        final String g2 = kd.g;
        final String h = kd.h;
        ad ad2 = ad;
        if (!TextUtils.isEmpty((CharSequence)g2)) {
            ad2 = ad;
            if (!TextUtils.isEmpty((CharSequence)h)) {
                ad2 = new ad(h, g2, Long.valueOf(kd.i), ad.i);
            }
        }
        final vc vc3 = (vc)this.g;
        r5.getClass();
        try {
            ((qb)r5.f).d(ad2, vc3);
        }
        catch (final RemoteException ex) {
            ((sd.a)r5.g).b((Exception)ex, "RemoteException when sending get token and account info user response", new Object[0]);
        }
    }
    
    public final boolean e(final ActionMode actionMode, final MenuItem menuItem) {
        e.c((Object)menuItem);
        final int itemId = menuItem.getItemId();
        if (itemId == MenuItemOption.Copy.getId()) {
            final a a = (a)this.g;
            if (a != null) {
                a.invoke();
            }
        }
        else if (itemId == MenuItemOption.Paste.getId()) {
            final a a2 = (a)this.h;
            if (a2 != null) {
                a2.invoke();
            }
        }
        else if (itemId == MenuItemOption.Cut.getId()) {
            final a a3 = (a)this.i;
            if (a3 != null) {
                a3.invoke();
            }
        }
        else {
            if (itemId != MenuItemOption.SelectAll.getId()) {
                return false;
            }
            final a a4 = (a)this.j;
            if (a4 != null) {
                a4.invoke();
            }
        }
        if (actionMode != null) {
            actionMode.finish();
        }
        return true;
    }
    
    public final void f(final ActionMode actionMode, final Menu menu) {
        if (menu == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        if (actionMode != null) {
            if (this.g != null) {
                a(menu, MenuItemOption.Copy);
            }
            if (this.h != null) {
                a(menu, MenuItemOption.Paste);
            }
            if (this.i != null) {
                a(menu, MenuItemOption.Cut);
            }
            if (this.j != null) {
                a(menu, MenuItemOption.SelectAll);
            }
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
