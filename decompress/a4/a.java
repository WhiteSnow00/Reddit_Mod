// 
// Decompiled by Procyon v0.6.0
// 

package a4;

import android.os.BaseBundle;
import java.util.WeakHashMap;
import java.util.ArrayList;
import android.os.Build$VERSION;
import android.view.accessibility.AccessibilityNodeInfo;
import android.util.Log;
import b4.g$a;
import android.os.Bundle;
import android.view.ViewGroup;
import b4.c;
import android.view.accessibility.AccessibilityNodeProvider;
import b4.d;
import android.view.accessibility.AccessibilityEvent;
import java.lang.ref.WeakReference;
import android.util.SparseArray;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import java.util.Collections;
import b4.c$a;
import java.util.List;
import android.view.View;
import android.view.View$AccessibilityDelegate;

public class a
{
    private static final View$AccessibilityDelegate DEFAULT_DELEGATE;
    private final View$AccessibilityDelegate mBridge;
    private final View$AccessibilityDelegate mOriginalDelegate;
    
    static {
        DEFAULT_DELEGATE = new View$AccessibilityDelegate();
    }
    
    public a() {
        this(a.DEFAULT_DELEGATE);
    }
    
    public a(final View$AccessibilityDelegate mOriginalDelegate) {
        this.mOriginalDelegate = mOriginalDelegate;
        this.mBridge = new a(this);
    }
    
    public static List<c$a> getActionList(final View view) {
        List<Object> emptyList;
        if ((emptyList = (List)view.getTag(2131431621)) == null) {
            emptyList = Collections.emptyList();
        }
        return (List<c$a>)emptyList;
    }
    
    private boolean isSpanStillValid(final ClickableSpan clickableSpan, final View view) {
        if (clickableSpan != null) {
            final CharSequence text = view.createAccessibilityNodeInfo().getText();
            ClickableSpan[] array;
            if (text instanceof Spanned) {
                array = (ClickableSpan[])((Spanned)text).getSpans(0, text.length(), (Class)ClickableSpan.class);
            }
            else {
                array = null;
            }
            for (int n = 0; array != null && n < array.length; ++n) {
                if (clickableSpan.equals(array[n])) {
                    return true;
                }
            }
        }
        return false;
    }
    
    private boolean performClickableSpanAction(final int n, final View view) {
        final SparseArray sparseArray = (SparseArray)view.getTag(2131431622);
        if (sparseArray != null) {
            final WeakReference weakReference = (WeakReference)sparseArray.get(n);
            if (weakReference != null) {
                final ClickableSpan clickableSpan = (ClickableSpan)weakReference.get();
                if (this.isSpanStillValid(clickableSpan, view)) {
                    clickableSpan.onClick(view);
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean dispatchPopulateAccessibilityEvent(final View view, final AccessibilityEvent accessibilityEvent) {
        return this.mOriginalDelegate.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }
    
    public d getAccessibilityNodeProvider(final View view) {
        final AccessibilityNodeProvider a = b.a(this.mOriginalDelegate, view);
        if (a != null) {
            return new d(a);
        }
        return null;
    }
    
    public View$AccessibilityDelegate getBridge() {
        return this.mBridge;
    }
    
    public void onInitializeAccessibilityEvent(final View view, final AccessibilityEvent accessibilityEvent) {
        this.mOriginalDelegate.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }
    
    public void onInitializeAccessibilityNodeInfo(final View view, final c c) {
        this.mOriginalDelegate.onInitializeAccessibilityNodeInfo(view, c.a);
    }
    
    public void onPopulateAccessibilityEvent(final View view, final AccessibilityEvent accessibilityEvent) {
        this.mOriginalDelegate.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }
    
    public boolean onRequestSendAccessibilityEvent(final ViewGroup viewGroup, final View view, final AccessibilityEvent accessibilityEvent) {
        return this.mOriginalDelegate.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }
    
    public boolean performAccessibilityAction(final View view, final int n, final Bundle bundle) {
        final List<c$a> actionList = getActionList(view);
        final boolean b = false;
        int n2 = 0;
        boolean a;
        while (true) {
            a = b;
            if (n2 >= actionList.size()) {
                break;
            }
            final c$a c$a = actionList.get(n2);
            if (c$a.a() == n) {
                a = b;
                if (c$a.d != null) {
                    final Class c = c$a.c;
                    if (c != null) {
                        try {
                            c.getDeclaredConstructor((Class[])new Class[0]).newInstance(new Object[0]).getClass();
                        }
                        catch (final Exception ex) {
                            final Class c2 = c$a.c;
                            String name;
                            if (c2 == null) {
                                name = "null";
                            }
                            else {
                                name = c2.getName();
                            }
                            final StringBuilder sb = new StringBuilder();
                            sb.append("Failed to execute command with argument class ViewCommandArgument: ");
                            sb.append(name);
                            Log.e("A11yActionCompat", sb.toString(), (Throwable)ex);
                        }
                    }
                    a = c$a.d.a(view);
                    break;
                }
                break;
            }
            else {
                ++n2;
            }
        }
        boolean b2 = a;
        if (!a) {
            b2 = a4.a.b.b(this.mOriginalDelegate, view, n, bundle);
        }
        boolean performClickableSpanAction = b2;
        if (!b2) {
            performClickableSpanAction = b2;
            if (n == 2131427358) {
                performClickableSpanAction = b2;
                if (bundle != null) {
                    performClickableSpanAction = this.performClickableSpanAction(((BaseBundle)bundle).getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), view);
                }
            }
        }
        return performClickableSpanAction;
    }
    
    public void sendAccessibilityEvent(final View view, final int n) {
        this.mOriginalDelegate.sendAccessibilityEvent(view, n);
    }
    
    public void sendAccessibilityEventUnchecked(final View view, final AccessibilityEvent accessibilityEvent) {
        this.mOriginalDelegate.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
    
    public static final class a extends View$AccessibilityDelegate
    {
        public final a4.a a;
        
        public a(final a4.a a) {
            this.a = a;
        }
        
        public final boolean dispatchPopulateAccessibilityEvent(final View view, final AccessibilityEvent accessibilityEvent) {
            return this.a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }
        
        public final AccessibilityNodeProvider getAccessibilityNodeProvider(final View view) {
            final d accessibilityNodeProvider = this.a.getAccessibilityNodeProvider(view);
            AccessibilityNodeProvider accessibilityNodeProvider2;
            if (accessibilityNodeProvider != null) {
                accessibilityNodeProvider2 = (AccessibilityNodeProvider)accessibilityNodeProvider.a;
            }
            else {
                accessibilityNodeProvider2 = null;
            }
            return accessibilityNodeProvider2;
        }
        
        public final void onInitializeAccessibilityEvent(final View view, final AccessibilityEvent accessibilityEvent) {
            this.a.onInitializeAccessibilityEvent(view, accessibilityEvent);
        }
        
        public final void onInitializeAccessibilityNodeInfo(final View view, final AccessibilityNodeInfo accessibilityNodeInfo) {
            final c c = new c(accessibilityNodeInfo);
            final WeakHashMap a = p0.a;
            final Boolean b = ((p0.b<Boolean>)new l0()).d(view);
            final boolean b2 = true;
            final boolean b3 = b != null && b;
            final int sdk_INT = Build$VERSION.SDK_INT;
            if (sdk_INT >= 28) {
                x0.c(accessibilityNodeInfo, b3);
            }
            else {
                c.l(1, b3);
            }
            final Boolean b4 = ((p0.b<Boolean>)new o0()).d(view);
            final boolean b5 = b4 != null && b4 && b2;
            if (sdk_INT >= 28) {
                r0.e(accessibilityNodeInfo, b5);
            }
            else {
                c.l(2, b5);
            }
            final CharSequence charSequence = ((p0.b<CharSequence>)new m0((Class)CharSequence.class)).d(view);
            if (sdk_INT >= 28) {
                y0.e(accessibilityNodeInfo, charSequence);
            }
            else {
                accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
            }
            c.v((CharSequence)((p0.b<CharSequence>)new n0((Class)CharSequence.class)).d(view));
            this.a.onInitializeAccessibilityNodeInfo(view, c);
            final CharSequence text = accessibilityNodeInfo.getText();
            if (sdk_INT < 26) {
                accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
                accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
                accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
                accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
                final SparseArray sparseArray = (SparseArray)view.getTag(2131431622);
                if (sparseArray != null) {
                    final ArrayList<Integer> list = new ArrayList<Integer>();
                    for (int i = 0; i < sparseArray.size(); ++i) {
                        if (((WeakReference)sparseArray.valueAt(i)).get() == null) {
                            list.add(i);
                        }
                    }
                    for (int j = 0; j < list.size(); ++j) {
                        sparseArray.remove((int)list.get(j));
                    }
                }
                ClickableSpan[] array;
                if (text instanceof Spanned) {
                    array = (ClickableSpan[])((Spanned)text).getSpans(0, text.length(), (Class)ClickableSpan.class);
                }
                else {
                    array = null;
                }
                if (array != null && array.length > 0) {
                    ((BaseBundle)c.a.getExtras()).putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", 2131427358);
                    SparseArray sparseArray2;
                    if ((sparseArray2 = (SparseArray)view.getTag(2131431622)) == null) {
                        sparseArray2 = new SparseArray();
                        view.setTag(2131431622, (Object)sparseArray2);
                    }
                    int k = 0;
                Label_0472:
                    while (k < array.length) {
                        final ClickableSpan clickableSpan = array[k];
                        while (true) {
                            for (int l = 0; l < sparseArray2.size(); ++l) {
                                if (clickableSpan.equals(((WeakReference)sparseArray2.valueAt(l)).get())) {
                                    final int n = sparseArray2.keyAt(l);
                                    sparseArray2.put(n, (Object)new WeakReference(array[k]));
                                    final ClickableSpan clickableSpan2 = array[k];
                                    final Spanned spanned = (Spanned)text;
                                    c.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(spanned.getSpanStart((Object)clickableSpan2));
                                    c.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(spanned.getSpanEnd((Object)clickableSpan2));
                                    c.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(spanned.getSpanFlags((Object)clickableSpan2));
                                    c.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(n);
                                    ++k;
                                    continue Label_0472;
                                }
                            }
                            final int n = b4.c.d;
                            b4.c.d = n + 1;
                            continue;
                        }
                    }
                }
            }
            final List<c$a> actionList = a4.a.getActionList(view);
            for (int n2 = 0; n2 < actionList.size(); ++n2) {
                c.b((c$a)actionList.get(n2));
            }
        }
        
        public final void onPopulateAccessibilityEvent(final View view, final AccessibilityEvent accessibilityEvent) {
            this.a.onPopulateAccessibilityEvent(view, accessibilityEvent);
        }
        
        public final boolean onRequestSendAccessibilityEvent(final ViewGroup viewGroup, final View view, final AccessibilityEvent accessibilityEvent) {
            return this.a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }
        
        public final boolean performAccessibilityAction(final View view, final int n, final Bundle bundle) {
            return this.a.performAccessibilityAction(view, n, bundle);
        }
        
        public final void sendAccessibilityEvent(final View view, final int n) {
            this.a.sendAccessibilityEvent(view, n);
        }
        
        public final void sendAccessibilityEventUnchecked(final View view, final AccessibilityEvent accessibilityEvent) {
            this.a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
        }
    }
    
    public static final class b
    {
        public static AccessibilityNodeProvider a(final View$AccessibilityDelegate view$AccessibilityDelegate, final View view) {
            return view$AccessibilityDelegate.getAccessibilityNodeProvider(view);
        }
        
        public static boolean b(final View$AccessibilityDelegate view$AccessibilityDelegate, final View view, final int n, final Bundle bundle) {
            return view$AccessibilityDelegate.performAccessibilityAction(view, n, bundle);
        }
    }
}
