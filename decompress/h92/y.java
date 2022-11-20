// 
// Decompiled by Procyon v0.6.0
// 

package h92;

import android.view.View;
import android.view.View$OnClickListener;
import androidx.cardview.widget.CardView;
import android.widget.ImageView;
import android.widget.TextView;
import ng2.e;
import cg2.j;
import mg2.l;
import w5.a;
import l00.b;

public final class y extends n
{
    public static final int g = 0;
    public final b f;
    
    public y(final b f) {
        super((a)f);
        this.f = f;
    }
    
    public final void S0(final v v, final l<? super r82.a, j> l) {
        e.f((Object)l, "onClick");
        final StringBuilder sb = new StringBuilder();
        final String c = v.a.c();
        final int n = 0;
        for (int i = 0, n2 = 0; i < c.length(); ++i, ++n2) {
            final char char1 = c.charAt(i);
            if (n2 != 0 && n2 % 3 == 0) {
                sb.append(' ');
            }
            sb.append(char1);
        }
        this.f.c.setText((CharSequence)sb.toString());
        ((TextView)this.f.f).setText((CharSequence)v.b);
        final ImageView imageView = (ImageView)this.f.d;
        e.e((Object)imageView, "binding.activeIcon");
        int visibility;
        if (v.c) {
            visibility = n;
        }
        else {
            visibility = 8;
        }
        ((View)imageView).setVisibility(visibility);
        ((View)this.f.b).setOnClickListener((View$OnClickListener)new b82.a(1, (Object)l, (Object)v));
    }
}
