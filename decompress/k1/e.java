// 
// Decompiled by Procyon v0.6.0
// 

package k1;

import a4.u;
import a4.r;
import a4.s;
import android.view.autofill.AutofillValue;
import a4.t;
import ah2.f;
import android.view.autofill.AutofillId;
import android.view.ViewStructure;

public final class e
{
    public static final e a;
    
    static {
        a = new e();
    }
    
    public final AutofillId a(final ViewStructure viewStructure) {
        f.f((Object)viewStructure, "structure");
        return t.c(viewStructure);
    }
    
    public final boolean b(final AutofillValue autofillValue) {
        f.f((Object)autofillValue, "value");
        return autofillValue.isDate();
    }
    
    public final boolean c(final AutofillValue autofillValue) {
        f.f((Object)autofillValue, "value");
        return autofillValue.isList();
    }
    
    public final boolean d(final AutofillValue autofillValue) {
        f.f((Object)autofillValue, "value");
        return autofillValue.isText();
    }
    
    public final boolean e(final AutofillValue autofillValue) {
        f.f((Object)autofillValue, "value");
        return autofillValue.isToggle();
    }
    
    public final void f(final ViewStructure viewStructure, final String[] array) {
        f.f((Object)viewStructure, "structure");
        f.f((Object)array, "hints");
        s.h(viewStructure, array);
    }
    
    public final void g(final ViewStructure viewStructure, final AutofillId autofillId, final int n) {
        f.f((Object)viewStructure, "structure");
        f.f((Object)autofillId, "parent");
        r.f(viewStructure, autofillId, n);
    }
    
    public final void h(final ViewStructure viewStructure, final int n) {
        f.f((Object)viewStructure, "structure");
        u.i(viewStructure, n);
    }
    
    public final CharSequence i(final AutofillValue autofillValue) {
        f.f((Object)autofillValue, "value");
        final CharSequence textValue = autofillValue.getTextValue();
        f.e((Object)textValue, "value.textValue");
        return textValue;
    }
}
