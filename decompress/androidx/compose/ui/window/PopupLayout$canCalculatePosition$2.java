// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.window;

import kotlin.Metadata;
import zg2.a;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = { "\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003" }, d2 = { "<anonymous>", "", "invoke", "()Ljava/lang/Boolean;" }, k = 3, mv = { 1, 6, 0 }, xi = 48)
final class PopupLayout$canCalculatePosition$2 extends Lambda implements a<Boolean>
{
    public final /* synthetic */ PopupLayout this$0;
    
    public PopupLayout$canCalculatePosition$2(final PopupLayout this$0) {
        this.this$0 = this$0;
        super(0);
    }
    
    public final Boolean invoke() {
        return PopupLayout.j(this.this$0) != null && this.this$0.getPopupContentSize-bOM6tXw() != null;
    }
}
