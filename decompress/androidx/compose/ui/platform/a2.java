// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.platform;

import z0.i;
import java.lang.reflect.Field;
import mg2.l;
import android.content.Context;
import kotlinx.coroutines.channels.AbstractChannel;
import java.util.concurrent.atomic.AtomicBoolean;
import z0.d;
import z0.j;
import e2.i0;
import android.util.Log;
import java.util.Map;
import java.util.Collections;
import java.util.WeakHashMap;
import android.view.View;
import android.os.Build$VERSION;
import androidx.compose.runtime.snapshots.SnapshotKt;
import mg2.p;
import kotlinx.coroutines.CoroutineStart;
import zi2.c0;
import gg2.c;
import mg.d0;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;
import zg.a;
import ng2.e;
import z0.f;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import z0.g;
import android.view.ViewGroup$LayoutParams;

public final class a2
{
    public static final ViewGroup$LayoutParams a;
    
    static {
        a = new ViewGroup$LayoutParams(-2, -2);
    }
    
    public static final f a(final AbstractComposeView abstractComposeView, final g g, final ComposableLambdaImpl composableLambdaImpl) {
        e.f((Object)abstractComposeView, "<this>");
        e.f((Object)g, "parent");
        final AtomicBoolean a = l0.a;
        final boolean b = false;
        final boolean compareAndSet = a.compareAndSet(false, true);
        final WrappedComposition wrappedComposition = null;
        if (compareAndSet) {
            final AbstractChannel e = zg.a.e(-1, (BufferOverflow)null, 6);
            zi2.g.g((c0)d0.c((CoroutineContext)AndroidUiDispatcher.r.getValue()), null, null, (p)new GlobalSnapshotManager$ensureStarted$1((bj2.e)e, (c)null), 3);
            final GlobalSnapshotManager$ensureStarted$2 globalSnapshotManager$ensureStarted$2 = new GlobalSnapshotManager$ensureStarted$2((bj2.e)e);
            synchronized (SnapshotKt.c) {
                SnapshotKt.h.add(globalSnapshotManager$ensureStarted$2);
                monitorexit(SnapshotKt.c);
                SnapshotKt.a();
            }
        }
        AndroidComposeView androidComposeView = null;
        Label_0159: {
            if (abstractComposeView.getChildCount() > 0) {
                final View child = abstractComposeView.getChildAt(0);
                if (child instanceof AndroidComposeView) {
                    androidComposeView = (AndroidComposeView)child;
                    break Label_0159;
                }
            }
            else {
                abstractComposeView.removeAllViews();
            }
            androidComposeView = null;
        }
        AndroidComposeView androidComposeView2 = androidComposeView;
        if (androidComposeView == null) {
            final Context context = ((View)abstractComposeView).getContext();
            e.e((Object)context, "context");
            androidComposeView2 = new AndroidComposeView(context);
            abstractComposeView.addView(androidComposeView2.getView(), a2.a);
        }
        int n = b ? 1 : 0;
        if (Build$VERSION.SDK_INT >= 29) {
            n = (b ? 1 : 0);
            if (z1.a.a((View)androidComposeView2).isEmpty() ^ true) {
                n = 1;
            }
        }
        if (n != 0) {
            ((View)androidComposeView2).setTag(2131429548, (Object)Collections.newSetFromMap(new WeakHashMap<Object, Boolean>()));
            final l<o0, cg2.j> a2 = InspectableValueKt.a;
            try {
                final Field declaredField = InspectableValueKt.class.getDeclaredField("b");
                declaredField.setAccessible(true);
                declaredField.setBoolean(null, true);
            }
            catch (final Exception ex) {
                Log.w("Wrapper", "Could not access isDebugInspectorInfoEnabled. Please set explicitly.");
            }
        }
        final i a3 = j.a((z0.a)new i0(androidComposeView2.getRoot()), g);
        final Object tag = androidComposeView2.getView().getTag(2131432307);
        WrappedComposition wrappedComposition2 = wrappedComposition;
        if (tag instanceof WrappedComposition) {
            wrappedComposition2 = (WrappedComposition)tag;
        }
        WrappedComposition wrappedComposition3;
        if ((wrappedComposition3 = wrappedComposition2) == null) {
            wrappedComposition3 = new WrappedComposition(androidComposeView2, a3);
            androidComposeView2.getView().setTag(2131432307, (Object)wrappedComposition3);
        }
        wrappedComposition3.k((p<? super d, ? super Integer, cg2.j>)composableLambdaImpl);
        return wrappedComposition3;
    }
}
