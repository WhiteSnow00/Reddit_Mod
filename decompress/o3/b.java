// 
// Decompiled by Procyon v0.6.0
// 

package o3;

import android.os.BaseBundle;
import android.content.LocusId;
import mj2.c0;
import a4.f2;
import a4.x1;
import androidx.compose.ui.platform.r;
import java.util.Arrays;
import a4.e2;
import a4.d2;
import a4.c2;
import android.os.Build$VERSION;
import android.text.TextUtils;
import android.content.pm.ShortcutInfo$Builder;
import java.util.Iterator;
import android.content.pm.ShortcutInfo;
import java.util.ArrayList;
import java.util.List;
import android.app.Activity;
import android.os.PersistableBundle;
import java.util.Set;
import androidx.core.app.Person;
import androidx.core.graphics.drawable.IconCompat;
import android.content.ComponentName;
import android.content.Intent;
import android.content.Context;

public final class b
{
    public Context a;
    public String b;
    public Intent[] c;
    public ComponentName d;
    public CharSequence e;
    public CharSequence f;
    public CharSequence g;
    public IconCompat h;
    public Person[] i;
    public Set<String> j;
    public n3.b k;
    public int l;
    public PersistableBundle m;
    
    public static ArrayList a(final Activity activity, final List list) {
        final ArrayList list2 = new ArrayList(list.size());
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            list2.add(new a(activity, (ShortcutInfo)iterator.next()).a());
        }
        return list2;
    }
    
    public final ShortcutInfo b() {
        final ShortcutInfo$Builder setIntents = new ShortcutInfo$Builder(this.a, this.b).setShortLabel(this.e).setIntents(this.c);
        final IconCompat h = this.h;
        if (h != null) {
            setIntents.setIcon(IconCompat.a.g(h, this.a));
        }
        if (!TextUtils.isEmpty(this.f)) {
            setIntents.setLongLabel(this.f);
        }
        if (!TextUtils.isEmpty(this.g)) {
            setIntents.setDisabledMessage(this.g);
        }
        final ComponentName d = this.d;
        if (d != null) {
            setIntents.setActivity(d);
        }
        final Set<String> j = this.j;
        if (j != null) {
            setIntents.setCategories(j);
        }
        setIntents.setRank(this.l);
        final PersistableBundle m = this.m;
        if (m != null) {
            setIntents.setExtras(m);
        }
        final int sdk_INT = Build$VERSION.SDK_INT;
        int i = 0;
        if (sdk_INT >= 29) {
            final Person[] k = this.i;
            if (k != null && k.length > 0) {
                final int length = k.length;
                final android.app.Person[] array = new android.app.Person[length];
                while (i < length) {
                    array[i] = this.i[i].toAndroidPerson();
                    ++i;
                }
                c2.f(setIntents, array);
            }
            final n3.b l = this.k;
            if (l != null) {
                d2.d(setIntents, l.b);
            }
            e2.f(setIntents);
        }
        else {
            if (this.m == null) {
                this.m = new PersistableBundle();
            }
            final Person[] i2 = this.i;
            if (i2 != null && i2.length > 0) {
                ((BaseBundle)this.m).putInt("extraPersonCount", i2.length);
                int n2;
                for (int n = 0; n < this.i.length; n = n2) {
                    final PersistableBundle m2 = this.m;
                    final StringBuilder k2 = a.k("extraPerson_");
                    n2 = n + 1;
                    k2.append(n2);
                    m2.putPersistableBundle(k2.toString(), this.i[n].toPersistableBundle());
                }
            }
            final n3.b k3 = this.k;
            if (k3 != null) {
                ((BaseBundle)this.m).putString("extraLocusId", k3.a);
            }
            ((BaseBundle)this.m).putBoolean("extraLongLived", false);
            setIntents.setExtras(this.m);
        }
        return setIntents.build();
    }
    
    public static final class a
    {
        public final b a;
        
        public a(final Activity a, final ShortcutInfo shortcutInfo) {
            final b a2 = new b();
            this.a = a2;
            a2.a = (Context)a;
            a2.b = shortcutInfo.getId();
            shortcutInfo.getPackage();
            final Intent[] intents = shortcutInfo.getIntents();
            a2.c = Arrays.copyOf(intents, intents.length);
            a2.d = shortcutInfo.getActivity();
            a2.e = shortcutInfo.getShortLabel();
            a2.f = shortcutInfo.getLongLabel();
            a2.g = shortcutInfo.getDisabledMessage();
            if (Build$VERSION.SDK_INT >= 28) {
                r.d(shortcutInfo);
            }
            else {
                shortcutInfo.isEnabled();
            }
            a2.j = shortcutInfo.getCategories();
            final PersistableBundle extras = shortcutInfo.getExtras();
            final n3.b b = null;
            Person[] i;
            if (extras != null && ((BaseBundle)extras).containsKey("extraPersonCount")) {
                final int int1 = ((BaseBundle)extras).getInt("extraPersonCount");
                final Person[] array = new Person[int1];
                int n = 0;
                while (true) {
                    i = array;
                    if (n >= int1) {
                        break;
                    }
                    final StringBuilder k = a.k("extraPerson_");
                    final int n2 = n + 1;
                    k.append(n2);
                    array[n] = Person.fromPersistableBundle(extras.getPersistableBundle(k.toString()));
                    n = n2;
                }
            }
            else {
                i = null;
            }
            a2.i = i;
            final b a3 = this.a;
            shortcutInfo.getUserHandle();
            a3.getClass();
            final b a4 = this.a;
            shortcutInfo.getLastChangedTimestamp();
            a4.getClass();
            final int sdk_INT = Build$VERSION.SDK_INT;
            if (sdk_INT >= 30) {
                final b a5 = this.a;
                x1.c(shortcutInfo);
                a5.getClass();
            }
            final b a6 = this.a;
            shortcutInfo.isDynamic();
            a6.getClass();
            final b a7 = this.a;
            shortcutInfo.isPinned();
            a7.getClass();
            final b a8 = this.a;
            shortcutInfo.isDeclaredInManifest();
            a8.getClass();
            final b a9 = this.a;
            shortcutInfo.isImmutable();
            a9.getClass();
            final b a10 = this.a;
            shortcutInfo.isEnabled();
            a10.getClass();
            final b a11 = this.a;
            shortcutInfo.hasKeyFieldsOnly();
            a11.getClass();
            final b a12 = this.a;
            n3.b j;
            if (sdk_INT >= 29) {
                if (f2.a(shortcutInfo) == null) {
                    j = b;
                }
                else {
                    final LocusId a13 = f2.a(shortcutInfo);
                    c0.s((Object)a13, "locusId cannot be null");
                    final String b2 = n3.b.a.b(a13);
                    if (TextUtils.isEmpty((CharSequence)b2)) {
                        throw new IllegalArgumentException("id cannot be empty");
                    }
                    j = new n3.b(b2);
                }
            }
            else {
                final PersistableBundle extras2 = shortcutInfo.getExtras();
                if (extras2 == null) {
                    j = b;
                }
                else {
                    final String string = ((BaseBundle)extras2).getString("extraLocusId");
                    if (string == null) {
                        j = b;
                    }
                    else {
                        j = new n3.b(string);
                    }
                }
            }
            a12.k = j;
            this.a.l = shortcutInfo.getRank();
            this.a.m = shortcutInfo.getExtras();
        }
        
        public a(final Activity a, final String b) {
            final b a2 = new b();
            this.a = a2;
            a2.a = (Context)a;
            a2.b = b;
        }
        
        public final b a() {
            if (TextUtils.isEmpty(this.a.e)) {
                throw new IllegalArgumentException("Shortcut must have a non-empty label");
            }
            final b a = this.a;
            final Intent[] c = a.c;
            if (c != null && c.length != 0) {
                return a;
            }
            throw new IllegalArgumentException("Shortcut must have an intent");
        }
    }
}
