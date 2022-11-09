// 
// Decompiled by Procyon v0.6.0
// 

package androidx.fragment.app;

import android.transition.Transition;
import android.animation.AnimatorInflater;
import android.content.res.Resources$NotFoundException;
import android.view.animation.AnimationUtils;
import android.animation.Animator;
import android.content.Context;
import androidx.core.app.SharedElementCallback;
import android.view.animation.Animation;
import android.view.animation.Animation$AnimationListener;
import android.animation.Animator$AnimatorListener;
import a4.i0;
import java.util.List;
import j0.h;
import android.graphics.Rect;
import java.util.HashMap;
import android.util.Log;
import java.util.Iterator;
import java.util.Map;
import j0.h$d;
import j0.h$b;
import java.util.Collection;
import java.util.WeakHashMap;
import a4.p0;
import j0.b;
import a4.l1;
import android.view.View;
import java.util.ArrayList;
import android.view.ViewGroup;

public final class d extends SpecialEffectsController
{
    public d(final ViewGroup viewGroup) {
        super(viewGroup);
    }
    
    public static void j(final ArrayList list, View child) {
        if (child instanceof ViewGroup) {
            final ViewGroup viewGroup = (ViewGroup)child;
            if (l1.b(viewGroup)) {
                if (!list.contains(child)) {
                    list.add(viewGroup);
                }
            }
            else {
                for (int childCount = viewGroup.getChildCount(), i = 0; i < childCount; ++i) {
                    child = viewGroup.getChildAt(i);
                    if (child.getVisibility() == 0) {
                        j(list, child);
                    }
                }
            }
        }
        else if (!list.contains(child)) {
            list.add(child);
        }
    }
    
    public static void k(final j0.b b, View child) {
        final WeakHashMap a = p0.a;
        final String k = p0.i.k(child);
        if (k != null) {
            ((j0.i)b).put((Object)k, (Object)child);
        }
        if (child instanceof ViewGroup) {
            final ViewGroup viewGroup = (ViewGroup)child;
            for (int childCount = viewGroup.getChildCount(), i = 0; i < childCount; ++i) {
                child = viewGroup.getChildAt(i);
                if (child.getVisibility() == 0) {
                    k(b, child);
                }
            }
        }
    }
    
    public static void l(final j0.b b, final Collection collection) {
        final Iterator iterator = ((h$b)b.entrySet()).iterator();
        while (true) {
            final h$d h$d = (h$d)iterator;
            if (!h$d.hasNext()) {
                break;
            }
            h$d.next();
            final View view = ((Map.Entry<K, View>)h$d).getValue();
            final WeakHashMap a = p0.a;
            if (collection.contains(p0.i.k(view))) {
                continue;
            }
            h$d.remove();
        }
    }
    
    @Override
    public final void b(final ArrayList list, final boolean b) {
        final Iterator iterator = list.iterator();
        Operation operation = null;
        Operation operation2 = null;
        while (iterator.hasNext()) {
            final Operation operation3 = (Operation)iterator.next();
            final Operation.State from = Operation.State.from(operation3.c.mView);
            final int n = d$a.a[operation3.a.ordinal()];
            if (n != 1 && n != 2 && n != 3) {
                if (n != 4) {
                    continue;
                }
                if (from == State.VISIBLE) {
                    continue;
                }
                operation2 = operation3;
            }
            else {
                if (from != State.VISIBLE || operation != null) {
                    continue;
                }
                operation = operation3;
            }
        }
        final boolean m = d0.M(2);
        final String s = "FragmentManager";
        if (m) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Executing operations from ");
            sb.append(operation);
            sb.append(" to ");
            sb.append(operation2);
            Log.v("FragmentManager", sb.toString());
        }
        final ArrayList<b> list2 = new ArrayList<b>();
        final ArrayList<d> list3 = new ArrayList<d>();
        final ArrayList list4 = new ArrayList(list);
        final Fragment c = list.get(list.size() - 1).c;
        final Iterator iterator2 = list.iterator();
        while (iterator2.hasNext()) {
            final Fragment.j mAnimationInfo = ((Operation)iterator2.next()).c.mAnimationInfo;
            final Fragment.j mAnimationInfo2 = c.mAnimationInfo;
            mAnimationInfo.b = mAnimationInfo2.b;
            mAnimationInfo.c = mAnimationInfo2.c;
            mAnimationInfo.d = mAnimationInfo2.d;
            mAnimationInfo.e = mAnimationInfo2.e;
        }
        for (final Operation operation4 : list) {
            final d d = new d();
            operation4.d();
            operation4.e.add(d);
            list2.add(new b(operation4, d, b));
            final d d2 = new d();
            operation4.d();
            operation4.e.add(d2);
            list3.add(new d(operation4, d2, b, b ? (operation4 == operation) : (operation4 == operation2)));
            operation4.d.add(new e(this, list4, operation4));
        }
        final HashMap<Operation, Boolean> hashMap = new HashMap<Operation, Boolean>();
        final Iterator<d> iterator4 = list3.iterator();
        u0 u0 = null;
        while (iterator4.hasNext()) {
            final d d3 = iterator4.next();
            if (((c)d3).b()) {
                continue;
            }
            u0 c2 = d3.c(d3.c);
            final u0 c3 = d3.c(d3.e);
            if (c2 != null && c3 != null && c2 != c3) {
                final StringBuilder k = a.k("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ");
                k.append(((c)d3).a.c);
                k.append(" returned Transition ");
                k.append(d3.c);
                k.append(" which uses a different Transition  type than its shared element transition ");
                k.append(d3.e);
                throw new IllegalArgumentException(k.toString());
            }
            if (c2 == null) {
                c2 = c3;
            }
            if (u0 == null) {
                u0 = c2;
            }
            else {
                if (c2 == null) {
                    continue;
                }
                if (u0 == c2) {
                    continue;
                }
                final StringBuilder i = a.k("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ");
                i.append(((c)d3).a.c);
                i.append(" returned Transition ");
                i.append(d3.c);
                i.append(" which uses a different Transition  type than other Fragments.");
                throw new IllegalArgumentException(i.toString());
            }
        }
        String s2 = null;
        HashMap<Operation, Boolean> hashMap2 = null;
        Operation operation5 = null;
        ArrayList list14 = null;
        Label_3446: {
            ArrayList list5;
            if (u0 == null) {
                for (final d d4 : list3) {
                    hashMap.put(((c)d4).a, Boolean.FALSE);
                    ((c)d4).a();
                }
                s2 = "FragmentManager";
                hashMap2 = hashMap;
                list5 = list4;
                operation5 = operation;
            }
            else {
                final View view = new View(((View)super.a).getContext());
                final Rect rect = new Rect();
                final ArrayList<View> list6 = new ArrayList<View>();
                final ArrayList list7 = new ArrayList();
                final j0.b b2 = new j0.b();
                final Iterator<d> iterator6 = list3.iterator();
                boolean b3 = false;
                Operation operation6 = operation;
                final Object o = null;
                View view2 = null;
                Operation operation7 = operation2;
                String s3 = s;
                Object o2 = o;
                while (iterator6.hasNext()) {
                    final Object e = iterator6.next().e;
                    String s10;
                    Operation operation8;
                    Operation operation9;
                    Object o3;
                    if (e != null && operation6 != null && operation7 != null) {
                        final Object r = u0.r(u0.f(e));
                        final ArrayList sharedElementSourceNames = operation7.c.getSharedElementSourceNames();
                        final ArrayList sharedElementSourceNames2 = operation6.c.getSharedElementSourceNames();
                        final ArrayList sharedElementTargetNames = operation6.c.getSharedElementTargetNames();
                        for (int j = 0; j < sharedElementTargetNames.size(); ++j) {
                            final int index = sharedElementSourceNames.indexOf(sharedElementTargetNames.get(j));
                            if (index != -1) {
                                sharedElementSourceNames.set(index, sharedElementSourceNames2.get(j));
                            }
                        }
                        final ArrayList sharedElementTargetNames2 = operation7.c.getSharedElementTargetNames();
                        SharedElementCallback sharedElementCallback;
                        SharedElementCallback sharedElementCallback2;
                        if (!b) {
                            sharedElementCallback = operation6.c.getExitTransitionCallback();
                            sharedElementCallback2 = operation7.c.getEnterTransitionCallback();
                        }
                        else {
                            sharedElementCallback = operation6.c.getEnterTransitionCallback();
                            sharedElementCallback2 = operation7.c.getExitTransitionCallback();
                        }
                        for (int size = sharedElementSourceNames.size(), l = 0; l < size; ++l) {
                            ((j0.i)b2).put((Object)sharedElementSourceNames.get(l), (Object)sharedElementTargetNames2.get(l));
                        }
                        if (d0.M(2)) {
                            Log.v(s3, ">>> entering view names <<<");
                            for (final String s4 : sharedElementTargetNames2) {
                                final StringBuilder sb2 = new StringBuilder();
                                sb2.append("Name: ");
                                sb2.append(s4);
                                Log.v(s3, sb2.toString());
                            }
                            Log.v(s3, ">>> exiting view names <<<");
                            for (final String s5 : sharedElementSourceNames) {
                                final StringBuilder sb3 = new StringBuilder();
                                sb3.append("Name: ");
                                sb3.append(s5);
                                Log.v(s3, sb3.toString());
                            }
                        }
                        final j0.b b4 = new j0.b();
                        k(b4, operation6.c.mView);
                        h.k((Collection)sharedElementSourceNames, (Map)b4);
                        ArrayList list8;
                        if (sharedElementCallback != null) {
                            if (d0.M(2)) {
                                final StringBuilder sb4 = new StringBuilder();
                                sb4.append("Executing exit callback for operation ");
                                sb4.append(operation6);
                                Log.v(s3, sb4.toString());
                            }
                            sharedElementCallback.onMapSharedElements(sharedElementSourceNames, (Map<String, View>)b4);
                            for (int n2 = sharedElementSourceNames.size() - 1; n2 >= 0; --n2) {
                                final String s6 = sharedElementSourceNames.get(n2);
                                final View view3 = (View)((j0.i)b4).getOrDefault((Object)s6, (Object)null);
                                if (view3 == null) {
                                    ((j0.i)b2).remove((Object)s6);
                                }
                                else {
                                    final WeakHashMap a = p0.a;
                                    if (!s6.equals(p0.i.k(view3))) {
                                        ((j0.i)b2).put((Object)p0.i.k(view3), (Object)((j0.i)b2).remove((Object)s6));
                                    }
                                }
                            }
                            list8 = sharedElementSourceNames;
                        }
                        else {
                            h.k((Collection)b4.keySet(), (Map)b2);
                            list8 = sharedElementSourceNames;
                        }
                        final j0.b b5 = new j0.b();
                        k(b5, operation7.c.mView);
                        h.k((Collection)sharedElementTargetNames2, (Map)b5);
                        h.k(b2.values(), (Map)b5);
                        if (sharedElementCallback2 != null) {
                            if (d0.M(2)) {
                                final StringBuilder sb5 = new StringBuilder();
                                sb5.append("Executing enter callback for operation ");
                                sb5.append(operation7);
                                Log.v(s3, sb5.toString());
                            }
                            sharedElementCallback2.onMapSharedElements(sharedElementTargetNames2, (Map<String, View>)b5);
                        Label_1815:
                            for (int n3 = sharedElementTargetNames2.size() - 1; n3 >= 0; --n3) {
                                final String s7 = sharedElementTargetNames2.get(n3);
                                final View view4 = (View)((j0.i)b5).getOrDefault((Object)s7, (Object)null);
                                if (view4 == null) {
                                    final q0 a2 = o0.a;
                                    final int h = ((j0.i)b2).h;
                                    int n4 = 0;
                                    while (true) {
                                        while (n4 < h) {
                                            if (s7.equals(((j0.i)b2).n(n4))) {
                                                final String s8 = (String)((j0.i)b2).j(n4);
                                                if (s8 != null) {
                                                    ((j0.i)b2).remove((Object)s8);
                                                }
                                                continue Label_1815;
                                            }
                                            else {
                                                ++n4;
                                            }
                                        }
                                        final String s8 = null;
                                        continue;
                                    }
                                }
                                final WeakHashMap a3 = p0.a;
                                if (!s7.equals(p0.i.k(view4))) {
                                    final q0 a4 = o0.a;
                                    final int h2 = ((j0.i)b2).h;
                                    int n5 = 0;
                                    while (true) {
                                        while (n5 < h2) {
                                            if (s7.equals(((j0.i)b2).n(n5))) {
                                                final String s9 = (String)((j0.i)b2).j(n5);
                                                if (s9 != null) {
                                                    ((j0.i)b2).put((Object)s9, (Object)p0.i.k(view4));
                                                }
                                                continue Label_1815;
                                            }
                                            else {
                                                ++n5;
                                            }
                                        }
                                        final String s9 = null;
                                        continue;
                                    }
                                }
                            }
                            s10 = s3;
                        }
                        else {
                            final q0 a5 = o0.a;
                            int h3 = ((j0.i)b2).h;
                            while (true) {
                                final int n6 = h3 - 1;
                                s10 = s3;
                                if (n6 < 0) {
                                    break;
                                }
                                h3 = n6;
                                if (((j0.i)b5).containsKey((Object)((j0.i)b2).n(n6))) {
                                    continue;
                                }
                                ((j0.i)b2).l(n6);
                                h3 = n6;
                            }
                        }
                        l(b4, b2.keySet());
                        l(b5, b2.values());
                        if (((j0.i)b2).isEmpty()) {
                            list6.clear();
                            list7.clear();
                            operation8 = operation;
                            operation9 = operation7;
                            o3 = null;
                        }
                        else {
                            o0.a(operation7.c, operation6.c, b, (j0.b<String, View>)b4, true);
                            final ViewGroup a6 = super.a;
                            operation8 = operation;
                            i0.a((View)a6, new j(operation2, operation8, b, b5));
                            list6.addAll(b4.values());
                            if (!list8.isEmpty()) {
                                view2 = (View)((j0.i)b4).getOrDefault((Object)list8.get(0), (Object)null);
                                u0.m(view2, r);
                            }
                            o3 = r;
                            list7.addAll(b5.values());
                            if (!sharedElementTargetNames2.isEmpty()) {
                                final View view5 = (View)((j0.i)b5).getOrDefault((Object)sharedElementTargetNames2.get(0), (Object)null);
                                if (view5 != null) {
                                    i0.a((View)super.a, new k(u0, view5, rect));
                                    b3 = true;
                                }
                            }
                            u0.p(o3, view, list6);
                            u0.l(o3, null, null, o3, list7);
                            final Boolean true = Boolean.TRUE;
                            final HashMap<Operation, Boolean> hashMap3 = hashMap;
                            hashMap3.put(operation8, true);
                            hashMap3.put(operation2, true);
                            operation9 = operation2;
                            operation6 = operation8;
                        }
                    }
                    else {
                        final String s11 = s3;
                        operation8 = operation;
                        operation9 = operation7;
                        o3 = o2;
                        s10 = s11;
                    }
                    final String s12 = s10;
                    o2 = o3;
                    operation7 = operation9;
                    operation = operation8;
                    s3 = s12;
                }
                final String s13 = s3;
                final HashMap<Operation, Boolean> hashMap4 = hashMap;
                final Operation operation10 = operation;
                final View view6 = view;
                final j0.i i2 = (j0.i)b2;
                final ArrayList list9 = new ArrayList();
                final Iterator<d> iterator9 = list3.iterator();
                final Object o4 = null;
                Object j2 = null;
                list5 = list4;
                final View view7 = view2;
                final HashMap<Operation, Boolean> hashMap5 = hashMap4;
                Object j3 = o4;
                Operation operation11 = operation7;
                operation5 = operation10;
                final View view8 = view6;
                while (iterator9.hasNext()) {
                    final d d5 = iterator9.next();
                    if (((c)d5).b()) {
                        hashMap5.put(((c)d5).a, Boolean.FALSE);
                        ((c)d5).a();
                    }
                    else {
                        final Object f = u0.f(d5.c);
                        final Operation a7 = ((c)d5).a;
                        final boolean b6 = o2 != null && (a7 == operation6 || a7 == operation11);
                        if (f == null) {
                            if (!b6) {
                                hashMap5.put(a7, Boolean.FALSE);
                                ((c)d5).a();
                            }
                        }
                        else {
                            final ArrayList list10 = new ArrayList();
                            j(list10, a7.c.mView);
                            if (b6) {
                                if (a7 == operation6) {
                                    list10.removeAll(list6);
                                }
                                else {
                                    list10.removeAll(list7);
                                }
                            }
                            if (list10.isEmpty()) {
                                u0.a(view8, f);
                            }
                            else {
                                u0.b(list10, f);
                                u0.l(f, f, list10, null, null);
                                final Operation operation12 = a7;
                                if (operation12.a == State.GONE) {
                                    list5.remove(operation12);
                                    final ArrayList list11 = new ArrayList<View>(list10);
                                    list11.remove(operation12.c.mView);
                                    u0.k(f, operation12.c.mView, (ArrayList<View>)list11);
                                    i0.a((View)super.a, new l(list10));
                                }
                            }
                            if (a7.a == State.VISIBLE) {
                                list9.addAll(list10);
                                if (b3) {
                                    u0.n(f, rect);
                                }
                            }
                            else {
                                u0.m(view7, f);
                            }
                            hashMap5.put(a7, Boolean.TRUE);
                            if (d5.d) {
                                j3 = u0.j(j3, f);
                            }
                            else {
                                j2 = u0.j(j2, f);
                            }
                        }
                        operation11 = operation2;
                    }
                }
                hashMap2 = hashMap5;
                final Object i3 = u0.i(j3, j2, o2);
                if (i3 == null) {
                    s2 = s13;
                }
                else {
                    final Iterator<d> iterator10 = list3.iterator();
                    s2 = s13;
                    while (iterator10.hasNext()) {
                        final d d6 = iterator10.next();
                        if (((c)d6).b()) {
                            continue;
                        }
                        final Object c4 = d6.c;
                        final Operation a8 = ((c)d6).a;
                        final boolean b7 = o2 != null && (a8 == operation6 || a8 == operation2);
                        if (c4 == null && !b7) {
                            continue;
                        }
                        final ViewGroup a9 = super.a;
                        final WeakHashMap a10 = p0.a;
                        if (!p0.g.c((View)a9)) {
                            if (d0.M(2)) {
                                final StringBuilder k2 = a.k("SpecialEffectsController: Container ");
                                k2.append(super.a);
                                k2.append(" has not been laid out. Completing operation ");
                                k2.append(a8);
                                Log.v(s2, k2.toString());
                            }
                            ((c)d6).a();
                        }
                        else {
                            final Fragment c5 = ((c)d6).a.c;
                            u0.o(i3, ((c)d6).b, new m(d6, a8));
                        }
                    }
                    final ViewGroup a11 = super.a;
                    final WeakHashMap a12 = p0.a;
                    if (p0.g.c((View)a11)) {
                        o0.b(list9, 4);
                        final ArrayList list12 = new ArrayList();
                        for (int size2 = list7.size(), n7 = 0; n7 < size2; ++n7) {
                            final View view9 = (View)list7.get(n7);
                            final WeakHashMap a13 = p0.a;
                            list12.add(p0.i.k(view9));
                            p0.i.v(view9, null);
                        }
                        if (d0.M(2)) {
                            Log.v(s2, ">>>>> Beginning transition <<<<<");
                            Log.v(s2, ">>>>> SharedElementFirstOutViews <<<<<");
                            final Iterator<View> iterator11 = list6.iterator();
                            Operation operation13;
                            while (true) {
                                final boolean hasNext = iterator11.hasNext();
                                operation13 = operation2;
                                if (!hasNext) {
                                    break;
                                }
                                final View view10 = iterator11.next();
                                final StringBuilder sb6 = new StringBuilder();
                                sb6.append("View: ");
                                sb6.append(view10);
                                sb6.append(" Name: ");
                                sb6.append(p0.i.k(view10));
                                Log.v(s2, sb6.toString());
                                operation2 = operation13;
                            }
                            Log.v(s2, ">>>>> SharedElementLastInViews <<<<<");
                            final Iterator iterator12 = list7.iterator();
                            while (true) {
                                operation2 = operation13;
                                if (!iterator12.hasNext()) {
                                    break;
                                }
                                final View view11 = (View)iterator12.next();
                                final StringBuilder sb7 = new StringBuilder();
                                sb7.append("View: ");
                                sb7.append(view11);
                                sb7.append(" Name: ");
                                sb7.append(p0.i.k(view11));
                                Log.v(s2, sb7.toString());
                            }
                        }
                        u0.c(super.a, i3);
                        final ViewGroup a14 = super.a;
                        final int size3 = list7.size();
                        final ArrayList list13 = new ArrayList();
                        int n8 = 0;
                        final String s14 = s2;
                        j0.i i4 = i2;
                        while (n8 < size3) {
                            final View view12 = list6.get(n8);
                            final WeakHashMap a15 = p0.a;
                            final String k3 = p0.i.k(view12);
                            list13.add(k3);
                            j0.i i5;
                            if (k3 == null) {
                                i5 = i4;
                            }
                            else {
                                p0.i.v(view12, null);
                                final String s15 = (String)i4.getOrDefault((Object)k3, (Object)null);
                                int n9 = 0;
                                while (true) {
                                    i5 = i4;
                                    if (n9 >= size3) {
                                        break;
                                    }
                                    if (s15.equals(list12.get(n9))) {
                                        p0.i.v((View)list7.get(n9), k3);
                                        i5 = i4;
                                        break;
                                    }
                                    ++n9;
                                }
                            }
                            ++n8;
                            i4 = i5;
                        }
                        s2 = s14;
                        i0.a((View)a14, new t0(size3, list7, list12, list6, list13));
                        o0.b(list9, 0);
                        u0.q(o2, list6, list7);
                        list14 = list5;
                        break Label_3446;
                    }
                }
            }
            list14 = list5;
        }
        final boolean containsValue = hashMap2.containsValue(Boolean.TRUE);
        final ViewGroup a16 = super.a;
        final Context context = ((View)a16).getContext();
        final ArrayList<b> list15 = new ArrayList<b>();
        final Iterator<b> iterator13 = list2.iterator();
        boolean b8 = false;
        while (true) {
            boolean b9 = false;
            if (!iterator13.hasNext()) {
                break;
            }
            final b b10 = iterator13.next();
            if (((c)b10).b()) {
                ((c)b10).a();
            }
            else {
                final s.a c6 = b10.c(context);
                if (c6 == null) {
                    ((c)b10).a();
                }
                else {
                    final Animator b11 = c6.b;
                    if (b11 == null) {
                        list15.add(b10);
                    }
                    else {
                        final Operation a17 = ((c)b10).a;
                        final Fragment c7 = a17.c;
                        if (Boolean.TRUE.equals(hashMap2.get(a17))) {
                            if (d0.M(2)) {
                                final StringBuilder sb8 = new StringBuilder();
                                sb8.append("Ignoring Animator set on ");
                                sb8.append(c7);
                                sb8.append(" as this Fragment was involved in a Transition.");
                                Log.v(s2, sb8.toString());
                            }
                            ((c)b10).a();
                        }
                        else {
                            if (a17.a == State.GONE) {
                                b9 = true;
                            }
                            if (b9) {
                                list14.remove(a17);
                            }
                            final View mView = c7.mView;
                            a16.startViewTransition(mView);
                            b11.addListener((Animator$AnimatorListener)new f(a16, mView, b9, a17, b10));
                            b11.setTarget((Object)mView);
                            b11.start();
                            if (d0.M(2)) {
                                final StringBuilder sb9 = new StringBuilder();
                                sb9.append("Animator from operation ");
                                sb9.append(a17);
                                sb9.append(" has started.");
                                Log.v(s2, sb9.toString());
                            }
                            ((c)b10).b.b((v3.d.b)new g(b11, a17));
                            b8 = true;
                        }
                    }
                }
            }
        }
        for (final b b12 : list15) {
            final Operation a18 = ((c)b12).a;
            final Fragment c8 = a18.c;
            if (containsValue) {
                if (d0.M(2)) {
                    final StringBuilder sb10 = new StringBuilder();
                    sb10.append("Ignoring Animation set on ");
                    sb10.append(c8);
                    sb10.append(" as Animations cannot run alongside Transitions.");
                    Log.v(s2, sb10.toString());
                }
                ((c)b12).a();
            }
            else if (b8) {
                if (d0.M(2)) {
                    final StringBuilder sb11 = new StringBuilder();
                    sb11.append("Ignoring Animation set on ");
                    sb11.append(c8);
                    sb11.append(" as Animations cannot run alongside Animators.");
                    Log.v(s2, sb11.toString());
                }
                ((c)b12).a();
            }
            else {
                final View mView2 = c8.mView;
                final s.a c9 = b12.c(context);
                c9.getClass();
                final Animation a19 = c9.a;
                a19.getClass();
                if (a18.a != State.REMOVED) {
                    mView2.startAnimation(a19);
                    ((c)b12).a();
                }
                else {
                    a16.startViewTransition(mView2);
                    final s.b b13 = new s.b(a19, a16, mView2);
                    ((Animation)b13).setAnimationListener((Animation$AnimationListener)new androidx.fragment.app.h(mView2, a16, b12, a18));
                    mView2.startAnimation((Animation)b13);
                    if (d0.M(2)) {
                        final StringBuilder sb12 = new StringBuilder();
                        sb12.append("Animation from operation ");
                        sb12.append(a18);
                        sb12.append(" has started.");
                        Log.v(s2, sb12.toString());
                    }
                }
                ((c)b12).b.b((v3.d.b)new i(mView2, a16, b12, a18));
            }
        }
        for (final Operation operation14 : list14) {
            operation14.a.applyState(operation14.c.mView);
        }
        list14.clear();
        if (d0.M(2)) {
            final StringBuilder sb13 = new StringBuilder();
            sb13.append("Completed executing operations from ");
            sb13.append(operation5);
            sb13.append(" to ");
            sb13.append(operation2);
            Log.v(s2, sb13.toString());
        }
    }
    
    public static final class b extends c
    {
        public boolean c;
        public boolean d;
        public s.a e;
        
        public b(final Operation operation, final d d, final boolean c) {
            super(operation, d);
            this.d = false;
            this.c = c;
        }
        
        public final s.a c(final Context context) {
            if (this.d) {
                return this.e;
            }
            final Operation a = super.a;
            final Fragment c = a.c;
            final boolean b = a.a == State.VISIBLE;
            final boolean c2 = this.c;
            final int nextTransition = c.getNextTransition();
            int n;
            if (c2) {
                if (b) {
                    n = c.getPopEnterAnim();
                }
                else {
                    n = c.getPopExitAnim();
                }
            }
            else if (b) {
                n = c.getEnterAnim();
            }
            else {
                n = c.getExitAnim();
            }
            c.setAnimations(0, 0, 0, 0);
            final ViewGroup mContainer = c.mContainer;
            final Object o = null;
            if (mContainer != null && ((View)mContainer).getTag(2131432188) != null) {
                ((View)c.mContainer).setTag(2131432188, (Object)null);
            }
            final ViewGroup mContainer2 = c.mContainer;
            if (mContainer2 != null && mContainer2.getLayoutTransition() != null) {
                goto Label_0543;
            }
            final Animation onCreateAnimation = c.onCreateAnimation(nextTransition, b, n);
            if (onCreateAnimation != null) {
                final s.a a2 = new s.a(onCreateAnimation);
                goto Label_0543;
            }
            final Animator onCreateAnimator = c.onCreateAnimator(nextTransition, b, n);
            if (onCreateAnimator != null) {
                final s.a a2 = new s.a(onCreateAnimator);
                goto Label_0543;
            }
            int n2;
            if ((n2 = n) == 0) {
                n2 = n;
                if (nextTransition != 0) {
                    int n3;
                    if (nextTransition != 4097) {
                        if (nextTransition != 8194) {
                            if (nextTransition != 8197) {
                                if (nextTransition != 4099) {
                                    if (nextTransition != 4100) {
                                        n3 = -1;
                                    }
                                    else if (b) {
                                        n3 = s.a(16842936, context);
                                    }
                                    else {
                                        n3 = s.a(16842937, context);
                                    }
                                }
                                else if (b) {
                                    n3 = 2130837511;
                                }
                                else {
                                    n3 = 2130837512;
                                }
                            }
                            else if (b) {
                                n3 = s.a(16842938, context);
                            }
                            else {
                                n3 = s.a(16842939, context);
                            }
                        }
                        else if (b) {
                            n3 = 2130837509;
                        }
                        else {
                            n3 = 2130837510;
                        }
                    }
                    else if (b) {
                        n3 = 2130837513;
                    }
                    else {
                        n3 = 2130837514;
                    }
                    n2 = n3;
                }
            }
            if (n2 == 0 || !"anim".equals(context.getResources().getResourceTypeName(n2))) {
                goto Label_0543;
            }
            try {
                final Animation loadAnimation = AnimationUtils.loadAnimation(context, n2);
                if (loadAnimation != null) {
                    final s.a a2 = new s.a(loadAnimation);
                    goto Label_0543;
                }
                goto Label_0475;
            }
            catch (final Resources$NotFoundException ex) {
                throw ex;
            }
            catch (final RuntimeException ex2) {
                goto Label_0475;
            }
            try {
                final Animator loadAnimator = AnimatorInflater.loadAnimator(context, n2);
                if (loadAnimator != null) {
                    final s.a a2 = new s.a(loadAnimator);
                    goto Label_0543;
                }
                goto Label_0543;
            }
            catch (final RuntimeException ex3) {}
        }
    }
    
    public static class c
    {
        public final Operation a;
        public final d b;
        
        public c(final Operation a, final d b) {
            this.a = a;
            this.b = b;
        }
        
        public final void a() {
            final Operation a = this.a;
            if (a.e.remove(this.b) && a.e.isEmpty()) {
                a.b();
            }
        }
        
        public final boolean b() {
            final Operation.State from = Operation.State.from(this.a.c.mView);
            final Operation.State a = this.a.a;
            if (from != a) {
                final Operation.State visible = State.VISIBLE;
                if (from == visible || a == visible) {
                    return false;
                }
            }
            return true;
        }
    }
    
    public static final class d extends c
    {
        public final Object c;
        public final boolean d;
        public final Object e;
        
        public d(final Operation operation, final v3.d d, final boolean b, final boolean b2) {
            super(operation, d);
            if (operation.a == State.VISIBLE) {
                Object c;
                if (b) {
                    c = operation.c.getReenterTransition();
                }
                else {
                    c = operation.c.getEnterTransition();
                }
                this.c = c;
                boolean d2;
                if (b) {
                    d2 = operation.c.getAllowReturnTransitionOverlap();
                }
                else {
                    d2 = operation.c.getAllowEnterTransitionOverlap();
                }
                this.d = d2;
            }
            else {
                Object c2;
                if (b) {
                    c2 = operation.c.getReturnTransition();
                }
                else {
                    c2 = operation.c.getExitTransition();
                }
                this.c = c2;
                this.d = true;
            }
            if (b2) {
                if (b) {
                    this.e = operation.c.getSharedElementReturnTransition();
                }
                else {
                    this.e = operation.c.getSharedElementEnterTransition();
                }
            }
            else {
                this.e = null;
            }
        }
        
        public final u0 c(final Object o) {
            if (o == null) {
                return null;
            }
            final q0 a = o0.a;
            if (a != null && o instanceof Transition) {
                return a;
            }
            final u0 b = o0.b;
            if (b != null && b.e(o)) {
                return b;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Transition ");
            sb.append(o);
            sb.append(" for fragment ");
            sb.append(super.a.c);
            sb.append(" is not a valid framework Transition or AndroidX Transition");
            throw new IllegalArgumentException(sb.toString());
        }
    }
}
