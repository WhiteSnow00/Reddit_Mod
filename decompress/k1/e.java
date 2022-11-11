// 
// Decompiled by Procyon v0.6.0
// 

package k1;

import a4.w;
import a4.t;
import a4.u;
import android.view.autofill.AutofillValue;
import a4.v;
import android.view.autofill.AutofillId;
import android.view.ViewStructure;

public final class e
{
    public static final e a;
    
    static {
        a = new e();
    }
    
    public final AutofillId a(final ViewStructure viewStructure) {
        sg2.e.f((Object)viewStructure, "structure");
        return v.e(viewStructure);
    }
    
    public final boolean b(final AutofillValue autofillValue) {
        sg2.e.f((Object)autofillValue, "value");
        return autofillValue.isDate();
    }
    
    public final boolean c(final AutofillValue autofillValue) {
        sg2.e.f((Object)autofillValue, "value");
        return autofillValue.isList();
    }
    
    public final boolean d(final AutofillValue autofillValue) {
        sg2.e.f((Object)autofillValue, "value");
        return autofillValue.isText();
    }
    
    public final boolean e(final AutofillValue autofillValue) {
        sg2.e.f((Object)autofillValue, "value");
        return autofillValue.isToggle();
    }
    
    public final void f(final ViewStructure viewStructure, final String[] array) {
        sg2.e.f((Object)viewStructure, "structure");
        sg2.e.f((Object)array, "hints");
        u.g(viewStructure, array);
    }
    
    public final void g(final ViewStructure viewStructure, final AutofillId autofillId, final int n) {
        sg2.e.f((Object)viewStructure, "structure");
        sg2.e.f((Object)autofillId, "parent");
        t.i(viewStructure, autofillId, n);
    }
    
    public final void h(final ViewStructure viewStructure, final int n) {
        sg2.e.f((Object)viewStructure, "structure");
        w.i(viewStructure, n);
    }
    
    public final CharSequence i(final AutofillValue autofillValue) {
        sg2.e.f((Object)autofillValue, "value");
        final CharSequence textValue = autofillValue.getTextValue();
        sg2.e.e((Object)textValue, "value.textValue");
        return textValue;
    }
}
