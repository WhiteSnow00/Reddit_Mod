// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.ActionMode$Callback;
import android.graphics.drawable.Drawable;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.EditorInfo;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.widget.TextView;
import android.view.View;
import androidx.appcompat.widget.an;
import android.util.AttributeSet;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import androidx.appcompat.widget.u;
import android.widget.AutoCompleteTextView;

public class 04I extends AutoCompleteTextView
{
    public static final int[] LIZ;
    public final 04J LIZIZ;
    public final u LIZJ;
    
    static {
        Covode.recordClassIndex(520);
        LIZ = new int[] { 16843126 };
    }
    
    public 04I(final Context context, final AttributeSet set) {
        this(context, set, (byte)0);
    }
    
    public 04I(final Context context, final AttributeSet set, final byte b) {
        an.LIZ(context);
        super(context, set, 2130969060);
        final 043 liz = 043.LIZ(this.getContext(), set, 04I.LIZ, 2130969060, 0);
        if (liz.LJFF(0)) {
            this.setDropDownBackgroundDrawable(liz.LIZ(0));
        }
        liz.LIZ.recycle();
        (this.LIZIZ = new 04J((View)this)).LIZ(set, 2130969060);
        final u lizj = new u((TextView)this);
        (this.LIZJ = lizj).LIZ(set, 2130969060);
        lizj.LIZ();
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
    
    public InputConnection onCreateInputConnection(final EditorInfo editorInfo) {
        final InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        04O.LIZ(onCreateInputConnection, editorInfo, (View)this);
        return onCreateInputConnection;
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
    
    public void setCustomSelectionActionModeCallback(final ActionMode$Callback actionMode$Callback) {
        super.setCustomSelectionActionModeCallback(08p.LIZ((TextView)this, actionMode$Callback));
    }
    
    public void setDropDownBackgroundResource(final int n) {
        this.setDropDownBackgroundDrawable(01s.LIZIZ(this.getContext(), n));
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
    
    public void setTextAppearance(final Context context, final int n) {
        super.setTextAppearance(context, n);
        final u lizj = this.LIZJ;
        if (lizj != null) {
            lizj.LIZ(context, n);
        }
    }
}
