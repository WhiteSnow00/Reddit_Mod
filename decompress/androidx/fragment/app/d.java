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
import v3.d$b;
import android.animation.Animator$AnimatorListener;
import a4.q0$g;
import a4.j0;
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
import a4.t1;
import java.util.WeakHashMap;
import a4.q0$i;
import a4.q0;
import j0.b;
import a4.m1;
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
            if (m1.b(viewGroup)) {
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
        final WeakHashMap<View, t1> a = q0.a;
        final String k = q0$i.k(child);
        if (k != null) {
            b.put((Object)k, (Object)child);
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
            final WeakHashMap<View, t1> a = q0.a;
            if (collection.contains(q0$i.k(view))) {
                continue;
            }
            h$d.remove();
        }
    }
    
    public final void b(final ArrayList list, final boolean b) {
        final Iterator iterator = list.iterator();
        SpecialEffectsController$Operation specialEffectsController$Operation = null;
        SpecialEffectsController$Operation specialEffectsController$Operation2 = null;
        while (iterator.hasNext()) {
            final SpecialEffectsController$Operation specialEffectsController$Operation3 = (SpecialEffectsController$Operation)iterator.next();
            final SpecialEffectsController$Operation$State from = SpecialEffectsController$Operation$State.from(specialEffectsController$Operation3.c.mView);
            final int n = d$a.a[((Enum)specialEffectsController$Operation3.a).ordinal()];
            if (n != 1 && n != 2 && n != 3) {
                if (n != 4) {
                    continue;
                }
                if (from == SpecialEffectsController$Operation$State.VISIBLE) {
                    continue;
                }
                specialEffectsController$Operation2 = specialEffectsController$Operation3;
            }
            else {
                if (from != SpecialEffectsController$Operation$State.VISIBLE || specialEffectsController$Operation != null) {
                    continue;
                }
                specialEffectsController$Operation = specialEffectsController$Operation3;
            }
        }
        final boolean m = d0.M(2);
        final String s = "FragmentManager";
        if (m) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Executing operations from ");
            sb.append(specialEffectsController$Operation);
            sb.append(" to ");
            sb.append(specialEffectsController$Operation2);
            Log.v("FragmentManager", sb.toString());
        }
        final ArrayList<b> list2 = new ArrayList<b>();
        final ArrayList<d> list3 = new ArrayList<d>();
        final ArrayList list4 = new ArrayList(list);
        final Fragment c = list.get(list.size() - 1).c;
        final Iterator iterator2 = list.iterator();
        while (iterator2.hasNext()) {
            final Fragment$j mAnimationInfo = ((SpecialEffectsController$Operation)iterator2.next()).c.mAnimationInfo;
            final Fragment$j mAnimationInfo2 = c.mAnimationInfo;
            mAnimationInfo.b = mAnimationInfo2.b;
            mAnimationInfo.c = mAnimationInfo2.c;
            mAnimationInfo.d = mAnimationInfo2.d;
            mAnimationInfo.e = mAnimationInfo2.e;
        }
        for (final SpecialEffectsController$Operation specialEffectsController$Operation4 : list) {
            final d d = new d();
            specialEffectsController$Operation4.d();
            specialEffectsController$Operation4.e.add(d);
            list2.add(new b(specialEffectsController$Operation4, d, b));
            final d d2 = new d();
            specialEffectsController$Operation4.d();
            specialEffectsController$Operation4.e.add(d2);
            list3.add(new d(specialEffectsController$Operation4, d2, b, b ? (specialEffectsController$Operation4 == specialEffectsController$Operation) : (specialEffectsController$Operation4 == specialEffectsController$Operation2)));
            specialEffectsController$Operation4.d.add(new e(this, list4, specialEffectsController$Operation4));
        }
        final HashMap<SpecialEffectsController$Operation, Boolean> hashMap = new HashMap<SpecialEffectsController$Operation, Boolean>();
        final Iterator<d> iterator4 = list3.iterator();
        u0 u0 = null;
        while (iterator4.hasNext()) {
            final d d3 = iterator4.next();
            if (((d$c)d3).b()) {
                continue;
            }
            final u0 c2 = d3.c(d3.c);
            u0 c3 = d3.c(d3.e);
            if (c2 != null && c3 != null && c2 != c3) {
                final StringBuilder r = a.r("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ");
                r.append(((d$c)d3).a.c);
                r.append(" returned Transition ");
                r.append(d3.c);
                r.append(" which uses a different Transition  type than its shared element transition ");
                r.append(d3.e);
                throw new IllegalArgumentException(r.toString());
            }
            if (c2 != null) {
                c3 = c2;
            }
            if (u0 == null) {
                u0 = c3;
            }
            else {
                if (c3 == null) {
                    continue;
                }
                if (u0 == c3) {
                    continue;
                }
                final StringBuilder r2 = a.r("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ");
                r2.append(((d$c)d3).a.c);
                r2.append(" returned Transition ");
                r2.append(d3.c);
                r2.append(" which uses a different Transition  type than other Fragments.");
                throw new IllegalArgumentException(r2.toString());
            }
        }
        String s2 = null;
        HashMap<SpecialEffectsController$Operation, Boolean> hashMap2 = null;
        SpecialEffectsController$Operation specialEffectsController$Operation5 = null;
        ArrayList list15 = null;
        Label_3459: {
            ArrayList list5;
            if (u0 == null) {
                for (final d d4 : list3) {
                    hashMap.put(((d$c)d4).a, Boolean.FALSE);
                    ((d$c)d4).a();
                }
                s2 = "FragmentManager";
                list5 = list4;
                hashMap2 = hashMap;
                specialEffectsController$Operation5 = specialEffectsController$Operation;
            }
            else {
                final View view = new View(((View)super.a).getContext());
                final Rect rect = new Rect();
                final ArrayList<View> list6 = new ArrayList<View>();
                final ArrayList list7 = new ArrayList();
                final j0.b b2 = new j0.b<Object, Object>();
                final Iterator<d> iterator6 = list3.iterator();
                boolean b3 = false;
                SpecialEffectsController$Operation specialEffectsController$Operation6 = specialEffectsController$Operation;
                final Object o = null;
                View view2 = null;
                SpecialEffectsController$Operation specialEffectsController$Operation7 = specialEffectsController$Operation2;
                String s3 = s;
                Object o2 = o;
                while (iterator6.hasNext()) {
                    final Object e = iterator6.next().e;
                    String s10;
                    SpecialEffectsController$Operation specialEffectsController$Operation8;
                    SpecialEffectsController$Operation specialEffectsController$Operation9;
                    Object o3;
                    if (e != null && specialEffectsController$Operation6 != null && specialEffectsController$Operation7 != null) {
                        final Object r3 = u0.r(u0.f(e));
                        final ArrayList sharedElementSourceNames = specialEffectsController$Operation7.c.getSharedElementSourceNames();
                        final ArrayList sharedElementSourceNames2 = specialEffectsController$Operation6.c.getSharedElementSourceNames();
                        final ArrayList sharedElementTargetNames = specialEffectsController$Operation6.c.getSharedElementTargetNames();
                        for (int i = 0; i < sharedElementTargetNames.size(); ++i) {
                            final int index = sharedElementSourceNames.indexOf(sharedElementTargetNames.get(i));
                            if (index != -1) {
                                sharedElementSourceNames.set(index, sharedElementSourceNames2.get(i));
                            }
                        }
                        final ArrayList sharedElementTargetNames2 = specialEffectsController$Operation7.c.getSharedElementTargetNames();
                        SharedElementCallback sharedElementCallback;
                        SharedElementCallback sharedElementCallback2;
                        if (!b) {
                            sharedElementCallback = specialEffectsController$Operation6.c.getExitTransitionCallback();
                            sharedElementCallback2 = specialEffectsController$Operation7.c.getEnterTransitionCallback();
                        }
                        else {
                            sharedElementCallback = specialEffectsController$Operation6.c.getEnterTransitionCallback();
                            sharedElementCallback2 = specialEffectsController$Operation7.c.getExitTransitionCallback();
                        }
                        for (int size = sharedElementSourceNames.size(), j = 0; j < size; ++j) {
                            b2.put((Object)sharedElementSourceNames.get(j), (Object)sharedElementTargetNames2.get(j));
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
                        final j0.b b4 = new j0.b<Object, Object>();
                        k(b4, specialEffectsController$Operation6.c.mView);
                        h.k((Collection)sharedElementSourceNames, (Map)b4);
                        ArrayList list8;
                        if (sharedElementCallback != null) {
                            if (d0.M(2)) {
                                final StringBuilder sb4 = new StringBuilder();
                                sb4.append("Executing exit callback for operation ");
                                sb4.append(specialEffectsController$Operation6);
                                Log.v(s3, sb4.toString());
                            }
                            sharedElementCallback.onMapSharedElements((List)sharedElementSourceNames, (Map)b4);
                            for (int k = sharedElementSourceNames.size() - 1; k >= 0; --k) {
                                final String s6 = sharedElementSourceNames.get(k);
                                final View view3 = (View)b4.getOrDefault((Object)s6, (Object)null);
                                if (view3 == null) {
                                    b2.remove((Object)s6);
                                }
                                else {
                                    final WeakHashMap<View, t1> a = q0.a;
                                    if (!s6.equals(q0$i.k(view3))) {
                                        b2.put((Object)q0$i.k(view3), (Object)b2.remove((Object)s6));
                                    }
                                }
                            }
                            list8 = sharedElementSourceNames;
                        }
                        else {
                            h.k((Collection)b4.keySet(), (Map)b2);
                            list8 = sharedElementSourceNames;
                        }
                        final j0.b b5 = new j0.b<Object, Object>();
                        k(b5, specialEffectsController$Operation7.c.mView);
                        h.k((Collection)sharedElementTargetNames2, (Map)b5);
                        h.k((Collection)b2.values(), (Map)b5);
                        if (sharedElementCallback2 != null) {
                            if (d0.M(2)) {
                                final StringBuilder sb5 = new StringBuilder();
                                sb5.append("Executing enter callback for operation ");
                                sb5.append(specialEffectsController$Operation7);
                                Log.v(s3, sb5.toString());
                            }
                            sharedElementCallback2.onMapSharedElements((List)sharedElementTargetNames2, (Map)b5);
                        Label_1828:
                            for (int l = sharedElementTargetNames2.size() - 1; l >= 0; --l) {
                                final String s7 = sharedElementTargetNames2.get(l);
                                final View view4 = (View)b5.getOrDefault((Object)s7, (Object)null);
                                if (view4 == null) {
                                    final androidx.fragment.app.q0 a2 = o0.a;
                                    final int h = b2.h;
                                    int n2 = 0;
                                    while (true) {
                                        while (n2 < h) {
                                            if (s7.equals(b2.n(n2))) {
                                                final String s8 = (String)b2.j(n2);
                                                if (s8 != null) {
                                                    b2.remove((Object)s8);
                                                }
                                                continue Label_1828;
                                            }
                                            else {
                                                ++n2;
                                            }
                                        }
                                        final String s8 = null;
                                        continue;
                                    }
                                }
                                final WeakHashMap<View, t1> a3 = q0.a;
                                if (!s7.equals(q0$i.k(view4))) {
                                    final androidx.fragment.app.q0 a4 = o0.a;
                                    final int h2 = b2.h;
                                    int n3 = 0;
                                    while (true) {
                                        while (n3 < h2) {
                                            if (s7.equals(b2.n(n3))) {
                                                final String s9 = (String)b2.j(n3);
                                                if (s9 != null) {
                                                    b2.put((Object)s9, (Object)q0$i.k(view4));
                                                }
                                                continue Label_1828;
                                            }
                                            else {
                                                ++n3;
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
                            final androidx.fragment.app.q0 a5 = o0.a;
                            int h3 = b2.h;
                            while (true) {
                                final int n4 = h3 - 1;
                                s10 = s3;
                                if (n4 < 0) {
                                    break;
                                }
                                h3 = n4;
                                if (b5.containsKey((Object)b2.n(n4))) {
                                    continue;
                                }
                                b2.l(n4);
                                h3 = n4;
                            }
                        }
                        l(b4, b2.keySet());
                        l(b5, b2.values());
                        if (b2.isEmpty()) {
                            list6.clear();
                            list7.clear();
                            specialEffectsController$Operation8 = specialEffectsController$Operation;
                            specialEffectsController$Operation9 = specialEffectsController$Operation7;
                            o3 = null;
                        }
                        else {
                            o0.a(specialEffectsController$Operation7.c, specialEffectsController$Operation6.c, b, b4, true);
                            final ViewGroup a6 = super.a;
                            specialEffectsController$Operation8 = specialEffectsController$Operation;
                            j0.a((View)a6, (Runnable)new j(specialEffectsController$Operation2, specialEffectsController$Operation8, b, b5));
                            list6.addAll(b4.values());
                            if (!list8.isEmpty()) {
                                view2 = (View)b4.getOrDefault((Object)list8.get(0), (Object)null);
                                u0.m(view2, r3);
                            }
                            o3 = r3;
                            list7.addAll(b5.values());
                            if (!sharedElementTargetNames2.isEmpty()) {
                                final View view5 = (View)b5.getOrDefault((Object)sharedElementTargetNames2.get(0), (Object)null);
                                if (view5 != null) {
                                    j0.a((View)super.a, (Runnable)new k(u0, view5, rect));
                                    b3 = true;
                                }
                            }
                            u0.p(o3, view, list6);
                            u0.l(o3, null, null, o3, list7);
                            final Boolean true = Boolean.TRUE;
                            final HashMap<SpecialEffectsController$Operation, Boolean> hashMap3 = hashMap;
                            hashMap3.put(specialEffectsController$Operation8, true);
                            hashMap3.put(specialEffectsController$Operation2, true);
                            specialEffectsController$Operation9 = specialEffectsController$Operation2;
                            specialEffectsController$Operation6 = specialEffectsController$Operation8;
                        }
                    }
                    else {
                        final String s11 = s3;
                        specialEffectsController$Operation8 = specialEffectsController$Operation;
                        specialEffectsController$Operation9 = specialEffectsController$Operation7;
                        o3 = o2;
                        s10 = s11;
                    }
                    final String s12 = s10;
                    o2 = o3;
                    specialEffectsController$Operation7 = specialEffectsController$Operation9;
                    specialEffectsController$Operation = specialEffectsController$Operation8;
                    s3 = s12;
                }
                final String s13 = s3;
                final HashMap<SpecialEffectsController$Operation, Boolean> hashMap4 = hashMap;
                specialEffectsController$Operation5 = specialEffectsController$Operation;
                final View view6 = view;
                final j0.b b6 = b2;
                final ArrayList list9 = new ArrayList();
                final Iterator<d> iterator9 = list3.iterator();
                final Object o4 = null;
                Object j2 = null;
                final ArrayList list10 = list4;
                final View view7 = view2;
                final HashMap<SpecialEffectsController$Operation, Boolean> hashMap5 = hashMap4;
                Object j3 = o4;
                SpecialEffectsController$Operation specialEffectsController$Operation10 = specialEffectsController$Operation7;
                final View view8 = view6;
                while (iterator9.hasNext()) {
                    final d d5 = iterator9.next();
                    if (((d$c)d5).b()) {
                        hashMap5.put(((d$c)d5).a, Boolean.FALSE);
                        ((d$c)d5).a();
                    }
                    else {
                        final Object f = u0.f(d5.c);
                        final SpecialEffectsController$Operation a7 = ((d$c)d5).a;
                        final boolean b7 = o2 != null && (a7 == specialEffectsController$Operation6 || a7 == specialEffectsController$Operation10);
                        if (f == null) {
                            if (!b7) {
                                hashMap5.put(a7, Boolean.FALSE);
                                ((d$c)d5).a();
                            }
                        }
                        else {
                            final ArrayList list11 = new ArrayList();
                            j(list11, a7.c.mView);
                            if (b7) {
                                if (a7 == specialEffectsController$Operation6) {
                                    list11.removeAll(list6);
                                }
                                else {
                                    list11.removeAll(list7);
                                }
                            }
                            if (list11.isEmpty()) {
                                u0.a(view8, f);
                            }
                            else {
                                u0.b(list11, f);
                                u0.l(f, f, list11, null, null);
                                final SpecialEffectsController$Operation specialEffectsController$Operation11 = a7;
                                if (specialEffectsController$Operation11.a == SpecialEffectsController$Operation$State.GONE) {
                                    list10.remove(specialEffectsController$Operation11);
                                    final ArrayList list12 = new ArrayList<View>(list11);
                                    list12.remove(specialEffectsController$Operation11.c.mView);
                                    u0.k(f, specialEffectsController$Operation11.c.mView, (ArrayList<View>)list12);
                                    j0.a((View)super.a, (Runnable)new l((ArrayList)list11));
                                }
                            }
                            if (a7.a == SpecialEffectsController$Operation$State.VISIBLE) {
                                list9.addAll(list11);
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
                        specialEffectsController$Operation10 = specialEffectsController$Operation2;
                    }
                }
                hashMap2 = hashMap5;
                list5 = list10;
                final Object i2 = u0.i(j3, j2, o2);
                if (i2 == null) {
                    s2 = s13;
                }
                else {
                    final Iterator<d> iterator10 = list3.iterator();
                    s2 = s13;
                    while (iterator10.hasNext()) {
                        final d d6 = iterator10.next();
                        if (((d$c)d6).b()) {
                            continue;
                        }
                        final Object c4 = d6.c;
                        final SpecialEffectsController$Operation a8 = ((d$c)d6).a;
                        final boolean b8 = o2 != null && (a8 == specialEffectsController$Operation6 || a8 == specialEffectsController$Operation2);
                        if (c4 == null && !b8) {
                            continue;
                        }
                        final ViewGroup a9 = super.a;
                        final WeakHashMap<View, t1> a10 = q0.a;
                        if (!q0$g.c((View)a9)) {
                            if (d0.M(2)) {
                                final StringBuilder r4 = a.r("SpecialEffectsController: Container ");
                                r4.append(super.a);
                                r4.append(" has not been laid out. Completing operation ");
                                r4.append(a8);
                                Log.v(s2, r4.toString());
                            }
                            ((d$c)d6).a();
                        }
                        else {
                            final Fragment c5 = ((d$c)d6).a.c;
                            u0.o(i2, ((d$c)d6).b, new m(d6, a8));
                        }
                    }
                    final ViewGroup a11 = super.a;
                    final WeakHashMap<View, t1> a12 = q0.a;
                    if (q0$g.c((View)a11)) {
                        o0.b((ArrayList)list9, 4);
                        final ArrayList list13 = new ArrayList();
                        for (int size2 = list7.size(), n5 = 0; n5 < size2; ++n5) {
                            final View view9 = (View)list7.get(n5);
                            final WeakHashMap<View, t1> a13 = q0.a;
                            list13.add(q0$i.k(view9));
                            q0$i.v(view9, (String)null);
                        }
                        if (d0.M(2)) {
                            Log.v(s2, ">>>>> Beginning transition <<<<<");
                            Log.v(s2, ">>>>> SharedElementFirstOutViews <<<<<");
                            final Iterator<View> iterator11 = list6.iterator();
                            SpecialEffectsController$Operation specialEffectsController$Operation12;
                            while (true) {
                                final boolean hasNext = iterator11.hasNext();
                                specialEffectsController$Operation12 = specialEffectsController$Operation2;
                                if (!hasNext) {
                                    break;
                                }
                                final View view10 = iterator11.next();
                                final StringBuilder sb6 = new StringBuilder();
                                sb6.append("View: ");
                                sb6.append(view10);
                                sb6.append(" Name: ");
                                sb6.append(q0$i.k(view10));
                                Log.v(s2, sb6.toString());
                                specialEffectsController$Operation2 = specialEffectsController$Operation12;
                            }
                            Log.v(s2, ">>>>> SharedElementLastInViews <<<<<");
                            final Iterator iterator12 = list7.iterator();
                            while (true) {
                                specialEffectsController$Operation2 = specialEffectsController$Operation12;
                                if (!iterator12.hasNext()) {
                                    break;
                                }
                                final View view11 = (View)iterator12.next();
                                final StringBuilder sb7 = new StringBuilder();
                                sb7.append("View: ");
                                sb7.append(view11);
                                sb7.append(" Name: ");
                                sb7.append(q0$i.k(view11));
                                Log.v(s2, sb7.toString());
                            }
                        }
                        u0.c(super.a, i2);
                        final ViewGroup a14 = super.a;
                        final int size3 = list7.size();
                        final ArrayList list14 = new ArrayList();
                        int n6 = 0;
                        final String s14 = s2;
                        j0.i i3 = b6;
                        while (n6 < size3) {
                            final View view12 = list6.get(n6);
                            final WeakHashMap<View, t1> a15 = q0.a;
                            final String k2 = q0$i.k(view12);
                            list14.add(k2);
                            j0.i i4;
                            if (k2 == null) {
                                i4 = i3;
                            }
                            else {
                                q0$i.v(view12, (String)null);
                                final String s15 = (String)i3.getOrDefault((Object)k2, (Object)null);
                                int n7 = 0;
                                while (true) {
                                    i4 = i3;
                                    if (n7 >= size3) {
                                        break;
                                    }
                                    if (s15.equals(list13.get(n7))) {
                                        q0$i.v((View)list7.get(n7), k2);
                                        i4 = i3;
                                        break;
                                    }
                                    ++n7;
                                }
                            }
                            ++n6;
                            i3 = i4;
                        }
                        s2 = s14;
                        j0.a((View)a14, (Runnable)new t0(size3, list7, list13, list6, list14));
                        o0.b((ArrayList)list9, 0);
                        u0.q(o2, list6, list7);
                        list15 = list5;
                        break Label_3459;
                    }
                }
            }
            list15 = list5;
        }
        final boolean containsValue = hashMap2.containsValue(Boolean.TRUE);
        final ViewGroup a16 = super.a;
        final Context context = ((View)a16).getContext();
        final ArrayList<b> list16 = new ArrayList<b>();
        final Iterator<b> iterator13 = list2.iterator();
        boolean b9 = false;
        while (true) {
            boolean b10 = false;
            if (!iterator13.hasNext()) {
                break;
            }
            final b b11 = iterator13.next();
            if (((d$c)b11).b()) {
                ((d$c)b11).a();
            }
            else {
                final s$a c6 = b11.c(context);
                if (c6 == null) {
                    ((d$c)b11).a();
                }
                else {
                    final Animator b12 = c6.b;
                    if (b12 == null) {
                        list16.add(b11);
                    }
                    else {
                        final SpecialEffectsController$Operation a17 = ((d$c)b11).a;
                        final Fragment c7 = a17.c;
                        if (Boolean.TRUE.equals(hashMap2.get(a17))) {
                            if (d0.M(2)) {
                                final StringBuilder sb8 = new StringBuilder();
                                sb8.append("Ignoring Animator set on ");
                                sb8.append(c7);
                                sb8.append(" as this Fragment was involved in a Transition.");
                                Log.v(s2, sb8.toString());
                            }
                            ((d$c)b11).a();
                        }
                        else {
                            if (a17.a == SpecialEffectsController$Operation$State.GONE) {
                                b10 = true;
                            }
                            if (b10) {
                                list15.remove(a17);
                            }
                            final View mView = c7.mView;
                            a16.startViewTransition(mView);
                            b12.addListener((Animator$AnimatorListener)new f(a16, mView, b10, a17, b11));
                            b12.setTarget((Object)mView);
                            b12.start();
                            if (d0.M(2)) {
                                final StringBuilder sb9 = new StringBuilder();
                                sb9.append("Animator from operation ");
                                sb9.append(a17);
                                sb9.append(" has started.");
                                Log.v(s2, sb9.toString());
                            }
                            ((d$c)b11).b.b((d$b)new g(b12, a17));
                            b9 = true;
                        }
                    }
                }
            }
        }
        for (final b b13 : list16) {
            final SpecialEffectsController$Operation a18 = ((d$c)b13).a;
            final Fragment c8 = a18.c;
            if (containsValue) {
                if (d0.M(2)) {
                    final StringBuilder sb10 = new StringBuilder();
                    sb10.append("Ignoring Animation set on ");
                    sb10.append(c8);
                    sb10.append(" as Animations cannot run alongside Transitions.");
                    Log.v(s2, sb10.toString());
                }
                ((d$c)b13).a();
            }
            else if (b9) {
                if (d0.M(2)) {
                    final StringBuilder sb11 = new StringBuilder();
                    sb11.append("Ignoring Animation set on ");
                    sb11.append(c8);
                    sb11.append(" as Animations cannot run alongside Animators.");
                    Log.v(s2, sb11.toString());
                }
                ((d$c)b13).a();
            }
            else {
                final View mView2 = c8.mView;
                final s$a c9 = b13.c(context);
                c9.getClass();
                final Animation a19 = c9.a;
                a19.getClass();
                if (a18.a != SpecialEffectsController$Operation$State.REMOVED) {
                    mView2.startAnimation(a19);
                    ((d$c)b13).a();
                }
                else {
                    a16.startViewTransition(mView2);
                    final s$b s$b = new s$b(a19, a16, mView2);
                    ((Animation)s$b).setAnimationListener((Animation$AnimationListener)new androidx.fragment.app.h(mView2, a16, b13, a18));
                    mView2.startAnimation((Animation)s$b);
                    if (d0.M(2)) {
                        final StringBuilder sb12 = new StringBuilder();
                        sb12.append("Animation from operation ");
                        sb12.append(a18);
                        sb12.append(" has started.");
                        Log.v(s2, sb12.toString());
                    }
                }
                ((d$c)b13).b.b((d$b)new i(mView2, a16, b13, a18));
            }
        }
        for (final SpecialEffectsController$Operation specialEffectsController$Operation13 : list15) {
            specialEffectsController$Operation13.a.applyState(specialEffectsController$Operation13.c.mView);
        }
        list15.clear();
        if (d0.M(2)) {
            final StringBuilder sb13 = new StringBuilder();
            sb13.append("Completed executing operations from ");
            sb13.append(specialEffectsController$Operation5);
            sb13.append(" to ");
            sb13.append(specialEffectsController$Operation2);
            Log.v(s2, sb13.toString());
        }
    }
    
    public static final class b extends d$c
    {
        public boolean c;
        public boolean d;
        public s$a e;
        
        public b(final SpecialEffectsController$Operation specialEffectsController$Operation, final d d, final boolean c) {
            super(specialEffectsController$Operation, d);
            this.d = false;
            this.c = c;
        }
        
        public final s$a c(final Context context) {
            if (this.d) {
                return this.e;
            }
            final SpecialEffectsController$Operation a = super.a;
            final Fragment c = a.c;
            final boolean b = a.a == SpecialEffectsController$Operation$State.VISIBLE;
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
            if (mContainer != null && ((View)mContainer).getTag(2131432189) != null) {
                ((View)c.mContainer).setTag(2131432189, (Object)null);
            }
            final ViewGroup mContainer2 = c.mContainer;
            if (mContainer2 != null && mContainer2.getLayoutTransition() != null) {
                goto Label_0543;
            }
            final Animation onCreateAnimation = c.onCreateAnimation(nextTransition, b, n);
            if (onCreateAnimation != null) {
                final s$a s$a = new s$a(onCreateAnimation);
                goto Label_0543;
            }
            final Animator onCreateAnimator = c.onCreateAnimator(nextTransition, b, n);
            if (onCreateAnimator != null) {
                final s$a s$a = new s$a(onCreateAnimator);
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
                                    n3 = 2130837510;
                                }
                                else {
                                    n3 = 2130837511;
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
                            n3 = 2130837508;
                        }
                        else {
                            n3 = 2130837509;
                        }
                    }
                    else if (b) {
                        n3 = 2130837512;
                    }
                    else {
                        n3 = 2130837513;
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
                    final s$a s$a = new s$a(loadAnimation);
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
                    final s$a s$a = new s$a(loadAnimator);
                    goto Label_0543;
                }
                goto Label_0543;
            }
            catch (final RuntimeException ex3) {}
        }
    }
    
    public static final class d extends d$c
    {
        public final Object c;
        public final boolean d;
        public final Object e;
        
        public d(final SpecialEffectsController$Operation specialEffectsController$Operation, final v3.d d, final boolean b, final boolean b2) {
            super(specialEffectsController$Operation, d);
            if (specialEffectsController$Operation.a == SpecialEffectsController$Operation$State.VISIBLE) {
                Object c;
                if (b) {
                    c = specialEffectsController$Operation.c.getReenterTransition();
                }
                else {
                    c = specialEffectsController$Operation.c.getEnterTransition();
                }
                this.c = c;
                boolean d2;
                if (b) {
                    d2 = specialEffectsController$Operation.c.getAllowReturnTransitionOverlap();
                }
                else {
                    d2 = specialEffectsController$Operation.c.getAllowEnterTransitionOverlap();
                }
                this.d = d2;
            }
            else {
                Object c2;
                if (b) {
                    c2 = specialEffectsController$Operation.c.getReturnTransition();
                }
                else {
                    c2 = specialEffectsController$Operation.c.getExitTransition();
                }
                this.c = c2;
                this.d = true;
            }
            if (b2) {
                if (b) {
                    this.e = specialEffectsController$Operation.c.getSharedElementReturnTransition();
                }
                else {
                    this.e = specialEffectsController$Operation.c.getSharedElementEnterTransition();
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
            final androidx.fragment.app.q0 a = o0.a;
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
