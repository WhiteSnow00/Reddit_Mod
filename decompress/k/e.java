// 
// Decompiled by Procyon v0.6.0
// 

package k;

import android.view.MenuInflater;
import androidx.appcompat.widget.c;
import android.view.MenuItem;
import androidx.appcompat.view.menu.MenuBuilder;
import android.view.View;
import java.lang.ref.WeakReference;
import androidx.appcompat.widget.ActionBarContextView;
import android.content.Context;
import androidx.appcompat.view.menu.MenuBuilder$a;

public final class e extends b implements MenuBuilder$a
{
    public Context h;
    public ActionBarContextView i;
    public a j;
    public WeakReference<View> k;
    public boolean l;
    public MenuBuilder m;
    
    public e(final Context h, final ActionBarContextView i, final a j) {
        this.h = h;
        this.i = i;
        this.j = j;
        (this.m = new MenuBuilder(((View)i).getContext()).setDefaultShowAsAction(1)).setCallback((MenuBuilder.MenuBuilder$a)this);
    }
    
    public final boolean a(final MenuBuilder menuBuilder, final MenuItem menuItem) {
        return this.j.c(this, menuItem);
    }
    
    public final void b(final MenuBuilder menuBuilder) {
        this.i();
        final c i = this.i.i;
        if (i != null) {
            i.n();
        }
    }
    
    @Override
    public final void c() {
        if (this.l) {
            return;
        }
        this.l = true;
        this.j.d(this);
    }
    
    @Override
    public final View d() {
        final WeakReference<View> k = this.k;
        View view;
        if (k != null) {
            view = k.get();
        }
        else {
            view = null;
        }
        return view;
    }
    
    @Override
    public final MenuBuilder e() {
        return this.m;
    }
    
    @Override
    public final MenuInflater f() {
        return new g(((View)this.i).getContext());
    }
    
    @Override
    public final CharSequence g() {
        return this.i.getSubtitle();
    }
    
    @Override
    public final CharSequence h() {
        return this.i.getTitle();
    }
    
    @Override
    public final void i() {
        this.j.a(this, this.m);
    }
    
    @Override
    public final boolean j() {
        return this.i.x;
    }
    
    @Override
    public final void k(final View customView) {
        this.i.setCustomView(customView);
        WeakReference k;
        if (customView != null) {
            k = new WeakReference((T)customView);
        }
        else {
            k = null;
        }
        this.k = k;
    }
    
    @Override
    public final void l(final int n) {
        this.m(this.h.getString(n));
    }
    
    @Override
    public final void m(final CharSequence subtitle) {
        this.i.setSubtitle(subtitle);
    }
    
    @Override
    public final void n(final int n) {
        this.o(this.h.getString(n));
    }
    
    @Override
    public final void o(final CharSequence title) {
        this.i.setTitle(title);
    }
    
    @Override
    public final void p(final boolean b) {
        super.g = b;
        this.i.setTitleOptional(b);
    }
}
