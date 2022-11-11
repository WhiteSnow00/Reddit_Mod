// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.ArrayList;
import java.io.Writer;
import java.io.PrintWriter;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import androidx.fragment.app.m;

public final class 159 extends 0AO implements 0AB.a, e
{
    public final m LIZ;
    public boolean LIZIZ;
    public int LIZJ;
    
    static {
        Covode.recordClassIndex(1053);
    }
    
    public 159(final m liz) {
        this.LIZJ = -1;
        this.LIZ = liz;
    }
    
    public static boolean LIZ(final 0AO.a a) {
        final Fragment liziz = a.LIZIZ;
        return liziz != null && liziz.mAdded && liziz.mView != null && !liziz.mDetached && !liziz.mHidden && liziz.isPostponed();
    }
    
    private int LIZIZ(final boolean b) {
        if (!this.LIZIZ) {
            if (m.LIZJ) {
                final PrintWriter printWriter = new PrintWriter(new 07Q());
                this.LIZ("  ", printWriter);
                printWriter.close();
            }
            this.LIZIZ = true;
            if (super.LJIIJ) {
                this.LIZJ = this.LIZ.LIZ(this);
            }
            else {
                this.LIZJ = -1;
            }
            this.LIZ.LIZ((e)this, b);
            return this.LIZJ;
        }
        throw new IllegalStateException("commit already called");
    }
    
    @Override
    public final 0AO LIZ(final Fragment fragment) {
        if (fragment.mFragmentManager == null || fragment.mFragmentManager == this.LIZ) {
            super.LIZ(fragment);
            return this;
        }
        final StringBuilder sb = new StringBuilder("Cannot remove Fragment attached to a different FragmentManager. Fragment ");
        sb.append(fragment.toString());
        sb.append(" is already attached to a FragmentManager.");
        throw new IllegalStateException(sb.toString());
    }
    
    @Override
    public final 0AO LIZ(final Fragment fragment, final 0CC.b b) {
        if (fragment.mFragmentManager != this.LIZ) {
            final StringBuilder sb = new StringBuilder("Cannot setMaxLifecycle for Fragment not attached to FragmentManager ");
            sb.append(this.LIZ);
            throw new IllegalArgumentException(sb.toString());
        }
        if (b.isAtLeast(0CC.b.CREATED)) {
            super.LIZ(fragment, b);
            return this;
        }
        final StringBuilder sb2 = new StringBuilder("Cannot set maximum Lifecycle below ");
        sb2.append(0CC.b.CREATED);
        throw new IllegalArgumentException(sb2.toString());
    }
    
    public final Fragment LIZ(final ArrayList<Fragment> list, Fragment liziz) {
        int i = 0;
        Fragment fragment = liziz;
    Label_0081_Outer:
        while (i < super.LIZLLL.size()) {
            final 0AO.a a = super.LIZLLL.get(i);
            final int liz = a.LIZ;
            while (true) {
                Label_0439: {
                    if (liz == 1) {
                        break Label_0439;
                    }
                    int n;
                    if (liz != 2) {
                        if (liz != 3 && liz != 6) {
                            if (liz == 7) {
                                break Label_0439;
                            }
                            if (liz != 8) {
                                liziz = fragment;
                                n = i;
                            }
                            else {
                                super.LIZLLL.add(i, new 0AO.a(9, fragment));
                                n = i + 1;
                                liziz = a.LIZIZ;
                            }
                        }
                        else {
                            list.remove(a.LIZIZ);
                            n = i;
                            if (a.LIZIZ == (liziz = fragment)) {
                                super.LIZLLL.add(i, new 0AO.a(9, a.LIZIZ));
                                n = i + 1;
                                liziz = null;
                            }
                        }
                    }
                    else {
                        final Fragment liziz2 = a.LIZIZ;
                        final int mContainerId = liziz2.mContainerId;
                        final int n2 = list.size() - 1;
                        int n3 = 0;
                        liziz = fragment;
                        n = i;
                        int n4;
                        Fragment fragment3;
                        int n5;
                        for (int j = n2; j >= 0; --j, n = n4, liziz = fragment3, n3 = n5) {
                            final Fragment fragment2 = list.get(j);
                            n4 = n;
                            fragment3 = liziz;
                            n5 = n3;
                            if (fragment2.mContainerId == mContainerId) {
                                if (fragment2 == liziz2) {
                                    n5 = 1;
                                    fragment3 = liziz;
                                    n4 = n;
                                }
                                else {
                                    n4 = n;
                                    if (fragment2 == (fragment3 = liziz)) {
                                        super.LIZLLL.add(n, new 0AO.a(9, fragment2));
                                        n4 = n + 1;
                                        fragment3 = null;
                                    }
                                    final 0AO.a a2 = new 0AO.a(3, fragment2);
                                    a2.LIZJ = a.LIZJ;
                                    a2.LJ = a.LJ;
                                    a2.LIZLLL = a.LIZLLL;
                                    a2.LJFF = a.LJFF;
                                    super.LIZLLL.add(n4, a2);
                                    list.remove(fragment2);
                                    ++n4;
                                    n5 = n3;
                                }
                            }
                        }
                        if (n3 != 0) {
                            super.LIZLLL.remove(n);
                            --n;
                        }
                        else {
                            a.LIZ = 1;
                            list.add(liziz2);
                        }
                    }
                    i = n + 1;
                    fragment = liziz;
                    continue Label_0081_Outer;
                }
                list.add(a.LIZIZ);
                int n = i;
                liziz = fragment;
                continue;
            }
        }
        return fragment;
    }
    
    public final void LIZ() {
        if (super.LJIJJ != null) {
            for (int i = 0; i < super.LJIJJ.size(); ++i) {
                super.LJIJJ.get(i).run();
            }
            super.LJIJJ = null;
        }
    }
    
    public final void LIZ(final int n) {
        if (!super.LJIIJ) {
            return;
        }
        for (int size = super.LIZLLL.size(), i = 0; i < size; ++i) {
            final 0AO.a a = super.LIZLLL.get(i);
            if (a.LIZIZ != null) {
                final Fragment liziz = a.LIZIZ;
                liziz.mBackStackNesting += n;
            }
        }
    }
    
    @Override
    public final void LIZ(final int n, final Fragment fragment, final String s, final int n2) {
        super.LIZ(n, fragment, s, n2);
        fragment.mFragmentManager = this.LIZ;
    }
    
    public final void LIZ(final Fragment.c onStartEnterTransitionListener) {
        for (int i = 0; i < super.LIZLLL.size(); ++i) {
            final 0AO.a a = super.LIZLLL.get(i);
            if (LIZ(a)) {
                a.LIZIZ.setOnStartEnterTransitionListener(onStartEnterTransitionListener);
            }
        }
    }
    
    public final void LIZ(final String s, final PrintWriter printWriter) {
        this.LIZ(s, printWriter, true);
    }
    
    public final void LIZ(final String s, final PrintWriter printWriter, final boolean b) {
        if (b) {
            printWriter.print(s);
            printWriter.print("mName=");
            printWriter.print(super.LJIIL);
            printWriter.print(" mIndex=");
            printWriter.print(this.LIZJ);
            printWriter.print(" mCommitted=");
            printWriter.println(this.LIZIZ);
            if (super.LJIIIIZZ != 0) {
                printWriter.print(s);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(super.LJIIIIZZ));
                printWriter.print(" mTransitionStyle=#");
                printWriter.println(Integer.toHexString(super.LJIIIZ));
            }
            if (super.LJ != 0 || super.LJFF != 0) {
                printWriter.print(s);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(super.LJ));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(super.LJFF));
            }
            if (super.LJI != 0 || super.LJII != 0) {
                printWriter.print(s);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(super.LJI));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(super.LJII));
            }
            if (super.LJIILIIL != 0 || super.LJIILJJIL != null) {
                printWriter.print(s);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(super.LJIILIIL));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(super.LJIILJJIL);
            }
            if (super.LJIILL != 0 || super.LJIILLIIL != null) {
                printWriter.print(s);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(super.LJIILL));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(super.LJIILLIIL);
            }
        }
        if (!super.LIZLLL.isEmpty()) {
            printWriter.print(s);
            printWriter.println("Operations:");
            for (int size = super.LIZLLL.size(), i = 0; i < size; ++i) {
                final 0AO.a a = super.LIZLLL.get(i);
                String string = null;
                switch (a.LIZ) {
                    default: {
                        final StringBuilder sb = new StringBuilder("cmd=");
                        sb.append(a.LIZ);
                        string = sb.toString();
                        break;
                    }
                    case 10: {
                        string = "OP_SET_MAX_LIFECYCLE";
                        break;
                    }
                    case 9: {
                        string = "UNSET_PRIMARY_NAV";
                        break;
                    }
                    case 8: {
                        string = "SET_PRIMARY_NAV";
                        break;
                    }
                    case 7: {
                        string = "ATTACH";
                        break;
                    }
                    case 6: {
                        string = "DETACH";
                        break;
                    }
                    case 5: {
                        string = "SHOW";
                        break;
                    }
                    case 4: {
                        string = "HIDE";
                        break;
                    }
                    case 3: {
                        string = "REMOVE";
                        break;
                    }
                    case 2: {
                        string = "REPLACE";
                        break;
                    }
                    case 1: {
                        string = "ADD";
                        break;
                    }
                    case 0: {
                        string = "NULL";
                        break;
                    }
                }
                printWriter.print(s);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(string);
                printWriter.print(" ");
                printWriter.println(a.LIZIZ);
                if (b) {
                    if (a.LIZJ != 0 || a.LIZLLL != 0) {
                        printWriter.print(s);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(a.LIZJ));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(a.LIZLLL));
                    }
                    if (a.LJ != 0 || a.LJFF != 0) {
                        printWriter.print(s);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(a.LJ));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(a.LJFF));
                    }
                }
            }
        }
    }
    
    public final void LIZ(final boolean b) {
        for (int i = super.LIZLLL.size() - 1; i >= 0; --i) {
            final 0AO.a a = super.LIZLLL.get(i);
            final Fragment liziz = a.LIZIZ;
            if (liziz != null) {
                final int ljiiiizz = super.LJIIIIZZ;
                int n = 8194;
                if (ljiiiizz != 4097) {
                    if (ljiiiizz != 4099) {
                        if (ljiiiizz != 8194) {
                            n = 0;
                        }
                        else {
                            n = 4097;
                        }
                    }
                    else {
                        n = 4099;
                    }
                }
                liziz.setNextTransition(n, super.LJIIIZ);
            }
            switch (a.LIZ) {
                default: {
                    final StringBuilder sb = new StringBuilder("Unknown cmd: ");
                    sb.append(a.LIZ);
                    throw new IllegalArgumentException(sb.toString());
                }
                case 10: {
                    this.LIZ.LIZ(liziz, a.LJI);
                    break;
                }
                case 9: {
                    this.LIZ.LJIIL(liziz);
                    break;
                }
                case 8: {
                    this.LIZ.LJIIL(null);
                    break;
                }
                case 7: {
                    liziz.setNextAnim(a.LJFF);
                    this.LIZ.LJIIJ(liziz);
                    break;
                }
                case 6: {
                    liziz.setNextAnim(a.LJ);
                    this.LIZ.LJIIJJI(liziz);
                    break;
                }
                case 5: {
                    liziz.setNextAnim(a.LJFF);
                    this.LIZ.LJIIIIZZ(liziz);
                    break;
                }
                case 4: {
                    liziz.setNextAnim(a.LJ);
                    this.LIZ.LJIIIZ(liziz);
                    break;
                }
                case 3: {
                    liziz.setNextAnim(a.LJ);
                    this.LIZ.LIZ(liziz, false);
                    break;
                }
                case 1: {
                    liziz.setNextAnim(a.LJFF);
                    this.LIZ.LJII(liziz);
                    break;
                }
            }
            if (!super.LJIJI && a.LIZ != 3 && liziz != null) {
                this.LIZ.LJFF(liziz);
            }
        }
        if (!super.LJIJI && b) {
            final m liz = this.LIZ;
            liz.LIZ(liz.LJIILL, true);
        }
    }
    
    public final boolean LIZ(final ArrayList<159> list, final int n, final int n2) {
        if (n2 == n) {
            return false;
        }
        final int size = super.LIZLLL.size();
        int n3 = -1;
        int n4;
        for (int i = 0; i < size; ++i, n3 = n4) {
            final 0AO.a a = super.LIZLLL.get(i);
            n4 = n3;
            if (a.LIZIZ != null) {
                final int mContainerId = a.LIZIZ.mContainerId;
                n4 = n3;
                if (mContainerId != 0 && mContainerId != (n4 = n3)) {
                    for (int j = n; j < n2; ++j) {
                        final 0AO 0ao = list.get(j);
                        for (int size2 = 0ao.LIZLLL.size(), k = 0; k < size2; ++k) {
                            final 0AO.a a2 = 0ao.LIZLLL.get(k);
                            if (a2.LIZIZ != null && a2.LIZIZ.mContainerId == mContainerId) {
                                return true;
                            }
                        }
                    }
                    n4 = mContainerId;
                }
            }
        }
        return false;
    }
    
    @Override
    public final boolean LIZ(final ArrayList<159> list, final ArrayList<Boolean> list2) {
        list.add(this);
        list2.add(false);
        if (super.LJIIJ) {
            final m liz = this.LIZ;
            if (liz.LJIIIIZZ == null) {
                liz.LJIIIIZZ = new ArrayList<159>();
            }
            liz.LJIIIIZZ.add(this);
        }
        return true;
    }
    
    @Override
    public final int LIZIZ() {
        return this.LIZIZ(false);
    }
    
    @Override
    public final 0AO LIZIZ(final Fragment fragment) {
        if (fragment.mFragmentManager == null || fragment.mFragmentManager == this.LIZ) {
            super.LIZIZ(fragment);
            return this;
        }
        final StringBuilder sb = new StringBuilder("Cannot hide Fragment attached to a different FragmentManager. Fragment ");
        sb.append(fragment.toString());
        sb.append(" is already attached to a FragmentManager.");
        throw new IllegalStateException(sb.toString());
    }
    
    public final Fragment LIZIZ(final ArrayList<Fragment> list, Fragment liziz) {
        int i = super.LIZLLL.size() - 1;
    Label_0084_Outer:
        while (i >= 0) {
            final 0AO.a a = super.LIZLLL.get(i);
            final int liz = a.LIZ;
            while (true) {
                Label_0130: {
                    if (liz == 1) {
                        break Label_0130;
                    }
                    if (liz != 3) {
                        switch (liz) {
                            case 8: {
                                liziz = null;
                                break Label_0084;
                            }
                            case 9: {
                                liziz = a.LIZIZ;
                                break Label_0084;
                            }
                            case 10: {
                                a.LJII = a.LJI;
                                break Label_0084;
                            }
                            case 7: {
                                break Label_0130;
                            }
                        }
                    }
                    list.add(a.LIZIZ);
                    --i;
                    continue Label_0084_Outer;
                }
                list.remove(a.LIZIZ);
                continue;
            }
        }
        return liziz;
    }
    
    public final boolean LIZIZ(final int n) {
        for (int size = super.LIZLLL.size(), i = 0; i < size; ++i) {
            final 0AO.a a = super.LIZLLL.get(i);
            if (a.LIZIZ != null) {
                final int mContainerId = a.LIZIZ.mContainerId;
                if (mContainerId != 0 && mContainerId == n) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public final int LIZJ() {
        return this.LIZIZ(true);
    }
    
    @Override
    public final 0AO LIZJ(final Fragment fragment) {
        if (fragment.mFragmentManager == null || fragment.mFragmentManager == this.LIZ) {
            super.LIZJ(fragment);
            return this;
        }
        final StringBuilder sb = new StringBuilder("Cannot show Fragment attached to a different FragmentManager. Fragment ");
        sb.append(fragment.toString());
        sb.append(" is already attached to a FragmentManager.");
        throw new IllegalStateException(sb.toString());
    }
    
    @Override
    public final 0AO LIZLLL(final Fragment fragment) {
        if (fragment.mFragmentManager == null || fragment.mFragmentManager == this.LIZ) {
            super.LIZLLL(fragment);
            return this;
        }
        final StringBuilder sb = new StringBuilder("Cannot detach Fragment attached to a different FragmentManager. Fragment ");
        sb.append(fragment.toString());
        sb.append(" is already attached to a FragmentManager.");
        throw new IllegalStateException(sb.toString());
    }
    
    @Override
    public final void LIZLLL() {
        this.LJII();
        this.LIZ.LIZIZ((e)this, false);
    }
    
    @Override
    public final void LJ() {
        this.LJII();
        this.LIZ.LIZIZ((e)this, true);
    }
    
    public final void LJFF() {
        for (int size = super.LIZLLL.size(), i = 0; i < size; ++i) {
            final 0AO.a a = super.LIZLLL.get(i);
            final Fragment liziz = a.LIZIZ;
            if (liziz != null) {
                liziz.setNextTransition(super.LJIIIIZZ, super.LJIIIZ);
            }
            switch (a.LIZ) {
                default: {
                    final StringBuilder sb = new StringBuilder("Unknown cmd: ");
                    sb.append(a.LIZ);
                    throw new IllegalArgumentException(sb.toString());
                }
                case 10: {
                    this.LIZ.LIZ(liziz, a.LJII);
                    break;
                }
                case 9: {
                    this.LIZ.LJIIL(null);
                    break;
                }
                case 8: {
                    this.LIZ.LJIIL(liziz);
                    break;
                }
                case 7: {
                    liziz.setNextAnim(a.LIZJ);
                    this.LIZ.LJIIJJI(liziz);
                    break;
                }
                case 6: {
                    liziz.setNextAnim(a.LIZLLL);
                    this.LIZ.LJIIJ(liziz);
                    break;
                }
                case 5: {
                    liziz.setNextAnim(a.LIZJ);
                    this.LIZ.LJIIIZ(liziz);
                    break;
                }
                case 4: {
                    liziz.setNextAnim(a.LIZLLL);
                    this.LIZ.LJIIIIZZ(liziz);
                    break;
                }
                case 3: {
                    liziz.setNextAnim(a.LIZLLL);
                    this.LIZ.LJII(liziz);
                    break;
                }
                case 1: {
                    liziz.setNextAnim(a.LIZJ);
                    this.LIZ.LIZ(liziz, false);
                    break;
                }
            }
            if (!super.LJIJI && a.LIZ != 1 && liziz != null) {
                this.LIZ.LJFF(liziz);
            }
        }
        if (!super.LJIJI) {
            final m liz = this.LIZ;
            liz.LIZ(liz.LJIILL, true);
        }
    }
    
    @Override
    public final String LJI() {
        return super.LJIIL;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.LIZJ >= 0) {
            sb.append(" #");
            sb.append(this.LIZJ);
        }
        if (super.LJIIL != null) {
            sb.append(" ");
            sb.append(super.LJIIL);
        }
        sb.append("}");
        return sb.toString();
    }
}
