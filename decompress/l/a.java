// 
// Decompiled by Procyon v0.6.0
// 

package l;

import android.view.MenuItem$OnMenuItemClickListener;
import android.view.MenuItem$OnActionExpandListener;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.ContextMenu$ContextMenuInfo;
import android.view.View;
import android.view.ActionProvider;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.content.Intent;
import t3.b;

public final class a implements b
{
    public CharSequence a;
    public CharSequence b;
    public Intent c;
    public char d;
    public int e;
    public char f;
    public int g;
    public Drawable h;
    public Context i;
    public CharSequence j;
    public CharSequence k;
    public ColorStateList l;
    public PorterDuff$Mode m;
    public boolean n;
    public boolean o;
    public int p;
    
    public a(final Context i, final CharSequence a) {
        this.e = 4096;
        this.g = 4096;
        this.l = null;
        this.m = null;
        this.n = false;
        this.o = false;
        this.p = 16;
        this.i = i;
        this.a = a;
    }
    
    @Override
    public final b a(final a4.b b) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public final a4.b b() {
        return null;
    }
    
    public final void c() {
        final Drawable h = this.h;
        if (h != null && (this.n || this.o)) {
            this.h = h;
            final Drawable mutate = h.mutate();
            this.h = mutate;
            if (this.n) {
                r3.a.b.h(mutate, this.l);
            }
            if (this.o) {
                r3.a.b.i(this.h, this.m);
            }
        }
    }
    
    @Override
    public final boolean collapseActionView() {
        return false;
    }
    
    @Override
    public final boolean expandActionView() {
        return false;
    }
    
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public final View getActionView() {
        return null;
    }
    
    @Override
    public final int getAlphabeticModifiers() {
        return this.g;
    }
    
    public final char getAlphabeticShortcut() {
        return this.f;
    }
    
    @Override
    public final CharSequence getContentDescription() {
        return this.j;
    }
    
    public final int getGroupId() {
        return 0;
    }
    
    public final Drawable getIcon() {
        return this.h;
    }
    
    @Override
    public final ColorStateList getIconTintList() {
        return this.l;
    }
    
    @Override
    public final PorterDuff$Mode getIconTintMode() {
        return this.m;
    }
    
    public final Intent getIntent() {
        return this.c;
    }
    
    public final int getItemId() {
        return 16908332;
    }
    
    public final ContextMenu$ContextMenuInfo getMenuInfo() {
        return null;
    }
    
    @Override
    public final int getNumericModifiers() {
        return this.e;
    }
    
    public final char getNumericShortcut() {
        return this.d;
    }
    
    public final int getOrder() {
        return 0;
    }
    
    public final SubMenu getSubMenu() {
        return null;
    }
    
    public final CharSequence getTitle() {
        return this.a;
    }
    
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.b;
        if (charSequence == null) {
            charSequence = this.a;
        }
        return charSequence;
    }
    
    @Override
    public final CharSequence getTooltipText() {
        return this.k;
    }
    
    public final boolean hasSubMenu() {
        return false;
    }
    
    @Override
    public final boolean isActionViewExpanded() {
        return false;
    }
    
    public final boolean isCheckable() {
        final int p = this.p;
        boolean b = true;
        if ((p & 0x1) == 0x0) {
            b = false;
        }
        return b;
    }
    
    public final boolean isChecked() {
        return (this.p & 0x2) != 0x0;
    }
    
    public final boolean isEnabled() {
        return (this.p & 0x10) != 0x0;
    }
    
    public final boolean isVisible() {
        return (this.p & 0x8) == 0x0;
    }
    
    public final MenuItem setActionProvider(final ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public final MenuItem setActionView(final int n) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public final MenuItem setActionView(final View view) {
        throw new UnsupportedOperationException();
    }
    
    public final MenuItem setAlphabeticShortcut(final char c) {
        this.f = Character.toLowerCase(c);
        return (MenuItem)this;
    }
    
    @Override
    public final MenuItem setAlphabeticShortcut(final char c, final int n) {
        this.f = Character.toLowerCase(c);
        this.g = KeyEvent.normalizeMetaState(n);
        return (MenuItem)this;
    }
    
    public final MenuItem setCheckable(final boolean b) {
        this.p = ((b ? 1 : 0) | (this.p & 0xFFFFFFFE));
        return (MenuItem)this;
    }
    
    public final MenuItem setChecked(final boolean b) {
        final int p = this.p;
        int n;
        if (b) {
            n = 2;
        }
        else {
            n = 0;
        }
        this.p = (n | (p & 0xFFFFFFFD));
        return (MenuItem)this;
    }
    
    public final MenuItem setContentDescription(final CharSequence j) {
        this.j = j;
        return (MenuItem)this;
    }
    
    @Override
    public final b setContentDescription(final CharSequence j) {
        this.j = j;
        return this;
    }
    
    public final MenuItem setEnabled(final boolean b) {
        final int p = this.p;
        int n;
        if (b) {
            n = 16;
        }
        else {
            n = 0;
        }
        this.p = (n | (p & 0xFFFFFFEF));
        return (MenuItem)this;
    }
    
    public final MenuItem setIcon(final int n) {
        this.h = n3.a.getDrawable(this.i, n);
        this.c();
        return (MenuItem)this;
    }
    
    public final MenuItem setIcon(final Drawable h) {
        this.h = h;
        this.c();
        return (MenuItem)this;
    }
    
    @Override
    public final MenuItem setIconTintList(final ColorStateList l) {
        this.l = l;
        this.n = true;
        this.c();
        return (MenuItem)this;
    }
    
    @Override
    public final MenuItem setIconTintMode(final PorterDuff$Mode m) {
        this.m = m;
        this.o = true;
        this.c();
        return (MenuItem)this;
    }
    
    public final MenuItem setIntent(final Intent c) {
        this.c = c;
        return (MenuItem)this;
    }
    
    public final MenuItem setNumericShortcut(final char d) {
        this.d = d;
        return (MenuItem)this;
    }
    
    @Override
    public final MenuItem setNumericShortcut(final char d, final int n) {
        this.d = d;
        this.e = KeyEvent.normalizeMetaState(n);
        return (MenuItem)this;
    }
    
    public final MenuItem setOnActionExpandListener(final MenuItem$OnActionExpandListener menuItem$OnActionExpandListener) {
        throw new UnsupportedOperationException();
    }
    
    public final MenuItem setOnMenuItemClickListener(final MenuItem$OnMenuItemClickListener menuItem$OnMenuItemClickListener) {
        return (MenuItem)this;
    }
    
    public final MenuItem setShortcut(final char d, final char c) {
        this.d = d;
        this.f = Character.toLowerCase(c);
        return (MenuItem)this;
    }
    
    @Override
    public final MenuItem setShortcut(final char d, final char c, final int n, final int n2) {
        this.d = d;
        this.e = KeyEvent.normalizeMetaState(n);
        this.f = Character.toLowerCase(c);
        this.g = KeyEvent.normalizeMetaState(n2);
        return (MenuItem)this;
    }
    
    @Override
    public final void setShowAsAction(final int n) {
    }
    
    @Override
    public final MenuItem setShowAsActionFlags(final int n) {
        return (MenuItem)this;
    }
    
    public final MenuItem setTitle(final int n) {
        this.a = this.i.getResources().getString(n);
        return (MenuItem)this;
    }
    
    public final MenuItem setTitle(final CharSequence a) {
        this.a = a;
        return (MenuItem)this;
    }
    
    public final MenuItem setTitleCondensed(final CharSequence b) {
        this.b = b;
        return (MenuItem)this;
    }
    
    public final MenuItem setTooltipText(final CharSequence k) {
        this.k = k;
        return (MenuItem)this;
    }
    
    @Override
    public final b setTooltipText(final CharSequence k) {
        this.k = k;
        return this;
    }
    
    public final MenuItem setVisible(final boolean b) {
        final int p = this.p;
        int n = 8;
        if (b) {
            n = 0;
        }
        this.p = ((p & 0x8) | n);
        return (MenuItem)this;
    }
}
