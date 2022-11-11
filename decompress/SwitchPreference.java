// 
// Decompiled by Procyon v0.6.0
// 

package androidx.preference;

import java.io.Serializable;
import android.widget.CompoundButton;
import g5.f;
import android.widget.Checkable;
import android.widget.CompoundButton$OnCheckedChangeListener;
import android.widget.Switch;
import android.view.accessibility.AccessibilityManager;
import android.view.View;
import android.content.res.TypedArray;
import a4.u1;
import p3.k;
import android.util.AttributeSet;
import android.content.Context;

public class SwitchPreference extends TwoStatePreference
{
    public final a V;
    public CharSequence W;
    public CharSequence X;
    
    public SwitchPreference() {
        throw null;
    }
    
    public SwitchPreference(final Context context, final AttributeSet set) {
        this(context, set, k.a(context, 2130969870, 16843629));
    }
    
    public SwitchPreference(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.V = new a();
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, u1.u, n, 0);
        super.Q = k.f(obtainStyledAttributes, 7, 0);
        if (super.S) {
            ((Preference)this).k();
        }
        super.R = k.f(obtainStyledAttributes, 6, 1);
        if (!super.S) {
            ((Preference)this).k();
        }
        this.W = k.f(obtainStyledAttributes, 9, 3);
        ((Preference)this).k();
        this.X = k.f(obtainStyledAttributes, 8, 4);
        ((Preference)this).k();
        super.U = obtainStyledAttributes.getBoolean(5, obtainStyledAttributes.getBoolean(2, false));
        obtainStyledAttributes.recycle();
    }
    
    public final void D(final View view) {
        super.D(view);
        if (((AccessibilityManager)((Preference)this).f.getSystemService("accessibility")).isEnabled()) {
            this.U(view.findViewById(16908352));
            this.T(view.findViewById(16908304));
        }
    }
    
    public final void U(final View view) {
        final boolean b = view instanceof Switch;
        if (b) {
            ((CompoundButton)view).setOnCheckedChangeListener((CompoundButton$OnCheckedChangeListener)null);
        }
        if (view instanceof Checkable) {
            ((Checkable)view).setChecked(super.S);
        }
        if (b) {
            final Switch switch1 = (Switch)view;
            switch1.setTextOn(this.W);
            switch1.setTextOff(this.X);
            ((CompoundButton)switch1).setOnCheckedChangeListener((CompoundButton$OnCheckedChangeListener)this.V);
        }
    }
    
    public final void o(final f f) {
        super.o(f);
        this.U(f.S0(16908352));
        this.T(f.S0(16908304));
    }
    
    public final class a implements CompoundButton$OnCheckedChangeListener
    {
        public final void onCheckedChanged(final CompoundButton compoundButton, final boolean b) {
            if (!((Preference)SwitchPreference.this).a((Serializable)b)) {
                compoundButton.setChecked(b ^ true);
                return;
            }
            SwitchPreference.this.S(b);
        }
    }
}
