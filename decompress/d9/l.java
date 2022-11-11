// 
// Decompiled by Procyon v0.6.0
// 

package d9;

import android.util.Log;
import android.content.Context;
import com.bumptech.glide.c;
import android.app.Activity;
import java.util.Iterator;
import java.util.Collections;
import java.util.Set;
import com.bumptech.glide.j;
import java.util.HashSet;
import android.app.Fragment;

@Deprecated
public final class l extends Fragment
{
    public final d9.a f;
    public final a g;
    public final HashSet h;
    public j i;
    public l j;
    public Fragment k;
    
    public l() {
        final d9.a f = new d9.a();
        this.g = new a();
        this.h = new HashSet();
        this.f = f;
    }
    
    public final Set<l> a() {
        if (this.equals(this.j)) {
            return Collections.unmodifiableSet((Set<? extends l>)this.h);
        }
        if (this.j != null) {
            final HashSet set = new HashSet();
            for (final l l : this.j.a()) {
                Fragment fragment = l.getParentFragment();
                final Fragment parentFragment = this.getParentFragment();
                boolean b;
                while (true) {
                    final Fragment parentFragment2 = fragment.getParentFragment();
                    if (parentFragment2 == null) {
                        b = false;
                        break;
                    }
                    if (parentFragment2.equals((Object)parentFragment)) {
                        b = true;
                        break;
                    }
                    fragment = fragment.getParentFragment();
                }
                if (b) {
                    set.add(l);
                }
            }
            return (Set<l>)Collections.unmodifiableSet((Set<?>)set);
        }
        return Collections.emptySet();
    }
    
    public final void b(final Activity activity) {
        final l j = this.j;
        if (j != null) {
            j.h.remove(this);
            this.j = null;
        }
        final m k = c.b((Context)activity).k;
        k.getClass();
        final l i = k.i(activity.getFragmentManager(), null);
        this.j = i;
        if (!this.equals(i)) {
            this.j.h.add(this);
        }
    }
    
    public final void onAttach(final Activity activity) {
        super.onAttach(activity);
        try {
            this.b(activity);
        }
        catch (final IllegalStateException ex) {
            if (Log.isLoggable("RMFragment", 5)) {
                Log.w("RMFragment", "Unable to register fragment with root", (Throwable)ex);
            }
        }
    }
    
    public final void onDestroy() {
        super.onDestroy();
        this.f.b();
        final l j = this.j;
        if (j != null) {
            j.h.remove(this);
            this.j = null;
        }
    }
    
    public final void onDetach() {
        super.onDetach();
        final l j = this.j;
        if (j != null) {
            j.h.remove(this);
            this.j = null;
        }
    }
    
    public final void onStart() {
        super.onStart();
        this.f.c();
    }
    
    public final void onStop() {
        super.onStop();
        this.f.e();
    }
    
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("{parent=");
        Fragment fragment = this.getParentFragment();
        if (fragment == null) {
            fragment = this.k;
        }
        sb.append(fragment);
        sb.append("}");
        return sb.toString();
    }
    
    public final class a implements n
    {
        @Override
        public final Set<j> a() {
            final Set<l> a = l.this.a();
            final HashSet set = new HashSet<j>(a.size());
            final Iterator iterator = a.iterator();
            while (iterator.hasNext()) {
                final j i = ((l)iterator.next()).i;
                if (i != null) {
                    set.add(i);
                }
            }
            return (Set<j>)set;
        }
        
        @Override
        public final String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            sb.append("{fragment=");
            sb.append(l.this);
            sb.append("}");
            return sb.toString();
        }
    }
}
