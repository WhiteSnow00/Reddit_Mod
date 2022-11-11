// 
// Decompiled by Procyon v0.6.0
// 

package a4;

import android.view.accessibility.AccessibilityRecord;
import java.util.Objects;
import android.view.ContentInfo;
import android.view.OnReceiveContentListener;
import android.view.View$OnApplyWindowInsetsListener;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.view.View$OnAttachStateChangeListener;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;
import b4.g;
import b4.c$a;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.View$AccessibilityDelegate;
import android.view.ViewParent;
import java.util.ArrayList;
import android.util.SparseArray;
import java.lang.ref.WeakReference;
import android.os.Build$VERSION;
import android.view.KeyEvent;
import android.view.WindowInsets;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.reflect.Field;
import android.view.View;
import java.util.WeakHashMap;

public final class q0
{
    public static WeakHashMap<View, t1> a;
    public static Field b;
    public static boolean c;
    public static final l0 d;
    public static final q0.q0$a e;
    
    static {
        new AtomicInteger(1);
        q0.a = null;
        q0.c = false;
        d = new l0();
        e = new q0.q0$a();
    }
    
    public static t1 a(final View view) {
        if (q0.a == null) {
            q0.a = new WeakHashMap<View, t1>();
        }
        t1 t1;
        if ((t1 = q0.a.get(view)) == null) {
            t1 = new t1(view);
            q0.a.put(view, t1);
        }
        return t1;
    }
    
    public static a2 b(final View view, final a2 a2) {
        final WindowInsets i = a2.i();
        if (i != null) {
            final WindowInsets a3 = q0.q0$h.a(view, i);
            if (!a3.equals((Object)i)) {
                return a2.j(view, a3);
            }
        }
        return a2;
    }
    
    public static boolean c(View a, final KeyEvent keyEvent) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        boolean b = false;
        if (sdk_INT >= 28) {
            return false;
        }
        final ArrayList d = q0.q0$s.d;
        q0.q0$s q0$s;
        if ((q0$s = (q0.q0$s)a.getTag(2131431633)) == null) {
            q0$s = new q0.q0$s();
            a.setTag(2131431633, (Object)q0$s);
        }
        if (keyEvent.getAction() == 0) {
            final WeakHashMap a2 = q0$s.a;
            if (a2 != null) {
                a2.clear();
            }
            final ArrayList d2 = q0.q0$s.d;
            if (!d2.isEmpty()) {
                synchronized (d2) {
                    if (q0$s.a == null) {
                        q0$s.a = new WeakHashMap();
                    }
                    int size = d2.size();
                    while (true) {
                        final int n = size - 1;
                        if (n < 0) {
                            break;
                        }
                        final ArrayList d3 = q0.q0$s.d;
                        final View view = d3.get(n).get();
                        if (view == null) {
                            d3.remove(n);
                            size = n;
                        }
                        else {
                            q0$s.a.put(view, Boolean.TRUE);
                            ViewParent viewParent = view.getParent();
                            while (true) {
                                size = n;
                                if (!(viewParent instanceof View)) {
                                    break;
                                }
                                q0$s.a.put(viewParent, Boolean.TRUE);
                                viewParent = viewParent.getParent();
                            }
                        }
                    }
                }
            }
        }
        a = q0$s.a(a, keyEvent);
        if (keyEvent.getAction() == 0) {
            final int keyCode = keyEvent.getKeyCode();
            if (a != null && !KeyEvent.isModifierKey(keyCode)) {
                if (q0$s.b == null) {
                    q0$s.b = new SparseArray();
                }
                q0$s.b.put(keyCode, (Object)new WeakReference(a));
            }
        }
        if (a != null) {
            b = true;
        }
        return b;
    }
    
    public static View$AccessibilityDelegate d(View view) {
        if (Build$VERSION.SDK_INT >= 29) {
            return q0.q0$n.a(view);
        }
        final boolean c = q0.c;
        final View view2 = null;
        if (c) {
            view = view2;
        }
        else {
            if (q0.b == null) {
                try {
                    (q0.b = View.class.getDeclaredField("mAccessibilityDelegate")).setAccessible(true);
                }
                finally {
                    q0.c = true;
                    view = view2;
                    return (View$AccessibilityDelegate)view;
                }
            }
            try {
                final Object value = q0.b.get(view);
                if (value instanceof View$AccessibilityDelegate) {
                    final View$AccessibilityDelegate view$AccessibilityDelegate = (View$AccessibilityDelegate)value;
                }
            }
            finally {
                q0.c = true;
                view = view2;
            }
        }
        return (View$AccessibilityDelegate)view;
    }
    
    public static String[] e(final View view) {
        if (Build$VERSION.SDK_INT >= 31) {
            return q0.q0$p.a(view);
        }
        return (String[])view.getTag(2131431628);
    }
    
    public static void f(final int n, final View source) {
        final AccessibilityManager accessibilityManager = (AccessibilityManager)source.getContext().getSystemService("accessibility");
        if (!accessibilityManager.isEnabled()) {
            return;
        }
        final boolean b = ((q0.q0$b)new n0(CharSequence.class)).d(source) != null && source.isShown() && source.getWindowVisibility() == 0;
        final int a = q0.q0$g.a(source);
        int eventType = 32;
        if (a == 0 && !b) {
            if (n == 32) {
                final AccessibilityEvent obtain = AccessibilityEvent.obtain();
                source.onInitializeAccessibilityEvent(obtain);
                obtain.setEventType(32);
                q0.q0$g.g(obtain, n);
                ((AccessibilityRecord)obtain).setSource(source);
                source.onPopulateAccessibilityEvent(obtain);
                ((AccessibilityRecord)obtain).getText().add(((q0.q0$b)new n0(CharSequence.class)).d(source));
                accessibilityManager.sendAccessibilityEvent(obtain);
            }
            else if (source.getParent() != null) {
                final ViewParent parent = source.getParent();
                try {
                    q0.q0$g.e(parent, source, source, n);
                }
                catch (final AbstractMethodError abstractMethodError) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append(source.getParent().getClass().getSimpleName());
                    sb.append(" does not fully implement ViewParent");
                    Log.e("ViewCompat", sb.toString(), (Throwable)abstractMethodError);
                }
            }
        }
        else {
            final AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
            if (!b) {
                eventType = 2048;
            }
            obtain2.setEventType(eventType);
            q0.q0$g.g(obtain2, n);
            if (b) {
                ((AccessibilityRecord)obtain2).getText().add(((q0.q0$b)new n0(CharSequence.class)).d(source));
                if (q0.q0$d.c(source) == 0) {
                    q0.q0$d.s(source, 1);
                }
                for (ViewParent viewParent = source.getParent(); viewParent instanceof View; viewParent = viewParent.getParent()) {
                    if (q0.q0$d.c((View)viewParent) == 4) {
                        q0.q0$d.s(source, 2);
                        break;
                    }
                }
            }
            source.sendAccessibilityEventUnchecked(obtain2);
        }
    }
    
    public static a2 g(final View view, final a2 a2) {
        final WindowInsets i = a2.i();
        if (i != null) {
            final WindowInsets b = q0.q0$h.b(view, i);
            if (!b.equals((Object)i)) {
                return a2.j(view, b);
            }
        }
        return a2;
    }
    
    public static c h(final View view, c a) {
        if (Log.isLoggable("ViewCompat", 3)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("performReceiveContent: ");
            sb.append(a);
            sb.append(", view=");
            sb.append(view.getClass().getSimpleName());
            sb.append("[");
            sb.append(view.getId());
            sb.append("]");
            Log.d("ViewCompat", sb.toString());
        }
        if (Build$VERSION.SDK_INT >= 31) {
            return q0.q0$p.b(view, a);
        }
        final h0 h0 = (h0)view.getTag(2131431627);
        if (h0 != null) {
            a = h0.a(view, a);
            c onReceiveContent;
            if (a == null) {
                onReceiveContent = null;
            }
            else {
                Object d;
                if (view instanceof i0) {
                    d = view;
                }
                else {
                    d = q0.d;
                }
                onReceiveContent = ((i0)d).onReceiveContent(a);
            }
            return onReceiveContent;
        }
        Object d2;
        if (view instanceof i0) {
            d2 = view;
        }
        else {
            d2 = q0.d;
        }
        return ((i0)d2).onReceiveContent(a);
    }
    
    public static void i(final int n, final View view) {
        ArrayList list;
        if ((list = (ArrayList)view.getTag(2131431621)) == null) {
            list = new ArrayList();
            view.setTag(2131431621, (Object)list);
        }
        for (int i = 0; i < list.size(); ++i) {
            if (((c$a)list.get(i)).a() == n) {
                list.remove(i);
                break;
            }
        }
    }
    
    public static void j(final View view, final c$a c$a, final g g) {
        if (g == null) {
            i(c$a.a(), view);
            f(0, view);
        }
        else {
            final c$a c$a2 = new c$a((Object)null, c$a.b, (String)null, g, c$a.c);
            final View$AccessibilityDelegate d = d(view);
            a a;
            if (d == null) {
                a = null;
            }
            else if (d instanceof a$a) {
                a = ((a$a)d).a;
            }
            else {
                a = new a(d);
            }
            a a2 = a;
            if (a == null) {
                a2 = new a();
            }
            l(view, a2);
            i(c$a2.a(), view);
            ArrayList list;
            if ((list = (ArrayList)view.getTag(2131431621)) == null) {
                list = new ArrayList();
                view.setTag(2131431621, (Object)list);
            }
            list.add(c$a2);
            f(0, view);
        }
    }
    
    public static void k(final View view, final Context context, final int[] array, final AttributeSet set, final TypedArray typedArray, final int n) {
        if (Build$VERSION.SDK_INT >= 29) {
            q0.q0$n.c(view, context, array, set, typedArray, n, 0);
        }
    }
    
    public static void l(final View view, final a a) {
        a a2 = a;
        if (a == null) {
            a2 = a;
            if (d(view) instanceof a$a) {
                a2 = new a();
            }
        }
        View$AccessibilityDelegate bridge;
        if (a2 == null) {
            bridge = null;
        }
        else {
            bridge = a2.getBridge();
        }
        view.setAccessibilityDelegate(bridge);
    }
    
    public static void m(final View view, final CharSequence charSequence) {
        ((q0.q0$b)new n0(CharSequence.class)).e(view, (Object)charSequence);
        if (charSequence != null) {
            final q0.q0$a e = q0.e;
            e.f.put(view, view.isShown() && view.getWindowVisibility() == 0);
            view.addOnAttachStateChangeListener((View$OnAttachStateChangeListener)e);
            if (q0.q0$g.b(view)) {
                view.getViewTreeObserver().addOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)e);
            }
        }
        else {
            final q0.q0$a e2 = q0.e;
            e2.f.remove(view);
            view.removeOnAttachStateChangeListener((View$OnAttachStateChangeListener)e2);
            q0.q0$d.o(view.getViewTreeObserver(), (ViewTreeObserver$OnGlobalLayoutListener)e2);
        }
    }
    
    public static void n(final View view, final y1.b b) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        y1.d.a a = null;
        if (sdk_INT >= 30) {
            if (b != null) {
                a = new y1.d.a(b);
            }
            z1.c(view, a);
        }
        else {
            final Object tag = view.getTag(2131431626);
            if (b == null) {
                view.setTag(2131431635, (Object)null);
                if (tag == null) {
                    view.setOnApplyWindowInsetsListener((View$OnApplyWindowInsetsListener)null);
                }
            }
            else {
                final y1.c.a onApplyWindowInsetsListener = new y1.c.a(view, b);
                view.setTag(2131431635, (Object)onApplyWindowInsetsListener);
                if (tag == null) {
                    view.setOnApplyWindowInsetsListener((View$OnApplyWindowInsetsListener)onApplyWindowInsetsListener);
                }
            }
        }
    }
    
    public static final class q implements OnReceiveContentListener
    {
        public final h0 a;
        
        public q(final h0 a) {
            this.a = a;
        }
        
        public final ContentInfo onReceiveContent(final View view, final ContentInfo contentInfo) {
            final c c = new c((c$f)new c.e(contentInfo));
            final c a = this.a.a(view, c);
            if (a == null) {
                return null;
            }
            if (a == c) {
                return contentInfo;
            }
            final ContentInfo h = a.a.h();
            Objects.requireNonNull(h);
            return h;
        }
    }
}
