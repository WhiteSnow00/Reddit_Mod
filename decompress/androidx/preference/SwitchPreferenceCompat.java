// 
// Decompiled by Procyon v0.6.0
// 

package androidx.preference;

import java.io.Serializable;
import android.widget.CompoundButton;
import g5.f;
import android.widget.Checkable;
import android.widget.CompoundButton$OnCheckedChangeListener;
import androidx.appcompat.widget.SwitchCompat;
import android.view.accessibility.AccessibilityManager;
import android.view.View;
import android.content.res.TypedArray;
import p3.k;
import a4.u1;
import android.util.AttributeSet;
import android.content.Context;

public class SwitchPreferenceCompat extends TwoStatePreference
{
    public final a V;
    public CharSequence W;
    public CharSequence X;
    
    public SwitchPreferenceCompat() {
        throw null;
    }
    
    public SwitchPreferenceCompat(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public SwitchPreferenceCompat(final Context context, final AttributeSet set, final int n) {
        super(context, set, 2130969869);
        this.V = new a();
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, u1.v, 2130969869, 0);
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
            this.U(view.findViewById(2131431603));
            this.T(view.findViewById(16908304));
        }
    }
    
    public final void U(final View view) {
        final boolean b = view instanceof SwitchCompat;
        if (b) {
            ((SwitchCompat)view).setOnCheckedChangeListener((CompoundButton$OnCheckedChangeListener)null);
        }
        if (view instanceof Checkable) {
            ((Checkable)view).setChecked(super.S);
        }
        if (b) {
            final SwitchCompat switchCompat = (SwitchCompat)view;
            switchCompat.setTextOn(this.W);
            switchCompat.setTextOff(this.X);
            switchCompat.setOnCheckedChangeListener((CompoundButton$OnCheckedChangeListener)this.V);
        }
    }
    
    public final void o(final f f) {
        super.o(f);
        this.U(f.S0(2131431603));
        this.T(f.S0(16908304));
    }
    
    public final class a implements CompoundButton$OnCheckedChangeListener
    {
        public final void onCheckedChanged(final CompoundButton compoundButton, final boolean b) {
            if (!((Preference)SwitchPreferenceCompat.this).a((Serializable)b)) {
                compoundButton.setChecked(b ^ true);
                return;
            }
            SwitchPreferenceCompat.this.S(b);
        }
    }
}
