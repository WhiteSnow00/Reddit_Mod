// 
// Decompiled by Procyon v0.6.0
// 

package eg;

import android.os.BaseBundle;
import java.util.Iterator;
import com.google.android.play.core.assetpacks.AssetPackState;
import java.util.HashMap;
import android.os.Bundle;
import java.util.ArrayList;
import qg.k;
import com.google.android.play.core.assetpacks.a;
import java.util.List;

public final class m extends j<List<String>>
{
    public final /* synthetic */ a c;
    
    public m(final a c, final k<List<String>> k) {
        this.c = c;
        super(k);
    }
    
    @Override
    public final void n0(final ArrayList list) {
        super.n0(list);
        final a c = this.c;
        final ArrayList list2 = new ArrayList();
        for (final Bundle bundle : list) {
            final k0 b = c.b;
            final e1 c2 = c.c;
            final ArrayList list3 = new ArrayList();
            final y0 f = y0.f;
            final ArrayList stringArrayList = bundle.getStringArrayList("pack_names");
            final HashMap<String, x> hashMap = new HashMap<String, x>();
            final int size = stringArrayList.size();
            final int n = 0;
            for (int i = 0; i < size; ++i) {
                final String s = (String)stringArrayList.get(i);
                hashMap.put(s, AssetPackState.i(bundle, s, b, c2, (u)f));
            }
            for (final String s2 : list3) {
                hashMap.put(s2, AssetPackState.h(s2, 4, 0, 0L, 0L, 0.0, 1, "", ""));
            }
            final AssetPackState assetPackState = new y(((BaseBundle)bundle).getLong("total_bytes_to_download"), hashMap).b.values().iterator().next();
            if (assetPackState == null) {
                com.google.android.play.core.assetpacks.a.g.h("onGetSessionStates: Bundle contained no pack.", new Object[0]);
            }
            final int d = assetPackState.d();
            int n2 = 0;
            Label_0308: {
                if (d != 1 && d != 7) {
                    if (d != 2) {
                        if (d != 3) {
                            n2 = n;
                            break Label_0308;
                        }
                    }
                }
                n2 = 1;
            }
            if (n2 != 0) {
                list2.add(assetPackState.c());
            }
        }
        super.a.b((Object)list2);
    }
}
