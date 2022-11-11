// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.graphics.Rect;
import android.animation.Animator$AnimatorListener;
import java.util.Iterator;
import android.util.SparseIntArray;
import android.view.ViewGroup;
import android.widget.ListView;
import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import android.view.View;
import java.util.ArrayList;
import android.animation.TimeInterpolator;
import android.animation.Animator;

public abstract class 0Dg implements Cloneable
{
    public static final int[] LIZ;
    public static final 0DX LJIILL;
    public static ThreadLocal<13j<Animator, a>> LJJIIJ;
    public String LIZIZ;
    public long LIZJ;
    public long LIZLLL;
    public TimeInterpolator LJ;
    public ArrayList<Integer> LJFF;
    public ArrayList<View> LJI;
    public ArrayList<String> LJII;
    public ArrayList<Class<?>> LJIIIIZZ;
    public 16Z LJIIIZ;
    public boolean LJIIJ;
    public ArrayList<Animator> LJIIJJI;
    public 0Dj LJIIL;
    public b LJIILIIL;
    public 0DX LJIILJJIL;
    public ArrayList<Integer> LJIILLIIL;
    public ArrayList<View> LJIIZILJ;
    public ArrayList<Class<?>> LJIJ;
    public ArrayList<String> LJIJI;
    public ArrayList<Integer> LJIJJ;
    public ArrayList<View> LJIJJLI;
    public ArrayList<Class<?>> LJIL;
    public 0Dm LJJ;
    public 0Dm LJJI;
    public int[] LJJIFFI;
    public ArrayList<0Dl> LJJII;
    public ArrayList<0Dl> LJJIII;
    public int LJJIIJZLJL;
    public boolean LJJIIZ;
    public boolean LJJIIZI;
    public ArrayList<c> LJJIJ;
    public ArrayList<Animator> LJJIJIIJI;
    public 13j<String, String> LJJIJIIJIL;
    
    static {
        Covode.recordClassIndex(1448);
        LIZ = new int[] { 2, 1, 3, 4 };
        LJIILL = new 16X();
        0Dg.LJJIIJ = new ThreadLocal<13j<Animator, a>>();
    }
    
    public 0Dg() {
        this.LIZIZ = this.getClass().getName();
        this.LIZJ = -1L;
        this.LIZLLL = -1L;
        this.LJ = null;
        this.LJFF = new ArrayList<Integer>();
        this.LJI = new ArrayList<View>();
        this.LJII = null;
        this.LJIIIIZZ = null;
        this.LJIILLIIL = null;
        this.LJIIZILJ = null;
        this.LJIJ = null;
        this.LJIJI = null;
        this.LJIJJ = null;
        this.LJIJJLI = null;
        this.LJIL = null;
        this.LJJ = new 0Dm();
        this.LJJI = new 0Dm();
        this.LJIIIZ = null;
        this.LJJIFFI = 0Dg.LIZ;
        this.LJIIJ = false;
        this.LJIIJJI = new ArrayList<Animator>();
        this.LJJIIJZLJL = 0;
        this.LJJIIZ = false;
        this.LJJIIZI = false;
        this.LJJIJ = null;
        this.LJJIJIIJI = new ArrayList<Animator>();
        this.LJIILJJIL = 0Dg.LJIILL;
    }
    
    private void LIZ(final 0Dm 0Dm, final 0Dm 0Dm2) {
        final 13j 13j = new 13j(0Dm.LIZ);
        final 13j 13j2 = new 13j(0Dm2.LIZ);
        int n = 0;
        while (true) {
            final int[] ljjiffi = this.LJJIFFI;
            if (n >= ljjiffi.length) {
                break;
            }
            final int n2 = ljjiffi[n];
            if (n2 != 1) {
                if (n2 != 2) {
                    if (n2 != 3) {
                        if (n2 == 4) {
                            final 04v<View> lizj = 0Dm.LIZJ;
                            final 04v<View> lizj2 = 0Dm2.LIZJ;
                            for (int liziz = lizj.LIZIZ(), i = 0; i < liziz; ++i) {
                                final View view = lizj.LIZJ(i);
                                if (view != null && this.LIZ(view)) {
                                    final View view2 = lizj2.LIZ(lizj.LIZIZ(i), null);
                                    if (view2 != null && this.LIZ(view2)) {
                                        final Object value = 13j.get(view);
                                        final Object value2 = 13j2.get(view2);
                                        if (value != null && value2 != null) {
                                            this.LJJII.add((0Dl)value);
                                            this.LJJIII.add((0Dl)value2);
                                            13j.remove(view);
                                            13j2.remove(view2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    else {
                        final SparseArray<View> liziz2 = 0Dm.LIZIZ;
                        final SparseArray<View> liziz3 = 0Dm2.LIZIZ;
                        for (int size = liziz2.size(), j = 0; j < size; ++j) {
                            final View view3 = (View)liziz2.valueAt(j);
                            if (view3 != null && this.LIZ(view3)) {
                                final View view4 = (View)liziz3.get(liziz2.keyAt(j));
                                if (view4 != null && this.LIZ(view4)) {
                                    final Object value3 = 13j.get(view3);
                                    final Object value4 = 13j2.get(view4);
                                    if (value3 != null && value4 != null) {
                                        this.LJJII.add((0Dl)value3);
                                        this.LJJIII.add((0Dl)value4);
                                        13j.remove(view3);
                                        13j2.remove(view4);
                                    }
                                }
                            }
                        }
                    }
                }
                else {
                    final 13j<String, View> lizlll = 0Dm.LIZLLL;
                    final 13j<String, View> lizlll2 = 0Dm2.LIZLLL;
                    for (int size2 = lizlll.size(), k = 0; k < size2; ++k) {
                        final View view5 = (View)lizlll.LIZJ(k);
                        if (view5 != null && this.LIZ(view5)) {
                            final View view6 = lizlll2.get(lizlll.LIZIZ(k));
                            if (view6 != null && this.LIZ(view6)) {
                                final Object value5 = 13j.get(view5);
                                final Object value6 = 13j2.get(view6);
                                if (value5 != null && value6 != null) {
                                    this.LJJII.add((0Dl)value5);
                                    this.LJJIII.add((0Dl)value6);
                                    13j.remove(view5);
                                    13j2.remove(view6);
                                }
                            }
                        }
                    }
                }
            }
            else {
                for (int l = 13j.size() - 1; l >= 0; --l) {
                    final View view7 = (View)13j.LIZIZ(l);
                    if (view7 != null && this.LIZ(view7)) {
                        final 0Dl 0Dl = (0Dl)13j2.remove(view7);
                        if (0Dl != null && this.LIZ(0Dl.LIZIZ)) {
                            this.LJJII.add((0Dl)13j.LIZLLL(l));
                            this.LJJIII.add(0Dl);
                        }
                    }
                }
            }
            ++n;
        }
        for (int n3 = 0; n3 < 13j.size(); ++n3) {
            final 0Dl 0Dl2 = (0Dl)13j.LIZJ(n3);
            if (this.LIZ(0Dl2.LIZIZ)) {
                this.LJJII.add(0Dl2);
                this.LJJIII.add(null);
            }
        }
        for (int n4 = 0; n4 < 13j2.size(); ++n4) {
            final 0Dl 0Dl3 = (0Dl)13j2.LIZJ(n4);
            if (this.LIZ(0Dl3.LIZIZ)) {
                this.LJJIII.add(0Dl3);
                this.LJJII.add(null);
            }
        }
    }
    
    public static void LIZ(final 0Dm 0Dm, View view, final 0Dl 0Dl) {
        0Dm.LIZ.put(view, 0Dl);
        final int id = view.getId();
        if (id >= 0) {
            if (0Dm.LIZIZ.indexOfKey(id) >= 0) {
                0Dm.LIZIZ.put(id, (Object)null);
            }
            else {
                0Dm.LIZIZ.put(id, (Object)view);
            }
        }
        final String transitionName = view.getTransitionName();
        if (transitionName != null) {
            if (0Dm.LIZLLL.containsKey(transitionName)) {
                0Dm.LIZLLL.put(transitionName, null);
            }
            else {
                0Dm.LIZLLL.put(transitionName, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            final ListView listView = (ListView)view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                final long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (0Dm.LIZJ.LIZJ(itemIdAtPosition) >= 0) {
                    view = 0Dm.LIZJ.LIZ(itemIdAtPosition, null);
                    if (view != null) {
                        view.setHasTransientState(false);
                        0Dm.LIZJ.LIZIZ(itemIdAtPosition, null);
                    }
                    return;
                }
                view.setHasTransientState(true);
                0Dm.LIZJ.LIZIZ(itemIdAtPosition, view);
            }
        }
    }
    
    public static boolean LIZ(final 0Dl 0Dl, final 0Dl 0Dl2, final String s) {
        final Object value = 0Dl.LIZ.get(s);
        final Object value2 = 0Dl2.LIZ.get(s);
        boolean b = true;
        if (value == null) {
            if (value2 == null) {
                return false;
            }
        }
        else if (value2 != null) {
            if (value.equals(value2)) {
                return false;
            }
        }
        return b;
        b = false;
        return b;
    }
    
    private void LIZJ(final View view, final boolean b) {
        if (view == null) {
            return;
        }
        final int id = view.getId();
        final ArrayList<Integer> ljiilliil = this.LJIILLIIL;
        if (ljiilliil != null && ljiilliil.contains(id)) {
            return;
        }
        final ArrayList<View> ljiizilj = this.LJIIZILJ;
        if (ljiizilj != null && ljiizilj.contains(view)) {
            return;
        }
        final ArrayList<Class<?>> ljij = this.LJIJ;
        final int n = 0;
        if (ljij != null) {
            for (int size = ljij.size(), i = 0; i < size; ++i) {
                if (this.LJIJ.get(i).isInstance(view)) {
                    return;
                }
            }
        }
        if (view.getParent() instanceof ViewGroup) {
            final 0Dl 0Dl = new 0Dl(view);
            if (b) {
                this.LIZ(0Dl);
            }
            else {
                this.LIZIZ(0Dl);
            }
            0Dl.LIZJ.add(this);
            this.LIZJ(0Dl);
            if (b) {
                LIZ(this.LJJ, view, 0Dl);
            }
            else {
                LIZ(this.LJJI, view, 0Dl);
            }
        }
        if (view instanceof ViewGroup) {
            final ArrayList<Integer> ljijj = this.LJIJJ;
            if (ljijj != null && ljijj.contains(id)) {
                return;
            }
            final ArrayList<View> ljijjli = this.LJIJJLI;
            if (ljijjli != null && ljijjli.contains(view)) {
                return;
            }
            final ArrayList<Class<?>> ljil = this.LJIL;
            if (ljil != null) {
                for (int size2 = ljil.size(), j = 0; j < size2; ++j) {
                    if (this.LJIL.get(j).isInstance(view)) {
                        return;
                    }
                }
            }
            final ViewGroup viewGroup = (ViewGroup)view;
            for (int k = n; k < viewGroup.getChildCount(); ++k) {
                this.LIZJ(viewGroup.getChildAt(k), b);
            }
        }
    }
    
    public static 13j<Animator, a> LJI() {
        13j 13j;
        if ((13j = 0Dg.LJJIIJ.get()) == null) {
            13j = new 13j();
            0Dg.LJJIIJ.set(13j);
        }
        return 13j;
    }
    
    public 0Dg LIZ(final long lizlll) {
        this.LIZLLL = lizlll;
        return this;
    }
    
    public 0Dg LIZ(final c c) {
        if (this.LJJIJ == null) {
            this.LJJIJ = new ArrayList<c>();
        }
        this.LJJIJ.add(c);
        return this;
    }
    
    public 0Dg LIZ(final TimeInterpolator lj) {
        this.LJ = lj;
        return this;
    }
    
    public final 0Dl LIZ(final View view, final boolean b) {
        0Dg 0Dg = this;
        while (true) {
            final 16Z ljiiiz = 0Dg.LJIIIZ;
            if (ljiiiz == null) {
                break;
            }
            0Dg = ljiiiz;
        }
        0Dm 0Dm;
        if (b) {
            0Dm = 0Dg.LJJ;
        }
        else {
            0Dm = 0Dg.LJJI;
        }
        return (0Dl)0Dm.LIZ.get(view);
    }
    
    public Animator LIZ(final ViewGroup viewGroup, final 0Dl 0Dl, final 0Dl 0Dl2) {
        return null;
    }
    
    public String LIZ(String s) {
        final StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.append(this.getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(this.hashCode()));
        sb.append(": ");
        final String s2 = s = sb.toString();
        if (this.LIZLLL != -1L) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(s2);
            sb2.append("dur(");
            sb2.append(this.LIZLLL);
            sb2.append(") ");
            s = sb2.toString();
        }
        String string = s;
        if (this.LIZJ != -1L) {
            final StringBuilder sb3 = new StringBuilder();
            sb3.append(s);
            sb3.append("dly(");
            sb3.append(this.LIZJ);
            sb3.append(") ");
            string = sb3.toString();
        }
        s = string;
        if (this.LJ != null) {
            final StringBuilder sb4 = new StringBuilder();
            sb4.append(string);
            sb4.append("interp(");
            sb4.append(this.LJ);
            sb4.append(") ");
            s = sb4.toString();
        }
        if (this.LJFF.size() <= 0) {
            final String string2 = s;
            if (this.LJI.size() <= 0) {
                return string2;
            }
        }
        final StringBuilder sb5 = new StringBuilder();
        sb5.append(s);
        sb5.append("tgts(");
        s = sb5.toString();
        final int size = this.LJFF.size();
        final int n = 0;
        String string3 = s;
        if (size > 0) {
            int n2 = 0;
            while (true) {
                string3 = s;
                if (n2 >= this.LJFF.size()) {
                    break;
                }
                String string4 = s;
                if (n2 > 0) {
                    final StringBuilder sb6 = new StringBuilder();
                    sb6.append(s);
                    sb6.append(", ");
                    string4 = sb6.toString();
                }
                final StringBuilder sb7 = new StringBuilder();
                sb7.append(string4);
                sb7.append(this.LJFF.get(n2));
                s = sb7.toString();
                ++n2;
            }
        }
        s = string3;
        if (this.LJI.size() > 0) {
            int n3 = n;
            while (true) {
                s = string3;
                if (n3 >= this.LJI.size()) {
                    break;
                }
                s = string3;
                if (n3 > 0) {
                    final StringBuilder sb8 = new StringBuilder();
                    sb8.append(string3);
                    sb8.append(", ");
                    s = sb8.toString();
                }
                final StringBuilder sb9 = new StringBuilder();
                sb9.append(s);
                sb9.append(this.LJI.get(n3));
                string3 = sb9.toString();
                ++n3;
            }
        }
        final StringBuilder sb10 = new StringBuilder();
        sb10.append(s);
        sb10.append(")");
        return sb10.toString();
    }
    
    public void LIZ(final 0DX ljiiljjil) {
        if (ljiiljjil == null) {
            this.LJIILJJIL = 0Dg.LJIILL;
            return;
        }
        this.LJIILJJIL = ljiiljjil;
    }
    
    public void LIZ(final b ljiiliil) {
        this.LJIILIIL = ljiiliil;
    }
    
    public void LIZ(final 0Dj ljiil) {
        this.LJIIL = ljiil;
    }
    
    public abstract void LIZ(final 0Dl p0);
    
    public final void LIZ(final ViewGroup viewGroup) {
        this.LJJII = new ArrayList<0Dl>();
        this.LJJIII = new ArrayList<0Dl>();
        this.LIZ(this.LJJ, this.LJJI);
        final 13j<Animator, a> lji = LJI();
        int i = lji.size();
        final 0DL liziz = 0Ds.LIZIZ((View)viewGroup);
        --i;
        while (i >= 0) {
            final Animator animator = (Animator)lji.LIZIZ(i);
            Label_0216: {
                if (animator != null) {
                    final a a = (a)lji.get(animator);
                    if (a != null && a.LIZ != null && liziz.equals(a.LIZLLL)) {
                        final 0Dl lizj = a.LIZJ;
                        final View liz = a.LIZ;
                        final 0Dl liz2 = this.LIZ(liz, true);
                        0Dl liziz2;
                        final 0Dl 0Dl = liziz2 = this.LIZIZ(liz, (boolean)(1 != 0));
                        if (liz2 == null && (liziz2 = 0Dl) == null) {
                            liziz2 = this.LJJI.LIZ.get(liz);
                            if (liziz2 == null) {
                                break Label_0216;
                            }
                        }
                        if (a.LJ.LIZ(lizj, liziz2)) {
                            if (animator.isRunning() || animator.isStarted()) {
                                animator.cancel();
                            }
                            else {
                                lji.remove(animator);
                            }
                        }
                    }
                }
            }
            --i;
        }
        this.LIZ(viewGroup, this.LJJ, this.LJJI, this.LJJII, this.LJJIII);
        this.LIZIZ();
    }
    
    public void LIZ(final ViewGroup viewGroup, final 0Dm 0Dm, final 0Dm 0Dm2, final ArrayList<0Dl> list, final ArrayList<0Dl> list2) {
        final 13j<Animator, a> lji = LJI();
        final SparseIntArray sparseIntArray = new SparseIntArray();
        final int size = list.size();
        long n = Long.MAX_VALUE;
        long min;
    Label_0471:
        for (int i = 0; i < size; ++i, n = min) {
            final 0Dl 0Dl = list.get(i);
            final 0Dl 0Dl2 = list2.get(i);
            0Dl 0Dl3;
            if ((0Dl3 = 0Dl) != null) {
                0Dl3 = 0Dl;
                if (!0Dl.LIZJ.contains(this)) {
                    0Dl3 = null;
                }
            }
            0Dl 0Dl4;
            if ((0Dl4 = 0Dl2) != null) {
                0Dl4 = 0Dl2;
                if (!0Dl2.LIZJ.contains(this)) {
                    0Dl4 = null;
                }
            }
            if (0Dl3 == null) {
                min = n;
                if (0Dl4 == null) {
                    continue;
                }
            }
            else if (0Dl4 != null) {
                min = n;
                if (!this.LIZ(0Dl3, 0Dl4)) {
                    continue;
                }
            }
            final Animator liz = this.LIZ(viewGroup, 0Dl3, 0Dl4);
            min = n;
            if (liz != null) {
                View liziz2;
                0Dl 0Dl7;
                if (0Dl4 != null) {
                    final View liziz = 0Dl4.LIZIZ;
                    final String[] liz2 = this.LIZ();
                    if (liz2 != null && liz2.length > 0) {
                        final 0Dl 0Dl5 = new 0Dl(liziz);
                        final 0Dl 0Dl6 = 0Dm2.LIZ.get(liziz);
                        if (0Dl6 != null) {
                            for (int j = 0; j < liz2.length; ++j) {
                                0Dl5.LIZ.put(liz2[j], 0Dl6.LIZ.get(liz2[j]));
                            }
                        }
                        final int size2 = lji.size();
                        int n2 = 0;
                        while (true) {
                            liziz2 = liziz;
                            0Dl7 = 0Dl5;
                            if (n2 >= size2) {
                                break;
                            }
                            final a a = (a)lji.get(lji.LIZIZ(n2));
                            if (a.LIZJ != null && a.LIZ == liziz && a.LIZIZ.equals(this.LIZIZ) && a.LIZJ.equals(0Dl5)) {
                                min = n;
                                continue Label_0471;
                            }
                            ++n2;
                        }
                    }
                    else {
                        0Dl7 = null;
                        liziz2 = liziz;
                    }
                }
                else {
                    liziz2 = 0Dl3.LIZIZ;
                    0Dl7 = null;
                }
                final 0Dj ljiil = this.LJIIL;
                min = n;
                if (ljiil != null) {
                    final long liz3 = ljiil.LIZ(viewGroup, this, 0Dl3, 0Dl4);
                    sparseIntArray.put(this.LJJIJIIJI.size(), (int)liz3);
                    min = Math.min(liz3, n);
                }
                lji.put((Object)liz, (Object)new a(liziz2, this.LIZIZ, this, 0Ds.LIZIZ((View)viewGroup), 0Dl7));
                this.LJJIJIIJI.add(liz);
            }
        }
        if (sparseIntArray.size() != 0) {
            for (int k = 0; k < sparseIntArray.size(); ++k) {
                final Animator animator = this.LJJIJIIJI.get(sparseIntArray.keyAt(k));
                animator.setStartDelay(sparseIntArray.valueAt(k) - n + animator.getStartDelay());
            }
        }
    }
    
    public final void LIZ(final ViewGroup viewGroup, final boolean b) {
        this.LIZ(b);
        final int size = this.LJFF.size();
        final int n = 0;
        Label_0293: {
            if (size > 0 || this.LJI.size() > 0) {
                final ArrayList<String> ljii = this.LJII;
                if (ljii == null || ljii.isEmpty()) {
                    final ArrayList<Class<?>> ljiiiizz = this.LJIIIIZZ;
                    if (ljiiiizz == null || ljiiiizz.isEmpty()) {
                        for (int i = 0; i < this.LJFF.size(); ++i) {
                            final View viewById = viewGroup.findViewById((int)this.LJFF.get(i));
                            if (viewById != null) {
                                final 0Dl 0Dl = new 0Dl(viewById);
                                if (b) {
                                    this.LIZ(0Dl);
                                }
                                else {
                                    this.LIZIZ(0Dl);
                                }
                                0Dl.LIZJ.add(this);
                                this.LIZJ(0Dl);
                                if (b) {
                                    LIZ(this.LJJ, viewById, 0Dl);
                                }
                                else {
                                    LIZ(this.LJJI, viewById, 0Dl);
                                }
                            }
                        }
                        for (int j = 0; j < this.LJI.size(); ++j) {
                            final View view = this.LJI.get(j);
                            final 0Dl 0Dl2 = new 0Dl(view);
                            if (b) {
                                this.LIZ(0Dl2);
                            }
                            else {
                                this.LIZIZ(0Dl2);
                            }
                            0Dl2.LIZJ.add(this);
                            this.LIZJ(0Dl2);
                            if (b) {
                                LIZ(this.LJJ, view, 0Dl2);
                            }
                            else {
                                LIZ(this.LJJI, view, 0Dl2);
                            }
                        }
                        break Label_0293;
                    }
                }
            }
            this.LIZJ((View)viewGroup, b);
        }
        if (!b) {
            final 13j<String, String> ljjijiijil = this.LJJIJIIJIL;
            if (ljjijiijil != null) {
                final int size2 = ljjijiijil.size();
                final ArrayList list = new ArrayList<View>(size2);
                int n2 = 0;
                int k;
                while (true) {
                    k = n;
                    if (n2 >= size2) {
                        break;
                    }
                    list.add((View)this.LJJ.LIZLLL.remove(this.LJJIJIIJIL.LIZIZ(n2)));
                    ++n2;
                }
                while (k < size2) {
                    final View value = list.get(k);
                    if (value != null) {
                        this.LJJ.LIZLLL.put(this.LJJIJIIJIL.LIZJ(k), value);
                    }
                    ++k;
                }
            }
        }
    }
    
    public final void LIZ(final boolean b) {
        if (b) {
            this.LJJ.LIZ.clear();
            this.LJJ.LIZIZ.clear();
            this.LJJ.LIZJ.LIZJ();
            return;
        }
        this.LJJI.LIZ.clear();
        this.LJJI.LIZIZ.clear();
        this.LJJI.LIZJ.LIZJ();
    }
    
    public boolean LIZ(final 0Dl 0Dl, final 0Dl 0Dl2) {
        boolean b2;
        final boolean b = b2 = false;
        if (0Dl != null) {
            b2 = b;
            if (0Dl2 != null) {
                final String[] liz = this.LIZ();
                if (liz != null) {
                    final int length = liz.length;
                    int n = 0;
                    while (true) {
                        b2 = b;
                        if (n >= length) {
                            return b2;
                        }
                        if (LIZ(0Dl, 0Dl2, liz[n])) {
                            break;
                        }
                        ++n;
                    }
                }
                else {
                    final Iterator<String> iterator = 0Dl.LIZ.keySet().iterator();
                    do {
                        b2 = b;
                        if (iterator.hasNext()) {
                            continue;
                        }
                        return b2;
                    } while (!LIZ(0Dl, 0Dl2, iterator.next()));
                }
                b2 = true;
            }
        }
        return b2;
    }
    
    public final boolean LIZ(final View view) {
        final int id = view.getId();
        final ArrayList<Integer> ljiilliil = this.LJIILLIIL;
        if (ljiilliil != null && ljiilliil.contains(id)) {
            return false;
        }
        final ArrayList<View> ljiizilj = this.LJIIZILJ;
        if (ljiizilj != null && ljiizilj.contains(view)) {
            return false;
        }
        final ArrayList<Class<?>> ljij = this.LJIJ;
        if (ljij != null) {
            for (int size = ljij.size(), i = 0; i < size; ++i) {
                if (this.LJIJ.get(i).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.LJIJI != null && view.getTransitionName() != null && this.LJIJI.contains(view.getTransitionName())) {
            return false;
        }
        if (this.LJFF.size() == 0 && this.LJI.size() == 0) {
            final ArrayList<Class<?>> ljiiiizz = this.LJIIIIZZ;
            if (ljiiiizz == null || ljiiiizz.isEmpty()) {
                final ArrayList<String> ljii = this.LJII;
                if (ljii == null || ljii.isEmpty()) {
                    return true;
                }
            }
        }
        if (this.LJFF.contains(id) || this.LJI.contains(view)) {
            return true;
        }
        final ArrayList<String> ljii2 = this.LJII;
        if (ljii2 != null && ljii2.contains(view.getTransitionName())) {
            return true;
        }
        if (this.LJIIIIZZ != null) {
            for (int j = 0; j < this.LJIIIIZZ.size(); ++j) {
                if (this.LJIIIIZZ.get(j).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public String[] LIZ() {
        return null;
    }
    
    public 0Dg LIZIZ(final long lizj) {
        this.LIZJ = lizj;
        return this;
    }
    
    public 0Dg LIZIZ(final c c) {
        final ArrayList<c> ljjij = this.LJJIJ;
        if (ljjij == null) {
            return this;
        }
        ljjij.remove(c);
        if (this.LJJIJ.size() == 0) {
            this.LJJIJ = null;
        }
        return this;
    }
    
    public 0Dg LIZIZ(final View view) {
        this.LJI.add(view);
        return this;
    }
    
    public final 0Dl LIZIZ(final View view, final boolean b) {
        0Dg 0Dg = this;
        while (true) {
            final 16Z ljiiiz = 0Dg.LJIIIZ;
            if (ljiiiz == null) {
                break;
            }
            0Dg = ljiiiz;
        }
        ArrayList<0Dl> list;
        if (b) {
            list = 0Dg.LJJII;
        }
        else {
            list = 0Dg.LJJIII;
        }
        final 0Dl 0Dl = null;
        if (list == null) {
            return null;
        }
        final int size = list.size();
        int n = 0;
        while (true) {
            Label_0129: {
                0Dl 0Dl2;
                while (true) {
                    0Dl2 = 0Dl;
                    if (n >= size) {
                        break;
                    }
                    final 0Dl 0Dl3 = list.get(n);
                    if (0Dl3 == null) {
                        return null;
                    }
                    if (0Dl3.LIZIZ == view) {
                        0Dl2 = 0Dl;
                        if (n < 0) {
                            break;
                        }
                        if (b) {
                            final ArrayList<0Dl> list2 = 0Dg.LJJIII;
                            0Dl2 = list2.get(n);
                            break;
                        }
                        break Label_0129;
                    }
                    else {
                        ++n;
                    }
                }
                return 0Dl2;
            }
            final ArrayList<0Dl> list2 = 0Dg.LJJII;
            continue;
        }
    }
    
    public void LIZIZ() {
        this.LIZJ();
        final 13j<Animator, a> lji = LJI();
        for (final Animator animator : this.LJJIJIIJI) {
            if (lji.containsKey(animator)) {
                this.LIZJ();
                if (animator == null) {
                    continue;
                }
                animator.addListener((Animator$AnimatorListener)new 0Db(this, lji));
                final long lizlll = this.LIZLLL;
                if (lizlll >= 0L) {
                    animator.setDuration(lizlll);
                }
                final long lizj = this.LIZJ;
                if (lizj >= 0L) {
                    animator.setStartDelay(lizj + animator.getStartDelay());
                }
                final TimeInterpolator lj = this.LJ;
                if (lj != null) {
                    animator.setInterpolator(lj);
                }
                animator.addListener((Animator$AnimatorListener)new 0Dc(this));
                animator.start();
            }
        }
        this.LJJIJIIJI.clear();
        this.LIZLLL();
    }
    
    public abstract void LIZIZ(final 0Dl p0);
    
    public 0Dg LIZJ(final View view) {
        this.LJI.remove(view);
        return this;
    }
    
    public final void LIZJ() {
        if (this.LJJIIJZLJL == 0) {
            final ArrayList<c> ljjij = this.LJJIJ;
            if (ljjij != null && ljjij.size() > 0) {
                final ArrayList list = (ArrayList)this.LJJIJ.clone();
                for (int size = list.size(), i = 0; i < size; ++i) {
                    ((c)list.get(i)).LIZIZ(this);
                }
            }
            this.LJJIIZI = false;
        }
        ++this.LJJIIJZLJL;
    }
    
    public void LIZJ(final 0Dl 0Dl) {
        if (this.LJIIL != null && !0Dl.LIZ.isEmpty()) {
            final String[] liz = this.LJIIL.LIZ();
            if (liz == null) {
                return;
            }
            for (int i = 0; i < liz.length; ++i) {
                if (!0Dl.LIZ.containsKey(liz[i])) {
                    this.LJIIL.LIZ(0Dl);
                    break;
                }
            }
        }
    }
    
    public final void LIZLLL() {
        final int ljjiijzljl = this.LJJIIJZLJL - 1;
        this.LJJIIJZLJL = ljjiijzljl;
        if (ljjiijzljl == 0) {
            final ArrayList<c> ljjij = this.LJJIJ;
            if (ljjij != null && ljjij.size() > 0) {
                final ArrayList list = (ArrayList)this.LJJIJ.clone();
                for (int size = list.size(), i = 0; i < size; ++i) {
                    ((c)list.get(i)).LIZ(this);
                }
            }
            for (int j = 0; j < this.LJJ.LIZJ.LIZIZ(); ++j) {
                final View view = this.LJJ.LIZJ.LIZJ(j);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int k = 0; k < this.LJJI.LIZJ.LIZIZ(); ++k) {
                final View view2 = this.LJJI.LIZJ.LIZJ(k);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.LJJIIZI = true;
        }
    }
    
    public void LIZLLL(final View view) {
        if (!this.LJJIIZI) {
            final 13j<Animator, a> lji = LJI();
            int i = lji.size();
            final 0DL liziz = 0Ds.LIZIZ(view);
            --i;
            while (i >= 0) {
                final a a = (a)lji.LIZJ(i);
                if (a.LIZ != null && liziz.equals(a.LIZLLL)) {
                    ((Animator)lji.LIZIZ(i)).pause();
                }
                --i;
            }
            final ArrayList<c> ljjij = this.LJJIJ;
            if (ljjij != null && ljjij.size() > 0) {
                final ArrayList list = (ArrayList)this.LJJIJ.clone();
                for (int size = list.size(), j = 0; j < size; ++j) {
                    ((c)list.get(j)).LIZIZ();
                }
            }
            this.LJJIIZ = true;
        }
    }
    
    public void LJ() {
        for (int i = this.LJIIJJI.size() - 1; i >= 0; --i) {
            this.LJIIJJI.get(i).cancel();
        }
        final ArrayList<c> ljjij = this.LJJIJ;
        if (ljjij != null && ljjij.size() > 0) {
            final ArrayList list = (ArrayList)this.LJJIJ.clone();
            for (int size = list.size(), j = 0; j < size; ++j) {
                ((c)list.get(j)).LIZ();
            }
        }
    }
    
    public void LJ(final View view) {
        if (this.LJJIIZ) {
            if (!this.LJJIIZI) {
                final 13j<Animator, a> lji = LJI();
                int i = lji.size();
                final 0DL liziz = 0Ds.LIZIZ(view);
                --i;
                while (i >= 0) {
                    final a a = (a)lji.LIZJ(i);
                    if (a.LIZ != null && liziz.equals(a.LIZLLL)) {
                        ((Animator)lji.LIZIZ(i)).resume();
                    }
                    --i;
                }
                final ArrayList<c> ljjij = this.LJJIJ;
                if (ljjij != null && ljjij.size() > 0) {
                    final ArrayList list = (ArrayList)this.LJJIJ.clone();
                    for (int size = list.size(), j = 0; j < size; ++j) {
                        ((c)list.get(j)).LIZJ();
                    }
                }
            }
            this.LJJIIZ = false;
        }
    }
    
    public 0Dg LJFF() {
        try {
            final 0Dg 0Dg = (0Dg)super.clone();
            0Dg.LJJIJIIJI = new ArrayList<Animator>();
            0Dg.LJJ = new 0Dm();
            0Dg.LJJI = new 0Dm();
            0Dg.LJJII = null;
            0Dg.LJJIII = null;
            return 0Dg;
        }
        catch (final CloneNotSupportedException ex) {
            return null;
        }
    }
    
    @Override
    public String toString() {
        return this.LIZ("");
    }
    
    public static final class a
    {
        public View LIZ;
        public String LIZIZ;
        public 0Dl LIZJ;
        public 0DL LIZLLL;
        public 0Dg LJ;
        
        static {
            Covode.recordClassIndex(1452);
        }
        
        public a(final View liz, final String liziz, final 0Dg lj, final 0DL lizlll, final 0Dl lizj) {
            this.LIZ = liz;
            this.LIZIZ = liziz;
            this.LIZJ = lizj;
            this.LIZLLL = lizlll;
            this.LJ = lj;
        }
    }
    
    public abstract static class b
    {
        static {
            Covode.recordClassIndex(1453);
        }
        
        public abstract Rect LIZ();
    }
    
    public interface c
    {
        default static {
            Covode.recordClassIndex(1454);
        }
        
        void LIZ();
        
        void LIZ(final 0Dg p0);
        
        void LIZIZ();
        
        void LIZIZ(final 0Dg p0);
        
        void LIZJ();
    }
}
