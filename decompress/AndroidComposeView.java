// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.platform;

import java.util.AbstractCollection;
import android.view.InputEvent;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import java.util.HashMap;
import android.view.autofill.AutofillId;
import java.util.Iterator;
import androidx.compose.ui.autofill.AutofillType;
import java.util.Map;
import android.view.ViewStructure;
import androidx.compose.ui.focus.FocusStateImpl;
import android.util.Log;
import androidx.compose.ui.text.input.TextFieldValue;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.EditorInfo;
import androidx.lifecycle.Lifecycle;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import android.view.ViewTreeObserver$OnTouchModeChangeListener;
import android.view.ViewTreeObserver$OnScrollChangedListener;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import i1.f$a;
import android.graphics.Rect;
import e2.m$a;
import android.view.KeyEvent;
import androidx.compose.ui.node.LayoutNode$b;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsNode;
import a4.u1;
import kotlin.collections.CollectionsKt___CollectionsKt;
import androidx.compose.ui.node.LayoutNodeWrapper$c;
import androidx.compose.ui.node.LayoutNodeWrapper;
import androidx.compose.ui.focus.FocusModifier;
import a4.k1;
import java.util.Collection;
import android.graphics.Canvas;
import kotlin.NotImplementedError;
import android.view.autofill.AutofillValue;
import android.util.SparseArray;
import android.view.MotionEvent$PointerCoords;
import android.view.MotionEvent$PointerProperties;
import java.util.ListIterator;
import java.util.List;
import z1.r;
import androidx.compose.ui.node.LayoutNode$UsageByParent;
import java.lang.ref.Reference;
import android.graphics.Matrix;
import java.lang.ref.WeakReference;
import java.lang.ref.ReferenceQueue;
import android.view.ViewParent;
import android.os.Trace;
import android.view.animation.AnimationUtils;
import android.view.View$MeasureSpec;
import kotlin.Pair;
import a4.p0;
import androidx.compose.ui.unit.LayoutDirection;
import z0.a1;
import z0.s0;
import n2.p;
import android.view.ViewConfiguration;
import android.view.View;
import android.os.Build$VERSION;
import androidx.compose.ui.layout.RootMeasurePolicy;
import androidx.compose.ui.input.rotary.RotaryInputModifierKt;
import android.content.Context;
import android.content.res.Configuration;
import z1.g;
import java.util.ArrayList;
import androidx.compose.ui.node.LayoutNode;
import a1.e;
import h.s;
import z0.c1;
import x1.d;
import android.view.MotionEvent;
import androidx.compose.ui.focus.FocusManagerImpl;
import u1.b;
import e2.f;
import o2.u;
import androidx.compose.ui.text.input.TextInputServiceAndroid;
import zg2.l;
import e2.h;
import u2.a;
import androidx.compose.ui.node.OwnerSnapshotObserver;
import java.lang.reflect.Method;
import kotlin.Metadata;
import androidx.lifecycle.c;
import z1.w;
import e2.q;
import e2.m;
import android.view.ViewGroup;

@Metadata(bv = {}, d1 = { "\u0000\u00fc\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0004«\u0001¬\u0001J\u001a\u0010\n\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u000bR\u001a\u0010\u0014\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u001a\u001a\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010 \u001a\u00020\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010&\u001a\u00020!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R(\u00100\u001a\u00020'8\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0004\b(\u0010)\u0012\u0004\b.\u0010/\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R(\u00109\u001a\u0002018\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b2\u00103\u0012\u0004\b8\u0010/\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u001a\u0010;\u001a\u00020:8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u0014\u0010A\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@R$\u0010D\u001a\u00020B2\u0006\u0010C\u001a\u00020B8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u0014\u0010K\u001a\u00020H8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bI\u0010JR\u0014\u0010O\u001a\u00020L8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bM\u0010NR\u001a\u0010Q\u001a\u00020P8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010TR\u001a\u0010V\u001a\u00020U8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010YR\u001a\u0010[\u001a\u00020Z8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^R.\u0010`\u001a\u000e\u0012\u0004\u0012\u00020_\u0012\u0004\u0012\u00020\b0\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b`\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR\u0016\u0010i\u001a\u0004\u0018\u00010f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bg\u0010hR\u0014\u0010m\u001a\u00020j8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bk\u0010lR\u0014\u0010o\u001a\u0002018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bn\u00105R\u001a\u0010q\u001a\u00020p8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bq\u0010r\u001a\u0004\bs\u0010tR\u0014\u0010v\u001a\u00020'8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bu\u0010+R/\u0010}\u001a\u0004\u0018\u00010\u00072\b\u0010C\u001a\u0004\u0018\u00010\u00078F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bw\u0010x\u001a\u0004\by\u0010z\"\u0004\b{\u0010|R$\u0010\u007f\u001a\u00020~8\u0016X\u0096\u0004¢\u0006\u0016\n\u0005\b\u007f\u0010\u0080\u0001\u0012\u0005\b\u0083\u0001\u0010/\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R'\u0010\u0085\u0001\u001a\u00030\u0084\u00018\u0016X\u0097\u0004¢\u0006\u0017\n\u0006\b\u0085\u0001\u0010\u0086\u0001\u0012\u0005\b\u0089\u0001\u0010/\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001R3\u0010\u0090\u0001\u001a\u00030\u008a\u00012\u0007\u0010C\u001a\u00030\u008a\u00018V@RX\u0096\u008e\u0002¢\u0006\u0017\n\u0005\b\u008b\u0001\u0010x\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001\"\u0006\b\u008e\u0001\u0010\u008f\u0001R3\u0010\u0097\u0001\u001a\u00030\u0091\u00012\u0007\u0010C\u001a\u00030\u0091\u00018V@RX\u0096\u008e\u0002¢\u0006\u0017\n\u0005\b\u0092\u0001\u0010x\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001\"\u0006\b\u0095\u0001\u0010\u0096\u0001R \u0010\u0099\u0001\u001a\u00030\u0098\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0099\u0001\u0010\u009a\u0001\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001R\u0018\u0010 \u0001\u001a\u00030\u009d\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001R \u0010¢\u0001\u001a\u00030¡\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b¢\u0001\u0010£\u0001\u001a\u0006\b¤\u0001\u0010¥\u0001R \u0010§\u0001\u001a\u00030¦\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b§\u0001\u0010¨\u0001\u001a\u0006\b©\u0001\u0010ª\u0001¨\u0006\u00ad\u0001" }, d2 = { "Landroidx/compose/ui/platform/AndroidComposeView;", "Landroid/view/ViewGroup;", "Le2/m;", "", "Lz1/w;", "Landroidx/lifecycle/c;", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/AndroidComposeView$b;", "Lpg2/j;", "callback", "setOnViewTreeOwnersAvailable", "", "accessibilityId", "Landroid/view/View;", "findViewByAccessibilityIdTraversal", "Landroidx/compose/ui/node/LayoutNode;", "o", "Landroidx/compose/ui/node/LayoutNode;", "getRoot", "()Landroidx/compose/ui/node/LayoutNode;", "root", "Landroidx/compose/ui/platform/k;", "B", "Landroidx/compose/ui/platform/k;", "getClipboardManager", "()Landroidx/compose/ui/platform/k;", "clipboardManager", "Landroidx/compose/ui/platform/j;", "C", "Landroidx/compose/ui/platform/j;", "getAccessibilityManager", "()Landroidx/compose/ui/platform/j;", "accessibilityManager", "Landroidx/compose/ui/node/OwnerSnapshotObserver;", "D", "Landroidx/compose/ui/node/OwnerSnapshotObserver;", "getSnapshotObserver", "()Landroidx/compose/ui/node/OwnerSnapshotObserver;", "snapshotObserver", "", "E", "Z", "getShowLayoutBounds", "()Z", "setShowLayoutBounds", "(Z)V", "getShowLayoutBounds$annotations", "()V", "showLayoutBounds", "", "P", "J", "getLastMatrixRecalculationAnimationTime$ui_release", "()J", "setLastMatrixRecalculationAnimationTime$ui_release", "(J)V", "getLastMatrixRecalculationAnimationTime$ui_release$annotations", "lastMatrixRecalculationAnimationTime", "Le2/f;", "sharedDrawScope", "Le2/f;", "getSharedDrawScope", "()Le2/f;", "getView", "()Landroid/view/View;", "view", "Lu2/b;", "<set-?>", "density", "Lu2/b;", "getDensity", "()Lu2/b;", "Lm1/d;", "getFocusManager", "()Lm1/d;", "focusManager", "Landroidx/compose/ui/platform/p1;", "getWindowInfo", "()Landroidx/compose/ui/platform/p1;", "windowInfo", "Le2/q;", "rootForTest", "Le2/q;", "getRootForTest", "()Le2/q;", "Lh2/n;", "semanticsOwner", "Lh2/n;", "getSemanticsOwner", "()Lh2/n;", "Lk1/h;", "autofillTree", "Lk1/h;", "getAutofillTree", "()Lk1/h;", "Landroid/content/res/Configuration;", "configurationChangeObserver", "Lzg2/l;", "getConfigurationChangeObserver", "()Lzg2/l;", "setConfigurationChangeObserver", "(Lzg2/l;)V", "Lk1/c;", "getAutofill", "()Lk1/c;", "autofill", "Landroidx/compose/ui/platform/b0;", "getAndroidViewsHandler$ui_release", "()Landroidx/compose/ui/platform/b0;", "androidViewsHandler", "getMeasureIteration", "measureIteration", "Landroidx/compose/ui/platform/k1;", "viewConfiguration", "Landroidx/compose/ui/platform/k1;", "getViewConfiguration", "()Landroidx/compose/ui/platform/k1;", "getHasPendingMeasureOrLayout", "hasPendingMeasureOrLayout", "viewTreeOwners$delegate", "Lz0/h0;", "getViewTreeOwners", "()Landroidx/compose/ui/platform/AndroidComposeView$b;", "setViewTreeOwners", "(Landroidx/compose/ui/platform/AndroidComposeView$b;)V", "viewTreeOwners", "Lo2/u;", "textInputService", "Lo2/u;", "getTextInputService", "()Lo2/u;", "getTextInputService$annotations", "Ln2/f$a;", "fontLoader", "Ln2/f$a;", "getFontLoader", "()Ln2/f$a;", "getFontLoader$annotations", "Ln2/g$a;", "fontFamilyResolver$delegate", "getFontFamilyResolver", "()Ln2/g$a;", "setFontFamilyResolver", "(Ln2/g$a;)V", "fontFamilyResolver", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection$delegate", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "setLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "layoutDirection", "Lu1/a;", "hapticFeedBack", "Lu1/a;", "getHapticFeedBack", "()Lu1/a;", "Lv1/b;", "getInputModeManager", "()Lv1/b;", "inputModeManager", "Landroidx/compose/ui/platform/d1;", "textToolbar", "Landroidx/compose/ui/platform/d1;", "getTextToolbar", "()Landroidx/compose/ui/platform/d1;", "Lz1/m;", "pointerIconService", "Lz1/m;", "getPointerIconService", "()Lz1/m;", "a", "b", "ui_release" }, k = 1, mv = { 1, 6, 0 })
public final class AndroidComposeView extends ViewGroup implements m, q, w, c
{
    public static Class<?> v0;
    public static Method w0;
    public boolean A;
    public final k B;
    public final j C;
    public final OwnerSnapshotObserver D;
    public boolean E;
    public b0 F;
    public l0 G;
    public a H;
    public boolean I;
    public final h J;
    public final a0 K;
    public long L;
    public final int[] M;
    public final float[] N;
    public final float[] O;
    public long P;
    public boolean Q;
    public long R;
    public boolean S;
    public final z0.l0 T;
    public l<? super AndroidComposeView.AndroidComposeView$b, pg2.j> U;
    public final androidx.compose.ui.platform.l V;
    public final androidx.compose.ui.platform.m W;
    public final n a0;
    public final TextInputServiceAndroid b0;
    public final u c0;
    public final x d0;
    public final z0.l0 e0;
    public long f;
    public int f0;
    public boolean g;
    public final z0.l0 g0;
    public final f h;
    public final b h0;
    public u2.c i;
    public final v1.c i0;
    public final FocusManagerImpl j;
    public final AndroidTextToolbar j0;
    public final q1 k;
    public MotionEvent k0;
    public final d l;
    public long l0;
    public final j1.d m;
    public final c1 m0;
    public final s n;
    public final e<zg2.a<pg2.j>> n0;
    public final LayoutNode o;
    public final AndroidComposeView$d o0;
    public final AndroidComposeView p;
    public final o p0;
    public final h2.n q;
    public boolean q0;
    public final AndroidComposeViewAccessibilityDelegateCompat r;
    public final zg2.a<pg2.j> r0;
    public final k1.h s;
    public final c0 s0;
    public final ArrayList t;
    public z1.l t0;
    public ArrayList u;
    public final AndroidComposeView$c u0;
    public boolean v;
    public final g w;
    public final z1.s x;
    public l<? super Configuration, pg2.j> y;
    public final k1.a z;
    
    static {
        new AndroidComposeView.AndroidComposeView$a();
    }
    
    public AndroidComposeView(final Context context) {
        super(context);
        this.f = n1.c.d;
        this.g = true;
        this.h = new f();
        this.i = mj2.c0.c(context);
        final h2.m m = new h2.m(false, false, (l)AndroidComposeView$semanticsModifier.AndroidComposeView$semanticsModifier$1.INSTANCE, h2.m.h.addAndGet(1));
        final FocusManagerImpl j = new FocusManagerImpl();
        this.j = j;
        this.k = new q1();
        final d l = new d((l<? super x1.b, Boolean>)new AndroidComposeView$keyInputModifier.AndroidComposeView$keyInputModifier$1(this), null);
        this.l = l;
        final j1.d a = RotaryInputModifierKt.a((l)AndroidComposeView$rotaryInputModifier.AndroidComposeView$rotaryInputModifier$1.INSTANCE);
        this.m = a;
        this.n = new s(1, 0);
        final LayoutNode o = new LayoutNode(false);
        o.h((c2.s)RootMeasurePolicy.b);
        o.a(((j1.d)m).f0(a).f0(j.b).f0((j1.d)l));
        o.g(this.getDensity());
        this.o = o;
        this.p = this;
        this.q = new h2.n(this.getRoot());
        final AndroidComposeViewAccessibilityDelegateCompat r = new AndroidComposeViewAccessibilityDelegateCompat(this);
        this.r = r;
        this.s = new k1.h();
        this.t = new ArrayList();
        this.w = new g();
        this.x = new z1.s(this.getRoot());
        this.y = (l<? super Configuration, pg2.j>)AndroidComposeView$configurationChangeObserver.AndroidComposeView$configurationChangeObserver$1.INSTANCE;
        final int sdk_INT = Build$VERSION.SDK_INT;
        k1.a z;
        if (sdk_INT >= 26) {
            z = new k1.a((View)this, this.getAutofillTree());
        }
        else {
            z = null;
        }
        this.z = z;
        this.B = new k(context);
        this.C = new j(context);
        this.D = new OwnerSnapshotObserver((l)new AndroidComposeView$snapshotObserver.AndroidComposeView$snapshotObserver$1(this));
        this.J = new h(this.getRoot());
        final ViewConfiguration value = ViewConfiguration.get(context);
        ah2.f.e((Object)value, "get(context)");
        this.K = new a0(value);
        this.L = u2.g.b;
        this.M = new int[] { 0, 0 };
        this.N = aj2.c.B();
        this.O = aj2.c.B();
        this.P = -1L;
        this.R = n1.c.c;
        this.S = true;
        this.T = a80.a.n0(null);
        this.V = new androidx.compose.ui.platform.l(this);
        this.W = new androidx.compose.ui.platform.m(this);
        this.a0 = new n(this);
        final TextInputServiceAndroid b0 = new TextInputServiceAndroid((View)this);
        this.b0 = b0;
        this.c0 = (u)AndroidComposeView_androidKt.a.invoke((Object)b0);
        this.d0 = new x(context);
        this.e0 = a80.a.m0(new androidx.compose.ui.text.font.c(new androidx.compose.ui.text.font.a(context), n2.c.a(context), 28), (a1)z0.s0.a);
        final Configuration configuration = context.getResources().getConfiguration();
        ah2.f.e((Object)configuration, "context.resources.configuration");
        int fontWeightAdjustment;
        if (sdk_INT >= 31) {
            fontWeightAdjustment = configuration.fontWeightAdjustment;
        }
        else {
            fontWeightAdjustment = 0;
        }
        this.f0 = fontWeightAdjustment;
        final Configuration configuration2 = context.getResources().getConfiguration();
        ah2.f.e((Object)configuration2, "context.resources.configuration");
        final int layoutDirection = configuration2.getLayoutDirection();
        LayoutDirection layoutDirection2;
        if (layoutDirection != 0) {
            if (layoutDirection != 1) {
                layoutDirection2 = LayoutDirection.Ltr;
            }
            else {
                layoutDirection2 = LayoutDirection.Rtl;
            }
        }
        else {
            layoutDirection2 = LayoutDirection.Ltr;
        }
        this.g0 = a80.a.n0(layoutDirection2);
        this.h0 = new b((View)this);
        int n;
        if (((View)this).isInTouchMode()) {
            n = 1;
        }
        else {
            n = 2;
        }
        this.i0 = new v1.c(n, (l)new AndroidComposeView$_inputModeManager.AndroidComposeView$_inputModeManager$1(this));
        this.j0 = new AndroidTextToolbar((View)this);
        this.m0 = new c1(2);
        this.n0 = new e<zg2.a<pg2.j>>(new zg2.a[16]);
        this.o0 = new AndroidComposeView$d(this);
        this.p0 = new o((Object)this, 0);
        this.r0 = (zg2.a<pg2.j>)new AndroidComposeView$resendMotionEventOnLayout.AndroidComposeView$resendMotionEventOnLayout$1(this);
        Object s0;
        if (sdk_INT >= 29) {
            s0 = new e0();
        }
        else {
            s0 = new d0();
        }
        this.s0 = (c0)s0;
        ((View)this).setWillNotDraw(false);
        ((View)this).setFocusable(true);
        if (sdk_INT >= 26) {
            androidx.compose.ui.platform.v.a.a((View)this, 1, false);
        }
        ((View)this).setFocusableInTouchMode(true);
        this.setClipChildren(false);
        this.setTransitionGroup(true);
        a4.p0.l((View)this, (a4.a)r);
        this.getRoot().k((m)this);
        if (sdk_INT >= 29) {
            androidx.compose.ui.platform.t.a.a((View)this);
        }
        this.u0 = new AndroidComposeView$c(this);
    }
    
    public static void A(final ViewGroup viewGroup) {
        for (int childCount = viewGroup.getChildCount(), i = 0; i < childCount; ++i) {
            final View child = viewGroup.getChildAt(i);
            if (child instanceof AndroidComposeView) {
                ((AndroidComposeView)child).l();
            }
            else if (child instanceof ViewGroup) {
                A((ViewGroup)child);
            }
        }
    }
    
    public static Pair B(int size) {
        final int mode = View$MeasureSpec.getMode(size);
        size = View$MeasureSpec.getSize(size);
        final Integer value = 0;
        Pair pair;
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode != 1073741824) {
                    throw new IllegalStateException();
                }
                pair = new Pair((Object)size, (Object)size);
            }
            else {
                pair = new Pair((Object)value, (Object)Integer.MAX_VALUE);
            }
        }
        else {
            pair = new Pair((Object)value, (Object)size);
        }
        return pair;
    }
    
    public static View C(final int n, final View view) {
        if (Build$VERSION.SDK_INT < 29) {
            int i = 0;
            final Method declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", (Class<?>[])new Class[0]);
            declaredMethod.setAccessible(true);
            if (ah2.f.a(declaredMethod.invoke(view, new Object[0]), (Object)n)) {
                return view;
            }
            if (view instanceof ViewGroup) {
                for (ViewGroup viewGroup = (ViewGroup)view; i < viewGroup.getChildCount(); ++i) {
                    final View child = viewGroup.getChildAt(i);
                    ah2.f.e((Object)child, "currentView.getChildAt(i)");
                    final View c = C(n, child);
                    if (c != null) {
                        return c;
                    }
                }
            }
        }
        return null;
    }
    
    public static void E(final LayoutNode layoutNode) {
        layoutNode.z();
        final e v = layoutNode.v();
        final int h = v.h;
        if (h > 0) {
            int n = 0;
            final T[] f = v.f;
            do {
                E((LayoutNode)f[n]);
            } while (++n < h);
        }
    }
    
    public static boolean G(final MotionEvent motionEvent) {
        final float x = motionEvent.getX();
        final boolean infinite = Float.isInfinite(x);
        final boolean b = true;
        final boolean b2 = !infinite && !Float.isNaN(x);
        boolean b3 = b;
        if (b2) {
            final float y = motionEvent.getY();
            final boolean b4 = !Float.isInfinite(y) && !Float.isNaN(y);
            b3 = b;
            if (b4) {
                final float rawX = motionEvent.getRawX();
                final boolean b5 = !Float.isInfinite(rawX) && !Float.isNaN(rawX);
                b3 = b;
                if (b5) {
                    final float rawY = motionEvent.getRawY();
                    b3 = ((Float.isInfinite(rawY) || Float.isNaN(rawY)) && b);
                }
            }
        }
        return b3;
    }
    
    private void setFontFamilyResolver(final n2.g.a value) {
        ((SnapshotMutableStateImpl<n2.g.a>)this.e0).setValue(value);
    }
    
    private void setLayoutDirection(final LayoutDirection value) {
        ((SnapshotMutableStateImpl<LayoutDirection>)this.g0).setValue(value);
    }
    
    private final void setViewTreeOwners(final AndroidComposeView.AndroidComposeView$b value) {
        ((SnapshotMutableStateImpl<AndroidComposeView.AndroidComposeView$b>)this.T).setValue(value);
    }
    
    public final int D(final MotionEvent motionEvent) {
        ((View)this).removeCallbacks((Runnable)this.o0);
        try {
            this.P = AnimationUtils.currentAnimationTimeMillis();
            this.s0.a((View)this, this.N);
            a80.a.c0(this.N, this.O);
            final long p = aj2.c.p0(this.N, yd.a.y0(motionEvent.getX(), motionEvent.getY()));
            this.R = yd.a.y0(motionEvent.getRawX() - n1.c.c(p), motionEvent.getRawY() - n1.c.d(p));
            final int n = 1;
            this.Q = true;
            this.d(false);
            this.t0 = null;
            Trace.beginSection("AndroidOwner:onTouch");
            Label_0438: {
                int actionMasked = 0;
                MotionEvent k0 = null;
                boolean b = false;
                Label_0329: {
                    boolean b2 = false;
                    Label_0193: {
                        try {
                            actionMasked = motionEvent.getActionMasked();
                            k0 = this.k0;
                            b = (k0 != null && k0.getToolType(0) == 3);
                            if (k0 == null) {
                                break Label_0329;
                            }
                            if (k0.getSource() == motionEvent.getSource()) {
                                if (k0.getToolType(0) == motionEvent.getToolType(0)) {
                                    b2 = false;
                                    break Label_0193;
                                }
                            }
                        }
                        finally {
                            break Label_0438;
                        }
                        b2 = true;
                    }
                    if (b2) {
                        boolean b3 = false;
                        Label_0243: {
                            if (k0.getButtonState() == 0) {
                                final int actionMasked2 = k0.getActionMasked();
                                if (actionMasked2 != 0 && actionMasked2 != 2 && actionMasked2 != 6) {
                                    b3 = false;
                                    break Label_0243;
                                }
                            }
                            b3 = true;
                        }
                        if (b3) {
                            final z1.s x = this.x;
                            x.c.a.clear();
                            final c1 b4 = x.b;
                            ((z1.j)b4.g).c();
                            ((z1.j)b4.g).a.e();
                        }
                        else if (k0.getActionMasked() != 10 && b) {
                            this.O(k0, 10, k0.getEventTime(), true);
                        }
                    }
                }
                final MotionEvent motionEvent2;
                int n2;
                if (motionEvent2.getToolType(0) == 3) {
                    n2 = n;
                }
                else {
                    n2 = 0;
                }
                if (!b && n2 != 0 && actionMasked != 3 && actionMasked != 9 && this.H(motionEvent2)) {
                    this.O(motionEvent2, 9, motionEvent2.getEventTime(), true);
                }
                if (k0 != null) {
                    k0.recycle();
                }
                this.k0 = MotionEvent.obtainNoHistory(motionEvent2);
                final int n3 = this.N(motionEvent2);
                Trace.endSection();
                androidx.compose.ui.platform.u.a.a((View)this, this.t0);
                return n3;
            }
            Trace.endSection();
        }
        finally {
            this.Q = false;
        }
    }
    
    public final void F(final LayoutNode layoutNode) {
        final h j = this.J;
        int n = 0;
        j.h(layoutNode, false);
        final e v = layoutNode.v();
        final int h = v.h;
        if (h > 0) {
            final T[] f = v.f;
            do {
                this.F((LayoutNode)f[n]);
            } while (++n < h);
        }
    }
    
    public final boolean H(final MotionEvent motionEvent) {
        final float x = motionEvent.getX();
        final float y = motionEvent.getY();
        boolean b = true;
        if (0.0f > x || x > ((View)this).getWidth() || (0.0f > y || y > ((View)this).getHeight())) {
            b = false;
        }
        return b;
    }
    
    public final boolean I(final MotionEvent motionEvent) {
        final int pointerCount = motionEvent.getPointerCount();
        final boolean b = true;
        if (pointerCount != 1) {
            return true;
        }
        final MotionEvent k0 = this.k0;
        boolean b2 = b;
        if (k0 != null) {
            final boolean b3 = motionEvent.getRawX() == k0.getRawX();
            b2 = b;
            if (b3) {
                b2 = (motionEvent.getRawY() != k0.getRawY() && b);
            }
        }
        return b2;
    }
    
    public final void J(final e2.l l, final boolean b) {
        ah2.f.f((Object)l, "layer");
        if (!b) {
            if (!this.v) {
                if (!this.t.remove(l)) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            }
        }
        else if (!this.v) {
            this.t.add(l);
        }
        else {
            ArrayList u;
            if ((u = this.u) == null) {
                u = new ArrayList();
                this.u = u;
            }
            u.add(l);
        }
    }
    
    public final void K() {
        if (!this.Q) {
            final long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            if (currentAnimationTimeMillis != this.P) {
                this.P = currentAnimationTimeMillis;
                this.s0.a((View)this, this.N);
                a80.a.c0(this.N, this.O);
                ViewParent viewParent;
                Object o;
                for (viewParent = ((View)this).getParent(), o = this; viewParent instanceof ViewGroup; viewParent = ((View)o).getParent()) {
                    o = viewParent;
                }
                ((View)o).getLocationOnScreen(this.M);
                final int[] m = this.M;
                final float n = (float)m[0];
                final float n2 = (float)m[1];
                ((View)o).getLocationInWindow(m);
                final int[] i = this.M;
                this.R = yd.a.y0(n - i[0], n2 - i[1]);
            }
        }
    }
    
    public final void L(final e2.l l) {
        ah2.f.f((Object)l, "layer");
        if (this.G != null) {
            final zg2.p<View, Matrix, pg2.j> r = ViewLayer.r;
        }
        final c1 m0 = this.m0;
        Reference poll;
        do {
            poll = ((ReferenceQueue)m0.g).poll();
            if (poll != null) {
                ((e)m0.f).l(poll);
            }
        } while (poll != null);
        ((e)m0.f).b(new WeakReference(l, (ReferenceQueue<? super Object>)m0.g));
    }
    
    public final void M(LayoutNode s) {
        if (!((View)this).isLayoutRequested() && ((View)this).isAttachedToWindow()) {
            if (this.I && s != null) {
                while (s != null && s.D == LayoutNode$UsageByParent.InMeasureBlock) {
                    s = s.s();
                }
                if (s == this.getRoot()) {
                    ((View)this).requestLayout();
                    return;
                }
            }
            if (((View)this).getWidth() != 0 && ((View)this).getHeight() != 0) {
                ((View)this).invalidate();
            }
            else {
                ((View)this).requestLayout();
            }
        }
    }
    
    public final int N(final MotionEvent motionEvent) {
        final z1.q a = this.w.a(motionEvent, this);
        final int n = 0;
        boolean b = false;
        if (a != null) {
            final List<r> a2 = a.a;
            final ListIterator<r> listIterator = a2.listIterator(a2.size());
            while (true) {
                while (listIterator.hasPrevious()) {
                    final r previous = listIterator.previous();
                    if (previous.e) {
                        final r r = previous;
                        if (r != null) {
                            this.f = r.d;
                        }
                        final int a3 = this.x.a(a, this, this.H(motionEvent));
                        final int actionMasked = motionEvent.getActionMasked();
                        if (actionMasked == 0 || actionMasked == 5) {
                            if ((a3 & 0x1) != 0x0) {
                                b = true;
                            }
                            if (!b) {
                                final g w = this.w;
                                final int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                                w.c.delete(pointerId);
                                w.b.delete(pointerId);
                            }
                        }
                        return a3;
                    }
                }
                final r previous = null;
                continue;
            }
        }
        final z1.s x = this.x;
        x.c.a.clear();
        final c1 b2 = x.b;
        ((z1.j)b2.g).c();
        ((z1.j)b2.g).a.e();
        return n;
    }
    
    public final void O(MotionEvent obtain, final int n, final long n2, final boolean b) {
        final int actionMasked = obtain.getActionMasked();
        int actionIndex = 0;
        Label_0052: {
            if (actionMasked != 1) {
                if (actionMasked == 6) {
                    actionIndex = obtain.getActionIndex();
                    break Label_0052;
                }
            }
            else if (n != 9 && n != 10) {
                actionIndex = 0;
                break Label_0052;
            }
            actionIndex = -1;
        }
        final int pointerCount = obtain.getPointerCount();
        int n3;
        if (actionIndex >= 0) {
            n3 = 1;
        }
        else {
            n3 = 0;
        }
        final int n4 = pointerCount - n3;
        if (n4 == 0) {
            return;
        }
        final MotionEvent$PointerProperties[] array = new MotionEvent$PointerProperties[n4];
        for (int i = 0; i < n4; ++i) {
            array[i] = new MotionEvent$PointerProperties();
        }
        final MotionEvent$PointerCoords[] array2 = new MotionEvent$PointerCoords[n4];
        for (int j = 0; j < n4; ++j) {
            array2[j] = new MotionEvent$PointerCoords();
        }
        for (int k = 0; k < n4; ++k) {
            int n5;
            if (actionIndex >= 0 && k >= actionIndex) {
                n5 = 1;
            }
            else {
                n5 = 0;
            }
            final int n6 = n5 + k;
            obtain.getPointerProperties(n6, array[k]);
            final MotionEvent$PointerCoords motionEvent$PointerCoords = array2[k];
            obtain.getPointerCoords(n6, motionEvent$PointerCoords);
            final long x = this.x(yd.a.y0(motionEvent$PointerCoords.x, motionEvent$PointerCoords.y));
            motionEvent$PointerCoords.x = n1.c.c(x);
            motionEvent$PointerCoords.y = n1.c.d(x);
        }
        int buttonState;
        if (b) {
            buttonState = 0;
        }
        else {
            buttonState = obtain.getButtonState();
        }
        long downTime;
        if (obtain.getDownTime() == obtain.getEventTime()) {
            downTime = n2;
        }
        else {
            downTime = obtain.getDownTime();
        }
        obtain = MotionEvent.obtain(downTime, n2, n, n4, array, array2, obtain.getMetaState(), buttonState, obtain.getXPrecision(), obtain.getYPrecision(), obtain.getDeviceId(), obtain.getEdgeFlags(), obtain.getSource(), obtain.getFlags());
        final g w = this.w;
        ah2.f.e((Object)obtain, "event");
        final z1.q a = w.a(obtain, this);
        ah2.f.c((Object)a);
        this.x.a(a, this, true);
        obtain.recycle();
    }
    
    public final void P() {
        ((View)this).getLocationOnScreen(this.M);
        final long l = this.L;
        final int c = u2.g.c;
        final int n = (int)(l >> 32);
        final int[] m = this.M;
        boolean b = false;
        if (n != m[0] || u2.g.b(l) != this.M[1]) {
            final int[] i = this.M;
            this.L = at1.a.h(i[0], i[1]);
            b = true;
        }
        this.J.a(b);
    }
    
    public final void a(final androidx.lifecycle.q q) {
        this.setShowLayoutBounds(AndroidComposeView.AndroidComposeView$a.a());
    }
    
    public final void autofill(final SparseArray<AutofillValue> sparseArray) {
        ah2.f.f((Object)sparseArray, "values");
        final int sdk_INT = Build$VERSION.SDK_INT;
        final int n = 0;
        if (sdk_INT >= 26) {
            final k1.a z = this.z;
            if (z != null) {
                for (int size = sparseArray.size(), i = n; i < size; ++i) {
                    final int key = sparseArray.keyAt(i);
                    final AutofillValue autofillValue = (AutofillValue)sparseArray.get(key);
                    final k1.e a = k1.e.a;
                    ah2.f.e((Object)autofillValue, "value");
                    if (a.d(autofillValue)) {
                        final k1.h b = z.b;
                        final String string = a.i(autofillValue).toString();
                        b.getClass();
                        ah2.f.f((Object)string, "value");
                        final k1.g g = b.a.get(key);
                        if (g != null) {
                            final l<String, pg2.j> c = g.c;
                            if (c != null) {
                                c.invoke((Object)string);
                                final pg2.j a2 = pg2.j.a;
                            }
                        }
                    }
                    else {
                        if (a.b(autofillValue)) {
                            throw new NotImplementedError("An operation is not implemented: b/138604541: Add onFill() callback for date");
                        }
                        if (a.c(autofillValue)) {
                            throw new NotImplementedError("An operation is not implemented: b/138604541: Add onFill() callback for list");
                        }
                        if (a.e(autofillValue)) {
                            throw new NotImplementedError("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                        }
                    }
                }
            }
        }
    }
    
    public final boolean canScrollHorizontally(final int n) {
        return this.r.b(n, this.f, false);
    }
    
    public final boolean canScrollVertically(final int n) {
        return this.r.b(n, this.f, true);
    }
    
    public final void d(final boolean b) {
        Trace.beginSection("AndroidOwner:measureAndLayout");
        Label_0018: {
            if (!b) {
                break Label_0018;
            }
            try {
                zg2.a r0 = this.r0;
                while (true) {
                    if (this.J.d(r0)) {
                        ((View)this).requestLayout();
                    }
                    this.J.a(false);
                    final pg2.j a = pg2.j.a;
                    return;
                    r0 = null;
                    continue;
                }
            }
            finally {
                Trace.endSection();
            }
        }
    }
    
    public final void dispatchDraw(final Canvas a) {
        ah2.f.f((Object)a, "canvas");
        if (!((View)this).isAttachedToWindow()) {
            E(this.getRoot());
        }
        this.d(true);
        this.v = true;
        final s n = this.n;
        final o1.b b = (o1.b)n.g;
        final Canvas a2 = b.a;
        b.getClass();
        b.a = a;
        this.getRoot().p((o1.p)n.g);
        ((o1.b)n.g).w(a2);
        if (true ^ this.t.isEmpty()) {
            for (int size = this.t.size(), i = 0; i < size; ++i) {
                ((e2.l)this.t.get(i)).i();
            }
        }
        if (ViewLayer.w) {
            final int save = a.save();
            a.clipRect(0.0f, 0.0f, 0.0f, 0.0f);
            super.dispatchDraw(a);
            a.restoreToCount(save);
        }
        this.t.clear();
        this.v = false;
        final ArrayList u = this.u;
        if (u != null) {
            this.t.addAll(u);
            u.clear();
        }
    }
    
    public final boolean dispatchGenericMotionEvent(final MotionEvent motionEvent) {
        ah2.f.f((Object)motionEvent, "event");
        final int actionMasked = motionEvent.getActionMasked();
        final boolean b = true;
        boolean b2;
        if (actionMasked == 8) {
            if (((InputEvent)motionEvent).isFromSource(4194304)) {
                final ViewConfiguration value = ViewConfiguration.get(((View)this).getContext());
                final float n = -motionEvent.getAxisValue(26);
                final Context context = ((View)this).getContext();
                final int sdk_INT = Build$VERSION.SDK_INT;
                float n2;
                if (sdk_INT >= 26) {
                    final Method a = k1.a;
                    n2 = k1.a.b(value);
                }
                else {
                    n2 = k1.a(value, context);
                }
                final Context context2 = ((View)this).getContext();
                float n3;
                if (sdk_INT >= 26) {
                    n3 = k1.a.a(value);
                }
                else {
                    n3 = k1.a(value, context2);
                }
                final b2.a a2 = new b2.a(n2 * n, n3 * n, motionEvent.getEventTime());
                final FocusModifier a3 = m1.e.a(this.j.a);
                if (a3 != null) {
                    final w1.b l = a3.l;
                    if (l != null) {
                        b2 = b;
                        if (l.b(a2)) {
                            return b2;
                        }
                        if (l.a(a2)) {
                            b2 = b;
                            return b2;
                        }
                    }
                }
            }
            else {
                if (G(motionEvent) || !((View)this).isAttachedToWindow()) {
                    b2 = super.dispatchGenericMotionEvent(motionEvent);
                    return b2;
                }
                if ((this.D(motionEvent) & 0x1) != 0x0) {
                    b2 = b;
                    return b2;
                }
            }
            b2 = false;
        }
        else {
            b2 = super.dispatchGenericMotionEvent(motionEvent);
        }
        return b2;
    }
    
    public final boolean dispatchHoverEvent(final MotionEvent motionEvent) {
        ah2.f.f((Object)motionEvent, "event");
        if (this.q0) {
            ((View)this).removeCallbacks((Runnable)this.p0);
            this.p0.run();
        }
        final boolean g = G(motionEvent);
        final boolean b = false;
        final boolean b2 = false;
        boolean b3 = b;
        if (!g) {
            if (!((View)this).isAttachedToWindow()) {
                b3 = b;
            }
            else {
                if (((InputEvent)motionEvent).isFromSource(4098) && motionEvent.getToolType(0) == 1) {
                    final AndroidComposeViewAccessibilityDelegateCompat r = this.r;
                    r.getClass();
                    boolean b4;
                    if (!r.j()) {
                        b4 = b2;
                    }
                    else {
                        final int action = motionEvent.getAction();
                        Label_0460: {
                            if (action != 7 && action != 9) {
                                if (action != 10) {
                                    b4 = b2;
                                }
                                else {
                                    if (r.c != Integer.MIN_VALUE) {
                                        r.A(Integer.MIN_VALUE);
                                        break Label_0460;
                                    }
                                    b4 = ((View)r.b.getAndroidViewsHandler$ui_release()).dispatchGenericMotionEvent(motionEvent);
                                }
                            }
                            else {
                                final float x = motionEvent.getX();
                                final float y = motionEvent.getY();
                                final AndroidComposeView b5 = r.b;
                                final h2.k k = null;
                                b5.d(true);
                                final e2.b b6 = new e2.b();
                                final LayoutNode root = r.b.getRoot();
                                final long y2 = yd.a.y0(x, y);
                                final LayoutNode$b y3 = LayoutNode.Y;
                                root.getClass();
                                root.I.k.c1((LayoutNodeWrapper$c)LayoutNodeWrapper.F, root.I.k.U0(y2), b6, true, true);
                                final h2.k i = (h2.k)CollectionsKt___CollectionsKt.C1((List)b6);
                                h2.k x2 = k;
                                if (i != null) {
                                    final LayoutNode j = i.f.j;
                                    x2 = k;
                                    if (j != null) {
                                        x2 = u1.X(j);
                                    }
                                }
                                int p = 0;
                                Label_0428: {
                                    if (x2 != null) {
                                        final SemanticsNode semanticsNode = new SemanticsNode(x2, false);
                                        final LayoutNodeWrapper c = semanticsNode.c();
                                        if (!semanticsNode.e.b(SemanticsProperties.l) && !c.f1() && r.b.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(x2.f.j) == null) {
                                            p = r.p(((h2.l)x2.g).getId());
                                            break Label_0428;
                                        }
                                    }
                                    p = Integer.MIN_VALUE;
                                }
                                b4 = ((View)r.b.getAndroidViewsHandler$ui_release()).dispatchGenericMotionEvent(motionEvent);
                                r.A(p);
                                if (p != Integer.MIN_VALUE) {
                                    break Label_0460;
                                }
                            }
                            return b4;
                        }
                        b4 = true;
                    }
                    return b4;
                }
                final int actionMasked = motionEvent.getActionMasked();
                if (actionMasked != 7) {
                    if (actionMasked == 10) {
                        if (this.H(motionEvent)) {
                            if (motionEvent.getToolType(0) != 3) {
                                final MotionEvent k2 = this.k0;
                                if (k2 != null) {
                                    k2.recycle();
                                }
                                this.k0 = MotionEvent.obtainNoHistory(motionEvent);
                                this.q0 = true;
                                ((View)this).post((Runnable)this.p0);
                                return false;
                            }
                            if (motionEvent.getButtonState() != 0) {
                                return false;
                            }
                        }
                    }
                }
                else if (!this.I(motionEvent)) {
                    return false;
                }
                b3 = b;
                if ((this.D(motionEvent) & 0x1) != 0x0) {
                    b3 = true;
                }
            }
        }
        return b3;
    }
    
    public final boolean dispatchKeyEvent(final KeyEvent keyEvent) {
        ah2.f.f((Object)keyEvent, "event");
        if (((View)this).isFocused()) {
            final d l = this.l;
            l.getClass();
            final FocusModifier h = l.h;
            if (h != null) {
                final FocusModifier b = m1.r.b(h);
                if (b != null) {
                    final LayoutNodeWrapper q = b.q;
                    final d d = null;
                    final d d2 = null;
                    final d d3 = null;
                    d s = d2;
                    if (q != null) {
                        final LayoutNode j = q.j;
                        if (j == null) {
                            s = d2;
                        }
                        else {
                            final e t = b.t;
                            final int h2 = t.h;
                            s = d;
                            if (h2 > 0) {
                                int n = 0;
                                final T[] f = t.f;
                                d d4 = d3;
                                int n2;
                                d d6;
                                do {
                                    final d d5 = (d)f[n];
                                    d6 = d4;
                                    Label_0206: {
                                        if (ah2.f.a((Object)d5.j, (Object)j)) {
                                            if (d4 != null) {
                                                final LayoutNode i = d5.j;
                                                d d7 = d4;
                                                d k;
                                                do {
                                                    d6 = d4;
                                                    if (ah2.f.a((Object)d7, (Object)d5)) {
                                                        break Label_0206;
                                                    }
                                                    k = d7.i;
                                                    if (k == null) {
                                                        break;
                                                    }
                                                    d7 = k;
                                                } while (ah2.f.a((Object)k.j, (Object)i));
                                            }
                                            d6 = d5;
                                        }
                                    }
                                    n2 = n + 1;
                                    d4 = d6;
                                } while ((n = n2) < h2);
                                s = d6;
                            }
                            if (s == null) {
                                s = b.s;
                            }
                        }
                    }
                    if (s != null) {
                        return s.b(keyEvent) || s.a(keyEvent);
                    }
                }
            }
            throw new IllegalStateException("KeyEvent can't be processed because this key input node is not active.".toString());
        }
        return super.dispatchKeyEvent(keyEvent);
    }
    
    public final boolean dispatchTouchEvent(final MotionEvent motionEvent) {
        ah2.f.f((Object)motionEvent, "motionEvent");
        final boolean q0 = this.q0;
        boolean b = true;
        if (q0) {
            ((View)this).removeCallbacks((Runnable)this.p0);
            final MotionEvent k0 = this.k0;
            ah2.f.c((Object)k0);
            if (motionEvent.getActionMasked() == 0 && (k0.getSource() == motionEvent.getSource() && k0.getToolType(0) == motionEvent.getToolType(0))) {
                this.q0 = false;
            }
            else {
                this.p0.run();
            }
        }
        if (G(motionEvent) || !((View)this).isAttachedToWindow()) {
            return false;
        }
        if (motionEvent.getActionMasked() == 2 && !this.I(motionEvent)) {
            return false;
        }
        final int d = this.D(motionEvent);
        if ((d & 0x2) != 0x0) {
            ((View)this).getParent().requestDisallowInterceptTouchEvent(true);
        }
        if ((d & 0x1) == 0x0) {
            b = false;
        }
        return b;
    }
    
    public final void e(final m$a m$a) {
        ah2.f.f((Object)m$a, "listener");
        final h j = this.J;
        j.getClass();
        j.e.b(m$a);
        this.M(null);
    }
    
    public final View findViewByAccessibilityIdTraversal(final int n) {
        while (true) {
            try {
                View c;
                if (Build$VERSION.SDK_INT >= 29) {
                    final Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
                    declaredMethod.setAccessible(true);
                    final Object invoke = declaredMethod.invoke(this, n);
                    if (invoke instanceof View) {
                        c = (View)invoke;
                    }
                    else {
                        c = null;
                    }
                }
                else {
                    c = C(n, (View)this);
                }
                return c;
            }
            catch (final NoSuchMethodException ex) {
                continue;
            }
            break;
        }
    }
    
    public j getAccessibilityManager() {
        return this.C;
    }
    
    public final b0 getAndroidViewsHandler$ui_release() {
        if (this.F == null) {
            final Context context = ((View)this).getContext();
            ah2.f.e((Object)context, "context");
            this.addView((View)(this.F = new b0(context)));
        }
        final b0 f = this.F;
        ah2.f.c((Object)f);
        return f;
    }
    
    public k1.c getAutofill() {
        return this.z;
    }
    
    public k1.h getAutofillTree() {
        return this.s;
    }
    
    public k getClipboardManager() {
        return this.B;
    }
    
    public final l<Configuration, pg2.j> getConfigurationChangeObserver() {
        return (l<Configuration, pg2.j>)this.y;
    }
    
    public u2.b getDensity() {
        return this.i;
    }
    
    public m1.d getFocusManager() {
        return (m1.d)this.j;
    }
    
    public final void getFocusedRect(final Rect rect) {
        ah2.f.f((Object)rect, "rect");
        final FocusModifier a = m1.e.a(this.j.a);
        pg2.j a2;
        if (a != null) {
            final n1.d d = m1.r.d(a);
            rect.left = at1.a.D1(d.a);
            rect.top = at1.a.D1(d.b);
            rect.right = at1.a.D1(d.c);
            rect.bottom = at1.a.D1(d.d);
            a2 = pg2.j.a;
        }
        else {
            a2 = null;
        }
        if (a2 == null) {
            super.getFocusedRect(rect);
        }
    }
    
    public n2.g.a getFontFamilyResolver() {
        return ((SnapshotMutableStateImpl<n2.g.a>)this.e0).getValue();
    }
    
    public n2.f.a getFontLoader() {
        return this.d0;
    }
    
    public u1.a getHapticFeedBack() {
        return this.h0;
    }
    
    public boolean getHasPendingMeasureOrLayout() {
        return ((AbstractCollection)this.J.b.b).isEmpty() ^ true;
    }
    
    public v1.b getInputModeManager() {
        return this.i0;
    }
    
    public final long getLastMatrixRecalculationAnimationTime$ui_release() {
        return this.P;
    }
    
    public LayoutDirection getLayoutDirection() {
        return ((SnapshotMutableStateImpl<LayoutDirection>)this.g0).getValue();
    }
    
    public long getMeasureIteration() {
        final h j = this.J;
        if (j.c) {
            return j.f;
        }
        throw new IllegalArgumentException("measureIteration should be only used during the measure/layout pass".toString());
    }
    
    public z1.m getPointerIconService() {
        return (z1.m)this.u0;
    }
    
    public LayoutNode getRoot() {
        return this.o;
    }
    
    public q getRootForTest() {
        return (q)this.p;
    }
    
    public h2.n getSemanticsOwner() {
        return this.q;
    }
    
    public f getSharedDrawScope() {
        return this.h;
    }
    
    public boolean getShowLayoutBounds() {
        return this.E;
    }
    
    public OwnerSnapshotObserver getSnapshotObserver() {
        return this.D;
    }
    
    public u getTextInputService() {
        return this.c0;
    }
    
    public d1 getTextToolbar() {
        return (d1)this.j0;
    }
    
    public View getView() {
        return (View)this;
    }
    
    public androidx.compose.ui.platform.k1 getViewConfiguration() {
        return (androidx.compose.ui.platform.k1)this.K;
    }
    
    public final AndroidComposeView.AndroidComposeView$b getViewTreeOwners() {
        return ((SnapshotMutableStateImpl<AndroidComposeView.AndroidComposeView$b>)this.T).getValue();
    }
    
    public p1 getWindowInfo() {
        return (p1)this.k;
    }
    
    public final long i(final long n) {
        this.K();
        return aj2.c.p0(this.O, yd.a.y0(n1.c.c(n) - n1.c.c(this.R), n1.c.d(n) - n1.c.d(this.R)));
    }
    
    public final void j(final LayoutNode layoutNode, final long n) {
        ah2.f.f((Object)layoutNode, "layoutNode");
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            this.J.e(layoutNode, n);
            this.J.a(false);
            final pg2.j a = pg2.j.a;
        }
        finally {
            Trace.endSection();
        }
    }
    
    public final long k(final long n) {
        this.K();
        return aj2.c.p0(this.O, n);
    }
    
    public final void l() {
        if (this.A) {
            this.getSnapshotObserver().a();
            this.A = false;
        }
        final b0 f = this.F;
        if (f != null) {
            A((ViewGroup)f);
        }
        while (this.n0.k()) {
            final int h = this.n0.h;
            for (int i = 0; i < h; ++i) {
                final zg2.a<pg2.j>[] f2 = this.n0.f;
                final zg2.a a = f2[i];
                f2[i] = null;
                if (a != null) {
                    a.invoke();
                }
            }
            final e<zg2.a<pg2.j>> n0 = this.n0;
            if (h > 0) {
                final int h2 = n0.h;
                if (h < h2) {
                    final zg2.a<pg2.j>[] f3 = n0.f;
                    qg2.j.j1((Object[])f3, 0, (Object[])f3, h, h2);
                }
                final int h3 = n0.h;
                final int h4 = h3 - (h + 0);
                final int n2 = h3 - 1;
                if (h4 <= n2) {
                    int n3 = h4;
                    while (true) {
                        n0.f[n3] = null;
                        if (n3 == n2) {
                            break;
                        }
                        ++n3;
                    }
                }
                n0.h = h4;
            }
            else {
                n0.getClass();
            }
        }
    }
    
    public final long n(final long n) {
        this.K();
        return aj2.c.p0(this.N, n);
    }
    
    public final e2.l o(final zg2.a a, final l l) {
        ah2.f.f((Object)l, "drawBlock");
        ah2.f.f((Object)a, "invalidateParentLayer");
        final c1 m0 = this.m0;
        Reference poll;
        do {
            poll = ((ReferenceQueue)m0.g).poll();
            if (poll != null) {
                ((e)m0.f).l(poll);
            }
        } while (poll != null);
        while (true) {
            while (((e)m0.f).k()) {
                final e e = (e)m0.f;
                final Object value = e.n(e.h - 1).get();
                if (value != null) {
                    final e2.l i = (e2.l)value;
                    if (i != null) {
                        i.b(a, l);
                        return i;
                    }
                    if (((View)this).isHardwareAccelerated() && this.S) {
                        try {
                            return (e2.l)new RenderNodeLayer(this, (l<? super o1.p, pg2.j>)l, (zg2.a<pg2.j>)a);
                        }
                        finally {
                            this.S = false;
                        }
                    }
                    if (this.G == null) {
                        if (!ViewLayer.v) {
                            ViewLayer$b.a(new View(((View)this).getContext()));
                        }
                        l0 g;
                        if (ViewLayer.w) {
                            final Context context = ((View)this).getContext();
                            ah2.f.e((Object)context, "context");
                            g = new l0(context);
                        }
                        else {
                            final Context context2 = ((View)this).getContext();
                            ah2.f.e((Object)context2, "context");
                            g = new l1(context2);
                        }
                        this.addView((View)(this.G = g));
                    }
                    final l0 g2 = this.G;
                    ah2.f.c((Object)g2);
                    return (e2.l)new ViewLayer(this, g2, (l<? super o1.p, pg2.j>)l, (zg2.a<pg2.j>)a);
                }
            }
            final Object value = null;
            continue;
        }
    }
    
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.F(this.getRoot());
        E(this.getRoot());
        final SnapshotStateObserver a = this.getSnapshotObserver().a;
        a.e = f$a.c(a.b);
        final int sdk_INT = Build$VERSION.SDK_INT;
        final boolean b = true;
        if (sdk_INT >= 26) {
            final k1.a z = this.z;
            if (z != null) {
                k1.f.a.a(z);
            }
        }
        final androidx.lifecycle.q t0 = at1.a.t0((View)this);
        final m5.d a2 = ViewTreeSavedStateRegistryOwner.a((View)this);
        final AndroidComposeView.AndroidComposeView$b viewTreeOwners = this.getViewTreeOwners();
        int n = b ? 1 : 0;
        Label_0139: {
            if (viewTreeOwners != null) {
                if (t0 != null && a2 != null) {
                    final androidx.lifecycle.q a3 = viewTreeOwners.a;
                    n = (b ? 1 : 0);
                    if (t0 != a3) {
                        break Label_0139;
                    }
                    if (a2 != a3) {
                        n = (b ? 1 : 0);
                        break Label_0139;
                    }
                }
                n = 0;
            }
        }
        if (n != 0) {
            if (t0 == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
            }
            if (a2 == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!");
            }
            if (viewTreeOwners != null) {
                final androidx.lifecycle.q a4 = viewTreeOwners.a;
                if (a4 != null) {
                    final Lifecycle lifecycle = a4.getLifecycle();
                    if (lifecycle != null) {
                        lifecycle.c((androidx.lifecycle.p)this);
                    }
                }
            }
            t0.getLifecycle().a((androidx.lifecycle.p)this);
            final AndroidComposeView.AndroidComposeView$b viewTreeOwners2 = new AndroidComposeView.AndroidComposeView$b(t0, a2);
            this.setViewTreeOwners(viewTreeOwners2);
            final l<? super AndroidComposeView.AndroidComposeView$b, pg2.j> u = this.U;
            if (u != null) {
                u.invoke((Object)viewTreeOwners2);
            }
            this.U = null;
        }
        final AndroidComposeView.AndroidComposeView$b viewTreeOwners3 = this.getViewTreeOwners();
        ah2.f.c((Object)viewTreeOwners3);
        viewTreeOwners3.a.getLifecycle().a((androidx.lifecycle.p)this);
        ((View)this).getViewTreeObserver().addOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)this.V);
        ((View)this).getViewTreeObserver().addOnScrollChangedListener((ViewTreeObserver$OnScrollChangedListener)this.W);
        ((View)this).getViewTreeObserver().addOnTouchModeChangeListener((ViewTreeObserver$OnTouchModeChangeListener)this.a0);
    }
    
    public final boolean onCheckIsTextEditor() {
        return this.b0.c;
    }
    
    public final void onConfigurationChanged(final Configuration configuration) {
        ah2.f.f((Object)configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        final Context context = ((View)this).getContext();
        ah2.f.e((Object)context, "context");
        this.i = mj2.c0.c(context);
        final int sdk_INT = Build$VERSION.SDK_INT;
        final int n = 0;
        int fontWeightAdjustment;
        if (sdk_INT >= 31) {
            fontWeightAdjustment = configuration.fontWeightAdjustment;
        }
        else {
            fontWeightAdjustment = 0;
        }
        if (fontWeightAdjustment != this.f0) {
            int fontWeightAdjustment2 = n;
            if (sdk_INT >= 31) {
                fontWeightAdjustment2 = configuration.fontWeightAdjustment;
            }
            this.f0 = fontWeightAdjustment2;
            final Context context2 = ((View)this).getContext();
            ah2.f.e((Object)context2, "context");
            this.setFontFamilyResolver(new androidx.compose.ui.text.font.c(new androidx.compose.ui.text.font.a(context2), n2.c.a(context2), 28));
        }
        this.y.invoke((Object)configuration);
    }
    
    public final InputConnection onCreateInputConnection(final EditorInfo editorInfo) {
        ah2.f.f((Object)editorInfo, "outAttrs");
        final TextInputServiceAndroid b0 = this.b0;
        b0.getClass();
        Object h;
        if (!b0.c) {
            h = null;
        }
        else {
            final o2.j g = b0.g;
            final TextFieldValue f = b0.f;
            ah2.f.f((Object)g, "imeOptions");
            ah2.f.f((Object)f, "textFieldValue");
            final int e = g.e;
            final int n = 1;
            int imeOptions = 0;
            Label_0282: {
                if (e == 1) {
                    if (!g.a) {
                        imeOptions = 0;
                        break Label_0282;
                    }
                }
                else {
                    if (e == 0) {
                        imeOptions = 1;
                        break Label_0282;
                    }
                    if (e == 2) {
                        imeOptions = 2;
                        break Label_0282;
                    }
                    if (e == 6) {
                        imeOptions = 5;
                        break Label_0282;
                    }
                    if (e == 5) {
                        imeOptions = 7;
                        break Label_0282;
                    }
                    if (e == 3) {
                        imeOptions = 3;
                        break Label_0282;
                    }
                    if (e == 4) {
                        imeOptions = 4;
                        break Label_0282;
                    }
                    if (e != 7) {
                        throw new IllegalStateException("invalid ImeAction".toString());
                    }
                }
                imeOptions = 6;
            }
            editorInfo.imeOptions = imeOptions;
            final int d = g.d;
            if (d == 1) {
                editorInfo.inputType = 1;
            }
            else if (d == 2) {
                editorInfo.inputType = 1;
                editorInfo.imeOptions = (imeOptions | Integer.MIN_VALUE);
            }
            else if (d == 3) {
                editorInfo.inputType = 2;
            }
            else if (d == 4) {
                editorInfo.inputType = 3;
            }
            else if (d == 5) {
                editorInfo.inputType = 17;
            }
            else if (d == 6) {
                editorInfo.inputType = 33;
            }
            else if (d == 7) {
                editorInfo.inputType = 129;
            }
            else if (d == 8) {
                editorInfo.inputType = 18;
            }
            else {
                if (d != 9) {
                    throw new IllegalStateException("Invalid Keyboard Type".toString());
                }
                editorInfo.inputType = 8194;
            }
            if (!g.a) {
                final int inputType = editorInfo.inputType;
                if ((inputType & 0x1) == 0x1) {
                    editorInfo.inputType = (inputType | 0x20000);
                    if (e == 1) {
                        editorInfo.imeOptions |= 0x40000000;
                    }
                }
            }
            final int inputType2 = editorInfo.inputType;
            if ((inputType2 & 0x1) == 0x1) {
                final int b2 = g.b;
                if (b2 == 1) {
                    editorInfo.inputType = (inputType2 | 0x1000);
                }
                else if (b2 == 2) {
                    editorInfo.inputType = (inputType2 | 0x2000);
                }
                else {
                    int n2;
                    if (b2 == 3) {
                        n2 = n;
                    }
                    else {
                        n2 = 0;
                    }
                    if (n2 != 0) {
                        editorInfo.inputType = (inputType2 | 0x4000);
                    }
                }
                if (g.c) {
                    editorInfo.inputType |= 0x8000;
                }
            }
            final long b3 = f.b;
            final int c = i2.o.c;
            editorInfo.initialSelStart = (int)(b3 >> 32);
            editorInfo.initialSelEnd = i2.o.c(b3);
            d4.a.c(editorInfo, (CharSequence)f.a.f);
            editorInfo.imeOptions |= 0x2000000;
            h = new o2.q(b0.f, new o2.v(b0), b0.g.c);
            b0.h = (o2.q)h;
        }
        return (InputConnection)h;
    }
    
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        final OwnerSnapshotObserver snapshotObserver = this.getSnapshotObserver();
        final i1.e e = snapshotObserver.a.e;
        if (e != null) {
            e.dispose();
        }
        snapshotObserver.a.a();
        final AndroidComposeView.AndroidComposeView$b viewTreeOwners = this.getViewTreeOwners();
        if (viewTreeOwners != null) {
            final androidx.lifecycle.q a = viewTreeOwners.a;
            if (a != null) {
                final Lifecycle lifecycle = a.getLifecycle();
                if (lifecycle != null) {
                    lifecycle.c((androidx.lifecycle.p)this);
                }
            }
        }
        if (Build$VERSION.SDK_INT >= 26) {
            final k1.a z = this.z;
            if (z != null) {
                k1.f.a.b(z);
            }
        }
        ((View)this).getViewTreeObserver().removeOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)this.V);
        ((View)this).getViewTreeObserver().removeOnScrollChangedListener((ViewTreeObserver$OnScrollChangedListener)this.W);
        ((View)this).getViewTreeObserver().removeOnTouchModeChangeListener((ViewTreeObserver$OnTouchModeChangeListener)this.a0);
    }
    
    public final void onDraw(final Canvas canvas) {
        ah2.f.f((Object)canvas, "canvas");
    }
    
    public final void onFocusChanged(final boolean b, final int n, final Rect rect) {
        super.onFocusChanged(b, n, rect);
        final StringBuilder sb = new StringBuilder();
        sb.append("Owner FocusChanged(");
        sb.append(b);
        sb.append(')');
        Log.d("Compose Focus", sb.toString());
        final FocusManagerImpl j = this.j;
        if (b) {
            final FocusModifier a = j.a;
            if (a.i == FocusStateImpl.Inactive) {
                a.b(FocusStateImpl.Active);
            }
        }
        else {
            m1.q.c(j.a, true);
        }
    }
    
    public final void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        this.H = null;
        this.P();
        if (this.F != null) {
            ((View)this.getAndroidViewsHandler$ui_release()).layout(0, 0, n3 - n, n4 - n2);
        }
    }
    
    public final void onMeasure(int intValue, final int n) {
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!((View)this).isAttachedToWindow()) {
                this.F(this.getRoot());
            }
            final Pair b = B(intValue);
            final int intValue2 = ((Number)b.component1()).intValue();
            intValue = ((Number)b.component2()).intValue();
            final Pair b2 = B(n);
            final long a = mj2.c0.a(intValue2, intValue, ((Number)b2.component1()).intValue(), ((Number)b2.component2()).intValue());
            final a h = this.H;
            if (h == null) {
                this.H = new a(a);
                this.I = false;
            }
            else if (!u2.a.b(h.a, a)) {
                this.I = true;
            }
            this.J.i(a);
            this.J.d((zg2.a)this.r0);
            ((View)this).setMeasuredDimension(((c2.e0)this.getRoot().I).f, ((c2.e0)this.getRoot().I).g);
            if (this.F != null) {
                ((View)this.getAndroidViewsHandler$ui_release()).measure(View$MeasureSpec.makeMeasureSpec(((c2.e0)this.getRoot().I).f, 1073741824), View$MeasureSpec.makeMeasureSpec(((c2.e0)this.getRoot().I).g, 1073741824));
            }
            final pg2.j a2 = pg2.j.a;
        }
        finally {
            Trace.endSection();
        }
    }
    
    public final void onProvideAutofillVirtualStructure(final ViewStructure viewStructure, int a) {
        if (Build$VERSION.SDK_INT >= 26) {
            a = 1;
        }
        else {
            a = 0;
        }
        if (a != 0 && viewStructure != null) {
            final k1.a z = this.z;
            if (z != null) {
                a = k1.d.a.a(viewStructure, z.b.a.size());
                for (final Map.Entry<Number, V> entry : z.b.a.entrySet()) {
                    final int intValue = entry.getKey().intValue();
                    final k1.g g = (k1.g)entry.getValue();
                    final k1.d a2 = k1.d.a;
                    final ViewStructure b = a2.b(viewStructure, a);
                    if (b != null) {
                        final k1.e a3 = k1.e.a;
                        final AutofillId a4 = a3.a(viewStructure);
                        ah2.f.c((Object)a4);
                        a3.g(b, a4, intValue);
                        a2.d(b, intValue, z.a.getContext().getPackageName(), null, null);
                        a3.h(b, 1);
                        final List<AutofillType> a5 = g.a;
                        final ArrayList list = new ArrayList<String>(a5.size());
                        for (int size = a5.size(), i = 0; i < size; ++i) {
                            final AutofillType autofillType = a5.get(i);
                            final HashMap<AutofillType, String> a6 = k1.b.a;
                            ah2.f.f((Object)autofillType, "<this>");
                            final String s = k1.b.a.get(autofillType);
                            if (s == null) {
                                throw new IllegalArgumentException("Unsupported autofill type".toString());
                            }
                            list.add(s);
                        }
                        final String[] array = list.toArray(new String[0]);
                        if (array == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                        }
                        a3.f(b, array);
                        if (g.b == null) {
                            Log.w("Autofill Warning", "Bounding box not set.\n                        Did you call perform autofillTree before the component was positioned? ");
                        }
                        final n1.d b2 = g.b;
                        if (b2 != null) {
                            final Rect s2 = u1.s1(b2);
                            k1.d.a.c(b, s2.left, s2.top, 0, 0, s2.width(), s2.height());
                        }
                    }
                    ++a;
                }
            }
        }
    }
    
    public final void onRtlPropertiesChanged(final int n) {
        if (this.g) {
            final l a = AndroidComposeView_androidKt.a;
            LayoutDirection layoutDirection;
            if (n != 0) {
                if (n != 1) {
                    layoutDirection = LayoutDirection.Ltr;
                }
                else {
                    layoutDirection = LayoutDirection.Rtl;
                }
            }
            else {
                layoutDirection = LayoutDirection.Ltr;
            }
            this.setLayoutDirection(layoutDirection);
            final FocusManagerImpl j = this.j;
            j.getClass();
            ah2.f.f((Object)layoutDirection, "<set-?>");
            j.c = layoutDirection;
        }
    }
    
    public final void onWindowFocusChanged(final boolean b) {
        ((SnapshotMutableStateImpl<Boolean>)this.k.a).setValue(Boolean.valueOf(b));
        super.onWindowFocusChanged(b);
        if (b) {
            final boolean a = AndroidComposeView.AndroidComposeView$a.a();
            if (this.getShowLayoutBounds() != a) {
                this.setShowLayoutBounds(a);
                E(this.getRoot());
            }
        }
    }
    
    public final void p(final LayoutNode layoutNode) {
        ah2.f.f((Object)layoutNode, "layoutNode");
        final AndroidComposeViewAccessibilityDelegateCompat r = this.r;
        r.getClass();
        r.n = true;
        if (r.j()) {
            r.k(layoutNode);
        }
    }
    
    public final void q(final LayoutNode layoutNode) {
        ah2.f.f((Object)layoutNode, "layoutNode");
        this.J.c(layoutNode);
    }
    
    public final void r(final LayoutNode layoutNode, final boolean b) {
        ah2.f.f((Object)layoutNode, "layoutNode");
        if (this.J.g(layoutNode, b)) {
            this.M(null);
        }
    }
    
    public final void s(final LayoutNode layoutNode) {
        ah2.f.f((Object)layoutNode, "node");
    }
    
    public final void setConfigurationChangeObserver(final l<? super Configuration, pg2.j> y) {
        ah2.f.f((Object)y, "<set-?>");
        this.y = y;
    }
    
    public final void setLastMatrixRecalculationAnimationTime$ui_release(final long p) {
        this.P = p;
    }
    
    public final void setOnViewTreeOwnersAvailable(final l<? super AndroidComposeView.AndroidComposeView$b, pg2.j> u) {
        ah2.f.f((Object)u, "callback");
        final AndroidComposeView.AndroidComposeView$b viewTreeOwners = this.getViewTreeOwners();
        if (viewTreeOwners != null) {
            u.invoke((Object)viewTreeOwners);
        }
        if (!((View)this).isAttachedToWindow()) {
            this.U = u;
        }
    }
    
    public void setShowLayoutBounds(final boolean e) {
        this.E = e;
    }
    
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
    
    public final void v(final zg2.a<pg2.j> a) {
        if (!this.n0.f(a)) {
            this.n0.b(a);
        }
    }
    
    public final void w(final LayoutNode layoutNode) {
        ah2.f.f((Object)layoutNode, "node");
        final h j = this.J;
        j.getClass();
        j.b.b(layoutNode);
        this.A = true;
    }
    
    public final long x(long p) {
        this.K();
        p = aj2.c.p0(this.N, p);
        return yd.a.y0(n1.c.c(this.R) + n1.c.c(p), n1.c.d(this.R) + n1.c.d(p));
    }
    
    public final void y() {
        final AndroidComposeViewAccessibilityDelegateCompat r = this.r;
        r.n = true;
        if (r.j() && !r.t) {
            r.t = true;
            r.e.post((Runnable)r.u);
        }
    }
    
    public final void z(final LayoutNode layoutNode, final boolean b) {
        ah2.f.f((Object)layoutNode, "layoutNode");
        if (this.J.h(layoutNode, b)) {
            this.M(layoutNode);
        }
    }
}
