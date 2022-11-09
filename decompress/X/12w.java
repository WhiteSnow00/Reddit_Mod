// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.content.DialogInterface$OnKeyListener;
import java.util.ArrayList;
import android.widget.BaseAdapter;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.view.WindowManager$LayoutParams;
import android.view.View;
import android.app.Dialog;
import android.content.DialogInterface$OnDismissListener;
import android.content.DialogInterface$OnClickListener;
import android.util.SparseArray;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.ContextThemeWrapper;
import android.widget.ListAdapter;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import android.view.LayoutInflater;
import android.content.Context;
import android.widget.AdapterView$OnItemClickListener;

public final class 12w implements AdapterView$OnItemClickListener, 02r
{
    public Context LIZ;
    public LayoutInflater LIZIZ;
    public 12x LIZJ;
    public 12r LIZLLL;
    public int LJ;
    public int LJFF;
    public int LJI;
    public 02r.a LJII;
    public a LJIIIIZZ;
    public int LJIIIZ;
    
    static {
        Covode.recordClassIndex(345);
    }
    
    public 12w() {
        this.LJI = 2131558455;
        this.LJFF = 0;
    }
    
    public 12w(final Context liz) {
        this();
        this.LIZ = liz;
        this.LIZIZ = LayoutInflater.from(liz);
    }
    
    public final 02t LIZ(final ViewGroup viewGroup) {
        if (this.LIZLLL == null) {
            this.LIZLLL = (12r)0II.LIZ(this.LIZIZ, 2131558452, viewGroup, false);
            if (this.LJIIIIZZ == null) {
                this.LJIIIIZZ = new a();
            }
            this.LIZLLL.setAdapter((ListAdapter)this.LJIIIIZZ);
            this.LIZLLL.setOnItemClickListener((AdapterView$OnItemClickListener)this);
        }
        return this.LIZLLL;
    }
    
    public final void LIZ(final 02r.a ljii) {
        this.LJII = ljii;
    }
    
    public final void LIZ(final 12x 12x, final boolean b) {
        final 02r.a ljii = this.LJII;
        if (ljii != null) {
            ljii.LIZ(12x, b);
        }
    }
    
    public final void LIZ(final Context liz, final 12x lizj) {
        if (this.LJFF != 0) {
            final ContextThemeWrapper liz2 = new ContextThemeWrapper(liz, this.LJFF);
            this.LIZ = (Context)liz2;
            this.LIZIZ = LayoutInflater.from((Context)liz2);
        }
        else if (this.LIZ != null) {
            this.LIZ = liz;
            if (this.LIZIZ == null) {
                this.LIZIZ = LayoutInflater.from(liz);
            }
        }
        this.LIZJ = lizj;
        final a ljiiiizz = this.LJIIIIZZ;
        if (ljiiiizz != null) {
            ljiiiizz.notifyDataSetChanged();
        }
    }
    
    public final void LIZ(final Parcelable parcelable) {
        final SparseArray sparseParcelableArray = ((Bundle)parcelable).getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            ((View)this.LIZLLL).restoreHierarchyState(sparseParcelableArray);
        }
    }
    
    public final void LIZ(final boolean b) {
        final a ljiiiizz = this.LJIIIIZZ;
        if (ljiiiizz != null) {
            ljiiiizz.notifyDataSetChanged();
        }
    }
    
    public final boolean LIZ() {
        return false;
    }
    
    public final boolean LIZ(final 1fZ 1fZ) {
        if (!1fZ.hasVisibleItems()) {
            return false;
        }
        final 12y onDismissListener = new 12y(1fZ);
        final 12x liz = onDismissListener.LIZ;
        final 1fM.a a = new 1fM.a(liz.LIZ);
        onDismissListener.LIZJ = new 12w(a.LIZ.LIZ);
        onDismissListener.LIZJ.LJII = onDismissListener;
        onDismissListener.LIZ.LIZ(onDismissListener.LIZJ);
        a.LIZ(onDismissListener.LIZJ.LIZJ(), (DialogInterface$OnClickListener)onDismissListener);
        final View ljiiiz = liz.LJIIIZ;
        if (ljiiiz != null) {
            a.LIZ.LJI = ljiiiz;
        }
        else {
            a.LIZ.LIZLLL = liz.LJIIIIZZ;
            a.LIZ(liz.LJII);
        }
        a.LIZ.LJIJJ = (DialogInterface$OnKeyListener)onDismissListener;
        (onDismissListener.LIZIZ = a.LIZ()).setOnDismissListener((DialogInterface$OnDismissListener)onDismissListener);
        final WindowManager$LayoutParams attributes = onDismissListener.LIZIZ.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 0x20000;
        final 1fM liziz = onDismissListener.LIZIZ;
        liziz.show();
        KN6.LIZ.LIZ((Dialog)liziz);
        final 02r.a ljii = this.LJII;
        if (ljii != null) {
            ljii.LIZ(1fZ);
        }
        return true;
    }
    
    public final int LIZIZ() {
        return this.LJIIIZ;
    }
    
    public final boolean LIZIZ(final 130 130) {
        return false;
    }
    
    public final ListAdapter LIZJ() {
        if (this.LJIIIIZZ == null) {
            this.LJIIIIZZ = new a();
        }
        return (ListAdapter)this.LJIIIIZZ;
    }
    
    public final boolean LIZJ(final 130 130) {
        return false;
    }
    
    public final Parcelable LJFF() {
        if (this.LIZLLL == null) {
            return null;
        }
        final Bundle bundle = new Bundle();
        final SparseArray sparseArray = new SparseArray();
        final 12r lizlll = this.LIZLLL;
        if (lizlll != null) {
            ((View)lizlll).saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        return (Parcelable)bundle;
    }
    
    public final void onItemClick(final AdapterView<?> adapterView, final View view, final int n, final long n2) {
        this.LIZJ.LIZ((MenuItem)this.LJIIIIZZ.LIZ(n), this, 0);
    }
    
    public final class a extends BaseAdapter
    {
        public int LIZIZ;
        
        static {
            Covode.recordClassIndex(346);
        }
        
        public a() {
            this.LIZIZ = -1;
            this.LIZ();
        }
        
        private void LIZ() {
            final 130 ljiijji = 12w.this.LIZJ.LJIIJJI;
            if (ljiijji != null) {
                final ArrayList<130> ljiij = 12w.this.LIZJ.LJIIJ();
                for (int size = ljiij.size(), i = 0; i < size; ++i) {
                    if (ljiij.get(i) == ljiijji) {
                        this.LIZIZ = i;
                        return;
                    }
                }
            }
            this.LIZIZ = -1;
        }
        
        public final 130 LIZ(int n) {
            final ArrayList<130> ljiij = 12w.this.LIZJ.LJIIJ();
            final int n2 = n + 12w.this.LJ;
            final int liziz = this.LIZIZ;
            n = n2;
            if (liziz >= 0 && (n = n2) >= liziz) {
                n = n2 + 1;
            }
            return ljiij.get(n);
        }
        
        public final int getCount() {
            final int n = 12w.this.LIZJ.LJIIJ().size() - 12w.this.LJ;
            if (this.LIZIZ < 0) {
                return n;
            }
            return n - 1;
        }
        
        public final long getItemId(final int n) {
            return n;
        }
        
        public final View getView(final int n, final View view, final ViewGroup viewGroup) {
            View liz = view;
            if (view == null) {
                liz = 0II.LIZ(12w.this.LIZIZ, 12w.this.LJI, viewGroup, false);
            }
            ((02t.a)liz).LIZ(this.LIZ(n));
            return liz;
        }
        
        public final void notifyDataSetChanged() {
            this.LIZ();
            super.notifyDataSetChanged();
        }
    }
}
