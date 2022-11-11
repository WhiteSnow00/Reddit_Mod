// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.vault.feature.vault.airdrop;

import android.os.BaseBundle;
import com.bluelinelabs.conductor.Controller;
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

public final class AirdropScreen extends d
{
    public static final /* synthetic */ k<Object>[] j0;
    public final ScreenViewBindingDelegate i0;
    
    static {
        j0 = new k[] { (k)e.v((Class)AirdropScreen.class, "binding", "getBinding()Lcom/reddit/vault/databinding/ScreenAirdropBinding;", 0) };
    }
    
    public AirdropScreen(final Bundle bundle) {
        sg2.e.f((Object)bundle, "args");
        super(2131625117, bundle);
        this.i0 = b.a((l)this, (rg2.l)AirdropScreen$binding.AirdropScreen$binding$2.INSTANCE);
    }
    
    public final void nC(final View view) {
        final String string = ((BaseBundle)((Controller)this).f).getString("pointsName");
        final ScreenViewBindingDelegate i0 = this.i0;
        final k<Object>[] j0 = AirdropScreen.j0;
        ((s82.b)i0.d((l)this, (k)j0[0])).b.setText((CharSequence)view.getResources().getString(2131954384, new Object[] { string }));
        ((View)((s82.b)this.i0.d((l)this, (k)j0[0])).c).setOnClickListener((View$OnClickListener)new a((Object)this, 8));
    }
}
