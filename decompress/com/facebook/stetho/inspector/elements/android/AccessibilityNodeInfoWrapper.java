// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho.inspector.elements.android;

import android.view.ViewParent;
import com.facebook.stetho.common.android.AccessibilityUtil;
import android.view.ViewGroup;
import android.widget.EditText;
import android.text.TextUtils;
import java.util.Iterator;
import b4.c$a;
import java.util.WeakHashMap;
import a4.p0;
import b4.c;
import android.view.View;

public final class AccessibilityNodeInfoWrapper
{
    public static c createNodeInfoFromView(final View view) {
        final c i = c.i();
        final WeakHashMap a = p0.a;
        view.onInitializeAccessibilityNodeInfo(i.a);
        return i;
    }
    
    public static String getActions(final View view) {
        final c nodeInfoFromView = createNodeInfoFromView(view);
        try {
            final StringBuilder sb = new StringBuilder();
            for (final c$a c$a : nodeInfoFromView.d()) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                final int a = c$a.a();
                if (a != 1) {
                    if (a != 2) {
                        switch (a) {
                            default: {
                                final CharSequence b = c$a.b();
                                if (b != null) {
                                    sb.append(b);
                                    continue;
                                }
                                sb.append("unknown");
                                continue;
                            }
                            case 131072: {
                                sb.append("set-selection");
                                continue;
                            }
                            case 65536: {
                                sb.append("cut");
                                continue;
                            }
                            case 32768: {
                                sb.append("paste");
                                continue;
                            }
                            case 16384: {
                                sb.append("copy");
                                continue;
                            }
                            case 8192: {
                                sb.append("scroll-backward");
                                continue;
                            }
                            case 4096: {
                                sb.append("scroll-forward");
                                continue;
                            }
                            case 2048: {
                                sb.append("previous-html-element");
                                continue;
                            }
                            case 1024: {
                                sb.append("next-html-element");
                                continue;
                            }
                            case 512: {
                                sb.append("previous-at-movement-granularity");
                                continue;
                            }
                            case 256: {
                                sb.append("next-at-movement-granularity");
                                continue;
                            }
                            case 128: {
                                sb.append("clear-accessibility-focus");
                                continue;
                            }
                            case 64: {
                                sb.append("accessibility-focus");
                                continue;
                            }
                            case 32: {
                                sb.append("long-click");
                                continue;
                            }
                            case 16: {
                                sb.append("click");
                                continue;
                            }
                            case 8: {
                                sb.append("clear-selection");
                                continue;
                            }
                            case 4: {
                                sb.append("select");
                                continue;
                            }
                        }
                    }
                    else {
                        sb.append("clear-focus");
                    }
                }
                else {
                    sb.append("focus");
                }
            }
            String string;
            if (sb.length() > 0) {
                string = sb.toString();
            }
            else {
                string = null;
            }
            return string;
        }
        finally {
            nodeInfoFromView.j();
        }
    }
    
    public static CharSequence getDescription(final View view) {
        final c nodeInfoFromView = createNodeInfoFromView(view);
        try {
            final CharSequence contentDescription = nodeInfoFromView.a.getContentDescription();
            final CharSequence h = nodeInfoFromView.h();
            final boolean empty = TextUtils.isEmpty(h);
            final int n = 0;
            final boolean b = !empty;
            final boolean b2 = view instanceof EditText;
            if (!TextUtils.isEmpty(contentDescription) && (!b2 || !b)) {
                return contentDescription;
            }
            if (b) {
                return h;
            }
            final boolean b3 = view instanceof ViewGroup;
            final CharSequence charSequence = null;
            if (b3) {
                final StringBuilder sb = new StringBuilder();
                final ViewGroup viewGroup = (ViewGroup)view;
                for (int childCount = viewGroup.getChildCount(), i = n; i < childCount; ++i) {
                    final View child = viewGroup.getChildAt(i);
                    final c j = c.i();
                    final WeakHashMap a = p0.a;
                    child.onInitializeAccessibilityNodeInfo(j.a);
                    CharSequence description;
                    if (AccessibilityUtil.isSpeakingNode(j, child) && !AccessibilityUtil.isAccessibilityFocusable(j, child)) {
                        description = getDescription(child);
                    }
                    else {
                        description = null;
                    }
                    if (!TextUtils.isEmpty(description)) {
                        if (sb.length() > 0) {
                            sb.append(", ");
                        }
                        sb.append(description);
                    }
                    j.j();
                }
                CharSequence string = charSequence;
                if (sb.length() > 0) {
                    string = sb.toString();
                }
                return string;
            }
            return null;
        }
        finally {
            nodeInfoFromView.j();
        }
    }
    
    public static String getFocusableReasons(final View view) {
        final c nodeInfoFromView = createNodeInfoFromView(view);
        try {
            final boolean hasText = AccessibilityUtil.hasText(nodeInfoFromView);
            final boolean checkable = nodeInfoFromView.a.isCheckable();
            final boolean hasNonActionableSpeakingDescendants = AccessibilityUtil.hasNonActionableSpeakingDescendants(nodeInfoFromView, view);
            if (AccessibilityUtil.isActionableForAccessibility(nodeInfoFromView)) {
                if (nodeInfoFromView.a.getChildCount() <= 0) {
                    return "View is actionable and has no children.";
                }
                if (hasText) {
                    return "View is actionable and has a description.";
                }
                if (checkable) {
                    return "View is actionable and checkable.";
                }
                if (hasNonActionableSpeakingDescendants) {
                    return "View is actionable and has non-actionable descendants with descriptions.";
                }
            }
            if (AccessibilityUtil.isTopLevelScrollItem(nodeInfoFromView, view)) {
                if (hasText) {
                    return "View is a direct child of a scrollable container and has a description.";
                }
                if (checkable) {
                    return "View is a direct child of a scrollable container and is checkable.";
                }
                if (hasNonActionableSpeakingDescendants) {
                    return "View is a direct child of a scrollable container and has non-actionable descendants with descriptions.";
                }
            }
            if (hasText) {
                return "View has a description and is not actionable, but has no actionable ancestor.";
            }
            return null;
        }
        finally {
            nodeInfoFromView.j();
        }
    }
    
    public static boolean getIgnored(final View view) {
        final WeakHashMap a = p0.a;
        final int c = p0.d.c(view);
        if (c != 2) {
            if (c != 4) {
                for (ViewParent viewParent = view.getParent(); viewParent instanceof View; viewParent = viewParent.getParent()) {
                    if (p0.d.c((View)viewParent) == 4) {
                        return true;
                    }
                }
                final c nodeInfoFromView = createNodeInfoFromView(view);
                try {
                    if (!nodeInfoFromView.a.isVisibleToUser()) {
                        return true;
                    }
                    if (AccessibilityUtil.isAccessibilityFocusable(nodeInfoFromView, view)) {
                        return nodeInfoFromView.a.getChildCount() > 0 && !AccessibilityUtil.isSpeakingNode(nodeInfoFromView, view);
                    }
                    return AccessibilityUtil.hasFocusableAncestor(nodeInfoFromView, view) || !AccessibilityUtil.hasText(nodeInfoFromView);
                }
                finally {
                    nodeInfoFromView.j();
                }
            }
        }
        return true;
    }
    
    public static String getIgnoredReasons(final View view) {
        final WeakHashMap a = p0.a;
        final int c = p0.d.c(view);
        if (c == 2) {
            return "View has importantForAccessibility set to 'NO'.";
        }
        if (c == 4) {
            return "View has importantForAccessibility set to 'NO_HIDE_DESCENDANTS'.";
        }
        for (ViewParent viewParent = view.getParent(); viewParent instanceof View; viewParent = viewParent.getParent()) {
            if (p0.d.c((View)viewParent) == 4) {
                return "An ancestor View has importantForAccessibility set to 'NO_HIDE_DESCENDANTS'.";
            }
        }
        final c nodeInfoFromView = createNodeInfoFromView(view);
        try {
            if (!nodeInfoFromView.a.isVisibleToUser()) {
                return "View is not visible.";
            }
            if (AccessibilityUtil.isAccessibilityFocusable(nodeInfoFromView, view)) {
                return "View is actionable, but has no description.";
            }
            if (AccessibilityUtil.hasText(nodeInfoFromView)) {
                return "View is not actionable, and an ancestor View has co-opted its description.";
            }
            return "View is not actionable and has no description.";
        }
        finally {
            nodeInfoFromView.j();
        }
    }
    
    public static boolean getIsAccessibilityFocused(final View view) {
        final c nodeInfoFromView = createNodeInfoFromView(view);
        final boolean accessibilityFocused = nodeInfoFromView.a.isAccessibilityFocused();
        nodeInfoFromView.j();
        return accessibilityFocused;
    }
}
