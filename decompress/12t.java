// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.MenuItem$OnMenuItemClickListener;
import android.view.MenuItem$OnActionExpandListener;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.ContextMenu$ContextMenuInfo;
import android.view.View;
import android.view.ActionProvider;
import com.bytedance.covode.number.Covode;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.content.Intent;

public final class 12t implements 05o
{
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public CharSequence LIZLLL;
    public CharSequence LJ;
    public Intent LJFF;
    public char LJI;
    public int LJII;
    public char LJIIIIZZ;
    public int LJIIIZ;
    public Drawable LJIIJ;
    public Context LJIIJJI;
    public CharSequence LJIIL;
    public CharSequence LJIILIIL;
    public ColorStateList LJIILJJIL;
    public PorterDuff$Mode LJIILL;
    public boolean LJIILLIIL;
    public boolean LJIIZILJ;
    public int LJIJ;
    
    static {
        Covode.recordClassIndex(336);
    }
    
    public 12t(final Context ljiijji, final CharSequence lizlll) {
        this.LJII = 4096;
        this.LJIIIZ = 4096;
        this.LJIJ = 16;
        this.LJIIJJI = ljiijji;
        this.LIZ = 16908332;
        this.LIZIZ = 0;
        this.LIZJ = 0;
        this.LIZLLL = lizlll;
    }
    
    private void LIZIZ() {
        final Drawable ljiij = this.LJIIJ;
        if (ljiij != null && (this.LJIILLIIL || this.LJIIZILJ)) {
            final Drawable liziz = 08U.LIZIZ(ljiij);
            this.LJIIJ = liziz;
            final Drawable mutate = liziz.mutate();
            this.LJIIJ = mutate;
            if (this.LJIILLIIL) {
                mutate.setTintList(this.LJIILJJIL);
            }
            if (this.LJIIZILJ) {
                this.LJIIJ.setTintMode(this.LJIILL);
            }
        }
    }
    
    @Override
    public final 05o LIZ(final 07t 07t) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public final 05o LIZ(final CharSequence ljiil) {
        this.LJIIL = ljiil;
        return this;
    }
    
    @Override
    public final 07t LIZ() {
        return null;
    }
    
    @Override
    public final 05o LIZIZ(final CharSequence ljiiliil) {
        this.LJIILIIL = ljiiliil;
        return this;
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
        return this.LJIIIZ;
    }
    
    public final char getAlphabeticShortcut() {
        return this.LJIIIIZZ;
    }
    
    @Override
    public final CharSequence getContentDescription() {
        return this.LJIIL;
    }
    
    public final int getGroupId() {
        return this.LIZIZ;
    }
    
    public final Drawable getIcon() {
        return this.LJIIJ;
    }
    
    @Override
    public final ColorStateList getIconTintList() {
        return this.LJIILJJIL;
    }
    
    @Override
    public final PorterDuff$Mode getIconTintMode() {
        return this.LJIILL;
    }
    
    public final Intent getIntent() {
        return this.LJFF;
    }
    
    public final int getItemId() {
        return this.LIZ;
    }
    
    public final ContextMenu$ContextMenuInfo getMenuInfo() {
        return null;
    }
    
    @Override
    public final int getNumericModifiers() {
        return this.LJII;
    }
    
    public final char getNumericShortcut() {
        return this.LJI;
    }
    
    public final int getOrder() {
        return this.LIZJ;
    }
    
    public final SubMenu getSubMenu() {
        return null;
    }
    
    public final CharSequence getTitle() {
        return this.LIZLLL;
    }
    
    public final CharSequence getTitleCondensed() {
        final CharSequence lj = this.LJ;
        if (lj != null) {
            return lj;
        }
        return this.LIZLLL;
    }
    
    @Override
    public final CharSequence getTooltipText() {
        return this.LJIILIIL;
    }
    
    public final boolean hasSubMenu() {
        return false;
    }
    
    @Override
    public final boolean isActionViewExpanded() {
        return false;
    }
    
    public final boolean isCheckable() {
        return (this.LJIJ & 0x1) != 0x0;
    }
    
    public final boolean isChecked() {
        return (this.LJIJ & 0x2) != 0x0;
    }
    
    public final boolean isEnabled() {
        return (this.LJIJ & 0x10) != 0x0;
    }
    
    public final boolean isVisible() {
        return (this.LJIJ & 0x8) == 0x0;
    }
    
    public final MenuItem setActionProvider(final ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }
    
    public final MenuItem setAlphabeticShortcut(final char c) {
        this.LJIIIIZZ = Character.toLowerCase(c);
        return (MenuItem)this;
    }
    
    @Override
    public final MenuItem setAlphabeticShortcut(final char c, final int n) {
        this.LJIIIIZZ = Character.toLowerCase(c);
        this.LJIIIZ = KeyEvent.normalizeMetaState(n);
        return (MenuItem)this;
    }
    
    public final MenuItem setCheckable(final boolean b) {
        this.LJIJ = ((b ? 1 : 0) | (this.LJIJ & 0xFFFFFFFE));
        return (MenuItem)this;
    }
    
    public final MenuItem setChecked(final boolean b) {
        final int ljij = this.LJIJ;
        int n;
        if (b) {
            n = 2;
        }
        else {
            n = 0;
        }
        this.LJIJ = (n | (ljij & 0xFFFFFFFD));
        return (MenuItem)this;
    }
    
    public final MenuItem setEnabled(final boolean b) {
        final int ljij = this.LJIJ;
        int n;
        if (b) {
            n = 16;
        }
        else {
            n = 0;
        }
        this.LJIJ = (n | (ljij & 0xFFFFFFEF));
        return (MenuItem)this;
    }
    
    public final MenuItem setIcon(final int n) {
        this.LJIIJ = this.LJIIJJI.getDrawable(n);
        this.LIZIZ();
        return (MenuItem)this;
    }
    
    public final MenuItem setIcon(final Drawable ljiij) {
        this.LJIIJ = ljiij;
        this.LIZIZ();
        return (MenuItem)this;
    }
    
    @Override
    public final MenuItem setIconTintList(final ColorStateList ljiiljjil) {
        this.LJIILJJIL = ljiiljjil;
        this.LJIILLIIL = true;
        this.LIZIZ();
        return (MenuItem)this;
    }
    
    @Override
    public final MenuItem setIconTintMode(final PorterDuff$Mode ljiill) {
        this.LJIILL = ljiill;
        this.LJIIZILJ = true;
        this.LIZIZ();
        return (MenuItem)this;
    }
    
    public final MenuItem setIntent(final Intent ljff) {
        this.LJFF = ljff;
        return (MenuItem)this;
    }
    
    public final MenuItem setNumericShortcut(final char c) {
        this.LJI = c;
        return (MenuItem)this;
    }
    
    @Override
    public final MenuItem setNumericShortcut(final char c, final int n) {
        this.LJI = c;
        this.LJII = KeyEvent.normalizeMetaState(n);
        return (MenuItem)this;
    }
    
    public final MenuItem setOnActionExpandListener(final MenuItem$OnActionExpandListener menuItem$OnActionExpandListener) {
        throw new UnsupportedOperationException();
    }
    
    public final MenuItem setOnMenuItemClickListener(final MenuItem$OnMenuItemClickListener menuItem$OnMenuItemClickListener) {
        return (MenuItem)this;
    }
    
    public final MenuItem setShortcut(final char c, final char c2) {
        this.LJI = c;
        this.LJIIIIZZ = Character.toLowerCase(c2);
        return (MenuItem)this;
    }
    
    @Override
    public final MenuItem setShortcut(final char c, final char c2, final int n, final int n2) {
        this.LJI = c;
        this.LJII = KeyEvent.normalizeMetaState(n);
        this.LJIIIIZZ = Character.toLowerCase(c2);
        this.LJIIIZ = KeyEvent.normalizeMetaState(n2);
        return (MenuItem)this;
    }
    
    @Override
    public final void setShowAsAction(final int n) {
    }
    
    public final MenuItem setTitle(final int n) {
        this.LIZLLL = this.LJIIJJI.getResources().getString(n);
        return (MenuItem)this;
    }
    
    public final MenuItem setTitle(final CharSequence lizlll) {
        this.LIZLLL = lizlll;
        return (MenuItem)this;
    }
    
    public final MenuItem setTitleCondensed(final CharSequence lj) {
        this.LJ = lj;
        return (MenuItem)this;
    }
    
    public final MenuItem setVisible(final boolean b) {
        final int ljij = this.LJIJ;
        int n = 8;
        if (b) {
            n = 0;
        }
        this.LJIJ = ((ljij & 0x8) | n);
        return (MenuItem)this;
    }
}
