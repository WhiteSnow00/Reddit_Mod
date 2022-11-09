// 
// Decompiled by Procyon v0.6.0
// 

package v3;

import java.util.Locale;
import android.os.LocaleList;

public final class j implements i
{
    public final LocaleList a;
    
    public j(final Object o) {
        this.a = (LocaleList)o;
    }
    
    @Override
    public final String a() {
        return this.a.toLanguageTags();
    }
    
    @Override
    public final Object b() {
        return this.a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this.a.equals(((i)o).b());
    }
    
    @Override
    public final Locale get(final int n) {
        return this.a.get(n);
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }
    
    @Override
    public final int size() {
        return this.a.size();
    }
    
    @Override
    public final String toString() {
        return this.a.toString();
    }
}
