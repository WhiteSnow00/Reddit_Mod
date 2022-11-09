// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.view.View;
import android.database.Cursor;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import androidx.appcompat.app.AlertController;
import android.widget.CursorAdapter;

public final class 01v extends CursorAdapter
{
    public final /* synthetic */ AlertController.RecycleListView LIZ;
    public final /* synthetic */ AlertController LIZIZ;
    public final /* synthetic */ AlertController.a LIZJ;
    public final int LIZLLL;
    public final int LJ;
    
    static {
        Covode.recordClassIndex(246);
    }
    
    public 01v(final AlertController.a lizj, final Context context, final Cursor cursor, final AlertController.RecycleListView liz, final AlertController liziz) {
        this.LIZJ = lizj;
        this.LIZ = liz;
        this.LIZIZ = liziz;
        super(context, cursor, false);
        final Cursor cursor2 = this.getCursor();
        this.LIZLLL = cursor2.getColumnIndexOrThrow(lizj.LJJIJLIJ);
        this.LJ = cursor2.getColumnIndexOrThrow(lizj.LJJIL);
    }
    
    public final void bindView(final View view, final Context context, final Cursor cursor) {
        ((CheckedTextView)view.findViewById(16908308)).setText((CharSequence)cursor.getString(this.LIZLLL));
        final AlertController.RecycleListView liz = this.LIZ;
        final int position = cursor.getPosition();
        final int int1 = cursor.getInt(this.LJ);
        boolean b = true;
        if (int1 != 1) {
            b = false;
        }
        liz.setItemChecked(position, b);
    }
    
    public final View newView(final Context context, final Cursor cursor, final ViewGroup viewGroup) {
        return 0II.LIZ(this.LIZJ.LIZIZ, this.LIZIZ.LJJIL, viewGroup, false);
    }
}
