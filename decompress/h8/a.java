// 
// Decompiled by Procyon v0.6.0
// 

package h8;

import android.os.BaseBundle;
import java.util.Collection;
import android.os.Parcelable;
import android.view.View;
import java.util.Iterator;
import c8.e;
import android.view.ViewGroup;
import com.bluelinelabs.conductor.d;
import java.util.ArrayList;
import com.bluelinelabs.conductor.Router;
import android.os.Bundle;
import android.util.SparseArray;
import java.util.HashMap;
import com.bluelinelabs.conductor.Controller;

public abstract class a extends androidx.viewpager.widget.a
{
    public final Controller a;
    public int b;
    public final HashMap c;
    public SparseArray<Bundle> d;
    public final SparseArray<Router> e;
    public ArrayList<Integer> f;
    public Router g;
    
    public a(final Controller a) {
        this.b = Integer.MAX_VALUE;
        this.c = new HashMap();
        this.d = (SparseArray<Bundle>)new SparseArray();
        this.e = (SparseArray<Router>)new SparseArray();
        this.f = new ArrayList<Integer>();
        this.a = a;
    }
    
    public abstract void a(final int p0, final d p1);
    
    public final void b() {
        while (this.d.size() > this.b) {
            this.d.remove((int)this.f.remove(0));
        }
    }
    
    public final void destroyItem(final ViewGroup viewGroup, final int n, final Object o) {
        final Router router = (Router)o;
        final Bundle bundle = new Bundle();
        router.O(bundle);
        this.d.put(n, (Object)bundle);
        this.f.remove((Object)n);
        this.f.add(n);
        this.b();
        this.a.EB(router);
        this.e.remove(n);
    }
    
    public long getItemId(final int n) {
        return n;
    }
    
    public Object instantiateItem(final ViewGroup viewGroup, final int n) {
        final int id = ((View)viewGroup).getId();
        final long itemId = this.getItemId(n);
        final StringBuilder sb = new StringBuilder();
        sb.append(id);
        sb.append(":");
        sb.append(itemId);
        final String string = sb.toString();
        if (this.c.get(n) != null && !this.c.get(n).equals(string)) {
            this.d.remove(n);
        }
        final d cb = this.a.cB(viewGroup, string, true);
        if (!((Router)cb).n()) {
            final Bundle bundle = (Bundle)this.d.get(n);
            if (bundle != null) {
                cb.N(bundle);
                this.d.remove(n);
                this.f.remove((Object)n);
            }
        }
        ((Router)cb).J();
        this.a(n, cb);
        if (cb != this.g) {
            final Iterator iterator = ((Router)cb).e().iterator();
            while (iterator.hasNext()) {
                ((e)iterator.next()).a.MB(true);
            }
        }
        this.c.put(n, string);
        this.e.put(n, (Object)cb);
        return cb;
    }
    
    public final boolean isViewFromObject(final View view, final Object o) {
        final Iterator iterator = ((Router)o).e().iterator();
        while (iterator.hasNext()) {
            if (((e)iterator.next()).a.q == view) {
                return true;
            }
        }
        return false;
    }
    
    public final void restoreState(final Parcelable parcelable, final ClassLoader classLoader) {
        final Bundle bundle = (Bundle)parcelable;
        if (parcelable != null) {
            this.d = (SparseArray<Bundle>)bundle.getSparseParcelableArray("RouterPagerAdapter.savedStates");
            this.b = ((BaseBundle)bundle).getInt("RouterPagerAdapter.maxPagesToStateSave");
            this.f = bundle.getIntegerArrayList("RouterPagerAdapter.savedPageHistory");
            final ArrayList integerArrayList = bundle.getIntegerArrayList("RouterPagerAdapter.tags.keys");
            final ArrayList stringArrayList = bundle.getStringArrayList("RouterPagerAdapter.tags.values");
            if (integerArrayList != null && stringArrayList != null && integerArrayList.size() == stringArrayList.size()) {
                for (int i = 0; i < integerArrayList.size(); ++i) {
                    this.c.put(integerArrayList.get(i), stringArrayList.get(i));
                }
            }
        }
    }
    
    public final Parcelable saveState() {
        final Bundle bundle = new Bundle();
        bundle.putSparseParcelableArray("RouterPagerAdapter.savedStates", (SparseArray)this.d);
        bundle.putIntegerArrayList("RouterPagerAdapter.tags.keys", new ArrayList(this.c.keySet()));
        bundle.putStringArrayList("RouterPagerAdapter.tags.values", new ArrayList(this.c.values()));
        ((BaseBundle)bundle).putInt("RouterPagerAdapter.maxPagesToStateSave", this.b);
        bundle.putIntegerArrayList("RouterPagerAdapter.savedPageHistory", (ArrayList)this.f);
        return (Parcelable)bundle;
    }
    
    public void setPrimaryItem(final ViewGroup viewGroup, final int n, final Object o) {
        final Router g = (Router)o;
        final Router g2 = this.g;
        if (g != g2) {
            if (g2 != null) {
                final Iterator iterator = g2.e().iterator();
                while (iterator.hasNext()) {
                    ((e)iterator.next()).a.MB(true);
                }
            }
            if (g != null) {
                final Iterator iterator2 = g.e().iterator();
                while (iterator2.hasNext()) {
                    ((e)iterator2.next()).a.MB(false);
                }
            }
            this.g = g;
        }
    }
}
