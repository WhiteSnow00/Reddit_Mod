// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.KeyEvent;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.view.LayoutInflater;
import android.view.SubMenu;
import android.view.ViewDebug$CapturedViewProperty;
import android.view.ActionProvider;
import android.content.Context;
import android.content.ActivityNotFoundException;
import android.view.MenuItem;
import com.bytedance.covode.number.Covode;
import android.view.MenuItem$OnActionExpandListener;
import android.view.View;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.view.MenuItem$OnMenuItemClickListener;
import android.graphics.drawable.Drawable;
import android.content.Intent;
import android.view.ContextMenu$ContextMenuInfo;

public final class 130 implements 05o
{
    public final int LIZ;
    public int LIZIZ;
    public int LIZJ;
    public 12x LIZLLL;
    public Runnable LJ;
    public 07t LJFF;
    public ContextMenu$ContextMenuInfo LJI;
    public final int LJII;
    public final int LJIIIIZZ;
    public final int LJIIIZ;
    public CharSequence LJIIJ;
    public CharSequence LJIIJJI;
    public Intent LJIIL;
    public char LJIILIIL;
    public char LJIILJJIL;
    public Drawable LJIILL;
    public int LJIILLIIL;
    public 1fZ LJIIZILJ;
    public MenuItem$OnMenuItemClickListener LJIJ;
    public CharSequence LJIJI;
    public CharSequence LJIJJ;
    public ColorStateList LJIJJLI;
    public PorterDuff$Mode LJIL;
    public boolean LJJ;
    public boolean LJJI;
    public boolean LJJIFFI;
    public int LJJII;
    public int LJJIII;
    public View LJJIIJ;
    public MenuItem$OnActionExpandListener LJJIIJZLJL;
    public boolean LJJIIZ;
    
    static {
        Covode.recordClassIndex(352);
    }
    
    public 130(final 12x lizlll, final int ljiiiizz, final int ljii, final int ljiiiz, final int liz, final CharSequence ljiij, final int ljjiii) {
        this.LIZIZ = 4096;
        this.LIZJ = 4096;
        this.LJJII = 16;
        this.LIZLLL = lizlll;
        this.LJII = ljii;
        this.LJIIIIZZ = ljiiiizz;
        this.LJIIIZ = ljiiiz;
        this.LIZ = liz;
        this.LJIIJ = ljiij;
        this.LJJIII = ljjiii;
    }
    
    private 05o LIZ(final View ljjiij) {
        this.LJJIIJ = ljjiij;
        this.LJFF = null;
        if (ljjiij != null && ljjiij.getId() == -1) {
            final int ljii = this.LJII;
            if (ljii > 0) {
                ljjiij.setId(ljii);
            }
        }
        this.LIZLLL.LJII();
        return this;
    }
    
    private Drawable LIZ(final Drawable drawable) {
        Drawable mutate = drawable;
        if (drawable != null) {
            mutate = drawable;
            if (this.LJJIFFI) {
                if (!this.LJJ) {
                    mutate = drawable;
                    if (!this.LJJI) {
                        return mutate;
                    }
                }
                mutate = 08U.LIZIZ(drawable).mutate();
                if (this.LJJ) {
                    mutate.setTintList(this.LJIJJLI);
                }
                if (this.LJJI) {
                    mutate.setTintMode(this.LJIL);
                }
                this.LJJIFFI = false;
            }
        }
        return mutate;
    }
    
    public static void LIZ(final StringBuilder sb, final int n, final int n2, final String s) {
        if ((n & n2) == n2) {
            sb.append(s);
        }
    }
    
    private void LJ(final boolean b) {
        final int ljjii = this.LJJII;
        int n;
        if (b) {
            n = 2;
        }
        else {
            n = 0;
        }
        final int ljjii2 = n | (ljjii & 0xFFFFFFFD);
        this.LJJII = ljjii2;
        if (ljjii != ljjii2) {
            this.LIZLLL.LIZIZ(false);
        }
    }
    
    @Override
    public final 05o LIZ(final 07t ljff) {
        public final class 12z implements b
        {
            public final /* synthetic */ 130 LIZ;
            
            static {
                Covode.recordClassIndex(353);
            }
            
            public 12z(final 130 liz) {
                this.LIZ = liz;
            }
            
            @Override
            public final void LIZ() {
                this.LIZ.LIZLLL.LJI();
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        X/130.LJFF:LX/07t;
        //     4: astore_2       
        //     5: aload_2        
        //     6: ifnull          14
        //     9: aload_2        
        //    10: aconst_null    
        //    11: putfield        X/07t.LIZJ:LX/07q;
        //    14: aload_0        
        //    15: aconst_null    
        //    16: putfield        X/130.LJJIIJ:Landroid/view/View;
        //    19: aload_0        
        //    20: aload_1        
        //    21: putfield        X/130.LJFF:LX/07t;
        //    24: aload_0        
        //    25: getfield        X/130.LIZLLL:LX/12x;
        //    28: iconst_1       
        //    29: invokevirtual   X/12x.LIZIZ:(Z)V
        //    32: aload_0        
        //    33: getfield        X/130.LJFF:LX/07t;
        //    36: astore_1       
        //    37: aload_1        
        //    38: ifnull          53
        //    41: aload_1        
        //    42: new             LX/12z;
        //    45: dup            
        //    46: aload_0        
        //    47: invokespecial   X/12z.<init>:(LX/130;)V
        //    50: invokevirtual   X/07t.LIZ:(LX/07r;)V
        //    53: aload_0        
        //    54: areturn        
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.convertType(AstBuilder.java:419)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.convertType(AstBuilder.java:207)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformCall(AstMethodBodyBuilder.java:1106)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:993)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:534)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:548)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:534)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:377)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:318)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:425)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:318)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:213)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:254)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:129)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @Override
    public final 05o LIZ(final CharSequence ljiji) {
        this.LJIJI = ljiji;
        this.LIZLLL.LIZIZ(false);
        return this;
    }
    
    @Override
    public final 07t LIZ() {
        return this.LJFF;
    }
    
    public final CharSequence LIZ(final 02t.a a) {
        if (a.LIZ()) {
            return this.getTitleCondensed();
        }
        return this.getTitle();
    }
    
    public final void LIZ(final 1fZ ljiizilj) {
        (this.LJIIZILJ = ljiizilj).setHeaderTitle(this.getTitle());
    }
    
    public final void LIZ(final boolean b) {
        final int ljjii = this.LJJII;
        int n;
        if (b) {
            n = 4;
        }
        else {
            n = 0;
        }
        this.LJJII = (n | (ljjii & 0xFFFFFFFB));
    }
    
    @Override
    public final 05o LIZIZ(final CharSequence ljijj) {
        this.LJIJJ = ljijj;
        this.LIZLLL.LIZIZ(false);
        return this;
    }
    
    public final boolean LIZIZ() {
        final MenuItem$OnMenuItemClickListener ljij = this.LJIJ;
        if (ljij != null && ljij.onMenuItemClick((MenuItem)this)) {
            return true;
        }
        final 12x lizlll = this.LIZLLL;
        if (lizlll.LIZ(lizlll, (MenuItem)this)) {
            return true;
        }
        final Runnable lj = this.LJ;
        if (lj != null) {
            lj.run();
            return true;
        }
        while (true) {
            if (this.LJIIL == null) {
                break Label_0091;
            }
            try {
                final Context liz = this.LIZLLL.LIZ;
                final Intent ljiil = this.LJIIL;
                Q0z.LIZ(ljiil, (Object)liz);
                0Qu.LIZ(ljiil, liz);
                liz.startActivity(ljiil);
                return true;
                final 07t ljff = this.LJFF;
                return ljff != null && ljff.LIZIZ();
            }
            catch (final ActivityNotFoundException ex) {
                continue;
            }
            break;
        }
    }
    
    public final boolean LIZIZ(final boolean b) {
        final int ljjii = this.LJJII;
        int n;
        if (b) {
            n = 0;
        }
        else {
            n = 8;
        }
        final int ljjii2 = n | (ljjii & 0xFFFFFFF7);
        this.LJJII = ljjii2;
        return ljjii != ljjii2;
    }
    
    public final char LIZJ() {
        if (this.LIZLLL.LIZJ()) {
            return this.LJIILJJIL;
        }
        return this.LJIILIIL;
    }
    
    public final void LIZJ(final boolean b) {
        if (b) {
            this.LJJII |= 0x20;
            return;
        }
        this.LJJII &= 0xFFFFFFDF;
    }
    
    public final void LIZLLL(final boolean ljjiiz) {
        this.LJJIIZ = ljjiiz;
        this.LIZLLL.LIZIZ(false);
    }
    
    public final boolean LIZLLL() {
        return this.LIZLLL.LIZLLL() && this.LIZJ() != '\0';
    }
    
    public final boolean LJ() {
        return (this.LJJII & 0x4) != 0x0;
    }
    
    public final boolean LJFF() {
        return (this.LJJII & 0x20) == 0x20;
    }
    
    public final boolean LJI() {
        return (this.LJJIII & 0x1) == 0x1;
    }
    
    public final boolean LJII() {
        return (this.LJJIII & 0x2) == 0x2;
    }
    
    public final boolean LJIIIIZZ() {
        return (this.LJJIII & 0x4) == 0x4;
    }
    
    public final boolean LJIIIZ() {
        if ((this.LJJIII & 0x8) != 0x0) {
            if (this.LJJIIJ == null) {
                final 07t ljff = this.LJFF;
                if (ljff != null) {
                    this.LJJIIJ = ljff.LIZ((MenuItem)this);
                }
            }
            if (this.LJJIIJ != null) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final boolean collapseActionView() {
        if ((this.LJJIII & 0x8) == 0x0) {
            return false;
        }
        if (this.LJJIIJ == null) {
            return true;
        }
        final MenuItem$OnActionExpandListener ljjiijzljl = this.LJJIIJZLJL;
        return (ljjiijzljl == null || ljjiijzljl.onMenuItemActionCollapse((MenuItem)this)) && this.LIZLLL.LIZIZ(this);
    }
    
    @Override
    public final boolean expandActionView() {
        if (!this.LJIIIZ()) {
            return false;
        }
        final MenuItem$OnActionExpandListener ljjiijzljl = this.LJJIIJZLJL;
        return (ljjiijzljl == null || ljjiijzljl.onMenuItemActionExpand((MenuItem)this)) && this.LIZLLL.LIZ(this);
    }
    
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }
    
    @Override
    public final View getActionView() {
        final View ljjiij = this.LJJIIJ;
        if (ljjiij != null) {
            return ljjiij;
        }
        final 07t ljff = this.LJFF;
        if (ljff != null) {
            return this.LJJIIJ = ljff.LIZ((MenuItem)this);
        }
        return null;
    }
    
    @Override
    public final int getAlphabeticModifiers() {
        return this.LIZJ;
    }
    
    public final char getAlphabeticShortcut() {
        return this.LJIILJJIL;
    }
    
    @Override
    public final CharSequence getContentDescription() {
        return this.LJIJI;
    }
    
    public final int getGroupId() {
        return this.LJIIIIZZ;
    }
    
    public final Drawable getIcon() {
        final Drawable ljiill = this.LJIILL;
        if (ljiill != null) {
            return this.LIZ(ljiill);
        }
        if (this.LJIILLIIL != 0) {
            final Drawable liziz = 01s.LIZIZ(this.LIZLLL.LIZ, this.LJIILLIIL);
            this.LJIILLIIL = 0;
            this.LJIILL = liziz;
            return this.LIZ(liziz);
        }
        return null;
    }
    
    @Override
    public final ColorStateList getIconTintList() {
        return this.LJIJJLI;
    }
    
    @Override
    public final PorterDuff$Mode getIconTintMode() {
        return this.LJIL;
    }
    
    public final Intent getIntent() {
        return this.LJIIL;
    }
    
    @ViewDebug$CapturedViewProperty
    public final int getItemId() {
        return this.LJII;
    }
    
    public final ContextMenu$ContextMenuInfo getMenuInfo() {
        return this.LJI;
    }
    
    @Override
    public final int getNumericModifiers() {
        return this.LIZIZ;
    }
    
    public final char getNumericShortcut() {
        return this.LJIILIIL;
    }
    
    public final int getOrder() {
        return this.LJIIIZ;
    }
    
    public final SubMenu getSubMenu() {
        return (SubMenu)this.LJIIZILJ;
    }
    
    @ViewDebug$CapturedViewProperty
    public final CharSequence getTitle() {
        return this.LJIIJ;
    }
    
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.LJIIJJI;
        if (charSequence == null) {
            charSequence = this.LJIIJ;
        }
        return charSequence;
    }
    
    @Override
    public final CharSequence getTooltipText() {
        return this.LJIJJ;
    }
    
    public final boolean hasSubMenu() {
        return this.LJIIZILJ != null;
    }
    
    @Override
    public final boolean isActionViewExpanded() {
        return this.LJJIIZ;
    }
    
    public final boolean isCheckable() {
        return (this.LJJII & 0x1) == 0x1;
    }
    
    public final boolean isChecked() {
        return (this.LJJII & 0x2) == 0x2;
    }
    
    public final boolean isEnabled() {
        return (this.LJJII & 0x10) != 0x0;
    }
    
    public final boolean isVisible() {
        final 07t ljff = this.LJFF;
        if (ljff != null && ljff.LIZLLL()) {
            return (this.LJJII & 0x8) == 0x0 && this.LJFF.LJ();
        }
        return (this.LJJII & 0x8) == 0x0;
    }
    
    public final MenuItem setActionProvider(final ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }
    
    public final MenuItem setAlphabeticShortcut(final char c) {
        if (this.LJIILJJIL == c) {
            return (MenuItem)this;
        }
        this.LJIILJJIL = Character.toLowerCase(c);
        this.LIZLLL.LIZIZ(false);
        return (MenuItem)this;
    }
    
    @Override
    public final MenuItem setAlphabeticShortcut(final char c, final int n) {
        if (this.LJIILJJIL == c && this.LIZJ == n) {
            return (MenuItem)this;
        }
        this.LJIILJJIL = Character.toLowerCase(c);
        this.LIZJ = KeyEvent.normalizeMetaState(n);
        this.LIZLLL.LIZIZ(false);
        return (MenuItem)this;
    }
    
    public final MenuItem setCheckable(final boolean b) {
        final int ljjii = this.LJJII;
        final int ljjii2 = (b ? 1 : 0) | (ljjii & 0xFFFFFFFE);
        this.LJJII = ljjii2;
        if (ljjii != ljjii2) {
            this.LIZLLL.LIZIZ(false);
        }
        return (MenuItem)this;
    }
    
    public final MenuItem setChecked(final boolean b) {
        if ((this.LJJII & 0x4) != 0x0) {
            final 12x lizlll = this.LIZLLL;
            final int groupId = this.getGroupId();
            final int size = lizlll.LIZLLL.size();
            lizlll.LJ();
            for (int i = 0; i < size; ++i) {
                final 130 130 = lizlll.LIZLLL.get(i);
                if (130.getGroupId() == groupId && 130.LJ() && 130.isCheckable()) {
                    130.LJ(130 == this);
                }
            }
            lizlll.LJFF();
        }
        else {
            this.LJ(b);
        }
        return (MenuItem)this;
    }
    
    public final MenuItem setEnabled(final boolean b) {
        if (b) {
            this.LJJII |= 0x10;
        }
        else {
            this.LJJII &= 0xFFFFFFEF;
        }
        this.LIZLLL.LIZIZ(false);
        return (MenuItem)this;
    }
    
    public final MenuItem setIcon(final int ljiilliil) {
        this.LJIILL = null;
        this.LJIILLIIL = ljiilliil;
        this.LJJIFFI = true;
        this.LIZLLL.LIZIZ(false);
        return (MenuItem)this;
    }
    
    public final MenuItem setIcon(final Drawable ljiill) {
        this.LJIILLIIL = 0;
        this.LJIILL = ljiill;
        this.LJJIFFI = true;
        this.LIZLLL.LIZIZ(false);
        return (MenuItem)this;
    }
    
    @Override
    public final MenuItem setIconTintList(final ColorStateList ljijjli) {
        this.LJIJJLI = ljijjli;
        this.LJJ = true;
        this.LJJIFFI = true;
        this.LIZLLL.LIZIZ(false);
        return (MenuItem)this;
    }
    
    @Override
    public final MenuItem setIconTintMode(final PorterDuff$Mode ljil) {
        this.LJIL = ljil;
        this.LJJI = true;
        this.LJJIFFI = true;
        this.LIZLLL.LIZIZ(false);
        return (MenuItem)this;
    }
    
    public final MenuItem setIntent(final Intent ljiil) {
        this.LJIIL = ljiil;
        return (MenuItem)this;
    }
    
    public final MenuItem setNumericShortcut(final char c) {
        if (this.LJIILIIL == c) {
            return (MenuItem)this;
        }
        this.LJIILIIL = c;
        this.LIZLLL.LIZIZ(false);
        return (MenuItem)this;
    }
    
    @Override
    public final MenuItem setNumericShortcut(final char c, final int n) {
        if (this.LJIILIIL == c && this.LIZIZ == n) {
            return (MenuItem)this;
        }
        this.LJIILIIL = c;
        this.LIZIZ = KeyEvent.normalizeMetaState(n);
        this.LIZLLL.LIZIZ(false);
        return (MenuItem)this;
    }
    
    public final MenuItem setOnActionExpandListener(final MenuItem$OnActionExpandListener ljjiijzljl) {
        this.LJJIIJZLJL = ljjiijzljl;
        return (MenuItem)this;
    }
    
    public final MenuItem setOnMenuItemClickListener(final MenuItem$OnMenuItemClickListener ljij) {
        this.LJIJ = ljij;
        return (MenuItem)this;
    }
    
    public final MenuItem setShortcut(final char c, final char c2) {
        this.LJIILIIL = c;
        this.LJIILJJIL = Character.toLowerCase(c2);
        this.LIZLLL.LIZIZ(false);
        return (MenuItem)this;
    }
    
    @Override
    public final MenuItem setShortcut(final char c, final char c2, final int n, final int n2) {
        this.LJIILIIL = c;
        this.LIZIZ = KeyEvent.normalizeMetaState(n);
        this.LJIILJJIL = Character.toLowerCase(c2);
        this.LIZJ = KeyEvent.normalizeMetaState(n2);
        this.LIZLLL.LIZIZ(false);
        return (MenuItem)this;
    }
    
    @Override
    public final void setShowAsAction(final int ljjiii) {
        final int n = ljjiii & 0x3;
        if (n == 0 || n == 1 || n == 2) {
            this.LJJIII = ljjiii;
            this.LIZLLL.LJII();
            return;
        }
        throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
    }
    
    public final MenuItem setTitle(final int n) {
        this.setTitle(this.LIZLLL.LIZ.getString(n));
        return (MenuItem)this;
    }
    
    public final MenuItem setTitle(final CharSequence charSequence) {
        this.LJIIJ = charSequence;
        this.LIZLLL.LIZIZ(false);
        final 1fZ ljiizilj = this.LJIIZILJ;
        if (ljiizilj != null) {
            ljiizilj.setHeaderTitle(charSequence);
        }
        return (MenuItem)this;
    }
    
    public final MenuItem setTitleCondensed(final CharSequence ljiijji) {
        this.LJIIJJI = ljiijji;
        this.LIZLLL.LIZIZ(false);
        return (MenuItem)this;
    }
    
    public final MenuItem setVisible(final boolean b) {
        if (this.LIZIZ(b)) {
            this.LIZLLL.LJI();
        }
        return (MenuItem)this;
    }
    
    @Override
    public final String toString() {
        final CharSequence ljiij = this.LJIIJ;
        if (ljiij != null) {
            return ljiij.toString();
        }
        return null;
    }
}
