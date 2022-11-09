// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.content.Context;
import android.view.View;
import android.os.Bundle;
import android.content.res.Configuration;
import com.bytedance.covode.number.Covode;
import androidx.fragment.app.Fragment;
import android.app.Activity;

public abstract class 2I4 implements PEu
{
    public Activity LLJJJJLIIL;
    public Fragment LLJJL;
    
    static {
        Covode.recordClassIndex(135620);
    }
    
    public void LIZ(final Activity lljjjjliil, final Fragment lljjl) {
        this.LLJJJJLIIL = lljjjjliil;
        this.LLJJL = lljjl;
    }
    
    public void LIZ(final Configuration configuration) {
    }
    
    public void LIZ(final Bundle bundle) {
    }
    
    public void LIZ(final View view, final Bundle bundle) {
    }
    
    public void LJIJ() {
    }
    
    public void LJIJI() {
    }
    
    public void LJJIL() {
        this.LLJJJJLIIL = null;
    }
    
    public void LJJIZ() {
    }
    
    public void LLIIIL() {
    }
    
    public void LLIIIZ() {
    }
    
    public void bW_() {
    }
    
    public final Context ci_() {
        return (Context)this.LLJJJJLIIL;
    }
    
    public final Fragment cj_() {
        return this.LLJJL;
    }
}
