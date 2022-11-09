// 
// Decompiled by Procyon v0.6.0
// 

package k3;

import android.content.SharedPreferences$Editor;
import xe.j;
import ii.h;
import com.google.firebase.iid.a$a;
import xe.g;
import com.google.firebase.iid.FirebaseInstanceId;
import java.util.HashSet;
import java.util.ArrayList;
import j0.i;
import java.io.Serializable;
import xe.f;

public final class a implements f
{
    public final Object f = f;
    public final Object g = g;
    public final Serializable h = h;
    public final Serializable i = i;
    
    public final void a(final Object o, final ArrayList list, final HashSet set) {
        if (list.contains(o)) {
            return;
        }
        if (!set.contains(o)) {
            set.add(o);
            final ArrayList list2 = (ArrayList)((i)this.g).getOrDefault(o, (Object)null);
            if (list2 != null) {
                for (int i = 0; i < list2.size(); ++i) {
                    this.a(list2.get(i), list, set);
                }
            }
            set.remove(o);
            list.add(o);
            return;
        }
        throw new RuntimeException("This graph contains cyclic dependencies");
    }
    
    @Override
    public final g then(Object j) {
        final FirebaseInstanceId firebaseInstanceId = (FirebaseInstanceId)this.f;
        final String s = (String)this.g;
        final String s2 = (String)this.h;
        final String s3 = (String)j;
        j = FirebaseInstanceId.j;
        final String g = firebaseInstanceId.g();
        Object o = firebaseInstanceId.c;
        synchronized (o) {
            if (((ii.i)o).b == null) {
                ((ii.i)o).c();
            }
            final String b = ((ii.i)o).b;
            monitorexit(o);
            synchronized (j) {
                o = a$a.a(System.currentTimeMillis(), s3, b);
                if (o == null) {
                    monitorexit(j);
                }
                else {
                    final SharedPreferences$Editor edit = ((com.google.firebase.iid.a)j).a.edit();
                    edit.putString(com.google.firebase.iid.a.b(g, s, s2), (String)o);
                    edit.commit();
                    monitorexit(j);
                }
                return j.e(new h(s3));
            }
        }
    }
}
