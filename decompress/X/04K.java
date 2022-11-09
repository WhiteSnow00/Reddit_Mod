// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.ActionMode$Callback;
import android.view.View;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.EditorInfo;
import android.widget.TextView;
import androidx.appcompat.widget.an;
import android.util.AttributeSet;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import androidx.appcompat.widget.u;
import android.widget.CheckedTextView;

public class 04K extends CheckedTextView
{
    public static final int[] LIZ;
    public final u LIZIZ;
    
    static {
        Covode.recordClassIndex(523);
        LIZ = new int[] { 16843016 };
    }
    
    public 04K(final Context context, final AttributeSet set) {
        this(context, set, (byte)0);
    }
    
    public 04K(final Context context, final AttributeSet set, final byte b) {
        an.LIZ(context);
        super(context, set, 16843720);
        final u liziz = new u((TextView)this);
        (this.LIZIZ = liziz).LIZ(set, 16843720);
        liziz.LIZ();
        final 043 liz = 043.LIZ(this.getContext(), set, 04K.LIZ, 16843720, 0);
        this.setCheckMarkDrawable(liz.LIZ(0));
        liz.LIZ.recycle();
    }
    
    public void drawableStateChanged() {
        super.drawableStateChanged();
        final u liziz = this.LIZIZ;
        if (liziz != null) {
            liziz.LIZ();
        }
    }
    
    public InputConnection onCreateInputConnection(final EditorInfo editorInfo) {
        final InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        04O.LIZ(onCreateInputConnection, editorInfo, (View)this);
        return onCreateInputConnection;
    }
    
    public void setCheckMarkDrawable(final int n) {
        this.setCheckMarkDrawable(01s.LIZIZ(this.getContext(), n));
    }
    
    public void setCustomSelectionActionModeCallback(final ActionMode$Callback actionMode$Callback) {
        super.setCustomSelectionActionModeCallback(08p.LIZ((TextView)this, actionMode$Callback));
    }
    
    public void setTextAppearance(final Context context, final int n) {
        super.setTextAppearance(context, n);
        final u liziz = this.LIZIZ;
        if (liziz != null) {
            liziz.LIZ(context, n);
        }
    }
}
