// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.os.Build$VERSION;
import java.util.Iterator;
import android.view.ViewGroup$LayoutParams;
import java.util.Collection;
import java.util.HashSet;
import android.content.Context;
import java.util.Arrays;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.R;
import android.view.View;
import android.content.res.TypedArray;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import android.util.SparseIntArray;

public class 05c
{
    public static final int[] LIZ;
    public static SparseIntArray LIZJ;
    public HashMap<Integer, a> LIZIZ;
    
    static {
        Covode.recordClassIndex(640);
        LIZ = new int[] { 0, 4, 8 };
        (05c.LIZJ = new SparseIntArray()).append(55, 25);
        05c.LIZJ.append(56, 26);
        05c.LIZJ.append(58, 29);
        05c.LIZJ.append(59, 30);
        05c.LIZJ.append(64, 36);
        05c.LIZJ.append(63, 35);
        05c.LIZJ.append(37, 4);
        05c.LIZJ.append(36, 3);
        05c.LIZJ.append(34, 1);
        05c.LIZJ.append(72, 6);
        05c.LIZJ.append(73, 7);
        05c.LIZJ.append(44, 17);
        05c.LIZJ.append(45, 18);
        05c.LIZJ.append(46, 19);
        05c.LIZJ.append(0, 27);
        05c.LIZJ.append(60, 32);
        05c.LIZJ.append(61, 33);
        05c.LIZJ.append(43, 10);
        05c.LIZJ.append(42, 9);
        05c.LIZJ.append(76, 13);
        05c.LIZJ.append(79, 16);
        05c.LIZJ.append(77, 14);
        05c.LIZJ.append(74, 11);
        05c.LIZJ.append(78, 15);
        05c.LIZJ.append(75, 12);
        05c.LIZJ.append(67, 40);
        05c.LIZJ.append(53, 39);
        05c.LIZJ.append(52, 41);
        05c.LIZJ.append(66, 42);
        05c.LIZJ.append(51, 20);
        05c.LIZJ.append(65, 37);
        05c.LIZJ.append(41, 5);
        05c.LIZJ.append(54, 75);
        05c.LIZJ.append(62, 75);
        05c.LIZJ.append(57, 75);
        05c.LIZJ.append(35, 75);
        05c.LIZJ.append(33, 75);
        05c.LIZJ.append(5, 24);
        05c.LIZJ.append(7, 28);
        05c.LIZJ.append(23, 31);
        05c.LIZJ.append(24, 8);
        05c.LIZJ.append(6, 34);
        05c.LIZJ.append(8, 2);
        05c.LIZJ.append(3, 23);
        05c.LIZJ.append(4, 21);
        05c.LIZJ.append(2, 22);
        05c.LIZJ.append(13, 43);
        05c.LIZJ.append(26, 44);
        05c.LIZJ.append(21, 45);
        05c.LIZJ.append(22, 46);
        05c.LIZJ.append(20, 60);
        05c.LIZJ.append(18, 47);
        05c.LIZJ.append(19, 48);
        05c.LIZJ.append(14, 49);
        05c.LIZJ.append(15, 50);
        05c.LIZJ.append(16, 51);
        05c.LIZJ.append(17, 52);
        05c.LIZJ.append(25, 53);
        05c.LIZJ.append(68, 54);
        05c.LIZJ.append(47, 55);
        05c.LIZJ.append(69, 56);
        05c.LIZJ.append(48, 57);
        05c.LIZJ.append(70, 58);
        05c.LIZJ.append(49, 59);
        05c.LIZJ.append(38, 61);
        05c.LIZJ.append(40, 62);
        05c.LIZJ.append(39, 63);
        05c.LIZJ.append(1, 38);
        05c.LIZJ.append(71, 69);
        05c.LIZJ.append(50, 70);
        05c.LIZJ.append(29, 71);
        05c.LIZJ.append(28, 72);
        05c.LIZJ.append(30, 73);
        05c.LIZJ.append(27, 74);
    }
    
    public 05c() {
        this.LIZIZ = new HashMap<Integer, a>();
    }
    
    public static int LIZ(final TypedArray typedArray, final int n, int n2) {
        if ((n2 = typedArray.getResourceId(n, n2)) == -1) {
            n2 = typedArray.getInt(n, -1);
        }
        return n2;
    }
    
    private int[] LIZ(final View view, String s) {
        final String[] split = s.split(",");
        final Context context = view.getContext();
        s = (String)(Object)new int[split.length];
        int i;
        int n;
        for (i = 0, n = 0; i < split.length; ++i, ++n) {
            final String trim = split[i].trim();
            int int1;
            try {
                int1 = R.id.class.getField(trim).getInt(null);
            }
            catch (final Exception ex) {
                int1 = 0;
            }
            int identifier = int1;
            if (int1 == 0) {
                identifier = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            int intValue;
            if ((intValue = identifier) == 0) {
                intValue = identifier;
                if (view.isInEditMode()) {
                    intValue = identifier;
                    if (view.getParent() instanceof ConstraintLayout) {
                        final Object designInformation = ((ConstraintLayout)view.getParent()).getDesignInformation(0, trim);
                        intValue = identifier;
                        if (designInformation != null) {
                            intValue = identifier;
                            if (designInformation instanceof Integer) {
                                intValue = (int)designInformation;
                            }
                        }
                    }
                }
            }
            s[n] = intValue;
        }
        Object copy = s;
        if (n != split.length) {
            copy = Arrays.copyOf((int[])(Object)s, n);
        }
        return (int[])copy;
    }
    
    private void LIZIZ(final int n, final int n2, final int n3, final int n4, final int n5) {
        if (n3 == 1 || n3 == 2) {
            this.LIZ(n, 1, n2, n3, 0);
            this.LIZ(n, 2, n4, n5, 0);
            this.LIZIZ.get(n).LJIJJ = 0.5f;
            return;
        }
        if (n3 == 6 || n3 == 7) {
            this.LIZ(n, 6, n2, n3, 0);
            this.LIZ(n, 7, n4, n5, 0);
            this.LIZIZ.get(n).LJIJJ = 0.5f;
            return;
        }
        this.LIZ(n, 3, n2, n3, 0);
        this.LIZ(n, 4, n4, n5, 0);
        this.LIZIZ.get(n).LJIJJLI = 0.5f;
    }
    
    private String LIZJ(final int n) {
        switch (n) {
            default: {
                return "undefined";
            }
            case 1: {
                return "left";
            }
            case 2: {
                return "right";
            }
            case 3: {
                return "top";
            }
            case 4: {
                return "bottom";
            }
            case 5: {
                return "baseline";
            }
            case 6: {
                return "start";
            }
            case 7: {
                return "end";
            }
        }
    }
    
    public final void LIZ(final int n) {
        this.LIZIZ.remove(n);
    }
    
    public final void LIZ(final int n, final float ljijj) {
        this.LIZIZ(n).LJIJJ = ljijj;
    }
    
    public final void LIZ(final int n, final int n2) {
        if (n2 == 0) {
            this.LIZIZ(n, 0, 1, 0, 2);
            return;
        }
        this.LIZIZ(n, n2, 2, n2, 1);
    }
    
    public final void LIZ(final int n, final int n2, final int n3) {
        final a liziz = this.LIZIZ(n);
        switch (n2) {
            default: {
                throw new IllegalArgumentException("unknown constraint");
            }
            case 7: {
                liziz.LJJIJIIJI = n3;
                return;
            }
            case 6: {
                liziz.LJJIJIIJIL = n3;
                return;
            }
            case 5: {
                throw new IllegalArgumentException("baseline does not support margins");
            }
            case 4: {
                liziz.LJJIJ = n3;
                return;
            }
            case 3: {
                liziz.LJJIIZI = n3;
                return;
            }
            case 2: {
                liziz.LJJIIZ = n3;
                return;
            }
            case 1: {
                liziz.LJJIIJZLJL = n3;
            }
        }
    }
    
    public final void LIZ(final int n, final int n2, final int ljiiiizz, final int n3) {
        if (!this.LIZIZ.containsKey(n)) {
            this.LIZIZ.put(n, new a((byte)0));
        }
        final a a = this.LIZIZ.get(n);
        switch (n2) {
            default: {
                final StringBuilder sb = new StringBuilder();
                sb.append(this.LIZJ(n2));
                sb.append(" to ");
                sb.append(this.LIZJ(n3));
                sb.append(" unknown");
                throw new IllegalArgumentException(sb.toString());
            }
            case 7: {
                if (n3 == 7) {
                    a.LJIJI = ljiiiizz;
                    a.LJIJ = -1;
                    return;
                }
                if (n3 == 6) {
                    a.LJIJ = ljiiiizz;
                    a.LJIJI = -1;
                    return;
                }
                final StringBuilder sb2 = new StringBuilder("right to ");
                sb2.append(this.LIZJ(n3));
                sb2.append(" undefined");
                throw new IllegalArgumentException(sb2.toString());
            }
            case 6: {
                if (n3 == 6) {
                    a.LJIIZILJ = ljiiiizz;
                    a.LJIILLIIL = -1;
                    return;
                }
                if (n3 == 7) {
                    a.LJIILLIIL = ljiiiizz;
                    a.LJIIZILJ = -1;
                    return;
                }
                final StringBuilder sb3 = new StringBuilder("right to ");
                sb3.append(this.LIZJ(n3));
                sb3.append(" undefined");
                throw new IllegalArgumentException(sb3.toString());
            }
            case 5: {
                if (n3 == 5) {
                    a.LJIILL = ljiiiizz;
                    a.LJIILJJIL = -1;
                    a.LJIILIIL = -1;
                    a.LJIIJJI = -1;
                    a.LJIIL = -1;
                    return;
                }
                final StringBuilder sb4 = new StringBuilder("right to ");
                sb4.append(this.LIZJ(n3));
                sb4.append(" undefined");
                throw new IllegalArgumentException(sb4.toString());
            }
            case 4: {
                if (n3 == 4) {
                    a.LJIILJJIL = ljiiiizz;
                    a.LJIILIIL = -1;
                    a.LJIILL = -1;
                    return;
                }
                if (n3 == 3) {
                    a.LJIILIIL = ljiiiizz;
                    a.LJIILJJIL = -1;
                    a.LJIILL = -1;
                    return;
                }
                final StringBuilder sb5 = new StringBuilder("right to ");
                sb5.append(this.LIZJ(n3));
                sb5.append(" undefined");
                throw new IllegalArgumentException(sb5.toString());
            }
            case 3: {
                if (n3 == 3) {
                    a.LJIIJJI = ljiiiizz;
                    a.LJIIL = -1;
                    a.LJIILL = -1;
                    return;
                }
                if (n3 == 4) {
                    a.LJIIL = ljiiiizz;
                    a.LJIIJJI = -1;
                    a.LJIILL = -1;
                    return;
                }
                final StringBuilder sb6 = new StringBuilder("right to ");
                sb6.append(this.LIZJ(n3));
                sb6.append(" undefined");
                throw new IllegalArgumentException(sb6.toString());
            }
            case 2: {
                if (n3 == 1) {
                    a.LJIIIZ = ljiiiizz;
                    a.LJIIJ = -1;
                    return;
                }
                if (n3 == 2) {
                    a.LJIIJ = ljiiiizz;
                    a.LJIIIZ = -1;
                    return;
                }
                final StringBuilder sb7 = new StringBuilder("right to ");
                sb7.append(this.LIZJ(n3));
                sb7.append(" undefined");
                throw new IllegalArgumentException(sb7.toString());
            }
            case 1: {
                if (n3 == 1) {
                    a.LJII = ljiiiizz;
                    a.LJIIIIZZ = -1;
                    return;
                }
                if (n3 == 2) {
                    a.LJIIIIZZ = ljiiiizz;
                    a.LJII = -1;
                    return;
                }
                final StringBuilder sb8 = new StringBuilder("left to ");
                sb8.append(this.LIZJ(n3));
                sb8.append(" undefined");
                throw new IllegalArgumentException(sb8.toString());
            }
        }
    }
    
    public final void LIZ(final int n, final int n2, final int ljiiiizz, final int n3, final int n4) {
        if (!this.LIZIZ.containsKey(n)) {
            this.LIZIZ.put(n, new a((byte)0));
        }
        final a a = this.LIZIZ.get(n);
        switch (n2) {
            default: {
                final StringBuilder sb = new StringBuilder();
                sb.append(this.LIZJ(n2));
                sb.append(" to ");
                sb.append(this.LIZJ(n3));
                sb.append(" unknown");
                throw new IllegalArgumentException(sb.toString());
            }
            case 7: {
                if (n3 == 7) {
                    a.LJIJI = ljiiiizz;
                    a.LJIJ = -1;
                }
                else {
                    if (n3 != 6) {
                        final StringBuilder sb2 = new StringBuilder("right to ");
                        sb2.append(this.LIZJ(n3));
                        sb2.append(" undefined");
                        throw new IllegalArgumentException(sb2.toString());
                    }
                    a.LJIJ = ljiiiizz;
                    a.LJIJI = -1;
                }
                a.LJJIJIIJI = n4;
                return;
            }
            case 6: {
                if (n3 == 6) {
                    a.LJIIZILJ = ljiiiizz;
                    a.LJIILLIIL = -1;
                }
                else {
                    if (n3 != 7) {
                        final StringBuilder sb3 = new StringBuilder("right to ");
                        sb3.append(this.LIZJ(n3));
                        sb3.append(" undefined");
                        throw new IllegalArgumentException(sb3.toString());
                    }
                    a.LJIILLIIL = ljiiiizz;
                    a.LJIIZILJ = -1;
                }
                a.LJJIJIIJIL = n4;
                return;
            }
            case 5: {
                if (n3 == 5) {
                    a.LJIILL = ljiiiizz;
                    a.LJIILJJIL = -1;
                    a.LJIILIIL = -1;
                    a.LJIIJJI = -1;
                    a.LJIIL = -1;
                    return;
                }
                final StringBuilder sb4 = new StringBuilder("right to ");
                sb4.append(this.LIZJ(n3));
                sb4.append(" undefined");
                throw new IllegalArgumentException(sb4.toString());
            }
            case 4: {
                if (n3 == 4) {
                    a.LJIILJJIL = ljiiiizz;
                    a.LJIILIIL = -1;
                    a.LJIILL = -1;
                }
                else {
                    if (n3 != 3) {
                        final StringBuilder sb5 = new StringBuilder("right to ");
                        sb5.append(this.LIZJ(n3));
                        sb5.append(" undefined");
                        throw new IllegalArgumentException(sb5.toString());
                    }
                    a.LJIILIIL = ljiiiizz;
                    a.LJIILJJIL = -1;
                    a.LJIILL = -1;
                }
                a.LJJIJ = n4;
                return;
            }
            case 3: {
                if (n3 == 3) {
                    a.LJIIJJI = ljiiiizz;
                    a.LJIIL = -1;
                    a.LJIILL = -1;
                }
                else {
                    if (n3 != 4) {
                        final StringBuilder sb6 = new StringBuilder("right to ");
                        sb6.append(this.LIZJ(n3));
                        sb6.append(" undefined");
                        throw new IllegalArgumentException(sb6.toString());
                    }
                    a.LJIIL = ljiiiizz;
                    a.LJIIJJI = -1;
                    a.LJIILL = -1;
                }
                a.LJJIIZI = n4;
                return;
            }
            case 2: {
                if (n3 == 1) {
                    a.LJIIIZ = ljiiiizz;
                    a.LJIIJ = -1;
                }
                else {
                    if (n3 != 2) {
                        final StringBuilder sb7 = new StringBuilder("right to ");
                        sb7.append(this.LIZJ(n3));
                        sb7.append(" undefined");
                        throw new IllegalArgumentException(sb7.toString());
                    }
                    a.LJIIJ = ljiiiizz;
                    a.LJIIIZ = -1;
                }
                a.LJJIIZ = n4;
                return;
            }
            case 1: {
                if (n3 == 1) {
                    a.LJII = ljiiiizz;
                    a.LJIIIIZZ = -1;
                }
                else {
                    if (n3 != 2) {
                        final StringBuilder sb8 = new StringBuilder("Left to ");
                        sb8.append(this.LIZJ(n3));
                        sb8.append(" undefined");
                        throw new IllegalArgumentException(sb8.toString());
                    }
                    a.LJIIIIZZ = ljiiiizz;
                    a.LJII = -1;
                }
                a.LJJIIJZLJL = n4;
            }
        }
    }
    
    public final void LIZ(final int n, final String ljil) {
        this.LIZIZ(n).LJIL = ljil;
    }
    
    public final void LIZ(final ConstraintLayout constraintLayout) {
        final int childCount = constraintLayout.getChildCount();
        this.LIZIZ.clear();
        for (int i = 0; i < childCount; ++i) {
            final View child = constraintLayout.getChildAt(i);
            final ConstraintLayout.a a = (ConstraintLayout.a)child.getLayoutParams();
            final int id = child.getId();
            if (id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.LIZIZ.containsKey(id)) {
                this.LIZIZ.put(id, new a((byte)0));
            }
            final a a2 = this.LIZIZ.get(id);
            a2.LIZ(id, a);
            a2.LJJIJIL = child.getVisibility();
            a2.LJJJJJ = child.getAlpha();
            a2.LJJJJLI = child.getRotation();
            a2.LJJJJLL = child.getRotationX();
            a2.LJJJJZ = child.getRotationY();
            a2.LJJJJZI = child.getScaleX();
            a2.LJJJLIIL = child.getScaleY();
            final float pivotX = child.getPivotX();
            final float pivotY = child.getPivotY();
            if (pivotX != 0.0 || pivotY != 0.0) {
                a2.LJJJLL = pivotX;
                a2.LJJJLZIJ = pivotY;
            }
            a2.LJJJZ = child.getTranslationX();
            a2.LJJL = child.getTranslationY();
            a2.LJJLI = child.getTranslationZ();
            if (a2.LJJJJJL) {
                a2.LJJJJL = child.getElevation();
            }
            if (child instanceof 13t) {
                final 13t 13t = (13t)child;
                a2.LJJLJ = 13t.allowsGoneWidget();
                a2.LJJZ = 13t.getReferencedIds();
                a2.LJJLJLI = 13t.getType();
            }
        }
    }
    
    public final a LIZIZ(final int n) {
        if (!this.LIZIZ.containsKey(n)) {
            this.LIZIZ.put(n, new a((byte)0));
        }
        return this.LIZIZ.get(n);
    }
    
    public final void LIZIZ(final int n, final float ljjliij) {
        this.LIZIZ(n).LJJLIIJ = ljjliij;
    }
    
    public final void LIZIZ(final int n, final int n2) {
        if (this.LIZIZ.containsKey(n)) {
            final a a = this.LIZIZ.get(n);
            switch (n2) {
                default: {
                    throw new IllegalArgumentException("unknown constraint");
                }
                case 7: {
                    a.LJIJ = -1;
                    a.LJIJI = -1;
                    a.LJJIJIIJI = -1;
                    a.LJJJ = -1;
                    return;
                }
                case 6: {
                    a.LJIILLIIL = -1;
                    a.LJIIZILJ = -1;
                    a.LJJIJIIJIL = -1;
                    a.LJJJI = -1;
                    return;
                }
                case 5: {
                    a.LJIILL = -1;
                    return;
                }
                case 4: {
                    a.LJIILIIL = -1;
                    a.LJIILJJIL = -1;
                    a.LJJIJ = -1;
                    a.LJJIZ = -1;
                    return;
                }
                case 3: {
                    a.LJIIL = -1;
                    a.LJIIJJI = -1;
                    a.LJJIIZI = -1;
                    a.LJJIJLIJ = -1;
                    return;
                }
                case 2: {
                    a.LJIIJ = -1;
                    a.LJIIIZ = -1;
                    a.LJJIIZ = -1;
                    a.LJJIL = -1;
                    return;
                }
                case 1: {
                    a.LJIIIIZZ = -1;
                    a.LJII = -1;
                    a.LJJIIJZLJL = -1;
                    a.LJJIJL = -1;
                    break;
                }
            }
        }
    }
    
    public final void LIZIZ(final ConstraintLayout constraintLayout) {
        this.LIZJ(constraintLayout);
        constraintLayout.setConstraintSet(null);
    }
    
    public final void LIZJ(final int n, final int lizj) {
        this.LIZIZ(n).LIZJ = lizj;
    }
    
    public final void LIZJ(final ConstraintLayout constraintLayout) {
        final int childCount = constraintLayout.getChildCount();
        final HashSet set = new HashSet((Collection<? extends E>)this.LIZIZ.keySet());
        for (int i = 0; i < childCount; ++i) {
            final View child = constraintLayout.getChildAt(i);
            final int id = child.getId();
            if (id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (this.LIZIZ.containsKey(id)) {
                set.remove(id);
                final a a = this.LIZIZ.get(id);
                if (child instanceof 13t) {
                    a.LJJLL = 1;
                }
                if (a.LJJLL != -1 && a.LJJLL == 1) {
                    final 13t 13t = (13t)child;
                    13t.setId(id);
                    13t.setType(a.LJJLJLI);
                    13t.setAllowsGoneWidget(a.LJJLJ);
                    if (a.LJJZ != null) {
                        13t.setReferencedIds(a.LJJZ);
                    }
                    else if (a.LJJZZI != null) {
                        13t.setReferencedIds(a.LJJZ = this.LIZ(13t, a.LJJZZI));
                    }
                }
                final ConstraintLayout.a layoutParams = (ConstraintLayout.a)child.getLayoutParams();
                a.LIZ(layoutParams);
                child.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
                child.setVisibility(a.LJJIJIL);
                child.setAlpha(a.LJJJJJ);
                child.setRotation(a.LJJJJLI);
                child.setRotationX(a.LJJJJLL);
                child.setRotationY(a.LJJJJZ);
                child.setScaleX(a.LJJJJZI);
                child.setScaleY(a.LJJJLIIL);
                if (!Float.isNaN(a.LJJJLL)) {
                    child.setPivotX(a.LJJJLL);
                }
                if (!Float.isNaN(a.LJJJLZIJ)) {
                    child.setPivotY(a.LJJJLZIJ);
                }
                child.setTranslationX(a.LJJJZ);
                child.setTranslationY(a.LJJL);
                child.setTranslationZ(a.LJJLI);
                if (a.LJJJJJL) {
                    child.setElevation(a.LJJJJL);
                }
            }
        }
        for (final Integer n : set) {
            final a a2 = this.LIZIZ.get(n);
            if (a2.LJJLL != -1 && a2.LJJLL == 1) {
                final 13t 13t2 = new 13t(constraintLayout.getContext());
                13t2.setId((int)n);
                if (a2.LJJZ != null) {
                    13t2.setReferencedIds(a2.LJJZ);
                }
                else if (a2.LJJZZI != null) {
                    13t2.setReferencedIds(a2.LJJZ = this.LIZ(13t2, a2.LJJZZI));
                }
                13t2.setType(a2.LJJLJLI);
                final ConstraintLayout.a generateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                13t2.validateParams();
                a2.LIZ(generateDefaultLayoutParams);
                constraintLayout.addView((View)13t2, (ViewGroup$LayoutParams)generateDefaultLayoutParams);
            }
            if (a2.LIZ) {
                final 05Y 05Y = new 05Y(constraintLayout.getContext());
                05Y.setId((int)n);
                final ConstraintLayout.a generateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                a2.LIZ(generateDefaultLayoutParams2);
                constraintLayout.addView((View)05Y, (ViewGroup$LayoutParams)generateDefaultLayoutParams2);
            }
        }
    }
    
    public final void LIZLLL(final int n, final int liziz) {
        this.LIZIZ(n).LIZIZ = liziz;
    }
    
    public final void LJ(final int n, final int ljjliiijjiz) {
        this.LIZIZ(n).LJJLIIIJJIZ = ljjliiijjiz;
    }
    
    public static final class a
    {
        public boolean LIZ;
        public int LIZIZ;
        public int LIZJ;
        public int LIZLLL;
        public int LJ;
        public int LJFF;
        public float LJI;
        public int LJII;
        public int LJIIIIZZ;
        public int LJIIIZ;
        public int LJIIJ;
        public int LJIIJJI;
        public int LJIIL;
        public int LJIILIIL;
        public int LJIILJJIL;
        public int LJIILL;
        public int LJIILLIIL;
        public int LJIIZILJ;
        public int LJIJ;
        public int LJIJI;
        public float LJIJJ;
        public float LJIJJLI;
        public String LJIL;
        public int LJJ;
        public int LJJI;
        public float LJJIFFI;
        public int LJJII;
        public int LJJIII;
        public int LJJIIJ;
        public int LJJIIJZLJL;
        public int LJJIIZ;
        public int LJJIIZI;
        public int LJJIJ;
        public int LJJIJIIJI;
        public int LJJIJIIJIL;
        public int LJJIJIL;
        public int LJJIJL;
        public int LJJIJLIJ;
        public int LJJIL;
        public int LJJIZ;
        public int LJJJ;
        public int LJJJI;
        public float LJJJIL;
        public float LJJJJ;
        public int LJJJJI;
        public int LJJJJIZL;
        public float LJJJJJ;
        public boolean LJJJJJL;
        public float LJJJJL;
        public float LJJJJLI;
        public float LJJJJLL;
        public float LJJJJZ;
        public float LJJJJZI;
        public float LJJJLIIL;
        public float LJJJLL;
        public float LJJJLZIJ;
        public float LJJJZ;
        public float LJJL;
        public float LJJLI;
        public boolean LJJLIIIIJ;
        public boolean LJJLIIIJ;
        public int LJJLIIIJILLIZJL;
        public int LJJLIIIJJI;
        public int LJJLIIIJJIZ;
        public int LJJLIIIJL;
        public int LJJLIIIJLJLI;
        public int LJJLIIIJLLLLLLLZ;
        public float LJJLIIJ;
        public float LJJLIL;
        public boolean LJJLJ;
        public int LJJLJLI;
        public int LJJLL;
        public int[] LJJZ;
        public String LJJZZI;
        
        static {
            Covode.recordClassIndex(641);
        }
        
        public a() {
            this.LJ = -1;
            this.LJFF = -1;
            this.LJI = -1.0f;
            this.LJII = -1;
            this.LJIIIIZZ = -1;
            this.LJIIIZ = -1;
            this.LJIIJ = -1;
            this.LJIIJJI = -1;
            this.LJIIL = -1;
            this.LJIILIIL = -1;
            this.LJIILJJIL = -1;
            this.LJIILL = -1;
            this.LJIILLIIL = -1;
            this.LJIIZILJ = -1;
            this.LJIJ = -1;
            this.LJIJI = -1;
            this.LJIJJ = 0.5f;
            this.LJIJJLI = 0.5f;
            this.LJJ = -1;
            this.LJJII = -1;
            this.LJJIII = -1;
            this.LJJIIJ = -1;
            this.LJJIIJZLJL = -1;
            this.LJJIIZ = -1;
            this.LJJIIZI = -1;
            this.LJJIJ = -1;
            this.LJJIJIIJI = -1;
            this.LJJIJIIJIL = -1;
            this.LJJIJL = -1;
            this.LJJIJLIJ = -1;
            this.LJJIL = -1;
            this.LJJIZ = -1;
            this.LJJJ = -1;
            this.LJJJI = -1;
            this.LJJJJJ = 1.0f;
            this.LJJJJZI = 1.0f;
            this.LJJJLIIL = 1.0f;
            this.LJJJLL = Float.NaN;
            this.LJJJLZIJ = Float.NaN;
            this.LJJLIIIJJIZ = -1;
            this.LJJLIIIJL = -1;
            this.LJJLIIIJLJLI = -1;
            this.LJJLIIIJLLLLLLLZ = -1;
            this.LJJLIIJ = 1.0f;
            this.LJJLIL = 1.0f;
            this.LJJLJLI = -1;
            this.LJJLL = -1;
        }
        
        public final void LIZ(int sdk_INT, final ConstraintLayout.a a) {
            this.LIZLLL = sdk_INT;
            this.LJII = a.leftToLeft;
            this.LJIIIIZZ = a.leftToRight;
            this.LJIIIZ = a.rightToLeft;
            this.LJIIJ = a.rightToRight;
            this.LJIIJJI = a.topToTop;
            this.LJIIL = a.topToBottom;
            this.LJIILIIL = a.bottomToTop;
            this.LJIILJJIL = a.bottomToBottom;
            this.LJIILL = a.baselineToBaseline;
            this.LJIILLIIL = a.startToEnd;
            this.LJIIZILJ = a.startToStart;
            this.LJIJ = a.endToStart;
            this.LJIJI = a.endToEnd;
            this.LJIJJ = a.horizontalBias;
            this.LJIJJLI = a.verticalBias;
            this.LJIL = a.dimensionRatio;
            this.LJJ = a.circleConstraint;
            this.LJJI = a.circleRadius;
            this.LJJIFFI = a.circleAngle;
            this.LJJII = a.editorAbsoluteX;
            this.LJJIII = a.editorAbsoluteY;
            this.LJJIIJ = a.orientation;
            this.LJI = a.guidePercent;
            this.LJ = a.guideBegin;
            this.LJFF = a.guideEnd;
            this.LIZIZ = a.width;
            this.LIZJ = a.height;
            this.LJJIIJZLJL = a.leftMargin;
            this.LJJIIZ = a.rightMargin;
            this.LJJIIZI = a.topMargin;
            this.LJJIJ = a.bottomMargin;
            this.LJJJIL = a.verticalWeight;
            this.LJJJJ = a.horizontalWeight;
            this.LJJJJIZL = a.verticalChainStyle;
            this.LJJJJI = a.horizontalChainStyle;
            this.LJJLIIIIJ = a.constrainedWidth;
            this.LJJLIIIJ = a.constrainedHeight;
            this.LJJLIIIJILLIZJL = a.matchConstraintDefaultWidth;
            this.LJJLIIIJJI = a.matchConstraintDefaultHeight;
            this.LJJLIIIIJ = a.constrainedWidth;
            this.LJJLIIIJJIZ = a.matchConstraintMaxWidth;
            this.LJJLIIIJL = a.matchConstraintMaxHeight;
            this.LJJLIIIJLJLI = a.matchConstraintMinWidth;
            this.LJJLIIIJLLLLLLLZ = a.matchConstraintMinHeight;
            this.LJJLIIJ = a.matchConstraintPercentWidth;
            this.LJJLIL = a.matchConstraintPercentHeight;
            sdk_INT = Build$VERSION.SDK_INT;
            this.LJJIJIIJI = a.getMarginEnd();
            this.LJJIJIIJIL = a.getMarginStart();
        }
        
        public final void LIZ(final int n, final 05d.a a) {
            this.LIZ(n, (ConstraintLayout.a)a);
            this.LJJJJJ = a.LIZ;
            this.LJJJJLI = a.LIZLLL;
            this.LJJJJLL = a.LJ;
            this.LJJJJZ = a.LJFF;
            this.LJJJJZI = a.LJI;
            this.LJJJLIIL = a.LJII;
            this.LJJJLL = a.LJIIIIZZ;
            this.LJJJLZIJ = a.LJIIIZ;
            this.LJJJZ = a.LJIIJ;
            this.LJJL = a.LJIIJJI;
            this.LJJLI = a.LJIIL;
            this.LJJJJL = a.LIZJ;
            this.LJJJJJL = a.LIZIZ;
        }
        
        public final void LIZ(final ConstraintLayout.a a) {
            a.leftToLeft = this.LJII;
            a.leftToRight = this.LJIIIIZZ;
            a.rightToLeft = this.LJIIIZ;
            a.rightToRight = this.LJIIJ;
            a.topToTop = this.LJIIJJI;
            a.topToBottom = this.LJIIL;
            a.bottomToTop = this.LJIILIIL;
            a.bottomToBottom = this.LJIILJJIL;
            a.baselineToBaseline = this.LJIILL;
            a.startToEnd = this.LJIILLIIL;
            a.startToStart = this.LJIIZILJ;
            a.endToStart = this.LJIJ;
            a.endToEnd = this.LJIJI;
            a.leftMargin = this.LJJIIJZLJL;
            a.rightMargin = this.LJJIIZ;
            a.topMargin = this.LJJIIZI;
            a.bottomMargin = this.LJJIJ;
            a.goneStartMargin = this.LJJJI;
            a.goneEndMargin = this.LJJJ;
            a.horizontalBias = this.LJIJJ;
            a.verticalBias = this.LJIJJLI;
            a.circleConstraint = this.LJJ;
            a.circleRadius = this.LJJI;
            a.circleAngle = this.LJJIFFI;
            a.dimensionRatio = this.LJIL;
            a.editorAbsoluteX = this.LJJII;
            a.editorAbsoluteY = this.LJJIII;
            a.verticalWeight = this.LJJJIL;
            a.horizontalWeight = this.LJJJJ;
            a.verticalChainStyle = this.LJJJJIZL;
            a.horizontalChainStyle = this.LJJJJI;
            a.constrainedWidth = this.LJJLIIIIJ;
            a.constrainedHeight = this.LJJLIIIJ;
            a.matchConstraintDefaultWidth = this.LJJLIIIJILLIZJL;
            a.matchConstraintDefaultHeight = this.LJJLIIIJJI;
            a.matchConstraintMaxWidth = this.LJJLIIIJJIZ;
            a.matchConstraintMaxHeight = this.LJJLIIIJL;
            a.matchConstraintMinWidth = this.LJJLIIIJLJLI;
            a.matchConstraintMinHeight = this.LJJLIIIJLLLLLLLZ;
            a.matchConstraintPercentWidth = this.LJJLIIJ;
            a.matchConstraintPercentHeight = this.LJJLIL;
            a.orientation = this.LJJIIJ;
            a.guidePercent = this.LJI;
            a.guideBegin = this.LJ;
            a.guideEnd = this.LJFF;
            a.width = this.LIZIZ;
            a.height = this.LIZJ;
            a.setMarginStart(this.LJJIJIIJIL);
            a.setMarginEnd(this.LJJIJIIJI);
            a.validate();
        }
    }
}
