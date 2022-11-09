// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.View;
import android.widget.AdapterView;
import android.view.MenuItem;
import android.util.AttributeSet;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import android.widget.AdapterView$OnItemClickListener;
import android.widget.ListView;

public final class 12r extends ListView implements AdapterView$OnItemClickListener, b, 02t
{
    public static final int[] LIZ;
    public 12x LIZIZ;
    public int LIZJ;
    
    static {
        Covode.recordClassIndex(334);
        LIZ = new int[] { 16842964, 16843049 };
    }
    
    public 12r(final Context context, final AttributeSet set) {
        this(context, set, (byte)0);
    }
    
    public 12r(final Context context, final AttributeSet set, final byte b) {
        super(context, set);
        this.setOnItemClickListener((AdapterView$OnItemClickListener)this);
        final 043 liz = 043.LIZ(context, set, 12r.LIZ, 16842868, 0);
        if (liz.LJFF(0)) {
            this.setBackgroundDrawable(liz.LIZ(0));
        }
        if (liz.LJFF(1)) {
            this.setDivider(liz.LIZ(1));
        }
        liz.LIZ.recycle();
    }
    
    public final void LIZ(final 12x liziz) {
        this.LIZIZ = liziz;
    }
    
    public final boolean LIZ(final 130 130) {
        return this.LIZIZ.LIZ((MenuItem)130, null, 0);
    }
    
    public final int getWindowAnimations() {
        return this.LIZJ;
    }
    
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.setChildrenDrawingCacheEnabled(false);
    }
    
    public final void onItemClick(final AdapterView adapterView, final View view, final int n, final long n2) {
        this.LIZ((130)this.getAdapter().getItem(n));
    }
}
