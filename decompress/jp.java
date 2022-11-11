// 
// Decompiled by Procyon v0.6.0
// 

package o90;

import java.util.Map;
import ba2.d;
import ba2.b;
import com.reddit.screen.BaseScreen;
import com.reddit.vault.feature.vault.transaction.approve.ApproveTransactionScreen$a;
import com.reddit.vault.e;

public final class jp implements yt
{
    public final e a;
    public final ApproveTransactionScreen$a b;
    public final dl c;
    
    public jp(final dl c, final BaseScreen baseScreen, final b b, final d d, final e a, final ApproveTransactionScreen$a b2) {
        this.c = c;
        this.a = a;
        this.b = b2;
    }
    
    public final Map<Class<?>, tt<?, ?>> getSubFeatureInjectors() {
        return this.c.k();
    }
}
