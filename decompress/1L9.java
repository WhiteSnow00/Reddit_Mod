// 
// Decompiled by Procyon v0.6.0
// 

package X;

import kotlin.jvm.internal.n;
import com.bytedance.covode.number.Covode;
import android.widget.ImageView;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public final class 1L9 extends ViewHolder
{
    public final 1si LIZ;
    public final 1ib LIZIZ;
    public final View LIZJ;
    public final ImageView LIZLLL;
    
    static {
        Covode.recordClassIndex(6479);
    }
    
    public 1L9(View viewById) {
        CTM.LIZ((Object)viewById);
        super(viewById);
        final View viewById2 = viewById.findViewById(2131366368);
        n.LIZIZ((Object)viewById2, "");
        this.LIZ = (1si)viewById2;
        final View viewById3 = viewById.findViewById(2131368536);
        n.LIZIZ((Object)viewById3, "");
        this.LIZIZ = (1ib)viewById3;
        final View viewById4 = viewById.findViewById(2131367118);
        n.LIZIZ((Object)viewById4, "");
        this.LIZJ = viewById4;
        viewById = viewById.findViewById(2131367002);
        n.LIZIZ((Object)viewById, "");
        this.LIZLLL = (ImageView)viewById;
    }
}
