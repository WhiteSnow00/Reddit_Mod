// 
// Decompiled by Procyon v0.6.0
// 

package androidx.preference;

import java.util.Iterator;
import java.util.ArrayList;
import android.content.Context;

public final class b
{
    public final f a;
    public final Context b;
    public boolean c;
    
    public b(final PreferenceScreen preferenceScreen, final f a) {
        this.c = false;
        this.a = a;
        this.b = ((Preference)preferenceScreen).f;
    }
    
    public final ArrayList a(final PreferenceGroup preferenceGroup) {
        int i = 0;
        this.c = false;
        final boolean b = preferenceGroup.U != Integer.MAX_VALUE;
        final ArrayList<Preference> list = new ArrayList<Preference>();
        final ArrayList<Preference> list2 = new ArrayList<Preference>();
        final int u = preferenceGroup.U();
        int n = 0;
        while (i < u) {
            final Preference t = preferenceGroup.T(i);
            if (t.C) {
                if (b && n >= preferenceGroup.U) {
                    list2.add(t);
                }
                else {
                    list.add(t);
                }
                if (!(t instanceof PreferenceGroup)) {
                    ++n;
                }
                else {
                    final PreferenceGroup preferenceGroup2 = (PreferenceGroup)t;
                    if (preferenceGroup2 instanceof PreferenceScreen ^ true) {
                        final ArrayList a = this.a(preferenceGroup2);
                        if (b && this.c) {
                            throw new IllegalArgumentException("Nested expand buttons are not supported!");
                        }
                        final Iterator iterator = a.iterator();
                        int n2 = n;
                        while (true) {
                            n = n2;
                            if (!iterator.hasNext()) {
                                break;
                            }
                            final Preference preference = (Preference)iterator.next();
                            if (b && n2 >= preferenceGroup.U) {
                                list2.add(preference);
                            }
                            else {
                                list.add(preference);
                            }
                            ++n2;
                        }
                    }
                }
            }
            ++i;
        }
        if (b && n > preferenceGroup.U) {
            final b.b$a b$a = new b.b$a(this.b, (ArrayList)list2, ((Preference)preferenceGroup).h);
            ((Preference)b$a).k = (Preference$e)new a(this, preferenceGroup);
            list.add((Preference)b$a);
        }
        this.c |= b;
        return list;
    }
}
