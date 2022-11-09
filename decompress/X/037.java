// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.graphics.drawable.Drawable;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.widget.TextView;
import android.view.View;
import android.widget.CompoundButton;
import androidx.appcompat.widget.an;
import android.util.AttributeSet;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import androidx.appcompat.widget.u;
import android.widget.CheckBox;

public class 037 extends CheckBox
{
    public final 04L LIZ;
    public final 04J LIZIZ;
    public final u LIZJ;
    
    static {
        Covode.recordClassIndex(404);
    }
    
    public 037(final Context context, final AttributeSet set) {
        this(context, set, 2130969231);
    }
    
    public 037(final Context context, final AttributeSet set, final int n) {
        an.LIZ(context);
        super(context, set, n);
        (this.LIZ = new 04L((CompoundButton)this)).LIZ(set, n);
        (this.LIZIZ = new 04J((View)this)).LIZ(set, n);
        (this.LIZJ = new u((TextView)this)).LIZ(set, n);
    }
    
    public void drawableStateChanged() {
        super.drawableStateChanged();
        final 04J liziz = this.LIZIZ;
        if (liziz != null) {
            liziz.LIZLLL();
        }
        final u lizj = this.LIZJ;
        if (lizj != null) {
            lizj.LIZ();
        }
    }
    
    public int getCompoundPaddingLeft() {
        final int compoundPaddingLeft = super.getCompoundPaddingLeft();
        final 04L liz = this.LIZ;
        return compoundPaddingLeft;
    }
    
    public ColorStateList getSupportBackgroundTintList() {
        final 04J liziz = this.LIZIZ;
        if (liziz != null) {
            return liziz.LIZIZ();
        }
        return null;
    }
    
    public PorterDuff$Mode getSupportBackgroundTintMode() {
        final 04J liziz = this.LIZIZ;
        if (liziz != null) {
            return liziz.LIZJ();
        }
        return null;
    }
    
    public ColorStateList getSupportButtonTintList() {
        final 04L liz = this.LIZ;
        if (liz != null) {
            return liz.LIZ;
        }
        return null;
    }
    
    public PorterDuff$Mode getSupportButtonTintMode() {
        final 04L liz = this.LIZ;
        if (liz != null) {
            return liz.LIZIZ;
        }
        return null;
    }
    
    public void setBackgroundDrawable(final Drawable backgroundDrawable) {
        super.setBackgroundDrawable(backgroundDrawable);
        final 04J liziz = this.LIZIZ;
        if (liziz != null) {
            liziz.LIZ();
        }
    }
    
    public void setBackgroundResource(final int backgroundResource) {
        super.setBackgroundResource(backgroundResource);
        final 04J liziz = this.LIZIZ;
        if (liziz != null) {
            liziz.LIZ(backgroundResource);
        }
    }
    
    public void setButtonDrawable(final int n) {
        this.setButtonDrawable(01s.LIZIZ(this.getContext(), n));
    }
    
    public void setButtonDrawable(final Drawable buttonDrawable) {
        super.setButtonDrawable(buttonDrawable);
        final 04L liz = this.LIZ;
        if (liz != null) {
            liz.LIZ();
        }
    }
    
    public void setSupportBackgroundTintList(final ColorStateList list) {
        final 04J liziz = this.LIZIZ;
        if (liziz != null) {
            liziz.LIZ(list);
        }
    }
    
    public void setSupportBackgroundTintMode(final PorterDuff$Mode porterDuff$Mode) {
        final 04J liziz = this.LIZIZ;
        if (liziz != null) {
            liziz.LIZ(porterDuff$Mode);
        }
    }
    
    public void setSupportButtonTintList(final ColorStateList list) {
        final 04L liz = this.LIZ;
        if (liz != null) {
            liz.LIZ(list);
        }
    }
    
    public void setSupportButtonTintMode(final PorterDuff$Mode porterDuff$Mode) {
        final 04L liz = this.LIZ;
        if (liz != null) {
            liz.LIZ(porterDuff$Mode);
        }
    }
}
