// 
// Decompiled by Procyon v0.6.0
// 

package o90;

import java.util.Map;
import yr0.d;
import cz0.c;
import se2.e;
import com.reddit.screen.BaseScreen;
import la1.b;
import javax.inject.Provider;
import ga1.n;
import com.reddit.matrix.feature.sheets.block.BlockBottomSheetScreen$a;
import com.reddit.matrix.feature.sheets.useractions.UserActionsSheetScreen$a;
import com.reddit.matrix.feature.chat.sheets.messageactions.MessageActionsSheetScreen$a;

public final class mi implements yt
{
    public final MessageActionsSheetScreen$a a;
    public final UserActionsSheetScreen$a b;
    public final BlockBottomSheetScreen$a c;
    public final n d;
    public final dl e;
    public Provider<b> f;
    
    public mi(final dl e, final BaseScreen baseScreen, final String s, final MessageActionsSheetScreen$a a, final BlockBottomSheetScreen$a c, final UserActionsSheetScreen$a b, final n d) {
        this.e = e;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.f = (Provider<b>)se2.c.b((Provider)new d((Object)cz0.c.b((Provider)se2.e.a((Object)baseScreen)), 9));
    }
    
    public final Map<Class<?>, tt<?, ?>> getSubFeatureInjectors() {
        return this.e.k();
    }
}
