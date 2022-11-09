// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.ActionProvider$VisibilityListener;
import android.widget.FrameLayout;
import android.view.MenuItem$OnMenuItemClickListener;
import android.view.MenuItem$OnActionExpandListener;
import android.view.CollapsibleActionView;
import android.view.SubMenu;
import android.view.ContextMenu$ContextMenuInfo;
import android.content.Intent;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ActionProvider;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Method;
import android.view.MenuItem;

public final class 133 extends 02d implements MenuItem
{
    public final 05o LIZIZ;
    public Method LIZJ;
    
    static {
        Covode.recordClassIndex(354);
    }
    
    public 133(final Context context, final 05o liziz) {
        super(context);
        if (liziz != null) {
            this.LIZIZ = liziz;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }
    
    public final boolean collapseActionView() {
        return this.LIZIZ.collapseActionView();
    }
    
    public final boolean expandActionView() {
        return this.LIZIZ.expandActionView();
    }
    
    public final ActionProvider getActionProvider() {
        final 07t liz = this.LIZIZ.LIZ();
        if (liz instanceof a) {
            return ((a)liz).LIZ;
        }
        return null;
    }
    
    public final View getActionView() {
        View actionView;
        final View view = actionView = this.LIZIZ.getActionView();
        if (view instanceof c) {
            actionView = (View)((c)view).LIZ;
        }
        return actionView;
    }
    
    public final int getAlphabeticModifiers() {
        return this.LIZIZ.getAlphabeticModifiers();
    }
    
    public final char getAlphabeticShortcut() {
        return this.LIZIZ.getAlphabeticShortcut();
    }
    
    public final CharSequence getContentDescription() {
        return this.LIZIZ.getContentDescription();
    }
    
    public final int getGroupId() {
        return this.LIZIZ.getGroupId();
    }
    
    public final Drawable getIcon() {
        return this.LIZIZ.getIcon();
    }
    
    public final ColorStateList getIconTintList() {
        return this.LIZIZ.getIconTintList();
    }
    
    public final PorterDuff$Mode getIconTintMode() {
        return this.LIZIZ.getIconTintMode();
    }
    
    public final Intent getIntent() {
        return this.LIZIZ.getIntent();
    }
    
    public final int getItemId() {
        return this.LIZIZ.getItemId();
    }
    
    public final ContextMenu$ContextMenuInfo getMenuInfo() {
        return this.LIZIZ.getMenuInfo();
    }
    
    public final int getNumericModifiers() {
        return this.LIZIZ.getNumericModifiers();
    }
    
    public final char getNumericShortcut() {
        return this.LIZIZ.getNumericShortcut();
    }
    
    public final int getOrder() {
        return this.LIZIZ.getOrder();
    }
    
    public final SubMenu getSubMenu() {
        return this.LIZ(this.LIZIZ.getSubMenu());
    }
    
    public final CharSequence getTitle() {
        return this.LIZIZ.getTitle();
    }
    
    public final CharSequence getTitleCondensed() {
        return this.LIZIZ.getTitleCondensed();
    }
    
    public final CharSequence getTooltipText() {
        return this.LIZIZ.getTooltipText();
    }
    
    public final boolean hasSubMenu() {
        return this.LIZIZ.hasSubMenu();
    }
    
    public final boolean isActionViewExpanded() {
        return this.LIZIZ.isActionViewExpanded();
    }
    
    public final boolean isCheckable() {
        return this.LIZIZ.isCheckable();
    }
    
    public final boolean isChecked() {
        return this.LIZIZ.isChecked();
    }
    
    public final boolean isEnabled() {
        return this.LIZIZ.isEnabled();
    }
    
    public final boolean isVisible() {
        return this.LIZIZ.isVisible();
    }
    
    public final MenuItem setActionProvider(final ActionProvider actionProvider) {
        final b b = new b(super.LIZ, actionProvider);
        final 05o liziz = this.LIZIZ;
        b b2;
        if (actionProvider != null) {
            b2 = b;
        }
        else {
            b2 = null;
        }
        liziz.LIZ(b2);
        return (MenuItem)this;
    }
    
    public final MenuItem setActionView(final int actionView) {
        this.LIZIZ.setActionView(actionView);
        final View actionView2 = this.LIZIZ.getActionView();
        if (actionView2 instanceof CollapsibleActionView) {
            this.LIZIZ.setActionView((View)new c(actionView2));
        }
        return (MenuItem)this;
    }
    
    public final MenuItem setActionView(final View view) {
        Object actionView = view;
        if (view instanceof CollapsibleActionView) {
            actionView = new c(view);
        }
        this.LIZIZ.setActionView((View)actionView);
        return (MenuItem)this;
    }
    
    public final MenuItem setAlphabeticShortcut(final char alphabeticShortcut) {
        this.LIZIZ.setAlphabeticShortcut(alphabeticShortcut);
        return (MenuItem)this;
    }
    
    public final MenuItem setAlphabeticShortcut(final char c, final int n) {
        this.LIZIZ.setAlphabeticShortcut(c, n);
        return (MenuItem)this;
    }
    
    public final MenuItem setCheckable(final boolean checkable) {
        this.LIZIZ.setCheckable(checkable);
        return (MenuItem)this;
    }
    
    public final MenuItem setChecked(final boolean checked) {
        this.LIZIZ.setChecked(checked);
        return (MenuItem)this;
    }
    
    public final MenuItem setContentDescription(final CharSequence charSequence) {
        this.LIZIZ.LIZ(charSequence);
        return (MenuItem)this;
    }
    
    public final MenuItem setEnabled(final boolean enabled) {
        this.LIZIZ.setEnabled(enabled);
        return (MenuItem)this;
    }
    
    public final MenuItem setIcon(final int icon) {
        this.LIZIZ.setIcon(icon);
        return (MenuItem)this;
    }
    
    public final MenuItem setIcon(final Drawable icon) {
        this.LIZIZ.setIcon(icon);
        return (MenuItem)this;
    }
    
    public final MenuItem setIconTintList(final ColorStateList iconTintList) {
        this.LIZIZ.setIconTintList(iconTintList);
        return (MenuItem)this;
    }
    
    public final MenuItem setIconTintMode(final PorterDuff$Mode iconTintMode) {
        this.LIZIZ.setIconTintMode(iconTintMode);
        return (MenuItem)this;
    }
    
    public final MenuItem setIntent(final Intent intent) {
        this.LIZIZ.setIntent(intent);
        return (MenuItem)this;
    }
    
    public final MenuItem setNumericShortcut(final char numericShortcut) {
        this.LIZIZ.setNumericShortcut(numericShortcut);
        return (MenuItem)this;
    }
    
    public final MenuItem setNumericShortcut(final char c, final int n) {
        this.LIZIZ.setNumericShortcut(c, n);
        return (MenuItem)this;
    }
    
    public final MenuItem setOnActionExpandListener(final MenuItem$OnActionExpandListener menuItem$OnActionExpandListener) {
        final 05o liziz = this.LIZIZ;
        Object onActionExpandListener;
        if (menuItem$OnActionExpandListener != null) {
            onActionExpandListener = new d(menuItem$OnActionExpandListener);
        }
        else {
            onActionExpandListener = null;
        }
        liziz.setOnActionExpandListener((MenuItem$OnActionExpandListener)onActionExpandListener);
        return (MenuItem)this;
    }
    
    public final MenuItem setOnMenuItemClickListener(final MenuItem$OnMenuItemClickListener menuItem$OnMenuItemClickListener) {
        final 05o liziz = this.LIZIZ;
        Object onMenuItemClickListener;
        if (menuItem$OnMenuItemClickListener != null) {
            onMenuItemClickListener = new e(menuItem$OnMenuItemClickListener);
        }
        else {
            onMenuItemClickListener = null;
        }
        liziz.setOnMenuItemClickListener((MenuItem$OnMenuItemClickListener)onMenuItemClickListener);
        return (MenuItem)this;
    }
    
    public final MenuItem setShortcut(final char c, final char c2) {
        this.LIZIZ.setShortcut(c, c2);
        return (MenuItem)this;
    }
    
    public final MenuItem setShortcut(final char c, final char c2, final int n, final int n2) {
        this.LIZIZ.setShortcut(c, c2, n, n2);
        return (MenuItem)this;
    }
    
    public final void setShowAsAction(final int showAsAction) {
        this.LIZIZ.setShowAsAction(showAsAction);
    }
    
    public final MenuItem setShowAsActionFlags(final int showAsActionFlags) {
        this.LIZIZ.setShowAsActionFlags(showAsActionFlags);
        return (MenuItem)this;
    }
    
    public final MenuItem setTitle(final int title) {
        this.LIZIZ.setTitle(title);
        return (MenuItem)this;
    }
    
    public final MenuItem setTitle(final CharSequence title) {
        this.LIZIZ.setTitle(title);
        return (MenuItem)this;
    }
    
    public final MenuItem setTitleCondensed(final CharSequence titleCondensed) {
        this.LIZIZ.setTitleCondensed(titleCondensed);
        return (MenuItem)this;
    }
    
    public final MenuItem setTooltipText(final CharSequence charSequence) {
        this.LIZIZ.LIZIZ(charSequence);
        return (MenuItem)this;
    }
    
    public final MenuItem setVisible(final boolean visible) {
        return this.LIZIZ.setVisible(visible);
    }
    
    public final class d implements MenuItem$OnActionExpandListener
    {
        public final MenuItem$OnActionExpandListener LIZIZ;
        
        static {
            Covode.recordClassIndex(358);
        }
        
        public d(final MenuItem$OnActionExpandListener liziz) {
            this.LIZIZ = liziz;
        }
        
        public final boolean onMenuItemActionCollapse(final MenuItem menuItem) {
            return this.LIZIZ.onMenuItemActionCollapse(133.this.LIZ(menuItem));
        }
        
        public final boolean onMenuItemActionExpand(final MenuItem menuItem) {
            return this.LIZIZ.onMenuItemActionExpand(133.this.LIZ(menuItem));
        }
    }
    
    public final class e implements MenuItem$OnMenuItemClickListener
    {
        public final MenuItem$OnMenuItemClickListener LIZIZ;
        
        static {
            Covode.recordClassIndex(359);
        }
        
        public e(final MenuItem$OnMenuItemClickListener liziz) {
            this.LIZIZ = liziz;
        }
        
        public final boolean onMenuItemClick(final MenuItem menuItem) {
            return this.LIZIZ.onMenuItemClick(133.this.LIZ(menuItem));
        }
    }
    
    public class a extends 07t
    {
        public final ActionProvider LIZ;
        
        static {
            Covode.recordClassIndex(355);
        }
        
        public a(final ActionProvider liz) {
            this.LIZ = liz;
        }
        
        @Override
        public final View LIZ() {
            return this.LIZ.onCreateActionView();
        }
        
        @Override
        public final void LIZ(final SubMenu subMenu) {
            this.LIZ.onPrepareSubMenu(133.this.LIZ(subMenu));
        }
        
        @Override
        public final boolean LIZIZ() {
            return this.LIZ.onPerformDefaultAction();
        }
        
        @Override
        public final boolean LIZJ() {
            return this.LIZ.hasSubMenu();
        }
    }
    
    public static final class c extends FrameLayout implements 02U
    {
        public final CollapsibleActionView LIZ;
        
        static {
            Covode.recordClassIndex(357);
        }
        
        public c(final View view) {
            super(view.getContext());
            this.LIZ = (CollapsibleActionView)view;
            this.addView(view);
        }
        
        public final void LIZ() {
            this.LIZ.onActionViewExpanded();
        }
        
        public final void LIZIZ() {
            this.LIZ.onActionViewCollapsed();
        }
    }
    
    public final class b extends a implements ActionProvider$VisibilityListener
    {
        public 07t.b LIZLLL;
        
        static {
            Covode.recordClassIndex(356);
        }
        
        public b(final 133 133, final Context context, final ActionProvider actionProvider) {
            133.super(actionProvider);
        }
        
        public final View LIZ(final MenuItem menuItem) {
            return super.LIZ.onCreateActionView(menuItem);
        }
        
        public final void LIZ(final 07t.b lizlll) {
            this.LIZLLL = lizlll;
            super.LIZ.setVisibilityListener((ActionProvider$VisibilityListener)this);
        }
        
        public final boolean LIZLLL() {
            return super.LIZ.overridesItemVisibility();
        }
        
        public final boolean LJ() {
            return super.LIZ.isVisible();
        }
        
        public final void onActionProviderVisibilityChanged(final boolean b) {
            final 07t.b lizlll = this.LIZLLL;
            if (lizlll != null) {
                lizlll.LIZ();
            }
        }
    }
}
