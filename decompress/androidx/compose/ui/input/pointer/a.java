// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.input.pointer;

import mg2.q;
import androidx.compose.ui.ComposedModifierKt;
import android.view.MotionEvent;
import androidx.compose.ui.platform.InspectableValueKt;
import cg2.j;
import mg2.l;
import z1.z;
import ng2.e;
import j1.d;
import androidx.compose.ui.viewinterop.AndroidViewHolder;

public final class a
{
    public static final d a(final AndroidViewHolder androidViewHolder) {
        e.f((Object)androidViewHolder, "view");
        final PointerInteropFilter f = new PointerInteropFilter();
        f.f = (l<? super MotionEvent, Boolean>)new PointerInteropFilter_androidKt$pointerInteropFilter$3(androidViewHolder);
        final z z = new z();
        final z g = f.g;
        if (g != null) {
            g.f = null;
        }
        f.g = z;
        z.f = f;
        androidViewHolder.setOnRequestDisallowInterceptTouchEvent$ui_release((l<? super Boolean, j>)z);
        return (d)f;
    }
    
    public static d b(final d d, final l l) {
        e.f((Object)d, "<this>");
        return ComposedModifierKt.a(d, (l)InspectableValueKt.a, (q)new PointerInteropFilter_androidKt$pointerInteropFilter$2((l<? super MotionEvent, Boolean>)l, null));
    }
}
