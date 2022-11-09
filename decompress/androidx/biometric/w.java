// 
// Decompiled by Procyon v0.6.0
// 

package androidx.biometric;

import androidx.fragment.app.Fragment;
import android.widget.TextView;
import android.graphics.drawable.Drawable;
import android.content.Context;
import android.widget.ImageView;
import n3.a;
import android.util.Log;
import androidx.lifecycle.y;

public final class w implements y<Integer>
{
    public final /* synthetic */ v a;
    
    public w(final v a) {
        this.a = a;
    }
    
    public final void a(final Object o) {
        final Integer n = (Integer)o;
        final v a = this.a;
        a.f.removeCallbacks((Runnable)a.g);
        final v a2 = this.a;
        final int intValue = n;
        final ImageView k = a2.k;
        final int n2 = 0;
        if (k != null) {
            final int y = a2.h.y;
            final Context context = ((Fragment)a2).getContext();
            final Drawable drawable = null;
            Drawable drawable2 = null;
            Label_0162: {
                if (context == null) {
                    Log.w("FingerprintFragment", "Unable to get asset. Context is null.");
                    drawable2 = drawable;
                }
                else {
                    int n3 = 2131231297;
                    if (y != 0 || intValue != 1) {
                        if (y == 1 && intValue == 2) {
                            n3 = 2131231296;
                        }
                        else if (y != 2 || intValue != 1) {
                            drawable2 = drawable;
                            if (y != 1) {
                                break Label_0162;
                            }
                            drawable2 = drawable;
                            if (intValue != 3) {
                                break Label_0162;
                            }
                        }
                    }
                    drawable2 = n3.a.getDrawable(context, n3);
                }
            }
            if (drawable2 != null) {
                a2.k.setImageDrawable(drawable2);
                boolean b = false;
                Label_0227: {
                    Label_0224: {
                        if (y != 0 || intValue != 1) {
                            if (y != 1 || intValue != 2) {
                                if (y != 2 || intValue != 1) {
                                    break Label_0224;
                                }
                            }
                            b = true;
                            break Label_0227;
                        }
                    }
                    b = false;
                }
                if (b) {
                    v$c.a(drawable2);
                }
                a2.h.y = intValue;
            }
        }
        final v a3 = this.a;
        final int intValue2 = n;
        final TextView l = a3.l;
        if (l != null) {
            int n4 = n2;
            if (intValue2 == 2) {
                n4 = 1;
            }
            int textColor;
            if (n4 != 0) {
                textColor = a3.i;
            }
            else {
                textColor = a3.j;
            }
            l.setTextColor(textColor);
        }
        final v a4 = this.a;
        a4.f.postDelayed((Runnable)a4.g, 2000L);
    }
}
