// 
// Decompiled by Procyon v0.6.0
// 

package androidx.preference;

import android.view.AbsSavedState;
import android.os.Parcelable;
import android.text.TextUtils;
import android.content.res.TypedArray;
import a4.u1;
import p3.k;
import android.util.AttributeSet;
import android.content.Context;

public class ListPreference extends DialogPreference
{
    public CharSequence[] W;
    public CharSequence[] X;
    public String Y;
    public String Z;
    public boolean a0;
    
    public ListPreference(final Context context) {
        this(context, null);
    }
    
    public ListPreference(final Context context, final AttributeSet set) {
        this(context, set, k.a(context, 2130968901, 16842897));
    }
    
    public ListPreference(final Context context, final AttributeSet set, final int n) {
        this(context, set, n, 0);
    }
    
    public ListPreference(final Context context, final AttributeSet set, final int n, final int n2) {
        super(context, set, n, n2);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, u1.n, n, n2);
        CharSequence[] w;
        if ((w = obtainStyledAttributes.getTextArray(2)) == null) {
            w = obtainStyledAttributes.getTextArray(0);
        }
        this.W = w;
        CharSequence[] x;
        if ((x = obtainStyledAttributes.getTextArray(3)) == null) {
            x = obtainStyledAttributes.getTextArray(1);
        }
        this.X = x;
        obtainStyledAttributes.recycle();
        final TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(set, u1.p, n, n2);
        this.Z = k.f(obtainStyledAttributes2, 32, 7);
        obtainStyledAttributes2.recycle();
    }
    
    public final void A(final Object o) {
        this.U(((Preference)this).f((String)o));
    }
    
    public final void J(final CharSequence charSequence) {
        super.J(charSequence);
        if (charSequence == null && this.Z != null) {
            this.Z = null;
        }
        else if (charSequence != null && !charSequence.equals(this.Z)) {
            this.Z = ((String)charSequence).toString();
        }
    }
    
    public final int S(final String s) {
        if (s != null) {
            final CharSequence[] x = this.X;
            if (x != null) {
                for (int i = x.length - 1; i >= 0; --i) {
                    if (this.X[i].equals(s)) {
                        return i;
                    }
                }
            }
        }
        return -1;
    }
    
    public void T(final CharSequence[] w) {
        this.W = w;
    }
    
    public final void U(final String y) {
        final boolean b = TextUtils.equals((CharSequence)this.Y, (CharSequence)y) ^ true;
        if (b || !this.a0) {
            this.Y = y;
            this.a0 = true;
            ((Preference)this).E(y);
            if (b) {
                ((Preference)this).k();
            }
        }
    }
    
    public void V(final int n) {
        final CharSequence[] x = this.X;
        if (x != null) {
            this.U(x[n].toString());
        }
    }
    
    public final CharSequence i() {
        final int s = this.S(this.Y);
        CharSequence charSequence = null;
        Label_0031: {
            if (s >= 0) {
                final CharSequence[] w = this.W;
                if (w != null) {
                    charSequence = w[s];
                    break Label_0031;
                }
            }
            charSequence = null;
        }
        final String z = this.Z;
        if (z == null) {
            return ((Preference)this).o;
        }
        CharSequence charSequence2;
        if ((charSequence2 = charSequence) == null) {
            charSequence2 = "";
        }
        return String.format(z, charSequence2);
    }
    
    public final Object v(final TypedArray typedArray, final int n) {
        return typedArray.getString(n);
    }
    
    public final void x(final Parcelable parcelable) {
        if (!parcelable.getClass().equals(ListPreference.ListPreference$a.class)) {
            super.x(parcelable);
            return;
        }
        final ListPreference.ListPreference$a listPreference$a = (ListPreference.ListPreference$a)parcelable;
        super.x(((AbsSavedState)listPreference$a).getSuperState());
        this.U(listPreference$a.f);
    }
    
    public final Parcelable y() {
        ((Preference)this).O = true;
        final AbsSavedState empty_STATE = AbsSavedState.EMPTY_STATE;
        if (((Preference)this).x) {
            return (Parcelable)empty_STATE;
        }
        final ListPreference.ListPreference$a listPreference$a = new ListPreference.ListPreference$a(empty_STATE);
        listPreference$a.f = this.Y;
        return (Parcelable)listPreference$a;
    }
}
