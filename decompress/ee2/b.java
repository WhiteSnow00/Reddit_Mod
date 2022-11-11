// 
// Decompiled by Procyon v0.6.0
// 

package ee2;

import android.app.Application;
import ff2.y;
import android.content.Context;
import android.content.Intent;
import com.vanniktech.rxpermission.ShadowActivity;
import io.reactivex.subjects.PublishSubject;
import com.vanniktech.rxpermission.a;
import com.vanniktech.rxpermission.Permission$State;
import java.util.ArrayList;
import com.vanniktech.rxpermission.Permission;
import ff2.t;
import kf2.o;

public final class b implements o<Object, t<Permission>>
{
    public final /* synthetic */ String[] f;
    public final /* synthetic */ c g;
    
    public b(final c g, final String[] f) {
        this.g = g;
        this.f = f;
    }
    
    public final Object apply(final Object o) throws Exception {
        final c g = this.g;
        final String[] f = this.f;
        g.getClass();
        final ArrayList list = new ArrayList<t>(f.length);
        final ArrayList list2 = new ArrayList();
        for (final String s : f) {
            if (((Context)g.a).checkSelfPermission(s) == 0) {
                list.add(t.just((Object)new a(s, Permission$State.GRANTED)));
            }
            else if (((Context)g.a).getPackageManager().isPermissionRevokedByPolicy(s, ((Context)g.a).getPackageName())) {
                list.add(t.just((Object)new a(s, Permission$State.REVOKED_BY_POLICY)));
            }
            else {
                PublishSubject<Object> create;
                if ((create = g.b.get(s)) == null) {
                    list2.add(s);
                    create = PublishSubject.create();
                    g.b.put(s, create);
                }
                list.add((t)create);
            }
        }
        if (!list2.isEmpty()) {
            final String[] array = list2.toArray(new String[0]);
            final Application a = g.a;
            final int g2 = ShadowActivity.g;
            ((Context)a).startActivity(new Intent((Context)a, (Class)ShadowActivity.class).putExtra("permissions", array).addFlags(268435456));
        }
        return t.concat((y)t.fromIterable((Iterable)list));
    }
}
