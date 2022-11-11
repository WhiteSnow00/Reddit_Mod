// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.View;
import android.content.DialogInterface;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import android.app.Dialog;

public class 0eC extends Dialog
{
    static {
        Covode.recordClassIndex(5934);
    }
    
    public 0eC(final Context context) {
        super(context);
    }
    
    public 0eC(final Context context, final int n) {
        super(context, n);
    }
    
    public void onStart() {
        super.onStart();
        0e2.a.LIZ.LIZ((DialogInterface)this);
    }
    
    public void onStop() {
        super.onStop();
        0e2.a.LIZ.LIZIZ((DialogInterface)this);
    }
    
    public void show() {
        if (!0e2.a.LIZ.LIZIZ()) {
            super.show();
            final View decorView = this.getWindow().getDecorView();
            if (decorView != null) {
                final Boolean b = (Boolean)decorView.getTag(2131374348);
                if (b != null && b) {
                    0RT.LIZ(this);
                    decorView.setTag(2131374349, (Object)decorView.hashCode());
                }
            }
            KN6.LIZ.LIZ((Dialog)this);
        }
    }
}
