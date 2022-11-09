// 
// Decompiled by Procyon v0.6.0
// 

package androidx.fragment.app.strictmode;

import java.util.Iterator;
import java.util.Map;
import kotlin.collections.c;
import kotlin.collections.EmptySet;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.util.Set;
import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.d0;
import s4.a;
import android.util.Log;
import ah2.f;
import androidx.fragment.app.Fragment;

public final class FragmentStrictMode
{
    public static b a;
    
    static {
        FragmentStrictMode.a = b.c;
    }
    
    public static b a(Fragment parentFragment) {
        while (parentFragment != null) {
            if (parentFragment.isAdded()) {
                f.e((Object)parentFragment.getParentFragmentManager(), "declaringFragment.parentFragmentManager");
            }
            parentFragment = parentFragment.getParentFragment();
        }
        return FragmentStrictMode.a;
    }
    
    public static void b(final b b, final Violation violation) {
        final Fragment fragment = violation.getFragment();
        final String name = fragment.getClass().getName();
        if (b.a.contains(Flag.PENALTY_LOG)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Policy violation in ");
            sb.append(name);
            Log.d("FragmentStrictMode", sb.toString(), (Throwable)violation);
        }
        b.getClass();
        if (b.a.contains(Flag.PENALTY_DEATH)) {
            e(fragment, new s4.a(0, name, violation));
        }
    }
    
    public static void c(final Violation violation) {
        if (d0.M(3)) {
            final StringBuilder k = a.k("StrictMode violation in ");
            k.append(violation.getFragment().getClass().getName());
            Log.d("FragmentManager", k.toString(), (Throwable)violation);
        }
    }
    
    public static final void d(final Fragment fragment, final String s) {
        f.f((Object)fragment, "fragment");
        f.f((Object)s, "previousFragmentId");
        final FragmentReuseViolation fragmentReuseViolation = new FragmentReuseViolation(fragment, s);
        c(fragmentReuseViolation);
        final b a = a(fragment);
        if (a.a.contains(Flag.DETECT_FRAGMENT_REUSE) && f(a, fragment.getClass(), FragmentReuseViolation.class)) {
            b(a, fragmentReuseViolation);
        }
    }
    
    public static void e(final Fragment fragment, final Runnable runnable) {
        if (fragment.isAdded()) {
            final Handler h = fragment.getParentFragmentManager().v.h;
            f.e((Object)h, "fragment.parentFragmentManager.host.handler");
            if (f.a((Object)h.getLooper(), (Object)Looper.myLooper())) {
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
    
    public static boolean f(final b b, final Class clazz, final Class clazz2) {
        final Set set = b.b.get(clazz.getName());
        return set == null || ((f.a((Object)clazz2.getSuperclass(), (Object)Violation.class) || !CollectionsKt___CollectionsKt.g1((Iterable)set, (Object)clazz2.getSuperclass())) && (set.contains(clazz2) ^ true));
    }
    
    @Metadata(d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b" }, d2 = { "Landroidx/fragment/app/strictmode/FragmentStrictMode$Flag;", "", "(Ljava/lang/String;I)V", "PENALTY_LOG", "PENALTY_DEATH", "DETECT_FRAGMENT_REUSE", "DETECT_FRAGMENT_TAG_USAGE", "DETECT_RETAIN_INSTANCE_USAGE", "DETECT_SET_USER_VISIBLE_HINT", "DETECT_TARGET_FRAGMENT_USAGE", "DETECT_WRONG_FRAGMENT_CONTAINER", "fragment_release" }, k = 1, mv = { 1, 6, 0 }, xi = 48)
    public enum Flag
    {
        DETECT_FRAGMENT_REUSE, 
        DETECT_FRAGMENT_TAG_USAGE, 
        DETECT_RETAIN_INSTANCE_USAGE, 
        DETECT_SET_USER_VISIBLE_HINT, 
        DETECT_TARGET_FRAGMENT_USAGE, 
        DETECT_WRONG_FRAGMENT_CONTAINER, 
        PENALTY_DEATH, 
        PENALTY_LOG;
    }
    
    public interface a
    {
        void a();
    }
    
    public static final class b
    {
        public static final b c;
        public final Set<Flag> a;
        public final LinkedHashMap b;
        
        static {
            c = new b(EmptySet.INSTANCE, kotlin.collections.c.N1());
        }
        
        public b(final EmptySet a, final Map map) {
            f.f((Object)a, "flags");
            this.a = (Set<Flag>)a;
            final LinkedHashMap b = new LinkedHashMap();
            for (final Map.Entry<String, V> entry : map.entrySet()) {
                b.put(entry.getKey(), entry.getValue());
            }
            this.b = b;
        }
    }
}
