// 
// Decompiled by Procyon v0.6.0
// 

package k;

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
        return (Menu)new e(this.a, (a)this.b.e());
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
}
