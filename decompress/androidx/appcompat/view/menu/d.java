// 
// Decompiled by Procyon v0.6.0
// 

package androidx.appcompat.view.menu;

import android.app.Dialog;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.view.WindowManager$LayoutParams;
import android.view.View;
import android.content.DialogInterface$OnDismissListener;
import android.content.DialogInterface$OnKeyListener;
import android.content.DialogInterface$OnClickListener;
import android.widget.ListAdapter;
import androidx.appcompat.app.e$a;
import android.util.SparseArray;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.content.Context;
import android.widget.AdapterView$OnItemClickListener;

public final class d implements i, AdapterView$OnItemClickListener
{
    public Context f;
    public LayoutInflater g;
    public MenuBuilder h;
    public ExpandedMenuView i;
    public i$a j;
    public d.d$a k;
    
    public d(final Context f) {
        this.f = f;
        this.g = LayoutInflater.from(f);
    }
    
    public final void b(final MenuBuilder menuBuilder, final boolean b) {
        final i$a j = this.j;
        if (j != null) {
            j.b(menuBuilder, b);
        }
    }
    
    public final Parcelable c() {
        if (this.i == null) {
            return null;
        }
        final Bundle bundle = new Bundle();
        final SparseArray sparseArray = new SparseArray();
        final ExpandedMenuView i = this.i;
        if (i != null) {
            ((View)i).saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        return (Parcelable)bundle;
    }
    
    public final boolean d(final g g) {
        return false;
    }
    
    public final boolean e() {
        return false;
    }
    
    public final void f(final Context f, final MenuBuilder h) {
        if (this.f != null) {
            this.f = f;
            if (this.g == null) {
                this.g = LayoutInflater.from(f);
            }
        }
        this.h = h;
        final d.d$a k = this.k;
        if (k != null) {
            k.notifyDataSetChanged();
        }
    }
    
    public final void g(final i$a j) {
        this.j = j;
    }
    
    public final int getId() {
        return 0;
    }
    
    public final boolean i(final g g) {
        return false;
    }
    
    public final void j(final Parcelable parcelable) {
        final SparseArray sparseParcelableArray = ((Bundle)parcelable).getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            ((View)this.i).restoreHierarchyState(sparseParcelableArray);
        }
    }
    
    public final void k() {
        final d.d$a k = this.k;
        if (k != null) {
            k.notifyDataSetChanged();
        }
    }
    
    public final boolean l(final l l) {
        if (!((MenuBuilder)l).hasVisibleItems()) {
            return false;
        }
        final f onDismissListener = new f((MenuBuilder)l);
        final e$a e$a = new e$a(((MenuBuilder)l).getContext());
        final d h = new d(e$a.getContext());
        onDismissListener.h = h;
        h.j = (i$a)onDismissListener;
        onDismissListener.f.addMenuPresenter((i)h);
        final d h2 = onDismissListener.h;
        if (h2.k == null) {
            h2.k = new d.d$a(h2);
        }
        e$a.setAdapter((ListAdapter)h2.k, (DialogInterface$OnClickListener)onDismissListener);
        final View headerView = ((MenuBuilder)l).getHeaderView();
        if (headerView != null) {
            e$a.setCustomTitle(headerView);
        }
        else {
            e$a.setIcon(((MenuBuilder)l).getHeaderIcon()).setTitle(((MenuBuilder)l).getHeaderTitle());
        }
        e$a.setOnKeyListener((DialogInterface$OnKeyListener)onDismissListener);
        ((Dialog)(onDismissListener.g = e$a.create())).setOnDismissListener((DialogInterface$OnDismissListener)onDismissListener);
        final WindowManager$LayoutParams attributes = ((Dialog)onDismissListener.g).getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 0x20000;
        ((Dialog)onDismissListener.g).show();
        final i$a j = this.j;
        if (j != null) {
            j.c((MenuBuilder)l);
        }
        return true;
    }
    
    public final void onItemClick(final AdapterView<?> adapterView, final View view, final int n, final long n2) {
        this.h.performItemAction((MenuItem)this.k.c(n), (i)this, 0);
    }
}
