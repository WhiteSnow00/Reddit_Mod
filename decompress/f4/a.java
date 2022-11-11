// 
// Decompiled by Procyon v0.6.0
// 

package f4;

import android.widget.Filter;
import android.view.ViewGroup;
import android.database.DataSetObserver;
import android.database.ContentObserver;
import android.view.View;
import android.content.Context;
import android.database.Cursor;
import android.widget.Filterable;
import android.widget.BaseAdapter;

public abstract class a extends BaseAdapter implements Filterable, b$a
{
    public boolean f;
    public boolean g;
    public Cursor h;
    public int i;
    public a.a$a j;
    public a.a$b k;
    public b l;
    
    public a(final Context context) {
        this.g = true;
        this.h = null;
        this.f = false;
        this.i = -1;
        this.j = new a.a$a(this);
        this.k = new a.a$b(this);
    }
    
    public abstract void b(final View p0, final Cursor p1);
    
    public void c(Cursor h) {
        final Cursor h2 = this.h;
        if (h == h2) {
            h = null;
        }
        else {
            if (h2 != null) {
                final a.a$a j = this.j;
                if (j != null) {
                    h2.unregisterContentObserver((ContentObserver)j);
                }
                final a.a$b k = this.k;
                if (k != null) {
                    h2.unregisterDataSetObserver((DataSetObserver)k);
                }
            }
            if ((this.h = h) != null) {
                final a.a$a i = this.j;
                if (i != null) {
                    h.registerContentObserver((ContentObserver)i);
                }
                final a.a$b l = this.k;
                if (l != null) {
                    h.registerDataSetObserver((DataSetObserver)l);
                }
                this.i = h.getColumnIndexOrThrow("_id");
                this.f = true;
                this.notifyDataSetChanged();
                h = h2;
            }
            else {
                this.i = -1;
                this.f = false;
                this.notifyDataSetInvalidated();
                h = h2;
            }
        }
        if (h != null) {
            h.close();
        }
    }
    
    public abstract String d(final Cursor p0);
    
    public abstract View e(final ViewGroup p0);
    
    public final int getCount() {
        if (this.f) {
            final Cursor h = this.h;
            if (h != null) {
                return h.getCount();
            }
        }
        return 0;
    }
    
    public View getDropDownView(final int n, final View view, final ViewGroup viewGroup) {
        if (this.f) {
            this.h.moveToPosition(n);
            View inflate;
            if ((inflate = view) == null) {
                final c c = (c)this;
                inflate = c.o.inflate(c.n, viewGroup, false);
            }
            this.b(inflate, this.h);
            return inflate;
        }
        return null;
    }
    
    public final Filter getFilter() {
        if (this.l == null) {
            this.l = new b((b$a)this);
        }
        return (Filter)this.l;
    }
    
    public final Object getItem(final int n) {
        if (this.f) {
            final Cursor h = this.h;
            if (h != null) {
                h.moveToPosition(n);
                return this.h;
            }
        }
        return null;
    }
    
    public final long getItemId(final int n) {
        if (this.f) {
            final Cursor h = this.h;
            if (h != null && h.moveToPosition(n)) {
                return this.h.getLong(this.i);
            }
        }
        return 0L;
    }
    
    public View getView(final int n, final View view, final ViewGroup viewGroup) {
        if (!this.f) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (this.h.moveToPosition(n)) {
            View e;
            if ((e = view) == null) {
                e = this.e(viewGroup);
            }
            this.b(e, this.h);
            return e;
        }
        throw new IllegalStateException(d.h("couldn't move cursor to position ", n));
    }
}
