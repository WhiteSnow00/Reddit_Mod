// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.vault.feature.registration.createvault;

import android.os.BaseBundle;
import com.bluelinelabs.conductor.Controller;
import s82.g;
import android.os.Parcelable;
import android.view.View$OnClickListener;
import com.reddit.vault.util.PointsFormat;
import java.math.BigInteger;
import x82.a;
import android.view.View;
import kb1.l;
import com.reddit.screen.util.b;
import android.os.Bundle;
import a81.e;
import com.reddit.screen.util.ScreenViewBindingDelegate;
import zg2.k;
import com.reddit.vault.d;

public final class ConfirmRestorePreviousVaultScreen extends d
{
    public static final /* synthetic */ k<Object>[] j0;
    public final ScreenViewBindingDelegate i0;
    
    static {
        j0 = new k[] { (k)e.v((Class)ConfirmRestorePreviousVaultScreen.class, "binding", "getBinding()Lcom/reddit/vault/databinding/ScreenConfirmRestorePreviousVaultBinding;", 0) };
    }
    
    public ConfirmRestorePreviousVaultScreen(final Bundle bundle) {
        sg2.e.f((Object)bundle, "args");
        super(2131625169, bundle);
        this.i0 = b.a((l)this, (rg2.l)ConfirmRestorePreviousVaultScreen$binding.ConfirmRestorePreviousVaultScreen$binding$2.INSTANCE);
    }
    
    public final void nC(final View view) {
        final Parcelable parcelable = ((Controller)this).f.getParcelable("address");
        sg2.e.c((Object)parcelable);
        final a a = (a)parcelable;
        final int int1 = ((BaseBundle)((Controller)this).f).getInt("roundsToClaim");
        final byte[] byteArray = ((Controller)this).f.getByteArray("points");
        sg2.e.c((Object)byteArray);
        final BigInteger bigInteger = new BigInteger(byteArray);
        String s;
        if (int1 > 0 && bigInteger.compareTo(BigInteger.ZERO) > 0) {
            s = ((View)this.oC().a).getResources().getQuantityString(2131820612, int1, new Object[] { int1, PointsFormat.b(bigInteger, false) });
        }
        else if (int1 > 0) {
            s = ((View)this.oC().a).getResources().getQuantityString(2131820611, int1, new Object[] { int1 });
        }
        else {
            s = ((View)this.oC().a).getResources().getString(2131954491, new Object[] { PointsFormat.b(bigInteger, false) });
        }
        sg2.e.e((Object)s, "if (roundsToClaim > 0 &&\u2026at(points),\n      )\n    }");
        this.oC().b.setText((CharSequence)((View)this.oC().a).getResources().getString(2131954490, new Object[] { s }));
        ((View)this.oC().d).setOnClickListener((View$OnClickListener)new rl1.a(17, (Object)this, (Object)a));
        ((View)this.oC().c).setOnClickListener((View$OnClickListener)new jp1.e((Object)this, 27));
    }
    
    public final g oC() {
        return (g)this.i0.d((l)this, (k)ConfirmRestorePreviousVaultScreen.j0[0]);
    }
}
