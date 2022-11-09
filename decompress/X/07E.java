// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.text.Spannable;
import android.os.Build$VERSION;
import android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo;
import android.view.accessibility.AccessibilityNodeInfo$CollectionInfo;
import android.view.View;
import android.graphics.Rect;
import android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import android.util.SparseArray;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import android.text.SpannableString;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import android.view.accessibility.AccessibilityNodeInfo;

public final class 07e
{
    public static int LIZLLL;
    public final AccessibilityNodeInfo LIZ;
    public int LIZIZ;
    public int LIZJ;
    
    static {
        Covode.recordClassIndex(809);
    }
    
    public 07e(final AccessibilityNodeInfo liz) {
        this.LIZIZ = -1;
        this.LIZJ = -1;
        this.LIZ = liz;
    }
    
    public static 07e LIZ(final 07e 07e) {
        return LIZ(AccessibilityNodeInfo.obtain(07e.LIZ));
    }
    
    public static 07e LIZ(final AccessibilityNodeInfo accessibilityNodeInfo) {
        return new 07e(accessibilityNodeInfo);
    }
    
    private CharSequence LIZ() {
        if (this.LIZ("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty() ^ true) {
            final List<Integer> liz = this.LIZ("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            final List<Integer> liz2 = this.LIZ("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            final List<Integer> liz3 = this.LIZ("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            final List<Integer> liz4 = this.LIZ("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            final CharSequence text = this.LIZ.getText();
            final int length = this.LIZ.getText().length();
            int i = 0;
            final SpannableString spannableString = new SpannableString((CharSequence)TextUtils.substring(text, 0, length));
            while (i < liz.size()) {
                ((Spannable)spannableString).setSpan((Object)new 07X(liz4.get(i), this, this.LIZ.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), (int)liz.get(i), (int)liz2.get(i), (int)liz3.get(i));
                ++i;
            }
            return (CharSequence)spannableString;
        }
        return this.LIZ.getText();
    }
    
    private List<a> LIZIZ() {
        final List actionList = this.LIZ.getActionList();
        if (actionList != null) {
            final ArrayList list = new ArrayList();
            for (int size = actionList.size(), i = 0; i < size; ++i) {
                list.add(new a(actionList.get(i)));
            }
            return list;
        }
        return Collections.emptyList();
    }
    
    public static ClickableSpan[] LIZLLL(final CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[])((Spanned)charSequence).getSpans(0, charSequence.length(), (Class)ClickableSpan.class);
        }
        return null;
    }
    
    public final int LIZ(final ClickableSpan clickableSpan, final SparseArray<WeakReference<ClickableSpan>> sparseArray) {
        if (sparseArray != null) {
            for (int i = 0; i < sparseArray.size(); ++i) {
                if (clickableSpan.equals(((WeakReference)sparseArray.valueAt(i)).get())) {
                    return sparseArray.keyAt(i);
                }
            }
        }
        final int lizlll = 07e.LIZLLL;
        07e.LIZLLL = lizlll + 1;
        return lizlll;
    }
    
    public final List<Integer> LIZ(final String s) {
        ArrayList integerArrayList;
        if ((integerArrayList = this.LIZ.getExtras().getIntegerArrayList(s)) == null) {
            integerArrayList = new ArrayList();
            this.LIZ.getExtras().putIntegerArrayList(s, integerArrayList);
        }
        return integerArrayList;
    }
    
    public final void LIZ(final int n) {
        this.LIZ.addAction(n);
    }
    
    public final void LIZ(final int n, final boolean b) {
        final Bundle extras = this.LIZ.getExtras();
        if (extras != null) {
            final int int1 = extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0);
            int n2;
            if (b) {
                n2 = n;
            }
            else {
                n2 = 0;
            }
            extras.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", n2 | (int1 & ~n));
        }
    }
    
    public final void LIZ(final a a) {
        this.LIZ.addAction((AccessibilityNodeInfo$AccessibilityAction)a.LJII);
    }
    
    public final void LIZ(final Rect rect) {
        this.LIZ.getBoundsInParent(rect);
    }
    
    public final void LIZ(final View source) {
        this.LIZJ = -1;
        this.LIZ.setSource(source);
    }
    
    public final void LIZ(final CharSequence packageName) {
        this.LIZ.setPackageName(packageName);
    }
    
    public final void LIZ(final Object o) {
        final AccessibilityNodeInfo liz = this.LIZ;
        AccessibilityNodeInfo$CollectionInfo collectionInfo;
        if (o == null) {
            collectionInfo = null;
        }
        else {
            collectionInfo = (AccessibilityNodeInfo$CollectionInfo)((b)o).LIZ;
        }
        liz.setCollectionInfo(collectionInfo);
    }
    
    public final void LIZ(final boolean checkable) {
        this.LIZ.setCheckable(checkable);
    }
    
    public final void LIZIZ(final Rect boundsInParent) {
        this.LIZ.setBoundsInParent(boundsInParent);
    }
    
    public final void LIZIZ(final View view) {
        this.LIZ.addChild(view);
    }
    
    public final void LIZIZ(final CharSequence className) {
        this.LIZ.setClassName(className);
    }
    
    public final void LIZIZ(final Object o) {
        final AccessibilityNodeInfo liz = this.LIZ;
        AccessibilityNodeInfo$CollectionItemInfo collectionItemInfo;
        if (o == null) {
            collectionItemInfo = null;
        }
        else {
            collectionItemInfo = (AccessibilityNodeInfo$CollectionItemInfo)((c)o).LIZ;
        }
        liz.setCollectionItemInfo(collectionItemInfo);
    }
    
    public final void LIZIZ(final boolean focusable) {
        this.LIZ.setFocusable(focusable);
    }
    
    public final boolean LIZIZ(final a a) {
        return this.LIZ.removeAction((AccessibilityNodeInfo$AccessibilityAction)a.LJII);
    }
    
    public final void LIZJ(final Rect rect) {
        this.LIZ.getBoundsInScreen(rect);
    }
    
    public final void LIZJ(final View parent) {
        this.LIZIZ = -1;
        this.LIZ.setParent(parent);
    }
    
    public final void LIZJ(final CharSequence text) {
        this.LIZ.setText(text);
    }
    
    public final void LIZJ(final boolean focused) {
        this.LIZ.setFocused(focused);
    }
    
    public final SparseArray<WeakReference<ClickableSpan>> LIZLLL(final View view) {
        return (SparseArray<WeakReference<ClickableSpan>>)view.getTag(2131372079);
    }
    
    public final void LIZLLL(final Rect boundsInScreen) {
        this.LIZ.setBoundsInScreen(boundsInScreen);
    }
    
    public final void LIZLLL(final boolean visibleToUser) {
        this.LIZ.setVisibleToUser(visibleToUser);
    }
    
    public final void LJ(final CharSequence contentDescription) {
        this.LIZ.setContentDescription(contentDescription);
    }
    
    public final void LJ(final boolean accessibilityFocused) {
        this.LIZ.setAccessibilityFocused(accessibilityFocused);
    }
    
    public final void LJFF(final boolean selected) {
        this.LIZ.setSelected(selected);
    }
    
    public final void LJI(final boolean clickable) {
        this.LIZ.setClickable(clickable);
    }
    
    public final void LJII(final boolean longClickable) {
        this.LIZ.setLongClickable(longClickable);
    }
    
    public final void LJIIIIZZ(final boolean enabled) {
        this.LIZ.setEnabled(enabled);
    }
    
    public final void LJIIIZ(final boolean scrollable) {
        this.LIZ.setScrollable(scrollable);
    }
    
    public final void LJIIJ(final boolean dismissable) {
        this.LIZ.setDismissable(dismissable);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (!(o instanceof 07e)) {
            return false;
        }
        final 07e 07e = (07e)o;
        final AccessibilityNodeInfo liz = this.LIZ;
        if (liz == null) {
            if (07e.LIZ != null) {
                return false;
            }
        }
        else if (!liz.equals((Object)07e.LIZ)) {
            return false;
        }
        return this.LIZJ == 07e.LIZJ && this.LIZIZ == 07e.LIZIZ;
    }
    
    @Override
    public final int hashCode() {
        final AccessibilityNodeInfo liz = this.LIZ;
        if (liz == null) {
            return 0;
        }
        return liz.hashCode();
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        final Rect rect = new Rect();
        this.LIZ(rect);
        sb.append("; boundsInParent: ".concat(String.valueOf(rect)));
        this.LIZJ(rect);
        sb.append("; boundsInScreen: ".concat(String.valueOf(rect)));
        sb.append("; packageName: ");
        sb.append(this.LIZ.getPackageName());
        sb.append("; className: ");
        sb.append(this.LIZ.getClassName());
        sb.append("; text: ");
        sb.append(this.LIZ());
        sb.append("; contentDescription: ");
        sb.append(this.LIZ.getContentDescription());
        sb.append("; viewId: ");
        sb.append(this.LIZ.getViewIdResourceName());
        sb.append("; checkable: ");
        sb.append(this.LIZ.isCheckable());
        sb.append("; checked: ");
        sb.append(this.LIZ.isChecked());
        sb.append("; focusable: ");
        sb.append(this.LIZ.isFocusable());
        sb.append("; focused: ");
        sb.append(this.LIZ.isFocused());
        sb.append("; selected: ");
        sb.append(this.LIZ.isSelected());
        sb.append("; clickable: ");
        sb.append(this.LIZ.isClickable());
        sb.append("; longClickable: ");
        sb.append(this.LIZ.isLongClickable());
        sb.append("; enabled: ");
        sb.append(this.LIZ.isEnabled());
        sb.append("; password: ");
        sb.append(this.LIZ.isPassword());
        final StringBuilder sb2 = new StringBuilder("; scrollable: ");
        sb2.append(this.LIZ.isScrollable());
        sb.append(sb2.toString());
        sb.append("; [");
        final List<a> liziz = this.LIZIZ();
        for (int i = 0; i < liziz.size(); ++i) {
            final a a = liziz.get(i);
            final int liz = a.LIZ();
            String s = null;
            Label_0696: {
                if (liz != 1) {
                    if (liz != 2) {
                        switch (liz) {
                            default: {
                                switch (liz) {
                                    default: {
                                        switch (liz) {
                                            default: {
                                                s = "ACTION_UNKNOWN";
                                                break Label_0696;
                                            }
                                            case 16908356: {
                                                s = "ACTION_SHOW_TOOLTIP";
                                                break Label_0696;
                                            }
                                            case 16908357: {
                                                s = "ACTION_HIDE_TOOLTIP";
                                                break Label_0696;
                                            }
                                            case 16908358: {
                                                s = "ACTION_PAGE_UP";
                                                break Label_0696;
                                            }
                                            case 16908359: {
                                                s = "ACTION_PAGE_DOWN";
                                                break Label_0696;
                                            }
                                            case 16908360: {
                                                s = "ACTION_PAGE_LEFT";
                                                break Label_0696;
                                            }
                                            case 16908361: {
                                                s = "ACTION_PAGE_RIGHT";
                                                break Label_0696;
                                            }
                                        }
                                        break;
                                    }
                                    case 16908342: {
                                        s = "ACTION_SHOW_ON_SCREEN";
                                        break Label_0696;
                                    }
                                    case 16908343: {
                                        s = "ACTION_SCROLL_TO_POSITION";
                                        break Label_0696;
                                    }
                                    case 16908344: {
                                        s = "ACTION_SCROLL_UP";
                                        break Label_0696;
                                    }
                                    case 16908345: {
                                        s = "ACTION_SCROLL_LEFT";
                                        break Label_0696;
                                    }
                                    case 16908346: {
                                        s = "ACTION_SCROLL_DOWN";
                                        break Label_0696;
                                    }
                                    case 16908347: {
                                        s = "ACTION_SCROLL_RIGHT";
                                        break Label_0696;
                                    }
                                    case 16908348: {
                                        s = "ACTION_CONTEXT_CLICK";
                                        break Label_0696;
                                    }
                                    case 16908349: {
                                        s = "ACTION_SET_PROGRESS";
                                        break Label_0696;
                                    }
                                }
                                break;
                            }
                            case 4: {
                                s = "ACTION_SELECT";
                                break;
                            }
                            case 8: {
                                s = "ACTION_CLEAR_SELECTION";
                                break;
                            }
                            case 16: {
                                s = "ACTION_CLICK";
                                break;
                            }
                            case 32: {
                                s = "ACTION_LONG_CLICK";
                                break;
                            }
                            case 64: {
                                s = "ACTION_ACCESSIBILITY_FOCUS";
                                break;
                            }
                            case 128: {
                                s = "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
                                break;
                            }
                            case 256: {
                                s = "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
                                break;
                            }
                            case 512: {
                                s = "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
                                break;
                            }
                            case 1024: {
                                s = "ACTION_NEXT_HTML_ELEMENT";
                                break;
                            }
                            case 2048: {
                                s = "ACTION_PREVIOUS_HTML_ELEMENT";
                                break;
                            }
                            case 4096: {
                                s = "ACTION_SCROLL_FORWARD";
                                break;
                            }
                            case 8192: {
                                s = "ACTION_SCROLL_BACKWARD";
                                break;
                            }
                            case 16384: {
                                s = "ACTION_COPY";
                                break;
                            }
                            case 32768: {
                                s = "ACTION_PASTE";
                                break;
                            }
                            case 65536: {
                                s = "ACTION_CUT";
                                break;
                            }
                            case 131072: {
                                s = "ACTION_SET_SELECTION";
                                break;
                            }
                            case 262144: {
                                s = "ACTION_EXPAND";
                                break;
                            }
                            case 524288: {
                                s = "ACTION_COLLAPSE";
                                break;
                            }
                            case 2097152: {
                                s = "ACTION_SET_TEXT";
                                break;
                            }
                            case 16908354: {
                                s = "ACTION_MOVE_WINDOW";
                                break;
                            }
                        }
                    }
                    else {
                        s = "ACTION_CLEAR_FOCUS";
                    }
                }
                else {
                    s = "ACTION_FOCUS";
                }
            }
            String string = s;
            if (s.equals("ACTION_UNKNOWN")) {
                string = s;
                if (a.LIZIZ() != null) {
                    string = a.LIZIZ().toString();
                }
            }
            sb.append(string);
            if (i != liziz.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
    
    public static final class a
    {
        public static final a LIZ;
        public static final a LIZIZ;
        public static final a LIZJ;
        public static final a LIZLLL;
        public static final a LJ;
        public static final a LJFF;
        public static final a LJI;
        public final Object LJII;
        public final 07j LJIIIIZZ;
        public final Class<? extends 07j.a> LJIIIZ;
        
        static {
            Covode.recordClassIndex(810);
            LIZ = new a(1);
            LIZIZ = new a(2);
            new a(4);
            new a(8);
            LIZJ = new a(16);
            new a(32);
            new a(64);
            new a(128);
            new a(256, 07j.b.class);
            new a(512, 07j.b.class);
            new a(1024, 07j.c.class);
            new a(2048, 07j.c.class);
            LIZLLL = new a(4096);
            LJ = new a(8192);
            new a(16384);
            new a(32768);
            new a(65536);
            new a(131072, 07j.g.class);
            new a(262144);
            new a(524288);
            new a(1048576);
            new a(2097152, 07j.h.class);
            AccessibilityNodeInfo$AccessibilityAction action_SHOW_ON_SCREEN;
            if (Build$VERSION.SDK_INT >= 23) {
                action_SHOW_ON_SCREEN = AccessibilityNodeInfo$AccessibilityAction.ACTION_SHOW_ON_SCREEN;
            }
            else {
                action_SHOW_ON_SCREEN = null;
            }
            new a(action_SHOW_ON_SCREEN, 16908342, null);
            AccessibilityNodeInfo$AccessibilityAction action_SCROLL_TO_POSITION;
            if (Build$VERSION.SDK_INT >= 23) {
                action_SCROLL_TO_POSITION = AccessibilityNodeInfo$AccessibilityAction.ACTION_SCROLL_TO_POSITION;
            }
            else {
                action_SCROLL_TO_POSITION = null;
            }
            new a(action_SCROLL_TO_POSITION, 16908343, 07j.e.class);
            AccessibilityNodeInfo$AccessibilityAction action_SCROLL_UP;
            if (Build$VERSION.SDK_INT >= 23) {
                action_SCROLL_UP = AccessibilityNodeInfo$AccessibilityAction.ACTION_SCROLL_UP;
            }
            else {
                action_SCROLL_UP = null;
            }
            LJFF = new a(action_SCROLL_UP, 16908344, null);
            AccessibilityNodeInfo$AccessibilityAction action_SCROLL_LEFT;
            if (Build$VERSION.SDK_INT >= 23) {
                action_SCROLL_LEFT = AccessibilityNodeInfo$AccessibilityAction.ACTION_SCROLL_LEFT;
            }
            else {
                action_SCROLL_LEFT = null;
            }
            new a(action_SCROLL_LEFT, 16908345, null);
            AccessibilityNodeInfo$AccessibilityAction action_SCROLL_DOWN;
            if (Build$VERSION.SDK_INT >= 23) {
                action_SCROLL_DOWN = AccessibilityNodeInfo$AccessibilityAction.ACTION_SCROLL_DOWN;
            }
            else {
                action_SCROLL_DOWN = null;
            }
            LJI = new a(action_SCROLL_DOWN, 16908346, null);
            AccessibilityNodeInfo$AccessibilityAction action_SCROLL_RIGHT;
            if (Build$VERSION.SDK_INT >= 23) {
                action_SCROLL_RIGHT = AccessibilityNodeInfo$AccessibilityAction.ACTION_SCROLL_RIGHT;
            }
            else {
                action_SCROLL_RIGHT = null;
            }
            new a(action_SCROLL_RIGHT, 16908347, null);
            AccessibilityNodeInfo$AccessibilityAction action_PAGE_UP;
            if (Build$VERSION.SDK_INT >= 29) {
                action_PAGE_UP = AccessibilityNodeInfo$AccessibilityAction.ACTION_PAGE_UP;
            }
            else {
                action_PAGE_UP = null;
            }
            new a(action_PAGE_UP, 16908358, null);
            AccessibilityNodeInfo$AccessibilityAction action_PAGE_DOWN;
            if (Build$VERSION.SDK_INT >= 29) {
                action_PAGE_DOWN = AccessibilityNodeInfo$AccessibilityAction.ACTION_PAGE_DOWN;
            }
            else {
                action_PAGE_DOWN = null;
            }
            new a(action_PAGE_DOWN, 16908359, null);
            AccessibilityNodeInfo$AccessibilityAction action_PAGE_LEFT;
            if (Build$VERSION.SDK_INT >= 29) {
                action_PAGE_LEFT = AccessibilityNodeInfo$AccessibilityAction.ACTION_PAGE_LEFT;
            }
            else {
                action_PAGE_LEFT = null;
            }
            new a(action_PAGE_LEFT, 16908360, null);
            AccessibilityNodeInfo$AccessibilityAction action_PAGE_RIGHT;
            if (Build$VERSION.SDK_INT >= 29) {
                action_PAGE_RIGHT = AccessibilityNodeInfo$AccessibilityAction.ACTION_PAGE_RIGHT;
            }
            else {
                action_PAGE_RIGHT = null;
            }
            new a(action_PAGE_RIGHT, 16908361, null);
            AccessibilityNodeInfo$AccessibilityAction action_CONTEXT_CLICK;
            if (Build$VERSION.SDK_INT >= 23) {
                action_CONTEXT_CLICK = AccessibilityNodeInfo$AccessibilityAction.ACTION_CONTEXT_CLICK;
            }
            else {
                action_CONTEXT_CLICK = null;
            }
            new a(action_CONTEXT_CLICK, 16908348, null);
            AccessibilityNodeInfo$AccessibilityAction action_SET_PROGRESS;
            if (Build$VERSION.SDK_INT >= 24) {
                action_SET_PROGRESS = AccessibilityNodeInfo$AccessibilityAction.ACTION_SET_PROGRESS;
            }
            else {
                action_SET_PROGRESS = null;
            }
            new a(action_SET_PROGRESS, 16908349, 07j.f.class);
            AccessibilityNodeInfo$AccessibilityAction action_MOVE_WINDOW;
            if (Build$VERSION.SDK_INT >= 26) {
                action_MOVE_WINDOW = AccessibilityNodeInfo$AccessibilityAction.ACTION_MOVE_WINDOW;
            }
            else {
                action_MOVE_WINDOW = null;
            }
            new a(action_MOVE_WINDOW, 16908354, 07j.d.class);
            AccessibilityNodeInfo$AccessibilityAction action_SHOW_TOOLTIP;
            if (Build$VERSION.SDK_INT >= 28) {
                action_SHOW_TOOLTIP = AccessibilityNodeInfo$AccessibilityAction.ACTION_SHOW_TOOLTIP;
            }
            else {
                action_SHOW_TOOLTIP = null;
            }
            new a(action_SHOW_TOOLTIP, 16908356, null);
            AccessibilityNodeInfo$AccessibilityAction action_HIDE_TOOLTIP;
            if (Build$VERSION.SDK_INT >= 28) {
                action_HIDE_TOOLTIP = AccessibilityNodeInfo$AccessibilityAction.ACTION_HIDE_TOOLTIP;
            }
            else {
                action_HIDE_TOOLTIP = null;
            }
            new a(action_HIDE_TOOLTIP, 16908357, null);
        }
        
        public a(final int n) {
            this(null, n, null);
        }
        
        public a(final int n, final Class<? extends 07j.a> clazz) {
            this(null, n, clazz);
        }
        
        public a(final Object o) {
            this(o, 0, null);
        }
        
        public a(final Object ljii, final int n, final Class<? extends 07j.a> ljiiiz) {
            this.LJIIIIZZ = null;
            if (ljii == null) {
                this.LJII = new AccessibilityNodeInfo$AccessibilityAction(n, (CharSequence)null);
            }
            else {
                this.LJII = ljii;
            }
            this.LJIIIZ = ljiiiz;
        }
        
        public final int LIZ() {
            return ((AccessibilityNodeInfo$AccessibilityAction)this.LJII).getId();
        }
        
        public final CharSequence LIZIZ() {
            return ((AccessibilityNodeInfo$AccessibilityAction)this.LJII).getLabel();
        }
        
        public final boolean LIZJ() {
            if (this.LJIIIIZZ != null) {
                final Class<? extends 07j.a> ljiiiz = this.LJIIIZ;
                if (ljiiiz != null) {
                    try {
                        ljiiiz.getDeclaredConstructor((Class<?>[])new Class[0]).newInstance(new Object[0]);
                    }
                    catch (final Exception ex) {
                        final Class<? extends 07j.a> ljiiiz2 = this.LJIIIZ;
                        if (ljiiiz2 != null) {
                            ljiiiz2.getName();
                        }
                    }
                }
                return this.LJIIIIZZ.LIZ();
            }
            return false;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (o == null) {
                return false;
            }
            if (!(o instanceof a)) {
                return false;
            }
            final a a = (a)o;
            final Object ljii = this.LJII;
            if (ljii == null) {
                if (a.LJII != null) {
                    return false;
                }
            }
            else if (!ljii.equals(a.LJII)) {
                return false;
            }
            return true;
        }
        
        @Override
        public final int hashCode() {
            final Object ljii = this.LJII;
            if (ljii != null) {
                return ljii.hashCode();
            }
            return 0;
        }
    }
    
    public static final class b
    {
        public final Object LIZ;
        
        static {
            Covode.recordClassIndex(811);
        }
        
        public b(final Object liz) {
            this.LIZ = liz;
        }
        
        public static b LIZ(final int n, final int n2, final int n3) {
            return new b(AccessibilityNodeInfo$CollectionInfo.obtain(n, n2, false, n3));
        }
    }
    
    public static final class c
    {
        public final Object LIZ;
        
        static {
            Covode.recordClassIndex(812);
        }
        
        public c(final Object liz) {
            this.LIZ = liz;
        }
        
        public static c LIZ(final int n, final int n2, final int n3, final int n4, final boolean b) {
            return new c(AccessibilityNodeInfo$CollectionItemInfo.obtain(n, n2, n3, n4, false, b));
        }
    }
}
