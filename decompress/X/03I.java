// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.View;
import android.widget.AdapterView;
import com.bytedance.covode.number.Covode;
import android.widget.AdapterView$OnItemSelectedListener;

public final class 03i implements AdapterView$OnItemSelectedListener
{
    public final /* synthetic */ 13R LIZ;
    
    static {
        Covode.recordClassIndex(472);
    }
    
    public 03i(final 13R liz) {
        this.LIZ = liz;
    }
    
    public final void onItemSelected(final AdapterView<?> adapterView, final View view, final int n, final long n2) {
        if (n != -1) {
            final 03b lj = this.LIZ.LJ;
            if (lj != null) {
                lj.setListSelectionHidden(false);
            }
        }
    }
    
    public final void onNothingSelected(final AdapterView<?> adapterView) {
    }
}
