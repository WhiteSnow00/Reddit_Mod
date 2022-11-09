// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.platform;

import android.view.ViewGroup;
import z0.i;
import java.lang.reflect.Field;
import zg2.l;
import android.content.Context;
import kotlinx.coroutines.channels.AbstractChannel;
import java.util.concurrent.atomic.AtomicBoolean;
import e2.s;
import android.util.Log;
import java.util.Map;
import java.util.Collections;
import java.util.WeakHashMap;
import android.view.View;
import android.os.Build$VERSION;
import androidx.compose.runtime.snapshots.SnapshotKt;
import zg2.p;
import kotlinx.coroutines.CoroutineStart;
import mj2.b0;
import tg2.c;
import pg2.j;
import oj2.e;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;
import yl.a;
import z0.f;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import z0.g;
import android.view.ViewGroup$LayoutParams;

public final class z1
{
    public static final ViewGroup$LayoutParams a;
    
    static {
        a = new ViewGroup$LayoutParams(-2, -2);
    }
    
    public static final f a(final AbstractComposeView abstractComposeView, final g g, final ComposableLambdaImpl composableLambdaImpl) {
        ah2.f.f((Object)abstractComposeView, "<this>");
        ah2.f.f((Object)g, "parent");
        final AtomicBoolean a = m0.a;
        final boolean b = false;
        final boolean compareAndSet = a.compareAndSet(false, true);
        final f f = null;
        if (compareAndSet) {
            final AbstractChannel b2 = yl.a.b(-1, (BufferOverflow)null, 6);
            mj2.g.i((b0)mj2.g.a((CoroutineContext)AndroidUiDispatcher.r.getValue()), (CoroutineContext)null, (CoroutineStart)null, (p)new GlobalSnapshotManager$ensureStarted$1((e<j>)b2, null), 3);
            final GlobalSnapshotManager$ensureStarted$2 globalSnapshotManager$ensureStarted$2 = new GlobalSnapshotManager$ensureStarted$2((e<j>)b2);
            synchronized (SnapshotKt.c) {
                SnapshotKt.h.add(globalSnapshotManager$ensureStarted$2);
                monitorexit(SnapshotKt.c);
                SnapshotKt.a();
            }
        }
        AndroidComposeView androidComposeView = null;
        Label_0145: {
            if (((ViewGroup)abstractComposeView).getChildCount() > 0) {
                final View child = ((ViewGroup)abstractComposeView).getChildAt(0);
                if (child instanceof AndroidComposeView) {
                    androidComposeView = (AndroidComposeView)child;
                    break Label_0145;
                }
            }
            else {
                ((ViewGroup)abstractComposeView).removeAllViews();
            }
            androidComposeView = null;
        }
        AndroidComposeView androidComposeView2 = androidComposeView;
        if (androidComposeView == null) {
            final Context context = ((View)abstractComposeView).getContext();
            ah2.f.e((Object)context, "context");
            androidComposeView2 = new AndroidComposeView(context);
            abstractComposeView.addView(androidComposeView2.getView(), z1.a);
        }
        int n = b ? 1 : 0;
        if (Build$VERSION.SDK_INT >= 29) {
            n = (b ? 1 : 0);
            if (y1.a.a((View)androidComposeView2).isEmpty() ^ true) {
                n = 1;
            }
        }
        if (n != 0) {
            ((View)androidComposeView2).setTag(2131429557, (Object)Collections.newSetFromMap(new WeakHashMap<Object, Boolean>()));
            final l a2 = InspectableValueKt.a;
            try {
                final Field declaredField = InspectableValueKt.class.getDeclaredField("b");
                declaredField.setAccessible(true);
                declaredField.setBoolean(null, true);
            }
            catch (final Exception ex) {
                Log.w("Wrapper", "Could not access isDebugInspectorInfoEnabled. Please set explicitly.");
            }
        }
        final i a3 = z0.j.a(new s(androidComposeView2.getRoot()), g);
        final Object tag = androidComposeView2.getView().getTag(2131432300);
        WrappedComposition wrappedComposition = (WrappedComposition)f;
        if (tag instanceof WrappedComposition) {
            wrappedComposition = (WrappedComposition)tag;
        }
        WrappedComposition wrappedComposition2;
        if ((wrappedComposition2 = wrappedComposition) == null) {
            wrappedComposition2 = new WrappedComposition(androidComposeView2, a3);
            androidComposeView2.getView().setTag(2131432300, (Object)wrappedComposition2);
        }
        wrappedComposition2.j((p)composableLambdaImpl);
        return (f)wrappedComposition2;
    }
}
