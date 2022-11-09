// 
// Decompiled by Procyon v0.6.0
// 

package w90;

import java.util.Map;
import com.reddit.screen.BaseScreen;
import com.reddit.matrix.feature.sheets.block.BlockBottomSheetScreen$a;
import com.reddit.matrix.feature.sheets.useractions.UserActionsSheetScreen$a;
import com.reddit.matrix.feature.chat.sheets.messageactions.MessageActionsSheetScreen$a;

public final class si implements du
{
    public final MessageActionsSheetScreen$a a;
    public final UserActionsSheetScreen$a b;
    public final BlockBottomSheetScreen$a c;
    public final kl d;
    
    public si(final kl d, final BaseScreen baseScreen, final String s, final MessageActionsSheetScreen$a a, final BlockBottomSheetScreen$a c, final UserActionsSheetScreen$a b) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final Map<Class<?>, yt<?, ?>> getSubFeatureInjectors() {
        return this.d.k();
    }
}
