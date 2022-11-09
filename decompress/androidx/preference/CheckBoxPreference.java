// 
// Decompiled by Procyon v0.6.0
// 

package androidx.preference;

import g5.f;
import android.widget.Checkable;
import android.widget.CompoundButton$OnCheckedChangeListener;
import android.widget.CompoundButton;
import android.view.accessibility.AccessibilityManager;
import android.view.View;
import android.content.res.TypedArray;
import a4.u1;
import p3.k;
import android.util.AttributeSet;
import android.content.Context;

public class CheckBoxPreference extends TwoStatePreference
{
    public final CheckBoxPreference.CheckBoxPreference$a V;
    
    public CheckBoxPreference() {
        throw null;
    }
    
    public CheckBoxPreference(final Context context, final AttributeSet set) {
        this(context, set, k.a(context, 2130968756, 16842895));
    }
    
    public CheckBoxPreference(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.V = new CheckBoxPreference.CheckBoxPreference$a(this);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, u1.l, n, 0);
        super.Q = k.f(obtainStyledAttributes, 5, 0);
        if (super.S) {
            ((Preference)this).k();
        }
        super.R = k.f(obtainStyledAttributes, 4, 1);
        if (!super.S) {
            ((Preference)this).k();
        }
        super.U = obtainStyledAttributes.getBoolean(3, obtainStyledAttributes.getBoolean(2, false));
        obtainStyledAttributes.recycle();
    }
    
    public final void D(final View view) {
        super.D(view);
        if (((AccessibilityManager)((Preference)this).f.getSystemService("accessibility")).isEnabled()) {
            this.U(view.findViewById(16908289));
            this.T(view.findViewById(16908304));
        }
    }
    
    public final void U(final View view) {
        final boolean b = view instanceof CompoundButton;
        if (b) {
            ((CompoundButton)view).setOnCheckedChangeListener((CompoundButton$OnCheckedChangeListener)null);
        }
        if (view instanceof Checkable) {
            ((Checkable)view).setChecked(super.S);
        }
        if (b) {
            ((CompoundButton)view).setOnCheckedChangeListener((CompoundButton$OnCheckedChangeListener)this.V);
        }
    }
    
    public final void o(final f f) {
        super.o(f);
        this.U(f.S0(16908289));
        this.T(f.S0(16908304));
    }
}
