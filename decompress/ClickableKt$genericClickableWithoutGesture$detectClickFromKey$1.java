// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation;

import ah2.f;
import android.view.KeyEvent;
import pg2.j;
import zg2.a;
import kotlin.Metadata;
import x1.b;
import zg2.l;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = { "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004" }, d2 = { "Lx1/b;", "it", "", "invoke-ZmokQxo", "(Landroid/view/KeyEvent;)Ljava/lang/Boolean;", "<anonymous>" }, k = 3, mv = { 1, 6, 0 })
final class ClickableKt$genericClickableWithoutGesture$detectClickFromKey$1 extends Lambda implements l<b, Boolean>
{
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ a<j> $onClick;
    
    public ClickableKt$genericClickableWithoutGesture$detectClickFromKey$1(final boolean $enabled, final a<j> $onClick) {
        this.$enabled = $enabled;
        this.$onClick = $onClick;
        super(1);
    }
    
    public final Boolean invoke-ZmokQxo(final KeyEvent keyEvent) {
        f.f((Object)keyEvent, "it");
        final boolean $enabled = this.$enabled;
        boolean b = true;
        if ($enabled) {
            final int b2 = c.b;
            boolean b3 = false;
            Label_0099: {
                if (x1.c.h(keyEvent) == 1) {
                    final int n = (int)(x1.c.f(keyEvent) >> 32);
                    if (n == 23 || n == 66 || n == 160) {
                        b3 = true;
                        break Label_0099;
                    }
                }
                b3 = false;
            }
            if (b3) {
                this.$onClick.invoke();
                return b;
            }
        }
        b = false;
        return b;
    }
}
