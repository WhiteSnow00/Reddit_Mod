// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.text.Spanned;
import java.util.ArrayList;
import androidx.core.g.t;
import android.os.Build$VERSION;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.ViewGroup;
import android.text.style.ClickableSpan;
import java.lang.ref.WeakReference;
import android.util.SparseArray;
import android.os.Bundle;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.Collections;
import java.util.List;
import android.view.View;
import com.bytedance.covode.number.Covode;
import android.view.View$AccessibilityDelegate;

public class 07k
{
    public static final View$AccessibilityDelegate LIZIZ;
    public final View$AccessibilityDelegate LIZ;
    public final View$AccessibilityDelegate LIZJ;
    
    static {
        Covode.recordClassIndex(803);
        LIZIZ = new View$AccessibilityDelegate();
    }
    
    public 07k() {
        this(07k.LIZIZ);
    }
    
    public 07k(final View$AccessibilityDelegate lizj) {
        this.LIZJ = lizj;
        this.LIZ = new a(this);
    }
    
    public static List<07e.a> LIZIZ(final View view) {
        List<Object> emptyList;
        if ((emptyList = (List)view.getTag(2131372078)) == null) {
            emptyList = Collections.emptyList();
        }
        return (List<07e.a>)emptyList;
    }
    
    public 07g LIZ(final View view) {
        final AccessibilityNodeProvider accessibilityNodeProvider = this.LIZJ.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new 07g(accessibilityNodeProvider);
        }
        return null;
    }
    
    public void LIZ(final View view, final int n) {
        this.LIZJ.sendAccessibilityEvent(view, n);
    }
    
    public void LIZ(final View view, final 07e 07e) {
        this.LIZJ.onInitializeAccessibilityNodeInfo(view, 07e.LIZ);
    }
    
    public void LIZ(final View view, final AccessibilityEvent accessibilityEvent) {
        this.LIZJ.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
    
    public boolean LIZ(final View view, int int1, final Bundle bundle) {
        final List<07e.a> liziz = LIZIZ(view);
        final boolean b = false;
        int i = 0;
        while (i < liziz.size()) {
            final 07e.a a = liziz.get(i);
            if (a.LIZ() == int1) {
                final boolean b2;
                if (!(b2 = a.LIZJ())) {
                    break;
                }
                return b2;
            }
            else {
                ++i;
            }
        }
        boolean b2;
        final boolean b3 = b2 = this.LIZJ.performAccessibilityAction(view, int1, bundle);
        if (b3) {
            return b2;
        }
        b2 = b3;
        if (int1 != 2131361853) {
            return b2;
        }
        int1 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        final SparseArray sparseArray = (SparseArray)view.getTag(2131372079);
        b2 = b;
        if (sparseArray == null) {
            return b2;
        }
        final WeakReference weakReference = (WeakReference)sparseArray.get(int1);
        b2 = b;
        if (weakReference == null) {
            return b2;
        }
        final ClickableSpan clickableSpan = (ClickableSpan)weakReference.get();
        b2 = b;
        if (clickableSpan == null) {
            return b2;
        }
        final ClickableSpan[] lizlll = 07e.LIZLLL(view.createAccessibilityNodeInfo().getText());
        int1 = 0;
        b2 = b;
        if (lizlll == null) {
            return b2;
        }
        while (true) {
            b2 = b;
            if (int1 >= lizlll.length) {
                return b2;
            }
            if (clickableSpan.equals(lizlll[int1])) {
                clickableSpan.onClick(view);
                b2 = true;
                return b2;
            }
            ++int1;
        }
    }
    
    public boolean LIZ(final ViewGroup viewGroup, final View view, final AccessibilityEvent accessibilityEvent) {
        return this.LIZJ.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }
    
    public boolean LIZIZ(final View view, final AccessibilityEvent accessibilityEvent) {
        return this.LIZJ.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }
    
    public void LIZJ(final View view, final AccessibilityEvent accessibilityEvent) {
        this.LIZJ.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }
    
    public void LIZLLL(final View view, final AccessibilityEvent accessibilityEvent) {
        this.LIZJ.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }
    
    public static final class a extends View$AccessibilityDelegate
    {
        public final 07k LIZ;
        
        static {
            Covode.recordClassIndex(804);
        }
        
        public a(final 07k liz) {
            this.LIZ = liz;
        }
        
        public final boolean dispatchPopulateAccessibilityEvent(final View view, final AccessibilityEvent accessibilityEvent) {
            return this.LIZ.LIZIZ(view, accessibilityEvent);
        }
        
        public final AccessibilityNodeProvider getAccessibilityNodeProvider(final View view) {
            final 07g liz = this.LIZ.LIZ(view);
            if (liz != null) {
                return (AccessibilityNodeProvider)liz.LIZ;
            }
            return null;
        }
        
        public final void onInitializeAccessibilityEvent(final View view, final AccessibilityEvent accessibilityEvent) {
            this.LIZ.LIZLLL(view, accessibilityEvent);
        }
        
        public final void onInitializeAccessibilityNodeInfo(final View view, final AccessibilityNodeInfo accessibilityNodeInfo) {
            final 07e liz = 07e.LIZ(accessibilityNodeInfo);
            final Boolean b = ((t.b<Boolean>)new 14e(Boolean.class)).LIZIZ(view);
            final boolean screenReaderFocusable = b != null && b;
            if (Build$VERSION.SDK_INT >= 28) {
                liz.LIZ.setScreenReaderFocusable(screenReaderFocusable);
            }
            else {
                liz.LIZ(1, screenReaderFocusable);
            }
            final Boolean b2 = ((t.b<Boolean>)new 14g(Boolean.class)).LIZIZ(view);
            final boolean heading = b2 != null && b2;
            if (Build$VERSION.SDK_INT >= 28) {
                liz.LIZ.setHeading(heading);
            }
            else {
                liz.LIZ(2, heading);
            }
            final CharSequence ljff = t.LJFF(view);
            if (Build$VERSION.SDK_INT >= 28) {
                liz.LIZ.setPaneTitle(ljff);
            }
            else {
                liz.LIZ.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", ljff);
            }
            this.LIZ.LIZ(view, liz);
            final CharSequence text = accessibilityNodeInfo.getText();
            if (Build$VERSION.SDK_INT < 26) {
                liz.LIZ.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
                liz.LIZ.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
                liz.LIZ.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
                liz.LIZ.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
                final SparseArray<WeakReference<ClickableSpan>> lizlll = liz.LIZLLL(view);
                if (lizlll != null) {
                    final ArrayList list = new ArrayList();
                    for (int i = 0; i < lizlll.size(); ++i) {
                        if (((WeakReference)lizlll.valueAt(i)).get() == null) {
                            list.add(i);
                        }
                    }
                    for (int j = 0; j < list.size(); ++j) {
                        lizlll.remove((int)list.get(j));
                    }
                }
                final ClickableSpan[] lizlll2 = 07e.LIZLLL(text);
                if (lizlll2 != null && lizlll2.length > 0) {
                    liz.LIZ.getExtras().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", 2131361853);
                    SparseArray lizlll3;
                    if ((lizlll3 = liz.LIZLLL(view)) == null) {
                        lizlll3 = new SparseArray();
                        view.setTag(2131372079, (Object)lizlll3);
                    }
                    for (int k = 0; k < lizlll2.length; ++k) {
                        final int liz2 = liz.LIZ(lizlll2[k], (SparseArray<WeakReference<ClickableSpan>>)lizlll3);
                        lizlll3.put(liz2, (Object)new WeakReference(lizlll2[k]));
                        final ClickableSpan clickableSpan = lizlll2[k];
                        final Spanned spanned = (Spanned)text;
                        liz.LIZ("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(spanned.getSpanStart((Object)clickableSpan));
                        liz.LIZ("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(spanned.getSpanEnd((Object)clickableSpan));
                        liz.LIZ("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(spanned.getSpanFlags((Object)clickableSpan));
                        liz.LIZ("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(liz2);
                    }
                }
            }
            final List<07e.a> liziz = 07k.LIZIZ(view);
            for (int l = 0; l < liziz.size(); ++l) {
                liz.LIZ((07e.a)liziz.get(l));
            }
        }
        
        public final void onPopulateAccessibilityEvent(final View view, final AccessibilityEvent accessibilityEvent) {
            this.LIZ.LIZJ(view, accessibilityEvent);
        }
        
        public final boolean onRequestSendAccessibilityEvent(final ViewGroup viewGroup, final View view, final AccessibilityEvent accessibilityEvent) {
            return this.LIZ.LIZ(viewGroup, view, accessibilityEvent);
        }
        
        public final boolean performAccessibilityAction(final View view, final int n, final Bundle bundle) {
            return this.LIZ.LIZ(view, n, bundle);
        }
        
        public final void sendAccessibilityEvent(final View view, final int n) {
            this.LIZ.LIZ(view, n);
        }
        
        public final void sendAccessibilityEventUnchecked(final View view, final AccessibilityEvent accessibilityEvent) {
            this.LIZ.LIZ(view, accessibilityEvent);
        }
    }
}
