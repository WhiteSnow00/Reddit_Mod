// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.text.input;

import kotlin.Metadata;
import android.view.inputmethod.BaseInputConnection;
import zg2.a;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = { "\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002" }, d2 = { "<anonymous>", "Landroid/view/inputmethod/BaseInputConnection;", "invoke" }, k = 3, mv = { 1, 6, 0 }, xi = 48)
final class TextInputServiceAndroid$baseInputConnection$2 extends Lambda implements a<BaseInputConnection>
{
    public final /* synthetic */ TextInputServiceAndroid this$0;
    
    public TextInputServiceAndroid$baseInputConnection$2(final TextInputServiceAndroid this$0) {
        this.this$0 = this$0;
        super(0);
    }
    
    public final BaseInputConnection invoke() {
        return new BaseInputConnection(this.this$0.a, false);
    }
}
