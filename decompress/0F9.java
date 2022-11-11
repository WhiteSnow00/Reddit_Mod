// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.ViewParent;
import android.view.View;
import com.bytedance.covode.number.Covode;
import android.widget.PopupWindow;

public final class 0f9 extends PopupWindow
{
    public int LIZ;
    
    static {
        Covode.recordClassIndex(6031);
    }
    
    public 0f9(final 0fF 0fF) {
        super((View)0fF);
        this.LIZ = 3;
    }
    
    public final void dismiss() {
        while (true) {
            try {
                super.dismiss();
                final View contentView = this.getContentView();
                if (contentView != null) {
                    final ViewParent parent = contentView.getParent();
                    if (parent instanceof View) {
                        final View view = (View)parent;
                        if (view.getVisibility() != 0) {
                            view.setVisibility(0);
                        }
                    }
                }
            }
            finally {
                continue;
            }
            break;
        }
    }
}
