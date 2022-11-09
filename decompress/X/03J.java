// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.text.Editable;
import com.bytedance.covode.number.Covode;
import android.text.TextWatcher;

public final class 03J implements TextWatcher
{
    public final /* synthetic */ 13L LIZ;
    
    static {
        Covode.recordClassIndex(431);
    }
    
    public 03J(final 13L liz) {
        this.LIZ = liz;
    }
    
    public final void afterTextChanged(final Editable editable) {
    }
    
    public final void beforeTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
    }
    
    public final void onTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
        this.LIZ.LIZ(charSequence);
    }
}
