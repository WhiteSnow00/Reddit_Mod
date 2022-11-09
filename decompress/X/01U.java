// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.ViewGroup;
import android.view.View;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import androidx.appcompat.app.AlertController;
import android.widget.ArrayAdapter;

public final class 01u extends ArrayAdapter<CharSequence>
{
    public final /* synthetic */ AlertController.RecycleListView LIZ;
    public final /* synthetic */ AlertController.a LIZIZ;
    
    static {
        Covode.recordClassIndex(245);
    }
    
    public 01u(final AlertController.a liziz, final Context context, final int n, final CharSequence[] array, final AlertController.RecycleListView liz) {
        this.LIZIZ = liziz;
        this.LIZ = liz;
        super(context, n, 16908308, (Object[])array);
    }
    
    public final View getView(final int n, View view, final ViewGroup viewGroup) {
        view = super.getView(n, view, viewGroup);
        if (this.LIZIZ.LJJIIZI != null && this.LIZIZ.LJJIIZI[n]) {
            this.LIZ.setItemChecked(n, true);
        }
        return view;
    }
}
