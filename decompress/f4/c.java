// 
// Decompiled by Procyon v0.6.0
// 

package f4;

import android.content.Context;
import android.view.LayoutInflater;

public abstract class c extends a
{
    public int m;
    public int n;
    public LayoutInflater o;
    
    @Deprecated
    public c(final Context context, final int n) {
        super(context);
        this.n = n;
        this.m = n;
        this.o = (LayoutInflater)context.getSystemService("layout_inflater");
    }
}
