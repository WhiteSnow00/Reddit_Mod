// 
// Decompiled by Procyon v0.6.0
// 

package w90;

import java.util.Map;
import com.reddit.screen.BaseScreen;
import com.reddit.matrix.feature.chats.sheets.spam.ReportSpamBottomSheetScreen$a;
import com.reddit.matrix.feature.chats.sheets.ignore.IgnoreBottomSheetScreen$a;
import com.reddit.matrix.feature.chats.sheets.leave.LeaveBottomSheetScreen$a;
import com.reddit.matrix.feature.sheets.block.BlockBottomSheetScreen$a;

public final class wi implements du
{
    public final BlockBottomSheetScreen$a a;
    public final LeaveBottomSheetScreen$a b;
    public final IgnoreBottomSheetScreen$a c;
    public final ReportSpamBottomSheetScreen$a d;
    public final kl e;
    
    public wi(final kl e, final BaseScreen baseScreen, final BlockBottomSheetScreen$a a, final LeaveBottomSheetScreen$a b, final IgnoreBottomSheetScreen$a c, final ReportSpamBottomSheetScreen$a d) {
        this.e = e;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final Map<Class<?>, yt<?, ?>> getSubFeatureInjectors() {
        return this.e.k();
    }
}
