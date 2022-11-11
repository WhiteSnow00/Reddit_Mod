// 
// Decompiled by Procyon v0.6.0
// 

package androidx.fragment.app;

import ak0.n;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;
import android.util.Log;
import java.util.Collection;
import android.view.View;
import a4.p0;
import java.util.ArrayList;
import android.view.ViewGroup;

public abstract class SpecialEffectsController
{
    public final ViewGroup a;
    public final ArrayList<Operation> b;
    public final ArrayList<Operation> c;
    public boolean d;
    public boolean e;
    
    public SpecialEffectsController(final ViewGroup a) {
        this.b = new ArrayList<Operation>();
        this.c = new ArrayList<Operation>();
        this.d = false;
        this.e = false;
        this.a = a;
    }
    
    public static SpecialEffectsController f(final ViewGroup viewGroup, final d0 d0) {
        return g(viewGroup, d0.K());
    }
    
    public static SpecialEffectsController g(final ViewGroup viewGroup, final x0 x0) {
        final Object tag = ((View)viewGroup).getTag(2131431371);
        if (tag instanceof SpecialEffectsController) {
            return (SpecialEffectsController)tag;
        }
        x0.getClass();
        final androidx.fragment.app.d d = new androidx.fragment.app.d(viewGroup);
        ((View)viewGroup).setTag(2131431371, (Object)d);
        return d;
    }
    
    public final void a(final State state, final LifecycleImpact lifecycleImpact, final l0 l0) {
        synchronized (this.b) {
            final v3.d d = new v3.d();
            final Operation d2 = this.d(l0.c);
            if (d2 != null) {
                d2.c(state, lifecycleImpact);
                return;
            }
            final d d3 = new d(state, lifecycleImpact, l0, d);
            this.b.add((Operation)d3);
            ((Operation)d3).d.add(new Runnable() {
                @Override
                public final void run() {
                    if (SpecialEffectsController.this.b.contains(d3)) {
                        final d f = d3;
                        f.a.applyState(f.c.mView);
                    }
                }
            });
            ((Operation)d3).d.add(new Runnable() {
                @Override
                public final void run() {
                    SpecialEffectsController.this.b.remove(d3);
                    SpecialEffectsController.this.c.remove(d3);
                }
            });
        }
    }
    
    public abstract void b(final ArrayList p0, final boolean p1);
    
    public final void c() {
        if (this.e) {
            return;
        }
        final ViewGroup a = this.a;
        final WeakHashMap a2 = p0.a;
        if (!p0.g.b((View)a)) {
            this.e();
            this.d = false;
            return;
        }
        synchronized (this.b) {
            if (!this.b.isEmpty()) {
                final ArrayList list = new ArrayList(this.c);
                this.c.clear();
                for (final Operation operation : list) {
                    if (d0.M(2)) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("SpecialEffectsController: Cancelling operation ");
                        sb.append(operation);
                        Log.v("FragmentManager", sb.toString());
                    }
                    operation.a();
                    if (!operation.g) {
                        this.c.add(operation);
                    }
                }
                this.i();
                final ArrayList list2 = new ArrayList<Object>((Collection<? extends E>)this.b);
                this.b.clear();
                this.c.addAll(list2);
                if (d0.M(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                }
                final Iterator iterator2 = list2.iterator();
                while (iterator2.hasNext()) {
                    ((Operation)iterator2.next()).d();
                }
                this.b(list2, this.d);
                this.d = false;
                if (d0.M(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                }
            }
        }
    }
    
    public final Operation d(final Fragment fragment) {
        for (final Operation operation : this.b) {
            if (operation.c.equals((Object)fragment) && !operation.f) {
                return operation;
            }
        }
        return null;
    }
    
    public final void e() {
        if (d0.M(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        final ViewGroup a = this.a;
        final WeakHashMap a2 = p0.a;
        final boolean b = p0.g.b((View)a);
        synchronized (this.b) {
            this.i();
            final Iterator<Operation> iterator = this.b.iterator();
            while (iterator.hasNext()) {
                iterator.next().d();
            }
            for (final Operation operation : new ArrayList(this.c)) {
                if (d0.M(2)) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("SpecialEffectsController: ");
                    String string;
                    if (b) {
                        string = "";
                    }
                    else {
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append("Container ");
                        sb2.append(this.a);
                        sb2.append(" is not attached to window. ");
                        string = sb2.toString();
                    }
                    sb.append(string);
                    sb.append("Cancelling running operation ");
                    sb.append(operation);
                    Log.v("FragmentManager", sb.toString());
                }
                operation.a();
            }
            for (final Operation operation2 : new ArrayList(this.b)) {
                if (d0.M(2)) {
                    final StringBuilder sb3 = new StringBuilder();
                    sb3.append("SpecialEffectsController: ");
                    String string2;
                    if (b) {
                        string2 = "";
                    }
                    else {
                        final StringBuilder sb4 = new StringBuilder();
                        sb4.append("Container ");
                        sb4.append(this.a);
                        sb4.append(" is not attached to window. ");
                        string2 = sb4.toString();
                    }
                    sb3.append(string2);
                    sb3.append("Cancelling pending operation ");
                    sb3.append(operation2);
                    Log.v("FragmentManager", sb3.toString());
                }
                operation2.a();
            }
        }
    }
    
    public final void h() {
        synchronized (this.b) {
            this.i();
            this.e = false;
            for (int i = this.b.size() - 1; i >= 0; --i) {
                final Operation operation = this.b.get(i);
                final State from = State.from(operation.c.mView);
                final State a = operation.a;
                final State visible = State.VISIBLE;
                if (a == visible && from != visible) {
                    this.e = operation.c.isPostponed();
                    break;
                }
            }
        }
    }
    
    public final void i() {
        for (final Operation operation : this.b) {
            if (operation.b == LifecycleImpact.ADDING) {
                operation.c(State.from(operation.c.requireView().getVisibility()), LifecycleImpact.NONE);
            }
        }
    }
    
    public static class Operation
    {
        public State a;
        public LifecycleImpact b;
        public final Fragment c;
        public final ArrayList d;
        public final HashSet<v3.d> e;
        public boolean f;
        public boolean g;
        
        public Operation(final State a, final LifecycleImpact b, final Fragment c, final v3.d d) {
            this.d = new ArrayList();
            this.e = new HashSet<v3.d>();
            this.f = false;
            this.g = false;
            this.a = a;
            this.b = b;
            this.c = c;
            d.b((v3.d.b)new v3.d.b() {
                @Override
                public final void onCancel() {
                    Operation.this.a();
                }
            });
        }
        
        public final void a() {
            if (this.f) {
                return;
            }
            this.f = true;
            if (this.e.isEmpty()) {
                this.b();
            }
            else {
                final Iterator iterator = new ArrayList(this.e).iterator();
                while (iterator.hasNext()) {
                    ((v3.d)iterator.next()).a();
                }
            }
        }
        
        public void b() {
            if (this.g) {
                return;
            }
            if (d0.M(2)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("SpecialEffectsController: ");
                sb.append(this);
                sb.append(" has called complete.");
                Log.v("FragmentManager", sb.toString());
            }
            this.g = true;
            final Iterator iterator = this.d.iterator();
            while (iterator.hasNext()) {
                ((Runnable)iterator.next()).run();
            }
        }
        
        public final void c(final State a, final LifecycleImpact lifecycleImpact) {
            final int n = SpecialEffectsController$c.b[lifecycleImpact.ordinal()];
            if (n != 1) {
                if (n != 2) {
                    if (n == 3) {
                        if (this.a != State.REMOVED) {
                            if (d0.M(2)) {
                                final StringBuilder k = a.k("SpecialEffectsController: For fragment ");
                                k.append(this.c);
                                k.append(" mFinalState = ");
                                k.append(this.a);
                                k.append(" -> ");
                                k.append(a);
                                k.append(". ");
                                Log.v("FragmentManager", k.toString());
                            }
                            this.a = a;
                        }
                    }
                }
                else {
                    if (d0.M(2)) {
                        final StringBuilder i = a.k("SpecialEffectsController: For fragment ");
                        i.append(this.c);
                        i.append(" mFinalState = ");
                        i.append(this.a);
                        i.append(" -> REMOVED. mLifecycleImpact  = ");
                        i.append(this.b);
                        i.append(" to REMOVING.");
                        Log.v("FragmentManager", i.toString());
                    }
                    this.a = State.REMOVED;
                    this.b = LifecycleImpact.REMOVING;
                }
            }
            else if (this.a == State.REMOVED) {
                if (d0.M(2)) {
                    final StringBuilder j = a.k("SpecialEffectsController: For fragment ");
                    j.append(this.c);
                    j.append(" mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = ");
                    j.append(this.b);
                    j.append(" to ADDING.");
                    Log.v("FragmentManager", j.toString());
                }
                this.a = State.VISIBLE;
                this.b = LifecycleImpact.ADDING;
            }
        }
        
        public void d() {
        }
        
        @Override
        public final String toString() {
            final StringBuilder q = d.q("Operation ", "{");
            q.append(Integer.toHexString(System.identityHashCode(this)));
            q.append("} ");
            q.append("{");
            q.append("mFinalState = ");
            q.append(this.a);
            q.append("} ");
            q.append("{");
            q.append("mLifecycleImpact = ");
            q.append(this.b);
            q.append("} ");
            q.append("{");
            q.append("mFragment = ");
            q.append(this.c);
            q.append("}");
            return q.toString();
        }
        
        public enum LifecycleImpact
        {
            ADDING, 
            NONE, 
            REMOVING;
        }
        
        public enum State
        {
            GONE, 
            INVISIBLE, 
            REMOVED, 
            VISIBLE;
            
            public static State from(final int n) {
                if (n == 0) {
                    return State.VISIBLE;
                }
                if (n == 4) {
                    return State.INVISIBLE;
                }
                if (n == 8) {
                    return State.GONE;
                }
                throw new IllegalArgumentException(n.k("Unknown visibility ", n));
            }
            
            public static State from(final View view) {
                if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
                    return State.INVISIBLE;
                }
                return from(view.getVisibility());
            }
            
            public void applyState(final View view) {
                final int n = SpecialEffectsController$c.a[this.ordinal()];
                if (n != 1) {
                    if (n != 2) {
                        if (n != 3) {
                            if (n == 4) {
                                if (d0.M(2)) {
                                    final StringBuilder sb = new StringBuilder();
                                    sb.append("SpecialEffectsController: Setting view ");
                                    sb.append(view);
                                    sb.append(" to INVISIBLE");
                                    Log.v("FragmentManager", sb.toString());
                                }
                                view.setVisibility(4);
                            }
                        }
                        else {
                            if (d0.M(2)) {
                                final StringBuilder sb2 = new StringBuilder();
                                sb2.append("SpecialEffectsController: Setting view ");
                                sb2.append(view);
                                sb2.append(" to GONE");
                                Log.v("FragmentManager", sb2.toString());
                            }
                            view.setVisibility(8);
                        }
                    }
                    else {
                        if (d0.M(2)) {
                            final StringBuilder sb3 = new StringBuilder();
                            sb3.append("SpecialEffectsController: Setting view ");
                            sb3.append(view);
                            sb3.append(" to VISIBLE");
                            Log.v("FragmentManager", sb3.toString());
                        }
                        view.setVisibility(0);
                    }
                }
                else {
                    final ViewGroup viewGroup = (ViewGroup)view.getParent();
                    if (viewGroup != null) {
                        if (d0.M(2)) {
                            final StringBuilder sb4 = new StringBuilder();
                            sb4.append("SpecialEffectsController: Removing view ");
                            sb4.append(view);
                            sb4.append(" from container ");
                            sb4.append(viewGroup);
                            Log.v("FragmentManager", sb4.toString());
                        }
                        viewGroup.removeView(view);
                    }
                }
            }
        }
    }
    
    public static final class d extends Operation
    {
        public final l0 h;
        
        public d(final State state, final LifecycleImpact lifecycleImpact, final l0 h, final v3.d d) {
            super(state, lifecycleImpact, h.c, d);
            this.h = h;
        }
        
        @Override
        public final void b() {
            super.b();
            this.h.k();
        }
        
        @Override
        public final void d() {
            final LifecycleImpact b = super.b;
            if (b == LifecycleImpact.ADDING) {
                final Fragment c = this.h.c;
                final View focus = c.mView.findFocus();
                if (focus != null) {
                    c.setFocusedView(focus);
                    if (d0.M(2)) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("requestFocus: Saved focused view ");
                        sb.append(focus);
                        sb.append(" for Fragment ");
                        sb.append(c);
                        Log.v("FragmentManager", sb.toString());
                    }
                }
                final View requireView = super.c.requireView();
                if (requireView.getParent() == null) {
                    this.h.b();
                    requireView.setAlpha(0.0f);
                }
                if (requireView.getAlpha() == 0.0f && requireView.getVisibility() == 0) {
                    requireView.setVisibility(4);
                }
                requireView.setAlpha(c.getPostOnViewCreatedAlpha());
            }
            else if (b == LifecycleImpact.REMOVING) {
                final Fragment c2 = this.h.c;
                final View requireView2 = c2.requireView();
                if (d0.M(2)) {
                    final StringBuilder k = a.k("Clearing focus ");
                    k.append(requireView2.findFocus());
                    k.append(" on view ");
                    k.append(requireView2);
                    k.append(" for Fragment ");
                    k.append(c2);
                    Log.v("FragmentManager", k.toString());
                }
                requireView2.clearFocus();
            }
        }
    }
}
