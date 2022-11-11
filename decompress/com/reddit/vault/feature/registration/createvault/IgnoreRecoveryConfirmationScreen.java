// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.vault.feature.registration.createvault;

import android.os.CountDownTimer;
import java.util.concurrent.TimeUnit;
import android.view.View$OnClickListener;
import x62.a;
import android.view.View;
import kb1.l;
import com.reddit.screen.util.b;
import android.os.Bundle;
import a81.e;
import com.reddit.screen.util.ScreenViewBindingDelegate;
import zg2.k;
import com.reddit.vault.d;

public final class IgnoreRecoveryConfirmationScreen extends d
{
    public static final /* synthetic */ k<Object>[] j0;
    public final ScreenViewBindingDelegate i0;
    
    static {
        j0 = new k[] { (k)e.v((Class)IgnoreRecoveryConfirmationScreen.class, "binding", "getBinding()Lcom/reddit/vault/databinding/ScreenIgnoreRecoveryConfirmationBinding;", 0) };
    }
    
    public IgnoreRecoveryConfirmationScreen() {
        super(2131625216, (Bundle)null);
        this.i0 = b.a((l)this, (rg2.l)IgnoreRecoveryConfirmationScreen$binding.IgnoreRecoveryConfirmationScreen$binding$2.INSTANCE);
    }
    
    public final void nC(final View view) {
        ((View)this.oC().d).setOnClickListener((View$OnClickListener)new a((Object)this, 6));
        ((View)this.oC().e).setOnClickListener((View$OnClickListener)new dv1.a((Object)this, 10));
        this.oC().b.setText((CharSequence)String.valueOf(TimeUnit.SECONDS.convert(45000L, TimeUnit.MILLISECONDS)));
        ((CountDownTimer)new IgnoreRecoveryConfirmationScreen$b(this)).start();
    }
    
    public final s82.l oC() {
        return (s82.l)this.i0.d((l)this, (k)IgnoreRecoveryConfirmationScreen.j0[0]);
    }
}
