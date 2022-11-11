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

public final class 01w implements AdapterView$OnItemClickListener
{
    public final /* synthetic */ AlertController LIZ;
    public final /* synthetic */ AlertController.a LIZIZ;
    
    static {
        Covode.recordClassIndex(247);
    }
    
    public 01w(final AlertController.a liziz, final AlertController liz) {
        this.LIZIZ = liziz;
        this.LIZ = liz;
    }
    
    public final void onItemClick(final AdapterView<?> adapterView, final View view, final int n, final long n2) {
        this.LIZIZ.LJJ.onClick((DialogInterface)this.LIZ.LIZIZ, n);
        if (!this.LIZIZ.LJJIJIIJI) {
            this.LIZ.LIZIZ.dismiss();
        }
    }
}
