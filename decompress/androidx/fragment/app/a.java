// 
// Decompiled by Procyon v0.6.0
// 

package androidx.fragment.app;

import java.io.Writer;
import java.io.PrintWriter;
import androidx.lifecycle.Lifecycle;
import java.lang.reflect.Modifier;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import android.util.Log;
import java.util.ArrayList;

public final class a extends n0 implements o
{
    public final d0 q;
    public boolean r;
    public int s;
    
    public a(final d0 q) {
        q.I();
        final x<?> v = q.v;
        if (v != null) {
            v.g.getClassLoader();
        }
        this.s = -1;
        this.q = q;
    }
    
    @Override
    public final boolean a(final ArrayList<a> list, final ArrayList<Boolean> list2) {
        if (d0.M(2)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Run: ");
            sb.append(this);
            Log.v("FragmentManager", sb.toString());
        }
        list.add(this);
        list2.add(Boolean.FALSE);
        if (super.g) {
            final d0 q = this.q;
            if (q.d == null) {
                q.d = new ArrayList<a>();
            }
            q.d.add(this);
        }
        return true;
    }
    
    @Override
    public final void e(final int n, final Fragment fragment, final String mTag, final int n2) {
        final String mPreviousWho = fragment.mPreviousWho;
        if (mPreviousWho != null) {
            FragmentStrictMode.d(fragment, mPreviousWho);
        }
        final Class<? extends Fragment> class1 = fragment.getClass();
        final int modifiers = class1.getModifiers();
        if (!class1.isAnonymousClass() && Modifier.isPublic(modifiers) && (!class1.isMemberClass() || Modifier.isStatic(modifiers))) {
            if (mTag != null) {
                final String mTag2 = fragment.mTag;
                if (mTag2 != null && !mTag.equals(mTag2)) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Can't change tag of fragment ");
                    sb.append(fragment);
                    sb.append(": was ");
                    throw new IllegalStateException(a.i(sb, fragment.mTag, " now ", mTag));
                }
                fragment.mTag = mTag;
            }
            if (n != 0) {
                if (n == -1) {
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("Can't add fragment ");
                    sb2.append(fragment);
                    sb2.append(" with tag ");
                    sb2.append(mTag);
                    sb2.append(" to container view with no id");
                    throw new IllegalArgumentException(sb2.toString());
                }
                final int mFragmentId = fragment.mFragmentId;
                if (mFragmentId != 0 && mFragmentId != n) {
                    final StringBuilder sb3 = new StringBuilder();
                    sb3.append("Can't change container ID of fragment ");
                    sb3.append(fragment);
                    sb3.append(": was ");
                    sb3.append(fragment.mFragmentId);
                    sb3.append(" now ");
                    sb3.append(n);
                    throw new IllegalStateException(sb3.toString());
                }
                fragment.mFragmentId = n;
                fragment.mContainerId = n;
            }
            this.b(new n0.a(fragment, n2));
            fragment.mFragmentManager = this.q;
            return;
        }
        final StringBuilder k = a.k("Fragment ");
        k.append(class1.getCanonicalName());
        k.append(" must be a public static class to be  properly recreated from instance state.");
        throw new IllegalStateException(k.toString());
    }
    
    @Override
    public final a h(final Fragment fragment, final Lifecycle.State state) {
        if (fragment.mFragmentManager != this.q) {
            final StringBuilder k = a.k("Cannot setMaxLifecycle for Fragment not attached to FragmentManager ");
            k.append(this.q);
            throw new IllegalArgumentException(k.toString());
        }
        if (state == Lifecycle.State.INITIALIZED && fragment.mState > -1) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Cannot set maximum Lifecycle to ");
            sb.append(state);
            sb.append(" after the Fragment has been created");
            throw new IllegalArgumentException(sb.toString());
        }
        if (state != Lifecycle.State.DESTROYED) {
            this.b(new n0.a(fragment, state));
            return this;
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("Cannot set maximum Lifecycle to ");
        sb2.append(state);
        sb2.append(". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
        throw new IllegalArgumentException(sb2.toString());
    }
    
    public final void i(final int n) {
        if (!super.g) {
            return;
        }
        if (d0.M(2)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Bump nesting in ");
            sb.append(this);
            sb.append(" by ");
            sb.append(n);
            Log.v("FragmentManager", sb.toString());
        }
        for (int size = super.a.size(), i = 0; i < size; ++i) {
            final n0.a a = super.a.get(i);
            final Fragment b = a.b;
            if (b != null) {
                b.mBackStackNesting += n;
                if (d0.M(2)) {
                    final StringBuilder k = a.k("Bump nesting of ");
                    k.append(a.b);
                    k.append(" to ");
                    k.append(a.b.mBackStackNesting);
                    Log.v("FragmentManager", k.toString());
                }
            }
        }
    }
    
    public final int j() {
        return this.l(false);
    }
    
    public final int k() {
        return this.l(true);
    }
    
    public final int l(final boolean b) {
        if (!this.r) {
            if (d0.M(2)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Commit: ");
                sb.append(this);
                Log.v("FragmentManager", sb.toString());
                final PrintWriter printWriter = new PrintWriter(new w0());
                this.n("  ", printWriter, true);
                printWriter.close();
            }
            this.r = true;
            if (super.g) {
                this.s = this.q.i.getAndIncrement();
            }
            else {
                this.s = -1;
            }
            this.q.x((d0.o)this, b);
            return this.s;
        }
        throw new IllegalStateException("commit already called");
    }
    
    public final void m() {
        if (!super.g) {
            super.h = false;
            this.q.A((d0.o)this, false);
            return;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }
    
    public final void n(final String s, final PrintWriter printWriter, final boolean b) {
        if (b) {
            printWriter.print(s);
            printWriter.print("mName=");
            printWriter.print(super.i);
            printWriter.print(" mIndex=");
            printWriter.print(this.s);
            printWriter.print(" mCommitted=");
            printWriter.println(this.r);
            if (super.f != 0) {
                printWriter.print(s);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(super.f));
            }
            if (super.b != 0 || super.c != 0) {
                printWriter.print(s);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(super.b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(super.c));
            }
            if (super.d != 0 || super.e != 0) {
                printWriter.print(s);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(super.d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(super.e));
            }
            if (super.j != 0 || super.k != null) {
                printWriter.print(s);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(super.j));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(super.k);
            }
            if (super.l != 0 || super.m != null) {
                printWriter.print(s);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(super.l));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(super.m);
            }
        }
        if (!super.a.isEmpty()) {
            printWriter.print(s);
            printWriter.println("Operations:");
            for (int size = super.a.size(), i = 0; i < size; ++i) {
                final n0.a a = super.a.get(i);
                String string = null;
                switch (a.a) {
                    default: {
                        final StringBuilder k = a.k("cmd=");
                        k.append(a.a);
                        string = k.toString();
                        break;
                    }
                    case 10: {
                        string = "OP_SET_MAX_LIFECYCLE";
                        break;
                    }
                    case 9: {
                        string = "UNSET_PRIMARY_NAV";
                        break;
                    }
                    case 8: {
                        string = "SET_PRIMARY_NAV";
                        break;
                    }
                    case 7: {
                        string = "ATTACH";
                        break;
                    }
                    case 6: {
                        string = "DETACH";
                        break;
                    }
                    case 5: {
                        string = "SHOW";
                        break;
                    }
                    case 4: {
                        string = "HIDE";
                        break;
                    }
                    case 3: {
                        string = "REMOVE";
                        break;
                    }
                    case 2: {
                        string = "REPLACE";
                        break;
                    }
                    case 1: {
                        string = "ADD";
                        break;
                    }
                    case 0: {
                        string = "NULL";
                        break;
                    }
                }
                printWriter.print(s);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(string);
                printWriter.print(" ");
                printWriter.println(a.b);
                if (b) {
                    if (a.d != 0 || a.e != 0) {
                        printWriter.print(s);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(a.d));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(a.e));
                    }
                    if (a.f != 0 || a.g != 0) {
                        printWriter.print(s);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(a.f));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(a.g));
                    }
                }
            }
        }
    }
    
    public final a o(final Fragment fragment) {
        final d0 mFragmentManager = fragment.mFragmentManager;
        if (mFragmentManager != null && mFragmentManager != this.q) {
            final StringBuilder k = a.k("Cannot remove Fragment attached to a different FragmentManager. Fragment ");
            k.append(fragment.toString());
            k.append(" is already attached to a FragmentManager.");
            throw new IllegalStateException(k.toString());
        }
        this.b(new n0.a(fragment, 3));
        return this;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.s >= 0) {
            sb.append(" #");
            sb.append(this.s);
        }
        if (super.i != null) {
            sb.append(" ");
            sb.append(super.i);
        }
        sb.append("}");
        return sb.toString();
    }
}
