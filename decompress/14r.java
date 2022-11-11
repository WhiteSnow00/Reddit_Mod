// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.os.Handler;
import android.widget.Filter;
import android.database.ContentObserver;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import android.widget.FilterQueryProvider;
import android.database.DataSetObserver;
import android.content.Context;
import android.database.Cursor;
import android.widget.Filterable;
import android.widget.BaseAdapter;

public abstract class 14r extends BaseAdapter implements Filterable, 08y.a
{
    public boolean LIZIZ;
    public boolean LIZJ;
    public Cursor LIZLLL;
    public Context LJ;
    public int LJFF;
    public a LJI;
    public DataSetObserver LJII;
    public 08y LJIIIIZZ;
    public FilterQueryProvider LJIIIZ;
    
    static {
        Covode.recordClassIndex(936);
    }
    
    public 14r(final Context lj) {
        this.LIZJ = true;
        this.LIZLLL = null;
        this.LIZIZ = false;
        this.LJ = lj;
        this.LJFF = -1;
        this.LJI = new a();
        this.LJII = new b();
    }
    
    public final Cursor LIZ() {
        return this.LIZLLL;
    }
    
    public Cursor LIZ(final CharSequence charSequence) {
        final FilterQueryProvider ljiiiz = this.LJIIIZ;
        if (ljiiiz != null) {
            return ljiiiz.runQuery(charSequence);
        }
        return this.LIZLLL;
    }
    
    public abstract View LIZ(final Context p0, final Cursor p1, final ViewGroup p2);
    
    public void LIZ(final Cursor lizlll) {
        final Cursor lizlll2 = this.LIZLLL;
        if (lizlll != lizlll2) {
            if (lizlll2 != null) {
                final a lji = this.LJI;
                if (lji != null) {
                    lizlll2.unregisterContentObserver((ContentObserver)lji);
                }
                final DataSetObserver ljii = this.LJII;
                if (ljii != null) {
                    lizlll2.unregisterDataSetObserver(ljii);
                }
            }
            if ((this.LIZLLL = lizlll) != null) {
                final a lji2 = this.LJI;
                if (lji2 != null) {
                    lizlll.registerContentObserver((ContentObserver)lji2);
                }
                final DataSetObserver ljii2 = this.LJII;
                if (ljii2 != null) {
                    lizlll.registerDataSetObserver(ljii2);
                }
                this.LJFF = lizlll.getColumnIndexOrThrow("_id");
                this.LIZIZ = true;
                this.notifyDataSetChanged();
            }
            else {
                this.LJFF = -1;
                this.LIZIZ = false;
                this.notifyDataSetInvalidated();
            }
            if (lizlll2 != null) {
                lizlll2.close();
            }
        }
    }
    
    public abstract void LIZ(final View p0, final Cursor p1);
    
    public View LIZIZ(final Context context, final Cursor cursor, final ViewGroup viewGroup) {
        return this.LIZ(context, cursor, viewGroup);
    }
    
    public CharSequence LIZIZ(final Cursor cursor) {
        if (cursor == null) {
            return "";
        }
        return cursor.toString();
    }
    
    public final void LIZIZ() {
        if (this.LIZJ) {
            final Cursor lizlll = this.LIZLLL;
            if (lizlll != null && !lizlll.isClosed()) {
                this.LIZIZ = this.LIZLLL.requery();
            }
        }
    }
    
    public int getCount() {
        if (this.LIZIZ) {
            final Cursor lizlll = this.LIZLLL;
            if (lizlll != null) {
                return lizlll.getCount();
            }
        }
        return 0;
    }
    
    public View getDropDownView(final int n, final View view, final ViewGroup viewGroup) {
        if (this.LIZIZ) {
            this.LIZLLL.moveToPosition(n);
            View liziz;
            if ((liziz = view) == null) {
                liziz = this.LIZIZ(this.LJ, this.LIZLLL, viewGroup);
            }
            this.LIZ(liziz, this.LIZLLL);
            return liziz;
        }
        return null;
    }
    
    public Filter getFilter() {
        if (this.LJIIIIZZ == null) {
            this.LJIIIIZZ = new 08y((08y.a)this);
        }
        return this.LJIIIIZZ;
    }
    
    public Object getItem(final int n) {
        if (this.LIZIZ) {
            final Cursor lizlll = this.LIZLLL;
            if (lizlll != null) {
                lizlll.moveToPosition(n);
                return this.LIZLLL;
            }
        }
        return null;
    }
    
    public long getItemId(final int n) {
        if (this.LIZIZ) {
            final Cursor lizlll = this.LIZLLL;
            if (lizlll != null && lizlll.moveToPosition(n)) {
                return this.LIZLLL.getLong(this.LJFF);
            }
        }
        return 0L;
    }
    
    public View getView(final int n, final View view, final ViewGroup viewGroup) {
        if (!this.LIZIZ) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (this.LIZLLL.moveToPosition(n)) {
            View liz;
            if ((liz = view) == null) {
                liz = this.LIZ(this.LJ, this.LIZLLL, viewGroup);
            }
            this.LIZ(liz, this.LIZLLL);
            return liz;
        }
        throw new IllegalStateException("couldn't move cursor to position ".concat(String.valueOf(n)));
    }
    
    public boolean hasStableIds() {
        return true;
    }
    
    public final class a extends ContentObserver
    {
        static {
            Covode.recordClassIndex(937);
        }
        
        public a() {
            super(new Handler());
        }
        
        public final boolean deliverSelfNotifications() {
            return true;
        }
        
        public final void onChange(final boolean b) {
            14r.this.LIZIZ();
        }
    }
    
    public final class b extends DataSetObserver
    {
        static {
            Covode.recordClassIndex(938);
        }
        
        public final void onChanged() {
            14r.this.LIZIZ = true;
            14r.this.notifyDataSetChanged();
        }
        
        public final void onInvalidated() {
            14r.this.LIZIZ = false;
            14r.this.notifyDataSetInvalidated();
        }
    }
}
