// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.widget.CompoundButton;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import android.graphics.Rect;
import android.content.res.Resources;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.View;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.bytedance.covode.number.Covode;
import android.view.LayoutInflater;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.RadioButton;
import android.widget.ImageView;
import android.widget.AbsListView$SelectionBoundsAdjuster;
import android.widget.LinearLayout;

public class 12s extends LinearLayout implements AbsListView$SelectionBoundsAdjuster, a
{
    public 130 LIZ;
    public ImageView LIZIZ;
    public RadioButton LIZJ;
    public TextView LIZLLL;
    public CheckBox LJ;
    public TextView LJFF;
    public ImageView LJI;
    public ImageView LJII;
    public LinearLayout LJIIIIZZ;
    public Drawable LJIIIZ;
    public int LJIIJ;
    public Context LJIIJJI;
    public boolean LJIIL;
    public Drawable LJIILIIL;
    public boolean LJIILJJIL;
    public LayoutInflater LJIILL;
    public boolean LJIILLIIL;
    
    static {
        Covode.recordClassIndex(335);
    }
    
    public 12s(final Context context, final AttributeSet set) {
        this(context, set, (byte)0);
    }
    
    public 12s(final Context ljiijji, final AttributeSet set, final byte b) {
        super(ljiijji, set);
        final 043 liz = 043.LIZ(this.getContext(), set, new int[] { 16842926, 16843052, 16843053, 16843054, 16843055, 16843056, 16843057, 2130970750, 2130971125 }, 2130969919, 0);
        this.LJIIIZ = liz.LIZ(5);
        this.LJIIJ = liz.LJFF(1, -1);
        this.LJIIL = liz.LIZ(7, false);
        this.LJIIJJI = ljiijji;
        this.LJIILIIL = liz.LIZ(8);
        final TypedArray obtainStyledAttributes = ljiijji.getTheme().obtainStyledAttributes((AttributeSet)null, new int[] { 16843049 }, 2130969491, 0);
        this.LJIILJJIL = obtainStyledAttributes.hasValue(0);
        liz.LIZ.recycle();
        obtainStyledAttributes.recycle();
    }
    
    private void LIZ(final View view, final int n) {
        final LinearLayout ljiiiizz = this.LJIIIIZZ;
        if (ljiiiizz != null) {
            ljiiiizz.addView(view, n);
            return;
        }
        this.addView(view, n);
    }
    
    private void LIZIZ() {
        this.LIZ((View)(this.LIZJ = (RadioButton)0II.LIZ(this.getInflater(), 2131558456, (ViewGroup)this, false)), -1);
    }
    
    private void LIZJ() {
        this.LIZ((View)(this.LJ = (CheckBox)0II.LIZ(this.getInflater(), 2131558453, (ViewGroup)this, false)), -1);
    }
    
    private LayoutInflater getInflater() {
        if (this.LJIILL == null) {
            this.LJIILL = LayoutInflater.from(this.getContext());
        }
        return this.LJIILL;
    }
    
    private void setSubMenuArrowVisible(final boolean b) {
        final ImageView lji = this.LJI;
        if (lji != null) {
            int visibility;
            if (b) {
                visibility = 0;
            }
            else {
                visibility = 8;
            }
            lji.setVisibility(visibility);
        }
    }
    
    public final void LIZ(final 130 liz) {
        this.LIZ = liz;
        final boolean visible = liz.isVisible();
        final int n = 0;
        int visibility;
        if (visible) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        this.setVisibility(visibility);
        this.setTitle(liz.LIZ(this));
        this.setCheckable(liz.isCheckable());
        final boolean lizlll = liz.LIZLLL();
        liz.LIZJ();
        int visibility2;
        if (lizlll && this.LIZ.LIZLLL()) {
            final TextView ljff = this.LJFF;
            final 130 liz2 = this.LIZ;
            final char lizj = liz2.LIZJ();
            String string;
            if (lizj == '\0') {
                string = "";
            }
            else {
                final Resources resources = liz2.LIZLLL.LIZ.getResources();
                final StringBuilder sb = new StringBuilder();
                if (ViewConfiguration.get(liz2.LIZLLL.LIZ).hasPermanentMenuKey()) {
                    sb.append(resources.getString(2131821201));
                }
                int n2;
                if (liz2.LIZLLL.LIZJ()) {
                    n2 = liz2.LIZJ;
                }
                else {
                    n2 = liz2.LIZIZ;
                }
                130.LIZ(sb, n2, 65536, resources.getString(2131821197));
                130.LIZ(sb, n2, 4096, resources.getString(2131821193));
                130.LIZ(sb, n2, 2, resources.getString(2131821192));
                130.LIZ(sb, n2, 1, resources.getString(2131821198));
                130.LIZ(sb, n2, 4, resources.getString(2131821200));
                130.LIZ(sb, n2, 8, resources.getString(2131821196));
                if (lizj != '\b') {
                    if (lizj != '\n') {
                        if (lizj != ' ') {
                            sb.append(lizj);
                        }
                        else {
                            sb.append(resources.getString(2131821199));
                        }
                    }
                    else {
                        sb.append(resources.getString(2131821195));
                    }
                }
                else {
                    sb.append(resources.getString(2131821194));
                }
                string = sb.toString();
            }
            ljff.setText((CharSequence)string);
            visibility2 = n;
        }
        else {
            visibility2 = 8;
        }
        if (this.LJFF.getVisibility() != visibility2) {
            this.LJFF.setVisibility(visibility2);
        }
        this.setIcon(liz.getIcon());
        this.setEnabled(liz.isEnabled());
        this.setSubMenuArrowVisible(liz.hasSubMenu());
        this.setContentDescription(liz.getContentDescription());
    }
    
    public final boolean LIZ() {
        return false;
    }
    
    public void adjustListItemSelectionBounds(final Rect rect) {
        final ImageView ljii = this.LJII;
        if (ljii != null && ljii.getVisibility() == 0) {
            final LinearLayout$LayoutParams linearLayout$LayoutParams = (LinearLayout$LayoutParams)this.LJII.getLayoutParams();
            rect.top += this.LJII.getHeight() + linearLayout$LayoutParams.topMargin + linearLayout$LayoutParams.bottomMargin;
        }
    }
    
    public 130 getItemData() {
        return this.LIZ;
    }
    
    public void onFinishInflate() {
        super.onFinishInflate();
        ((View)this).setBackground(this.LJIIIZ);
        final TextView lizlll = (TextView)this.findViewById(2131372326);
        this.LIZLLL = lizlll;
        final int ljiij = this.LJIIJ;
        if (ljiij != -1) {
            lizlll.setTextAppearance(this.LJIIJJI, ljiij);
        }
        this.LJFF = (TextView)this.findViewById(2131371306);
        final ImageView lji = (ImageView)this.findViewById(2131371869);
        if ((this.LJI = lji) != null) {
            lji.setImageDrawable(this.LJIILIIL);
        }
        this.LJII = (ImageView)this.findViewById(2131365846);
        this.LJIIIIZZ = (LinearLayout)this.findViewById(2131363920);
    }
    
    public void onMeasure(final int n, final int n2) {
        if (this.LIZIZ != null && this.LJIIL) {
            final ViewGroup$LayoutParams layoutParams = this.getLayoutParams();
            final LinearLayout$LayoutParams linearLayout$LayoutParams = (LinearLayout$LayoutParams)this.LIZIZ.getLayoutParams();
            if (layoutParams.height > 0 && linearLayout$LayoutParams.width <= 0) {
                linearLayout$LayoutParams.width = layoutParams.height;
            }
        }
        super.onMeasure(n, n2);
    }
    
    public void setCheckable(final boolean b) {
        if (!b && this.LIZJ == null && this.LJ == null) {
            return;
        }
        Object o;
        Object o2;
        if (this.LIZ.LJ()) {
            if (this.LIZJ == null) {
                this.LIZIZ();
            }
            o = this.LIZJ;
            o2 = this.LJ;
        }
        else {
            if (this.LJ == null) {
                this.LIZJ();
            }
            o = this.LJ;
            o2 = this.LIZJ;
        }
        if (b) {
            ((CompoundButton)o).setChecked(this.LIZ.isChecked());
            if (((CompoundButton)o).getVisibility() != 0) {
                ((CompoundButton)o).setVisibility(0);
            }
            if (o2 != null && ((CompoundButton)o2).getVisibility() != 8) {
                ((CompoundButton)o2).setVisibility(8);
            }
        }
        else {
            final CheckBox lj = this.LJ;
            if (lj != null) {
                lj.setVisibility(8);
            }
            final RadioButton lizj = this.LIZJ;
            if (lizj != null) {
                lizj.setVisibility(8);
            }
        }
    }
    
    public void setChecked(final boolean checked) {
        Object o;
        if (this.LIZ.LJ()) {
            if (this.LIZJ == null) {
                this.LIZIZ();
            }
            o = this.LIZJ;
        }
        else {
            if (this.LJ == null) {
                this.LIZJ();
            }
            o = this.LJ;
        }
        ((CompoundButton)o).setChecked(checked);
    }
    
    public void setForceShowIcon(final boolean b) {
        this.LJIILLIIL = b;
        this.LJIIL = b;
    }
    
    public void setGroupDividerEnabled(final boolean b) {
        final ImageView ljii = this.LJII;
        if (ljii != null) {
            int visibility;
            if (!this.LJIILJJIL && b) {
                visibility = 0;
            }
            else {
                visibility = 8;
            }
            ljii.setVisibility(visibility);
        }
    }
    
    public void setIcon(Drawable imageDrawable) {
        boolean b;
        if (this.LIZ.LIZLLL.LJIIJ || this.LJIILLIIL) {
            b = true;
        }
        else {
            b = false;
            if (!this.LJIIL) {
                return;
            }
        }
        if (this.LIZIZ == null) {
            if (imageDrawable == null && !this.LJIIL) {
                return;
            }
            this.LIZ((View)(this.LIZIZ = (ImageView)0II.LIZ(this.getInflater(), 2131558454, (ViewGroup)this, false)), 0);
        }
        if (imageDrawable != null || this.LJIIL) {
            final ImageView liziz = this.LIZIZ;
            if (!b) {
                imageDrawable = null;
            }
            liziz.setImageDrawable(imageDrawable);
            if (this.LIZIZ.getVisibility() != 0) {
                this.LIZIZ.setVisibility(0);
            }
        }
        else {
            this.LIZIZ.setVisibility(8);
        }
    }
    
    public void setTitle(final CharSequence text) {
        if (text != null) {
            this.LIZLLL.setText(text);
            if (this.LIZLLL.getVisibility() != 0) {
                this.LIZLLL.setVisibility(0);
            }
        }
        else if (this.LIZLLL.getVisibility() != 8) {
            this.LIZLLL.setVisibility(8);
        }
    }
}
