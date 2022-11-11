// 
// Decompiled by Procyon v0.6.0
// 

package w90;

import java.util.Map;
import com.reddit.screen.BaseScreen;
import com.reddit.matrix.feature.sheets.block.BlockBottomSheetScreen$a;
import com.reddit.matrix.feature.sheets.useractions.UserActionsSheetScreen$a;

public final class rl implements du
{
    public final UserActionsSheetScreen$a a;
    public final BlockBottomSheetScreen$a b;
    public final kl c;
    
    public rl(final kl c, final BaseScreen baseScreen, final String s, final BlockBottomSheetScreen$a b, final UserActionsSheetScreen$a a) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public final Map<Class<?>, yt<?, ?>> getSubFeatureInjectors() {
        return this.c.k();
    }
}
