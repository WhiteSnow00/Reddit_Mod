// 
// Decompiled by Procyon v0.6.0
// 

package w90;

import java.util.Map;
import ja2.d;
import ja2.b;
import com.reddit.screen.BaseScreen;
import com.reddit.vault.feature.vault.transaction.approve.ApproveTransactionScreen$a;
import com.reddit.vault.e;

public final class sp implements du
{
    public final e a;
    public final ApproveTransactionScreen$a b;
    public final kl c;
    
    public sp(final kl c, final BaseScreen baseScreen, final b b, final d d, final e a, final ApproveTransactionScreen$a b2) {
        this.c = c;
        this.a = a;
        this.b = b2;
    }
    
    public final Map<Class<?>, yt<?, ?>> getSubFeatureInjectors() {
        return this.c.k();
    }
}
