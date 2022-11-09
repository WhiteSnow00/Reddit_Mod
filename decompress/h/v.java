// 
// Decompiled by Procyon v0.6.0
// 

package h;

import androidx.appcompat.view.menu.MenuBuilder$a;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.i$a;
import androidx.appcompat.widget.ActionMenuView;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.BitmapDrawable;
import android.view.Menu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import java.util.WeakHashMap;
import android.view.View;
import a4.p0;
import android.content.Context;
import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import android.view.Window$Callback;
import androidx.appcompat.widget.c1;

public final class v extends a
{
    public final c1 a;
    public final Window$Callback b;
    public final e c;
    public boolean d;
    public boolean e;
    public boolean f;
    public ArrayList<a$b> g;
    public final v$a h;
    
    public v(final Toolbar toolbar, final CharSequence windowTitle, final f.i i) {
        this.g = new ArrayList<a$b>();
        this.h = new v$a(this);
        final Toolbar.h onMenuItemClickListener = new Toolbar.h() {
            @Override
            public final boolean onMenuItemClick(final MenuItem menuItem) {
                return v.this.b.onMenuItemSelected(0, menuItem);
            }
        };
        toolbar.getClass();
        final c1 a = new c1(toolbar, false);
        this.a = a;
        i.getClass();
        this.b = (Window$Callback)i;
        a.l = (Window$Callback)i;
        toolbar.setOnMenuItemClickListener((Toolbar.h)onMenuItemClickListener);
        a.setWindowTitle(windowTitle);
        this.c = new e();
    }
    
    public final boolean a() {
        return this.a.e();
    }
    
    public final boolean b() {
        if (this.a.h()) {
            this.a.collapseActionView();
            return true;
        }
        return false;
    }
    
    public final void c(final boolean f) {
        if (f == this.f) {
            return;
        }
        this.f = f;
        for (int size = this.g.size(), i = 0; i < size; ++i) {
            this.g.get(i).a();
        }
    }
    
    public final int d() {
        return this.a.b;
    }
    
    public final Context e() {
        return this.a.getContext();
    }
    
    public final void f() {
        this.a.q(8);
    }
    
    public final boolean g() {
        ((View)this.a.a).removeCallbacks((Runnable)this.h);
        final Toolbar a = this.a.a;
        final v$a h = this.h;
        final WeakHashMap a2 = p0.a;
        p0.d.m((View)a, (Runnable)h);
        return true;
    }
    
    public final void h() {
    }
    
    public final void i() {
        ((View)this.a.a).removeCallbacks((Runnable)this.h);
    }
    
    public final boolean j(final int n, final KeyEvent keyEvent) {
        final Menu y = this.y();
        if (y != null) {
            int deviceId;
            if (keyEvent != null) {
                deviceId = keyEvent.getDeviceId();
            }
            else {
                deviceId = -1;
            }
            final int keyboardType = KeyCharacterMap.load(deviceId).getKeyboardType();
            boolean qwertyMode = true;
            if (keyboardType == 1) {
                qwertyMode = false;
            }
            y.setQwertyMode(qwertyMode);
            return y.performShortcut(n, keyEvent, 0);
        }
        return false;
    }
    
    public final boolean k(final KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            this.l();
        }
        return true;
    }
    
    public final boolean l() {
        return this.a.c();
    }
    
    public final void m(final boolean b) {
    }
    
    public final void n(final boolean b) {
        this.z(4, 4);
    }
    
    public final void o() {
        this.z(2, 2);
    }
    
    public final void p() {
        this.z(0, 8);
    }
    
    public final void q(final boolean b) {
    }
    
    public final void r(final BitmapDrawable icon) {
        this.a.setIcon((Drawable)icon);
    }
    
    public final void s() {
        this.a.o(null);
    }
    
    public final void t(final boolean b) {
    }
    
    public final void u(final String title) {
        this.a.setTitle(title);
    }
    
    public final void v(final CharSequence windowTitle) {
        this.a.setWindowTitle(windowTitle);
    }
    
    public final void w() {
        this.a.q(0);
    }
    
    public final Menu y() {
        if (!this.e) {
            final c1 a = this.a;
            final c c = new c();
            final d d = new d();
            final Toolbar a2 = a.a;
            a2.S = (i$a)c;
            a2.T = (MenuBuilder$a)d;
            final ActionMenuView f = a2.f;
            if (f != null) {
                f.k = (i$a)c;
                f.l = (MenuBuilder$a)d;
            }
            this.e = true;
        }
        return this.a.a.getMenu();
    }
    
    public final void z(final int n, final int n2) {
        final c1 a = this.a;
        a.i((n & n2) | (~n2 & a.b));
    }
    
    public final class c implements i$a
    {
        public boolean f;
        
        public final void b(final MenuBuilder menuBuilder, final boolean b) {
            if (this.f) {
                return;
            }
            this.f = true;
            v.this.a.m();
            v.this.b.onPanelClosed(108, (Menu)menuBuilder);
            this.f = false;
        }
        
        public final boolean c(final MenuBuilder menuBuilder) {
            v.this.b.onMenuOpened(108, (Menu)menuBuilder);
            return true;
        }
    }
    
    public final class d implements MenuBuilder$a
    {
        public final boolean a(final MenuBuilder menuBuilder, final MenuItem menuItem) {
            return false;
        }
        
        public final void b(final MenuBuilder menuBuilder) {
            if (v.this.a.d()) {
                v.this.b.onPanelClosed(108, (Menu)menuBuilder);
            }
            else if (v.this.b.onPreparePanel(0, (View)null, (Menu)menuBuilder)) {
                v.this.b.onMenuOpened(108, (Menu)menuBuilder);
            }
        }
    }
    
    public final class e implements f$c
    {
    }
}
