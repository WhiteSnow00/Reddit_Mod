// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho.common.android;

import android.widget.HorizontalScrollView;
import android.widget.ScrollView;
import android.widget.AdapterView;
import android.widget.Spinner;
import java.util.List;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.WeakHashMap;
import a4.p0;
import android.view.View;
import b4.c;

public final class AccessibilityUtil
{
    private AccessibilityUtil() {
    }
    
    public static boolean hasFocusableAncestor(c i, final View view) {
        if (i != null) {
            if (view != null) {
                final WeakHashMap a = p0.a;
                final ViewParent f = p0.d.f(view);
                if (!(f instanceof View)) {
                    return false;
                }
                i = c.i();
                try {
                    ((View)f).onInitializeAccessibilityNodeInfo(i.a);
                    return isAccessibilityFocusable(i, (View)f) || hasFocusableAncestor(i, (View)f);
                }
                finally {
                    i.j();
                }
            }
        }
        return false;
    }
    
    public static boolean hasNonActionableSpeakingDescendants(c i, View child) {
        if (i != null && child != null) {
            if (child instanceof ViewGroup) {
                final ViewGroup viewGroup = (ViewGroup)child;
                final int childCount = viewGroup.getChildCount();
                int j = 0;
                while (j < childCount) {
                    child = viewGroup.getChildAt(j);
                    Label_0105: {
                        if (child == null) {
                            break Label_0105;
                        }
                        i = c.i();
                        try {
                            final WeakHashMap a = p0.a;
                            child.onInitializeAccessibilityNodeInfo(i.a);
                            if (!isAccessibilityFocusable(i, child) && isSpeakingNode(i, child)) {
                                return true;
                            }
                            i.j();
                            ++j;
                            continue;
                        }
                        finally {
                            i.j();
                        }
                    }
                    break;
                }
            }
        }
        return false;
    }
    
    public static boolean hasText(final c c) {
        boolean b = false;
        if (c == null) {
            return false;
        }
        if (!TextUtils.isEmpty(c.h()) || !TextUtils.isEmpty(c.a.getContentDescription())) {
            b = true;
        }
        return b;
    }
    
    public static boolean isAccessibilityFocusable(final c c, final View view) {
        boolean b2;
        final boolean b = b2 = false;
        if (c != null) {
            if (view == null) {
                b2 = b;
            }
            else {
                if (!c.a.isVisibleToUser()) {
                    return false;
                }
                if (isActionableForAccessibility(c)) {
                    return true;
                }
                b2 = b;
                if (isTopLevelScrollItem(c, view)) {
                    b2 = b;
                    if (isSpeakingNode(c, view)) {
                        b2 = true;
                    }
                }
            }
        }
        return b2;
    }
    
    public static boolean isActionableForAccessibility(final c c) {
        boolean b = false;
        if (c == null) {
            return false;
        }
        if (!c.a.isClickable() && !c.a.isLongClickable() && !c.a.isFocusable()) {
            final List d = c.d();
            if (d.contains(16) || d.contains(32) || d.contains(1)) {
                b = true;
            }
            return b;
        }
        return true;
    }
    
    public static boolean isSpeakingNode(final c c, final View view) {
        boolean b2;
        final boolean b = b2 = false;
        if (c != null) {
            if (view == null) {
                b2 = b;
            }
            else {
                if (!c.a.isVisibleToUser()) {
                    return false;
                }
                final WeakHashMap a = p0.a;
                final int c2 = p0.d.c(view);
                b2 = b;
                if (c2 != 4) {
                    if (c2 == 2 && c.a.getChildCount() <= 0) {
                        b2 = b;
                    }
                    else {
                        if (!c.a.isCheckable() && !hasText(c)) {
                            b2 = b;
                            if (!hasNonActionableSpeakingDescendants(c, view)) {
                                return b2;
                            }
                        }
                        b2 = true;
                    }
                }
            }
        }
        return b2;
    }
    
    public static boolean isTopLevelScrollItem(final c c, View view) {
        boolean b = false;
        if (c == null || view == null) {
            return false;
        }
        final WeakHashMap a = p0.a;
        view = (View)p0.d.f(view);
        if (view == null) {
            return false;
        }
        if (c.a.isScrollable()) {
            return true;
        }
        final List d = c.d();
        if (d.contains(4096) || d.contains(8192)) {
            return true;
        }
        if (view instanceof Spinner) {
            return false;
        }
        if (view instanceof AdapterView || view instanceof ScrollView || view instanceof HorizontalScrollView) {
            b = true;
        }
        return b;
    }
}
