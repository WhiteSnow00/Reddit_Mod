// 
// Decompiled by Procyon v0.6.0
// 

package androidx.fragment.app.strictmode;

import kotlin.collections.CollectionsKt___CollectionsKt;
import java.util.Set;
import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.d0;
import s4.a;
import android.util.Log;
import sg2.e;
import androidx.fragment.app.Fragment;

public final class FragmentStrictMode
{
    public static FragmentStrictMode.FragmentStrictMode$b a;
    
    static {
        FragmentStrictMode.a = FragmentStrictMode.FragmentStrictMode$b.c;
    }
    
    public static FragmentStrictMode.FragmentStrictMode$b a(Fragment parentFragment) {
        while (parentFragment != null) {
            if (parentFragment.isAdded()) {
                e.e((Object)parentFragment.getParentFragmentManager(), "declaringFragment.parentFragmentManager");
            }
            parentFragment = parentFragment.getParentFragment();
        }
        return FragmentStrictMode.a;
    }
    
    public static void b(final FragmentStrictMode.FragmentStrictMode$b fragmentStrictMode$b, final Violation violation) {
        final Fragment fragment = violation.getFragment();
        final String name = fragment.getClass().getName();
        if (fragmentStrictMode$b.a.contains(FragmentStrictMode.FragmentStrictMode$Flag.PENALTY_LOG)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Policy violation in ");
            sb.append(name);
            Log.d("FragmentStrictMode", sb.toString(), (Throwable)violation);
        }
        fragmentStrictMode$b.getClass();
        if (fragmentStrictMode$b.a.contains(FragmentStrictMode.FragmentStrictMode$Flag.PENALTY_DEATH)) {
            e(fragment, new a(0, name, violation));
        }
    }
    
    public static void c(final Violation violation) {
        if (d0.M(3)) {
            final StringBuilder r = a.r("StrictMode violation in ");
            r.append(violation.getFragment().getClass().getName());
            Log.d("FragmentManager", r.toString(), (Throwable)violation);
        }
    }
    
    public static final void d(final Fragment fragment, final String s) {
        e.f((Object)fragment, "fragment");
        e.f((Object)s, "previousFragmentId");
        final FragmentReuseViolation fragmentReuseViolation = new FragmentReuseViolation(fragment, s);
        c(fragmentReuseViolation);
        final FragmentStrictMode.FragmentStrictMode$b a = a(fragment);
        if (a.a.contains(FragmentStrictMode.FragmentStrictMode$Flag.DETECT_FRAGMENT_REUSE) && f(a, fragment.getClass(), FragmentReuseViolation.class)) {
            b(a, fragmentReuseViolation);
        }
    }
    
    public static void e(final Fragment fragment, final Runnable runnable) {
        if (fragment.isAdded()) {
            final Handler h = fragment.getParentFragmentManager().v.h;
            e.e((Object)h, "fragment.parentFragmentManager.host.handler");
            if (e.a((Object)h.getLooper(), (Object)Looper.myLooper())) {
                runnable.run();
            }
            else {
                h.post(runnable);
            }
        }
        else {
            runnable.run();
        }
    }
    
    public static boolean f(final FragmentStrictMode.FragmentStrictMode$b fragmentStrictMode$b, final Class clazz, final Class clazz2) {
        final Set set = fragmentStrictMode$b.b.get(clazz.getName());
        return set == null || ((e.a((Object)clazz2.getSuperclass(), (Object)Violation.class) || !CollectionsKt___CollectionsKt.s3((Iterable)set, (Object)clazz2.getSuperclass())) && (set.contains(clazz2) ^ true));
    }
}
