// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.vault.feature.settings.adapter.data.section;

import hj2.a0;
import u92.f;
import java.util.Arrays;
import u92.h$e;
import u92.h$b;
import u92.h$c;
import u92.h$a;
import kotlin.NoWhenBranchMatchedException;
import u92.j;
import java.util.List;
import lg2.c;
import javax.inject.Inject;
import com.reddit.vault.h;
import ab2.g;
import y82.d;
import com.reddit.vault.util.BiometricsHandler;
import fb2.m;
import y82.a;
import be1.e;
import v92.b;

public final class VaultSection implements b
{
    public final e a;
    public final t92.b b;
    public final a c;
    public final m d;
    public final va2.b e;
    public final BiometricsHandler f;
    public final d g;
    public final h92.a h;
    public final g i;
    public final h j;
    
    @Inject
    public VaultSection(final e a, final t92.b b, final a c, final m d, final va2.b e, final BiometricsHandler f, final d g, final h92.a h, final g i, final h j) {
        sg2.e.f((Object)a, "getContext");
        sg2.e.f((Object)b, "view");
        sg2.e.f((Object)c, "accountRepository");
        sg2.e.f((Object)d, "resourceProvider");
        sg2.e.f((Object)e, "secureDeviceUtil");
        sg2.e.f((Object)f, "biometricsHandler");
        sg2.e.f((Object)g, "credentialRepository");
        sg2.e.f((Object)h, "recoveryPhraseListener");
        sg2.e.f((Object)i, "navigator");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
    }
    
    public final Object a(final c<? super List<? extends j>> c) {
        final int n = VaultSection.VaultSection$a.a[((Enum)this.c.q()).ordinal()];
        Object o;
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                o = h$a.a;
            }
            else {
                o = h$c.a;
            }
        }
        else {
            o = h$b.a;
        }
        final String c2 = this.d.c(2131958094);
        final x82.a a = (x82.a)((a0)this.g.getAddress()).getValue();
        String c3;
        if (a == null || (c3 = a.c()) == null) {
            c3 = "";
        }
        final StringBuilder r = a.r("u/");
        r.append(this.c.b().g);
        final String string = r.toString();
        final u92.g g = new u92.g(new Integer(2131232473), c2, (u92.h)new h$e(c3), (rg2.a)new VaultSection$getItems$backupCardItems.VaultSection$getItems$backupCardItems$1(this, c2, c3));
        final u92.g g2 = new u92.g(new Integer(2131232469), this.d.c(2131958100), (u92.h)new h$e(string), (rg2.a)VaultSection$getItems$backupCardItems.VaultSection$getItems$backupCardItems$2.INSTANCE);
        final Integer n2 = new Integer(2131232086);
        final String c4 = this.d.c(2131955025);
        Object o2;
        if (this.c.e()) {
            o2 = h$a.a;
        }
        else {
            o2 = h$c.a;
        }
        final Object[] array = lw0.b.z1((Object[])new u92.g[] { g, g2, new u92.g(n2, c4, (u92.h)o2, (rg2.a)new VaultSection$getItems$backupCardItems.VaultSection$getItems$backupCardItems$3((Object)this)), new u92.g(new Integer(2131231999), this.d.c(2131955030), (u92.h)o, (rg2.a)new VaultSection$getItems$backupCardItems.VaultSection$getItems$backupCardItems$4(this)) }).toArray(new u92.g[0]);
        sg2.e.d((Object)array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        final u92.g[] array2 = (u92.g[])array;
        return lw0.b.s1((Object[])new j[] { (j)new u92.d(this.d.c(2131955253)), (j)new f((u92.g[])Arrays.copyOf(array2, array2.length)) });
    }
}
