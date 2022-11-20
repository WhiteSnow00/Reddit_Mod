// 
// Decompiled by Procyon v0.6.0
// 

package androidx.appcompat.widget;

import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.graphics.Rect;
import android.view.WindowManager$LayoutParams;
import android.widget.TextView;
import android.view.View;
import android.content.Context;

public final class e1
{
    public final Context a;
    public final View b;
    public final TextView c;
    public final WindowManager$LayoutParams d;
    public final Rect e;
    public final int[] f;
    public final int[] g;
    
    public e1(final Context a) {
        final WindowManager$LayoutParams d = new WindowManager$LayoutParams();
        this.d = d;
        this.e = new Rect();
        this.f = new int[2];
        this.g = new int[2];
        this.a = a;
        final View inflate = LayoutInflater.from(a).inflate(2131624013, (ViewGroup)null);
        this.b = inflate;
        this.c = (TextView)inflate.findViewById(2131430083);
        d.setTitle((CharSequence)e1.class.getSimpleName());
        d.packageName = a.getPackageName();
        d.type = 1002;
        d.width = -2;
        d.height = -2;
        d.format = -3;
        d.windowAnimations = 2132017159;
        d.flags = 24;
    }
}
