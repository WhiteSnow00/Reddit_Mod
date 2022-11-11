// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
import com.bytedance.covode.number.Covode;
import androidx.appcompat.app.AlertController;
import android.widget.AdapterView$OnItemClickListener;

public final class 01x implements AdapterView$OnItemClickListener
{
    public final /* synthetic */ AlertController.RecycleListView LIZ;
    public final /* synthetic */ AlertController LIZIZ;
    public final /* synthetic */ AlertController.a LIZJ;
    
    static {
        Covode.recordClassIndex(248);
    }
    
    public 01x(final AlertController.a lizj, final AlertController.RecycleListView liz, final AlertController liziz) {
        this.LIZJ = lizj;
        this.LIZ = liz;
        this.LIZIZ = liziz;
    }
    
    public final void onItemClick(final AdapterView<?> adapterView, final View view, final int n, final long n2) {
        if (this.LIZJ.LJJIIZI != null) {
            this.LIZJ.LJJIIZI[n] = this.LIZ.isItemChecked(n);
        }
        this.LIZJ.LJJIJIL.onClick((DialogInterface)this.LIZIZ.LIZIZ, n, this.LIZ.isItemChecked(n));
    }
}
