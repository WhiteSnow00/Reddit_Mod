// 
// Decompiled by Procyon v0.6.0
// 

package o90;

import java.util.Map;
import com.reddit.screen.BaseScreen;
import com.reddit.matrix.feature.sheets.block.BlockBottomSheetScreen$a;
import com.reddit.matrix.feature.sheets.useractions.UserActionsSheetScreen$a;

public final class kl implements yt
{
    public final UserActionsSheetScreen$a a;
    public final BlockBottomSheetScreen$a b;
    public final dl c;
    
    public kl(final dl c, final BaseScreen baseScreen, final String s, final BlockBottomSheetScreen$a b, final UserActionsSheetScreen$a a) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public final Map<Class<?>, tt<?, ?>> getSubFeatureInjectors() {
        return this.c.k();
    }
}
