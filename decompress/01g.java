// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;

public final class 01g implements Runnable
{
    public final /* synthetic */ 1fL LIZ;
    
    static {
        Covode.recordClassIndex(212);
    }
    
    public 01g(final 1fL liz) {
        this.LIZ = liz;
    }
    
    @Override
    public final void run() {
        try {
            1fL.access$001(this.LIZ);
        }
        catch (final IllegalStateException ex) {
            if (TextUtils.equals((CharSequence)ex.getMessage(), (CharSequence)"Can not perform this action after onSaveInstanceState")) {
                return;
            }
            throw ex;
        }
    }
}
