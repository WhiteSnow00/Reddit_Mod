// 
// Decompiled by Procyon v0.6.0
// 

package androidx.appcompat.widget;

import a4.o;
import android.view.View$OnHoverListener;
import android.view.View$OnLongClickListener;
import android.text.TextUtils;
import android.os.Build$VERSION;
import android.view.View;

public final class b1
{
    public static void a(final View view, final CharSequence charSequence) {
        if (Build$VERSION.SDK_INT >= 26) {
            a.a(view, charSequence);
        }
        else {
            final d1 p2 = d1.p;
            if (p2 != null && p2.f == view) {
                d1.b(null);
            }
            if (TextUtils.isEmpty(charSequence)) {
                final d1 q = d1.q;
                if (q != null && q.f == view) {
                    q.a();
                }
                view.setOnLongClickListener((View$OnLongClickListener)null);
                view.setLongClickable(false);
                view.setOnHoverListener((View$OnHoverListener)null);
            }
            else {
                new d1(view, charSequence);
            }
        }
    }
    
    public static final class a
    {
        public static void a(final View view, final CharSequence charSequence) {
            o.i(view, charSequence);
        }
    }
}
