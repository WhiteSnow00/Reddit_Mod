// 
// Decompiled by Procyon v0.6.0
// 

package e9;

import android.util.Log;
import com.bumptech.glide.c;
import androidx.fragment.app.d0;
import android.content.Context;
import java.util.Iterator;
import java.util.Collections;
import java.util.Set;
import com.bumptech.glide.j;
import java.util.HashSet;
import androidx.fragment.app.Fragment;

public class o extends Fragment
{
    public final a f;
    public final o.o$a g;
    public final HashSet h;
    public o i;
    public j j;
    public Fragment k;
    
    public o() {
        final a f = new a();
        this.g = new o.o$a(this);
        this.h = new HashSet();
        this.f = f;
    }
    
    public final Set<o> n0() {
        final o i = this.i;
        if (i == null) {
            return Collections.emptySet();
        }
        if (this.equals((Object)i)) {
            return Collections.unmodifiableSet((Set<? extends o>)this.h);
        }
        final HashSet set = new HashSet();
        for (final o o : this.i.n0()) {
            Fragment fragment = o.getParentFragment();
            if (fragment == null) {
                fragment = o.k;
            }
            Fragment fragment2 = this.getParentFragment();
            if (fragment2 == null) {
                fragment2 = this.k;
            }
            boolean b;
            while (true) {
                final Fragment parentFragment = fragment.getParentFragment();
                if (parentFragment == null) {
                    b = false;
                    break;
                }
                if (parentFragment.equals((Object)fragment2)) {
                    b = true;
                    break;
                }
                fragment = fragment.getParentFragment();
            }
            if (b) {
                set.add(o);
            }
        }
        return (Set<o>)Collections.unmodifiableSet((Set<?>)set);
    }
    
    public final void o0(final Context context, final d0 d0) {
        final o i = this.i;
        if (i != null) {
            i.h.remove(this);
            this.i = null;
        }
        final o j = c.b(context).k.j(d0, (Fragment)null);
        this.i = j;
        if (!this.equals((Object)j)) {
            this.i.h.add(this);
        }
    }
    
    public final void onAttach(final Context context) {
        super.onAttach(context);
        Fragment parentFragment;
        for (parentFragment = this; parentFragment.getParentFragment() != null; parentFragment = parentFragment.getParentFragment()) {}
        final d0 fragmentManager = parentFragment.getFragmentManager();
        if (fragmentManager == null) {
            if (Log.isLoggable("SupportRMFragment", 5)) {
                Log.w("SupportRMFragment", "Unable to register fragment with root, ancestor detached");
            }
            return;
        }
        try {
            this.o0(this.getContext(), fragmentManager);
        }
        catch (final IllegalStateException ex) {
            if (Log.isLoggable("SupportRMFragment", 5)) {
                Log.w("SupportRMFragment", "Unable to register fragment with root", (Throwable)ex);
            }
        }
    }
    
    public final void onDestroy() {
        super.onDestroy();
        this.f.c();
        final o i = this.i;
        if (i != null) {
            i.h.remove(this);
            this.i = null;
        }
    }
    
    public final void onDetach() {
        super.onDetach();
        this.k = null;
        final o i = this.i;
        if (i != null) {
            i.h.remove(this);
            this.i = null;
        }
    }
    
    public final void onStart() {
        super.onStart();
        this.f.d();
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
}
