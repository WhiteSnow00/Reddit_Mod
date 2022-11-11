// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.view.View;
import com.bytedance.covode.number.Covode;
import android.view.MenuItem;

public interface 05o extends MenuItem
{
    default static {
        Covode.recordClassIndex(658);
    }
    
    05o LIZ(final 07t p0);
    
    05o LIZ(final CharSequence p0);
    
    07t LIZ();
    
    05o LIZIZ(final CharSequence p0);
    
    boolean collapseActionView();
    
    boolean expandActionView();
    
    View getActionView();
    
    int getAlphabeticModifiers();
    
    CharSequence getContentDescription();
    
    ColorStateList getIconTintList();
    
    PorterDuff$Mode getIconTintMode();
    
    int getNumericModifiers();
    
    CharSequence getTooltipText();
    
    boolean isActionViewExpanded();
    
    MenuItem setActionView(final int p0);
    
    MenuItem setActionView(final View p0);
    
    MenuItem setAlphabeticShortcut(final char p0, final int p1);
    
    MenuItem setIconTintList(final ColorStateList p0);
    
    MenuItem setIconTintMode(final PorterDuff$Mode p0);
    
    MenuItem setNumericShortcut(final char p0, final int p1);
    
    MenuItem setShortcut(final char p0, final char p1, final int p2, final int p3);
    
    void setShowAsAction(final int p0);
    
    MenuItem setShowAsActionFlags(final int p0);
}
