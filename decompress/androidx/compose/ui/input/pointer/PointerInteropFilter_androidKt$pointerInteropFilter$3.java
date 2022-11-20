// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.input.pointer;

import android.view.View;
import ng2.e;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import kotlin.Metadata;
import android.view.MotionEvent;
import mg2.l;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = { "\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005" }, d2 = { "<anonymous>", "", "motionEvent", "Landroid/view/MotionEvent;", "invoke", "(Landroid/view/MotionEvent;)Ljava/lang/Boolean;" }, k = 3, mv = { 1, 7, 1 }, xi = 48)
final class PointerInteropFilter_androidKt$pointerInteropFilter$3 extends Lambda implements l<MotionEvent, Boolean>
{
    public final AndroidViewHolder $view;
    
    public PointerInteropFilter_androidKt$pointerInteropFilter$3(final AndroidViewHolder $view) {
        this.$view = $view;
        super(1);
    }
    
    public final Boolean invoke(final MotionEvent motionEvent) {
        e.f((Object)motionEvent, "motionEvent");
        boolean b = false;
        switch (motionEvent.getActionMasked()) {
            default: {
                b = ((View)this.$view).dispatchGenericMotionEvent(motionEvent);
                break;
            }
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6: {
                b = ((View)this.$view).dispatchTouchEvent(motionEvent);
                break;
            }
        }
        return b;
    }
    
    public /* bridge */ Object invoke(final Object o) {
        return this.invoke((MotionEvent)o);
    }
}
