// 
// Decompiled by Procyon v0.6.0
// 

package androidx.fragment.app;

import android.content.res.TypedArray;
import a40.f;
import android.view.View$OnAttachStateChangeListener;
import androidx.fragment.app.strictmode.Violation;
import androidx.fragment.app.strictmode.FragmentTagUsageViolation;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import android.view.ViewGroup;
import android.util.Log;
import android.os.Bundle;
import android.util.AttributeSet;
import android.content.Context;
import android.view.View;
import android.view.LayoutInflater$Factory2;

public final class y implements LayoutInflater$Factory2
{
    public final d0 f;
    
    public y(final d0 f) {
        this.f = f;
    }
    
    public final View onCreateView(View mView, String attributeValue, final Context context, final AttributeSet set) {
        if (u.class.getName().equals(attributeValue)) {
            return (View)new u(context, set, this.f);
        }
        if (!"fragment".equals(attributeValue)) {
            return null;
        }
        attributeValue = set.getAttributeValue((String)null, "class");
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, pj2.u.h);
        int id = 0;
        String string;
        if ((string = attributeValue) == null) {
            string = obtainStyledAttributes.getString(0);
        }
        final int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        final String string2 = obtainStyledAttributes.getString(2);
        obtainStyledAttributes.recycle();
        if (string != null) {
            final ClassLoader classLoader = context.getClassLoader();
            boolean assignable;
            try {
                assignable = Fragment.class.isAssignableFrom(w.a(classLoader, string));
            }
            catch (final ClassNotFoundException ex) {
                assignable = false;
            }
            if (assignable) {
                if (mView != null) {
                    id = mView.getId();
                }
                if (id == -1 && resourceId == -1 && string2 == null) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append(set.getPositionDescription());
                    sb.append(": Must specify unique android:id, android:tag, or have a parent with an id for ");
                    sb.append(string);
                    throw new IllegalArgumentException(sb.toString());
                }
                Fragment d;
                if (resourceId != -1) {
                    d = this.f.D(resourceId);
                }
                else {
                    d = null;
                }
                Fragment e = d;
                if (d == null) {
                    e = d;
                    if (string2 != null) {
                        e = this.f.E(string2);
                    }
                }
                Fragment d2;
                if ((d2 = e) == null) {
                    d2 = e;
                    if (id != -1) {
                        d2 = this.f.D(id);
                    }
                }
                Fragment fragment;
                l0 l0;
                if (d2 == null) {
                    final w i = this.f.I();
                    context.getClassLoader();
                    final Fragment instantiate = Fragment.instantiate(((d0.d0$d)i).b.v.g, string, (Bundle)null);
                    instantiate.mFromLayout = true;
                    int mFragmentId;
                    if (resourceId != 0) {
                        mFragmentId = resourceId;
                    }
                    else {
                        mFragmentId = id;
                    }
                    instantiate.mFragmentId = mFragmentId;
                    instantiate.mContainerId = id;
                    instantiate.mTag = string2;
                    instantiate.mInLayout = true;
                    final d0 f = this.f;
                    instantiate.mFragmentManager = f;
                    final x<?> v = f.v;
                    instantiate.mHost = v;
                    instantiate.onInflate(v.g, set, instantiate.mSavedFragmentState);
                    final l0 a = this.f.a(instantiate);
                    fragment = instantiate;
                    l0 = a;
                    if (d0.M(2)) {
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append("Fragment ");
                        sb2.append(instantiate);
                        sb2.append(" has been inflated via the <fragment> tag: id=0x");
                        sb2.append(Integer.toHexString(resourceId));
                        Log.v("FragmentManager", sb2.toString());
                        fragment = instantiate;
                        l0 = a;
                    }
                }
                else {
                    if (d2.mInLayout) {
                        final StringBuilder sb3 = new StringBuilder();
                        sb3.append(set.getPositionDescription());
                        sb3.append(": Duplicate id 0x");
                        sb3.append(Integer.toHexString(resourceId));
                        sb3.append(", tag ");
                        sb3.append(string2);
                        sb3.append(", or parent id 0x");
                        sb3.append(Integer.toHexString(id));
                        sb3.append(" with another fragment for ");
                        sb3.append(string);
                        throw new IllegalArgumentException(sb3.toString());
                    }
                    d2.mInLayout = true;
                    final d0 f2 = this.f;
                    d2.mFragmentManager = f2;
                    final x<?> v2 = f2.v;
                    d2.mHost = v2;
                    d2.onInflate(v2.g, set, d2.mSavedFragmentState);
                    final l0 g = this.f.g(d2);
                    fragment = d2;
                    l0 = g;
                    if (d0.M(2)) {
                        final StringBuilder sb4 = new StringBuilder();
                        sb4.append("Retained Fragment ");
                        sb4.append(d2);
                        sb4.append(" has been re-attached via the <fragment> tag: id=0x");
                        sb4.append(Integer.toHexString(resourceId));
                        Log.v("FragmentManager", sb4.toString());
                        l0 = g;
                        fragment = d2;
                    }
                }
                final ViewGroup mContainer = (ViewGroup)mView;
                final FragmentStrictMode.b a2 = FragmentStrictMode.a;
                final FragmentTagUsageViolation fragmentTagUsageViolation = new FragmentTagUsageViolation(fragment, mContainer);
                FragmentStrictMode.c(fragmentTagUsageViolation);
                final FragmentStrictMode.b a3 = FragmentStrictMode.a(fragment);
                if (a3.a.contains(FragmentStrictMode.Flag.DETECT_FRAGMENT_TAG_USAGE) && FragmentStrictMode.f(a3, fragment.getClass(), FragmentTagUsageViolation.class)) {
                    FragmentStrictMode.b(a3, fragmentTagUsageViolation);
                }
                fragment.mContainer = mContainer;
                l0.k();
                l0.j();
                mView = fragment.mView;
                if (mView != null) {
                    if (resourceId != 0) {
                        mView.setId(resourceId);
                    }
                    if (fragment.mView.getTag() == null) {
                        fragment.mView.setTag((Object)string2);
                    }
                    fragment.mView.addOnAttachStateChangeListener((View$OnAttachStateChangeListener)new View$OnAttachStateChangeListener() {
                        public final void onViewAttachedToWindow(final View view) {
                            final l0 f = l0;
                            final Fragment c = f.c;
                            f.k();
                            SpecialEffectsController.f((ViewGroup)c.mView.getParent(), y.this.f).e();
                        }
                        
                        public final void onViewDetachedFromWindow(final View view) {
                        }
                    });
                    return fragment.mView;
                }
                throw new IllegalStateException(a40.f.n("Fragment ", string, " did not create a view."));
            }
        }
        return null;
    }
    
    public final View onCreateView(final String s, final Context context, final AttributeSet set) {
        return this.onCreateView(null, s, context, set);
    }
}
