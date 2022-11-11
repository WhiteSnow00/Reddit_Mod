// 
// Decompiled by Procyon v0.6.0
// 

package lf;

import android.util.TypedValue;
import qf.b;
import android.content.Context;

public final class a
{
    public final boolean a;
    public final int b;
    public final int c;
    public final float d;
    
    public a(final Context context) {
        final TypedValue a = qf.b.a(2130968943, context);
        final int n = 0;
        this.a = (a != null && a.type == 18 && a.data != 0);
        final TypedValue a2 = qf.b.a(2130968942, context);
        int data;
        if (a2 != null) {
            data = a2.data;
        }
        else {
            data = 0;
        }
        this.b = data;
        final TypedValue a3 = qf.b.a(2130968836, context);
        int data2 = n;
        if (a3 != null) {
            data2 = a3.data;
        }
        this.c = data2;
        this.d = context.getResources().getDisplayMetrics().density;
    }
}
