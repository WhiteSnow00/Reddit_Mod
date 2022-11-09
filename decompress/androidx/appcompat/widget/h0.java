// 
// Decompiled by Procyon v0.6.0
// 

package androidx.appcompat.widget;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView$OnItemSelectedListener;

public final class h0 implements AdapterView$OnItemSelectedListener
{
    public final /* synthetic */ i0 f;
    
    public h0(final i0 f) {
        this.f = f;
    }
    
    public final void onItemSelected(final AdapterView<?> adapterView, final View view, final int n, final long n2) {
        if (n != -1) {
            final e0 h = this.f.h;
            if (h != null) {
                h.setListSelectionHidden(false);
            }
        }
    }
    
    public final void onNothingSelected(final AdapterView<?> adapterView) {
    }
}
