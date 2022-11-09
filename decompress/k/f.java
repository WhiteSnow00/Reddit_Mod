// 
// Decompiled by Procyon v0.6.0
// 

package k;

import l.c;
import android.view.MenuItem;
import androidx.appcompat.view.menu.MenuBuilder;
import j0.i;
import java.util.ArrayList;
import android.view.ActionMode$Callback;
import android.view.MenuInflater;
import t3.a;
import l.e;
import android.view.Menu;
import android.view.View;
import android.content.Context;
import android.view.ActionMode;

public final class f extends ActionMode
{
    public final Context a;
    public final b b;
    
    public f(final Context a, final b b) {
        this.a = a;
        this.b = b;
    }
    
    public final void finish() {
        this.b.c();
    }
    
    public final View getCustomView() {
        return this.b.d();
    }
    
    public final Menu getMenu() {
        return (Menu)new e(this.a, (t3.a)this.b.e());
    }
    
    public final MenuInflater getMenuInflater() {
        return this.b.f();
    }
    
    public final CharSequence getSubtitle() {
        return this.b.g();
    }
    
    public final Object getTag() {
        return this.b.f;
    }
    
    public final CharSequence getTitle() {
        return this.b.h();
    }
    
    public final boolean getTitleOptionalHint() {
        return this.b.g;
    }
    
    public final void invalidate() {
        this.b.i();
    }
    
    public final boolean isTitleOptional() {
        return this.b.j();
    }
    
    public final void setCustomView(final View view) {
        this.b.k(view);
    }
    
    public final void setSubtitle(final int n) {
        this.b.l(n);
    }
    
    public final void setSubtitle(final CharSequence charSequence) {
        this.b.m(charSequence);
    }
    
    public final void setTag(final Object f) {
        this.b.f = f;
    }
    
    public final void setTitle(final int n) {
        this.b.n(n);
    }
    
    public final void setTitle(final CharSequence charSequence) {
        this.b.o(charSequence);
    }
    
    public final void setTitleOptionalHint(final boolean b) {
        this.b.p(b);
    }
    
    public static final class a implements b.a
    {
        public final ActionMode$Callback a;
        public final Context b;
        public final ArrayList<f> c;
        public final i<Menu, Menu> d;
        
        public a(final Context b, final ActionMode$Callback a) {
            this.b = b;
            this.a = a;
            this.c = new ArrayList<f>();
            this.d = (i<Menu, Menu>)new i();
        }
        
        @Override
        public final boolean a(final b b, final MenuBuilder menuBuilder) {
            final ActionMode$Callback a = this.a;
            final f e = this.e(b);
            Object o;
            if ((o = this.d.getOrDefault((Object)menuBuilder, (Object)null)) == null) {
                o = new e(this.b, (t3.a)menuBuilder);
                this.d.put((Object)menuBuilder, o);
            }
            return a.onPrepareActionMode((ActionMode)e, (Menu)o);
        }
        
        @Override
        public final boolean b(final b b, final MenuBuilder menuBuilder) {
            final ActionMode$Callback a = this.a;
            final f e = this.e(b);
            Object o;
            if ((o = this.d.getOrDefault((Object)menuBuilder, (Object)null)) == null) {
                o = new e(this.b, (t3.a)menuBuilder);
                this.d.put((Object)menuBuilder, o);
            }
            return a.onCreateActionMode((ActionMode)e, (Menu)o);
        }
        
        @Override
        public final boolean c(final b b, final MenuItem menuItem) {
            return this.a.onActionItemClicked((ActionMode)this.e(b), (MenuItem)new c(this.b, (t3.b)menuItem));
        }
        
        @Override
        public final void d(final b b) {
            this.a.onDestroyActionMode((ActionMode)this.e(b));
        }
        
        public final f e(final b b) {
            for (int size = this.c.size(), i = 0; i < size; ++i) {
                final f f = this.c.get(i);
                if (f != null && f.b == b) {
                    return f;
                }
            }
            final f f2 = new f(this.b, b);
            this.c.add(f2);
            return f2;
        }
    }
}
