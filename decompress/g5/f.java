// 
// Decompiled by Procyon v0.6.0
// 

package g5;

import android.view.View;
import android.util.SparseArray;
import androidx.recyclerview.widget.RecyclerView;

public final class f extends f0
{
    public final SparseArray<View> f;
    public boolean g;
    public boolean h;
    
    public f(final View view) {
        super(view);
        final SparseArray f = new SparseArray(4);
        (this.f = (SparseArray<View>)f).put(16908310, (Object)view.findViewById(16908310));
        f.put(16908304, (Object)view.findViewById(16908304));
        f.put(16908294, (Object)view.findViewById(16908294));
        f.put(2131429436, (Object)view.findViewById(2131429436));
        f.put(16908350, (Object)view.findViewById(16908350));
    }
    
    public final View S0(final int n) {
        final View view = (View)this.f.get(n);
        if (view != null) {
            return view;
        }
        final View viewById = super.itemView.findViewById(n);
        if (viewById != null) {
            this.f.put(n, (Object)viewById);
        }
        return viewById;
    }
}
