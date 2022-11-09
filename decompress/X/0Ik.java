// 
// Decompiled by Procyon v0.6.0
// 

package X;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.n;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.covode.number.Covode;
import android.view.View$OnTouchListener;

public final class 0ik implements View$OnTouchListener
{
    public final /* synthetic */ 1N4 LIZ;
    public final /* synthetic */ 1N4.a LIZIZ;
    
    static {
        Covode.recordClassIndex(6781);
    }
    
    public 0ik(final 1N4 liz, final 1N4.a liziz) {
        this.LIZ = liz;
        this.LIZIZ = liziz;
    }
    
    public final boolean onTouch(final View view, final MotionEvent motionEvent) {
        n.LIZIZ((Object)motionEvent, "");
        final int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                return false;
            }
            if (this.LIZ.LJ) {
                this.LIZ.LIZ();
                this.LIZIZ.LIZ(false);
            }
            return false;
        }
        else {
            if (this.LIZ.LJ) {
                this.LIZ.LIZ();
                ((RecyclerView.a)this.LIZ).notifyDataSetChanged();
                return true;
            }
            return false;
        }
    }
}
