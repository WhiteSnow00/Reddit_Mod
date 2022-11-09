// 
// Decompiled by Procyon v0.6.0
// 

package androidx.fragment.app;

import android.os.BaseBundle;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.content.IntentSender;
import androidx.activity.result.h$b;
import android.content.Intent;
import androidx.activity.ComponentActivity;
import androidx.activity.result.h;
import android.os.Looper;
import java.io.FileDescriptor;
import android.content.Context;
import android.app.Activity;
import a4.k;
import androidx.core.app.PictureInPictureModeChangedInfo;
import androidx.core.app.OnPictureInPictureModeChangedProvider;
import androidx.core.app.MultiWindowModeChangedInfo;
import androidx.core.app.OnMultiWindowModeChangedProvider;
import android.content.res.Configuration;
import androidx.activity.result.g;
import m5.b$b;
import androidx.lifecycle.n0$b;
import androidx.lifecycle.q0;
import androidx.activity.l;
import androidx.lifecycle.p;
import androidx.lifecycle.q;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import ak0.m;
import java.io.Writer;
import java.io.PrintWriter;
import androidx.lifecycle.Lifecycle;
import a40.f;
import android.os.Parcelable;
import java.util.List;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashSet;
import java.util.Collection;
import java.util.Iterator;
import android.util.Log;
import android.view.MenuItem;
import android.view.MenuInflater;
import android.view.Menu;
import java.util.Collections;
import java.util.HashMap;
import androidx.activity.i;
import androidx.activity.j;
import java.util.concurrent.CopyOnWriteArrayList;
import android.os.Bundle;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import androidx.activity.OnBackPressedDispatcher;
import java.util.ArrayList;
import java.util.ArrayDeque;
import androidx.activity.result.e;

public abstract class d0
{
    public d0$e A;
    public e B;
    public e C;
    public e D;
    public ArrayDeque<l> E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public ArrayList<a> K;
    public ArrayList<Boolean> L;
    public ArrayList<Fragment> M;
    public g0 N;
    public d0$f O;
    public final ArrayList<o> a;
    public boolean b;
    public final m0 c;
    public ArrayList<a> d;
    public ArrayList<Fragment> e;
    public final y f;
    public OnBackPressedDispatcher g;
    public final d0$b h;
    public final AtomicInteger i;
    public final Map<String, c> j;
    public final Map<String, Bundle> k;
    public final Map<String, m> l;
    public ArrayList<n> m;
    public final z n;
    public final CopyOnWriteArrayList<h0> o;
    public final androidx.activity.j p;
    public final a0 q;
    public final b0 r;
    public final androidx.fragment.app.o s;
    public final d0$c t;
    public int u;
    public x<?> v;
    public t w;
    public Fragment x;
    public Fragment y;
    public d0$d z;
    
    public d0() {
        this.a = new ArrayList<o>();
        this.c = new m0(0);
        this.f = new y(this);
        this.h = new i() {
            public final void handleOnBackPressed() {
                final d0 a = d0.this;
                a.z(true);
                if (a.h.isEnabled()) {
                    a.S(-1, 0, null);
                }
                else {
                    a.g.b();
                }
            }
        };
        this.i = new AtomicInteger();
        this.j = Collections.synchronizedMap(new HashMap<String, c>());
        this.k = Collections.synchronizedMap(new HashMap<String, Bundle>());
        this.l = Collections.synchronizedMap(new HashMap<String, m>());
        this.n = new z(this);
        this.o = new CopyOnWriteArrayList<h0>();
        this.p = new androidx.activity.j((Object)this, 1);
        this.q = new a0(this);
        this.r = new b0(this);
        this.s = new androidx.fragment.app.o(this, 1);
        this.t = new a4.z() {
            public final void a(final Menu menu, final MenuInflater menuInflater) {
                d0.this.k(menu, menuInflater);
            }
            
            public final void b(final Menu menu) {
                d0.this.q(menu);
            }
            
            public final void c(final Menu menu) {
                d0.this.t(menu);
            }
            
            public final boolean d(final MenuItem menuItem) {
                return d0.this.p(menuItem);
            }
        };
        this.u = -1;
        this.z = new w() {};
        this.A = new x0() {};
        this.E = new ArrayDeque<l>();
        this.O = new Runnable() {
            @Override
            public final void run() {
                d0.this.z(true);
            }
        };
    }
    
    public static boolean M(final int n) {
        return Log.isLoggable("FragmentManager", n);
    }
    
    public static boolean N(final Fragment fragment) {
        final boolean mHasMenu = fragment.mHasMenu;
        final boolean b = true;
        if (mHasMenu) {
            final boolean b2 = b;
            if (fragment.mMenuVisible) {
                return b2;
            }
        }
        final Iterator iterator = fragment.mChildFragmentManager.c.f().iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final Fragment fragment2 = (Fragment)iterator.next();
            int n2 = n;
            if (fragment2 != null) {
                n2 = (N(fragment2) ? 1 : 0);
            }
            if ((n = n2) != 0) {
                final boolean b3 = true;
                return b3 && b;
            }
        }
        final boolean b3 = false;
        return b3 && b;
    }
    
    public static boolean O(final Fragment fragment) {
        boolean b = true;
        if (fragment == null) {
            return true;
        }
        final d0 mFragmentManager = fragment.mFragmentManager;
        if (!fragment.equals((Object)mFragmentManager.y) || !O(mFragmentManager.x)) {
            b = false;
        }
        return b;
    }
    
    public static void e0(final Fragment fragment) {
        if (M(2)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("show: ");
            sb.append(fragment);
            Log.v("FragmentManager", sb.toString());
        }
        if (fragment.mHidden) {
            fragment.mHidden = false;
            fragment.mHiddenChanged ^= true;
        }
    }
    
    public final void A(final o o, final boolean b) {
        if (b && (this.v == null || this.I)) {
            return;
        }
        this.y(b);
        if (o.a(this.K, this.L)) {
            this.b = true;
            try {
                this.V(this.K, this.L);
            }
            finally {
                this.e();
            }
        }
        this.h0();
        this.v();
        this.c.b();
    }
    
    public final void B(final ArrayList<a> list, final ArrayList<Boolean> list2, int i, final int n) {
        final boolean p4 = list.get(i).p;
        final ArrayList<Fragment> m = this.M;
        if (m == null) {
            this.M = new ArrayList<Fragment>();
        }
        else {
            m.clear();
        }
        this.M.addAll(this.c.g());
        Fragment fragment = this.y;
        int n2 = 0;
        int n3 = i;
        while (true) {
            int n4 = 1;
            if (n3 >= n) {
                break;
            }
            final a a = list.get(n3);
            Fragment fragment2;
            if (!list2.get(n3)) {
                final ArrayList<Fragment> j = this.M;
                int n5 = 0;
                while (true) {
                    fragment2 = fragment;
                    if (n5 >= a.a.size()) {
                        break;
                    }
                    final n0.a a2 = a.a.get(n5);
                    final int a3 = a2.a;
                    int n7 = 0;
                    int n8 = 0;
                    Label_0604: {
                        int n6 = 0;
                        Label_0585: {
                            if (a3 != (n6 = n4)) {
                                Label_0552: {
                                    Fragment b;
                                    if (a3 != 2) {
                                        if (a3 != 3 && a3 != 6) {
                                            if (a3 == 7) {
                                                n6 = 1;
                                                break Label_0585;
                                            }
                                            if (a3 != 8) {
                                                b = fragment;
                                                n7 = n5;
                                            }
                                            else {
                                                a.a.add(n5, new n0.a(9, fragment));
                                                a2.c = true;
                                                n7 = n5 + 1;
                                                b = a2.b;
                                            }
                                        }
                                        else {
                                            j.remove(a2.b);
                                            final Fragment b2 = a2.b;
                                            b = fragment;
                                            n7 = n5;
                                            if (b2 == fragment) {
                                                a.a.add(n5, new n0.a(b2, 9));
                                                n7 = n5 + 1;
                                                fragment = null;
                                                n8 = 1;
                                                break Label_0604;
                                            }
                                        }
                                    }
                                    else {
                                        final Fragment b3 = a2.b;
                                        final int mContainerId = b3.mContainerId;
                                        int k = j.size() - 1;
                                        int n9 = 0;
                                        while (k >= 0) {
                                            final Fragment fragment3 = j.get(k);
                                            int n10 = n9;
                                            Label_0516: {
                                                if (fragment3.mContainerId == mContainerId) {
                                                    if (fragment3 != b3) {
                                                        if (fragment3 == fragment) {
                                                            a.a.add(n5, new n0.a(9, fragment3));
                                                            ++n5;
                                                            fragment = null;
                                                        }
                                                        final n0.a a4 = new n0.a(3, fragment3);
                                                        a4.d = a2.d;
                                                        a4.f = a2.f;
                                                        a4.e = a2.e;
                                                        a4.g = a2.g;
                                                        a.a.add(n5, a4);
                                                        j.remove(fragment3);
                                                        ++n5;
                                                        break Label_0516;
                                                    }
                                                    n10 = 1;
                                                }
                                                n9 = n10;
                                            }
                                            --k;
                                        }
                                        if (n9 == 0) {
                                            a2.a = 1;
                                            a2.c = true;
                                            j.add(b3);
                                            n7 = n5;
                                            break Label_0552;
                                        }
                                        a.a.remove(n5);
                                        n7 = n5 - 1;
                                        b = fragment;
                                    }
                                    fragment = b;
                                }
                                n8 = 1;
                                break Label_0604;
                            }
                        }
                        j.add(a2.b);
                        n7 = n5;
                        n8 = n6;
                    }
                    final int n11 = n7 + n8;
                    n4 = n8;
                    n5 = n11;
                }
            }
            else {
                final ArrayList<Fragment> l = this.M;
                int n12 = a.a.size() - 1;
                while (true) {
                    fragment2 = fragment;
                    if (n12 < 0) {
                        break;
                    }
                    final n0.a a5 = a.a.get(n12);
                    final int a6 = a5.a;
                    Label_0777: {
                        Label_0766: {
                            if (a6 != 1) {
                                Label_0752: {
                                    if (a6 != 3) {
                                        switch (a6) {
                                            case 10: {
                                                a5.i = a5.h;
                                                break;
                                            }
                                            case 9: {
                                                fragment = a5.b;
                                                break;
                                            }
                                            case 8: {
                                                fragment = null;
                                                break;
                                            }
                                            case 6: {
                                                break Label_0752;
                                            }
                                            case 7: {
                                                break Label_0766;
                                            }
                                        }
                                        break Label_0777;
                                    }
                                }
                                l.add(a5.b);
                                break Label_0777;
                            }
                        }
                        l.remove(a5.b);
                    }
                    --n12;
                }
            }
            int n13;
            if (n2 == 0 && !a.g) {
                n13 = 0;
            }
            else {
                n13 = 1;
            }
            ++n3;
            fragment = fragment2;
            n2 = n13;
        }
        this.M.clear();
        if (!p4 && this.u >= 1) {
            for (int n14 = i; n14 < n; ++n14) {
                final Iterator<n0.a> iterator = list.get(n14).a.iterator();
                while (iterator.hasNext()) {
                    final Fragment b4 = ((n0.a)iterator.next()).b;
                    if (b4 != null && b4.mFragmentManager != null) {
                        this.c.h(this.g(b4));
                    }
                }
            }
        }
        for (int n15 = i; n15 < n; ++n15) {
            final a a7 = list.get(n15);
            if (list2.get(n15)) {
                a7.i(-1);
                for (int n16 = a7.a.size() - 1; n16 >= 0; --n16) {
                    final n0.a a8 = a7.a.get(n16);
                    final Fragment b5 = a8.b;
                    if (b5 != null) {
                        b5.mBeingSaved = false;
                        b5.setPopDirection(true);
                        final int f = a7.f;
                        final int n17 = 8197;
                        int nextTransition = 8194;
                        if (f != 4097) {
                            if (f != 8194) {
                                if (f != 8197) {
                                    nextTransition = 4099;
                                    if (f != 4099) {
                                        nextTransition = n17;
                                        if (f != 4100) {
                                            nextTransition = 0;
                                        }
                                    }
                                }
                                else {
                                    nextTransition = 4100;
                                }
                            }
                            else {
                                nextTransition = 4097;
                            }
                        }
                        b5.setNextTransition(nextTransition);
                        b5.setSharedElementNames((ArrayList)a7.o, (ArrayList)a7.n);
                    }
                    switch (a8.a) {
                        default: {
                            final StringBuilder k2 = a.k("Unknown cmd: ");
                            k2.append(a8.a);
                            throw new IllegalArgumentException(k2.toString());
                        }
                        case 10: {
                            a7.q.b0(b5, a8.h);
                            break;
                        }
                        case 9: {
                            a7.q.c0(b5);
                            break;
                        }
                        case 8: {
                            a7.q.c0(null);
                            break;
                        }
                        case 7: {
                            b5.setAnimations(a8.d, a8.e, a8.f, a8.g);
                            a7.q.Z(b5, true);
                            a7.q.h(b5);
                            break;
                        }
                        case 6: {
                            b5.setAnimations(a8.d, a8.e, a8.f, a8.g);
                            a7.q.d(b5);
                            break;
                        }
                        case 5: {
                            b5.setAnimations(a8.d, a8.e, a8.f, a8.g);
                            a7.q.Z(b5, true);
                            a7.q.L(b5);
                            break;
                        }
                        case 4: {
                            b5.setAnimations(a8.d, a8.e, a8.f, a8.g);
                            a7.q.getClass();
                            e0(b5);
                            break;
                        }
                        case 3: {
                            b5.setAnimations(a8.d, a8.e, a8.f, a8.g);
                            a7.q.a(b5);
                            break;
                        }
                        case 1: {
                            b5.setAnimations(a8.d, a8.e, a8.f, a8.g);
                            a7.q.Z(b5, true);
                            a7.q.U(b5);
                            break;
                        }
                    }
                }
            }
            else {
                a7.i(1);
                for (int size = a7.a.size(), n18 = 0; n18 < size; ++n18) {
                    final n0.a a9 = a7.a.get(n18);
                    final Fragment b6 = a9.b;
                    if (b6 != null) {
                        b6.setPopDirection(b6.mBeingSaved = false);
                        b6.setNextTransition(a7.f);
                        b6.setSharedElementNames((ArrayList)a7.n, (ArrayList)a7.o);
                    }
                    switch (a9.a) {
                        default: {
                            final StringBuilder k3 = a.k("Unknown cmd: ");
                            k3.append(a9.a);
                            throw new IllegalArgumentException(k3.toString());
                        }
                        case 10: {
                            a7.q.b0(b6, a9.i);
                            break;
                        }
                        case 9: {
                            a7.q.c0(null);
                            break;
                        }
                        case 8: {
                            a7.q.c0(b6);
                            break;
                        }
                        case 7: {
                            b6.setAnimations(a9.d, a9.e, a9.f, a9.g);
                            a7.q.Z(b6, false);
                            a7.q.d(b6);
                            break;
                        }
                        case 6: {
                            b6.setAnimations(a9.d, a9.e, a9.f, a9.g);
                            a7.q.h(b6);
                            break;
                        }
                        case 5: {
                            b6.setAnimations(a9.d, a9.e, a9.f, a9.g);
                            a7.q.Z(b6, false);
                            a7.q.getClass();
                            e0(b6);
                            break;
                        }
                        case 4: {
                            b6.setAnimations(a9.d, a9.e, a9.f, a9.g);
                            a7.q.L(b6);
                            break;
                        }
                        case 3: {
                            b6.setAnimations(a9.d, a9.e, a9.f, a9.g);
                            a7.q.U(b6);
                            break;
                        }
                        case 1: {
                            b6.setAnimations(a9.d, a9.e, a9.f, a9.g);
                            a7.q.Z(b6, false);
                            a7.q.a(b6);
                            break;
                        }
                    }
                }
            }
        }
        final int n19 = 0;
        final boolean booleanValue = list2.get(n - 1);
        for (int n20 = i; n20 < n; ++n20) {
            final a a10 = list.get(n20);
            if (booleanValue) {
                for (int n21 = a10.a.size() - 1; n21 >= 0; --n21) {
                    final Fragment b7 = ((n0.a)a10.a.get(n21)).b;
                    if (b7 != null) {
                        this.g(b7).k();
                    }
                }
            }
            else {
                final Iterator<n0.a> iterator2 = a10.a.iterator();
                while (iterator2.hasNext()) {
                    final Fragment b8 = ((n0.a)iterator2.next()).b;
                    if (b8 != null) {
                        this.g(b8).k();
                    }
                }
            }
        }
        this.Q(this.u, true);
        final HashSet<SpecialEffectsController> set = new HashSet<SpecialEffectsController>();
        for (int n22 = i; n22 < n; ++n22) {
            final Iterator<n0.a> iterator3 = list.get(n22).a.iterator();
            while (iterator3.hasNext()) {
                final Fragment b9 = ((n0.a)iterator3.next()).b;
                if (b9 != null) {
                    final ViewGroup mContainer = b9.mContainer;
                    if (mContainer == null) {
                        continue;
                    }
                    set.add(SpecialEffectsController.g(mContainer, this.K()));
                }
            }
        }
        for (final SpecialEffectsController specialEffectsController : set) {
            specialEffectsController.d = booleanValue;
            specialEffectsController.h();
            specialEffectsController.c();
        }
        while (i < n) {
            final a a11 = list.get(i);
            if (list2.get(i) && a11.s >= 0) {
                a11.s = -1;
            }
            a11.getClass();
            ++i;
        }
        if (n2 != 0 && this.m != null) {
            for (i = n19; i < this.m.size(); ++i) {
                this.m.get(i).onBackStackChanged();
            }
        }
    }
    
    public final Fragment C(final String s) {
        return this.c.c(s);
    }
    
    public final Fragment D(final int n) {
        final m0 c = this.c;
        int size = ((ArrayList)c.a).size();
        Fragment c2 = null;
    Label_0129:
        while (true) {
            final int n2 = size - 1;
            if (n2 < 0) {
                for (final l0 l0 : ((HashMap)c.b).values()) {
                    if (l0 != null) {
                        c2 = l0.c;
                        if (c2.mFragmentId == n) {
                            break Label_0129;
                        }
                        continue;
                    }
                }
                c2 = null;
                break;
            }
            c2 = ((ArrayList)c.a).get(n2);
            size = n2;
            if (c2 == null) {
                continue;
            }
            size = n2;
            if (c2.mFragmentId == n) {
                break;
            }
        }
        return c2;
    }
    
    public final Fragment E(final String s) {
        final m0 c = this.c;
        if (s != null) {
            int size = ((ArrayList)c.a).size();
            while (true) {
                final int n = size - 1;
                if (n < 0) {
                    break;
                }
                final Fragment fragment = ((ArrayList)c.a).get(n);
                size = n;
                if (fragment == null) {
                    continue;
                }
                size = n;
                if (s.equals(fragment.mTag)) {
                    return fragment;
                }
            }
        }
        if (s != null) {
            for (final l0 l0 : ((HashMap)c.b).values()) {
                if (l0 != null) {
                    final Fragment c2 = l0.c;
                    if (s.equals(c2.mTag)) {
                        return c2;
                    }
                    continue;
                }
            }
        }
        else {
            c.getClass();
        }
        return null;
    }
    
    public final void F() {
        for (final SpecialEffectsController specialEffectsController : this.f()) {
            if (specialEffectsController.e) {
                if (M(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                specialEffectsController.e = false;
                specialEffectsController.c();
            }
        }
    }
    
    public final int G() {
        final ArrayList<a> d = this.d;
        int size;
        if (d != null) {
            size = d.size();
        }
        else {
            size = 0;
        }
        return size;
    }
    
    public final ViewGroup H(final Fragment fragment) {
        final ViewGroup mContainer = fragment.mContainer;
        if (mContainer != null) {
            return mContainer;
        }
        if (fragment.mContainerId <= 0) {
            return null;
        }
        if (this.w.c()) {
            final View b = this.w.b(fragment.mContainerId);
            if (b instanceof ViewGroup) {
                return (ViewGroup)b;
            }
        }
        return null;
    }
    
    public final w I() {
        final Fragment x = this.x;
        if (x != null) {
            return x.mFragmentManager.I();
        }
        return this.z;
    }
    
    public final List<Fragment> J() {
        return this.c.g();
    }
    
    public final x0 K() {
        final Fragment x = this.x;
        if (x != null) {
            return x.mFragmentManager.K();
        }
        return this.A;
    }
    
    public final void L(final Fragment fragment) {
        if (M(2)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("hide: ");
            sb.append(fragment);
            Log.v("FragmentManager", sb.toString());
        }
        if (!fragment.mHidden) {
            fragment.mHidden = true;
            fragment.mHiddenChanged ^= true;
            this.d0(fragment);
        }
    }
    
    public final boolean P() {
        return this.G || this.H;
    }
    
    public final void Q(int u, final boolean b) {
        if (this.v == null && u != -1) {
            throw new IllegalStateException("No activity");
        }
        if (!b && u == this.u) {
            return;
        }
        this.u = u;
        final m0 c = this.c;
        final Iterator iterator = ((ArrayList)c.a).iterator();
        while (iterator.hasNext()) {
            final l0 l0 = ((HashMap)c.b).get(((Fragment)iterator.next()).mWho);
            if (l0 != null) {
                l0.k();
            }
        }
        final Iterator iterator2 = ((HashMap)c.b).values().iterator();
        while (true) {
            final boolean hasNext = iterator2.hasNext();
            final int n = 0;
            if (!hasNext) {
                break;
            }
            final l0 l2 = (l0)iterator2.next();
            if (l2 == null) {
                continue;
            }
            l2.k();
            final Fragment c2 = l2.c;
            u = n;
            if (c2.mRemoving) {
                u = n;
                if (!c2.isInBackStack()) {
                    u = 1;
                }
            }
            if (u == 0) {
                continue;
            }
            if (c2.mBeingSaved && !((HashMap)c.c).containsKey(c2.mWho)) {
                l2.o();
            }
            c.i(l2);
        }
        this.f0();
        if (this.F) {
            final x<?> v = this.v;
            if (v != null && this.u == 7) {
                v.g();
                this.F = false;
            }
        }
    }
    
    public final void R() {
        if (this.v == null) {
            return;
        }
        this.G = false;
        this.H = false;
        this.N.i = false;
        for (final Fragment fragment : this.c.g()) {
            if (fragment != null) {
                fragment.noteStateNotSaved();
            }
        }
    }
    
    public final boolean S(final int n, final int n2, final String s) {
        this.z(false);
        this.y(true);
        final Fragment y = this.y;
        if (y != null && n < 0 && s == null && y.getChildFragmentManager().S(-1, 0, null)) {
            return true;
        }
        final boolean t = this.T(this.K, this.L, s, n, n2);
        if (t) {
            this.b = true;
            try {
                this.V(this.K, this.L);
            }
            finally {
                this.e();
            }
        }
        this.h0();
        this.v();
        this.c.b();
        return t;
    }
    
    public final boolean T(final ArrayList<a> list, final ArrayList<Boolean> list2, final String s, int i, int j) {
        final boolean b = (j & 0x1) != 0x0;
        final ArrayList<a> d = this.d;
        final int n = j = -1;
        if (d != null) {
            if (d.isEmpty()) {
                j = n;
            }
            else if (s == null && i < 0) {
                if (b) {
                    j = 0;
                }
                else {
                    j = -1 + this.d.size();
                }
            }
            else {
                a a;
                for (j = this.d.size() - 1; j >= 0; --j) {
                    a = this.d.get(j);
                    if (s != null && s.equals(a.i)) {
                        break;
                    }
                    if (i >= 0 && i == a.s) {
                        break;
                    }
                }
                if (j >= 0) {
                    if (b) {
                        int n2 = j;
                        while (true) {
                            j = n2;
                            if (n2 <= 0) {
                                break;
                            }
                            final ArrayList<a> d2 = this.d;
                            final int n3 = n2 - 1;
                            final a a2 = d2.get(n3);
                            if (s == null || !s.equals(a2.i)) {
                                j = n2;
                                if (i < 0) {
                                    break;
                                }
                                j = n2;
                                if (i != a2.s) {
                                    break;
                                }
                            }
                            n2 = n3;
                        }
                    }
                    else if (j == this.d.size() - 1) {
                        j = n;
                    }
                    else {
                        ++j;
                    }
                }
            }
        }
        if (j < 0) {
            return false;
        }
        for (i = this.d.size() - 1; i >= j; --i) {
            list.add(this.d.remove(i));
            list2.add(Boolean.TRUE);
        }
        return true;
    }
    
    public final void U(final Fragment fragment) {
        if (M(2)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("remove: ");
            sb.append(fragment);
            sb.append(" nesting=");
            sb.append(fragment.mBackStackNesting);
            Log.v("FragmentManager", sb.toString());
        }
        final boolean inBackStack = fragment.isInBackStack();
        if (fragment.mDetached && !(inBackStack ^ true)) {
            return;
        }
        final m0 c = this.c;
        synchronized ((ArrayList)c.a) {
            ((ArrayList)c.a).remove(fragment);
            monitorexit((ArrayList)c.a);
            fragment.mAdded = false;
            if (N(fragment)) {
                this.F = true;
            }
            fragment.mRemoving = true;
            this.d0(fragment);
        }
    }
    
    public final void V(final ArrayList<a> list, final ArrayList<Boolean> list2) {
        if (list.isEmpty()) {
            return;
        }
        if (list.size() == list2.size()) {
            final int size = list.size();
            int i = 0;
            int n = 0;
            while (i < size) {
                int n2 = i;
                int n3 = n;
                if (!((a)list.get(i)).p) {
                    if (n != i) {
                        this.B(list, list2, n, i);
                    }
                    int n4 = n3 = i + 1;
                    if (list2.get(i)) {
                        while ((n3 = n4) < size) {
                            n3 = n4;
                            if (!(boolean)list2.get(n4)) {
                                break;
                            }
                            n3 = n4;
                            if (((a)list.get(n4)).p) {
                                break;
                            }
                            ++n4;
                        }
                    }
                    this.B(list, list2, i, n3);
                    n2 = n3 - 1;
                }
                i = n2 + 1;
                n = n3;
            }
            if (n != size) {
                this.B(list, list2, n, size);
            }
            return;
        }
        throw new IllegalStateException("Internal error with the back stack records");
    }
    
    public final void W(final Parcelable parcelable) {
        final Bundle bundle = (Bundle)parcelable;
        for (final String s : ((BaseBundle)bundle).keySet()) {
            if (s.startsWith("result_")) {
                final Bundle bundle2 = bundle.getBundle(s);
                if (bundle2 == null) {
                    continue;
                }
                bundle2.setClassLoader(this.v.g.getClassLoader());
                this.k.put(s.substring(7), bundle2);
            }
        }
        final ArrayList<k0> list = new ArrayList<k0>();
        for (final String s2 : ((BaseBundle)bundle).keySet()) {
            if (s2.startsWith("fragment_")) {
                final Bundle bundle3 = bundle.getBundle(s2);
                if (bundle3 == null) {
                    continue;
                }
                bundle3.setClassLoader(this.v.g.getClassLoader());
                list.add((k0)bundle3.getParcelable("state"));
            }
        }
        final m0 c = this.c;
        ((HashMap)c.c).clear();
        for (final k0 k0 : list) {
            ((HashMap)c.c).put(k0.g, k0);
        }
        final f0 f0 = (f0)bundle.getParcelable("state");
        if (f0 == null) {
            return;
        }
        ((HashMap)this.c.b).clear();
        final Iterator<String> iterator4 = f0.f.iterator();
        while (iterator4.hasNext()) {
            final k0 j = this.c.j(iterator4.next(), null);
            if (j != null) {
                final Fragment fragment = this.N.d.get(j.g);
                l0 l0;
                if (fragment != null) {
                    if (M(2)) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("restoreSaveState: re-attaching retained ");
                        sb.append(fragment);
                        Log.v("FragmentManager", sb.toString());
                    }
                    l0 = new l0(this.n, this.c, fragment, j);
                }
                else {
                    l0 = new l0(this.n, this.c, this.v.g.getClassLoader(), this.I(), j);
                }
                final Fragment c2 = l0.c;
                c2.mFragmentManager = this;
                if (M(2)) {
                    final StringBuilder i = a.k("restoreSaveState: active (");
                    i.append(c2.mWho);
                    i.append("): ");
                    i.append(c2);
                    Log.v("FragmentManager", i.toString());
                }
                l0.m(this.v.g.getClassLoader());
                this.c.h(l0);
                l0.e = this.u;
            }
        }
        final g0 n = this.N;
        n.getClass();
        final Iterator iterator5 = new ArrayList(n.d.values()).iterator();
        int n2;
        while (true) {
            final boolean hasNext = iterator5.hasNext();
            n2 = 0;
            boolean b = false;
            if (!hasNext) {
                break;
            }
            final Fragment fragment2 = (Fragment)iterator5.next();
            if (((HashMap)this.c.b).get(fragment2.mWho) != null) {
                b = true;
            }
            if (b) {
                continue;
            }
            if (M(2)) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("Discarding retained Fragment ");
                sb2.append(fragment2);
                sb2.append(" that was not found in the set of active Fragments ");
                sb2.append(f0.f);
                Log.v("FragmentManager", sb2.toString());
            }
            this.N.f(fragment2);
            fragment2.mFragmentManager = this;
            final l0 l2 = new l0(this.n, this.c, fragment2);
            l2.e = 1;
            l2.k();
            fragment2.mRemoving = true;
            l2.k();
        }
        final m0 c3 = this.c;
        final ArrayList<String> g = f0.g;
        ((ArrayList)c3.a).clear();
        if (g != null) {
            for (final String s3 : g) {
                final Fragment c4 = c3.c(s3);
                if (c4 == null) {
                    throw new IllegalStateException(a40.f.n("No instantiated fragment for (", s3, ")"));
                }
                if (M(2)) {
                    final StringBuilder sb3 = new StringBuilder();
                    sb3.append("restoreSaveState: added (");
                    sb3.append(s3);
                    sb3.append("): ");
                    sb3.append(c4);
                    Log.v("FragmentManager", sb3.toString());
                }
                c3.a(c4);
            }
        }
        if (f0.h != null) {
            this.d = new ArrayList<a>(f0.h.length);
            int n3 = 0;
            while (true) {
                final b[] h = f0.h;
                if (n3 >= h.length) {
                    break;
                }
                final b b2 = h[n3];
                b2.getClass();
                final a a = new a(this);
                int n5;
                int n12;
                for (int n4 = n5 = 0; n4 < b2.f.length; n4 = n12 + 1) {
                    final n0.a a2 = new n0.a();
                    final int[] f2 = b2.f;
                    final int n6 = n4 + 1;
                    a2.a = f2[n4];
                    if (M(2)) {
                        final StringBuilder sb4 = new StringBuilder();
                        sb4.append("Instantiate ");
                        sb4.append(a);
                        sb4.append(" op #");
                        sb4.append(n5);
                        sb4.append(" base fragment #");
                        sb4.append(b2.f[n6]);
                        Log.v("FragmentManager", sb4.toString());
                    }
                    a2.h = Lifecycle.State.values()[b2.h[n5]];
                    a2.i = Lifecycle.State.values()[b2.i[n5]];
                    final int[] f3 = b2.f;
                    final int n7 = n6 + 1;
                    a2.c = (f3[n6] != 0);
                    final int n8 = n7 + 1;
                    final int n9 = f3[n7];
                    a2.d = n9;
                    final int n10 = n8 + 1;
                    final int n11 = f3[n8];
                    a2.e = n11;
                    n12 = n10 + 1;
                    final int n13 = f3[n10];
                    a2.f = n13;
                    final int n14 = f3[n12];
                    a2.g = n14;
                    a.b = n9;
                    a.c = n11;
                    a.d = n13;
                    a.e = n14;
                    a.b(a2);
                    ++n5;
                }
                a.f = b2.j;
                a.i = b2.k;
                a.g = true;
                a.j = b2.m;
                a.k = b2.n;
                a.l = b2.o;
                a.m = b2.p;
                a.n = b2.q;
                a.o = b2.r;
                a.p = b2.s;
                a.s = b2.l;
                for (int n15 = 0; n15 < b2.g.size(); ++n15) {
                    final String s4 = b2.g.get(n15);
                    if (s4 != null) {
                        ((n0.a)a.a.get(n15)).b = this.C(s4);
                    }
                }
                a.i(1);
                if (M(2)) {
                    final StringBuilder p = d.p("restoreAllState: back stack #", n3, " (index ");
                    p.append(a.s);
                    p.append("): ");
                    p.append(a);
                    Log.v("FragmentManager", p.toString());
                    final PrintWriter printWriter = new PrintWriter(new w0());
                    a.n("  ", printWriter, false);
                    printWriter.close();
                }
                this.d.add(a);
                ++n3;
            }
        }
        else {
            this.d = null;
        }
        this.i.set(f0.i);
        final String m = f0.j;
        if (m != null) {
            this.r(this.y = this.C(m));
        }
        final ArrayList<String> k2 = f0.k;
        if (k2 != null) {
            for (int n16 = n2; n16 < k2.size(); ++n16) {
                this.j.put((String)k2.get(n16), f0.l.get(n16));
            }
        }
        this.E = new ArrayDeque<l>(f0.m);
    }
    
    public final Bundle X() {
        final Bundle bundle = new Bundle();
        this.F();
        final Iterator iterator = this.f().iterator();
        while (iterator.hasNext()) {
            ((SpecialEffectsController)iterator.next()).e();
        }
        this.z(true);
        this.G = true;
        this.N.i = true;
        final m0 c = this.c;
        c.getClass();
        final ArrayList f = new ArrayList<String>(((HashMap)c.b).size());
        for (final l0 l0 : ((HashMap)c.b).values()) {
            if (l0 != null) {
                final Object h = l0.c;
                l0.o();
                f.add(((Fragment)h).mWho);
                if (!M(2)) {
                    continue;
                }
                final StringBuilder sb = new StringBuilder();
                sb.append("Saved state of ");
                sb.append(h);
                sb.append(": ");
                sb.append(((Fragment)h).mSavedFragmentState);
                Log.v("FragmentManager", sb.toString());
            }
        }
        final m0 c2 = this.c;
        c2.getClass();
        final ArrayList list = new ArrayList(((HashMap)c2.c).values());
        if (list.isEmpty()) {
            if (M(2)) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
                return bundle;
            }
            return bundle;
        }
        final m0 c3 = this.c;
        Object h = c3.a;
        synchronized (h) {
            final boolean empty = ((ArrayList)c3.a).isEmpty();
            final b[] array = null;
            ArrayList<String> g;
            if (empty) {
                monitorexit(h);
                g = null;
            }
            else {
                g = new ArrayList<String>(((ArrayList)c3.a).size());
                for (final Fragment fragment : (ArrayList)c3.a) {
                    g.add(fragment.mWho);
                    if (M(2)) {
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append("saveAllState: adding fragment (");
                        sb2.append(fragment.mWho);
                        sb2.append("): ");
                        sb2.append(fragment);
                        Log.v("FragmentManager", sb2.toString());
                    }
                }
                monitorexit(h);
            }
            final ArrayList<a> d = this.d;
            h = array;
            if (d != null) {
                final int size = d.size();
                h = array;
                if (size > 0) {
                    final b[] array2 = new b[size];
                    int n = 0;
                    while (true) {
                        h = array2;
                        if (n >= size) {
                            break;
                        }
                        array2[n] = new b(this.d.get(n));
                        if (M(2)) {
                            h = d.p("saveAllState: adding back stack #", n, ": ");
                            ((StringBuilder)h).append(this.d.get(n));
                            Log.v("FragmentManager", ((StringBuilder)h).toString());
                        }
                        ++n;
                    }
                }
            }
            final f0 f2 = new f0();
            f2.f = (ArrayList<String>)f;
            f2.g = g;
            f2.h = (b[])h;
            f2.i = this.i.get();
            final Fragment y = this.y;
            if (y != null) {
                f2.j = y.mWho;
            }
            f2.k.addAll(this.j.keySet());
            f2.l.addAll(this.j.values());
            f2.m = new ArrayList<l>((Collection<? extends l>)this.E);
            bundle.putParcelable("state", (Parcelable)f2);
            final Iterator<String> iterator4 = this.k.keySet().iterator();
            while (iterator4.hasNext()) {
                h = iterator4.next();
                bundle.putBundle(ak0.m.l("result_", (String)h), (Bundle)this.k.get(h));
            }
            final Iterator iterator5 = list.iterator();
            while (iterator5.hasNext()) {
                h = iterator5.next();
                final Bundle bundle2 = new Bundle();
                bundle2.putParcelable("state", (Parcelable)h);
                final StringBuilder k = a.k("fragment_");
                k.append(((k0)h).g);
                bundle.putBundle(k.toString(), bundle2);
            }
            return bundle;
        }
    }
    
    public final void Y() {
        synchronized (this.a) {
            final int size = this.a.size();
            boolean b = true;
            if (size != 1) {
                b = false;
            }
            if (b) {
                this.v.h.removeCallbacks((Runnable)this.O);
                this.v.h.post((Runnable)this.O);
                this.h0();
            }
        }
    }
    
    public final void Z(final Fragment fragment, final boolean b) {
        final ViewGroup h = this.H(fragment);
        if (h != null && h instanceof u) {
            ((u)h).setDrawDisappearingViewsLast(b ^ true);
        }
    }
    
    public final l0 a(final Fragment fragment) {
        final String mPreviousWho = fragment.mPreviousWho;
        if (mPreviousWho != null) {
            FragmentStrictMode.d(fragment, mPreviousWho);
        }
        if (M(2)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("add: ");
            sb.append(fragment);
            Log.v("FragmentManager", sb.toString());
        }
        final l0 g = this.g(fragment);
        fragment.mFragmentManager = this;
        this.c.h(g);
        if (!fragment.mDetached) {
            this.c.a(fragment);
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (N(fragment)) {
                this.F = true;
            }
        }
        return g;
    }
    
    public final void a0(final q q, final tl1.i i) {
        final Lifecycle lifecycle = q.getLifecycle();
        if (lifecycle.b() == Lifecycle.State.DESTROYED) {
            return;
        }
        final FragmentManager$6 fragmentManager$6 = new FragmentManager$6(this, i, lifecycle);
        lifecycle.a((androidx.lifecycle.p)fragmentManager$6);
        final m m = this.l.put("bottom_list_dialog_request", new m(lifecycle, i, (androidx.lifecycle.o)fragmentManager$6));
        if (m != null) {
            m.f.c((androidx.lifecycle.p)m.h);
        }
        if (M(2)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Setting FragmentResultListener with key ");
            sb.append("bottom_list_dialog_request");
            sb.append(" lifecycleOwner ");
            sb.append(lifecycle);
            sb.append(" and listener ");
            sb.append(i);
            Log.v("FragmentManager", sb.toString());
        }
    }
    
    public final void b(final n n) {
        if (this.m == null) {
            this.m = new ArrayList<n>();
        }
        this.m.add(n);
    }
    
    public final void b0(final Fragment fragment, final Lifecycle.State mMaxState) {
        if (fragment.equals((Object)this.C(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this)) {
            fragment.mMaxState = mMaxState;
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(fragment);
        sb.append(" is not an active fragment of FragmentManager ");
        sb.append(this);
        throw new IllegalArgumentException(sb.toString());
    }
    
    public final void c(final x<?> v, final t w, final Fragment x) {
        if (this.v == null) {
            this.v = v;
            this.w = w;
            if ((this.x = x) != null) {
                this.o.add(new h0() {
                    @Override
                    public final void a(final Fragment fragment) {
                        x.onAttachFragment(fragment);
                    }
                });
            }
            else if (v instanceof h0) {
                this.o.add((h0)v);
            }
            if (this.x != null) {
                this.h0();
            }
            if (v instanceof androidx.activity.l) {
                Object o = v;
                final OnBackPressedDispatcher onBackPressedDispatcher = ((androidx.activity.l)o).getOnBackPressedDispatcher();
                this.g = onBackPressedDispatcher;
                if (x != null) {
                    o = x;
                }
                onBackPressedDispatcher.a((q)o, (i)this.h);
            }
            if (x != null) {
                final g0 n = x.mFragmentManager.N;
                g0 n2;
                if ((n2 = n.e.get(x.mWho)) == null) {
                    n2 = new g0(n.g);
                    n.e.put(x.mWho, n2);
                }
                this.N = n2;
            }
            else if (v instanceof q0) {
                this.N = (g0)new androidx.lifecycle.n0(((q0)v).getViewModelStore(), (n0$b)g0.j).a((Class)g0.class);
            }
            else {
                this.N = new g0(false);
            }
            this.N.i = this.P();
            this.c.d = this.N;
            final x<?> v2 = this.v;
            if (v2 instanceof m5.d && x == null) {
                final m5.b savedStateRegistry = ((m5.d)v2).getSavedStateRegistry();
                savedStateRegistry.c("android:support:fragments", (b$b)new c0(this, 0));
                final Bundle a = savedStateRegistry.a("android:support:fragments");
                if (a != null) {
                    this.W((Parcelable)a);
                }
            }
            final x<?> v3 = this.v;
            if (v3 instanceof g) {
                final androidx.activity.result.f activityResultRegistry = ((g)v3).getActivityResultRegistry();
                String j;
                if (x != null) {
                    j = a2.b.j(new StringBuilder(), x.mWho, ":");
                }
                else {
                    j = "";
                }
                final String l = ak0.m.l("FragmentManager:", j);
                this.B = activityResultRegistry.d(ak0.m.l(l, "StartActivityForResult"), (f.a)new f.d(), (androidx.activity.result.b)new androidx.activity.result.b<androidx.activity.result.a>() {
                    public final void a(final Object o) {
                        final androidx.activity.result.a a = (androidx.activity.result.a)o;
                        final l l = d0.this.E.pollFirst();
                        if (l == null) {
                            final StringBuilder sb = new StringBuilder();
                            sb.append("No Activities were started for result for ");
                            sb.append(this);
                            Log.w("FragmentManager", sb.toString());
                        }
                        else {
                            final String f = l.f;
                            final int g = l.g;
                            final Fragment d = d0.this.c.d(f);
                            if (d == null) {
                                final StringBuilder sb2 = new StringBuilder();
                                sb2.append("Activity result delivered for unknown Fragment ");
                                sb2.append(f);
                                Log.w("FragmentManager", sb2.toString());
                            }
                            else {
                                d.onActivityResult(g, a.f, a.g);
                            }
                        }
                    }
                });
                this.C = activityResultRegistry.d(ak0.m.l(l, "StartIntentSenderForResult"), (f.a)new j(), (androidx.activity.result.b)new androidx.activity.result.b<androidx.activity.result.a>() {
                    public final void a(final Object o) {
                        final androidx.activity.result.a a = (androidx.activity.result.a)o;
                        final l l = d0.this.E.pollFirst();
                        if (l == null) {
                            final StringBuilder sb = new StringBuilder();
                            sb.append("No IntentSenders were started for ");
                            sb.append(this);
                            Log.w("FragmentManager", sb.toString());
                        }
                        else {
                            final String f = l.f;
                            final int g = l.g;
                            final Fragment d = d0.this.c.d(f);
                            if (d == null) {
                                final StringBuilder sb2 = new StringBuilder();
                                sb2.append("Intent Sender result delivered for unknown Fragment ");
                                sb2.append(f);
                                Log.w("FragmentManager", sb2.toString());
                            }
                            else {
                                d.onActivityResult(g, a.f, a.g);
                            }
                        }
                    }
                });
                this.D = activityResultRegistry.d(ak0.m.l(l, "RequestPermissions"), (f.a)new f.c(), (androidx.activity.result.b)new androidx.activity.result.b<Map<String, Boolean>>() {
                    public final void a(Object o) {
                        final Map map = (Map)o;
                        final String[] array = (String[])map.keySet().toArray(new String[0]);
                        final ArrayList list = new ArrayList(map.values());
                        final int[] array2 = new int[list.size()];
                        for (int i = 0; i < list.size(); ++i) {
                            int n;
                            if (list.get(i)) {
                                n = 0;
                            }
                            else {
                                n = -1;
                            }
                            array2[i] = n;
                        }
                        final l l = d0.this.E.pollFirst();
                        if (l == null) {
                            o = new StringBuilder();
                            ((StringBuilder)o).append("No permissions were requested for ");
                            ((StringBuilder)o).append(this);
                            Log.w("FragmentManager", ((StringBuilder)o).toString());
                        }
                        else {
                            final String f = l.f;
                            final int g = l.g;
                            final Fragment d = d0.this.c.d(f);
                            if (d == null) {
                                o = new StringBuilder();
                                ((StringBuilder)o).append("Permission request result delivered for unknown Fragment ");
                                ((StringBuilder)o).append(f);
                                Log.w("FragmentManager", ((StringBuilder)o).toString());
                            }
                            else {
                                d.onRequestPermissionsResult(g, array, array2);
                            }
                        }
                    }
                });
            }
            final x<?> v4 = this.v;
            if (v4 instanceof n3.c) {
                ((n3.c)v4).addOnConfigurationChangedListener((z3.a<Configuration>)this.p);
            }
            final x<?> v5 = this.v;
            if (v5 instanceof n3.d) {
                ((n3.d)v5).addOnTrimMemoryListener(this.q);
            }
            final x<?> v6 = this.v;
            if (v6 instanceof OnMultiWindowModeChangedProvider) {
                ((OnMultiWindowModeChangedProvider)v6).addOnMultiWindowModeChangedListener(this.r);
            }
            final x<?> v7 = this.v;
            if (v7 instanceof OnPictureInPictureModeChangedProvider) {
                ((OnPictureInPictureModeChangedProvider)v7).addOnPictureInPictureModeChangedListener(this.s);
            }
            final x<?> v8 = this.v;
            if (v8 instanceof a4.k && x == null) {
                ((a4.k)v8).addMenuProvider((a4.z)this.t);
            }
            return;
        }
        throw new IllegalStateException("Already attached");
    }
    
    public final void c0(final Fragment y) {
        Label_0085: {
            if (y != null) {
                if (y.equals((Object)this.C(y.mWho))) {
                    if (y.mHost == null) {
                        break Label_0085;
                    }
                    if (y.mFragmentManager == this) {
                        break Label_0085;
                    }
                }
                final StringBuilder sb = new StringBuilder();
                sb.append("Fragment ");
                sb.append(y);
                sb.append(" is not an active fragment of FragmentManager ");
                sb.append(this);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        final Fragment y2 = this.y;
        this.y = y;
        this.r(y2);
        this.r(this.y);
    }
    
    public final void d(final Fragment fragment) {
        if (M(2)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("attach: ");
            sb.append(fragment);
            Log.v("FragmentManager", sb.toString());
        }
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (!fragment.mAdded) {
                this.c.a(fragment);
                if (M(2)) {
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("add from attach: ");
                    sb2.append(fragment);
                    Log.v("FragmentManager", sb2.toString());
                }
                if (N(fragment)) {
                    this.F = true;
                }
            }
        }
    }
    
    public final void d0(final Fragment fragment) {
        final ViewGroup h = this.H(fragment);
        if (h != null && fragment.getPopExitAnim() + (fragment.getPopEnterAnim() + (fragment.getExitAnim() + fragment.getEnterAnim())) > 0) {
            if (((View)h).getTag(2131432188) == null) {
                ((View)h).setTag(2131432188, (Object)fragment);
            }
            ((Fragment)((View)h).getTag(2131432188)).setPopDirection(fragment.getPopDirection());
        }
    }
    
    public final void e() {
        this.b = false;
        this.L.clear();
        this.K.clear();
    }
    
    public final HashSet f() {
        final HashSet set = new HashSet();
        final Iterator iterator = this.c.e().iterator();
        while (iterator.hasNext()) {
            final ViewGroup mContainer = ((l0)iterator.next()).c.mContainer;
            if (mContainer != null) {
                set.add(SpecialEffectsController.g(mContainer, this.K()));
            }
        }
        return set;
    }
    
    public final void f0() {
        for (final l0 l0 : this.c.e()) {
            final Fragment c = l0.c;
            if (c.mDeferStart) {
                if (this.b) {
                    this.J = true;
                }
                else {
                    c.mDeferStart = false;
                    l0.k();
                }
            }
        }
    }
    
    public final l0 g(final Fragment fragment) {
        final l0 l0 = ((HashMap)this.c.b).get(fragment.mWho);
        if (l0 != null) {
            return l0;
        }
        final l0 l2 = new l0(this.n, this.c, fragment);
        l2.m(this.v.g.getClassLoader());
        l2.e = this.u;
        return l2;
    }
    
    public final void g0(final k k) {
        final z n = this.n;
        final CopyOnWriteArrayList<z.a> a = n.a;
        monitorenter(a);
        int i = 0;
        try {
            while (i < n.a.size()) {
                if (((z.a)n.a.get(i)).a == k) {
                    n.a.remove(i);
                    break;
                }
                ++i;
            }
        }
        finally {
            monitorexit(a);
        }
    }
    
    public final void h(final Fragment fragment) {
        if (M(2)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("detach: ");
            sb.append(fragment);
            Log.v("FragmentManager", sb.toString());
        }
        if (!fragment.mDetached) {
            fragment.mDetached = true;
            if (fragment.mAdded) {
                if (M(2)) {
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("remove from detach: ");
                    sb2.append(fragment);
                    Log.v("FragmentManager", sb2.toString());
                }
                final m0 c = this.c;
                synchronized ((ArrayList)c.a) {
                    ((ArrayList)c.a).remove(fragment);
                    monitorexit((ArrayList)c.a);
                    fragment.mAdded = false;
                    if (N(fragment)) {
                        this.F = true;
                    }
                    this.d0(fragment);
                }
            }
        }
    }
    
    public final void h0() {
        synchronized (this.a) {
            final boolean empty = this.a.isEmpty();
            boolean enabled = true;
            if (!empty) {
                this.h.setEnabled(true);
                return;
            }
            monitorexit(this.a);
            final i h = this.h;
            if (this.G() <= 0 || !O(this.x)) {
                enabled = false;
            }
            h.setEnabled(enabled);
        }
    }
    
    public final void i(final Configuration configuration) {
        for (final Fragment fragment : this.c.g()) {
            if (fragment != null) {
                fragment.performConfigurationChanged(configuration);
            }
        }
    }
    
    public final boolean j(final MenuItem menuItem) {
        if (this.u < 1) {
            return false;
        }
        for (final Fragment fragment : this.c.g()) {
            if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }
    
    public final boolean k(final Menu menu, final MenuInflater menuInflater) {
        final int u = this.u;
        int i = 0;
        if (u < 1) {
            return false;
        }
        ArrayList e = null;
        final Iterator iterator = this.c.g().iterator();
        boolean b = false;
        while (iterator.hasNext()) {
            final Fragment fragment = (Fragment)iterator.next();
            if (fragment != null && fragment.isMenuVisible() && fragment.performCreateOptionsMenu(menu, menuInflater)) {
                ArrayList list;
                if ((list = e) == null) {
                    list = new ArrayList();
                }
                list.add(fragment);
                b = true;
                e = list;
            }
        }
        if (this.e != null) {
            while (i < this.e.size()) {
                final Fragment fragment2 = this.e.get(i);
                if (e == null || !e.contains(fragment2)) {
                    fragment2.onDestroyOptionsMenu();
                }
                ++i;
            }
        }
        this.e = e;
        return b;
    }
    
    public final void l() {
        boolean h = true;
        this.z(this.I = true);
        final Iterator iterator = this.f().iterator();
        while (iterator.hasNext()) {
            ((SpecialEffectsController)iterator.next()).e();
        }
        final x<?> v = this.v;
        if (v instanceof q0) {
            h = ((g0)this.c.d).h;
        }
        else {
            final Context g = v.g;
            if (g instanceof Activity) {
                h = (true ^ ((Activity)g).isChangingConfigurations());
            }
        }
        if (h) {
            final Iterator<c> iterator2 = this.j.values().iterator();
            while (iterator2.hasNext()) {
                for (final String s : iterator2.next().f) {
                    final g0 g2 = (g0)this.c.d;
                    g2.getClass();
                    if (M(3)) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Clearing non-config state for saved state of Fragment ");
                        sb.append(s);
                        Log.d("FragmentManager", sb.toString());
                    }
                    g2.e(s);
                }
            }
        }
        this.u(-1);
        final x<?> v2 = this.v;
        if (v2 instanceof n3.d) {
            ((n3.d)v2).removeOnTrimMemoryListener(this.q);
        }
        final x<?> v3 = this.v;
        if (v3 instanceof n3.c) {
            ((n3.c)v3).removeOnConfigurationChangedListener((z3.a<Configuration>)this.p);
        }
        final x<?> v4 = this.v;
        if (v4 instanceof OnMultiWindowModeChangedProvider) {
            ((OnMultiWindowModeChangedProvider)v4).removeOnMultiWindowModeChangedListener(this.r);
        }
        final x<?> v5 = this.v;
        if (v5 instanceof OnPictureInPictureModeChangedProvider) {
            ((OnPictureInPictureModeChangedProvider)v5).removeOnPictureInPictureModeChangedListener(this.s);
        }
        final x<?> v6 = this.v;
        if (v6 instanceof a4.k) {
            ((a4.k)v6).removeMenuProvider((a4.z)this.t);
        }
        this.v = null;
        this.w = null;
        this.x = null;
        if (this.g != null) {
            this.h.remove();
            this.g = null;
        }
        final e b = this.B;
        if (b != null) {
            b.b();
            this.C.b();
            this.D.b();
        }
    }
    
    public final void m() {
        for (final Fragment fragment : this.c.g()) {
            if (fragment != null) {
                fragment.performLowMemory();
            }
        }
    }
    
    public final void n(final boolean b) {
        for (final Fragment fragment : this.c.g()) {
            if (fragment != null) {
                fragment.performMultiWindowModeChanged(b);
            }
        }
    }
    
    public final void o() {
        for (final Fragment fragment : this.c.f()) {
            if (fragment != null) {
                fragment.onHiddenChanged(fragment.isHidden());
                fragment.mChildFragmentManager.o();
            }
        }
    }
    
    public final boolean p(final MenuItem menuItem) {
        if (this.u < 1) {
            return false;
        }
        for (final Fragment fragment : this.c.g()) {
            if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }
    
    public final void q(final Menu menu) {
        if (this.u < 1) {
            return;
        }
        for (final Fragment fragment : this.c.g()) {
            if (fragment != null) {
                fragment.performOptionsMenuClosed(menu);
            }
        }
    }
    
    public final void r(final Fragment fragment) {
        if (fragment != null && fragment.equals((Object)this.C(fragment.mWho))) {
            fragment.performPrimaryNavigationFragmentChanged();
        }
    }
    
    public final void s(final boolean b) {
        for (final Fragment fragment : this.c.g()) {
            if (fragment != null) {
                fragment.performPictureInPictureModeChanged(b);
            }
        }
    }
    
    public final boolean t(final Menu menu) {
        final int u = this.u;
        boolean b = false;
        if (u < 1) {
            return false;
        }
        for (final Fragment fragment : this.c.g()) {
            if (fragment != null && fragment.isMenuVisible() && fragment.performPrepareOptionsMenu(menu)) {
                b = true;
            }
        }
        return b;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        final Fragment x = this.x;
        if (x != null) {
            sb.append(x.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.x)));
            sb.append("}");
        }
        else {
            final x<?> v = this.v;
            if (v != null) {
                sb.append(v.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.v)));
                sb.append("}");
            }
            else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }
    
    public final void u(final int e) {
        try {
            this.b = true;
            for (final l0 l0 : ((HashMap)this.c.b).values()) {
                if (l0 != null) {
                    l0.e = e;
                }
            }
            this.Q(e, false);
            final Iterator iterator2 = this.f().iterator();
            while (iterator2.hasNext()) {
                ((SpecialEffectsController)iterator2.next()).e();
            }
            this.b = false;
            this.z(true);
        }
        finally {
            this.b = false;
        }
    }
    
    public final void v() {
        if (this.J) {
            this.J = false;
            this.f0();
        }
    }
    
    public final void w(final String s, final FileDescriptor fileDescriptor, final PrintWriter printWriter, final String[] array) {
        final String l = ak0.m.l(s, "    ");
        final m0 c = this.c;
        c.getClass();
        final StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.append("    ");
        final String string = sb.toString();
        if (!((HashMap)c.b).isEmpty()) {
            printWriter.print(s);
            printWriter.println("Active Fragments:");
            for (final l0 l2 : ((HashMap)c.b).values()) {
                printWriter.print(s);
                if (l2 != null) {
                    final Fragment c2 = l2.c;
                    printWriter.println(c2);
                    c2.dump(string, fileDescriptor, printWriter, array);
                }
                else {
                    printWriter.println("null");
                }
            }
        }
        final int size = ((ArrayList)c.a).size();
        final int n = 0;
        if (size > 0) {
            printWriter.print(s);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size; ++i) {
                final Fragment fragment = ((ArrayList)c.a).get(i);
                printWriter.print(s);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(fragment.toString());
            }
        }
        final ArrayList<Fragment> e = this.e;
        if (e != null) {
            final int size2 = e.size();
            if (size2 > 0) {
                printWriter.print(s);
                printWriter.println("Fragments Created Menus:");
                for (int j = 0; j < size2; ++j) {
                    final Fragment fragment2 = this.e.get(j);
                    printWriter.print(s);
                    printWriter.print("  #");
                    printWriter.print(j);
                    printWriter.print(": ");
                    printWriter.println(fragment2.toString());
                }
            }
        }
        final ArrayList<a> d = this.d;
        if (d != null) {
            final int size3 = d.size();
            if (size3 > 0) {
                printWriter.print(s);
                printWriter.println("Back Stack:");
                for (int k = 0; k < size3; ++k) {
                    final a a = this.d.get(k);
                    printWriter.print(s);
                    printWriter.print("  #");
                    printWriter.print(k);
                    printWriter.print(": ");
                    printWriter.println(a.toString());
                    a.n(l, printWriter, true);
                }
            }
        }
        printWriter.print(s);
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("Back Stack Index: ");
        sb2.append(this.i.get());
        printWriter.println(sb2.toString());
        synchronized (this.a) {
            final int size4 = this.a.size();
            if (size4 > 0) {
                printWriter.print(s);
                printWriter.println("Pending Actions:");
                for (int n2 = n; n2 < size4; ++n2) {
                    final o o = this.a.get(n2);
                    printWriter.print(s);
                    printWriter.print("  #");
                    printWriter.print(n2);
                    printWriter.print(": ");
                    printWriter.println(o);
                }
            }
            monitorexit(this.a);
            printWriter.print(s);
            printWriter.println("FragmentManager misc state:");
            printWriter.print(s);
            printWriter.print("  mHost=");
            printWriter.println(this.v);
            printWriter.print(s);
            printWriter.print("  mContainer=");
            printWriter.println(this.w);
            if (this.x != null) {
                printWriter.print(s);
                printWriter.print("  mParent=");
                printWriter.println(this.x);
            }
            printWriter.print(s);
            printWriter.print("  mCurState=");
            printWriter.print(this.u);
            printWriter.print(" mStateSaved=");
            printWriter.print(this.G);
            printWriter.print(" mStopped=");
            printWriter.print(this.H);
            printWriter.print(" mDestroyed=");
            printWriter.println(this.I);
            if (this.F) {
                printWriter.print(s);
                printWriter.print("  mNeedMenuInvalidate=");
                printWriter.println(this.F);
            }
        }
    }
    
    public final void x(final o o, final boolean b) {
        if (!b) {
            if (this.v == null) {
                if (this.I) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            else if (this.P()) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.a) {
            if (this.v != null) {
                this.a.add(o);
                this.Y();
                return;
            }
            if (b) {
                return;
            }
            throw new IllegalStateException("Activity has been destroyed");
        }
    }
    
    public final void y(final boolean b) {
        if (this.b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.v == null) {
            if (this.I) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            throw new IllegalStateException("FragmentManager has not been attached to a host.");
        }
        else {
            if (Looper.myLooper() != this.v.h.getLooper()) {
                throw new IllegalStateException("Must be called from main thread of fragment host");
            }
            if (!b && this.P()) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
            if (this.K == null) {
                this.K = new ArrayList<a>();
                this.L = new ArrayList<Boolean>();
            }
        }
    }
    
    public final boolean z(boolean b) {
        this.y(b);
        b = false;
        while (true) {
            final ArrayList<a> k = this.K;
            final ArrayList<Boolean> l = this.L;
            synchronized (this.a) {
                Label_0126: {
                    if (this.a.isEmpty()) {
                        monitorexit(this.a);
                        final boolean b2 = false;
                        break Label_0126;
                    }
                    try {
                        boolean b2;
                        for (int size = this.a.size(), i = (b2 = false) ? 1 : 0; i < size; ++i) {
                            b2 |= this.a.get(i).a(k, l);
                        }
                        this.a.clear();
                        this.v.h.removeCallbacks((Runnable)this.O);
                        monitorexit(this.a);
                        if (b2) {
                            this.b = true;
                            try {
                                this.V(this.K, this.L);
                                this.e();
                                b = true;
                                continue;
                            }
                            finally {
                                this.e();
                            }
                        }
                        this.h0();
                        this.v();
                        this.c.b();
                        return b;
                    }
                    finally {
                        this.a.clear();
                        this.v.h.removeCallbacks((Runnable)this.O);
                    }
                }
            }
        }
    }
    
    public static final class j extends f.a<h, androidx.activity.result.a>
    {
        public final Intent a(final ComponentActivity componentActivity, final Object o) {
            final h h = (h)o;
            final Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            final Intent g = h.g;
            Object o2 = h;
            if (g != null) {
                final Bundle bundleExtra = g.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                o2 = h;
                if (bundleExtra != null) {
                    intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                    g.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    o2 = h;
                    if (g.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                        final IntentSender f = h.f;
                        new h$b(f);
                        o2 = new h(f, (Intent)null, h.h, h.i);
                    }
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", (Parcelable)o2);
            if (d0.M(2)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("CreateIntent created the following intent: ");
                sb.append(intent);
                Log.v("FragmentManager", sb.toString());
            }
            return intent;
        }
        
        public final Object c(final int n, final Intent intent) {
            return new androidx.activity.result.a(n, intent);
        }
    }
    
    public abstract static class k
    {
        @Deprecated
        public void onFragmentActivityCreated(final d0 d0, final Fragment fragment, final Bundle bundle) {
        }
        
        public void onFragmentAttached(final d0 d0, final Fragment fragment, final Context context) {
        }
        
        public void onFragmentCreated(final d0 d0, final Fragment fragment, final Bundle bundle) {
        }
        
        public void onFragmentDestroyed(final d0 d0, final Fragment fragment) {
        }
        
        public void onFragmentDetached(final d0 d0, final Fragment fragment) {
        }
        
        public void onFragmentPaused(final d0 d0, final Fragment fragment) {
        }
        
        public void onFragmentPreAttached(final d0 d0, final Fragment fragment, final Context context) {
        }
        
        public void onFragmentPreCreated(final d0 d0, final Fragment fragment, final Bundle bundle) {
        }
        
        public void onFragmentResumed(final d0 d0, final Fragment fragment) {
        }
        
        public void onFragmentSaveInstanceState(final d0 d0, final Fragment fragment, final Bundle bundle) {
        }
        
        public void onFragmentStarted(final d0 d0, final Fragment fragment) {
        }
        
        public void onFragmentStopped(final d0 d0, final Fragment fragment) {
        }
        
        public void onFragmentViewCreated(final d0 d0, final Fragment fragment, final View view, final Bundle bundle) {
        }
        
        public void onFragmentViewDestroyed(final d0 d0, final Fragment fragment) {
        }
    }
    
    public static final class l implements Parcelable
    {
        public static final Parcelable$Creator<l> CREATOR;
        public String f;
        public int g;
        
        static {
            CREATOR = (Parcelable$Creator)new Parcelable$Creator<l>() {
                public final Object createFromParcel(final Parcel parcel) {
                    return new l(parcel);
                }
                
                public final Object[] newArray(final int n) {
                    return new l[n];
                }
            };
        }
        
        public l(final Parcel parcel) {
            this.f = parcel.readString();
            this.g = parcel.readInt();
        }
        
        public l(final String f, final int g) {
            this.f = f;
            this.g = g;
        }
        
        public final int describeContents() {
            return 0;
        }
        
        public final void writeToParcel(final Parcel parcel, final int n) {
            parcel.writeString(this.f);
            parcel.writeInt(this.g);
        }
    }
    
    public static final class m implements j0
    {
        public final Lifecycle f;
        public final j0 g;
        public final androidx.lifecycle.o h;
        
        public m(final Lifecycle f, final tl1.i g, final androidx.lifecycle.o h) {
            this.f = f;
            this.g = (j0)g;
            this.h = h;
        }
        
        @Override
        public final void c(final Bundle bundle, final String s) {
            this.g.c(bundle, s);
        }
    }
    
    public interface n
    {
        void onBackStackChanged();
    }
    
    public interface o
    {
        boolean a(final ArrayList<a> p0, final ArrayList<Boolean> p1);
    }
    
    public final class p implements o
    {
        public final String a;
        public final int b;
        public final int c;
        
        public p(final String a, final int b, final int c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
        
        @Override
        public final boolean a(final ArrayList<a> list, final ArrayList<Boolean> list2) {
            final Fragment y = d0.this.y;
            return (y == null || this.b >= 0 || this.a != null || !y.getChildFragmentManager().S(-1, 0, null)) && d0.this.T(list, list2, this.a, this.b, this.c);
        }
    }
}
