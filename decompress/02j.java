// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.ViewGroup;
import android.view.View;
import java.util.ArrayList;
import com.bytedance.covode.number.Covode;
import android.view.LayoutInflater;
import android.widget.BaseAdapter;

public final class 02j extends BaseAdapter
{
    public 12x LIZ;
    public boolean LIZIZ;
    public int LIZJ;
    public final boolean LIZLLL;
    public final LayoutInflater LJ;
    public final int LJFF;
    
    static {
        Covode.recordClassIndex(347);
    }
    
    public 02j(final 12x liz, final LayoutInflater lj, final boolean lizlll, final int ljff) {
        this.LIZJ = -1;
        this.LIZLLL = lizlll;
        this.LJ = lj;
        this.LIZ = liz;
        this.LJFF = ljff;
        this.LIZ();
    }
    
    private void LIZ() {
        final 130 ljiijji = this.LIZ.LJIIJJI;
        if (ljiijji != null) {
            final ArrayList<130> ljiij = this.LIZ.LJIIJ();
            for (int size = ljiij.size(), i = 0; i < size; ++i) {
                if (ljiij.get(i) == ljiijji) {
                    this.LIZJ = i;
                    return;
                }
            }
        }
        this.LIZJ = -1;
    }
    
    public final 130 LIZ(final int n) {
        ArrayList<130> list;
        if (this.LIZLLL) {
            list = this.LIZ.LJIIJ();
        }
        else {
            list = this.LIZ.LJIIIIZZ();
        }
        final int lizj = this.LIZJ;
        int n2 = n;
        if (lizj >= 0 && (n2 = n) >= lizj) {
            n2 = n + 1;
        }
        return list.get(n2);
    }
    
    public final int getCount() {
        ArrayList<130> list;
        if (this.LIZLLL) {
            list = this.LIZ.LJIIJ();
        }
        else {
            list = this.LIZ.LJIIIIZZ();
        }
        if (this.LIZJ < 0) {
            return list.size();
        }
        return list.size() - 1;
    }
    
    public final long getItemId(final int n) {
        return n;
    }
    
    public final View getView(final int n, final View view, final ViewGroup viewGroup) {
        final boolean b = false;
        View liz = view;
        if (view == null) {
            liz = 0II.LIZ(this.LJ, this.LJFF, viewGroup, false);
        }
        final int groupId = this.LIZ(n).getGroupId();
        final int n2 = n - 1;
        int groupId2;
        if (n2 >= 0) {
            groupId2 = this.LIZ(n2).getGroupId();
        }
        else {
            groupId2 = groupId;
        }
        final 12s 12s = (12s)liz;
        boolean groupDividerEnabled = b;
        if (this.LIZ.LIZIZ()) {
            groupDividerEnabled = b;
            if (groupId != groupId2) {
                groupDividerEnabled = true;
            }
        }
        12s.setGroupDividerEnabled(groupDividerEnabled);
        final 02t.a a = (02t.a)liz;
        if (this.LIZIZ) {
            12s.setForceShowIcon(true);
        }
        a.LIZ(this.LIZ(n));
        return liz;
    }
    
    public final void notifyDataSetChanged() {
        this.LIZ();
        super.notifyDataSetChanged();
    }
}
