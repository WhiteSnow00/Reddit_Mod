// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.View;
import android.graphics.Rect;
import com.bytedance.covode.number.Covode;
import androidx.recyclerview.widget.RecyclerView;

public final class 1bz extends h
{
    static {
        Covode.recordClassIndex(10037);
    }
    
    @Override
    public final void LIZ(final Rect rect, final View view, final RecyclerView recyclerView, final t t) {
        CTM.LIZ((Object)rect, (Object)view, (Object)recyclerView, (Object)t);
        super.LIZ(rect, view, recyclerView, t);
        if ((recyclerView.LIZLLL(view) + 1) % 3 != 0) {
            rect.set(0, 0, 0cB.LIZ(8.0f), 0);
        }
    }
}
