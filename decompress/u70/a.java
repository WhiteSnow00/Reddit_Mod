// 
// Decompiled by Procyon v0.6.0
// 

package u70;

import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.reddit.debug.logging.DataLoggingActivity;
import ng2.e;
import com.reddit.debug.logging.DataLoggingActivity$a;
import com.reddit.postsubmit.unified.PostSubmitScreen;
import android.view.View;
import android.view.View$OnClickListener;

public final class a implements View$OnClickListener
{
    public final int f;
    public final int g;
    public final Object h;
    
    public a(final Object h, final int g, final int f) {
        this.f = f;
        this.h = h;
        this.g = g;
    }
    
    public final void onClick(final View view) {
        switch (this.f) {
            default: {
                PostSubmitScreen.tC((PostSubmitScreen)this.h, this.g);
                return;
            }
            case 0: {
                final DataLoggingActivity$a dataLoggingActivity$a = (DataLoggingActivity$a)this.h;
                final int g = this.g;
                e.f((Object)dataLoggingActivity$a, "this$0");
                final DataLoggingActivity.d d = dataLoggingActivity$a.l.get(g);
                d.f ^= true;
                dataLoggingActivity$a.l.set(g, d);
                ((RecyclerView$Adapter)dataLoggingActivity$a).notifyItemChanged(g);
            }
        }
    }
}
