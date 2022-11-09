// 
// Decompiled by Procyon v0.6.0
// 

package androidx.preference;

import android.view.AbsSavedState;
import android.os.Parcelable;
import android.content.res.TypedArray;
import android.text.TextUtils;
import p3.k;
import android.util.AttributeSet;
import android.content.Context;

public class EditTextPreference extends DialogPreference
{
    public String W;
    
    public EditTextPreference() {
        throw null;
    }
    
    public EditTextPreference(final Context context, final AttributeSet set) {
        super(context, set, k.a(context, 2130968939, 16842898), 0);
    }
    
    public final void A(final Object o) {
        this.S(((Preference)this).f((String)o));
    }
    
    public final boolean P() {
        return TextUtils.isEmpty((CharSequence)this.W) || super.P();
    }
    
    public final void S(final String w) {
        final boolean p = this.P();
        ((Preference)this).E(this.W = w);
        final boolean p2 = this.P();
        if (p2 != p) {
            ((Preference)this).l(p2);
        }
    }
    
    public final Object v(final TypedArray typedArray, final int n) {
        return typedArray.getString(n);
    }
    
    public final void x(final Parcelable parcelable) {
        if (!parcelable.getClass().equals(EditTextPreference.EditTextPreference$a.class)) {
            super.x(parcelable);
            return;
        }
        final EditTextPreference.EditTextPreference$a editTextPreference$a = (EditTextPreference.EditTextPreference$a)parcelable;
        super.x(((AbsSavedState)editTextPreference$a).getSuperState());
        this.S(editTextPreference$a.f);
    }
    
    public final Parcelable y() {
        ((Preference)this).O = true;
        final AbsSavedState empty_STATE = AbsSavedState.EMPTY_STATE;
        if (((Preference)this).x) {
            return (Parcelable)empty_STATE;
        }
        final EditTextPreference.EditTextPreference$a editTextPreference$a = new EditTextPreference.EditTextPreference$a(empty_STATE);
        editTextPreference$a.f = this.W;
        return (Parcelable)editTextPreference$a;
    }
}
