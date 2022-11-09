// 
// Decompiled by Procyon v0.6.0
// 

package androidx.fragment.app;

import android.os.BaseBundle;
import android.util.SparseArray;
import android.view.ViewParent;
import android.content.Context;
import android.app.Activity;
import androidx.lifecycle.q0;
import android.view.LayoutInflater;
import java.util.WeakHashMap;
import android.view.View$OnAttachStateChangeListener;
import a4.p0;
import androidx.fragment.app.strictmode.Violation;
import androidx.fragment.app.strictmode.WrongFragmentContainerViolation;
import ah2.f;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import android.content.res.Resources$NotFoundException;
import java.util.Iterator;
import a2.b;
import java.util.HashMap;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import android.util.Log;
import androidx.lifecycle.Lifecycle;
import android.os.Bundle;

public final class l0
{
    public final z a;
    public final m0 b;
    public final Fragment c;
    public boolean d;
    public int e;
    
    public l0(final z a, final m0 b, final Fragment c) {
        this.d = false;
        this.e = -1;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public l0(final z a, final m0 b, final Fragment c, final k0 k0) {
        this.d = false;
        this.e = -1;
        this.a = a;
        this.b = b;
        this.c = c;
        c.mSavedViewState = null;
        c.mSavedViewRegistryState = null;
        c.mBackStackNesting = 0;
        c.mInLayout = false;
        c.mAdded = false;
        final Fragment mTarget = c.mTarget;
        String mWho;
        if (mTarget != null) {
            mWho = mTarget.mWho;
        }
        else {
            mWho = null;
        }
        c.mTargetWho = mWho;
        c.mTarget = null;
        final Bundle r = k0.r;
        if (r != null) {
            c.mSavedFragmentState = r;
        }
        else {
            c.mSavedFragmentState = new Bundle();
        }
    }
    
    public l0(final z a, final m0 b, final ClassLoader classLoader, final w w, final k0 k0) {
        this.d = false;
        this.e = -1;
        this.a = a;
        this.b = b;
        final Fragment instantiate = Fragment.instantiate(((d0.d0$d)w).b.v.g, k0.f, (Bundle)null);
        final Bundle o = k0.o;
        if (o != null) {
            o.setClassLoader(classLoader);
        }
        instantiate.setArguments(k0.o);
        instantiate.mWho = k0.g;
        instantiate.mFromLayout = k0.h;
        instantiate.mRestored = true;
        instantiate.mFragmentId = k0.i;
        instantiate.mContainerId = k0.j;
        instantiate.mTag = k0.k;
        instantiate.mRetainInstance = k0.l;
        instantiate.mRemoving = k0.m;
        instantiate.mDetached = k0.n;
        instantiate.mHidden = k0.p;
        instantiate.mMaxState = Lifecycle.State.values()[k0.q];
        final Bundle r = k0.r;
        if (r != null) {
            instantiate.mSavedFragmentState = r;
        }
        else {
            instantiate.mSavedFragmentState = new Bundle();
        }
        this.c = instantiate;
        if (d0.M(2)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Instantiated fragment ");
            sb.append(instantiate);
            Log.v("FragmentManager", sb.toString());
        }
    }
    
    public final void a() {
        if (d0.M(3)) {
            final StringBuilder k = a.k("moveto ACTIVITY_CREATED: ");
            k.append(this.c);
            Log.d("FragmentManager", k.toString());
        }
        final Fragment c = this.c;
        c.performActivityCreated(c.mSavedFragmentState);
        final z a = this.a;
        final Fragment c2 = this.c;
        a.a(c2, c2.mSavedFragmentState, false);
    }
    
    public final void b() {
        final m0 b = this.b;
        final Fragment c = this.c;
        b.getClass();
        final ViewGroup mContainer = c.mContainer;
        final int n = -1;
        int indexOfChild = 0;
        Label_0186: {
            if (mContainer == null) {
                indexOfChild = n;
            }
            else {
                final int index = ((ArrayList)b.a).indexOf(c);
                int n2 = index - 1;
                int n3;
                while (true) {
                    n3 = index;
                    if (n2 < 0) {
                        break;
                    }
                    final Fragment fragment = ((ArrayList)b.a).get(n2);
                    if (fragment.mContainer == mContainer) {
                        final View mView = fragment.mView;
                        if (mView != null) {
                            indexOfChild = mContainer.indexOfChild(mView) + 1;
                            break Label_0186;
                        }
                    }
                    --n2;
                }
                while (true) {
                    final int n4 = n3 + 1;
                    indexOfChild = n;
                    if (n4 >= ((ArrayList)b.a).size()) {
                        break;
                    }
                    final Fragment fragment2 = ((ArrayList)b.a).get(n4);
                    n3 = n4;
                    if (fragment2.mContainer != mContainer) {
                        continue;
                    }
                    final View mView2 = fragment2.mView;
                    n3 = n4;
                    if (mView2 != null) {
                        indexOfChild = mContainer.indexOfChild(mView2);
                        break;
                    }
                }
            }
        }
        final Fragment c2 = this.c;
        c2.mContainer.addView(c2.mView, indexOfChild);
    }
    
    public final void c() {
        if (d0.M(3)) {
            final StringBuilder k = a.k("moveto ATTACHED: ");
            k.append(this.c);
            Log.d("FragmentManager", k.toString());
        }
        final Fragment c = this.c;
        final Fragment mTarget = c.mTarget;
        l0 l0 = null;
        if (mTarget != null) {
            l0 = ((HashMap)this.b.b).get(mTarget.mWho);
            if (l0 == null) {
                final StringBuilder i = a.k("Fragment ");
                i.append(this.c);
                i.append(" declared target fragment ");
                i.append(this.c.mTarget);
                i.append(" that does not belong to this FragmentManager!");
                throw new IllegalStateException(i.toString());
            }
            final Fragment c2 = this.c;
            c2.mTargetWho = c2.mTarget.mWho;
            c2.mTarget = null;
        }
        else {
            final String mTargetWho = c.mTargetWho;
            if (mTargetWho != null) {
                l0 = (l0)((HashMap)this.b.b).get(mTargetWho);
                if (l0 == null) {
                    final StringBuilder j = a.k("Fragment ");
                    j.append(this.c);
                    j.append(" declared target fragment ");
                    throw new IllegalStateException(a2.b.j(j, this.c.mTargetWho, " that does not belong to this FragmentManager!"));
                }
            }
        }
        if (l0 != null) {
            l0.k();
        }
        final Fragment c3 = this.c;
        final d0 mFragmentManager = c3.mFragmentManager;
        c3.mHost = mFragmentManager.v;
        c3.mParentFragment = mFragmentManager.x;
        this.a.g(c3, false);
        this.c.performAttach();
        this.a.b(this.c, false);
    }
    
    public final int d() {
        final Fragment c = this.c;
        if (c.mFragmentManager == null) {
            return c.mState;
        }
        final int e = this.e;
        final int n = l0$b.a[c.mMaxState.ordinal()];
        int n2 = e;
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    if (n != 4) {
                        n2 = Math.min(e, -1);
                    }
                    else {
                        n2 = Math.min(e, 0);
                    }
                }
                else {
                    n2 = Math.min(e, 1);
                }
            }
            else {
                n2 = Math.min(e, 5);
            }
        }
        final Fragment c2 = this.c;
        int n3 = n2;
        if (c2.mFromLayout) {
            if (c2.mInLayout) {
                final int max = Math.max(this.e, 2);
                final View mView = this.c.mView;
                n3 = max;
                if (mView != null) {
                    n3 = max;
                    if (mView.getParent() == null) {
                        n3 = Math.min(max, 2);
                    }
                }
            }
            else if (this.e < 4) {
                n3 = Math.min(n2, c2.mState);
            }
            else {
                n3 = Math.min(n2, 1);
            }
        }
        int min = n3;
        if (!this.c.mAdded) {
            min = Math.min(n3, 1);
        }
        final Fragment c3 = this.c;
        final ViewGroup mContainer = c3.mContainer;
        SpecialEffectsController.Operation.LifecycleImpact lifecycleImpact = null;
        final SpecialEffectsController.Operation operation = null;
        if (mContainer != null) {
            final SpecialEffectsController f = SpecialEffectsController.f(mContainer, c3.getParentFragmentManager());
            f.getClass();
            final SpecialEffectsController.Operation d = f.d(this.c);
            if (d != null) {
                lifecycleImpact = d.b;
            }
            else {
                lifecycleImpact = null;
            }
            final Fragment c4 = this.c;
            final Iterator<SpecialEffectsController.Operation> iterator = f.c.iterator();
            SpecialEffectsController.Operation operation2;
            do {
                operation2 = operation;
                if (!iterator.hasNext()) {
                    break;
                }
                operation2 = iterator.next();
            } while (!operation2.c.equals((Object)c4) || operation2.f);
            if (operation2 != null && (lifecycleImpact == null || lifecycleImpact == SpecialEffectsController.Operation.LifecycleImpact.NONE)) {
                lifecycleImpact = operation2.b;
            }
        }
        int n4;
        if (lifecycleImpact == SpecialEffectsController.Operation.LifecycleImpact.ADDING) {
            n4 = Math.min(min, 6);
        }
        else if (lifecycleImpact == SpecialEffectsController.Operation.LifecycleImpact.REMOVING) {
            n4 = Math.max(min, 3);
        }
        else {
            final Fragment c5 = this.c;
            n4 = min;
            if (c5.mRemoving) {
                if (c5.isInBackStack()) {
                    n4 = Math.min(min, 1);
                }
                else {
                    n4 = Math.min(min, -1);
                }
            }
        }
        final Fragment c6 = this.c;
        int min2 = n4;
        if (c6.mDeferStart) {
            min2 = n4;
            if (c6.mState < 5) {
                min2 = Math.min(n4, 4);
            }
        }
        if (d0.M(2)) {
            final StringBuilder p = d.p("computeExpectedState() of ", min2, " for ");
            p.append(this.c);
            Log.v("FragmentManager", p.toString());
        }
        return min2;
    }
    
    public final void e() {
        if (d0.M(3)) {
            final StringBuilder k = a.k("moveto CREATED: ");
            k.append(this.c);
            Log.d("FragmentManager", k.toString());
        }
        final Fragment c = this.c;
        if (!c.mIsCreated) {
            this.a.h(c, c.mSavedFragmentState, false);
            final Fragment c2 = this.c;
            c2.performCreate(c2.mSavedFragmentState);
            final z a = this.a;
            final Fragment c3 = this.c;
            a.c(c3, c3.mSavedFragmentState, false);
        }
        else {
            c.restoreChildFragmentState(c.mSavedFragmentState);
            this.c.mState = 1;
        }
    }
    
    public final void f() {
        if (this.c.mFromLayout) {
            return;
        }
        if (d0.M(3)) {
            final StringBuilder k = a.k("moveto CREATE_VIEW: ");
            k.append(this.c);
            Log.d("FragmentManager", k.toString());
        }
        final Fragment c = this.c;
        final LayoutInflater performGetLayoutInflater = c.performGetLayoutInflater(c.mSavedFragmentState);
        final ViewGroup viewGroup = null;
        final Fragment c2 = this.c;
        ViewGroup mContainer = c2.mContainer;
        if (mContainer == null) {
            final int mContainerId = c2.mContainerId;
            mContainer = viewGroup;
            if (mContainerId != 0) {
                if (mContainerId == -1) {
                    final StringBuilder i = a.k("Cannot create fragment ");
                    i.append(this.c);
                    i.append(" for a container view with no id");
                    throw new IllegalArgumentException(i.toString());
                }
                final ViewGroup viewGroup2 = (ViewGroup)c2.mFragmentManager.w.b(mContainerId);
                if (viewGroup2 == null) {
                    final Fragment c3 = this.c;
                    if (!c3.mRestored) {
                        String resourceName;
                        try {
                            resourceName = c3.getResources().getResourceName(this.c.mContainerId);
                        }
                        catch (final Resources$NotFoundException ex) {
                            resourceName = "unknown";
                        }
                        final StringBuilder j = a.k("No view found for id 0x");
                        j.append(Integer.toHexString(this.c.mContainerId));
                        j.append(" (");
                        j.append(resourceName);
                        j.append(") for fragment ");
                        j.append(this.c);
                        throw new IllegalArgumentException(j.toString());
                    }
                    mContainer = viewGroup2;
                }
                else {
                    mContainer = viewGroup2;
                    if (!(viewGroup2 instanceof u)) {
                        final Fragment c4 = this.c;
                        final FragmentStrictMode.b a = FragmentStrictMode.a;
                        f.f((Object)c4, "fragment");
                        final WrongFragmentContainerViolation wrongFragmentContainerViolation = new WrongFragmentContainerViolation(c4, viewGroup2);
                        FragmentStrictMode.c(wrongFragmentContainerViolation);
                        final FragmentStrictMode.b a2 = FragmentStrictMode.a(c4);
                        mContainer = viewGroup2;
                        if (a2.a.contains(FragmentStrictMode.Flag.DETECT_WRONG_FRAGMENT_CONTAINER)) {
                            mContainer = viewGroup2;
                            if (FragmentStrictMode.f(a2, c4.getClass(), WrongFragmentContainerViolation.class)) {
                                FragmentStrictMode.b(a2, wrongFragmentContainerViolation);
                                mContainer = viewGroup2;
                            }
                        }
                    }
                }
            }
        }
        final Fragment c5 = this.c;
        c5.performCreateView(performGetLayoutInflater, c5.mContainer = mContainer, c5.mSavedFragmentState);
        final View mView = this.c.mView;
        if (mView != null) {
            mView.setSaveFromParentEnabled(false);
            final Fragment c6 = this.c;
            c6.mView.setTag(2131429157, (Object)c6);
            if (mContainer != null) {
                this.b();
            }
            final Fragment c7 = this.c;
            if (c7.mHidden) {
                c7.mView.setVisibility(8);
            }
            final View mView2 = this.c.mView;
            final WeakHashMap a3 = p0.a;
            if (p0.g.b(mView2)) {
                p0.h.c(this.c.mView);
            }
            else {
                final View mView3 = this.c.mView;
                mView3.addOnAttachStateChangeListener((View$OnAttachStateChangeListener)new View$OnAttachStateChangeListener() {
                    public final void onViewAttachedToWindow(final View view) {
                        mView3.removeOnAttachStateChangeListener((View$OnAttachStateChangeListener)this);
                        final View f = mView3;
                        final WeakHashMap a = p0.a;
                        p0.h.c(f);
                    }
                    
                    public final void onViewDetachedFromWindow(final View view) {
                    }
                });
            }
            this.c.performViewCreated();
            final z a4 = this.a;
            final Fragment c8 = this.c;
            a4.m(c8, c8.mView, c8.mSavedFragmentState, false);
            final int visibility = this.c.mView.getVisibility();
            this.c.setPostOnViewCreatedAlpha(this.c.mView.getAlpha());
            final Fragment c9 = this.c;
            if (c9.mContainer != null && visibility == 0) {
                final View focus = c9.mView.findFocus();
                if (focus != null) {
                    this.c.setFocusedView(focus);
                    if (d0.M(2)) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("requestFocus: Saved focused view ");
                        sb.append(focus);
                        sb.append(" for Fragment ");
                        sb.append(this.c);
                        Log.v("FragmentManager", sb.toString());
                    }
                }
                this.c.mView.setAlpha(0.0f);
            }
        }
        this.c.mState = 2;
    }
    
    public final void g() {
        if (d0.M(3)) {
            final StringBuilder k = a.k("movefrom CREATED: ");
            k.append(this.c);
            Log.d("FragmentManager", k.toString());
        }
        final Fragment c = this.c;
        final boolean mRemoving = c.mRemoving;
        final int n = 1;
        final boolean b = mRemoving && !c.isInBackStack();
        if (b) {
            final Fragment c2 = this.c;
            if (!c2.mBeingSaved) {
                this.b.j(c2.mWho, null);
            }
        }
        boolean b2 = false;
        Label_0170: {
            if (!b) {
                final g0 g0 = (g0)this.b.d;
                boolean h = false;
                Label_0154: {
                    if (g0.d.containsKey(this.c.mWho)) {
                        if (g0.g) {
                            h = g0.h;
                            break Label_0154;
                        }
                    }
                    h = true;
                }
                if (!h) {
                    b2 = false;
                    break Label_0170;
                }
            }
            b2 = true;
        }
        if (b2) {
            final x mHost = this.c.mHost;
            int h2;
            if (mHost instanceof q0) {
                h2 = (((g0)this.b.d).h ? 1 : 0);
            }
            else {
                final Context g2 = mHost.g;
                h2 = n;
                if (g2 instanceof Activity) {
                    h2 = ((true ^ ((Activity)g2).isChangingConfigurations()) ? 1 : 0);
                }
            }
            if ((b && !this.c.mBeingSaved) || h2 != 0) {
                ((g0)this.b.d).d(this.c);
            }
            this.c.performDestroy();
            this.a.d(this.c, false);
            for (final l0 l0 : this.b.e()) {
                if (l0 != null) {
                    final Fragment c3 = l0.c;
                    if (!this.c.mWho.equals(c3.mTargetWho)) {
                        continue;
                    }
                    c3.mTarget = this.c;
                    c3.mTargetWho = null;
                }
            }
            final Fragment c4 = this.c;
            final String mTargetWho = c4.mTargetWho;
            if (mTargetWho != null) {
                c4.mTarget = this.b.c(mTargetWho);
            }
            this.b.i(this);
        }
        else {
            final String mTargetWho2 = this.c.mTargetWho;
            if (mTargetWho2 != null) {
                final Fragment c5 = this.b.c(mTargetWho2);
                if (c5 != null && c5.mRetainInstance) {
                    this.c.mTarget = c5;
                }
            }
            this.c.mState = 0;
        }
    }
    
    public final void h() {
        if (d0.M(3)) {
            final StringBuilder k = a.k("movefrom CREATE_VIEW: ");
            k.append(this.c);
            Log.d("FragmentManager", k.toString());
        }
        final Fragment c = this.c;
        final ViewGroup mContainer = c.mContainer;
        if (mContainer != null) {
            final View mView = c.mView;
            if (mView != null) {
                mContainer.removeView(mView);
            }
        }
        this.c.performDestroyView();
        this.a.n(this.c, false);
        final Fragment c2 = this.c;
        c2.mContainer = null;
        c2.mView = null;
        c2.mViewLifecycleOwner = null;
        c2.mViewLifecycleOwnerLiveData.k(null);
        this.c.mInLayout = false;
    }
    
    public final void i() {
        if (d0.M(3)) {
            final StringBuilder k = a.k("movefrom ATTACHED: ");
            k.append(this.c);
            Log.d("FragmentManager", k.toString());
        }
        this.c.performDetach();
        final z a = this.a;
        final Fragment c = this.c;
        final boolean b = false;
        a.e(c, false);
        final Fragment c2 = this.c;
        c2.mState = -1;
        c2.mHost = null;
        c2.mParentFragment = null;
        c2.mFragmentManager = null;
        final boolean mRemoving = c2.mRemoving;
        boolean h = true;
        int n = b ? 1 : 0;
        if (mRemoving) {
            n = (b ? 1 : 0);
            if (!c2.isInBackStack()) {
                n = 1;
            }
        }
        if (n == 0) {
            final g0 g0 = (g0)this.b.d;
            if (g0.d.containsKey(this.c.mWho)) {
                if (g0.g) {
                    h = g0.h;
                }
            }
            if (!h) {
                return;
            }
        }
        if (d0.M(3)) {
            final StringBuilder i = a.k("initState called for fragment: ");
            i.append(this.c);
            Log.d("FragmentManager", i.toString());
        }
        this.c.initState();
    }
    
    public final void j() {
        final Fragment c = this.c;
        if (c.mFromLayout && c.mInLayout && !c.mPerformedCreateView) {
            if (d0.M(3)) {
                final StringBuilder k = a.k("moveto CREATE_VIEW: ");
                k.append(this.c);
                Log.d("FragmentManager", k.toString());
            }
            final Fragment c2 = this.c;
            c2.performCreateView(c2.performGetLayoutInflater(c2.mSavedFragmentState), (ViewGroup)null, this.c.mSavedFragmentState);
            final View mView = this.c.mView;
            if (mView != null) {
                mView.setSaveFromParentEnabled(false);
                final Fragment c3 = this.c;
                c3.mView.setTag(2131429157, (Object)c3);
                final Fragment c4 = this.c;
                if (c4.mHidden) {
                    c4.mView.setVisibility(8);
                }
                this.c.performViewCreated();
                final z a = this.a;
                final Fragment c5 = this.c;
                a.m(c5, c5.mView, c5.mSavedFragmentState, false);
                this.c.mState = 2;
            }
        }
    }
    
    public final void k() {
        if (this.d) {
            if (d0.M(2)) {
                final StringBuilder k = a.k("Ignoring re-entrant call to moveToExpectedState() for ");
                k.append(this.c);
                Log.v("FragmentManager", k.toString());
            }
            return;
        }
        try {
            this.d = true;
            boolean b = false;
            Fragment c;
            int mState;
            while (true) {
                final int d = this.d();
                c = this.c;
                mState = c.mState;
                if (d == mState) {
                    break;
                }
                if (d > mState) {
                    switch (mState + 1) {
                        case 7: {
                            this.n();
                            break;
                        }
                        case 6: {
                            c.mState = 6;
                            break;
                        }
                        case 5: {
                            this.q();
                            break;
                        }
                        case 4: {
                            if (c.mView != null) {
                                final ViewGroup mContainer = c.mContainer;
                                if (mContainer != null) {
                                    final SpecialEffectsController f = SpecialEffectsController.f(mContainer, c.getParentFragmentManager());
                                    final SpecialEffectsController.Operation.State from = SpecialEffectsController.Operation.State.from(this.c.mView.getVisibility());
                                    f.getClass();
                                    if (d0.M(2)) {
                                        final StringBuilder sb = new StringBuilder();
                                        sb.append("SpecialEffectsController: Enqueuing add operation for fragment ");
                                        sb.append(this.c);
                                        Log.v("FragmentManager", sb.toString());
                                    }
                                    f.a(from, SpecialEffectsController.Operation.LifecycleImpact.ADDING, this);
                                }
                            }
                            this.c.mState = 4;
                            break;
                        }
                        case 3: {
                            this.a();
                            break;
                        }
                        case 2: {
                            this.j();
                            this.f();
                            break;
                        }
                        case 1: {
                            this.e();
                            break;
                        }
                        case 0: {
                            this.c();
                            break;
                        }
                    }
                }
                else {
                    switch (mState - 1) {
                        case 6: {
                            this.l();
                            break;
                        }
                        case 5: {
                            c.mState = 5;
                            break;
                        }
                        case 4: {
                            this.r();
                            break;
                        }
                        case 3: {
                            if (d0.M(3)) {
                                final StringBuilder sb2 = new StringBuilder();
                                sb2.append("movefrom ACTIVITY_CREATED: ");
                                sb2.append(this.c);
                                Log.d("FragmentManager", sb2.toString());
                            }
                            final Fragment c2 = this.c;
                            if (c2.mBeingSaved) {
                                this.o();
                            }
                            else if (c2.mView != null && c2.mSavedViewState == null) {
                                this.p();
                            }
                            final Fragment c3 = this.c;
                            if (c3.mView != null) {
                                final ViewGroup mContainer2 = c3.mContainer;
                                if (mContainer2 != null) {
                                    final SpecialEffectsController f2 = SpecialEffectsController.f(mContainer2, c3.getParentFragmentManager());
                                    f2.getClass();
                                    if (d0.M(2)) {
                                        final StringBuilder sb3 = new StringBuilder();
                                        sb3.append("SpecialEffectsController: Enqueuing remove operation for fragment ");
                                        sb3.append(this.c);
                                        Log.v("FragmentManager", sb3.toString());
                                    }
                                    f2.a(SpecialEffectsController.Operation.State.REMOVED, SpecialEffectsController.Operation.LifecycleImpact.REMOVING, this);
                                }
                            }
                            this.c.mState = 3;
                            break;
                        }
                        case 2: {
                            c.mInLayout = false;
                            c.mState = 2;
                            break;
                        }
                        case 1: {
                            this.h();
                            this.c.mState = 1;
                            break;
                        }
                        case 0: {
                            if (c.mBeingSaved && ((HashMap)this.b.c).get(c.mWho) == null) {
                                this.o();
                            }
                            this.g();
                            break;
                        }
                        case -1: {
                            this.i();
                            break;
                        }
                    }
                }
                b = true;
            }
            if (!b && mState == -1 && c.mRemoving && !c.isInBackStack() && !this.c.mBeingSaved) {
                if (d0.M(3)) {
                    final StringBuilder sb4 = new StringBuilder();
                    sb4.append("Cleaning up state of never attached fragment: ");
                    sb4.append(this.c);
                    Log.d("FragmentManager", sb4.toString());
                }
                ((g0)this.b.d).d(this.c);
                this.b.i(this);
                if (d0.M(3)) {
                    final StringBuilder sb5 = new StringBuilder();
                    sb5.append("initState called for fragment: ");
                    sb5.append(this.c);
                    Log.d("FragmentManager", sb5.toString());
                }
                this.c.initState();
            }
            final Fragment c4 = this.c;
            if (c4.mHiddenChanged) {
                if (c4.mView != null) {
                    final ViewGroup mContainer3 = c4.mContainer;
                    if (mContainer3 != null) {
                        final SpecialEffectsController f3 = SpecialEffectsController.f(mContainer3, c4.getParentFragmentManager());
                        if (this.c.mHidden) {
                            f3.getClass();
                            if (d0.M(2)) {
                                final StringBuilder sb6 = new StringBuilder();
                                sb6.append("SpecialEffectsController: Enqueuing hide operation for fragment ");
                                sb6.append(this.c);
                                Log.v("FragmentManager", sb6.toString());
                            }
                            f3.a(SpecialEffectsController.Operation.State.GONE, SpecialEffectsController.Operation.LifecycleImpact.NONE, this);
                        }
                        else {
                            f3.getClass();
                            if (d0.M(2)) {
                                final StringBuilder sb7 = new StringBuilder();
                                sb7.append("SpecialEffectsController: Enqueuing show operation for fragment ");
                                sb7.append(this.c);
                                Log.v("FragmentManager", sb7.toString());
                            }
                            f3.a(SpecialEffectsController.Operation.State.VISIBLE, SpecialEffectsController.Operation.LifecycleImpact.NONE, this);
                        }
                    }
                }
                final Fragment c5 = this.c;
                final d0 mFragmentManager = c5.mFragmentManager;
                if (mFragmentManager != null && c5.mAdded && d0.N(c5)) {
                    mFragmentManager.F = true;
                }
                final Fragment c6 = this.c;
                c6.mHiddenChanged = false;
                c6.onHiddenChanged(c6.mHidden);
                this.c.mChildFragmentManager.o();
            }
        }
        finally {
            this.d = false;
        }
    }
    
    public final void l() {
        if (d0.M(3)) {
            final StringBuilder k = a.k("movefrom RESUMED: ");
            k.append(this.c);
            Log.d("FragmentManager", k.toString());
        }
        this.c.performPause();
        this.a.f(this.c, false);
    }
    
    public final void m(final ClassLoader classLoader) {
        final Bundle mSavedFragmentState = this.c.mSavedFragmentState;
        if (mSavedFragmentState == null) {
            return;
        }
        mSavedFragmentState.setClassLoader(classLoader);
        final Fragment c = this.c;
        c.mSavedViewState = c.mSavedFragmentState.getSparseParcelableArray("android:view_state");
        final Fragment c2 = this.c;
        c2.mSavedViewRegistryState = c2.mSavedFragmentState.getBundle("android:view_registry_state");
        final Fragment c3 = this.c;
        c3.mTargetWho = ((BaseBundle)c3.mSavedFragmentState).getString("android:target_state");
        final Fragment c4 = this.c;
        if (c4.mTargetWho != null) {
            c4.mTargetRequestCode = ((BaseBundle)c4.mSavedFragmentState).getInt("android:target_req_state", 0);
        }
        final Fragment c5 = this.c;
        final Boolean mSavedUserVisibleHint = c5.mSavedUserVisibleHint;
        if (mSavedUserVisibleHint != null) {
            c5.mUserVisibleHint = mSavedUserVisibleHint;
            this.c.mSavedUserVisibleHint = null;
        }
        else {
            c5.mUserVisibleHint = ((BaseBundle)c5.mSavedFragmentState).getBoolean("android:user_visible_hint", true);
        }
        final Fragment c6 = this.c;
        if (!c6.mUserVisibleHint) {
            c6.mDeferStart = true;
        }
    }
    
    public final void n() {
        if (d0.M(3)) {
            final StringBuilder k = a.k("moveto RESUMED: ");
            k.append(this.c);
            Log.d("FragmentManager", k.toString());
        }
        final View focusedView = this.c.getFocusedView();
        if (focusedView != null) {
            final View mView = this.c.mView;
            boolean b = true;
            Label_0098: {
                if (focusedView != mView) {
                    for (ViewParent viewParent = focusedView.getParent(); viewParent != null; viewParent = viewParent.getParent()) {
                        if (viewParent == this.c.mView) {
                            break Label_0098;
                        }
                    }
                    b = false;
                }
            }
            if (b) {
                final boolean requestFocus = focusedView.requestFocus();
                if (d0.M(2)) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("requestFocus: Restoring focused view ");
                    sb.append(focusedView);
                    sb.append(" ");
                    String s;
                    if (requestFocus) {
                        s = "succeeded";
                    }
                    else {
                        s = "failed";
                    }
                    sb.append(s);
                    sb.append(" on Fragment ");
                    sb.append(this.c);
                    sb.append(" resulting in focused view ");
                    sb.append(this.c.mView.findFocus());
                    Log.v("FragmentManager", sb.toString());
                }
            }
        }
        this.c.setFocusedView((View)null);
        this.c.performResume();
        this.a.i(this.c, false);
        final Fragment c = this.c;
        c.mSavedFragmentState = null;
        c.mSavedViewState = null;
        c.mSavedViewRegistryState = null;
    }
    
    public final void o() {
        final k0 k0 = new k0(this.c);
        final Fragment c = this.c;
        if (c.mState > -1 && k0.r == null) {
            final Bundle bundle = new Bundle();
            this.c.performSaveInstanceState(bundle);
            this.a.j(this.c, bundle, false);
            Bundle bundle2 = bundle;
            if (((BaseBundle)bundle).isEmpty()) {
                bundle2 = null;
            }
            if (this.c.mView != null) {
                this.p();
            }
            Object o = bundle2;
            if (this.c.mSavedViewState != null) {
                if ((o = bundle2) == null) {
                    o = new Bundle();
                }
                ((Bundle)o).putSparseParcelableArray("android:view_state", this.c.mSavedViewState);
            }
            Bundle bundle3 = (Bundle)o;
            if (this.c.mSavedViewRegistryState != null) {
                if ((bundle3 = (Bundle)o) == null) {
                    bundle3 = new Bundle();
                }
                bundle3.putBundle("android:view_registry_state", this.c.mSavedViewRegistryState);
            }
            Bundle r = bundle3;
            if (!this.c.mUserVisibleHint) {
                if ((r = bundle3) == null) {
                    r = new Bundle();
                }
                ((BaseBundle)r).putBoolean("android:user_visible_hint", this.c.mUserVisibleHint);
            }
            k0.r = r;
            if (this.c.mTargetWho != null) {
                if (r == null) {
                    k0.r = new Bundle();
                }
                ((BaseBundle)k0.r).putString("android:target_state", this.c.mTargetWho);
                final int mTargetRequestCode = this.c.mTargetRequestCode;
                if (mTargetRequestCode != 0) {
                    ((BaseBundle)k0.r).putInt("android:target_req_state", mTargetRequestCode);
                }
            }
        }
        else {
            k0.r = c.mSavedFragmentState;
        }
        this.b.j(this.c.mWho, k0);
    }
    
    public final void p() {
        if (this.c.mView == null) {
            return;
        }
        if (d0.M(2)) {
            final StringBuilder k = a.k("Saving view state for fragment ");
            k.append(this.c);
            k.append(" with view ");
            k.append(this.c.mView);
            Log.v("FragmentManager", k.toString());
        }
        final SparseArray mSavedViewState = new SparseArray();
        this.c.mView.saveHierarchyState(mSavedViewState);
        if (mSavedViewState.size() > 0) {
            this.c.mSavedViewState = mSavedViewState;
        }
        final Bundle mSavedViewRegistryState = new Bundle();
        this.c.mViewLifecycleOwner.j.c(mSavedViewRegistryState);
        if (!((BaseBundle)mSavedViewRegistryState).isEmpty()) {
            this.c.mSavedViewRegistryState = mSavedViewRegistryState;
        }
    }
    
    public final void q() {
        if (d0.M(3)) {
            final StringBuilder k = a.k("moveto STARTED: ");
            k.append(this.c);
            Log.d("FragmentManager", k.toString());
        }
        this.c.performStart();
        this.a.k(this.c, false);
    }
    
    public final void r() {
        if (d0.M(3)) {
            final StringBuilder k = a.k("movefrom STARTED: ");
            k.append(this.c);
            Log.d("FragmentManager", k.toString());
        }
        this.c.performStop();
        this.a.l(this.c, false);
    }
}
